package com.kuaishou.weapon.ks.ag;
import com.kuaishou.weapon.ks.d;
import java.lang.Object;
import java.lang.String;

public class ag	// class@0011c2
{
    public int p;
    public d q;

    public void ag(d p0){
       super();
       this.p = 0;
       this.q = p0;
       this.p = p0.a("plc001_c_h_c", 0);
       this.a();
    }
    public final void a(){
       if (this.p != null) {
          this.p = 0;
          this.q.a("plc001_c_h_c", 0, true);
       }
       return;
    }
    public boolean a(int p0){
       this.a();
       if ((this.p & p0) == p0) {
          return false;
       }
       return true;
    }
}
