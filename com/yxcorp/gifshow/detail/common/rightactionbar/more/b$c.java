package com.yxcorp.gifshow.detail.common.rightactionbar.more.b$c;
import uf5.c0$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import e17.i$b;
import e17.i;

public final class b$c implements c0$a	// class@0014b1
{
    public static final b$c a;

    static {
       b$c.a = new b$c();
    }
    public void b$c(){
       super();
    }
    public final void a(boolean p0){
       i$b uob;
       b$c uoc = b$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "1")) {
          return;
       }
       if (p0) {
          uob = i.m();
          uob.x(R.string.arg_RES_7f10044f);
          uob.l(true);
          i.z(uob);
       }else {
          uob = i.m();
          uob.x(R.string.arg_RES_7f104f83);
          uob.l(true);
          i.z(uob);
       }
       return;
    }
}
