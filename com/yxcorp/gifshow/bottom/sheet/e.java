package com.yxcorp.gifshow.bottom.sheet.e;
import erd.g;
import com.yxcorp.gifshow.bottom.sheet.f;
import android.view.View;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.bottom.sheet.BottomSheetParams;
import java.lang.Long;
import crd.b;
import lnc.b9;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import brd.a0;
import com.yxcorp.gifshow.bottom.sheet.d;
import qa9.d;
import qa9.o;
import androidx.fragment.app.c;
import k2b.e0;
import java.lang.Throwable;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.activity.x;
import k2b.k2;
import k2b.u1;
import y8c.q;
import s2b.d;

public final class e implements g	// class@001c66
{
    public final f b;
    public final View c;

    public void e(f p0,View p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       Object[] objArray;
       Object[] objArray1;
       e tb = this.b;
       e tc = this.c;
       Objects.requireNonNull(tb);
       if (!p0.booleanValue()) {
          if (!PatchProxy.applyVoid(null, tb, f.class, "4")) {
             if (tb.a.isDetached()) {
                objArray1 = new Object[]{tb.c};
                f.d("Content[%1$s] is already destroyed!", objArray1);
             }else {
                BottomSheetParams mSurviveTime = tb.c().mSurviveTimeMs;
                if (mSurviveTime - null <= 0) {
                   objArray1 = new Object[]{tb.c};
                   f.d("Content[%1$s] is can not be destroyed!", objArray1);
                }else {
                   objArray1 = new Object[]{tb.c,Long.valueOf(mSurviveTime)};
                   f.d("Content[%1$s] needs [%2$s]ms survive time before being destroyed!", objArray1);
                   b9.a(tb.g);
                   tb.g = a0.Z(mSurviveTime, TimeUnit.MILLISECONDS, d.c).G(d.a).R(new d(tb), new d(tb));
                }
             }
          }
          f.j(tc, false);
       }
       boolean b = p0.booleanValue();
       o oo = o.class;
       if (!PatchProxy.isSupport(oo) || !PatchProxy.applyVoidTwoRefs(tb, Boolean.valueOf(b), null, oo, "1")) {
          if (tb.c().mNeedPageLogger == null) {
             objArray = new Object[]{tb.c};
             f.d("Content[%1$s] is log by itself", objArray);
          }else {
             Fragment uFragment = tb.a.getChildFragmentManager().findFragmentByTag(tb.c);
             if (!uFragment instanceof e0) {
                objArray = new Object[]{tb.c};
                f.e(null, "Content[%1$s] should implement ILogPage interface", objArray);
             }else {
                Fragment uFragment1 = uFragment;
                String str = uFragment1.o();
                GifshowActivity activity = (tb.a.getActivity() instanceof GifshowActivity)? tb.a.getActivity(): null;
                if (activity == null || TextUtils.x(str)) {
                   objArray = new Object[]{tb.c};
                   f.e(null, "Content[%1$s] should set getPage", objArray);
                }else if(b){
                   activity.N2().i(false);
                   if (!TextUtils.n(u1.j().d, str)) {
                      u1.L0(uFragment1);
                   }
                }else if(uFragment instanceof q){
                   uFragment.r9().e();
                }
                if (TextUtils.n(u1.j().d, str)) {
                   u1.a();
                }
                activity.N2().i(1);
             }
          }
       }
       tb.i(p0.booleanValue());
       return;
    }
}
