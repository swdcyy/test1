package m99.f;
import y8c.g;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;
import n89.a;
import android.util.SparseIntArray;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.ArrayList;
import android.util.SparseArray;
import y89.a;
import n89.m;
import java.util.Collection;
import java.util.Iterator;
import s2a.a;
import y8c.f$b;
import com.kwai.robust.PatchProxyResult;
import m99.f$a;
import java.lang.Integer;
import java.lang.Number;
import y8c.f;
import ml8.c;
import android.view.ViewGroup;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.atlas_detail.vertical.presenter.d;
import android.view.View;
import i2b.a;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams;

public class f extends g	// class@002e2e
{
    public final QPhoto A;
    public SparseArray B;
    public List C;
    public SparseIntArray D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public final PhotoDetailParam w;
    public final NormalDetailBizParam x;
    public final a y;
    public List z;

    public void f(PhotoDetailParam p0,NormalDetailBizParam p1,a p2,boolean p3,boolean p4){
       super();
       this.D = new SparseIntArray();
       this.w = p0;
       this.y = p2;
       PhotoDetailParam mPhoto = p0.mPhoto;
       this.A = mPhoto;
       this.x = p1;
       this.F = p4;
       this.G = p3;
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
       }else if(mPhoto != null && this.G != null){
          this.z = mPhoto.getAtlasList();
       }else {
          this.z = new ArrayList();
       }
       this.B = new SparseArray();
       ArrayList uArrayList = new ArrayList();
       this.C = uArrayList;
       if (this.F != null) {
          uArrayList.addAll(new a().a(p2, p0, p1));
       }
       Iterator iterator = this.C.iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          this.B.put(uoa.a, uoa);
       }
       return;
    }
    public f$b d1(f$b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new f$a(p0, this.w, this.y, this.E);
    }
    public int f0(int p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uof, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 < this.s1()) {
          return 258;
       }else {
          return this.C.get((p0 - this.s1())).a;
       }
    }
    public void g1(f p0,int p1,List p2){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, f.class, "6")) {
          return;
       }
       int i = this.f0(p1);
       if (i == 258) {
          super.g1(p0, p1, p2);
       }else {
          a uoa = this.B.get(i);
          if (uoa != null && uoa.b != null) {
             uoa.b = false;
             Object[] objArray = new Object[]{this.y,this.w,this.x};
             p0.b.i(objArray);
          }
       }
       return;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.s1() + this.C.size());
    }
    public f h1(ViewGroup p0,int p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uof, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 == 258) {
          PresenterV2 presenterV2 = new PresenterV2();
          presenterV2.U7(new d());
          return new f(a.i(p0, 0x7f0d02b5), presenterV2);
       }else {
          return this.B.get(p1).a(p0);
       }
    }
    public void k1(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "8")) {
          return;
       }
       super.k1(p0);
       if (this.H == null && this.f0(p0.getAdapterPosition()) == 258) {
          int adapterPosit = p0.getAdapterPosition();
          this.D.put(adapterPosit, (this.D.get(adapterPosit) + 1));
       }
       ViewGroup$LayoutParams layoutParams = p0.itemView.getLayoutParams();
       if (layoutParams instanceof StaggeredGridLayoutManager$LayoutParams) {
          layoutParams.c(1);
       }
       return;
    }
    public SparseIntArray r1(){
       return this.D;
    }
    public int s1(){
       f obj = PatchProxy.apply(null, this, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.z;
       int i = (obj == null)? 0: obj.size();
       return i;
    }
    public void t1(boolean p0){
       this.H = p0;
    }
}
