package com.kwai.performance.stability.policy._Patrons$a;
import java.util.TimerTask;
import com.kwai.performance.stability.policy._Patrons;
import java.util.concurrent.atomic.AtomicInteger;
import com.kwai.performance.stability.policy.a$a;
import ig7.c;
import java.lang.String;
import ig7.b;

public class _Patrons$a extends TimerTask	// class@00127d
{

    public void _Patrons$a(){
       super();
    }
    public void run(){
       AtomicInteger g = _Patrons.g;
       if (g.get() && g.addAndGet(1) > 5) {
          g.set(0);
          _Patrons.b(_Patrons.c.e);
       }
       long l = _Patrons.e();
       float f = (float)l / _Patrons.b;
       a$a c = _Patrons.c;
       if ((_Patrons.f - (long)c.d) - (long)c.f < 0) {
          _Patrons.f();
          return;
       }else if(f - c.c > 0){
          l = _Patrons.f - (long)_Patrons.c.d;
          _Patrons.f = l;
          if (!_Patrons.shrinkRegionSpace((int)l)) {
             _Patrons.h.a(new c(2, 1, _Patrons.c(1)));
             _Patrons.f();
             return;
          }else {
             g.set(1);
             _Patrons.b((_Patrons.c.e / 2));
          }
       }else {
          a$a c1 = _Patrons.c;
          if ((_Patrons.getCurrentRegionSpaceSize() / 0x100000) - (long)c1.f < 0) {
             _Patrons.f();
          }else if(c1.a != null){
             g.get();
             long l1 = _Patrons.getCurrentRegionSpaceSize() / 0x100000;
          }
       }
       return;
    }
}
