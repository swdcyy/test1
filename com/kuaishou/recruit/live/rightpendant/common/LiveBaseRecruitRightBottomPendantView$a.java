package com.kuaishou.recruit.live.rightpendant.common.LiveBaseRecruitRightBottomPendantView$a;
import ub.a;
import com.kuaishou.recruit.live.rightpendant.common.LiveBaseRecruitRightBottomPendantView;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.Animatable;
import bd.f;

public class LiveBaseRecruitRightBottomPendantView$a extends a	// class@000ed8
{
    public final CDNUrl[] b;
    public final LiveBaseRecruitRightBottomPendantView c;

    public void LiveBaseRecruitRightBottomPendantView$a(LiveBaseRecruitRightBottomPendantView p0,CDNUrl[] p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveBaseRecruitRightBottomPendantView$a.class, "1")) {
          return;
       }
       this.c.b();
       return;
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveBaseRecruitRightBottomPendantView$a.class, "2")) {
       }else {
          p0.p = this.b;
       }
       return;
    }
}
