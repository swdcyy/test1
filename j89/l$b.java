package j89.l$b;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j89.l;
import java.util.Objects;
import android.os.Process;
import java.util.LinkedHashMap;
import com.yxcorp.gifshow.apm.SampleState;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.lang.StringBuilder;
import java.lang.Integer;
import android.os.SystemClock;
import java.lang.Number;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import zsd.d;
import java.nio.charset.Charset;
import kotlin.jvm.internal.a;
import com.yxcorp.zcompress.ZstdDirectBufferCompressingStream;
import j89.r;
import java.lang.Long;
import java.util.List;
import j89.q;
import java.util.Iterator;
import java.lang.Iterable;
import j89.p;
import com.kwai.performance.stability.crash.monitor.util.BacktraceUtil;
import java.util.Collection;
import java.lang.Thread;
import java.util.Map;

public final class l$b implements Runnable	// class@0027b3
{
    public static final l$b b;

    static {
       l$b.b = new l$b();
    }
    public void l$b(){
       super();
    }
    public final void run(){
       int i1;
       StringBuilder str3;
       String str5;
       ZstdDirectBufferCompressingStream obj;
       StringBuilder str6;
       String str7;
       String str8;
       byte[] bytes1;
       Object[] objArray1;
       Object[] objArray3;
       String str9;
       String name;
       String str11;
       l ol;
       Iterator iterator;
       Object[] x111;
       String str12;
       Object obj2;
       String str13;
       ZstdDirectBufferCompressingStream x111;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, l$b.class, "1")) {
          return;
       }
       l c = l.C;
       Objects.requireNonNull(c);
       if (!PatchProxy.applyVoid(objArray, c, l.class, "4")) {
          int i = Process.myPid();
          LinkedHashMap linkedHashMa = new LinkedHashMap();
          String str = "null cannot be cast to non-null type java.nio.ByteBuffer";
          String str1 = "\(this as java.lang.String\).getBytes\(charset\)";
          String str2 = "null cannot be cast to non-null type java.lang.String";
          while (l.j != SampleState.BEFORE_END_TRACE || !l.l.isEmpty()) {
             String str4 = "";
             if (!l.m.isEmpty()) {
                str5 = str4;
                ConcurrentLinkedQueue m = l.m;
                while (!m.isEmpty()) {
                   obj = m.poll();
                   a.m(obj);
                   str6 = "customMark_";
                   if (obj.d != null) {
                      str7 = str4;
                      str8 = str5+c.d(i, str6+obj.b(), Long.valueOf(obj.b()), obj.c(), obj.a(), "B");
                   }else {
                      str7 = str4;
                      str8 = str5+c.d(i, str6+obj.b(), Long.valueOf(obj.b()), obj.c(), obj.a(), "E");
                   }
                   str5 = str8;
                   str4 = str7;
                }
                str7 = str4;
                l.p.add(str5);
                ByteBuffer Buffer x1 = l.x;
                x1.clear();
                obj = l.w;
                if (obj == null) {
                   a.S("mOutputZstdStream");
                }
                Objects.requireNonNull(str5, str2);
                bytes1 = str5.getBytes(d.a);
                a.o(bytes1, str1);
                x1 = x1.put(bytes1).flip();
                Objects.requireNonNull(x1, str);
                obj.compress(x1);
             }else {
                str7 = str4;
             }
             q Iterator x11 = l.l.poll();
             if (x11 != null) {
                x11 = x11.a().iterator();
                while (x11.hasNext()) {
                   Object obj1 = x11.next();
                   int i2 = 0;
                   if (l.o) {
                      objArray1 = BacktraceUtil.a(obj1.b);
                      a.o(objArray1, "BacktraceUtil.frameInfoT¡­lements\(sample.frameInfo\)");
                   }else {
                      objArray3 = new Object[i2];
                      objArray1 = obj1.f.toArray(objArray3);
                      Objects.requireNonNull(objArray1, "null cannot be cast to non-null type kotlin.Array<T>");
                   }
                   Object[] objArray2 = objArray1;
                   if (!linkedHashMa.containsKey(Long.valueOf(obj1.b().getId()))) {
                      objArray3 = new Object[i2];
                      linkedHashMa.put(Long.valueOf(obj1.b().getId()), objArray3);
                      str9 = str7;
                      str6 = str9;
                      l c1 = l.C;
                      name = obj1.b().getName();
                      a.o(name, "sample.thread.name");
                      String str10 = name;
                      i1 = i;
                      str11 = str9;
                      str9 = str10;
                      ol = c;
                      str3 = str6;
                      iterator = x11;
                      x111 = objArray2;
                      str12 = str;
                      str = "sample.thread.name";
                      obj2 = obj1;
                      str9 = obj2.b().getName();
                      a.o(str9, str);
                      l ol1 = c1;
                      str13 = str1;
                      str4 = str3+c1.d(i1, str9, obj1.a(), obj1.c(), "trace begin mark", "B")+ol1.d(i1, str9, obj2.a(), obj2.c(), "trace begin mark", "E");
                   }else {
                      ol = c;
                      iterator = x11;
                      x111 = objArray2;
                      obj2 = obj1;
                      str12 = str;
                      str13 = str1;
                      str11 = str7;
                      str = "sample.thread.name";
                      str4 = str11;
                   }
                   ByteBuffer obj3 = linkedHashMa.get(Long.valueOf(obj2.b().getId()));
                   a.m(obj3);
                   i2 = 0;
                   int i3 = obj3.length - 1;
                   int i4 = i3 - i2;
                   i3 = x111.length - 1;
                   int i5 = i3 - i2;
                   while (i4 < 0 || (i5 >= 0 && a.g(x111[i5], obj3[i4]))) {
                      i2 = i2 + 1;
                   }
                   if (i4 >= 0) {
                      str5 = str4;
                      int i6 = 0;
                      str9 = obj2.b().getName();
                      a.o(str9, str);
                      Object obj4 = obj3;
                      str7 = str2;
                      int i7 = i6;
                      str5 = str5+l.C.d(i, str9, obj2.a(), obj2.c(), obj3[i6], "E");
                      while (i7 != i4) {
                         i6 = i7 + 1;
                         str2 = str7;
                         obj3 = obj4;
                      }
                      str4 = str5;
                   }else {
                      str7 = str2;
                   }
                   while (i5 >= 0) {
                      str9 = obj2.b().getName();
                      a.o(str9, str);
                      str4 = str4+l.C.d(i, str9, obj2.a(), obj2.c(), x111[i5], "B");
                      i5 = i5 - 1;
                   }
                   linkedHashMa.put(Long.valueOf(obj2.b().getId()), x111);
                   l.p.add(str4);
                   obj3 = l.x;
                   obj3.clear();
                   x111 = l.w;
                   if (x111 == null) {
                      a.S("mOutputZstdStream");
                   }
                   name = str7;
                   Objects.requireNonNull(str4, name);
                   bytes1 = str4.getBytes(d.a);
                   str9 = str13;
                   a.o(bytes1, str9);
                   Buffer uBuffer1 = obj3.put(bytes1).flip();
                   str5 = str12;
                   Objects.requireNonNull(uBuffer1, str5);
                   x111.compress(uBuffer1);
                   str = str5;
                   str2 = name;
                   str1 = str9;
                   x11 = iterator;
                   c = ol;
                   str7 = str11;
                }
                ol = c;
             }else {
                ol = c;
                Thread.sleep(100);
             }
             c = ol;
          }
          i1 = i;
          str3 = c.d(i1, "fakeThread", Integer.valueOf(0xf423f), SystemClock.elapsedRealtime(), "trace end mark", "B")+c.d(i1, "fakeThread", Integer.valueOf(0xf423f), SystemClock.elapsedRealtime(), "trace end mark", "E");
          ByteBuffer x = l.x;
          x.clear();
          Objects.requireNonNull(str3, str2);
          byte[] bytes = str3.getBytes(d.a);
          a.o(bytes, str1);
          x.put(bytes);
          ZstdDirectBufferCompressingStream w = l.w;
          if (w == null) {
             a.S("mOutputZstdStream");
          }
          Buffer uBuffer = x.flip();
          Objects.requireNonNull(uBuffer, str);
          w.compress(uBuffer);
          l.j = SampleState.AFTER_END_TRACE;
       }
       return;
    }
}
