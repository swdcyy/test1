package com.kwai.sdk.eve.internal.common.scheduler.internal.SimpleLabeledBlockingQueue$1;
import msd.a;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kwai.sdk.eve.internal.common.scheduler.internal.SimpleLabeledBlockingQueue;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import kotlin.jvm.internal.a;
import en7.l;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Collection;
import dn7.g;
import com.kwai.sdk.eve.internal.common.scheduler.internal.SimpleLabeledBlockingQueue$a;
import cn7.c;
import java.util.Iterator;
import java.lang.Iterable;

public final class SimpleLabeledBlockingQueue$1 extends FunctionReferenceImpl implements a	// class@001491
{

    public void SimpleLabeledBlockingQueue$1(SimpleLabeledBlockingQueue p0){
       super(0, p0, SimpleLabeledBlockingQueue.class, "recoverPendingSeq", "recoverPendingSeq\(\)V", 0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SimpleLabeledBlockingQueue$1.class, "1")) {
          return;
       }
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoid(objArray, treceiver, SimpleLabeledBlockingQueue.class, "31")) {
          SimpleLabeledBlockingQueue m = treceiver.m;
          a.m(m);
          Set set = m.a();
          _monitor_enter(set);
          SimpleLabeledBlockingQueue b = treceiver.b;
          _monitor_enter(b);
          SimpleLabeledBlockingQueue l = treceiver.l;
          if (l == null) {
             a.S("runningSeqs");
          }
          LinkedHashSet linkedHashSe = new LinkedHashSet(l.keySet());
          linkedHashSe.removeAll(set);
          if (linkedHashSe.isEmpty()) {
             _monitor_exit(b);
             _monitor_exit(set);
          }else {
             g og = treceiver.g.c();
             a.m(og);
             og = og.a();
             while (true) {
                if (og != null) {
                   int i = linkedHashSe.isEmpty() ^ 0x01;
                   if (i) {
                      String str = og.c().q();
                      if (str != null && linkedHashSe.contains(str)) {
                         linkedHashSe.remove(str);
                         SimpleLabeledBlockingQueue l1 = treceiver.l;
                         if (l1 == null) {
                            a.S("runningSeqs");
                         }
                         Object obj = l1.remove(str);
                         a.m(obj);
                         g og1 = og.b();
                         if (og1 != null) {
                            og1.d(obj.c());
                         }
                         og1 = obj.c();
                         if (og1 != null) {
                            og1.e(og.b());
                         }
                         og1 = obj.d();
                         if (og1 != null) {
                            og1.d(og);
                         }
                         og.e(obj.d());
                         l1 = treceiver.g;
                         int i1 = l1.b() + obj.b();
                         l1.g(i1);
                      }
                      og = og.a();
                   }else if(linkedHashSe.isEmpty() ^ 0x01){
                      Iterator iterator = linkedHashSe.iterator();
                      while (iterator.hasNext()) {
                         String str1 = iterator.next();
                         i = treceiver.h.b();
                         int i2 = treceiver.i.b();
                         SimpleLabeledBlockingQueue l2 = treceiver.l;
                         if (l2 == null) {
                            a.S("runningSeqs");
                         }
                         Object obj1 = l2.remove(str1);
                         a.m(obj1);
                         for (og = obj1.c(); og != null; og = og.a()) {
                            treceiver.m(og.c());
                         }
                         treceiver.h.g(i);
                         treceiver.i.g(i2);
                      }
                   }
                   SimpleLabeledBlockingQueue d = treceiver.d;
                   _monitor_enter(d);
                   treceiver.d.notifyAll();
                   _monitor_exit(d);
                   _monitor_exit(b);
                   _monitor_exit(set);
                   break ;
                }else {
                   goto label_00c6 ;
                }
             }
          }
       }
       return;
    }
}
