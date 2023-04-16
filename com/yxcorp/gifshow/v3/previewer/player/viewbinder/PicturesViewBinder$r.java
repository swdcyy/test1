package com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder$r;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.ViewPagerRecyclerView;
import com.yxcorp.gifshow.widget.RecyclerViewCirclePagerIndicator;

public final class PicturesViewBinder$r implements Runnable	// class@0015ff
{
    public final PicturesViewBinder b;

    public void PicturesViewBinder$r(PicturesViewBinder p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, PicturesViewBinder$r.class, "1")) {
          return;
       }
       PicturesViewBinder$r tb = this.b;
       tb.l.setRecyclerView(tb.j);
       return;
    }
}
