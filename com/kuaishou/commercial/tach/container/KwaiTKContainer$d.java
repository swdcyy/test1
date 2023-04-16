package com.kuaishou.commercial.tach.container.KwaiTKContainer$d;
import erd.g;
import kotlin.jvm.internal.Ref$ObjectRef;
import ww4.b;
import java.lang.Object;
import sx4.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.Log;
import crd.b;

public final class KwaiTKContainer$d implements g	// class@00167c
{
    public final Ref$ObjectRef b;
    public final b c;

    public void KwaiTKContainer$d(Ref$ObjectRef p0,b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiTKContainer$d.class, "1")) {
       }else {
          Log.g("TKContainer", "registerTKInitListener received TKV8SoLoadSuccessEvent");
          p0 = this.b.element;
          if (p0 != null) {
             p0.dispose();
          }
          p0 = this.c;
          if (p0 != null) {
             p0.a();
          }
       }
       return;
    }
}
