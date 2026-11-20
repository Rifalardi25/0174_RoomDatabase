package com.example.prak10_pam.view.route

import com.example.prak10_pam.R

object DestinasiDetailSiswa : DestinasiNavigasi {
    override val route = "item_details"
    override val titleRes = R.string.detail_siswa
    const val itemIdArg = "itemId"
    val routeWithArgs = "$route/{$itemIdArg}"
}
