package ij9.a;
import y8c.g;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import g9c.a;
import y8c.f;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

public abstract class a extends g	// class@002853
{
    public int w;

    public void a(){
       super();
       this.w = 0;
    }
    public void W0(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       super.W0(p0);
       this.w = p0.size();
       return;
    }
    public void g1(f p0,int p1,List p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, a.class, "1")) {
          return;
       }
       if (this.w == null) {
          return;
       }
       if (this.r1()) {
          p1 = p1 % this.w;
       }
       super.g1(p0, p1, p2);
       return;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.e == null) {
          return 0;
       }
       if (this.r1()) {
          return Integer.MAX_VALUE;
       }
       return super.getItemCount();
    }
    public final boolean r1(){
       boolean b = true;
       if (this.w > b) {
       }else {
          b = false;
       }
       return b;
    }
    public void x0(RecyclerView$ViewHolder p0,int p1,List p2){
       this.g1(p0, p1, p2);
    }
}
