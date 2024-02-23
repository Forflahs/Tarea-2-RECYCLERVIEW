package com.mario.recyclerviewtarea2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    private var listAdapter: MutableList<dtProductos> = mutableListOf()
    private lateinit var  recycler: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listAdapter.add(dtProductos("id del producto:1","leche:producto lactio", "Precio por menudeo:13", "Precio por mayoreo:11","https://firebasestorage.googleapis.com/v0/b/regristrodeproducto.appspot.com/o/Leche-esta-es-la-mas-saludable-que-puedes-consumir.jpg?alt=media&token=bc925a29-387a-4457-8efc-2914c54a61ed"));
        listAdapter.add(dtProductos("id del producto:2", "pan:producto de harina", "Precio por menudeo:8", "Precio por mayoreo:7","https://firebasestorage.googleapis.com/v0/b/regristrodeproducto.appspot.com/o/pan.jpg?alt=media&token=f5591fbe-1581-4bcd-b706-b98fad0f4529"));
        listAdapter.add(dtProductos("id del producto:3", "manzanas:frutas frescas", "Precio por menudeo:15", "Precio por mayoreo:14","https://firebasestorage.googleapis.com/v0/b/regristrodeproducto.appspot.com/o/manzana.jpg?alt=media&token=bfe7a42c-5f66-4c34-aa88-8c2a05de5757"));
        listAdapter.add(dtProductos("id del producto:4", "pasta:producto de harina", "Precio por menudeo:10", "Precio por mayoreo:9","https://firebasestorage.googleapis.com/v0/b/regristrodeproducto.appspot.com/o/pasta.jpg?alt=media&token=3ab5c916-08db-4a72-87a4-a870516a08a2"));
        listAdapter.add(dtProductos("id del producto:5", "huevos:producto avícola", "Precio por menudeo:12", "Precio por mayoreo:11","https://firebasestorage.googleapis.com/v0/b/regristrodeproducto.appspot.com/o/huevos.jpg?alt=media&token=c3f8fe6e-eb7c-4c48-bece-8dabeae66fc4"));
        listAdapter.add(dtProductos("id del producto:6", "agua mineral:bebida", "Precio por menudeo:5", "Precio por mayoreo:4","https://firebasestorage.googleapis.com/v0/b/regristrodeproducto.appspot.com/o/agua.jpg?alt=media&token=20765286-6798-44f1-a08c-7631564b5713"));
        listAdapter.add(dtProductos("id del producto:7", "yogur:producto lácteo", "Precio por menudeo:10", "Precio por mayoreo:9","https://firebasestorage.googleapis.com/v0/b/regristrodeproducto.appspot.com/o/yogur.jpg?alt=media&token=24441c5e-d20f-4be0-abc8-635b24d1c093"));
        listAdapter.add(dtProductos("id del producto:8", "pollo:carne avícola", "Precio por menudeo:18", "Precio por mayoreo:16","https://firebasestorage.googleapis.com/v0/b/regristrodeproducto.appspot.com/o/pollo.jpg?alt=media&token=b4f76fa0-77a3-4e96-a13f-5348d5cfd8f8"));
        listAdapter.add(dtProductos("id del producto:9", "queso:producto lácteo", "Precio por menudeo:15", "Precio por mayoreo:12","https://firebasestorage.googleapis.com/v0/b/regristrodeproducto.appspot.com/o/queso.jpg?alt=media&token=d92b0db2-e454-4737-91d7-dfdb6a663df2"));
        listAdapter.add(dtProductos("id del producto:10", "arroz:producto de grano", "Precio por menudeo:14", "Precio por mayoreo:13","https://firebasestorage.googleapis.com/v0/b/regristrodeproducto.appspot.com/o/arroz.jpg?alt=media&token=c7b24fc0-7934-4f61-8486-ce236381d510"));
        listAdapter.add(dtProductos("id del producto:11", "tomates:vegetales frescos", "Precio por menudeo:9", "Precio por mayoreo:8","https://firebasestorage.googleapis.com/v0/b/regristrodeproducto.appspot.com/o/tomates.jpg?alt=media&token=020c070a-1a86-4579-ab22-36ebaf7a31c4"));
        listAdapter.add(dtProductos("id del producto:12", "café:bebida caliente", "Precio por menudeo:11", "Precio por mayoreo:10","https://firebasestorage.googleapis.com/v0/b/regristrodeproducto.appspot.com/o/caf%C3%A9.png?alt=media&token=613e9e83-846a-4a30-a6a8-9eb07e64cc25"));
        listAdapter.add(dtProductos("id del producto:13", "zanahorias:vegetales frescos", "Precio por menudeo:7", "Precio por mayoreo:6","https://firebasestorage.googleapis.com/v0/b/regristrodeproducto.appspot.com/o/zanahorias.jpg?alt=media&token=18fa1279-4326-419c-b63d-78e9526ea6bf"));
        listAdapter.add(dtProductos("id del producto:14", "galletas:producto horneado", "Precio por menudeo:6", "Precio por mayoreo:5","https://firebasestorage.googleapis.com/v0/b/regristrodeproducto.appspot.com/o/galletas.jpg?alt=media&token=2507e08c-81d7-4d89-b27f-e6a282d7c0fe"));
        listAdapter.add(dtProductos("id del producto:15", "mermelada:producto de frutas", "Precio por menudeo:8", "Precio por mayoreo:7","https://firebasestorage.googleapis.com/v0/b/regristrodeproducto.appspot.com/o/mermelada.jpg?alt=media&token=b6bdb72a-3228-409f-a09b-9bd03ad1f34b"));
        listAdapter.add(dtProductos("id del producto:16", "atún enlatado:producto enlatado", "Precio por menudeo:12", "Precio por mayoreo:11","https://firebasestorage.googleapis.com/v0/b/regristrodeproducto.appspot.com/o/at%C3%BAn.jpg?alt=media&token=f90654e4-fea8-4bc6-bda0-66f82797f857"));
        listAdapter.add(dtProductos("id del producto:17", "lechuga:vegetales frescos", "Precio por menudeo:5", "Precio por mayoreo:4","https://firebasestorage.googleapis.com/v0/b/regristrodeproducto.appspot.com/o/lechuga.jpg?alt=media&token=2d3cb0f6-2319-46e7-9ab8-f769cd0de1ca"));
        listAdapter.add(dtProductos("id del producto:18", "sopa enlatada:producto enlatado", "Precio por menudeo:7", "Precio por mayoreo:6","https://firebasestorage.googleapis.com/v0/b/regristrodeproducto.appspot.com/o/sopa.jpg?alt=media&token=271222ea-6910-4b6e-9fd0-adc7362b3fe7"));
        listAdapter.add(dtProductos("id del producto:19", "coca cottage:producto efervecente", "Precio por menudeo:10", "Precio por mayoreo:9","https://firebasestorage.googleapis.com/v0/b/regristrodeproducto.appspot.com/o/coca.png?alt=media&token=cfe17855-dd23-4f55-87d9-ee063842f9cc"));
        listAdapter.add(dtProductos("id del producto:20", "pepinos:vegetales frescos", "Precio por menudeo:7", "Precio por mayoreo:6","https://firebasestorage.googleapis.com/v0/b/regristrodeproducto.appspot.com/o/pipinos.jpg?alt=media&token=689ab8a1-d3ab-4cf7-8a97-020f3e5debc2"));

        var tabla =findViewById<RecyclerView>(R.id.TablaProductos)
        recycler=tabla
        recycler.layoutManager=LinearLayoutManager(this)
        recycler.adapter=ProductosAdapter(this,listAdapter)
    }
}