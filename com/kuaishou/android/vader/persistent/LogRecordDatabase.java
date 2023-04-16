package com.kuaishou.android.vader.persistent.LogRecordDatabase;
import androidx.room.RoomDatabase;
import com.kuaishou.android.vader.persistent.LogRecordDatabase$a;
import br.b;

public abstract class LogRecordDatabase extends RoomDatabase	// class@00071a
{
    public static final c n;

    static {
       LogRecordDatabase.n = new LogRecordDatabase$a(1, 2);
    }
    public void LogRecordDatabase(){
       super();
    }
    public abstract b E();
}
