package com.kuaishou.commercial.tach.component.live.TKKwaiLiveIcon;
import com.tachikoma.core.component.e;
import gx4.f;
import android.view.View;
import android.content.Context;
import android.widget.FrameLayout;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.widget.LiveCoverIconView;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.live.model.LiveStreamModel;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.kuaishou.android.live.model.LiveCoverWidgetModel;

public class TKKwaiLiveIcon extends e	// class@001669
{
    public QPhoto feed;
    public LiveCoverIconView v;

    public void TKKwaiLiveIcon(f p0){
       super(p0);
       this.getView();
    }
    public View createViewInstance(Context p0){
       return this.createViewInstance(p0);
    }
    public FrameLayout createViewInstance(Context p0){
       FrameLayout obj = PatchProxy.applyOneRefs(p0, this, TKKwaiLiveIcon.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new FrameLayout(p0);
       this.v = new LiveCoverIconView(p0);
       obj.addView(this.v, new FrameLayout$LayoutParams(-2, -2));
       return obj;
    }
    public void setFeed(QPhoto p0){
       TKKwaiLiveIcon tKKwaiLiveIc = TKKwaiLiveIcon.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, tKKwaiLiveIc, "2")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.feed = p0;
       p0 = p0.mEntity;
       if (!p0 instanceof LiveStreamFeed || (!PatchProxy.applyVoidOneRefs(p0, this, tKKwaiLiveIc, "4") && p0 != null)) {
          LiveStreamFeed mLiveStreamM = p0.mLiveStreamModel;
          if (mLiveStreamM != null && !q.f(mLiveStreamM.mCoverWidgets)) {
             this.v.N(p0.mLiveStreamModel.mCoverWidgets.get(0));
          }
       }
    label_0040 :
       return;
    }
    public void showLiveClose(){
       if (PatchProxy.applyVoid(null, this, TKKwaiLiveIcon.class, "3")) {
          return;
       }
       this.v.X();
       return;
    }
    public void unRetainAllJsObj(){
       if (PatchProxy.applyVoid(null, this, TKKwaiLiveIcon.class, "5")) {
          return;
       }
       super.unRetainAllJsObj();
       return;
    }
}
