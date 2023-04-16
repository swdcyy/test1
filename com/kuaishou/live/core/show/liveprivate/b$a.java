package com.kuaishou.live.core.show.liveprivate.b$a;
import ds5.c;
import com.kuaishou.live.core.show.liveprivate.b;
import java.lang.Object;
import java.lang.String;
import ds5.b;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.view.ViewGroup;
import va1.n0;
import com.kuaishou.android.live.model.QLivePlayConfig$WatermarkInfo;
import android.view.View;
import com.kuaishou.live.common.core.basic.widget.LiveFullWaterMarkView;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import java.lang.Throwable;
import com.yxcorp.retrofit.model.KwaiException;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.Integer;
import com.kuaishou.android.live.log.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.basic.utils.e;

public class b$a implements c	// class@000c88
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public String N5(){
       return b.a(this);
    }
    public void e2(QLivePlayConfig p0,QLivePlayConfig p1){
       b.c(this, p0, p1);
    }
    public void ff(QLivePlayConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       b$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(p0, tb, b.class, "7")) {
          p0 = p0.mWatermarkInfo;
          if (p0 == null) {
             n0.l(tb.p);
          }else {
             b p = tb.p;
             QLivePlayConfig$WatermarkInfo mContent = p0.mContent;
             if (!PatchProxy.applyVoidTwoRefs(p, mContent, null, n0.class, "3") && p != null) {
                int i = 0x7f0a1038;
                LiveFullWaterMarkView liveFullWate = p.findViewById(i);
                if (liveFullWate != null) {
                   liveFullWate.setDrawText(mContent);
                   liveFullWate.bringToFront();
                }else {
                   liveFullWate = new LiveFullWaterMarkView(p.getContext());
                   liveFullWate.setDrawText(mContent);
                   liveFullWate.setId(i);
                   p.addView(liveFullWate, new ViewGroup$LayoutParams(-1, -1));
                }
             }
          }
       }
       return;
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "2")) {
          return;
       }
       if (p0 instanceof KwaiException) {
          b.S(LiveLogTag.PRIVATE_LIVE.appendTag("LiveAudiencePrivatePresenter"), "getPlayUrl Error", "errorCode", Integer.valueOf(p0.mErrorCode));
          if (p0.getErrorCode() == 0x13c7d) {
             e.l(p0, this.b.getActivity());
          }else if(p0.getErrorCode() == 0x13c83){
             e.l(p0, this.b.getActivity());
          }
       }
       return;
    }
    public boolean xi(){
       return true;
    }
}
