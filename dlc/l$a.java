package dlc.l$a;
import qvb.q;
import dlc.l;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import tkc.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Intent;
import android.net.Uri;
import qvb.a;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.TrendingInfo;
import qvb.n0;
import alc.a;
import k2b.u1;

public class l$a implements q	// class@002256
{
    public final l b;

    public void l$a(l p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       f a;
       f uof = f.class;
       l$a uoa = l$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       l ol = null;
       Uri data = (this.b.getActivity() != null && this.b.getActivity().getIntent() != null)? this.b.getActivity().getIntent().getData(): ol;
       if (!this.b.s.isEmpty()) {
          l$a tb = this.b;
          ol = tb.w;
          List items = tb.s.getItems();
          Objects.requireNonNull(ol);
          if (!PatchProxy.applyVoidOneRefs(items, ol, uof, "4")) {
             a.p(items, "trendingList");
             if (!items.isEmpty()) {
                ol.j2(items);
                ol.A2();
             }
          }
          this.b.s.f(this);
          this.b.P8();
       }else {
          l w = this.b.w;
          Objects.requireNonNull(w);
          if (!PatchProxy.applyVoid(ol, w, uof, "34") && (w.u.isEmpty() && w.s.isEmpty())) {
             uof = w.A;
             String str1 = "mCenterTrendingId";
             if (uof == null) {
                a.S(str1);
             }
             TrendingInfo trendingInfo = w.l2(uof);
             a = w.A;
             if (a == null) {
                a.S(str1);
             }
             w.C = a;
             w.u.add(trendingInfo);
             uof = w.s;
             a = w.A;
             if (a == null) {
                a.S(str1);
             }
             uof.add(a);
             w.a();
          }
       label_00c9 :
          String str = String.valueOf(data);
          if (!PatchProxy.applyVoidTwoRefs("TrendingListEmpty", str, ol, a.class, "28")) {
             u1.R("TrendingListEmpty", str, 14);
          }
       }
       this.b.R8();
       return;
    }
}
