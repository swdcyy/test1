package com.kwai.component.tti.monitor.TTIData;
import java.io.Serializable;
import com.yxcorp.utility.SystemUtil;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.Long;
import java.util.List;
import com.kwai.component.tti.monitor.TTITouchEvent;
import java.lang.Double;
import java.lang.Float;
import android.os.SystemClock;
import com.kwai.component.tti.monitor.TTIFrame;
import java.lang.StringBuilder;
import w1.k;
import java.lang.Math;
import com.kwai.performance.fluency.jank.monitor.JankMonitor;
import java.lang.Number;
import ph5.i;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.lang.Boolean;
import java.util.Collection;

public class TTIData implements Serializable	// class@000bca
{
    public String activityId;
    public long avgFrame;
    public boolean b;
    public long begin;
    public long beginUptimeMillis;
    public int bigJankCount;
    public long bigJankDuration;
    public long cold;
    public int errorJankCount;
    public long fpsTTITime;
    public long frameTTITime;
    public List frameTsList;
    public List frames;
    public boolean isDanmuopen;
    public boolean isSwitch;
    public int jankCount;
    public int lastTTIFrameIndex;
    public int latestLongFrameIndex;
    public String page;
    public int scrolled;
    public boolean scrolledInTTI;
    public long start;
    public int tapped;
    public boolean tappedInTTI;
    public boolean ttiTimeFinished;
    public List uiEvents;
    public static TTIData c;
    public static boolean d;

