package com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager$l;
import fw8.b;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager;
import android.app.Activity;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.basic.activity.LivePlayActivity;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowCloseType;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.live.core.basic.utils.e;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import va1.d0;
import com.kuaishou.live.core.show.floatingwindow.z;

public class LiveFloatingWindowManager$l extends b	// class@000b6c
{
    public final LiveFloatingWindowManager b;

    public void LiveFloatingWindowManager$l(LiveFloatingWindowManager p0){
       this.b = p0;
       super();
    }
    public void onActivityCreated(Activity p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveFloatingWindowManager$l.class, "1")) {
          return;
       }
       b.c0(LiveLogTag.FLOATING_WINDOW, "onActivityCreated", "activity", p0);
       return;
    }
    public void onActivityResumed(Activity p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFloatingWindowManager$l.class, "2")) {
          return;
       }
       LiveLogTag fLOATING_WIN = LiveLogTag.FLOATING_WINDOW;
       b.c0(fLOATING_WIN, "onActivityResumed", "activity", p0);
       if (p0 instanceof LivePlayActivity) {
          b.Z(fLOATING_WIN, "onActivityResumed, enter LivePlayActivity -> close");
          if (p0.x3() != null && (this.b.x != null && TextUtils.equals(p0.x3().getLiveStreamId(), this.b.x.getLiveStreamId()))) {
             this.b.c(LiveFloatingWindowCloseType.BACK_TO_SAME_LIVE);
          }else {
             this.b.c(LiveFloatingWindowCloseType.ENTER_OTHER_LIVE);
          }
          return;
       }else {
          QPhoto qPhoto = e.h(p0);
          if (qPhoto != null && qPhoto.isLiveStream()) {
             b.Z(fLOATING_WIN, "onActivityResumed enter PhotoDetailActivity\(photo.isLiveStream\) -> close");
             LiveFloatingWindowManager$l tb = this.b;
             if (tb.x != null) {
                Objects.requireNonNull(tb);
                Object obj = PatchProxy.applyOneRefs(qPhoto, tb, LiveFloatingWindowManager.class, "49");
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                }else if(LiveFloatingWindowManager.m()){
                   b = TextUtils.equals(d0.a(new LiveStreamFeedWrapper(qPhoto.mEntity)), tb.i());
                }else {
                   b = TextUtils.equals(qPhoto.getLiveStreamId(), tb.x.getLiveStreamId());
                }
                if (b) {
                   if (this.b.M == null || !LiveFloatingWindowManager.m()) {
                      this.b.c(LiveFloatingWindowCloseType.BACK_TO_SAME_LIVE);
                   }
                }else {
                label_00be :
                   this.b.c(LiveFloatingWindowCloseType.ENTER_OTHER_LIVE);
                }
             }else {
                goto label_00be ;
             }
             b.M = false;
             return;
          }else if(!z.b(p0.getClass().getSimpleName())){
             b.Z(fLOATING_WIN, "onActivityResumed enter CameraActivity -> close");
             this.b.c(LiveFloatingWindowCloseType.ENTER_SHOOT);
          }
          return;
       }
    }
}
