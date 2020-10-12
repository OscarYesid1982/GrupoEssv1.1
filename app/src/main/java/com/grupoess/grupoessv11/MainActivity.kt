package com.grupoess.grupoessv11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast
import com.grupoess.grupoessv10.adapters.LanguageAdapters
import com.grupoess.grupoessv10.model.LanguageItem

class MainActivity : AppCompatActivity(), AdapterView.OnItemClickListener {


    private var arrayList:ArrayList<LanguageItem> ? = null
    private var gridView: GridView? = null
    private var languageAdapters: LanguageAdapters? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridView = findViewById(R.id.grid_view_cater)
        arrayList = ArrayList()
        arrayList = setDataList()
        languageAdapters = LanguageAdapters(applicationContext, arrayList!!)
        gridView?.adapter = languageAdapters
        gridView?.onItemClickListener = this
    }

    private fun setDataList() : ArrayList<LanguageItem>{

        var arrayList:ArrayList<LanguageItem> = ArrayList()

        arrayList.add(LanguageItem(R.drawable.calandra, "Calandras"))
        arrayList.add(LanguageItem(R.drawable.equipos, "Equipos"))
        arrayList.add(LanguageItem(R.drawable.insumos, "Insumos"))
        arrayList.add(LanguageItem(R.drawable.papel_sublima, "Papel Sublimación"))
        arrayList.add(LanguageItem(R.drawable.repuestos, "Repuestos"))
        arrayList.add(LanguageItem(R.drawable.servicios_tecnicos, "Servicios Tecnicos"))
        arrayList.add(LanguageItem(R.drawable.tintas_titan, "Tintas Titanium"))
        arrayList.add(LanguageItem(R.drawable.vinilo, "Vinilos"))


        return arrayList

    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

        var items: LanguageItem = arrayList!!.get(position)
        Toast.makeText(applicationContext, items.name, Toast.LENGTH_LONG).show()
    }
}