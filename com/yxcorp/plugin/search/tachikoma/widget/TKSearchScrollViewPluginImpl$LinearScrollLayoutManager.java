package com.yxcorp.plugin.search.tachikoma.widget.TKSearchScrollViewPluginImpl$LinearScrollLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.yxcorp.plugin.search.tachikoma.widget.TKSearchScrollViewPluginImpl;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.plugin.search.tachikoma.widget.TKSearchScrollViewPluginImpl$d;
import androidx.recyclerview.widget.RecyclerView$x;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;

public class TKSearchScrollViewPluginImpl$LinearScrollLayoutManager extends LinearLayoutManager	// class@000772
{
    public Context r;
    public final TKSearchScrollViewPluginImpl s;

    public void TKSearchScrollViewPluginImpl$LinearScrollLayoutManager(TKSearchScrollViewPluginImpl p0,Context p1){
       this.s = p0;
       super(p1);
       this.r = p1;
    }
    public void smoothScrollToPosition(RecyclerView p0,RecyclerView$y p1,int p2){
       if (PatchProxy.isSupport(TKSearchScrollViewPluginImpl$LinearScrollLayoutManager.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, TKSearchScrollViewPluginImpl$LinearScrollLayoutManager.class, "1")) {
          return;
       }
       TKSearchScrollViewPluginImpl$d uod = new TKSearchScrollViewPluginImpl$d(this.s, this.r);
       uod.p(p2);
       this.startSmoothScroll(uod);
       return;
    }
}
