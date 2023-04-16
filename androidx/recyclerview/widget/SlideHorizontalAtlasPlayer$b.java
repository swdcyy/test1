package androidx.recyclerview.widget.SlideHorizontalAtlasPlayer$b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer$b$b;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer$c;
import id5.v;
import java.lang.StringBuilder;
import q87.c;
import ud5.e;
import java.util.List;
import java.util.Collection;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import android.content.Context;
import com.yxcorp.utility.n;
import android.widget.ImageView$ScaleType;
import android.widget.ImageView;
import com.kwai.component.photo.detail.core.atlas.a;
import s0d.f;
import s0d.a;
import s0d.e;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer$b$c;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View;
import android.view.View$OnLayoutChangeListener;
import crd.b;
import lnc.b9;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import android.widget.FrameLayout$LayoutParams;
import rkd.b;
import java.lang.Float;
import java.lang.Integer;
import id5.t;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import xb.t$b;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer$b$a;
import ub.b;
import com.facebook.imagepipeline.request.ImageRequest;
import pb.d;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import ac.a;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer$b$d;
import erd.r;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer$b$e;
import erd.g;
import com.kwai.component.photo.detail.core.atlas.SlideAtlasItemView;
import java.lang.Class;

public final class SlideHorizontalAtlasPlayer$b extends PresenterV2	// class@0008b5
{
    public SlideHorizontalAtlasPlayer$c p;
    public v1 q;
    public KwaiImageView r;
    public KwaiLoadingView s;
    public b t;
    public View$OnLayoutChangeListener u;
    public final ViewGroup v;
    public final SlideHorizontalAtlasPlayer w;

