package com.UAS.petshop;

import java.util.ArrayList;

public class DataPetshop {
    public static String[][] data = new String[][]{
            {"Evo Petshop", "Toko perlengkapan hewan peliharaan di Palembang, Sumatera Selatan Alamat: Jl. Lingkaran1 No.565, 15 Ilir, Kec. Ilir Tim. I, Kota Palembang, Sumatera Selatan 30125 Telepon: 0812-1660-0400\n" +
                    "Provinsi: Sumatera Selatan", "https://lh3.googleusercontent.com/p/AF1QipNddH6fAzQsheRxQkp8UdrioL29JQ7rm5V8x3IL=s680-w680-h510", "Jl. Lingkaran1 No.565, 15 Ilir, Kec. Ilir Tim. I, Kota Palembang", "-2.97991107,104.7647393"},
            {"Gupo Petshop", "Toko perlengkapan hewan peliharaan di Palembang, Sumatera Selatan Alamat: Jl. Kol. H. Burlian No.202, Srijaya, Kec. Alang-Alang Lebar, Kota Palembang, Sumatera Selatan 30151 Telepon: 0822-5387-6969 Provinsi: Sumatera Selatan", "https://lh3.googleusercontent.com/p/AF1QipPO0WTQWqGjFWslWDogCpH14DMO5dFPAPXiJMxT=s680-w680-h510", "Jl. Kol. H. Burlian No.202, Srijaya, Kec. Alang-Alang Lebar, Kota Palembang", "-2.9521105,104.7339384"},
            {"Lucky Paw Petshop", "Toko hewan peliharaan di Palembang, Sumatera Selatan Alamat: komplek Ruko Ilir Barat Permai blok D3 no 1, 24 Ilir, Bukit Kecil, Palembang City, South Sumatra 30114 Telepon:  (0711) 315079 Provinsi : Sumatera Selatan", "https://lh3.googleusercontent.com/p/AF1QipOlCja7ygAMAhc0vklj48IbIROkyxhMH3ZRbaVb=s680-w680-h510", "komplek Ruko Ilir Barat Permai blok D3 no 1, 24 Ilir, Bukit Kecil, Palembang City, South Sumatra", "-2.98405786,104.75268044"},
            {"Planet Petshop", "planet petshop Toko hewan peliharaan di Palembang, Sumatera Selatan Alamat : Jl. Brigjen Hasan Kasim No.30G, Bukit Sangkal, Kec. Kalidoni, Kota Palembang, Sumatera Selatan 30961 Nomor Telepon : 0812-7153-8897", "https://lh3.googleusercontent.com/p/AF1QipNt5XV623xuepUqwttbf_-uhOQiDQ23CoCPH3Bw=s680-w680-h510", "Jl. Brigjen Hasan Kasim No.30G, Bukit Sangkal, Kec. Kalidoni, Kota Palembang, Sumatera Selatan", "-2.9397823,104.7831617"},
            {"Hippo Petshop", "Toko perlengkapan hewan peliharaan di Palembang Alamat: Jl. Kol. H. Burlian No.283 A, RT.070/RW.013, Karya Baru, Kec. Alang-Alang Lebar, Kota Palembang, Sumatera Selatan 30152\n" +
                    "Telepon: 0812-8000-3999", "https://lh3.googleusercontent.com/p/AF1QipMwouNo1ad9gBlFcqegJwKA6aTbSWitWgvFEoi3=s680-w680-h510", "Jl. Kol. H. Burlian No.283 A, RT.070/RW.013, Karya Baru, Kec. Alang-Alang Lebar, Kota Palembang, Sumatera Selatan", "-2.93575372,104.71870989"},
            {"Keka Petshop", "Toko perlengkapan hewan peliharaan di Palembang Alamat : Jl. Mayor Zurbi Bustan No.4149a, RT.19/RW.004, Sukajaya, Kec. Sukarami, Kota Palembang, Sumatera Selatan 30961\n" +
                    "Nomor Telepon : 0812-7290-8507 Provinsi : Sumatera Selatan", "https://lh5.googleusercontent.com/p/AF1QipOFyXTT_ghsaml6rYhXI2heERDXhz6XDgX0och3=w493-h240-k-no", "Jl. Mayor Zurbi Bustan No.4149a, RT.19/RW.004, Sukajaya, Kec. Sukarami, Kota Palembang, Sumatera Selatan", "-2.9363204,104.7468146"},
            {"Yosella Petshop", "Toko perlengkapan hewan peliharaan di Palembang Alamat : Jalan Mayor Haji Muhammad Rasyad Nawawi No.240\n" +
                    "15 Ilir Timur I Kota Palembang Sumatera Selatan 30124 Telepon : \n" +
                    "(0711) 5734012", "https://lh3.googleusercontent.com/p/AF1QipNWo7UD9CdSnV9WvfngCgNUyuoFmMxH-FLCDxVH=w960-h960-n-o-v1", "Jalan Mayor Haji Muhammad Rasyad Nawawi No.240", "-2.9493518,104.7618189"},
            {"Nala Petshop", "Toko perlengkapan hewan peliharaan di palembang Alamat : Jl. Lrg. Batu Itam No.93, 26 Ilir, Kec. Bukit Kecil, Kota Palembang, Sumatera Selatan 30121, Indonesia Telepon : 0821-7878-7574", "https://1.bp.blogspot.com/-LlDVmCkWf-w/X5BxdG1EhvI/AAAAAAAADIE/9eZe5QgKwvcYU-lri7DoOXSnFgKnF2h9QCLcBGAsYHQ/s320/Alamat%2B3D%2BPetshop%2BPalembang%2BSumsel.jpg", "Jl. Lrg. Batu Itam No.93, 26 Ilir, Kec. Bukit Kecil, Kota Palembang, Sumatera Selatan", "-2.9865265,104.7454913"},
            {"Sobat Bulu Petshop", "Toko perlengkapan hewan peliharaan di Palembang Alamat : Blok BA 9 KOMPLEK OPI, Jl. Opi II, Sungai Kedukan, Rambutan, Banyuasin Regency, South Sumatra 30967\n" +
                    "Telepon: 0812-9291-6995", "https://lh5.googleusercontent.com/p/AF1QipMcKtDNqoe-m-gnvUImmbRNSBn5-EdX7jgfmsUL=w408-h306-k-no","Blok BA 9 KOMPLEK OPI, Jl. Opi II, Sungai Kedukan, Rambutan, Banyuasin Regency, South Sumatra", "-3.0455822,104.7846707"},
            {"Istana Petshop", "Toko perlengkapan hewan peliharaan di Palembang Alamat :  Jl. Sialang, Kec. Sako, Kota Palembang, Sumatera Selatan 30961, Indonesia  Nomor Telepon\t: 0823-7972-7777", "https://bio.linkcdn.to/upload/2022121415/167103119622652641.jpeg", "Jl. Sialang, Kec. Sako, Kota Palembang, Sumatera Selatan", "-2.9354169,104.7854317"}
    };

    public static ArrayList<ModelPetshop> ambilDataPetshop(){
        ArrayList<ModelPetshop> dataPetshop = new ArrayList<>();

        for(String[] varData: data){
            ModelPetshop mdl = new ModelPetshop();
            mdl.setNama(varData[0]);
            mdl.setTentang(varData[1]);
            mdl.setFoto(varData[2]);
            mdl.setAlamat(varData[3]);
            mdl.setKoordinat(varData[4]);

            dataPetshop.add(mdl);
        }
        return dataPetshop;
    }
}
