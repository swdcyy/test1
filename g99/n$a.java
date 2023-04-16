package g99.n$a;
import uw9.y;
import b3a.f;
import xk9.g;
import g99.n;
import java.lang.Object;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import uw9.x;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import im8.f;
import androidx.recyclerview.widget.RecyclerView;
import l17.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import m99.f;
import com.yxcorp.gifshow.atlas_detail.common.presenter.toolbar.e;
import g99.w;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;

public class n$a implements y, f, g	// class@00244a
{
    public RecyclerView a;
    public a b;
    public View c;
    public final n d;

    public void n$a(n p0){
       this.d = p0;
       super();
       this.c = p0.m8().findViewById(0x7f0a3f6a);
    }
    public void a(){
       x.a(this);
    }
    public void b(int p0,QComment p1){
       if (PatchProxy.isSupport(n$a.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, n$a.class, "4")) {
          return;
       }
       this.d();
       return;
    }
    public void d(){
       n$a uoa = n$a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "1")) {
          return;
       }
       if (this.b == null) {
          RecyclerView recyclerView = this.d.z.get();
          this.a = recyclerView;
          if (recyclerView == null) {
             return;
          }else {
             this.b = a.a(recyclerView);
          }
       }
       View obj = PatchProxy.apply(objArray, this, uoa, "2");
       int i = (obj != PatchProxyResult.class)? obj.intValue(): this.b.c();
       int i1 = 1;
       int i2 = this.d.A.s1() - i1;
       float f = 0x3f800000;
       if (i > i2) {
          this.d.w.u0(f);
       }else if(i == i2){
          obj = this.a.getLayoutManager().findViewByPosition(i2);
          i2 = 2;
          int[] ointArray = new int[i2];
          int i3 = 0;
          if (obj != null) {
             obj.getLocationOnScreen(ointArray);
             i3 = obj.getHeight();
          }
          i = ointArray[i1] + i3;
          int[] ointArray1 = new int[i2];
          this.c.getLocationOnScreen(ointArray1);
          i2 = ointArray1[i1] + this.c.getHeight();
          i1 = n.E;
          if (i > (i1 + i2)) {
             this.d.w.u0(0);
          }else if(i < i2){
             this.d.w.u0(f);
          }else {
             this.d.w.u0((f - ((float)(i - i2) / (float)i1)));
          }
       }else {
          this.d.w.u0(0);
       }
       return;
    }
    public void e(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(n$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, n$a.class, "3")) {
          return;
       }
       this.d();
       return;
    }
    public void f(QComment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n$a.class, "5")) {
          return;
       }
       this.d();
       return;
    }
}
