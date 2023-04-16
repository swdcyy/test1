package com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder$o;
import com.yxcorp.gifshow.widget.ViewPagerRecyclerView$b;
import com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.v3.previewer.player.viewmodel.PicturesViewModel;
import di0.b;

public final class PicturesViewBinder$o implements ViewPagerRecyclerView$b	// class@0015fc
{
    public int a;
    public final PicturesViewBinder b;

    public void PicturesViewBinder$o(PicturesViewBinder p0){
       this.b = p0;
       super();
    }
    public void a(int p0){
       PicturesViewBinder$o oo = PicturesViewBinder$o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oo, "1")) {
          return;
       }
       boolean b = true;
       if (this.b.G() || this.b.M()) {
          oo = this.b;
          oo.x = b;
          oo.J.n(p0);
       }
       int i = this.b.J.v0().v();
       if (!p0) {
          this.b.P(b);
       }else if(p0 == (i - b)){
          this.b.P((p0 - 1));
       }else if((p0 - this.a) > 0){
          this.b.P((p0 + 1));
          this.b.P((p0 - 1));
       }else {
          this.b.P((p0 - 1));
          this.b.P((p0 + 1));
       }
       this.a = p0;
       return;
    }
}