    static {
       TTIData.d = SystemUtil.P();
    }
    public void TTIData(){
       super();
       this.errorJankCount = 0;
       this.bigJankCount = 0;
       this.jankCount = 0;
       this.lastTTIFrameIndex = 0;
       this.bigJankDuration = 0;
       this.frames = new ArrayList();
       this.frameTsList = new ArrayList();
       this.uiEvents = new ArrayList();
       this.fpsTTITime = 0;
       this.frameTTITime = 0x7530;
       this.avgFrame = 0;
       this.latestLongFrameIndex = 0;
       this.ttiTimeFinished = false;
    }
    public static TTIData getInstance(){
       TTIData obj = PatchProxy.apply(null, null, TTIData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TTIData.c == null) {
          obj = TTIData.class;
          _monitor_enter(obj);
          if (TTIData.c == null) {
             TTIData.c = new TTIData();
          }
          _monitor_exit(obj);
       }
       return TTIData.c;
    }
    public void addEvent(int p0,long p1){
       if (PatchProxy.isSupport(TTIData.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Long.valueOf(p1), this, TTIData.class, "4")) {
          return;
       }
       if (this.uiEvents.size() < 100) {
          this.uiEvents.add(new TTITouchEvent(p0, p1));
       }
       return;
    }
    public void addFrame(double p0,float p1){
       TTIData frames;
       int i1;
       TTIData tTIData = this;
       if (PatchProxy.isSupport(TTIData.class) && PatchProxy.applyVoidTwoRefs(Double.valueOf(p0), Float.valueOf(p1), this, TTIData.class, "5")) {
          return;
       }
       if (tTIData.frames.size() < 200) {
          long l = SystemClock.elapsedRealtime();
          long l1 = 1000;
          if (!tTIData.frames.isEmpty()) {
             frames = tTIData.frames;
             int i = 1;
             TTIFrame tTIFrame = frames.get((frames.size() - i));
             i1 = (int)((l - tTIFrame.time) / l1) - i;
             if (i1 > 0) {
                for (; i <= i1; i = i + 1) {
                   TTIData frames1 = tTIData.frames;
                   int i2 = i * 1000;
                   long l2 = tTIFrame.time + (long)i2;
                   TTIFrame tTIFrame1 = new TTIFrame(frames1.size(), l2, 0, 0);
                   frames1.add(v4);
                }
             }
          }else {
             int i3 = (int)((l - tTIData.start) / l1);
             if (i3 > 0) {
                while (i3 > 0) {
                   TTIData frames2 = tTIData.frames;
                   int i4 = i3 * 1000;
                   long l3 = l - (long)i4;
                   TTIFrame tTIFrame3 = new TTIFrame(frames2.size(), l3, 0, 0);
                   frames2.add(v3);
                   i3 = i3 - 1;
                }
             }
          }
          frames = tTIData.frames;
          TTIFrame tTIFrame2 = new TTIFrame(frames.size(), l, (int)p0, p1);
          frames.add(i1);
       }
       return;
    }
    public void addFrameTs(long p0){
       if (PatchProxy.isSupport(TTIData.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, TTIData.class, "3")) {
          return;
       }
       if (this.frameTsList.size() < 3600) {
          if (TTIData.d) {
             k.a("kwai_addFrameTs_"+this.frameTsList.size()+"_"+p0+"_"+this.beginUptimeMillis);
             k.b();
          }
          this.frameTsList.add(Long.valueOf(p0));
          int i = this.frameTsList.size();
          int i1 = 2;
          if (i > i1) {
             int i2 = i - 1;
             int i3 = 1;
             if (Math.abs((this.frameTsList.get(i2).longValue() - this.frameTsList.get((i - i1)).longValue())) - 84 > 0) {
                this.latestLongFrameIndex = this.frameTsList.size() - i3;
             }
             if (this.ttiTimeFinished == null && (i2 - this.latestLongFrameIndex) > 300) {
                this.ttiTimeFinished = i3;
                JankMonitor.optimize("TTI.Vsync", false);
                TTIData tlatestLongF = this.latestLongFrameIndex;
                if (tlatestLongF == null) {
                   this.frameTTITime = 0;
                }else {
                   this.frameTTITime = this.frameTsList.get(tlatestLongF).longValue() - this.beginUptimeMillis;
                }
             }
          }
       }
    label_00c1 :
       return;
    }
    public void cleanData(){
       if (PatchProxy.applyVoid(null, this, TTIData.class, "2")) {
          return;
       }
       this.frames.clear();
       this.frameTsList.clear();
       this.uiEvents.clear();
       return;
    }
    public long computeFpsTTITime(){
       int i;
       TTIFrame tTIFrame;
       TTIData obj = PatchProxy.apply(null, this, TTIData.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (!this.isValid()) {
          return -1;
       }
       int intx = i.a.getInt("TTIMonitorDiffValue", 5);
       Iterator iterator = this.frames.iterator();
       i = 0;
       int i1 = 0;
       while (true) {
          if (iterator.hasNext()) {
             tTIFrame = iterator.next();
             if (tTIFrame == null) {
                continue ;
             }else if(!tTIFrame.isJank()){
                TTIFrame fps = tTIFrame.fps;
                if (fps < i) {
                   i = i - fps;
                   if (i > intx) {
                   label_004e :
                      i1 = 0;
                   label_004f :
                      i = tTIFrame.fps;
                      if (i1 == 4) {
                         break ;
                      }
                   }
                }
                i1 = i1 + 1;
                goto label_004f ;
             }else {
                goto label_004e ;
             }
          }else {
             obj = this.frames;
             return (obj.get((obj.size() - 1)).time - this.begin);
          }
       }
       return (this.frames.get((tTIFrame.index - 3)).time - this.begin);
    }
    public void computeTTIJankLevel(){
       int i;
       int i1;
       long l;
       int i2;
       long l1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TTIData.class, "8")) {
          return;
       }
       Object obj = PatchProxy.apply(objArray, this, TTIData.class, "7");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          i = 0;
          i2 = 0;
          while (true) {
             int i3 = this.frameTsList.size() - 301;
             if (i2 < i3) {
                i3 = 0;
                while (true) {
                   if (i3 <= 300) {
                      i1 = i2 + i3;
                      int i4 = i1 + 1;
                      long l2 = this.frameTsList.get(i4).longValue() - this.frameTsList.get(i1).longValue();
                      if (Math.abs(l2) - 84 > 0) {
                         i2 = i1;
                         i3 = 0;
                      label_0060 :
                         if (i3) {
                            i3 = i2 + 300;
                            if (i3 >= this.frameTsList.size()) {
                               i3 = this.frameTsList.size() - 1;
                            }
                            long l3 = this.frameTsList.get(i3).longValue() - this.frameTsList.get(i2).longValue();
                            i3 = i3 - i2;
                            l3 = Long.valueOf(l3).longValue() / (long)i3;
                            this.avgFrame = l3;
                            if (l3 - 84 < 0) {
                               i = i2;
                            }
                         }
                         i2 = i2 + 1;
                      }else {
                         i3 = i3 + 1;
                      }
                   }else {
                      i3 = 1;
                      goto label_0060 ;
                   }
                }
                return;
             }else {
                while (true) {
                   if (i < this.frameTsList.size()) {
                      l = this.frameTsList.get(i).longValue() - this.beginUptimeMillis;
                      if (l - 0x7530 < 0) {
                         i = i + 1;
                      }
                   }else {
                      i = 1800;
                   }
                }
             }
          }
       }
       this.lastTTIFrameIndex = i;
       i = 1;
       while (i <= this.lastTTIFrameIndex && i < this.frameTsList.size()) {
          i1 = i - 1;
          l = this.frameTsList.get(i).longValue() - this.frameTsList.get(i1).longValue();
          if (l - 336 >= 0) {
             i2 = this.errorJankCount + 1;
             this.errorJankCount = i2;
             l1 = this.bigJankDuration + l;
             this.bigJankDuration = l1;
          }else if(l - 84 >= 0){
             i2 = this.bigJankCount + 1;
             this.bigJankCount = i2;
             l1 = this.bigJankDuration + l;
             this.bigJankDuration = l1;
          }else if(l - 16 >= 0){
             i2 = this.jankCount + 1;
             this.jankCount = i2;
          }
          i = i + 1;
       }
    }
    public boolean getDataComputed(){
       return this.b;
    }
    public boolean isOverTTITime(){
       return this.ttiTimeFinished;
    }
    public boolean isValid(){
       Object obj = PatchProxy.apply(null, this, TTIData.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.frames.size() >= 4 && this.frameTsList.size() > 100)? true: false;
       return b;
    }
    public void processUiEventsData(){
       int i1;
       if (PatchProxy.applyVoid(null, this, TTIData.class, "10")) {
          return;
       }
       this.tapped = 0;
       this.scrolled = 0;
       this.tappedInTTI = false;
       this.scrolledInTTI = false;
       ArrayList uArrayList = new ArrayList(this.uiEvents);
       if (this.frameTsList.size() > 0) {
          long l = this.beginUptimeMillis + this.frameTTITime;
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             TTITouchEvent tTITouchEven = iterator.next();
             if (tTITouchEven.time - l <= 0) {
                tTITouchEven = tTITouchEven.eventType;
                int i = 1;
                if (tTITouchEven == i) {
                   i1 = this.tapped + i;
                   this.tapped = i1;
                   this.tappedInTTI = i;
                }else if(tTITouchEven == 3){
                   i1 = this.scrolled + i;
                   this.scrolled = i1;
                   this.scrolledInTTI = i;
                }
             }
          }
       }
       return;
    }
    public void setDataComputed(){
       this.b = true;
    }
    public boolean setTTITimeOver(){
       this.ttiTimeFinished = true;
       return true;
    }
    public boolean shouldSchduleNormal(){
       Object obj = PatchProxy.apply(null, this, TTIData.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.isOverTTITime() && (this.frameTsList.size() - this.latestLongFrameIndex) > 60) {
          return true;
       }
       return false;
    }
}
