package com.kwai.yoda.store.db.YodaDatabase;
import androidx.room.RoomDatabase;
import com.kwai.yoda.store.db.YodaDatabase$a;
import nsd.u;
import iy7.b;
import zy7.b;
import zy7.e;
import wz7.b;
import wz7.e;
import iy7.d;

public abstract class YodaDatabase extends RoomDatabase	// class@0012ec
{
    public static final int n = 12;
    public static final YodaDatabase$a o;

    static {
       YodaDatabase.o = new YodaDatabase$a(null);
    }
    public void YodaDatabase(){
       super();
    }
    public abstract b E();
    public abstract b F();
    public abstract e G();
    public abstract b H();
    public abstract e I();
    public abstract d J();
}
