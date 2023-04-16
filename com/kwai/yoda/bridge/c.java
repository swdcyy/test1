package com.kwai.yoda.bridge.c;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import com.kwai.yoda.bridge.c$b;
import com.kwai.yoda.bridge.c$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.middleware.azeroth.Azeroth2;
import android.content.Context;
import android.app.ActivityManager;
import android.app.ActivityManager$MemoryInfo;
import brd.t;
import com.kwai.yoda.bridge.b;
import io.reactivex.g;
import brd.z;
import com.kwai.middleware.azeroth.scheduler.AzerothSchedulers;
import rx7.g;
import erd.g;
import java.io.RandomAccessFile;
import java.lang.Integer;
import yb7.a;
import yb7.o;
import java.math.BigInteger;
import java.util.Iterator;
import java.lang.Thread;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.lang.Throwable;
import java.lang.Boolean;
import o97.a;

public class c	// class@00118c
{
    public boolean a;
    public boolean b;
    public boolean c;
    public final List d;
    public b0 e;
    public c$b f;
    public b g;
    public int h;
    public g i;
    public final Map j;
    public final Map k;
    public final Map l;
    public final Map m;
    public static long n = 0xff;

    public void c(){
       super();
       this.d = new ArrayList();
       this.j = new HashMap();
       this.k = new HashMap();
       this.l = new HashMap();
       this.m = new HashMap();
       this.f = new c$b(null);
    }
    public static long d(){
       ActivityManager obj = PatchProxy.apply(null, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = 0;
       if (c.n - l < 0) {
          obj = Azeroth2.B.d().getSystemService("activity");
          if (obj != null) {
             ActivityManager$MemoryInfo memoryInfo = new ActivityManager$MemoryInfo();
             obj.getMemoryInfo(memoryInfo);
             l = memoryInfo.totalMem;
          }
          c.n = l;
       }
       return c.n;
    }
    public final t a(){
       Object obj = PatchProxy.apply(null, this, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.create(new b(this)).subscribeOn(AzerothSchedulers.a()).observeOn(AzerothSchedulers.b()).doOnNext(new g(this));
    }
    public final float b(){
       Object obj = PatchProxy.apply(null, this, c.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       int i = 0;
       int i1 = 0;
       int i2 = 0;
       String str = null;
       while (true) {
          int i3 = 5;
          if (i2 < i3) {
             str = " +";
             try{
                RandomAccessFile randomAccess = new RandomAccessFile("/proc/stat", "r");
                Integer[] integerArray = new Integer[6];
                integerArray[i] = Integer.valueOf(2);
                integerArray[1] = Integer.valueOf(3);
                integerArray[2] = Integer.valueOf(i3);
                integerArray[3] = Integer.valueOf(6);
                int i4 = 4;
                integerArray[i4] = Integer.valueOf(7);
                integerArray[i3] = Integer.valueOf(8);
                ArrayList uArrayList = a.a(integerArray);
                String[] stringArray = (o.a(randomAccess.readLine())).split(str);
                BigInteger uBigInteger = new BigInteger(stringArray[i4]);
                BigInteger zERO = BigInteger.ZERO;
                Iterator iterator = uArrayList.iterator();
                while (iterator.hasNext()) {
                   zERO = zERO.add(new BigInteger(stringArray[iterator.next().intValue()]));
                }
                long l = 100;
                try{
                   Thread.sleep(l);
                   randomAccess.seek(0);
                   String[] stringArray1 = (o.a(randomAccess.readLine())).split(str);
                   BigInteger uBigInteger1 = new BigInteger(stringArray1[i4]);
                   BigInteger zERO1 = BigInteger.ZERO;
                   Iterator iterator1 = uArrayList.iterator();
                   while (iterator1.hasNext()) {
                      zERO1 = zERO1.add(new BigInteger(stringArray1[iterator1.next().intValue()]));
                   }
                   try{
                      BigInteger uBigInteger2 = zERO1.add(uBigInteger1).subtract(zERO.add(uBigInteger));
                      if (uBigInteger2.compareTo(BigInteger.ZERO) <= 0) {
                         randomAccess.close();
                         str = 0;
                      }else {
                         str = new BigDecimal(zERO1.subtract(zERO)).divide(new BigDecimal(uBigInteger2), 3, RoundingMode.HALF_EVEN).floatValue();
                         randomAccess.close();
                      }
                   }catch(java.io.IOException e0){
                   }
                   if (str - i1 > 0 && str - 0x3f800000 <= 0) {
                   }else {
                      i2 = i2 + 1;
                   }
                }catch(java.lang.InterruptedException e0){
                }
             }catch(java.io.IOException e0){
             }
          }else if(str - 0x3f800000 > 0){
             i1 = 0x3f800000;
          }
          float f = i1;
          break ;
       }
       return str;
    }
    public int c(){
       return this.h;
    }
    public boolean e(){
       a obj = PatchProxy.apply(null, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = Azeroth2.B.q();
       if (obj != null) {
          return obj.H5(null, "yoda_enable_webview_profiling", false);
       }
       return false;
    }
}
