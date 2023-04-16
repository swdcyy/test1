package com.kwai.live.gzone.bridge.function.a;
import erd.o;
import a47.c;
import com.yxcorp.gifshow.gamezone.bridge.JsAddShortcutToDesktopParams;
import java.lang.Object;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.util.Objects;
import com.yxcorp.gifshow.gamezone.bridge.JsAddShortcutToDesktopParams$Params;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import a47.a;
import io.reactivex.g;
import java.util.concurrent.TimeUnit;
import android.graphics.drawable.Drawable;
import lnc.a1;

public final class a implements o	// class@000c85
{
    public final c b;
    public final JsAddShortcutToDesktopParams c;

    public void a(c p0,JsAddShortcutToDesktopParams p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       p0 = this.c.mParams.mIcon;
       t ot = PatchProxy.applyOneRefs(p0, tb, c.class, "2");
       if (ot != PatchProxyResult.class) {
       }else if(!TextUtils.x(p0)){
          ot = t.create(new a(tb, p0)).timeout(3000, TimeUnit.MILLISECONDS);
       }else {
          ot = t.just(a1.f(R.drawable.kwai_icon));
       }
       return ot;
    }
}
