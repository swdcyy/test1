package j89.l;
import java.lang.Thread;
import com.yxcorp.gifshow.apm.SampleState;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.ArrayList;
import java.nio.ByteBuffer;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.lang.Integer;
import java.lang.Boolean;
import msd.l;
import msd.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import jg6.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Enum;
import java.io.File;
import ekd.e0;
import android.content.Context;
import java.lang.StringBuilder;
import wkd.b;
import com.yxcorp.gifshow.OnlineSystraceManager;
import com.yxcorp.gifshow.OnlineSystraceManager$KeepPushPerformanceModel;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel$MapMode;
import java.nio.MappedByteBuffer;
import com.yxcorp.zcompress.ZstdDirectBufferCompressingStream;
import java.lang.Throwable;
import android.util.Log;
import j89.l$a;
import java.lang.Runnable;
import j89.l$b;
import android.os.SystemClock;
import java.util.Collection;
import com.yxcorp.gifshow.apm.OnlineSystraceInterceptor;
import java.util.Objects;
import j89.l$c;
import java.lang.Number;
import ekd.v0;
import com.yxcorp.utility.SystemUtil;
import com.kwai.performance.stability.crash.monitor.util.BacktraceUtil;

public final class l	// class@0027b5
{
    public static Thread A;
    public static boolean B;
    public static final l C;
    public static String a;
    public static int b;
    public static int c;
    public static boolean d;
    public static int e;
    public static String f;
    public static l g;
    public static p h;
    public static Thread[] i;
    public static SampleState j;
    public static long k;
    public static final ConcurrentLinkedQueue l;
    public static final ConcurrentLinkedQueue m;
    public static long n;
    public static boolean o;
    public static final List p;
    public static File q;
    public static FileOutputStream r;
    public static FileChannel s;
    public static File t;
    public static RandomAccessFile u;
    public static FileChannel v;
    public static ZstdDirectBufferCompressingStream w;
    public static final ByteBuffer x;
    public static Thread y;
    public static Thread z;

