package uua.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.hot.spot.data.HotSpotFeedPageList;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import uua.a$a;
import qvb.q;
import qvb.a;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import uua.a$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.hot.spot.adapter.BaseViewHolder;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import com.kwai.written.view.IWrittenLayout;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import kotlin.collections.CollectionsKt__CollectionsKt;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams;
import java.util.Collection;
import java.lang.Integer;
import java.lang.Number;
import nsd.q0;
import android.view.ViewGroup;

public abstract class a extends RecyclerView$Adapter	// class@0044a1
{
    public final ArrayList e;

    public void a(HotSpotFeedPageList p0){
       a.p(p0, "cardPageList");
       super();
       this.e = new ArrayList();
       p0.h(new a$a(this));
    }
    public void B0(RecyclerView$ViewHolder p0){
       this.P0(p0);
    }
    public void E0(RecyclerView$ViewHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
       }else {
          a.p(p0, "holder");
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, BaseViewHolder.class, "3")) {
             p0.a().unbind();
          }
       }
       return;
    }
    public Object[] J0(){
       return null;
    }
    public abstract IWrittenLayout K0(Context p0);
    public final ArrayList L0(){
       return this.e;
    }
    public abstract int M0();
    public List N0(){
       Object obj = PatchProxy.apply(null, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CollectionsKt__CollectionsKt.E();
    }
    public void O0(IWrittenLayout p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "9")) {
          return;
       }
       a.p(p0, "binding");
       a.p(p1, "item");
       return;
    }
    public void P0(a$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "holder");
       RecyclerView$ViewHolder itemView = p0.itemView;
       a.o(itemView, "holder.itemView");
       ViewGroup$LayoutParams layoutParams = itemView.getLayoutParams();
       if (layoutParams != null && layoutParams instanceof StaggeredGridLayoutManager$LayoutParams) {
          layoutParams.c(true);
       }
       return;
    }
    public final void Q0(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "6")) {
          return;
       }
       a.p(p0, "list");
       this.e.clear();
       this.e.addAll(p0);
       this.k0();
       return;
    }
    public void R0(){
    }
    public int f0(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "8");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.M0();
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.size();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       Object obj;
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "4")) {
          a.p(p0, "holder");
          if (PatchProxy.isSupport(uoa)) {
             obj = PatchProxy.applyOneRefs(Integer.valueOf(p1), this, uoa, "7");
             if (obj != PatchProxyResult.class) {
             label_003c :
                Objects.requireNonNull(p0);
                if (!PatchProxy.applyVoidOneRefs(obj, p0, BaseViewHolder.class, "2")) {
                   BaseViewHolder c = p0.c;
                   if (c != null) {
                      q0 oq0 = new q0(3);
                      oq0.a(obj);
                      oq0.a(p0.b);
                      oq0.b(c);
                      Object[] objArray = new Object[oq0.c()];
                      p0.a().i(oq0.d(objArray));
                   }else {
                      Object[] objArray1 = new Object[]{obj,p0.b};
                      p0.a().i(objArray1);
                   }
                }
                this.O0(p0.b, obj);
             }
          }
          obj = this.e.get(p1);
          a.o(obj, "list[position]");
          goto label_003c ;
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       a$b uob;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          uob = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "3");
          if (uob != PatchProxyResult.class) {
          label_002c :
             return uob;
          }
       }
       a.p(p0, "parent");
       Context context = p0.getContext();
       a.o(context, "parent.context");
       uob = new a$b(this, context);
       goto label_002c ;
    }
}
