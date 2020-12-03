package mx.udg.cuvalles.mynotesapp

import android.app.Application
import androidx.room.Room

class NotaApp:Application() {


      lateinit var baseDeDatos:NotasDb


        override fun onCreate() {
        super.onCreate()
        baseDeDatos = Room
            .databaseBuilder(this,NotasDb::class.java,"notas_db")
            .build()
    }

}

