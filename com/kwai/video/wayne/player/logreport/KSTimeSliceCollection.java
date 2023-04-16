package com.kwai.video.wayne.player.logreport.KSTimeSliceCollection;
import java.lang.Object;
import java.util.LinkedList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.SystemClock;
import com.kwai.video.wayne.player.logreport.KSTimeSlice;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Long;

public class KSTimeSliceCollection	// class@000d3b
{
    public final LinkedList mKSTimeSlices;
    public KSTimeSlice mLastKSTimeSlice;
    public final Object mLock;

    public void KSTimeSliceCollection(){
       super();
       this.mLock = new Object();
       this.mKSTimeSlices = new LinkedList();
    }
    public void end(){
       if (PatchProxy.applyVoid(null, this, KSTimeSliceCollection.class, "4")) {
          return;
       }
       KSTimeSliceCollection tmLock = this.mLock;
       _monitor_enter(tmLock);
       KSTimeSliceCollection tmLastKSTime = this.mLastKSTimeSlice;
       if (tmLastKSTime == null) {
          _monitor_exit(tmLock);
          return;
       }else {
          tmLastKSTime.end = SystemClock.elapsedRealtime();
          this.mKSTimeSlices.addLast(this.mLastKSTimeSlice);
          this.mLastKSTimeSlice = null;
          _monitor_exit(tmLock);
          return;
       }
    }
    public long getTimeSliceSum(){
       Object obj = PatchProxy.apply(null, this, KSTimeSliceCollection.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       try{
          return this.getTimeSliceSumInner();
       }catch(java.lang.Exception e0){
          return 0;
       }
    }
    public final long getTimeSliceSumInner(){
       KSTimeSliceCollection obj = PatchProxy.apply(null, this, KSTimeSliceCollection.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.mLock;
       _monitor_enter(obj);
       long l = 0;
       Iterator iterator = this.mKSTimeSlices.iterator();
       while (iterator.hasNext()) {
          KSTimeSlice kSTimeSlice = iterator.next();
          if (kSTimeSlice == null) {
             continue ;
          }else {
             long l1 = kSTimeSlice.end - kSTimeSlice.start;
             l = l + l1;
          }
       }
       _monitor_exit(obj);
       return l;
    }
    public KSTimeSliceCollection merge(KSTimeSliceCollection p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KSTimeSliceCollection.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return this.mergeInner(p0);
       }catch(java.lang.Exception e0){
          return this;
       }
    }
    public final KSTimeSliceCollection mergeInner(KSTimeSliceCollection p0){
       KSTimeSliceCollection obj = PatchProxy.applyOneRefs(p0, this, KSTimeSliceCollection.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mLock;
       _monitor_enter(obj);
       LinkedList linkedList = new LinkedList(p0.mKSTimeSlices);
       if (linkedList.isEmpty()) {
          _monitor_exit(obj);
          return this;
       }else if(this.mKSTimeSlices.isEmpty()){
          this.mKSTimeSlices.addAll(linkedList);
          _monitor_exit(obj);
          return this;
       }else if(this.mKSTimeSlices.getFirst().start - linkedList.getLast().end > 0){
          this.mKSTimeSlices.addAll(0, linkedList);
          _monitor_exit(obj);
          return this;
       }else if(this.mKSTimeSlices.getLast().end - linkedList.getFirst().start < 0){
          this.mKSTimeSlices.addAll(linkedList);
          _monitor_exit(obj);
          return this;
       }else {
          LinkedList linkedList1 = new LinkedList(this.mKSTimeSlices);
          this.mKSTimeSlices.clear();
          while (!linkedList.isEmpty() || !linkedList1.isEmpty()) {
             this.tryAddIntoCurrentList(linkedList.pollFirst());
             this.tryAddIntoCurrentList(linkedList1.pollFirst());
          }
          _monitor_exit(obj);
          return this;
       }
    }
    public void reset(){
       if (PatchProxy.applyVoid(null, this, KSTimeSliceCollection.class, "1")) {
          return;
       }
       KSTimeSliceCollection tmLock = this.mLock;
       _monitor_enter(tmLock);
       this.mKSTimeSlices.clear();
       this.mLastKSTimeSlice = null;
       _monitor_exit(tmLock);
       return;
    }
    public void start(){
       if (PatchProxy.applyVoid(null, this, KSTimeSliceCollection.class, "3")) {
          return;
       }
       if (this.mLastKSTimeSlice != null) {
          return;
       }
       KSTimeSlice kSTimeSlice = new KSTimeSlice();
       this.mLastKSTimeSlice = kSTimeSlice;
       kSTimeSlice.start = SystemClock.elapsedRealtime();
       return;
    }
    public void start(long p0){
       KSTimeSliceCollection kSTimeSliceC = KSTimeSliceCollection.class;
       if (PatchProxy.isSupport(kSTimeSliceC) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, kSTimeSliceC, "2")) {
          return;
       }
       if (p0 - null > 0) {
          if (this.mLastKSTimeSlice != null) {
             return;
          }else {
             KSTimeSlice kSTimeSlice = new KSTimeSlice();
             this.mLastKSTimeSlice = kSTimeSlice;
             kSTimeSlice.start = p0;
          }
       }else {
          this.start();
       }
       return;
    }
    public final void tryAddIntoCurrentList(KSTimeSlice p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSTimeSliceCollection.class, "9")) {
          return;
       }
       KSTimeSliceCollection tmLock = this.mLock;
       _monitor_enter(tmLock);
       if (p0 != null) {
          if (this.mKSTimeSlices.isEmpty()) {
             this.mKSTimeSlices.add(p0.copy());
          }else {
             KSTimeSlice last = this.mKSTimeSlices.getLast();
             if (!last.tryMerge(p0)) {
                if (p0.start - last.end > 0) {
                   this.mKSTimeSlices.add(p0.copy());
                }else if(p0.end - last.start < 0){
                   KSTimeSliceCollection tmKSTimeSlic = this.mKSTimeSlices;
                   tmKSTimeSlic.add(tmKSTimeSlic.indexOf(last), p0.copy());
                }
             }
          }
       }
       _monitor_exit(tmLock);
       return;
    }
}
