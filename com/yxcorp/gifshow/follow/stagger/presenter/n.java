package com.yxcorp.gifshow.follow.stagger.presenter.n;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.follow.stagger.presenter.p;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.AggregateTemplateMeta;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import ekd.p0;
import e17.i;
import com.kwai.framework.model.user.User;
import zic.f;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import jga.f$a;
import com.kwai.robust.PatchProxyResult;
import fka.e;
import jga.f;
import brd.t;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import com.yxcorp.gifshow.follow.stagger.presenter.o;
import erd.r;
import eja.d0;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import eja.e0;

public final class n implements View$OnClickListener	// class@00121a
{
    public final p b;

    public void n(p p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       n tb = this.b;
       Objects.requireNonNull(tb);
       p op = p.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, op, "5")) {
       }else if(tb.s.mRecommendUser == null){
          int i = 0x7f110668;
          if (!p0.C(a.a().a())) {
             i.a(i, R.string.arg_RES_7f1038e7);
          }else {
             AggregateTemplateMeta mRecommendUs = tb.s.mRecommendUser;
             if (mRecommendUs.mIsHiddenUser != null) {
                i.a(i, R.string.arg_RES_7f104fe7);
                f.b();
             }else {
                GifshowActivity activity = tb.getActivity();
                String url = activity.getUrl();
                f$a uoa = new f$a(mRecommendUs, activity.R2(tb.r));
                uoa.o(url);
                String str = PatchProxy.apply(objArray, tb, op, "6");
                if (str != PatchProxyResult.class) {
                }else {
                   str = e.a().c(18);
                }
                uoa.l(str);
                uoa.q(true);
                f uof = uoa.b();
                if (tb.t == 2) {
                   FollowHelper.k(uof).filter(o.b).subscribe(new d0(tb), Functions.d());
                }else {
                   FollowHelper.d(uof, new e0(tb), Functions.d());
                }
             }
          }
       }
       return;
    }
}
