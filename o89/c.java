package o89.c;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import n89.m;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import android.util.SparseArray;
import brd.t;
import com.yxcorp.gifshow.entity.QPhoto;
import o89.a;
import o89.b;
import erd.g;
import crd.b;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import y8c.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams;
import y89.g;
import s2a.a;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import ml8.c;
import android.view.ViewGroup;
import java.util.Set;
import android.view.ViewParent;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;

public abstract class c extends RecyclerView$Adapter	// class@0031ff
{
    public final PhotoDetailParam e;
    public final NormalDetailBizParam f;
    public final m g;
    public final List h;
    public final SparseArray i;
    public final Set j;
    public final b k;

    public void c(m p0,PhotoDetailParam p1,NormalDetailBizParam p2){
       super();
       this.j = new LinkedHashSet();
       this.g = p0;
       this.e = p1;
       this.f = p2;
       this.h = new ArrayList();
       this.i = new SparseArray();
       this.L0();
       this.k = p1.mPhoto.observePostChange().subscribe(new a(this), b.b);
    }
    public void B0(RecyclerView$ViewHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "10")) {
       }else {
          ViewGroup$LayoutParams layoutParams = p0.itemView.getLayoutParams();
          if (layoutParams instanceof StaggeredGridLayoutManager$LayoutParams) {
             layoutParams.c(true);
          }
       }
       return;
    }
    public abstract g J0();
    public abstract a K0();
    public void L0(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc, "4")) {
          this.h.clear();
          a uoa1 = this.K0();
          if (uoa1 != null) {
             this.h.add(uoa1);
          }
          this.h.addAll(this.J0().a(this.g, this.e, this.f));
          if (!q.f(objArray)) {
             this.h.addAll(objArray);
          }
       }
       this.i.clear();
       Iterator iterator = this.h.iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          this.i.put(uoa.a, uoa);
       }
       return;
    }
    public int f0(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "9");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.h.get(p0).a;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.h.size();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       c uoc = c.class;
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "7")) {
          a uoa = this.h.get(p1);
          if (uoa.b != null) {
             uoa.b = false;
             Object[] objArray = new Object[]{this.g,this.e,this.f};
             p0.b.i(objArray);
          }
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       f uof;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          uof = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoc, "6");
          if (uof != PatchProxyResult.class) {
          }else {
          label_0019 :
             uof = this.i.get(p1).a(p0);
             this.j.add(uof.b);
             if (uof.itemView.getParent() != null) {
                Object[] objArray = new Object[0];
                o.C().w("PhotoViewAdapter", "viewType = "+p1+", view = "+uof.itemView, objArray);
             }
          }
       }else {
          goto label_0019 ;
       }
       return uof;
    }
}
