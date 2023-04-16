package c.t.m.g.da;
import java.lang.Object;
import java.util.LinkedList;
import c.t.m.g.cq;
import java.lang.IllegalArgumentException;
import java.lang.String;
import c.t.m.g.dv;
import c.t.m.g.q;
import com.tencent.map.geolocation.TencentLocation;
import c.t.m.g.da$a;
import c.t.m.g.ce;
import c.t.m.g.em;
import java.util.ListIterator;

public class da	// class@000c38
{
    public int a;
    public int b;
    public LinkedList c;
    public cq d;

    public void da(int p0,int p1){
       super();
       if (p0 < p1) {
          throw new IllegalArgumentException("maxSize should >= coreSize");
       }
       if (p1 < 3) {
          throw new IllegalArgumentException("coreSize should >= 3");
       }
       this.c = new LinkedList();
       this.a = p0;
       this.b = p1;
       this.d = new cq();
       return;
    }
    public synchronized void a(){
       this.c.clear();
       this.d.a();
    }
    public synchronized void a(dv p0){
       if ((p0.getProvider()).equalsIgnoreCase("gps") && !q.a().d("gps_kalman")) {
          return;
       }
       if (!this.c.size()) {
          return;
       }
       this.d.a(p0.getLatitude(), p0.getLongitude(), (double)p0.getAccuracy(), p0.getTime());
       p0.a(this.d.b(), this.d.c());
       return;
    }
    public synchronized void a(TencentLocation p0){
       this.c.add(da$a.a(p0));
       if (this.c.size() > this.a) {
          this.c.removeFirst();
       }
       return;
    }
    public synchronized final boolean a(da$a p0,ce p1,boolean p2){
       if (p1 != null) {
          da tc = this.c;
          if (tc != null && tc.size()) {
             da$a e = p0.e;
             if (e == 3) {
                return true;
             }else if(e == true && (!em.a(p1) && (!em.b(p1) && !p2))){
                return true;
             }else if((p0.c - this.c.getLast().c) - 0x1d4c0 > 0){
                this.c.clear();
                return true;
             }else if(this.b()){
                da tc1 = this.c;
                ListIterator listIterator = tc1.listIterator(tc1.size());
                int i = 0;
                int i1 = 0;
                while (listIterator.hasPrevious()) {
                   if (!listIterator.previous().a(p0)) {
                      i = i + 1;
                   }
                   i1 = i1 + true;
                   if (i1 > this.b) {
                      break ;
                   }
                }
                if (i > 1) {
                   return false;
                }
             }
             return true;
          }
       }
       return true;
    }
    public boolean a(TencentLocation p0,ce p1,boolean p2){
       return this.a(da$a.a(p0), p1, p2);
    }
    public final boolean b(){
       boolean b = (this.c.size() >= this.b)? true: false;
       return b;
    }
}
