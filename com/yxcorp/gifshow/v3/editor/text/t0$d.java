package com.yxcorp.gifshow.v3.editor.text.t0$d;
import xuc.b;
import com.yxcorp.gifshow.v3.editor.text.t0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import aw9.z;
import java.util.List;

public class t0$d implements b	// class@0014b3
{
    public final t0 a;

    public void t0$d(t0 p0){
       this.a = p0;
       super();
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, t0$d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.B.c();
    }
    public List d(){
       Object obj = PatchProxy.apply(null, this, t0$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.B.d();
    }
}
