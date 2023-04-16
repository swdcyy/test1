package com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.presenter.a$f;
import zq6.u;
import com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.presenter.a;
import java.lang.Object;
import co5.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import co5.i$a;
import android.graphics.Bitmap;
import com.kwai.library.widget.textview.IconifyTextViewNew;

public final class a$f implements u	// class@001719
{
    public final a a;

    public void a$f(a p0){
       this.a = p0;
       super();
    }
    public void onChange(Object p0){
       i$a a;
       int i;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, a$f.class, str)) {
       }else {
          a.p(p0, "tabImage");
          a b = this.a.B;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(b, p0, i.class, "2")) {
             if (p0.a != null) {
                p0 = p0.b;
                if (p0 != null) {
                   if (!PatchProxy.applyVoidOneRefs(b, p0, i$a.class, str)) {
                      a = p0.a;
                      if (a != null) {
                         b.setImageSrcBitmap(a);
                      }
                      p0 = p0.b;
                      if (p0 != null) {
                         i = 2;
                         if (p0.length == i) {
                            Objects.requireNonNull(b);
                            int[] ointArray = new int[i];
                            ointArray[0] = p0[0];
                            ointArray[1] = p0[1];
                            b.o = ointArray;
                         }
                      }
                      b.f();
                   }
                   b.f();
                }
             }
             b.d(16, 0);
          }
       }
       return;
    }
}
