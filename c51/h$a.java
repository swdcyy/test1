package c51.h$a;
import c51.b;
import c51.h;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Iterator;
import java.util.List;
import java.lang.Throwable;

public class h$a implements b	// class@00047a
{
    public final h b;

    public void h$a(h p0){
       this.b = p0;
       super();
    }
    public void S(boolean p0){
       h$a uoa = h$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "2")) {
          return;
       }
       Iterator iterator = this.b.i.iterator();
       while (iterator.hasNext()) {
          iterator.next().S(p0);
       }
       return;
    }
    public void U(boolean p0){
       h$a uoa = h$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "1")) {
          return;
       }
       Iterator iterator = this.b.i.iterator();
       while (iterator.hasNext()) {
          iterator.next().U(p0);
       }
       return;
    }
    public void X(boolean p0,Throwable p1){
       h$a uoa = h$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "4")) {
          return;
       }
       Iterator iterator = this.b.i.iterator();
       while (iterator.hasNext()) {
          iterator.next().X(p0, p1);
       }
       return;
    }
    public void c0(){
       if (PatchProxy.applyVoid(null, this, h$a.class, "5")) {
          return;
       }
       Iterator iterator = this.b.i.iterator();
       while (iterator.hasNext()) {
          iterator.next().c0();
       }
       return;
    }
    public void w(boolean p0,List p1){
       h$a uoa = h$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "3")) {
          return;
       }
       Iterator iterator = this.b.i.iterator();
       while (iterator.hasNext()) {
          iterator.next().w(p0, p1);
       }
       return;
    }
}
