package com.kwai.framework.network.keyconfig.KeyConfigInitModule$c;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Process;
import wkd.b;
import ob6.p;
import ob6.h;
import ta6.c;
import java.lang.StringBuilder;
import com.kwai.framework.network.keyconfig.BaseConfig;
import java.lang.Long;
import q87.c;

public final class KeyConfigInitModule$c implements Runnable	// class@0017d9
{
    public static final KeyConfigInitModule$c b;

    static {
       KeyConfigInitModule$c.b = new KeyConfigInitModule$c();
    }
    public void KeyConfigInitModule$c(){
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KeyConfigInitModule$c.class, "1")) {
          return;
       }
       int i = 0;
       Process.setThreadPriority(i);
       h oh = b.a(0x36463d96).g();
       c uoc = c.C();
       StringBuilder str = "serverTs: ";
       if (oh != null) {
          oh = oh.mBaseConfig;
          if (oh != null) {
             objArray = Long.valueOf(oh.g());
          }
       }
       Object[] objArray1 = new Object[i];
       uoc.t("KeyConfigInitModule", str+objArray, objArray1);
       Process.setThreadPriority(10);
       return;
    }
}
