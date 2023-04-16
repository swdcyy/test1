package fx8.b;
import y8c.g;
import a9c.e;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import g9c.a;
import java.lang.Number;
import java.util.List;
import java.lang.Boolean;
import android.view.ViewGroup;
import y8c.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import ml8.c;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public abstract class b extends g	// class@002374
{
    public View w;
    public View x;

    public void b(){
       super();
    }
    public void b(e p0){
       super(p0);
    }
    public Object N0(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.w != null) {
          p0--;
          return super.N0(p0);
       }else {
          return super.N0(p0);
       }
    }
    public Object O0(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.w != null) {
          p0--;
          return super.O0(p0);
       }else {
          return super.O0(p0);
       }
    }
    public int P0(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.w == null) {
          return this.e.indexOf(p0);
       }
       if (this.e.indexOf(p0) == -1) {
          return -1;
       }
       return (this.e.indexOf(p0) + 1);
    }
    public int f0(int p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "7");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       int i = 1;
       b = (this.w != null && !p0)? true: false;
       if (b) {
          return i;
       }else if(PatchProxy.isSupport(uob)){
          Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "3");
          if (obj1 != patchProxyRe) {
             boolean b1 = obj1.booleanValue();
          label_0052 :
             if (b1) {
                return 2;
             }else {
                return 0;
             }
          }
       }
       if (this.x == null || p0 != (this.getItemCount() - i)) {
          i = 0;
       }
       p0 = i;
       goto label_0052 ;
    }
    public int getItemCount(){
       b obj = PatchProxy.apply(null, this, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.w;
       if (obj == null && this.x == null) {
          return this.e.size();
       }
       if (obj == null || this.x == null) {
          return (this.e.size() + 1);
       }
       return (this.e.size() + 2);
    }
    public f h1(ViewGroup p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 == 1) {
          return new f(this.w, new PresenterV2());
       }else if(p1 == 2){
          return new f(this.x, new PresenterV2());
       }else {
          return this.s1(p0, p1);
       }
    }
    public boolean r1(){
       boolean b = (this.w != null)? true: false;
       return b;
    }
    public abstract f s1(ViewGroup p0,int p1);
    public void t1(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.x = p0;
       this.n0((this.getItemCount() - 1));
       return;
    }
    public void u1(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.w = p0;
       this.n0(0);
       return;
    }
}
