package io.netty.util.DefaultAttributeMap;
import wqd.f;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import io.netty.util.internal.PlatformDependent;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.lang.Object;
import wqd.e;
import wqd.a;
import wqd.d;
import java.util.Objects;
import io.netty.util.DefaultAttributeMap$DefaultAttribute;

public class DefaultAttributeMap implements f	// class@0010de
{
    public AtomicReferenceArray b;
    public static final AtomicReferenceFieldUpdater c;

    static {
       AtomicReferenceFieldUpdater uAtomicRefer = PlatformDependent.w(DefaultAttributeMap.class, "attributes");
       if (uAtomicRefer == null) {
          uAtomicRefer = AtomicReferenceFieldUpdater.newUpdater(DefaultAttributeMap.class, AtomicReferenceArray.class, "b");
       }
       DefaultAttributeMap.c = uAtomicRefer;
    }
    public void DefaultAttributeMap(){
       super();
    }
    public static int a(e p0){
       return (p0.id() & 0x03);
    }
    public d i(e p0){
       Objects.requireNonNull(p0, "key");
       DefaultAttributeMap tb = this.b;
       DefaultAttributeMap$DefaultAttribute obj = null;
       if (tb == null) {
          tb = new AtomicReferenceArray(4);
          if (!DefaultAttributeMap.c.compareAndSet(this, obj, tb)) {
             tb = this.b;
          }
       }
       int i = DefaultAttributeMap.a(p0);
       DefaultAttributeMap$DefaultAttribute uDefaultAttr = tb.get(i);
       if (uDefaultAttr == null) {
          uDefaultAttr = new DefaultAttributeMap$DefaultAttribute(p0);
          if (tb.compareAndSet(i, obj, uDefaultAttr)) {
             return uDefaultAttr;
          }else {
             uDefaultAttr = tb.get(i);
          }
       }
       _monitor_enter(uDefaultAttr);
       DefaultAttributeMap$DefaultAttribute uDefaultAttr1 = uDefaultAttr;
       while (true) {
          if (uDefaultAttr1.removed == null && uDefaultAttr1.key == p0) {
             _monitor_exit(uDefaultAttr);
             return uDefaultAttr1;
          }else {
             obj = uDefaultAttr1.next;
             if (obj == null) {
                break ;
             }else {
                uDefaultAttr1 = obj;
             }
          }
       }
       obj = new DefaultAttributeMap$DefaultAttribute(uDefaultAttr, p0);
       uDefaultAttr1.next = obj;
       obj.prev = uDefaultAttr1;
       _monitor_exit(uDefaultAttr);
       return obj;
    }
    public boolean p0(e p0){
       Objects.requireNonNull(p0, "key");
       DefaultAttributeMap tb = this.b;
       if (tb == null) {
          return false;
       }
       DefaultAttributeMap$DefaultAttribute uDefaultAttr = tb.get(DefaultAttributeMap.a(p0));
       if (uDefaultAttr == null) {
          return false;
       }
       if (uDefaultAttr.key == p0 && uDefaultAttr.removed == null) {
          return true;
       }
       _monitor_enter(uDefaultAttr);
       DefaultAttributeMap$DefaultAttribute next = uDefaultAttr.next;
       while (true) {
          if (next != null) {
             if (next.removed == null && next.key == p0) {
                break ;
             }else {
                next = next.next;
             }
          }else {
             _monitor_exit(uDefaultAttr);
             return false;
          }
       }
       _monitor_exit(uDefaultAttr);
       return true;
    }
}
