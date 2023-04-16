package bk2.e;
import bk2.e$a;
import java.lang.Object;
import android.util.SparseBooleanArray;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Boolean;

public class e	// class@000400
{
    public SparseBooleanArray a;
    public e$a b;

    public void e(e$a p0){
       super();
       this.a = new SparseBooleanArray();
       this.b = p0;
    }
    public void a(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "1")) {
          return;
       }
       this.c(p0, null, false);
       return;
    }
    public void b(int p0,Object p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoe, "2")) {
          return;
       }
       this.c(p0, p1, false);
       return;
    }
    public void c(int p0,Object p1,boolean p2){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), this, e.class, "3")) {
          return;
       }
       if (p0 < 0) {
          return;
       }
       if (p2) {
          this.b.b(p0, p1);
       }else {
          e ta = this.a;
          if (ta != null && !ta.get(p0)) {
             this.b.b(p0, p1);
             this.a.put(p0, true);
          }
       }
       return;
    }
    public void d(int p0,int p1,boolean p2){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), this, e.class, "4")) {
          return;
       }
       if (p0 < 0) {
          return;
       }
       if (p2) {
          this.b.a(p0);
       }else {
          e ta = this.a;
          if (ta != null && !ta.get(p1)) {
             this.b.a(p0);
             this.a.put(p1, true);
          }
       }
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, e.class, "5")) {
          return;
       }
       this.a.clear();
       return;
    }
}
