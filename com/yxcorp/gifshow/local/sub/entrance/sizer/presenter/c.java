package com.yxcorp.gifshow.local.sub.entrance.sizer.presenter.c;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.local.sub.entrance.sizer.presenter.HomeLocalSizerViewPresenter;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import mrd.a;
import java.util.Objects;
import com.yxcorp.gifshow.local.sub.entrance.sizer.model.WeatherBar;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import f2b.f;
import java.lang.Runnable;
import ekd.k1;
import e2b.a;
import k2b.h;
import k2b.e0;

public class c extends m	// class@001aca
{
    public final HomeLocalSizerViewPresenter c;

    public void c(HomeLocalSizerViewPresenter p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       HomeLocalSizerViewPresenter r = this.c.r;
       if (r != null) {
          r.onNext(Boolean.FALSE);
       }
       c tc = this.c;
       Objects.requireNonNull(tc);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tc, HomeLocalSizerViewPresenter.class, "17")) {
          HomeLocalSizerViewPresenter u = tc.u;
          if (u != null && !TextUtils.x(u.mLinkUrl)) {
             k1.r(new f(tc, tc.u.mLinkUrl), 300);
          }
       }
       r = this.c.p;
       if (!PatchProxy.applyVoidOneRefs(r, objArray, a.class, "4")) {
          h.m("2616703", "NEARBY_TOP_BAR_WEATHER_INFO_BTN").i(r);
       }
       return;
    }
}
