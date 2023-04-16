package eg1.l;
import lz2.c;
import eg1.j;
import java.lang.Object;
import pz2.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.Set;
import java.util.List;
import java.lang.Boolean;

public class l implements c	// class@002156
{
    public final j a;

    public void l(j p0){
       this.a = p0;
       super();
    }
    public void a(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "6")) {
          return;
       }
       Iterator iterator = this.a.g.iterator();
       while (iterator.hasNext()) {
          c uoc = iterator.next();
          if (uoc != null) {
             uoc.a(p0);
          }
       }
       return;
    }
    public void e(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "4")) {
          return;
       }
       Iterator iterator = this.a.g.iterator();
       while (iterator.hasNext()) {
          c uoc = iterator.next();
          if (uoc != null) {
             uoc.e(p0);
          }
       }
       return;
    }
    public void g(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "5")) {
          return;
       }
       Iterator iterator = this.a.g.iterator();
       while (iterator.hasNext()) {
          c uoc = iterator.next();
          if (uoc != null) {
             uoc.g(p0);
          }
       }
       return;
    }
    public void h(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "2")) {
          return;
       }
       Iterator iterator = this.a.g.iterator();
       while (iterator.hasNext()) {
          c uoc = iterator.next();
          if (uoc != null) {
             uoc.h(p0);
          }
       }
       return;
    }
    public void i(c p0,boolean p1,String p2){
       if (PatchProxy.isSupport(l.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, l.class, "3")) {
          return;
       }
       Iterator iterator = this.a.g.iterator();
       while (iterator.hasNext()) {
          c uoc = iterator.next();
          if (uoc != null) {
             uoc.i(p0, p1, p2);
          }
       }
       return;
    }
    public void j(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
          return;
       }
       Iterator iterator = this.a.g.iterator();
       while (iterator.hasNext()) {
          c uoc = iterator.next();
          if (uoc != null) {
             uoc.j(p0);
          }
       }
       return;
    }
}
