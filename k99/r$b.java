package k99.r$b;
import uw9.y;
import k99.r;
import java.lang.Object;
import uw9.x;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import im8.f;
import java.lang.Number;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.entity.QPhoto;
import uw9.m3;
import lnc.a1;
import android.view.ViewGroup;
import com.yxcorp.utility.n;
import android.widget.FrameLayout;
import java.lang.Float;
import brd.y;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import android.widget.TextView;
import java.lang.Math;
import android.animation.Animator;
import ekd.f;
import java.lang.Runnable;
import ekd.k1;

public final class r$b implements y	// class@002b8f
{
    public final r a;

    public void r$b(r p0){
       this.a = p0;
       super();
    }
    public void a(){
       x.a(this);
    }
    public void e(RecyclerView p0,int p1,int p2){
       r c;
       r y;
       r or = r.class;
       if (PatchProxy.isSupport(r$b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, r$b.class, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       if (r.R8(this.a).getSource() == 288 || (r.R8(this.a).getSource() == 8 && NasaExperimentUtils.A())) {
          r.P8(this.a).set(r.P8(this.a).get());
       }else {
          r.P8(this.a).set(Integer.valueOf((r.P8(this.a).get().intValue() + p2)));
       }
       r$b ta = this.a;
       RecyclerView$ViewHolder obj = r.P8(ta).get();
       a.o(obj, "mAtlasScrollRef.get\(\)");
       obj = obj.intValue();
       Objects.requireNonNull(ta);
       int i = 0;
       if (!PatchProxy.isSupport(or) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(obj), ta, or, "1")) {
          Activity activity = ta.getActivity();
          c = ta.z;
          if (c == null) {
             a.S("mPhoto");
          }
          int i1 = m3.f(activity, c) + a1.d(0x7f07034b);
          c = ta.y;
          if (c == null) {
             a.S("mPhotosPagerView");
          }
          Activity activity1 = ta.getActivity();
          a.m(activity1);
          float f1 = (float)(((i1 + c.getHeight()) - (n.j(activity1) - ta.H)) - obj);
          String str1 = "mContainer";
          if (f1 - (float)i > 0) {
             r b = ta.B;
             if (b == null) {
                a.S(str1);
             }
             b.setTranslationY((- f1));
          }else {
             y = ta.B;
             if (y == null) {
                a.S(str1);
             }
             y.setTranslationY(0);
          }
          y = ta.L;
          if (y != null) {
             r b1 = ta.B;
             if (b1 == null) {
                a.S(str1);
             }
             y.onNext(Float.valueOf(b1.getY()));
          }
       }
       ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, or, "2")) {
          obj = p0.findViewHolderForAdapterPosition(i);
          if (obj != null) {
             RecyclerView$ViewHolder itemView = obj.itemView;
             String str = "viewHolder.itemView";
             a.o(itemView, str);
             RecyclerView$ViewHolder itemView1 = obj.itemView;
             a.o(itemView1, str);
             float f = itemView.getY() + (float)itemView1.getHeight();
             c = ta.C;
             if (c == null) {
                a.S("mTextIndicator");
             }
             obj = obj.itemView;
             a.o(obj, str);
             c.setTranslationY((- obj.getY()));
             int height = p0.getHeight();
             y = ta.y;
             if (y == null) {
                a.S("mPhotosPagerView");
             }
             if (f - ((float)(Math.min(height, y.getHeight()) * 1) / 2.00f) >= 0) {
                i = true;
             }
             ta.K = i;
             if (!i) {
                r c1 = ta.C;
                if (c1 == null) {
                   a.S("mTextIndicator");
                }
                if (!c1.getVisibility()) {
                   ta.X8();
                   f.a(ta.v);
                   k1.m(ta.N);
                }
             }
          }
       }
       return;
    }
}
