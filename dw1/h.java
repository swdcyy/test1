package dw1.h;
import dw1.a;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Iterator;
import java.util.List;
import dw1.a$a;
import cw1.b0;
import java.util.Set;
import lp3.e;
import lp3.c;
import lp3.b;
import dw1.a$b;

public class h implements a	// class@00204a
{
    public final List b;
    public a$b c;
    public final Set d;

    public void h(){
       super();
       this.b = new ArrayList();
       this.d = new HashSet();
    }
    public void Gn(int p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oh, "1")) {
          return;
       }
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0);
       }
       return;
    }
    public void Lf(b0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "10")) {
          return;
       }
       this.d.remove(p0);
       return;
    }
    public void Ud(b0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "9")) {
          return;
       }
       this.d.add(p0);
       return;
    }
    public void Vi(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "5")) {
          return;
       }
       if (this.b.contains(p0)) {
          this.b.remove(p0);
       }
       return;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public void gb(int p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oh, "8")) {
          return;
       }
       Iterator iterator = this.d.iterator();
       while (iterator.hasNext()) {
          iterator.next().o2(p0);
       }
       return;
    }
    public void ik(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "2")) {
          return;
       }
       h tc = this.c;
       if (tc != null) {
          tc.a(p0);
       }
       return;
    }
    public void n2(){
       if (PatchProxy.applyVoid(null, this, h.class, "7")) {
          return;
       }
       Iterator iterator = this.d.iterator();
       while (iterator.hasNext()) {
          iterator.next().n2();
       }
       return;
    }
    public void q(int p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oh, "6")) {
          return;
       }
       Iterator iterator = this.d.iterator();
       while (iterator.hasNext()) {
          iterator.next().q(p0);
       }
       return;
    }
    public void r6(){
       this.c = null;
    }
    public void we(a$b p0){
       this.c = p0;
    }
    public void wh(){
       if (PatchProxy.applyVoid(null, this, h.class, "3")) {
          return;
       }
       h tc = this.c;
       if (tc != null) {
          tc.b();
       }
       return;
    }
    public void ya(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "4")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.b.add(p0);
       return;
    }
}
