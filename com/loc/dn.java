package com.loc.dn;
import com.loc.dm;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Object;
import com.loc.dr;
import com.loc.dt;
import com.loc.dn$a;
import com.loc.du;
import com.loc.dv;
import com.loc.ds;
import com.loc.dy;
import com.loc.dn$b;

public final class dn	// class@0013ea
{

    public static long a(int p0,int p1){
       return (((long)p1 & 0xffffffff) | (((long)p0 & 0xffffffff) << 32));
    }
    public static synchronized short a(long p0){
       _monitor_enter(dn.class);
       _monitor_exit(dn.class);
       return dm.a().a(p0);
    }
    public static synchronized void a(List p0){
       dn$a uoa;
       _monitor_enter(dn.class);
       if (p0 == null || p0.isEmpty()) {
          _monitor_exit(dn.class);
          return;
       }else {
          ArrayList uArrayList = new ArrayList(p0.size());
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             dr uodr = iterator.next();
             if (uodr instanceof dt) {
                uoa = new dn$a(uodr.j, uodr.k, uodr.c);
             }else if(uodr instanceof du){
                uoa = new dn$a(uodr.j, uodr.k, uodr.c);
             }else if(uodr instanceof dv){
                uoa = new dn$a(uodr.j, uodr.k, uodr.c);
             }else if(uodr instanceof ds){
                uoa = new dn$a(uodr.k, uodr.l, uodr.c);
             }
             uArrayList.add(uoa);
          }
          dm.a().a(uArrayList);
          _monitor_exit(dn.class);
          return;
       }
    }
    public static synchronized short b(long p0){
       _monitor_enter(dn.class);
       _monitor_exit(dn.class);
       return dm.a().b(p0);
    }
    public static synchronized void b(List p0){
       _monitor_enter(dn.class);
       if (p0 == null || p0.isEmpty()) {
          _monitor_exit(dn.class);
          return;
       }else {
          ArrayList uArrayList = new ArrayList(p0.size());
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             dy uody = iterator.next();
             uArrayList.add(new dn$b(uody.a, uody.c));
          }
          dm.a().b(uArrayList);
          _monitor_exit(dn.class);
          return;
       }
    }
}
