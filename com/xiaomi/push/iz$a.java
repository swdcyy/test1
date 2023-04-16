package com.xiaomi.push.iz$a;
import com.xiaomi.push.jf;
import java.lang.Object;
import ws8.x6;
import ws8.q6;
import com.xiaomi.push.iz;

public class iz$a implements jf	// class@001137
{
    public int a;
    public boolean a;
    public boolean b;

    public void iz$a(){
       super(false, true);
    }
    public void iz$a(boolean p0,boolean p1){
       super(p0, p1, 0);
    }
    public void iz$a(boolean p0,boolean p1,int p2){
       super();
       this.a = false;
       this.b = true;
       this.a = p0;
       this.b = p1;
       this.a = p2;
    }
    public q6 a(x6 p0){
       iz oiz = new iz(p0, this.a, this.b);
       iz$a ta = this.a;
       if (ta != null) {
          oiz.K(ta);
       }
       return oiz;
    }
}
