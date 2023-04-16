package com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs$g;
import erd.g;
import com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs;
import java.lang.Object;
import com.trello.rxlifecycle3.android.ActivityEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.Collection;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.Intent;
import js6.a;
import com.kwai.feature.post.api.feature.bridge.GoToPostFinishEventResult;
import java.util.List;
import java.util.Map;
import android.content.Context;
import crd.a;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;

public final class SocialSimplePhotoFragmentViewBinderAbs$g implements g	// class@000d7d
{
    public final SocialSimplePhotoFragmentViewBinderAbs b;

    public void SocialSimplePhotoFragmentViewBinderAbs$g(SocialSimplePhotoFragmentViewBinderAbs p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SocialSimplePhotoFragmentViewBinderAbs$g.class, "1")) {
       }else {
          String str = "event";
          try{
             a.p(p0, str);
             int i = 0;
             Object[] objArray = new Object[i];
             a.D().w("SocialSimplePhotoFragmentViewBinderAbs", "bindView event:"+p0, objArray);
             if (p0 == ActivityEvent.DESTROY && (this.b.Q.isEmpty() ^ 0x01)) {
                p0 = ActivityContext.g();
                a.o(p0, "ActivityContext.getInstance\(\)");
                p0 = p0.e();
                String stringExtra = SocialSimplePhotoFragmentViewBinderAbs.t0(this.b).getIntent().getStringExtra("photo_task_id");
                Object[] objArray1 = new Object[i];
                a.D().w("SocialSimplePhotoFragmentViewBinderAbs", "bindView event to krn, currentActivity:"+p0+", taskId:"+stringExtra+", resultList:"+this.b.Q, objArray1);
                SocialSimplePhotoFragmentViewBinderAbs$g tb = this.b;
                GoToPostFinishEventResult goToPostFini = new GoToPostFinishEventResult(tb.Q, stringExtra, tb.W, tb.Y, tb.X);
                a.b.pt(p0, "goToPostFinishEvent", objArray1.toKrn());
                if (!this.b.R.isDisposed()) {
                   this.b.R.dispose();
                }
             }
          }catch(java.lang.Exception e11){
             PostUtils.D("SocialSimplePhotoFragmentViewBinderAbs", "onUnbind", e11);
          }
       }
    }
}
