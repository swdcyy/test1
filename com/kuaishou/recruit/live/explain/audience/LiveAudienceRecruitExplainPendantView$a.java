package com.kuaishou.recruit.live.explain.audience.LiveAudienceRecruitExplainPendantView$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.recruit.live.explain.audience.LiveAudienceRecruitExplainPendantView;
import android.view.View$OnClickListener;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class LiveAudienceRecruitExplainPendantView$a extends m	// class@000ebe
{
    public final View$OnClickListener c;
    public final LiveAudienceRecruitExplainPendantView d;

    public void LiveAudienceRecruitExplainPendantView$a(LiveAudienceRecruitExplainPendantView p0,boolean p1,View$OnClickListener p2){
       this.d = p0;
       this.c = p2;
       super(p1);
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceRecruitExplainPendantView$a.class, "1")) {
          return;
       }
       this.c.onClick(p0);
       return;
    }
}
