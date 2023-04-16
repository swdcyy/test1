package com.yxcorp.gifshow.util.rx.a;
import java.lang.Object;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.String;
import java.util.concurrent.ExecutorService;
import t45.c;
import java.util.concurrent.Executor;
import brd.z;
import lrd.b;
import java.util.ArrayList;
import java.util.NavigableMap;
import java.util.Collection;
import java.util.Iterator;
import dn.b;

public class a	// class@000d01
{
    public final TreeMap a;
    public final ConcurrentHashMap b;
    public final z c;

    public void a(){
       super();
       this.a = new TreeMap();
       this.b = new ConcurrentHashMap();
       this.c = b.b(c.f("rxbus-background-scheduler-thread"));
    }
    public void a(Object p0){
       a ta = this.a;
       _monitor_enter(ta);
       _monitor_exit(ta);
       Iterator iterator = new ArrayList(this.a.descendingMap().values()).iterator();
       while (iterator.hasNext()) {
          iterator.next().accept(p0);
       }
       return;
    }
}
