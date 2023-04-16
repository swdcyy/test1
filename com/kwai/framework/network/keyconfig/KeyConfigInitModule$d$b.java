package com.kwai.framework.network.keyconfig.KeyConfigInitModule$d$b;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ta6.c;
import q87.c;

public final class KeyConfigInitModule$d$b implements g	// class@0017db
{
    public static final KeyConfigInitModule$d$b b;

    static {
       KeyConfigInitModule$d$b.b = new KeyConfigInitModule$d$b();
    }
    public void KeyConfigInitModule$d$b(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KeyConfigInitModule$d$b.class, "1")) {
       }else {
          c.C().v("KeyConfigInitModule", "onLoginFinished triggered keyconfig failed.", p0);
       }
       return;
    }
}
