package com.kwai.framework.network.keyconfig.KeyConfigInitModule$d$a;
import erd.g;
import java.lang.Object;
import ob6.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ta6.c;
import q87.c;

public final class KeyConfigInitModule$d$a implements g	// class@0017da
{
    public static final KeyConfigInitModule$d$a b;

    static {
       KeyConfigInitModule$d$a.b = new KeyConfigInitModule$d$a();
    }
    public void KeyConfigInitModule$d$a(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KeyConfigInitModule$d$a.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          c.C().w("KeyConfigInitModule", "onLoginFinished triggered keyconfig success.", objArray);
       }
       return;
    }
}
