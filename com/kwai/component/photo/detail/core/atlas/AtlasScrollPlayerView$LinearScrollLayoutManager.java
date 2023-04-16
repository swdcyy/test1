package com.kwai.component.photo.detail.core.atlas.AtlasScrollPlayerView$LinearScrollLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.kwai.component.photo.detail.core.atlas.AtlasScrollPlayerView;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.component.photo.detail.core.atlas.AtlasScrollPlayerView$b;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$x;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;

public class AtlasScrollPlayerView$LinearScrollLayoutManager extends LinearLayoutManager	// class@000a0f
{
    public final AtlasScrollPlayerView r;

    public void AtlasScrollPlayerView$LinearScrollLayoutManager(AtlasScrollPlayerView p0,Context p1){
       this.r = p0;
       super(p1);
    }
    public void smoothScrollToPosition(RecyclerView p0,RecyclerView$y p1,int p2){
       if (PatchProxy.isSupport(AtlasScrollPlayerView$LinearScrollLayoutManager.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, AtlasScrollPlayerView$LinearScrollLayoutManager.class, "1")) {
          return;
       }
       AtlasScrollPlayerView$b uob = new AtlasScrollPlayerView$b(this.r, p0.getContext());
       uob.p(p2);
       this.startSmoothScroll(uob);
       return;
    }
}
