package com.kuaishou.tuna_profile_header.b$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.tuna_profile_header.b;
import com.kwai.framework.model.user.UserProfile;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.framework.model.user.AdBusinessInfo;
import x2c.a;
import com.kwai.framework.model.user.AdBusinessInfo$BusinessFunction;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import g05.b;
import n15.f;
import msd.l;
import g05.b$a;
import wkd.b;
import e05.a;
import brd.t;
import cjd.e;
import erd.o;
import n15.d;
import erd.g;
import crd.b;
import h05.d;

public class b$a extends m	// class@001179
{
    public final UserProfile c;
    public final b d;

    public void b$a(b p0,UserProfile p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       b$a td = this.d;
       b$a tc = this.c;
       Objects.requireNonNull(td);
       b uob = b.class;
       if (!PatchProxy.applyVoidOneRefs(tc, td, uob, "7")) {
          Activity activity = td.getActivity();
          if (tc != null && activity != null) {
             AdBusinessInfo uAdBusinessI = a.b(tc);
             if (uAdBusinessI != null) {
                AdBusinessInfo mBusinessFun = uAdBusinessI.mBusinessFunction;
                if (mBusinessFun != null && !TextUtils.x(mBusinessFun.mUrl)) {
                   b.a.a("CLICK_BUSINESS_FEATURE", new f(td));
                   if (!TextUtils.x(uAdBusinessI.mBusinessFunction.mBubbleDesc)) {
                      String str = "business_function_entrance";
                      if (!PatchProxy.applyVoidOneRefs(str, td, uob, "8")) {
                         td.X7(b.a(-93866330).b(str).map(new e()).subscribe(new d(td)));
                      }
                   }
                   d.c(activity, uAdBusinessI.mBusinessFunction.mUrl);
                }
             }
          }
       }
       return;
    }
}
