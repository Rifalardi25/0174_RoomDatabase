package com.example.prak10_pam.repositori

import android.content.Context
import com.example.prak10_pam.room.DatabaseSiswa
import kotlin.getValue

interface ContainerApp {
    val repositoriSiswa : RepositoriSiswa
}

class ContainerDataApp(private val context: Context): ContainerApp{
    override val repositoriSiswa: RepositoriSiswa by lazy {
        OfflineRepositoriSiswa(DatabaseSiswa.getDatabase(context).siswaDao())
    }
}