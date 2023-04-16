package com.yxcorp.gifshow.gamezone.bridge.a;
import erd.o;
import com.yxcorp.gifshow.gamezone.bridge.d$a;
import com.yxcorp.gifshow.gamezone.bridge.JsAddShortcutToDesktopParams;
import java.lang.Object;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import com.yxcorp.gifshow.gamezone.bridge.JsAddShortcutToDesktopParams$Params;
import java.util.Objects;
import com.yxcorp.gifshow.gamezone.bridge.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import sma.a;
import io.reactivex.g;
import java.util.concurrent.TimeUnit;
import android.graphics.drawable.Drawable;
import lnc.a1;

public final class a implements o	// class@0012b7
{
    public final d$a b;
    public final JsAddShortcutToDesktopParams c;

    public void a(d$a p0,JsAddShortcutToDesktopParams p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       p0 = this.b.o;
       JsAddShortcutToDesktopParams$Params mIcon = this.c.mParams.mIcon;
       Objects.requireNonNull(p0);
       t ot = PatchProxy.applyOneRefs(mIcon, p0, d.class, "2");
       if (ot != PatchProxyResult.class) {
       }else if(!TextUtils.x(mIcon)){
          ot = t.create(new a(p0, mIcon)).timeout(3000, TimeUnit.MILLISECONDS);
       }else {
          ot = t.just(a1.f(R.drawable.kwai_icon));
       }
       return ot;
    }
}
