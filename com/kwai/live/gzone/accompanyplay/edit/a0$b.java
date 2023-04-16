package com.kwai.live.gzone.accompanyplay.edit.a0$b;
import erd.g;
import com.kwai.live.gzone.accompanyplay.edit.a0;
import java.lang.Object;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyBindGameAccountInfoResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyBindGameAccountInfo;
import java.util.Objects;
import u07.t$a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import u07.f;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;

public class a0$b implements g	// class@000bd0
{
    public final a0 b;

    public void a0$b(a0 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a0$b.class, "1")) {
       }else {
          this.b.V8(p0.mBindGameAccountInfo);
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, a0.class, "4")) {
             t$a uoa = new t$a(p0.getActivity());
             uoa.W0(R.string.arg_RES_7f1023b8);
             uoa.S0(R.string.arg_RES_7f103a83);
             p0 = f.e(uoa);
             p0.Y(PopupInterface.a);
          }
       }
       return;
    }
}
