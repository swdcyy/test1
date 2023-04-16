package com.kuaishou.live.core.show.stayinfo.LiveAudienceStayInfoRecommendDialog$1;
import com.kwai.library.widget.recyclerview.layoutmanager.NpaLinearLayoutManager;
import com.kuaishou.live.core.show.stayinfo.LiveAudienceStayInfoRecommendDialog;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewGroup;
import android.view.ViewGroup$MarginLayoutParams;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;

public class LiveAudienceStayInfoRecommendDialog$1 extends NpaLinearLayoutManager	// class@0010ae
{
    public final LiveAudienceStayInfoRecommendDialog r;

    public void LiveAudienceStayInfoRecommendDialog$1(LiveAudienceStayInfoRecommendDialog p0,Context p1,int p2,boolean p3){
       this.r = p0;
       super(p1, p2, p3);
    }
    public boolean checkLayoutParams(RecyclerView$LayoutParams p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceStayInfoRecommendDialog$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          int i = this.r.d.getWidth() / 3;
          if (p0.width != i) {
             p0.width = i;
          }
       }
       return super.checkLayoutParams(p0);
    }
}
