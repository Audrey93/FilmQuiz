package com.example.aminapc.filmquiz;


public class Pitanja {
    private String mPitanja [] = {
            "Koji film je ove godine dobio najviše Oskara?",
            "U kojem filmu glumi Marija Rodriges Velvedere ili Babi nježnu, lijepu i neiskvarenu djevojku, odličnu učenicu iz veoma bogate porodice?",
            "Na koju pjesmu Mia Wallace i Vincent Vega plešu u sceni plesnog natjecanja u filmu Pakleni šund?",
            "Tko je napisao legendarnu knjigu Kum, na osnovu koje je snimljen istoimeni film?",
            "Za koji je film Leonardo DiCaprio dobio oskara za glavnu mušku ulogu?",
            "Koliko je oskara osvojio film Lovac na jelene davne 1979. godine?",
            "Koji je film odnio Oskara  1995. godine i pobijedio film Iskupljenje u Shawshanku u kategoriji najboljeg filma?"


    };
    private String mOdogovori [] [] = {
            {"Terminator", "The Hangover", "La la land", "Notebook"},
            {"3 metra iznad neba","Titanic","The Godfather","Die Hard"},
            {"I Will Love You","You Never Can Tell","Jailhouse Rock","I Do It For You"},
            {"Barry Jenkins","Eric Roth","Stephen King","Mario Puzo"},
            {"Veliki Gatsby", "Povratnik", "Vuk s Wall Streeta", "Početak"},
            {"5", "3 ", "4", "1"},
            {"Avatar", "Pocetak", "Forrest Gump", "Annie Hall"}


    };

    public Integer[] Slike = {
            R.drawable.lalaland,
            R.drawable.trimetraiznadneba,
            R.drawable.pulpfiction,
            R.drawable.kum,
            R.drawable.povratnik1,
            R.drawable.lovacnajelene,
            R.drawable.iskupljenje

    };


    private String mTacniOdgovori [] = {"La la land", "3 metra iznad neba", "You Never Can Tell", "Mario Puzo","Povratnik","5", "Forrest Gump"};

    public int vratiDuzinu(){ return mPitanja.length; }

    public Integer vratiSliku (int a){
        Integer slika=Slike[a];
        return slika;
    }

    public String vratiPitanje (int a){
        String pitanje=mPitanja[a];
        return pitanje;
    }

    public String vratiOdgovor1 (int a ) {
        String odgovor0=mOdogovori[a][0];
        return odgovor0;
    }

    public String vratiOdgovor2 (int a ) {
        String odgovor1=mOdogovori[a][1];
        return odgovor1;
    }
    public String vratiOdgovor3 (int a ) {
        String odgovor2=mOdogovori[a][2];
        return odgovor2;
    }
    public String vratiOdgovor4 (int a ) {
        String odgovor3=mOdogovori[a][3];
        return odgovor3;
    }
    public String vratiTacanOdgovor (int a){
        String odgovor=mTacniOdgovori[a];
        return odgovor;
    }
}
