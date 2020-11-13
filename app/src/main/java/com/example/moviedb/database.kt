package com.example.moviedb

import android.net.Uri
import com.squareup.picasso.Picasso

class Movie(val title: String, val description: String, val image: String) {
    fun getImage() {
        Picasso.get().load(Uri.parse(image))
    }
}

val movieList = listOf(
    Movie("Star Wars", "Filme que acontece nas galáxias","https://www.google.com/url?sa=i&url=https%3A%2F%2Fdisney.pt%2Ffilmes%2Fstar-wars-a-ascensao-de-skywalker&psig=AOvVaw2cM4X8EmJK_Nct21Ct9-ZE&ust=1603237180275000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCNjUl4jqwewCFQAAAAAdAAAAABAD"),
    Movie("Eu Robô", "O cara é um robô", "https://www.google.com/imgres?imgurl=https%3A%2F%2Fa-static.mlcdn.com.br%2F414x310%2Fdvd-eu-robo-fox-home-entertainment-7890552002835%2Flojatopofertas%2F515313965%2F09370b67fcf6cacf2e9063ce3f377609.jpg&imgrefurl=https%3A%2F%2Fwww.magazineluiza.com.br%2Fdvd-eu-robo-fox-home-entertainment-7890552002835%2Fp%2Fdg135jhchf%2Frc%2Frcnm%2F&tbnid=Fv8NsqYUDFuwAM&vet=12ahUKEwj2x6Sc0MXsAhXgBbkGHcoqASEQMygBegUIARCUAQ..i&docid=fPF02JfNirsUXM&w=310&h=310&q=eu%20rob%C3%B4&ved=2ahUKEwj2x6Sc0MXsAhXgBbkGHcoqASEQMygBegUIARCUAQ"),
    Movie("Eu a Patroa e as Crianças", "Comédia em família", "https://www.google.com/imgres?imgurl=https%3A%2F%2Ftorrentdublado.com%2Fcapas%2Feu-a-patroa-e-as-criancas-2-temporada-download-torrent-2001-dublado-dual-audio-bluray-1080p-720p-4k-hd.jpg&imgrefurl=https%3A%2F%2Ftorrentdublado.com%2Fserie%2Feu-a-patroa-e-as-criancas-2-temporada-torrent%2F&tbnid=TYWVc9WcKowm5M&vet=12ahUKEwiP1cK90MXsAhXXMbkGHZW7AiwQMygAegUIARCeAQ..i&docid=nx_UmZPdwZ4YxM&w=290&h=430&q=eu%20a%20patroa%20e%20as%20criancas%20temporada%202%20completo&ved=2ahUKEwiP1cK90MXsAhXXMbkGHZW7AiwQMygAegUIARCeAQ"),
    Movie("GOT", "Era Medieval e Glacial", "https://www.google.com/imgres?imgurl=http%3A%2F%2Fbr.web.img3.acsta.net%2Fpictures%2F19%2F03%2F21%2F16%2F15%2F4239577.jpg&imgrefurl=http%3A%2F%2Fwww.adorocinema.com%2Fseries%2Fserie-7157%2F&tbnid=ryvv-7xl_AsBvM&vet=12ahUKEwiynIDN0MXsAhUODrkGHXscCmwQMygKegUIARDiAQ..i&docid=xdogb851lGS-pM&w=1292&h=1915&q=GOT&ved=2ahUKEwiynIDN0MXsAhUODrkGHXscCmwQMygKegUIARDiAQ")
)