    public void SlideHorizontalAtlasPlayer$b(SlideHorizontalAtlasPlayer p0,ViewGroup p1){
       a.p(p1, "parent");
       this.w = p0;
       super();
       this.v = p1;
       this.u = new SlideHorizontalAtlasPlayer$b$b(this);
    }
    public static final KwaiImageView P8(SlideHorizontalAtlasPlayer$b p0){
       p0 = p0.r;
       if (p0 == null) {
          a.S("mImageView");
       }
       return p0;
    }
    public static final KwaiLoadingView R8(SlideHorizontalAtlasPlayer$b p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("mLoadingView");
       }
       return p0;
    }
    public static final SlideHorizontalAtlasPlayer$c S8(SlideHorizontalAtlasPlayer$b p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mModel");
       }
       return p0;
    }
    public void E8(){
       v ov = v.C();
       StringBuilder str = "onBind: ";
       SlideHorizontalAtlasPlayer$b tp = this.p;
       String str1 = "mModel";
       if (tp == null) {
          a.S(str1);
       }
       int i = 0;
       Object[] objArray = new Object[i];
       ov.w("SlideAtlasRecyclerView", str+tp.c(), objArray);
       SlideHorizontalAtlasPlayer$b tw = this.w;
       int b = true;
       if (tw.v != null) {
          SlideHorizontalAtlasPlayer x = tw.x;
          if (x != null) {
             x.d(b);
          }
       }else {
          this.Z8();
       }
       tw = this.p;
       if (tw == null) {
          a.S(str1);
       }
       tw.g(i);
       tw = this.p;
       if (tw == null) {
          a.S(str1);
       }
       tw.f(i);
       tw = this.p;
       if (tw == null) {
          a.S(str1);
       }
       List list = tw.b();
       str = "mImageView";
       if (list != null && (list.isEmpty() ^ b) == b) {
          tw = this.p;
          if (tw == null) {
             a.S(str1);
          }
          b = n.y(this.getContext());
          float f = (float)b;
          int i1 = (int)(f / this.W8(tw.a()));
          if ((f / this.X8()) - (float)n.w(this.getContext()) > 0) {
             SlideHorizontalAtlasPlayer$b tr = this.r;
             if (tr == null) {
                a.S(str);
             }
             tr.setScaleType(ImageView$ScaleType.CENTER_CROP);
          }
          this.q = new a();
          f uof = f.x();
          SlideHorizontalAtlasPlayer$b tp1 = this.p;
          if (tp1 == null) {
             a.S(str1);
          }
          e[] uoeArray = uof.q(tp1.b()).o(b, i1).w();
          a.o(uoeArray, "KwaiImageRequestGroupBui¡­         .buildRequests\(\)");
          this.Y8(uoeArray);
       }
       tw = this.r;
       if (tw == null) {
          a.S(str);
       }
       ViewTreeObserver viewTreeObse = tw.getViewTreeObserver();
       if (viewTreeObse != null) {
          viewTreeObse.addOnGlobalLayoutListener(new SlideHorizontalAtlasPlayer$b$c(this));
       }
       this.m8().addOnLayoutChangeListener(this.u);
       ov = v.C();
       str = "bind adjustCoverSize: ";
       SlideHorizontalAtlasPlayer$b tp2 = this.p;
       if (tp2 == null) {
          a.S(str1);
       }
       Object[] objArray1 = new Object[i];
       ov.w("SlideAtlasRecyclerView", str+tp2.c(), objArray1);
       this.V8(this.v);
       return;
    }
    public void J8(){
       v ov = v.C();
       StringBuilder str = "onUnbind: ";
       SlideHorizontalAtlasPlayer$b tp = this.p;
       if (tp == null) {
          a.S("mModel");
       }
       Object[] objArray = new Object[0];
       ov.w("SlideAtlasRecyclerView", str+tp.c(), objArray);
       this.m8().removeOnLayoutChangeListener(this.u);
       SlideHorizontalAtlasPlayer$b tt = this.t;
       if (tt != null) {
          b9.a(tt);
       }
       return;
    }
    public final void V8(View p0){
       SlideHorizontalAtlasPlayer$b r1;
       Object[] objArray;
       int[] ointArray;
       View view;
       SlideHorizontalAtlasPlayer$b p1;
       ImageMeta$AtlasCoverSize uAtlasCoverS;
       Integer[] integerArray;
       Object[] objArray2;
       SlideHorizontalAtlasPlayer$b uob = this;
       int measuredWidt = p0.getMeasuredWidth();
       int measuredHeig = p0.getMeasuredHeight();
       float f = this.X8();
       SlideHorizontalAtlasPlayer$b r = uob.r;
       String str = "mImageView";
       if (r == null) {
          a.S(str);
       }
       ViewGroup$LayoutParams layoutParams = r.getLayoutParams();
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
       if (uob.w.E()) {
          layoutParams.width = measuredWidt;
          layoutParams.height = (int)((float)measuredWidt / f);
          r1 = uob.r;
          if (r1 == null) {
             a.S(str);
          }
          r1.setLayoutParams(layoutParams);
          return;
       }else {
          int i = 2;
          if (b.g()) {
             SlideHorizontalAtlasPlayer$b p = uob.p;
             if (p == null) {
                a.S("mModel");
             }
             if (p.a() != null) {
                objArray = new Object[0];
                v.C().w("SlideAtlasRecyclerView", "adjustCoverSize by pad", objArray);
                ointArray = new int[i];
                view = this.m8();
                a.o(view, "rootView");
                ointArray[0] = view.getMeasuredWidth();
                view = this.m8();
                a.o(view, "rootView");
                ointArray[1] = view.getMeasuredHeight();
                p1 = uob.p;
                if (p1 == null) {
                   a.S("mModel");
                }
                uAtlasCoverS = p1.a();
                a.m(uAtlasCoverS);
                int[] ointArray1 = new int[i];
                ointArray1[0] = (int)uAtlasCoverS.mWidth;
                ointArray1[1] = (int)uAtlasCoverS.mHeight;
                integerArray = b.a(ointArray1, 0, null, ointArray, 6, null);
                layoutParams.width = integerArray[0].intValue();
                layoutParams.height = integerArray[1].intValue();
             }else {
             label_00b7 :
                p = uob.p;
                if (p == null) {
                   a.S("mModel");
                }
                ImageMeta$AtlasCoverSize uAtlasCoverS1 = p.a();
                View view1 = null;
                uAtlasCoverS1 = (uAtlasCoverS1 != null)? uAtlasCoverS1.mHeight: 0;
                if (uAtlasCoverS1 - view1 > 0) {
                   p = uob.p;
                   if (p == null) {
                      a.S("mModel");
                   }
                   uAtlasCoverS1 = p.a();
                   uAtlasCoverS1 = (uAtlasCoverS1 != null)? uAtlasCoverS1.mWidth: 0;
                   if (uAtlasCoverS1 - view1 > 0) {
                      View view2 = this.m8();
                      a.o(view2, "rootView");
                      if (view2.getMeasuredWidth() > 0) {
                         view2 = this.m8();
                         a.o(view2, "rootView");
                         if (view2.getMeasuredHeight() > 0) {
                            view2 = this.m8();
                            a.o(view2, "rootView");
                            view1 = this.m8();
                            a.o(view1, "rootView");
                            if (t.b(view2.getMeasuredWidth(), view1.getMeasuredHeight())) {
                               p = uob.p;
                               if (p == null) {
                                  a.S("mModel");
                               }
                               if (p.a() != null) {
                                  objArray = new Object[0];
                                  v.C().w("SlideAtlasRecyclerView", "adjustCoverSize by fold", objArray);
                                  ointArray = new int[i];
                                  view = this.m8();
                                  a.o(view, "rootView");
                                  ointArray[0] = view.getMeasuredWidth();
                                  view = this.m8();
                                  a.o(view, "rootView");
                                  ointArray[1] = view.getMeasuredHeight();
                                  p1 = uob.p;
                                  if (p1 == null) {
                                     a.S("mModel");
                                  }
                                  uAtlasCoverS = p1.a();
                                  a.m(uAtlasCoverS);
                                  int[] ointArray2 = new int[i];
                                  ointArray2[0] = (int)uAtlasCoverS.mWidth;
                                  ointArray2[1] = (int)uAtlasCoverS.mHeight;
                                  integerArray = t.a.a(ointArray2, ointArray);
                                  layoutParams.width = integerArray[0].intValue();
                                  layoutParams.height = integerArray[1].intValue();
                               }
                            }
                         }
                      }
                   }
                }
             label_017d :
                if (f - 0x3fe38e39 > 0) {
                   objArray2 = new Object[0];
                   v.C().w("SlideAtlasRecyclerView", "adjustCoverSize by size16/9", objArray2);
                   measuredWidt = (int)(((float)measuredWidt / 16.00f) * 9.00f);
                   layoutParams.height = measuredWidt;
                   layoutParams.width = (int)((float)measuredWidt * f);
                }else if(f - 0x3f13386f < 0){
                   layoutParams.height = measuredHeig;
                   layoutParams.width = measuredWidt;
                   r1 = uob.r;
                   if (r1 == null) {
                      a.S(str);
                   }
                   a hierarchy = r1.getHierarchy();
                   a.o(hierarchy, "mImageView.hierarchy");
                   hierarchy.u(t$b.i);
                   objArray = new Object[0];
                   v.C().w("SlideAtlasRecyclerView", "adjustCoverSize by \(ratio < 9 / 15.65f\)", objArray);
                }else {
                   objArray2 = new Object[0];
                   v.C().w("SlideAtlasRecyclerView", "adjustCoverSize by default", objArray2);
                   layoutParams.width = measuredWidt;
                   layoutParams.height = (int)((float)measuredWidt / f);
                }
             }
          }else {
             goto label_00b7 ;
          }
          r1 = uob.r;
          if (r1 == null) {
             a.S(str);
          }
          r1.setLayoutParams(layoutParams);
          v ov = v.C();
          StringBuilder str1 = "adjustCoverSize: ";
          SlideHorizontalAtlasPlayer$b p2 = uob.p;
          if (p2 == null) {
             a.S("mModel");
          }
          Object[] objArray1 = new Object[0];
          ov.w("SlideAtlasRecyclerView", str1+p2.c()+' '+layoutParams.width+' '+layoutParams.height, objArray1);
          return;
       }
    }
    public final float W8(ImageMeta$AtlasCoverSize p0){
       float f = 0x3f800000;
       if (p0 != null) {
          ImageMeta$AtlasCoverSize mHeight = p0.mHeight;
          float f1 = (mHeight)? p0.mWidth / mHeight: 0x3f800000;
          if (f1) {
             f = f1;
          }
       }
       return f;
    }
    public final float X8(){
       SlideHorizontalAtlasPlayer$b tp = this.p;
       if (tp == null) {
          a.S("mModel");
       }
       List list = tp.b();
       if (list != null && !(list.isEmpty() ^ 0x01)) {
          return 0x3f800000;
       }else {
          tp = this.p;
          if (tp == null) {
             a.S("mModel");
          }
          return this.W8(tp.a());
       }
    }
    public final void Y8(e[] p0){
       SlideHorizontalAtlasPlayer$b tr = this.r;
       String str = "mImageView";
       if (tr == null) {
          a.S(str);
       }
       SlideHorizontalAtlasPlayer$b tr1 = this.r;
       if (tr1 == null) {
          a.S(str);
       }
       AbstractDraweeController uAbstractDra = null;
       d uod = tr1.g0(new SlideHorizontalAtlasPlayer$b$a(this), uAbstractDra, p0);
       if (uod != null) {
          uAbstractDra = uod.e();
       }
       tr.setController(uAbstractDra);
       return;
    }
    public final void Z8(){
       this.t = t.timer(800, TimeUnit.MILLISECONDS).observeOn(d.a).takeWhile(new SlideHorizontalAtlasPlayer$b$d(this)).subscribe(new SlideHorizontalAtlasPlayer$b$e(this));
    }
    public void doBindView(View p0){
       if (p0 instanceof SlideAtlasItemView) {
          this.r = p0.getImageView();
          this.s = p0.getLoadingView();
       }
       return;
    }
    public void j8(){
       Object obj = this.q8(SlideHorizontalAtlasPlayer$c.class);
       a.o(obj, "inject\(Model::class.java\)");
       this.p = obj;
    }
}
