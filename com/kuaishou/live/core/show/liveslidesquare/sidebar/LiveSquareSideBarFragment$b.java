package com.kuaishou.live.core.show.liveslidesquare.sidebar.LiveSquareSideBarFragment$b;
import androidx.recyclerview.widget.RecyclerView$n;
import com.kuaishou.live.core.show.liveslidesquare.sidebar.LiveSquareSideBarFragment;
import lnc.a1;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import g9c.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.GridLayoutManager$LayoutParams;

public class LiveSquareSideBarFragment$b extends RecyclerView$n	// class@000c9f
{
    public int a;
    public final LiveSquareSideBarFragment b;

    public void LiveSquareSideBarFragment$b(LiveSquareSideBarFragment p0){
       this.b = p0;
       super();
       this.a = a1.e(4.00f);
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, LiveSquareSideBarFragment$b.class, "1")) {
          return;
       }
       if (this.b.ia().g1(p2.getChildAdapterPosition(p1))) {
          p0.left = 0;
          p0.right = 0;
          p0.top = 0;
          p0.bottom = 0;
       }else if(TextUtils.n(this.b.Gh(), "16")){
          p0.left = 0;
          p0.right = 0;
          p0.top = 0;
          p0.bottom = this.a;
       }else if(!p1.getLayoutParams().a()){
          p0.right = this.a / 2;
          p0.left = 0;
       }else {
          p0.right = 0;
          p0.left = this.a / 2;
       }
       p0.top = 0;
       p0.bottom = this.a;
       return;
    }
}
