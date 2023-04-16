package dz8.h;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import dz8.h$a;
import nsd.u;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import z8c.e;
import androidx.recyclerview.widget.RecyclerView$n;
import dz8.f;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverData;
import java.util.List;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.view.View;
import ekd.m1;
import bz8.n;

public final class h extends PresenterV2	// class@00210e
{
    public PhotoAdvertisement$CoverData p;
    public RecyclerView q;
    public static final int r;
    public static final h$a s;

    static {
       h.s = new h$a(null);
       h.r = a1.e(8.00f);
    }
    public void h(){
       super();
    }
    public void E8(){
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, oh, "4")) {
          oh = this.q;
          if (oh == null) {
             a.S("mCoversRecyclerView");
          }
          h tq = this.q;
          if (tq == null) {
             a.S("mCoversRecyclerView");
          }
          int i = 0;
          oh.setLayoutManager(new LinearLayoutManager(tq.getContext(), i, i));
          e uoe = new e(i, h.r, i);
          h tq1 = this.q;
          if (tq1 == null) {
             a.S("mCoversRecyclerView");
          }
          tq1.addItemDecoration(uoe);
          tq1 = this.p;
          if (tq1 == null) {
             a.S("mCoversData");
          }
          PhotoAdvertisement$CoverData mCoverHeight = tq1.mCoverHeight;
          h tp = this.p;
          if (tp == null) {
             a.S("mCoversData");
          }
          f uof = new f(mCoverHeight, tp.mCoverWidth);
          tq1 = this.p;
          if (tq1 == null) {
             a.S("mCoversData");
          }
          uof.W0(tq1.mCoverItems);
          tq1 = this.q;
          if (tq1 == null) {
             a.S("mCoversRecyclerView");
          }
          tq1.setAdapter(uof);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "2")) {
          return;
       }
       p0 = m1.f(p0, R.id.rv_covers);
       a.o(p0, "ViewBindUtils.bindWidget\(rootView, R.id.rv_covers\)");
       this.q = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       Object obj = this.q8(n.class);
       a.o(obj, "inject\(HalfLandingItem::class.java\)");
       this.p = obj.a();
       return;
    }
}
