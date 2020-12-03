package mx.udg.cuvalles.mynotesapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import mx.udg.cuvalles.mynotesapp.Nota
import mx.udg.cuvalles.mynotesapp.R

class NotasAdapter(notas:List<Nota>, ctx:Context):RecyclerView.Adapter<NotasAdapter.ViewHolder>() {
    var notas:List<Nota>?=null
    var ctx:Context?=null

    init {
        this.notas = notas
        this.ctx = ctx
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val vistaNota:View = LayoutInflater
            .from(ctx)
            .inflate(R.layout.nota,parent,false)
        val notaVH = ViewHolder(vistaNota)

        vistaNota.tag = notaVH
        return notaVH
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val nota = notas!!.get(position)
        holder.tvTitulo!!.text = nota.titulo
        holder.tvContenido!!.text = nota.contenido
    }

    override fun getItemCount(): Int {
        return notas!!.size
    }

    class ViewHolder(vista: View):RecyclerView.ViewHolder(vista){
        var tvTitulo:TextView?=null
        var tvContenido:TextView?=null

        init {
            tvTitulo = vista.findViewById(R.id.tvTitulo)
            tvContenido = vista.findViewById(R.id.tvContenido)
        }
    }
}