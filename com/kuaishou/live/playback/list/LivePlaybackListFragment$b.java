package com.kuaishou.live.playback.list.LivePlaybackListFragment$b;
import androidx.recyclerview.widget.RecyclerView$n;
import com.kuaishou.live.playback.list.LivePlaybackListFragment;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.GridLayoutManager$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import rkd.b;

public class LivePlaybackListFragment$b extends RecyclerView$n	// class@000d23
{
    public int a;
    public final LivePlaybackListFragment b;

    public void LivePlaybackListFragment$b(LivePlaybackListFragment p0,int p1){
       this.b = p0;
       super();
       this.a = p1;
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       LivePlaybackListFragment$b ta;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, LivePlaybackListFragment$b.class, "1")) {
          return;
       }
       GridLayoutManager$LayoutParams layoutParams = p1.getLayoutParams();
       int i = layoutParams.a();
       int i1 = (layoutParams.getViewAdapterPosition() < this.b.Gh())? 1: 0;
       if (this.b.Hh()) {
          if (b.g()) {
             i = LivePlaybackListFragment.N;
             p0.left = i / 2;
             p0.right = i / 2;
          }else if(!i){
             p0.left = LivePlaybackListFragment.M;
             p0.right = LivePlaybackListFragment.N / 2;
          }else {
             p0.left = LivePlaybackListFragment.N / 2;
             p0.right = LivePlaybackListFragment.M;
          }
          p0.top = (i1)? LivePlaybackListFragment.O: LivePlaybackListFragment.N / 2;
          p0.bottom = LivePlaybackListFragment.N / 2;
       }else if(!i){
          ta = this.a;
          p0.left = ta * 3;
          p0.right = ta;
       }else {
          ta = this.a;
          p0.left = ta;
          p0.right = ta * 3;
       }
       ta = this.a;
       p0.top = ta;
       p0.bottom = ta;
       return;
    }
}
