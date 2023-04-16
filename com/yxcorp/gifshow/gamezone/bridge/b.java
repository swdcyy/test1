package com.yxcorp.gifshow.gamezone.bridge.b;
import erd.g;
import com.yxcorp.gifshow.gamezone.bridge.d$a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.gamezone.bridge.JsAddShortcutToDesktopParams;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.core.content.pm.a$a;
import com.yxcorp.gifshow.gamezone.bridge.JsAddShortcutToDesktopParams$Params;
import android.content.Context;
import java.lang.CharSequence;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.content.pm.a;
import lnc.m9;
import com.kwai.yoda.function.FunctionResultParams;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.function.c;

public class b implements g	// class@0012b8
{
    public final GifshowActivity b;
    public final JsAddShortcutToDesktopParams c;
    public final Intent d;
    public final d$a e;

    public void b(d$a p0,GifshowActivity p1,JsAddShortcutToDesktopParams p2,Intent p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a$a uoa = new a$a(this.b, this.c.mParams.mShortcutId);
       uoa.f(this.c.mParams.mTitle);
       uoa.e(this.c.mParams.mTitle);
       uoa.b(IconCompat.n(p0.getBitmap()));
       uoa.c(this.d);
       p0 = uoa.a();
       m9.i(this.b, p0);
       p0 = this.e;
       p0 = this.e;
       p0.o.l(p0.k, FunctionResultParams.createSuccessResult(), p0.l, p0.m, null, p0.n);
       return;
    }
}
