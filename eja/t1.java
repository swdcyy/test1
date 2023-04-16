package eja.t1;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.follow.stagger.presenter.d0;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.SystemClock;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.StringBuilder;
import com.kuaishou.android.model.mix.AggregateTemplateMeta;
import wkd.b;
import nf6.i;
import android.content.Context;
import android.net.Uri;
import ekd.w0;
import android.content.Intent;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.util.List;
import yga.b;
import yga.c;
import ha5.b;
import ha5.e;
import com.kuaishou.android.model.feed.AggregateTemplateFeed;
import ia5.a;

public final class t1 implements View$OnClickListener	// class@0026fa
{
    public final d0 b;

    public void t1(d0 p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       t1 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, d0.class, "6")) {
       }else if((SystemClock.elapsedRealtime() - tb.A) - 1000 < 0 || tb.getActivity() == null){
          tb.A = SystemClock.elapsedRealtime();
          boolean b = true;
          Intent intent = b.a(0x66dce92a).a(tb.getContext(), w0.f(tb.v.mLinkUrl+"&"+"pageType"+"="+tb.z+"&"+"useContact"+"="+b));
          if (intent != null) {
             SerializableHook.putExtra(intent, "photo", new QPhoto(tb.s));
             tb.getContext().startActivity(intent);
          }else {
             Object[] objArray = new Object[b];
             objArray[0] = tb.v.mLinkUrl;
             c.a(KsLogFollowTag.FOLLOW_STAGGER.appendTag("PymkAggregateTemplateClickPresenter"), "AggregateTemplateClickPresenter"+String.format("cant jump url:%s", objArray));
          }
          d0 x = tb.x;
          if (x != null) {
             x.a(tb.s, tb.u, tb.v);
          }
          x = tb.w;
          if (x != null) {
             x.c(tb.s, tb.u);
          }
          a.c(tb.v.mContentType, tb.z, tb.s, 1464, p0);
       }
       return;
    }
}
