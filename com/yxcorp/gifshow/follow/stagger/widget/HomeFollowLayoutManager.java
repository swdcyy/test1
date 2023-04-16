package com.yxcorp.gifshow.follow.stagger.widget.HomeFollowLayoutManager;
import androidx.recyclerview.widget.DecoSafeStaggeredLayoutManager;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.yxcorp.gifshow.follow.stagger.widget.HomeFollowLayoutManager$a;

public class HomeFollowLayoutManager extends DecoSafeStaggeredLayoutManager	// class@001251
{
    public HomeFollowLayoutManager$a d;

    public void HomeFollowLayoutManager(int p0,int p1){
       super(p0, p1);
    }
    public void onLayoutCompleted(RecyclerView$y p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeFollowLayoutManager.class, "1")) {
          return;
       }
       super.onLayoutCompleted(p0);
       HomeFollowLayoutManager td = this.d;
       if (td != null) {
          td.a(p0);
       }
       return;
    }
}
