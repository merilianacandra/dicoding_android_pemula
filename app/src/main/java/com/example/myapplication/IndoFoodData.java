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
