package com.example.myapplication;

import java.util.ArrayList;

public class IndoFoodData {
    private static String[] foodNames = {
            "Rendang",
            "Ayam Betutu",
            "Babi Panggang Karo",
            "Kerak Telor",
            "Ketoprak",
            "Rujak Cingur",
            "Sambal Matah",
            "Sate Padang",
            "Babi Guling",
            "Siobak",
            "Tempe Mendoan"
    };

    private static String[] foodDetails = {
            "Rendang atau randang adalah masakan daging dengan bumbu rempah-rempah yang berasal dari " +
                    "Minangkabau. Masakan ini dihasilkan dari proses memasak yang dipanaskan " +
                    "berulang-ulang menggunakan santan sampai kuahnya kering sama sekali.  " +
                    "Meskipun rendang merupakan masakan tradisional Minangkabau, teknik memasak " +
                    "serta pilihan dan penggunaan bumbu rendang berbeda-berda menurut daerah. " +
                    "Pada 2011, rendang dinobatkan sebagai hidangan yang menduduki peringkat pertama " +
                    "daftar World's 50 Most Delicious Foods (50 Hidangan Terlezat Dunia) versi CNN " +
                    "International. Pada 2018, rendang secara resmi ditetapkan sebagai salah satu " +
                    "dari lima hidangan nasional Indonesia.",

            "Betutu adalah lauk yang terbuat dari ayam atau bebek yang utuh yang berisi bumbu, kemudian" +
                    " dipanggang dalam api sekam. Betutu ini telah dikenal di seluruh kabupaten di " +
                    "Bali. Salah satu produsen betutu adalah desa Melinggih, kecamatam payangan " +
                    "kabupaten Gianyar. Ayam betutu juga merupakan makanan khas Gilimanuk. Betutu " +
                    "digunakan sebagai sajian pada upacara keagamaan dan upacara adat serta sebagai " +
                    "hidangan dan di jual. Konsumennya tidak hanya masyarakat Bali tetapi juga tamu " +
                    "manca negara yang datang ke Bali, khususnya pada tempat-tempat tertentu seperti " +
                    "di hotel dan rumah makan atau restoran. Betutu tidak tahan disimpan lama.Be-Tutu " +
                    "merupakan jenis makanan tradisional daerah Bali yang bahan mentahnya berupa " +
                    "karkas utuh itik dan ayam. Kata betutu berasal dari kata tunu yang berarti " +
                    "bakar dan dirangkai dengan kata be yang berarti daging. Berdasarkan uraian " +
                    "tersebut betutu berarti daging yang dibakar. ",

            "Babi Panggang Karo atau yang lebih populer dikenal dengan istilah BPK adalah makanan " +
                    "yang terbuat dari daging babi yang dipanggang atau dibakar. Makanan ini adalah " +
                    "masakan khas Suku Karo, sehingga banyak ditemukan di berbagai kota yang banyak" +
                    " ditinggali oleh orang Karo, seperti di Berastagi, Kabanjahe, Medan, dan bahkan " +
                    "di Pekanbaru, Jakarta, dan Bandung. Perbedaan antara Babi Panggang Karo dengan " +
                    "babi panggang lainnya adalah terdapat pada cara pemangangan yang dilakukan " +
                    "lebih unik dengan irisan lebih halus serta pemilihan bagian daging yang tepat. " +
                    "Saat dihidangkan Babi Panggang Karo juga akan ditambahkan dengan sajian daun " +
                    "singkong dan kincong yang telah dihaluskan dan dimasak secara khas.Selain itu " +
                    "disajikan pula saus yang terbuat dari darah babi, di mana keberadaan saus " +
                    "darah terlebih dahulu telah dimasak di atas bara api dengan ditambahkan sedikit " +
                    "air dan dibumbui dengan ramuan seperti asam dan lain-lain. Setelah matang warna " +
                    "saus darah akan berwarna kecokelatan. ",

            "Kerak telur adalah makanan asli daerah Jakarta (Betawi), dengan bahan-bahan beras ketan " +
                    "putih, telur ayam, ebi (udang kering yang diasinkan) yang disangrai kering " +
                    "ditambah bawang merah goreng, lalu diberi bumbu yang dihaluskan berupa kelapa " +
                    "sangrai, cabai merah, kencur, jahe, merica butiran, garam dan gula pasir.Kerak " +
                    "telor dapat ditemukan pada hari biasa. kalian bisa menemukan Kerak telor di " +
                    "sekitar Kota Tua,Jakarta.Menurut sejarah,Kerak Telor sudah ada dari zaman " +
                    "kolonial belanda , kerak telor diciptakan oleh masyarakat Betawi secara tak " +
                    "sengaja Pada tahun 1970an .Makanan ini dihidangkan saat pesta dan hajatan besar " +
                    "para pembesar pada masa itu. Semakin bergulirnya waktu, kehadiran kuliner-kuliner " +
                    "barat menggeser pesona kerak telor ini.",

            "Ketoprak adalah salah satu jenis makanan khas Indonesia menggunakan ketupat yang mudah " +
                    "dijumpai. Biasanya ketupat dijajakan menggunakan kereta dorong di jalan-jalan " +
                    "atau kaki lima Bahan-bahan utamanya adalah tahu, bihun, mentimun, taoge dan " +
                    "bisa juga memakai telur rebus yang dilengkapi dengan saus kacang, kecap " +
                    "manis, dan taburan bawang merah goreng. Dapat pula dihidangkan dengan tambahan " +
                    "kerupuk atau emping melinjo. Beberapa versi ada pula yang menyertakan tempe " +
                    "sebagai komponennya. Alat yang digunakan untuk mengolah ketoprak tidaklah sulit " +
                    "anda hanya butuh Ulekan dan pisau. ",

            "Rujak cingur adalah salah satu makanan tradisional yang mudah ditemukan di daerah Jawa " +
                    "Timur, terutama daerah asalnya Surabaya. Dalam bahasa Jawa kata cingur berarti " +
                    "mulut, hal ini merujuk pada bahan irisan mulut atau moncong sapi yang direbus " +
                    "dan dicampurkan ke dalam hidangan. Rujak cingur biasanya terdiri dari irisan " +
                    "beberapa jenis buah seperti timun, kerahi (krai, yaitu sejenis timun khas Jawa " +
                    "Timur), bengkuang, mangga muda, nanas, kedondong, kemudian ditambah lontong, " +
                    "tahu, tempe, bendoyo, cingur, serta sayuran seperti kecambah/taoge, kangkung, " +
                    "dan kacang panjang. Semua bahan tadi dicampur dengan saus atau bumbu yang " +
                    "terbuat dari olahan petis udang, air matang untuk sedikit mengencerkan, " +
                    "gula/gula merah, cabai, kacang tanah yang digoreng, bawang goreng, garam, dan " +
                    "irisan tipis pisang biji hijau yang masih muda (pisang klutuk). Semua saus/bumbu " +
                    "dicampur dengan cara diulek, itu sebabnya rujak cingur juga sering disebut " +
                    "rujak ulek. ",

            "Sambel matah adalah sambal tradisional Bali yang dapat ditemukan di seluruh daerah di " +
                    "Provinsi Bali. matah memiliki arti mentah. Sambel matah merupakan sambal yang " +
                    "berbahan mentah tanpa digerus (diulek). Bahan-bahan sambel matah yaitu: bawang " +
                    "merah, bawang putih, cabai merah, terasi, garam, sereh, jeruk lemo dan minyak " +
                    "kelapa.Nama sambel ini telah diubah demi diperkenalkan ke luar masyarakat Bali, " +
                    "nama asli sambal ini yakni sambel bawang namun karena menghindari persamaan " +
                    "dengan sambal bawang yang dikenal di luar Bali, maka sambel ini diberi nama " +
                    "sambel matah oleh pihak pariwisata. ",

            "Sate Padang adolah istilah untuak makanan khas Minangkabau nan tabuek dari dagiang nan " +
                    "dipotong ketek sarato diagiah kuah padeh di atehnyo. Ado baragam jinih Sate " +
                    "Padang, di antaranyo Sate Padang Panjang, Sate Padang Pariaman, Sate Biaro, " +
                    "jo Sate Danguang-Danguang Sate Padang mamakai bahan dagiang jawi, lidah, atau " +
                    "jerohan (jantuang, usus, jo tetelan) jo bumbu kuah kacang kental (mirip bubua) " +
                    "ditambah lado nan banyak sahinggo rasonyo padeh. ",

            "Babi guling (di Bali disebut be guling) adalah sejenis makanan yang terbuat dari anak " +
                    "babi betina atau jantan yang perutnya diisikan dengan bumbu dan sayuran seperti " +
                    "daun ketela pohon dan lalu dipanggang sambil diputar-putar (diguling-gulingkan) " +
                    "sampai matang dengan ditandai dengan perubahan warna kulit menjadi kecoklatan " +
                    "dan renyah. Awalnya babi guling pada mulanya digunakan untuk sajian pada upacara " +
                    "baik upacara adat maupun upacara keagamaan, tetapi saat ini babi guling telah " +
                    "dijual sebagai hidangan baik di warung-warung, rumah makan, bahkan hotel-hotel " +
                    "tertentu di daerah Bali dan lainnya. ",

            "Siobak adalah akulturasi delikasi Tionghoa dan Bali. Dibawa oleh para pedagang Tiongkok, " +
                    "siobak perlahan-lahan menjadi makanan standar Kabupaten Buleleng. Menariknya, " +
                    "hampir seluruh bagian tubuh babi sanggup diolah untuk dijadikan bahan baku siobak, " +
                    "mulai dari kulit, tulang, jeroan, dan tentu saja dagingnya. Sejatinya siobak " +
                    "mempunyai konsep sangat sederhana. Daging babi direbus dengan campuran kecap " +
                    "manis dan kecap asin, yang dikombinasikan rempahan ngohyang secukupnya. Konon " +
                    "adiksi ngohyang inilah yang membuat siobak di Singaraja terasa begitu spesial. " +
                    "Daging rebusan diiris tipis-tipis dan dilumuri saus, tak jarang ditambahkan " +
                    "pula kerupuk kulit babi dan masam acar mentimun. Sesudah itu, siobak siap " +
                    "dihidangkan bersama dengan sambal.",

            " Tempe Mendoan adalah makanan yang terbuat dari tempe yang dilapisi adonan tepung lalu " +
                    "di goreng. Makanan satu ini merupakan salah satu jajanan khas dari Banyumas, " +
                    "Jawa tengah. Tempe Mendoan ini sangat berbeda dengan Tempe Mendoan di daerah " +
                    "lainnya, sehingga memiliki keunikan dan cita rasa yang khas pada jajanan satu ini." +
                    "Nama Tempe Mendoan ini berasal dari kata “mendo”, yang dalam bahasa Banyumas di " +
                    "artikan “setengah matang” atau “lembek”. Sesuai dengan nama tersebut, Tempe " +
                    "Mendoan ini memiliki ciri khas dengan tekstur yang lembek karena di goreng " +
                    "setengah matang. Berbeda dengan Tempe Mendoan di daerah lain yang kebanyak " +
                    "digoreng kering. Selain itu keunikan dari Tempe Mendoan ini terlihat pada " +
                    "minyaknya yang masih membasahi Tempe Mendoan tersebut."
    };

    private static int[] foodImages = {
            R.drawable.rendang,
            R.drawable.betutu,
            R.drawable.bpk,
            R.drawable.keraktelor,
            R.drawable.ketoprak,
            R.drawable.rujakcingur,
            R.drawable.sambalmatah,
            R.drawable.satepadang,
            R.drawable.babiguling,
            R.drawable.siobak,
            R.drawable.tempemendoan
    };

    static ArrayList<IndoFood> getListData() {
        ArrayList<IndoFood> list = new ArrayList<>();
        for (int position = 0; position < foodNames.length; position++) {
            IndoFood indoFood = new IndoFood();
            indoFood.setName(foodNames[position]);
            indoFood.setDetail(foodDetails[position]);
            indoFood.setPhoto(foodImages[position]);
            list.add(indoFood);
        }
        return list;
    }
}
