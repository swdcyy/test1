package com.kuaishou.merchant.home2.basic.widget.DrawableWrapper$targetDrawable$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import ex3.b;
import android.graphics.drawable.Drawable;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.merchant.home.basic.log.MerchantHomeLogBiz;
import java.lang.StringBuilder;
import p74.a;
import o74.a;
import lnc.a1;
import androidx.core.graphics.drawable.a;

public final class DrawableWrapper$targetDrawable$2 extends Lambda implements a	// class@0016f0
{
    public final b this$0;

    public void DrawableWrapper$targetDrawable$2(b p0){
       this.this$0 = p0;
       super(0);
    }
    public final Drawable invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       DrawableWrapper$targetDrawable$2 obj = PatchProxy.apply(objArray, this, DrawableWrapper$targetDrawable$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.this$0;
       Objects.requireNonNull(obj);
       Drawable uDrawable = PatchProxy.apply(objArray, obj, b.class, "3");
       if (uDrawable != patchProxyRe) {
       }else {
          a.d(MerchantHomeLogBiz.Common, "DrawableWrapper", "create tint "+obj.c);
          uDrawable = a1.f(obj.b);
          b c = obj.c;
          if (c != null) {
             a.n(uDrawable, c);
          }
       }
       return uDrawable;
    }
    public Object invoke(){
       return this.invoke();
    }
}
