package com.kuaishou.weapon.ks.x$8$1;
import java.util.TimerTask;
import com.kuaishou.weapon.ks.x$8;
import com.kuaishou.weapon.ks.z;
import com.kuaishou.weapon.ks.aa;
import java.lang.String;
import com.kuaishou.weapon.ks.x;
import com.kuaishou.weapon.ks.ah;
import java.io.File;
import com.kuaishou.weapon.ks.b;

public class x$8$1 extends TimerTask	// class@001238
{
    public final z a;
    public final aa b;
    public final x$8 c;

    public void x$8$1(x$8 p0,z p1,aa p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void run(){
       this.a.b(this.c.a);
       x.m(this.c.b).a(this.c.a);
       File uFile = new File(this.b.e);
       if (uFile.exists()) {
          b.a(uFile);
          uFile.delete();
       }
       return;
    }
}
