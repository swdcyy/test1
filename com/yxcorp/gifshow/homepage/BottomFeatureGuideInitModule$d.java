package com.yxcorp.gifshow.homepage.BottomFeatureGuideInitModule$d;
import java.lang.Runnable;
import com.yxcorp.gifshow.homepage.BottomFeatureGuideInitModule;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.app.Activity;
import o56.f;
import kzc.d;
import com.kwai.library.widget.popup.common.config.PopupOrientation;
import com.kwai.library.widget.popup.common.c$b;
import u07.t$a;
import lnc.a1;
import java.lang.CharSequence;
import com.kwai.library.widget.popup.common.PopupInterface$g;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import gsa.f;
import u07.u;
import gsa.g;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;

public final class BottomFeatureGuideInitModule$d implements Runnable	// class@00169a
{
    public final BottomFeatureGuideInitModule b;

    public void BottomFeatureGuideInitModule$d(BottomFeatureGuideInitModule p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BottomFeatureGuideInitModule$d.class, "1")) {
          return;
       }
       BottomFeatureGuideInitModule$d tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, BottomFeatureGuideInitModule.class, "7")) {
          Activity uActivity = f.a();
          if (uActivity != null) {
             d uod = new d(uActivity);
             uod.Z0(116);
             uod.U(PopupOrientation.ORIENTATION_PORTRAIT);
             uod.B0(R.drawable.arg_RES_7f080961);
             uod.T0(a1.p(R.string.arg_RES_7f100da9));
             uod.z0(a1.p(R.string.arg_RES_7f100e64));
             uod.L(new PopupInterface$g(R.layout.arg_RES_7f0d0411));
             uod.u0(f.b);
             uod.Y(new g(tb));
          }
       }
       return;
    }
}
