package com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder$j;
import erd.g;
import com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.previewer.player.viewmodel.PicturesViewModel;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import qwc.h;

public final class PicturesViewBinder$j implements g	// class@0015f6
{
    public final PicturesViewBinder b;

    public void PicturesViewBinder$j(PicturesViewBinder p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PicturesViewBinder$j.class, "1")) {
       }else {
          p0 = this.b;
          p0 = p0.j.findViewHolderForLayoutPosition(p0.J.q0());
          if (!p0 instanceof h) {
             p0 = null;
          }
          if (p0 != null) {
             p0.p();
          }
       }
       return;
    }
}
