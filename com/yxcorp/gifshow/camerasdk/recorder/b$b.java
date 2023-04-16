package com.yxcorp.gifshow.camerasdk.recorder.b$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.camerasdk.recorder.b;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import aj9.d;
import com.yxcorp.gifshow.camerasdk.recorder.b$c;
import java.util.Objects;
import java.lang.Long;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import qi9.q1;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import nkd.a;
import nkd.a$a;

public class b$b implements Runnable	// class@001044
{
    public boolean b;
    public final List c;
    public final b d;

    public void b$b(b p0){
       this.d = p0;
       super();
       this.b = false;
       this.c = Collections.synchronizedList(new ArrayList(2));
    }
    public void run(){
       b$b d;
       float f;
       int i2;
       Object[] objArray4;
       int b = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, b, b$b.class, "2")) {
          return;
       }
       b.b = true;
       b h = b.d.h;
       if (h != null) {
          Object[] objArray1 = -1;
          if (h.a != objArray1) {
             int i = 0;
             Object[] objArray2 = objArray;
             int i1 = 0;
             b$b uob = null;
             while (i1 < b.c.size()) {
                b$c uoc = b.c.get(i1);
                d = b.d;
                b$c a = uoc.a;
                b$c b1 = uoc.b;
                Objects.requireNonNull(d);
                b uob1 = b.class;
                if (PatchProxy.isSupport(uob1)) {
                   b obj = PatchProxy.applyTwoRefs(Long.valueOf(a), Boolean.valueOf(b1), d, uob1, "10");
                   if (obj != PatchProxyResult.class) {
                      f = obj.floatValue();
                      i = 0;
                   }else {
                   label_0060 :
                      Object[] objArray3 = new Object[i];
                      q1.C().w("RecorderHelper", "onProgress\(\) called with: recordedDuration = ["+a+"], last = ["+b1+"]", objArray3);
                      obj = d.h;
                      if (obj != null) {
                         d a1 = obj.a;
                         if (a1 != objArray1) {
                            b f1 = d.f;
                            if (f1 != null) {
                               d.d = i;
                               d.f = i;
                               d.c = a;
                               d.c(a1);
                            }
                            b c = d.c;
                            if (a - c || f1 != null) {
                               uob1 = d.h;
                               long l = a - c;
                               long l1 = (long)uob1.e + l;
                               b = (int)l1;
                               uob1.e = b;
                               if (f1 != null) {
                                  l1 = (long)b + c;
                                  uob1.e = (int)l1;
                               }
                               i2 = uob1.d + 1;
                               uob1.d = i2;
                            }
                            objArray1 = new Object[0];
                            q1.C().w("RecorderHelper", "mRecodingSegment.duration = "+d.h.e, objArray1);
                            if (d.t <= 50) {
                               b e = d.e;
                               if (e == 20) {
                                  e = d.j;
                                  Objects.requireNonNull(e);
                                  objArray4 = null;
                                  if (!PatchProxy.applyVoid(objArray4, e, VideoContext.class, "12")) {
                                     VideoContext b2 = e.b;
                                     a c1 = b2.c;
                                     _monitor_enter(c1);
                                     b2.c.add(b2.d);
                                     b2.d = new a$a(b2);
                                     _monitor_exit(c1);
                                  }
                                  int i3 = 0;
                                  d.e = i3;
                                  i2 = d.t + 1;
                                  d.t = i2;
                               }else {
                                  objArray4 = 0;
                                  i2 = e + 1;
                                  d.e = i2;
                               }
                            }else {
                               objArray4 = 0;
                            }
                            f = (float)d.u + (float)d.h.e;
                            f = f / (float)d.b;
                            if (f - 0x3f800000 >= 0) {
                               b = d.d + 1;
                               d.d = b;
                            }
                            if (b1 == null) {
                               d.c = a;
                            }
                         }
                      }
                      i = 0;
                      f = 0;
                   }
                }else {
                   goto label_0060 ;
                }
                if (uoc.b != null) {
                   objArray2 = uoc;
                }
                i1 = i1 + 1;
                uob = f;
                i = 0;
                objArray1 = -1;
                b = this;
             }
             b$b uob2 = this;
             if (objArray2 == null) {
                b$b c2 = uob2.c;
                objArray2 = c2.get((c2.size() - 1));
             }
             d = uob2.d;
             d a2 = h.a;
             float f2 = (uob - 0x3f800000 > 0)? 0x3f800000: uob;
             d.e(a2, f2, d.d, (long)h.e);
             if (objArray2.b != null) {
                uob2.d.stopRecording();
                uob2.d.a(h.a, uob);
             }
          }
       }
       return;
    }
}
