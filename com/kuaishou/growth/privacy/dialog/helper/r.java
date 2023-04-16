package com.kuaishou.growth.privacy.dialog.helper.r;
import erd.g;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.growth.privacy.dialog.helper.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import vf0.b;
import vf0.a;
import brd.t;
import io.reactivex.internal.functions.Functions;
import crd.b;

public final class r implements g	// class@000720
{
    public static final r b;

    static {
       r.b = new r();
    }
    public void r(){
       super();
    }
    public final void accept(Object p0){
       int i = 0;
       object oobject = p0[i];
       int i1 = 1;
       object oobject1 = p0[i1];
       int i2 = 2;
       object oobject2 = p0[i2];
       int i3 = 3;
       object oobject3 = p0[i3];
       p0 = p0[4];
       if (PatchProxy.isSupport(s.class)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,oobject3,p0};
          if (PatchProxy.applyVoid(objArray, null, s.class, "2")) {
          label_0048 :
             return;
          }
       }
       a.a().b(oobject, oobject1, oobject2, oobject3, p0).subscribe(Functions.d(), Functions.d());
       goto label_0048 ;
    }
}
