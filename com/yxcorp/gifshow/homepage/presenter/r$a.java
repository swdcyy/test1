package com.yxcorp.gifshow.homepage.presenter.r$a;
import fw8.b;
import com.yxcorp.gifshow.homepage.presenter.r;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Objects;
import android.app.Application;
import o56.a;
import android.app.Application$ActivityLifecycleCallbacks;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.model.mix.CommonMeta;
import android.view.View;

public class r$a extends b	// class@0017d6
{
    public final r b;

    public void r$a(r p0){
       this.b = p0;
       super();
    }
    public void onActivityDestroyed(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r$a.class, "2")) {
          return;
       }
       if (p0 == this.b.getActivity()) {
          Objects.requireNonNull(this.b);
          a.b().unregisterActivityLifecycleCallbacks(this);
       }
       return;
    }
    public void onActivityResumed(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r$a.class, "1")) {
          return;
       }
       if (p0 == this.b.getActivity()) {
          r$a tb = this.b;
          if (tb.u != null && (tb.r != null && (!TextUtils.n(tb.q.getId(), QCurrentUser.ME.getId()) || this.b.p.mProductsNeedBoostFansTop == null))) {
             this.b.u.setVisibility(8);
          }
       }
       return;
    }
}
