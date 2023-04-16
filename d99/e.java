package d99.e;
import android.view.ViewTreeObserver$OnPreDrawListener;
import d99.h;
import android.view.View;
import com.kwai.feature.api.feed.detail.router.biz.normal.ReplaceFragmentParam;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.view.ViewTreeObserver;
import java.util.Objects;
import com.kwai.feature.api.feed.detail.router.biz.normal.ReplaceFragmentAnimationParam;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.entity.QPhoto;
import uw9.b0;
import uw9.m3;
import java.lang.Number;
import ekd.i;
import lnc.b5;
import android.content.Context;
import com.yxcorp.utility.n;
import y89.h;
import com.yxcorp.gifshow.detail.nonslide.NonSlidePhotoConfig;
import im8.f;
import java.lang.Integer;
import android.view.ViewGroup;
import d99.g;
import d99.c;
import d99.h$c;

public class e implements ViewTreeObserver$OnPreDrawListener	// class@00209b
{
    public final View b;
    public final ReplaceFragmentParam c;
    public final RecyclerView d;
    public final h e;

    public void e(h p0,View p1,ReplaceFragmentParam p2,RecyclerView p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public boolean onPreDraw(){
       h obj1;
       int i1;
       h e;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       e obj = PatchProxy.apply(objArray, this, e.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       this.b.getViewTreeObserver().removeOnPreDrawListener(this);
       obj = this.e;
       ReplaceFragmentParam mReplaceFrag = this.c.mReplaceFragmentAnimationParam;
       e td = this.d;
       Objects.requireNonNull(obj);
       if (!PatchProxy.applyVoidTwoRefs(mReplaceFrag, td, obj, h.class, "5")) {
          ReplaceFragmentAnimationParam mPhotoBottom = mReplaceFrag.mPhotoBottomInScreen;
          int i = b0.a(obj.v, obj.getActivity());
          if (i <= 0) {
             Activity activity = obj.getActivity();
             obj1 = PatchProxy.applyTwoRefs(activity, obj.v, objArray, m3.class, "11");
             if (obj1 != patchProxyRe) {
                i = obj1.intValue();
             }else if(!i.c() || b5.a(activity)){
                i = n.A(activity);
             }else {
                i = 0;
             }
          }
          obj1 = obj.x;
          Objects.requireNonNull(obj1);
          Object obj2 = PatchProxy.apply(objArray, obj1, h.class, "3");
          if (obj2 != patchProxyRe) {
             i1 = obj2.intValue();
          }else {
             e = obj1.e;
             i1 = (e != null)? e.getHeight(): 0;
          }
          i = i + i1;
          boolean b = obj.s.a();
          int i2 = i - mPhotoBottom;
          if (i2) {
             ViewTreeObserver viewTreeObse = (b && (i > mPhotoBottom && i2 <= (i1 - obj.t.get().intValue())))? 1: null;
             if (viewTreeObse) {
                td.getViewTreeObserver().addOnPreDrawListener(new g(obj, td, i2, mReplaceFrag));
             }else if(mReplaceFrag.mEnableShrinkUnchanged == null){
                td.setTranslationY((float)(- i2));
                obj.S8(true);
                obj.P8(i2, new c(obj, td));
             }
          }
       }
    label_00d3 :
       return false;
    }
}
