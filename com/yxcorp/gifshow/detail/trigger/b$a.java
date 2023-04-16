package com.yxcorp.gifshow.detail.trigger.b$a;
import jta.f;
import com.yxcorp.gifshow.detail.trigger.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;

public class b$a extends f	// class@001a1e
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa, "2")) {
          return;
       }
       if (!p0 - 0x3f800000) {
          this.a.P8(2);
       }
       return;
    }
    public void b(float p0){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa, "1")) {
          return;
       }
       this.a.R8(2);
       return;
    }
}
