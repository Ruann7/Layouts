package br.com.jogosdeazar.layouts


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)

        val jogos = listOf(
            Jogo("God of War", "R$ 149,90"),
            Jogo("Red Dead Redemption 2", "R$ 229,90"),
            Jogo("Minecraft", "R$ 99,90")
        )

        val recycler = findViewById<RecyclerView>(R.id.recyclerJogos)
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = JogoAdapter(jogos)
    }
}
