package com.yxcorp.gifshow.v3.editor.text.n0$f;
import xuc.b;
import com.yxcorp.gifshow.v3.editor.text.n0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import aw9.z;
import java.util.List;

public class n0$f implements b	// class@001479
{
    public final n0 a;

    public void n0$f(n0 p0){
       this.a = p0;
       super();
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, n0$f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.v.c();
    }
    public List d(){
       Object obj = PatchProxy.apply(null, this, n0$f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.v.d();
    }
}
