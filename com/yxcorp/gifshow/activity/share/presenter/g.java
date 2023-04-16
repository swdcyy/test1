package com.yxcorp.gifshow.activity.share.presenter.g;
import erd.g;
import com.yxcorp.gifshow.activity.share.presenter.j;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import oa0.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.bubble.b;
import com.yxcorp.gifshow.activity.share.bubble.PublishBubbleItem;
import ra9.c;
import android.view.View;
import com.yxcorp.gifshow.activity.share.presenter.f;
import com.yxcorp.gifshow.bubble.b$b;
import zw8.l;
import com.yxcorp.gifshow.bubble.PostBubbleManager$c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import com.yxcorp.gifshow.bubble.a;

public final class g implements g	// class@0013e7
{
    public final j b;

    public void g(j p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       a.b().w("PublishRuleTipPresenter", "checkWaterMarkShowRuleTip accept: show="+p0, objArray);
       if (p0.booleanValue() && !PatchProxy.applyVoid(null, tb, j.class, "5")) {
          Object[] objArray1 = new Object[0];
          a.b().w("PublishRuleTipPresenter", "showRuleTip: ", objArray1);
          p0 = a.a.edit();
          p0.putLong("last_publish_rule_tip_show_time", System.currentTimeMillis());
          g.a(p0);
          p0 = tb.getActivity();
          if (p0 == null || p0.isFinishing()) {
             Object[] objArray2 = new Object[0];
             a.b().w("PublishRuleTipPresenter", "showRuleTip: activity is over", objArray2);
          }else {
             b uob = new b(PublishBubbleItem.PUBLISH_RULE);
             uob.b(tb.q);
             uob.k(new f(tb));
             uob.j(new l(tb, p0));
             PostBubbleManager.e(p0).n(uob);
          }
       }
       return;
    }
}
