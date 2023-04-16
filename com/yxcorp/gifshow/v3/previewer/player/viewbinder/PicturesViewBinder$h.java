package com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder$h;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.widget.ViewPagerRecyclerView;

public final class PicturesViewBinder$h implements Observer	// class@0015f4
{
    public final PicturesViewBinder b;

    public void PicturesViewBinder$h(PicturesViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PicturesViewBinder$h.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.j.setEnableTouch(p0.booleanValue());
       }
       return;
    }
}
