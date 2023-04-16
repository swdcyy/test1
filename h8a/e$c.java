package h8a.e$c;
import erd.g;
import h8a.e;
import java.lang.Object;
import d0a.o;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.library.widget.imageview.scale.PhotosScaleHelpView;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import le5.f;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import v6a.f8;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import y8c.a;
import brd.y;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.widget.TextView;

public final class e$c implements g	// class@0025e7
{
    public final e b;

    public void e$c(e p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       e w;
       e w1;
       if (PatchProxy.applyVoidOneRefs(p0, this, e$c.class, "1")) {
       }else {
          a.p(p0, "event");
          e$c tb = this.b;
          if (tb.E != null) {
             View view = null;
             if (p0.a == null) {
                e.P8(tb).setVisibility(0);
                w = this.b.w;
                if (w != null) {
                   w.setVisibility(8);
                }
                tb = this.b;
                w1 = tb.w;
                if (w1 != null) {
                   w1.removeOnScrollListener(tb.F);
                }
                w = this.b.w;
                if (w != null) {
                   w.setEnabled(0);
                }
                e.S8(this.b).setSpecialView(view);
             }else if(tb.w == null){
                w1 = tb.s;
                if (w1 == null) {
                   a.S("mRecyclerViewStub");
                }
                tb.w = w1.b(0x7f0a2d47);
                w = this.b.q;
                if (w == null) {
                   a.S("mNasaBizParam");
                }
                NasaSlideParam nasaSlidePar = w.getNasaSlideParam();
                a.o(nasaSlidePar, "mNasaBizParam.nasaSlideParam");
                if (!nasaSlidePar.isHomePage() || !f.b()) {
                   w = this.b.w;
                   ViewGroup$LayoutParams layoutParams = (w != null)? w.getLayoutParams(): view;
                   Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                   layoutParams.bottomMargin = a1.d(0x7f070bf1);
                }
             }
             tb = this.b;
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoid(view, tb, e.class, "4") && tb.C == null) {
                e p = tb.p;
                if (p == null) {
                   a.S("mPhotoDetailParam");
                }
                e x = tb.x;
                if (x == null) {
                   a.S("mFragment");
                }
                tb.C = new f8(p, x, tb.B);
                w1 = tb.w;
                if (w1 != null) {
                   w1.setLayoutManager(new LinearLayoutManager(tb.getContext()));
                }
                w1 = tb.w;
                if (w1 != null) {
                   w1.setAdapter(tb.C);
                }
                w = tb.w;
                if (w != null) {
                   w.scrollToPosition(0);
                }
             }
          label_00f6 :
             e.S8(this.b).setSpecialView(this.b.w);
             w = this.b.w;
             if (w != null) {
                w.setVisibility(0);
             }
             w = this.b.w;
             if (w != null) {
                w.setEnabled(true);
             }
             e.P8(this.b).setVisibility(8);
             tb = this.b;
             w1 = tb.w;
             if (w1 != null) {
                w1.addOnScrollListener(tb.F);
             }
             if (p0.a == true) {
                e.R8(this.b).setVisibility(0);
             }else {
                e.R8(this.b).setVisibility(8);
             }
          }
       }
       return;
    }
}
