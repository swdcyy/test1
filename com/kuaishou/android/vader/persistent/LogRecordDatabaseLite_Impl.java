package com.kuaishou.android.vader.persistent.LogRecordDatabaseLite_Impl;
import com.kuaishou.android.vader.persistent.LogRecordDatabase_Impl;
import androidx.room.w;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import br.a;
import androidx.room.RoomDatabase;

public class LogRecordDatabaseLite_Impl extends LogRecordDatabase_Impl	// class@00071c
{

    public void LogRecordDatabaseLite_Impl(){
       super();
    }
    public w i(){
       Object obj = PatchProxy.apply(null, this, LogRecordDatabaseLite_Impl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String[] stringArray = new String[]{""};
       return new a(this, stringArray);
    }
}
