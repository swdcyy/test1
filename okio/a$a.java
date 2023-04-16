package okio.a$a;
import java.lang.Object;
import nsd.u;
import okio.a;
import kotlin.jvm.internal.a;
import java.lang.System;

public final class a$a	// class@0020e8
{

    public void a$a(){
       super();
    }
    public void a$a(u p0){
       super();
    }
    public final a a(){
       long l;
       a uoa = a.class;
       a head = a.head;
       if (head == null) {
          a.L();
       }
       head = head.next;
       a uoa1 = null;
       if (head == null) {
          l = System.nanoTime();
          uoa.wait(a.IDLE_TIMEOUT_MILLIS);
          uoa = a.head;
          if (uoa == null) {
             a.L();
          }
          if (uoa.next == null && (System.nanoTime() - l) - a.IDLE_TIMEOUT_NANOS >= 0) {
             uoa1 = a.head;
          }
          return uoa1;
       }else {
          l = head.remainingNanos(System.nanoTime());
          if (l > 0) {
             long l1 = l / 0xf4240;
             uoa.wait(l1, (int)(l - (0xf4240 * l1)));
             return uoa1;
          }else {
             uoa = a.head;
             if (uoa == null) {
                a.L();
             }
             uoa.next = head.next;
             head.next = uoa1;
             return head;
          }
       }
    }
}
