package f4a.h0;
import erd.g;
import f4a.i0;
import java.lang.Object;
import na6.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.ref.WeakReference;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.activity.x;
import java.lang.System;
import k2b.e0;

public final class h0 implements g	// class@0022a7
{
    public final i0 b;

    public void h0(i0 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h0.class, "1")) {
       }else if(a.g(this.b.j, p0.c) ^ 1){
          h0 tb = this.b;
          a.o(p0, "event");
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, i0.class, "2")) {
             b b = p0.b;
             if (b != 1) {
                String str = "activity.kwaiPageLogger";
                if (b != 2) {
                   if (b == 3 && (tb.g != null && tb.l == null)) {
                      tb.l = true;
                      tb.i = p0.d;
                      p0 = p0.a.get();
                      if (p0 instanceof GifshowActivity) {
                         p0 = p0.N2();
                         a.o(p0, str);
                         tb.b(tb.a, p0, (System.currentTimeMillis() - tb.h), tb.c);
                      }
                   }
                }else if(tb.g != null){
                   tb.g = false;
                   tb.l = false;
                   p0 = p0.a.get();
                   if (p0 instanceof GifshowActivity) {
                      p0 = p0.N2();
                      a.o(p0, str);
                      tb.b(tb.b, p0, (System.currentTimeMillis() - tb.h), tb.d);
                   }
                }
             }else if(tb.g == null){
                tb.g = true;
                tb.h = System.currentTimeMillis();
             }
          }
       }
       return;
    }
}
