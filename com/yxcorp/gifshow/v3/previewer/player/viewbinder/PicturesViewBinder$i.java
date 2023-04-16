package com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder$i;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.widget.ViewPagerRecyclerView;

public final class PicturesViewBinder$i implements Observer	// class@0015f5
{
    public final PicturesViewBinder b;

    public void PicturesViewBinder$i(PicturesViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PicturesViewBinder$i.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().w("PicturesViewBinder", "mCurrentPosition it:"+p0.get()+", mChangePositionFromView:"+this.b.x, objArray);
          PicturesViewBinder$i tb = this.b;
          if (tb.x == null) {
             tb.j.z(p0.get());
          }else {
             tb.x = false;
          }
          this.b.S(p0.get());
       }
       return;
    }
}
