package com.kwai.library.push.display.PushUIManager$queue$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.PriorityQueue;
import py6.b;
import com.kwai.library.push.display.PushUIManager$queue$2$1;
import java.util.Objects;
import com.kwai.library.push.queue.EvictingPriorityQueue;
import oy6.a;
import com.kwai.library.push.utils.InPushSettingExt;
import java.lang.StringBuilder;
import java.lang.String;
import ny6.a;
import py6.a;
import java.util.Comparator;
import msd.l;

public final class PushUIManager$queue$2 extends Lambda implements a	// class@0008c0
{
    public static final PushUIManager$queue$2 INSTANCE;

    static {
       PushUIManager$queue$2.INSTANCE = new PushUIManager$queue$2();
    }
    public void PushUIManager$queue$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final PriorityQueue invoke(){
       int i;
       PushUIManager$queue$2$1 iNSTANCE = PushUIManager$queue$2$1.INSTANCE;
       Objects.requireNonNull(b.a);
       a uoa = InPushSettingExt.d();
       uoa = (uoa != null)? uoa.h: null;
       if (uoa == null) {
          i = 10;
       }
       a.b("getQueueCapacity: "+i);
       return new EvictingPriorityQueue(i, a.b, iNSTANCE);
    }
}
