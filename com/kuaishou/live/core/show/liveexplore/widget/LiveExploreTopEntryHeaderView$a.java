package com.kuaishou.live.core.show.liveexplore.widget.LiveExploreTopEntryHeaderView$a;
import ub.a;
import com.kuaishou.live.core.show.liveexplore.widget.LiveExploreTopEntryHeaderView;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;

public class LiveExploreTopEntryHeaderView$a extends a	// class@000c7c
{
    public final LiveExploreTopEntryHeaderView b;

    public void LiveExploreTopEntryHeaderView$a(LiveExploreTopEntryHeaderView p0){
       this.b = p0;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveExploreTopEntryHeaderView$a.class, "1")) {
       }else if(p1 != null && (p1.getHeight() > 0 && p1.getWidth() > 0)){
          ViewGroup$LayoutParams layoutParams = this.b.C.getLayoutParams();
          layoutParams.width = (layoutParams.height * p1.getWidth()) / p1.getHeight();
          this.b.C.setLayoutParams(layoutParams);
       }
       return;
    }
}
