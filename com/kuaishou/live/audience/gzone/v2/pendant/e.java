package com.kuaishou.live.audience.gzone.v2.pendant.e;
import com.kuaishou.live.audience.gzone.v2.pendant.LiveGzoneActivityPendantView$c;
import com.kuaishou.live.audience.gzone.v2.pendant.LiveGzonePendantViewPagerPresenter;
import com.kuaishou.live.common.gzone.pendant.LiveGzonePendant;
import com.kuaishou.live.audience.gzone.v2.pendant.LiveGzoneActivityPendantView;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.webkit.URLUtil;
import t02.a0;
import com.kwai.live.gzone.tab.bean.LiveGzoneTabSource;
import k67.b;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import vq5.d;

public class e implements LiveGzoneActivityPendantView$c	// class@000c42
{
    public final LiveGzonePendant a;
    public final LiveGzoneActivityPendantView b;
    public final LiveGzonePendantViewPagerPresenter c;

    public void e(LiveGzonePendantViewPagerPresenter p0,LiveGzonePendant p1,LiveGzoneActivityPendantView p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       if (this.c.p != null) {
          LiveGzonePendant mLink = this.a.mLink;
          if (mLink != null && URLUtil.isNetworkUrl(mLink)) {
             this.c.z.R1.bl(this.a.mPicName, LiveGzoneTabSource.ACTIVITY_PENDANT);
          }else if(this.a.mHalfScreenModel != null){
             this.b.e(p0);
          }else {
             e tc = this.c;
             LiveGzonePendantViewPagerPresenter z = tc.z;
             if (z != null) {
                z.p2.r4(p0, tc.getContext());
             }
          }
       }else {
          goto label_002d ;
       }
       return;
    }
}
