package dlc.z0;
import java.lang.Runnable;
import dlc.a1;
import xkc.a;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im8.f;
import com.yxcorp.gifshow.entity.TrendingInfo;
import java.util.List;
import qvb.a;
import tkc.f;
import com.yxcorp.gifshow.entity.QPhoto;
import sy6.a;
import qvb.q;
import android.view.View;

public final class z0 implements Runnable	// class@00227f
{
    public final a1 b;
    public final a c;

    public void z0(a1 p0,a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       z0 tb = this.b;
       z0 tc = this.c;
       Objects.requireNonNull(tb);
       a a = tc.a;
       a b = tc.b;
       if (PatchProxy.applyVoidTwoRefs(a, b, tb, a1.class, "5")) {
       }else if(tb.v.get() != null && ((tb.v.get().getWrapperId()).equals(a.getWrapperId()) && (tb.v.get().mTrendingType != null && (tb.v.get().mTrendingType).equals(a.mTrendingType)))){
          if (tb.v.get() != null && (tb.v.get().mTrendingType != null && (a.mTrendingType == null || (!(tb.v.get().mTrendingType).equals(a.mTrendingType) || (tb.v.get() == null && b != null))))) {
             tb.s.j2(b.getItems());
          }
          tb.A = a;
          QPhoto currentPhoto = tb.q.getCurrentPhoto();
          a1 s = tb.s;
          String wrapperId = a.getWrapperId();
          String photoId = (currentPhoto != null)? currentPhoto.getPhotoId(): "";
          TrendingInfo mTrendingTyp = a.mTrendingType;
          a1 y = tb.y;
          Objects.requireNonNull(s);
          if (!PatchProxy.applyVoidFourRefs(wrapperId, photoId, mTrendingTyp, y, s, f.class, "3")) {
             s.u2(wrapperId, photoId, s.x, s.y, mTrendingTyp, y);
          }
          tb.s.h(tb);
          tb.r.setVisibility(0);
       }
       return;
    }
}
