package com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder$m;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.ViewPagerRecyclerView;
import com.yxcorp.gifshow.widget.RecyclerViewCirclePagerIndicator;

public final class PicturesViewBinder$m implements Runnable	// class@0015f9
{
    public final PicturesViewBinder b;
    public final int c;

    public void PicturesViewBinder$m(PicturesViewBinder p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, PicturesViewBinder$m.class, "1")) {
          return;
       }
       PicturesViewBinder$m tb = this.b;
       PicturesViewBinder$m tc = this.c;
       if (tc < null) {
          tc = 0;
       }
       tb.S(tc);
       tb = this.b;
       tb.l.setRecyclerView(tb.j);
       return;
    }
}
