package c6b.b;
import com.google.android.material.bottomsheet.BottomSheetBehavior$c;
import com.yxcorp.gifshow.map.map.bottomFeed.presenter.MapBottomFeedPresenter;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import android.widget.LinearLayout;
import js6.a;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class b extends BottomSheetBehavior$c	// class@0004c2
{
    public final MapBottomFeedPresenter a;

    public void b(MapBottomFeedPresenter p0){
       this.a = p0;
       super();
    }
    public void a(View p0,float p1){
       if (PatchProxy.isSupport2(b.class, "2") && PatchProxy.applyVoidTwoRefsWithListener(p0, Float.valueOf(p1), this, b.class, "2")) {
          return;
       }
       a.p(p0, "bottomSheetView");
       PatchProxy.onMethodExit(b.class, "2");
       return;
    }
    public void b(View p0,int p1){
       if (PatchProxy.isSupport2(b.class, "1") && PatchProxy.applyVoidTwoRefsWithListener(p0, Integer.valueOf(p1), this, b.class, "1")) {
          return;
       }
       a.p(p0, "bottomSheet");
       int i = 0;
       if (p1 != 3) {
          int i1 = 8;
          if (p1 != 4) {
             MapBottomFeedPresenter.P8(this.a).setVisibility(i1);
          }else {
             MapBottomFeedPresenter.P8(this.a).setVisibility(i1);
             a.b.pt(this.a.getContext(), "BOTTOM_STATE", Integer.valueOf(i));
          }
       }else {
          MapBottomFeedPresenter.P8(this.a).setVisibility(i);
          a.b.pt(this.a.getContext(), "BOTTOM_STATE", Integer.valueOf(1));
       }
       PatchProxy.onMethodExit(b.class, "1");
       return;
    }
}
