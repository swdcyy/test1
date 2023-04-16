package com.yxcorp.gifshow.detail.slideplay.presenter.b$a;
import d6a.a;
import com.yxcorp.gifshow.detail.slideplay.presenter.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import androidx.viewpager.widget.ViewPager$i;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import mn6.a;
import uw9.o;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.entity.QPhoto;
import q87.c;
import android.view.View;
import uw9.u3;
import java.lang.Boolean;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import com.kwai.library.groot.framework.viewpager.GrootViewPager;

public class b$a extends a	// class@00183c
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "2")) {
          return;
       }
       b g = this.b.G;
       if (g != null) {
          g.dispose();
          this.b.G = null;
       }
       b$a tb = this.b;
       b c = tb.C;
       if (c != null) {
          c.g(tb.M);
       }
       g = this.b.E;
       if (g != null) {
          g.g();
          this.b.I = false;
          Object[] objArray = new Object[false];
          o.C().w("SlidePlayInteractStickerStickerPresenter", "移除投票贴纸"+this.b.x.getPhotoId(), objArray);
       }
       g = this.b.r;
       if (g != null) {
          g.setVisibility(4);
       }
       this.b.E = null;
       return;
    }
    public void i2(){
       Object[] objArray;
       if (PatchProxy.applyVoid(null, this, b$a.class, "1")) {
          return;
       }
       b$a tb = this.b;
       boolean b = false;
       tb.I = b;
       String str = "SLIDE_INSIDE_FIRST_PHOTO";
       if (tb.F.a(str) == null) {
          objArray = new Object[b];
          o.C().w("SlidePlayInteractStickerStickerPresenter", "首次addInteractStickerView"+this.b.x.getPhotoId(), objArray);
          this.b.P8();
          this.b.F.b(str, Boolean.TRUE);
       }else {
          tb = this.b;
          b c = tb.C;
          if (c != null) {
             c.i(tb.M);
             if (this.b.C.s2() instanceof GrootViewPager && !this.b.C.s2().g0()) {
                objArray = new Object[b];
                o.C().w("SlidePlayInteractStickerStickerPresenter", "非滑动attach addInteractStickerView"+this.b.x.getPhotoId(), objArray);
                this.b.P8();
             }
          }
       }
       return;
    }
}
