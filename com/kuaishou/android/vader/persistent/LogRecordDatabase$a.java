package com.kuaishou.android.vader.persistent.LogRecordDatabase$a;
import w2.c;
import a3.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class LogRecordDatabase$a extends c	// class@000719
{

    public void LogRecordDatabase$a(int p0,int p1){
       super(p0, p1);
    }
    public void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LogRecordDatabase$a.class, "1")) {
          return;
       }
       p0.execSQL("ALTER TABLE LogRecord ADD COLUMN \'compressAlgorithm\' INTEGER NOT NULL DEFAULT 0;");
       return;
    }
}
