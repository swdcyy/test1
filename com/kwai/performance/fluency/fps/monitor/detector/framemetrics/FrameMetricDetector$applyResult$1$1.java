package com.kwai.performance.fluency.fps.monitor.detector.framemetrics.FrameMetricDetector$applyResult$1$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import te7.a;
import ye7.a;
import java.lang.Object;
import qrd.l1;
import java.lang.String;
import kotlin.jvm.internal.a;
import te7.a$a;
import te7.b;
import te7.a$b;
import java.util.ArrayList;
import nsd.r0;
import java.util.Locale;
import java.lang.Integer;
import java.util.Arrays;
import java.util.Map;
import ye7.b;
import org.json.JSONObject;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Number;
import java.util.LinkedHashMap;

public final class FrameMetricDetector$applyResult$1$1 extends Lambda implements a	// class@00106f
{
    public final a $fpsEvent;
    public final a $result;

    public void FrameMetricDetector$applyResult$1$1(a p0,a p1){
       this.$result = p0;
       this.$fpsEvent = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       int i3;
       int i4;
       Object[] objArray;
       String str3;
       String obj;
       a d;
       Map$Entry uEntry;
       int i6;
       a q;
       a$a a;
       FrameMetricDetector$applyResult$1$1 t$result = this.$result;
       if (t$result == null) {
       }else {
          String str = "<this>";
          a.p(t$result, str);
          t$result.b = ((double)t$result.c * 0x3ff0000000000000) / (double)t$result.d;
          a$a uoa = new a$a();
          uoa.a = (double)b.d(b.b(t$result, 50));
          t$result.k = uoa;
          uoa = new a$a();
          uoa.a = (double)b.d(b.b(t$result, 90));
          t$result.l = uoa;
          uoa = new a$a();
          uoa.a = (double)b.d(b.b(t$result, 95));
          t$result.m = uoa;
          uoa = new a$a();
          uoa.a = (double)b.d(b.b(t$result, 99));
          t$result.n = uoa;
          int i = t$result.o.a.size() - 1;
          String str1 = "java.lang.String.format\(locale, format, *args\)";
          String str2 = "%d";
          int i1 = 0;
          int i2 = 1;
          if (i >= 0) {
             i3 = 0;
             i4 = i3 + 1;
             objArray = new Object[i2];
             objArray[i1] = Integer.valueOf(b.d(i3));
             str3 = String.format(Locale.US, str2, Arrays.copyOf(objArray, i2));
             a.o(str3, str1);
             obj = t$result.o.a.get(i3);
             a.o(obj, "profileData.frameCountBucket[i]");
             t$result.j.put(str3, obj);
             while (i4 <= i) {
                i3 = i4;
             }
          }
          i = t$result.o.b.size() - 1;
          if (i >= 0) {
             i3 = 0;
             i4 = i3 + 1;
             objArray = new Object[i2];
             int i5 = i3 * 50;
             i5 = i5 + 150;
             objArray[i1] = Integer.valueOf(i5);
             str3 = String.format(Locale.US, str2, Arrays.copyOf(objArray, i2));
             a.o(str3, str1);
             obj = t$result.o.b.get(i3);
             a.o(obj, "profileData.slowFrameCountBucket[i]");
             t$result.j.put(str3, obj);
             while (i4 <= i) {
                i3 = i4;
             }
          }
          FrameMetricDetector$applyResult$1$1 t$fpsEvent = this.$fpsEvent;
          a.p(t$result, str);
          a.p(t$fpsEvent, "fpsEvent");
          d = t$result.d;
          t$fpsEvent.totalFrameCount = d;
          t$fpsEvent.jankyFrameCount = t$result.c;
          double d1 = (double)d;
          t$fpsEvent.inputHandlingDuration = (double)t$result.s / d1;
          t$fpsEvent.animationDuration = (double)t$result.t / d1;
          t$fpsEvent.layoutMeasureDuration = (double)t$result.u / d1;
          t$fpsEvent.drawDuration = (double)t$result.v / d1;
          t$fpsEvent.syncDuration = (double)t$result.w / d1;
          t$fpsEvent.commandIssueDuration = (double)t$result.x / d1;
          t$fpsEvent.swapBuffersDuration = (double)t$result.y / d1;
          t$fpsEvent.unknownDelayDuration = (double)t$result.z / d1;
          t$fpsEvent.highInputLatency = t$result.e;
          t$fpsEvent.slowUIThread = t$result.f;
          t$fpsEvent.slowIssueDrawCommands = t$result.g;
          t$fpsEvent.frameDeadlineMissed = t$result.h;
          t$fpsEvent.missVsyncCount = t$result.i;
          double d2 = (double)t$result.a;
          t$fpsEvent.refreshRateInterval = d2;
          t$fpsEvent.refreshRate = (int)(0x408f400000000000 / d2);
          t$fpsEvent.smallJankCount = t$result.A;
          t$fpsEvent.smallJankDuration = (double)t$result.D;
          t$fpsEvent.tinyJankDuration = (double)t$result.F;
          t$fpsEvent.tinyJankCount = t$result.C;
          t$fpsEvent.bigJankCount = t$result.B;
          t$fpsEvent.bigJankDuration = (double)t$result.E;
          JSONObject jSONObject = new JSONObject();
          Iterator iterator = t$result.j.entrySet().iterator();
          while (iterator.hasNext()) {
             uEntry = iterator.next();
             obj = uEntry.getKey();
             i6 = uEntry.getValue().intValue();
             if (i6 > 0) {
                jSONObject.put(obj, i6);
             }
          }
          LinkedHashMap linkedHashMa = new LinkedHashMap();
          Iterator iterator1 = t$result.j.entrySet().iterator();
          while (iterator1.hasNext()) {
             uEntry = iterator1.next();
             Object obj1 = (uEntry.getValue().intValue() > 0)? 1: null;
             if (obj1) {
                linkedHashMa.put(uEntry.getKey(), uEntry.getValue());
             }
          }
          t$fpsEvent.histogram = linkedHashMa;
          LinkedHashMap linkedHashMa1 = new LinkedHashMap();
          int i7 = t$result.o.d.size() - 1;
          if (i7 >= 0) {
             i6 = i1 + 1;
             i2 = i6 * 10;
             Object obj2 = t$result.o.d.get(i1);
             a.o(obj2, "profileData.jankyRateBucket[i]");
             linkedHashMa1.put(String.valueOf(i2), obj2);
             while (i6 <= i7) {
                i1 = i6;
             }
          }
          t$fpsEvent.jankRateHistogram = linkedHashMa1;
          d = t$result.k;
          double d3 = 0;
          double d4 = (d == null)? d3: d.a;
          t$fpsEvent.percent50Frame = d4;
          d = t$result.l;
          d4 = (d == null)? d3: d.a;
          t$fpsEvent.percent90Frame = d4;
          d = t$result.m;
          d4 = (d == null)? d3: d.a;
          t$fpsEvent.percent95Frame = d4;
          d = t$result.n;
          if (d != null) {
             d3 = d.a;
          }
          t$fpsEvent.percent99Frame = d3;
          t$fpsEvent.perFrameJankyRate = t$result.b;
          a p = t$result.p;
          v1 = p;
          if (d > 0) {
             q = t$result.q;
             if (q > 0) {
                t$fpsEvent.jankyFrameRate = ((double)(q - p) * 0x3ff0000000000000) / (double)q;
             }
          }
          if (d > 0) {
             q = t$result.q;
             if (q > 0) {
                t$fpsEvent.newFPS = (((double)p * 0x3ff0000000000000) / (double)q) * (double)(1000.00f / t$result.a);
             }
          }
       }
       return;
    }
}