    static {
       l.C = new l();
       Thread[] threadArray = new Thread[0];
       l.i = threadArray;
       l.j = SampleState.BEFORE_INIT;
       l.l = new ConcurrentLinkedQueue();
       l.m = new ConcurrentLinkedQueue();
       l.n = -1;
       l.o = true;
       l.p = new ArrayList();
       l.x = ByteBuffer.allocateDirect(0x100000);
    }
    public void l(){
       super();
    }
    public static final List a(l p0){
       return l.p;
    }
    public final boolean b(long p0,String p1,Integer p2,Integer p3,Boolean p4,l p5,int p6,String p7,boolean p8,p p9){
       File obj;
       File obj1;
       object oobject = p1;
       object oobject1 = p7;
       l ol = l.class;
       object oobject2 = null;
       int i = 2;
       int i1 = 10;
       if (PatchProxy.isSupport(ol)) {
          Object[] objArray = new Object[i1];
          objArray[0] = Long.valueOf(p0);
          objArray[1] = oobject;
          objArray[i] = p2;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = oobject2;
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = oobject1;
          objArray[8] = Boolean.valueOf(p8);
          objArray[9] = p9;
          obj = PatchProxy.apply(objArray, this, ol, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }else {
          int i3 = this;
       }
       a.p(p1, "scene");
       a.p(oobject1, "logUUID");
       if (!a.a()) {
          return 0;
       }else if(TextUtils.isEmpty(p1)){
          return 0;
       }else {
          int i2 = 100;
          if (p3 != null && (p3.intValue() > i2 || p3.intValue() < 1)) {
             return 0;
          }else if(p2 != null && (p2.intValue() > 60 || p2.intValue() < 1)){
             return 0;
          }else {
             l.f = oobject1;
             l.e = p6;
             l.g = oobject2;
             l.n = p0;
             l.o = p8;
             if (l.j != SampleState.AFTER_INIT && l.j != SampleState.AFTER_END_TRACE) {
                l.j.name();
                return 0;
             }else {
                l.a = oobject;
                if (p2 != null) {
                   i1 = p2.intValue();
                }
                l.b = i1;
                if (p3 != null) {
                   i2 = p3.intValue();
                }
                l.c = i2;
                boolean b = (p4 != null)? p4.booleanValue(): false;
                l.d = b;
                l.h = p9;
                l.j = SampleState.BEFORE_BEGIN_TRACE;
                l.p.clear();
                l.l.clear();
                l.m.clear();
                File uFile = new File(e0.b.getExternalCacheDir(), "os");
                if (!uFile.exists()) {
                   uFile.mkdir();
                }
                String f = l.f;
                uFile.toString();
                l.q = new File(uFile, f+".zip");
                String str = f;
                l.t = new File(uFile, str+".mm");
                if (l.e == i) {
                   obj1 = b.a(-2022051331);
                   a.o(obj1, "Singleton.get\(OnlineSystraceManager::class.java\)");
                   b.a(-2022051331).j(obj1.a().mTaskID, l.f, 1, oobject2);
                }
                obj1 = l.q;
                if (obj1 == null) {
                   a.S("mOutputZstdFile");
                }
                FileOutputStream uFileOutputS = new FileOutputStream(obj1, 0);
                l.r = uFileOutputS;
                FileChannel channel = uFileOutputS.getChannel();
                a.o(channel, "mOutputZstdOutputStream.channel");
                l.s = channel;
                uFile = l.t;
                f = "mOutputMmapFile";
                if (uFile == null) {
                   a.S(f);
                }
                if (!uFile.exists()) {
                   uFile = l.t;
                   if (uFile == null) {
                      a.S(f);
                   }
                   uFile.createNewFile();
                }
                obj = l.t;
                if (obj == null) {
                   a.S(f);
                }
                RandomAccessFile randomAccess = new RandomAccessFile(obj, "rw");
                l.u = randomAccess;
                randomAccess.setLength(0x8000);
                randomAccess = l.u;
                if (randomAccess == null) {
                   a.S("mOutputMmapRAFFile");
                }
                channel = randomAccess.getChannel();
                a.o(channel, "mOutputMmapRAFFile.channel");
                l.v = channel;
                f = "mOutputMmapRAFFileChannel";
                if (channel == null) {
                   a.S(f);
                }
                FileChannel$MapMode rEAD_WRITE = FileChannel$MapMode.READ_WRITE;
                str = null;
                FileChannel v = l.v;
                if (v == null) {
                   a.S(f);
                }
                MappedByteBuffer mappedByteBu = channel.map(rEAD_WRITE, str, v.size());
                FileChannel s = l.s;
                if (s == null) {
                   a.S("mOutputZstdFileChannel");
                }
                l.w = new ZstdDirectBufferCompressingStream(mappedByteBu, 3, s);
                l.y = new Thread(l$a.b);
                l.z = new Thread(l$b.b);
                Thread y = l.y;
                if (y == null) {
                   a.S("mSamplingThread");
                }
                y.start();
                y = l.z;
                if (y == null) {
                   a.S("mDataProcessThread");
                }
                y.start();
                l.k = SystemClock.elapsedRealtime();
                l.j = SampleState.AFTER_BEGIN_TRACE;
                return 1;
             }
          }
       }
    }
    public final boolean c(long p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, ol, "7");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (l.j != SampleState.AFTER_BEGIN_TRACE) {
          l.j.name();
          return b;
       }else if(p0 - l.n){
          return b;
       }else {
          l.p.size();
          OnlineSystraceInterceptor onlineSystra = OnlineSystraceInterceptor.a();
          Objects.requireNonNull(onlineSystra);
          if (!PatchProxy.applyVoid(null, onlineSystra, OnlineSystraceInterceptor.class, "4")) {
             onlineSystra.a = Boolean.FALSE;
          }
          int i = 2;
          if (l.e == i) {
             Object obj1 = b.a(-2022051331);
             a.o(obj1, "Singleton.get\(OnlineSystraceManager::class.java\)");
             b.a(-2022051331).j(obj1.a().mTaskID, l.f, i, null);
          }
          Thread thread = new Thread(l$c.b);
          l.A = thread;
          thread.start();
          return true;
       }
    }
    public final String d(int p0,String p1,Number p2,long p3,Object p4,String p5){
       Object obj;
       long l;
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,Long.valueOf(p3),p4,p5};
          obj = PatchProxy.apply(objArray, this, ol, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "threadName");
       a.p(p2, "threadId");
       a.p(p4, "obj");
       a.p(p5, "type");
       int i = p5.hashCode();
       if (i != 66) {
          if (i != 69) {
             if (i != 98) {
                if (i != 101 || !p5.equals("e")) {
                label_00e0 :
                   l = (long)1000;
                   return p1+'|'+p2+"|1|"+(((p3 * l) * l) + 1)+"|B|999999|error type: "+p5+10;
                }
             }else if(p5.equals("b")){
             label_00ac :
                l = (long)1000;
                return p1+'|'+p2+"|1|"+(((p3 * l) * l) + 1)+"|B|"+p0+'|'+p4.toString()+10;
             }else {
                goto label_00e0 ;
             }
          }else if(p5.equals("E")){
          }
          l = (long)1000;
          return p1+'|'+p2+"|1|"+(((p3 * l) * l) + 1)+"|E\n";
       }else if(p5.equals("B")){
          goto label_00ac ;
       }else {
          goto label_00e0 ;
       }
    }
    public final long e(){
       return (1000 / (long)l.c);
    }
    public final boolean f(){
       Object obj = PatchProxy.apply(null, this, l.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       "plt-base".b("plt-base");
       "plt-unwind".b("plt-unwind");
       "exception-handler".b("exception-handler");
       SystemUtil.r(e0.b);
       if (l.B) {
          return true;
       }
       if (BacktraceUtil.d()) {
          return false;
       }
       l.j = SampleState.AFTER_INIT;
       l.B = true;
       return true;
    }
}
