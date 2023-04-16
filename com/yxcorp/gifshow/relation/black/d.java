package com.yxcorp.gifshow.relation.black.d;
import sfc.a;
import com.yxcorp.gifshow.relation.black.f;
import android.content.Context;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class d extends a	// class@0017e2
{
    public final f c;

    public void d(f p0,Context p1){
       this.c = p0;
       super(p1);
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       super.b(p0);
       return;
    }
}
