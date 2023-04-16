package com.yxcorp.gifshow.postentrance.bubblev2.presenter.b;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostOperationBubblePresenter$b;
import com.yxcorp.gifshow.postentrance.bubblev2.model.bubbleinfo.PublishGuideInfo;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Intent;
import android.net.Uri;
import ekd.x0;
import android.app.Activity;
import com.kwai.gifshow.post.api.feature.postentrance.bubble.BasePostEntranceBubble;
import kotlin.jvm.internal.a;

public final class b extends m	// class@00102f
{
    public final HomePostOperationBubblePresenter$b c;
    public final PublishGuideInfo d;

    public void b(HomePostOperationBubblePresenter$b p0,PublishGuideInfo p1){
       this.c = p0;
       this.d = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       Intent intent = new Intent();
       intent.setAction("android.intent.action.VIEW");
       intent.addCategory("android.intent.category.DEFAULT");
       intent.setData(x0.f(this.d.mScheme));
       Activity uActivity = this.c.r();
       a.m(uActivity);
       uActivity.startActivity(intent);
       return;
    }
}
