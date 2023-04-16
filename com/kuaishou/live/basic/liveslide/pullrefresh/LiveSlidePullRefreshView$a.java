package com.kuaishou.live.basic.liveslide.pullrefresh.LiveSlidePullRefreshView$a;
import com.kwai.library.widget.refresh.RefreshLayout$h;
import com.kuaishou.live.basic.liveslide.pullrefresh.LiveSlidePullRefreshView;
import java.lang.Object;
import o17.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;

public class LiveSlidePullRefreshView$a implements RefreshLayout$h	// class@000cd4
{
    public final LiveSlidePullRefreshView a;

    public void LiveSlidePullRefreshView$a(LiveSlidePullRefreshView p0){
       this.a = p0;
       super();
    }
    public void a(float p0,float p1,boolean p2){
       i.a(this, p0, p1, p2);
    }
    public void b(){
       i.d(this);
    }
    public void pullToRefresh(){
       i.b(this);
    }
    public void refreshComplete(){
       if (PatchProxy.applyVoid(null, this, LiveSlidePullRefreshView$a.class, "1")) {
          return;
       }
       this.a.setVisibility(0);
       return;
    }
    public void releaseToRefresh(){
       i.e(this);
    }
}
