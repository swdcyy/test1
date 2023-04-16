package com.kwai.live.gzone.bridge.function.b;
import erd.g;
import a47.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.gamezone.bridge.JsAddShortcutToDesktopParams;
import android.content.Intent;
import f55.g;
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

public class b implements g	// class@000c86
{
    public final GifshowActivity b;
    public final JsAddShortcutToDesktopParams c;
    public final Intent d;
    public final g e;
    public final c f;

    public void b(c p0,GifshowActivity p1,JsAddShortcutToDesktopParams p2,Intent p3,g p4){
       this.f = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
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
       this.e.onSuccess(FunctionResultParams.createSuccessResult());
       return;
    }
}
