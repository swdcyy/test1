package fva.j;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.ViewParent;
import android.view.ViewGroup;
import java.util.Objects;
import com.yxcorp.gifshow.hot.spot.view.HotSpotLoadingView;
import android.content.Context;
import android.view.View;
import com.kwai.written.view.IWrittenLayout;
import android.view.ViewGroup$LayoutParams;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class j extends g	// class@002a0c
{

    public void j(){
       super();
    }
    public void V8(){
       View view;
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       g tp = this.p;
       a.o(tp, "mRefreshLayout");
       ViewParent parent = tp.getParent();
       Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
       if (this.u == null) {
          Context context = parent.getContext();
          a.o(context, "frameLayout.context");
          view = new HotSpotLoadingView(context).l1();
          this.u = view;
          parent.addView(view, new ViewGroup$LayoutParams(-1, -1));
          view = new View(this.getContext());
          this.v = view;
          view.setBackgroundResource(R.drawable.arg_RES_7f0823bc);
          parent.addView(this.v, new ViewGroup$LayoutParams(-1, -1));
          tp = this.u;
          a.o(tp, "mEmptyPlaceHolder");
          tp.setPadding(tp.getPaddingLeft(), this.x, tp.getPaddingRight(), tp.getPaddingBottom());
       }
       return;
    }
}
