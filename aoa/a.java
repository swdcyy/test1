package aoa.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.Result;
import java.util.List;
import aoa.a$a;
import kotlin.jvm.internal.a;
import qrd.l1;
import java.lang.Throwable;
import qrd.j0;
import cra.w;
import q87.c;
import java.util.Iterator;
import java.lang.CharSequence;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import aoa.a$b;
import java.lang.Integer;
import java.util.Objects;
import com.yxcorp.gifshow.growth.interest.widget.InterestHistoryTagView;
import android.widget.RelativeLayout;
import msd.p;
import android.view.ViewGroup;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import ag6.a;

public final class a extends RecyclerView$Adapter	// class@000296
{
    public List e;
    public p f;

    public void a(){
       super();
       this.e = new ArrayList();
    }
    public final int J0(String p0){
       l1 a;
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 != null) {
          int i = 0;
          int i1 = this.e.size();
          while (true) {
             if (i < i1) {
                if (a.g(this.e.get(i).b(), p0)) {
                   return i;
                }else {
                   i = i + 1;
                }
             }else {
                a = l1.a;
             }
          }
       }else {
          a = null;
       }
       a = Result.constructor-impl(a);
       Throwable throwable = Result.exceptionOrNull-impl(a);
       if (throwable != null) {
          w.C().e("interestEdit", "HistoryAdapter getPositionById", throwable);
       }
       return -1;
    }
    public final void K0(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "data");
       this.e.clear();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          a$a uoa = iterator.next();
          if (!TextUtils.isEmpty(uoa.c())) {
             this.e.add(uoa);
          }
       }
       this.k0();
       iterator = Result.constructor-impl(l1.a);
       Throwable throwable = Result.exceptionOrNull-impl(iterator);
       if (throwable != null) {
          w.C().e("interestEdit", "HistoryAdapter updateSource", throwable);
       }
       return;
    }
    public final void L0(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       int i = this.J0(p0.b());
       if (i > -1) {
          this.e.get(i).e(p0.a());
          this.l0(i);
       }
       p0 = Result.constructor-impl(l1.a);
       Throwable throwable = Result.exceptionOrNull-impl(p0);
       if (throwable != null) {
          w.C().e("interestEdit", "HistoryAdapter updateItem", throwable);
       }
       return;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.size();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       a$b a;
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "4")) {
          a.p(p0, "holder");
          a$a uoa1 = this.e.get(p1);
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(uoa1, p0, a$b.class, "1")) {
             a.p(uoa1, "item");
             a = p0.a;
             a.a(uoa1);
             a.setVisibility(0);
             a.setMStatusLambda(p0.b.f);
             boolean b = true;
             if (uoa1.d == b) {
                p0.a.setRightIconVisible(b);
             }
             p0 = Result.constructor-impl(l1.a);
             Throwable throwable = Result.exceptionOrNull-impl(p0);
             if (throwable != null) {
                w.C().e("interestEdit", "HistoryAdapter bindData", throwable);
             }
          }
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       a$b uob;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          uob = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "3");
          if (uob != PatchProxyResult.class) {
          label_0038 :
             return uob;
          }
       }
       a.p(p0, "parent");
       View view = a.c(LayoutInflater.from(p0.getContext()), R.layout.arg_RES_7f0d055f, p0, false);
       a.o(view, "view");
       uob = new a$b(this, view);
       goto label_0038 ;
    }
}
