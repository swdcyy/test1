package com.yxcorp.gifshow.upload.r1$b$d;
import ojd.f;
import com.yxcorp.gifshow.upload.r1$b;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Boolean;
import com.yxcorp.gifshow.upload.UploadInfo;
import com.yxcorp.gifshow.upload.g;
import java.util.Objects;
import java.lang.Float;
import java.lang.Math;
import com.yxcorp.gifshow.upload.r1;

public class r1$b$d implements f	// class@001ea2
{
    public final r1$b a;

    public void r1$b$d(r1$b p0){
       this.a = p0;
       super();
    }
    public boolean a(int p0,int p1,Object p2){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(r1$b$d.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, r1$b$d.class, "1");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       float f = ((float)p0 * 0x3f7d70a4) / (float)p1;
       r1$b$d ta = this.a;
       if (ta.c == null) {
          ta.mProgress = f;
          if (p2 != null) {
             ta = this.a;
             if (ta.f instanceof g && p2 instanceof Integer) {
                ta.mUploadTimeRemained = p2.intValue();
             }
          }
          ta = this.a;
          Objects.requireNonNull(ta);
          if (PatchProxy.isSupport(r1$b.class)) {
             p2 = PatchProxy.applyOneRefs(Float.valueOf(f), ta, r1$b.class, "7");
             if (p2 != patchProxyRe) {
                b = p2.booleanValue();
             }else if(ta.f instanceof g && (Float.compare(Math.abs((ta.h - f)), 0x3a83126f) >= 0 || (Math.abs((ta.h - f)) - 0x3c23d70a >= 0 || !Float.compare(f, 0x3f7d70a4)))){
                b = true;
             }else {
                b = false;
             }
          }else {
             goto label_0071 ;
          }
          if (b) {
             ta = this.a;
             ta.h = f;
             ta.o.l(ta.b);
          }
       }
       return this.a.c;
    }
}
