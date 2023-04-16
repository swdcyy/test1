package com.tencent.open.log.f;
import java.lang.Iterable;
import java.lang.Object;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.String;
import java.io.Writer;
import java.util.Iterator;

public class f implements Iterable	// class@000f6a
{
    public ConcurrentLinkedQueue a;
    public AtomicInteger b;

    public void f(){
       super();
       this.a = null;
       this.b = null;
       this.a = new ConcurrentLinkedQueue();
       this.b = new AtomicInteger(0);
    }
    public int a(){
       return this.b.get();
    }
    public int a(String p0){
       this.a.add(p0);
       return this.b.addAndGet(p0.length());
    }
    public void a(Writer[] p0,char[] p1){
       try{
          if (p0 == null || (p1 == null || (p1.length && p0.length >= 2))) {
             object oobject = p0[0];
             object oobject1 = p0[1];
             int len = p1.length;
             Iterator iterator = this.iterator();
             int i = len;
             int i1 = 0;
             while (iterator.hasNext()) {
                String str = iterator.next();
                int i2 = str.length();
                int i3 = 0;
                while (i2 > 0) {
                   int i4 = (i > i2)? i2: i;
                   int i5 = i3 + i4;
                   str.getChars(i3, i5, p1, i1);
                   i = i - i4;
                   i1 = i1 + i4;
                   i2 = i2 - i4;
                   if (!i) {
                      if (oobject != null) {
                         try{
                            oobject.write(p1, 0, len);
                         }catch(java.lang.Exception e0){
                         }
                      }
                   }else {
                      i3 = i5;
                   }
                   i = len;
                   i3 = i5;
                   i1 = 0;
                }
             }
             if (i1 > 0) {
                if (oobject != null) {
                   try{
                      oobject.write(p1, 0, i1);
                   }catch(java.lang.Exception e0){
                   }
                }
             }
          }
       label_006a :
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void b(){
       this.a.clear();
       this.b.set(0);
    }
    public Iterator iterator(){
       return this.a.iterator();
    }
}
