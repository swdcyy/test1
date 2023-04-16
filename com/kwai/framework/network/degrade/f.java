package com.kwai.framework.network.degrade.f;
import d0d.g$b;
import java.lang.Object;
import java.lang.String;
import d0d.h;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import com.kwai.framework.network.degrade.g;
import ta6.a;
import java.util.Random;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$ApiCostDetailStatEvent;
import wkd.b;
import com.yxcorp.gifshow.log.h;

public final class f implements g$b	// class@0017bf
{
    public static final f a;

    static {
       f.a = new f();
    }
    public void f(){
       super();
    }
    public void a(String p0,boolean p1,boolean p2){
       h.a(this, p0, p1, p2);
    }
    public final void b(ClientStat$StatPackage p0,boolean p1,boolean p2){
       if (!p1 || p2) {
          p1.ratio = 0x3f800000;
          b.a(0x4b316083).j(p0);
       }else {
          float f = a.b();
          if (g.i.nextFloat() - f <= 0) {
             p2.ratio = f;
             b.a(0x4b316083).j(p0);
          }
       }
       return;
    }
}
