package com.yxcorp.gifshow.prettify.makeup.i$a;
import com.yxcorp.gifshow.util.resource.ResourceDownloadProgressHelper$b;
import java.lang.String;
import l16.b;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import boc.b;
import boc.o;
import xyb.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.prettify.makeup.i;
import java.lang.Float;
import java.util.Map;

public class i$a implements ResourceDownloadProgressHelper$b	// class@001181
{
    public final String a;
    public final b b;

    public void i$a(String p0,b p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i$a.class, "3")) {
          return;
       }
       i$a tb = this.b;
       if (tb == null) {
          return;
       }
       tb.onError();
       return;
    }
    public void h(b p0){
       o.a(this, p0);
    }
    public void onCompleted(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("MakeupDownloadHelper", "onModelCompleted : "+this.a+"---"+p0, objArray);
       i.c.put(this.a, Float.valueOf(0x3f800000));
       i.q(this.a, this.b);
       return;
    }
    public void onProgress(String p0,float p1){
       i$a uoa = i$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, uoa, "1")) {
          return;
       }
       i.c.put(this.a, Float.valueOf(p1));
       i.r(this.a, this.b);
       return;
    }
}
