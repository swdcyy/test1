package com.kwai.video.wayne.player.KwaiMediaPlayerInstanceManager;
import java.util.LinkedList;
import java.lang.Object;
import com.kwai.video.wayne.player.OnPlayerInstanceHandler;
import com.kwai.video.wayne.player.InstancePriority;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.video.wayne.player.MediaPlayerInstanceRecord;
import java.lang.StringBuilder;
import com.kwai.video.wayne.player.util.DebugLog;
import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public final class KwaiMediaPlayerInstanceManager	// class@000ca7
{
    public static final KwaiMediaPlayerInstanceManager INSTANCE;
    public static final List mMediaPlayerInstanceRecords;

    static {
       KwaiMediaPlayerInstanceManager.INSTANCE = new KwaiMediaPlayerInstanceManager();
       KwaiMediaPlayerInstanceManager.mMediaPlayerInstanceRecords = new LinkedList();
    }
    public void KwaiMediaPlayerInstanceManager(){
       super();
    }
    public final void addMediaPlayerInstance(int p0,OnPlayerInstanceHandler p1,InstancePriority p2){
       if (PatchProxy.isSupport(KwaiMediaPlayerInstanceManager.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, KwaiMediaPlayerInstanceManager.class, "1")) {
          return;
       }
       a.p(p1, "listener");
       a.p(p2, "priority");
       if (this.findRecord(p0) != null) {
          DebugLog.e("KwaiMediaPlayerInstanceManager", "instance of id@"+p0+" already add, do nothing");
          return;
       }else if(p2 == InstancePriority.PriorityFocus){
          this.loseFocusIfNeeded();
       }
       MediaPlayerInstanceRecord mediaPlayerI = new MediaPlayerInstanceRecord(p0, p1, p2);
       p0 = 0;
       Iterator iterator = KwaiMediaPlayerInstanceManager.mMediaPlayerInstanceRecords.iterator();
       while (iterator.hasNext() && iterator.next().getPriority().getPriority() < p2.getPriority()) {
          p0++;
       }
       KwaiMediaPlayerInstanceManager.mMediaPlayerInstanceRecords.add(p0, mediaPlayerI);
       mediaPlayerI.getInstanceHandler().onPriorityChanged(null, p2);
       this.checkMediaPlayerInstanceIfNeeded();
       return;
    }
    public final void checkMediaPlayerInstanceIfNeeded(){
       MediaPlayerInstanceRecord mediaPlayerI;
       if (PatchProxy.applyVoid(null, this, KwaiMediaPlayerInstanceManager.class, "4")) {
          return;
       }
       int i = 0;
       int i1 = KwaiMediaPlayerInstanceManager.mMediaPlayerInstanceRecords.size();
       while (i < i1) {
          if (i >= 4) {
             mediaPlayerI = KwaiMediaPlayerInstanceManager.mMediaPlayerInstanceRecords.get(i);
             if (mediaPlayerI.getInstanceHandler().hasInstance()) {
                mediaPlayerI.getInstanceHandler().onRelease();
             }
          }else {
             mediaPlayerI = KwaiMediaPlayerInstanceManager.mMediaPlayerInstanceRecords.get(i);
             if (!mediaPlayerI.getInstanceHandler().hasInstance()) {
                mediaPlayerI.getInstanceHandler().onRestore();
             }
          }
          i = i + 1;
       }
       return;
    }
    public final MediaPlayerInstanceRecord findMediaPlayerRecord(int p0){
       Iterator obj;
       MediaPlayerInstanceRecord mediaPlayerI;
       KwaiMediaPlayerInstanceManager kwaiMediaPla = KwaiMediaPlayerInstanceManager.class;
       if (PatchProxy.isSupport(kwaiMediaPla)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, kwaiMediaPla, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = KwaiMediaPlayerInstanceManager.mMediaPlayerInstanceRecords.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return null;
          }
          mediaPlayerI = obj.next();
          if (p0 == mediaPlayerI.getId()) {
             break ;
          }
       }
       return mediaPlayerI;
    }
    public final MediaPlayerInstanceRecord findRecord(int p0){
       Iterator obj;
       MediaPlayerInstanceRecord mediaPlayerI;
       KwaiMediaPlayerInstanceManager kwaiMediaPla = KwaiMediaPlayerInstanceManager.class;
       if (PatchProxy.isSupport(kwaiMediaPla)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, kwaiMediaPla, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = KwaiMediaPlayerInstanceManager.mMediaPlayerInstanceRecords.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return null;
          }
          mediaPlayerI = obj.next();
          if (mediaPlayerI.getId() == p0) {
             break ;
          }
       }
       return mediaPlayerI;
    }
    public final int getKernelPlayerCount(InstancePriority p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiMediaPlayerInstanceManager.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       Iterator iterator = KwaiMediaPlayerInstanceManager.mMediaPlayerInstanceRecords.iterator();
       while (iterator.hasNext()) {
          MediaPlayerInstanceRecord mediaPlayerI = iterator.next();
          if (mediaPlayerI.getInstanceHandler().hasInstance() && (p0 == null || p0 == mediaPlayerI.getPriority())) {
             i = i + 1;
          }
       }
       return i;
    }
    public final void loseFocusIfNeeded(){
       if (PatchProxy.applyVoid(null, this, KwaiMediaPlayerInstanceManager.class, "2")) {
          return;
       }
       Iterator iterator = KwaiMediaPlayerInstanceManager.mMediaPlayerInstanceRecords.iterator();
       while (iterator.hasNext()) {
          MediaPlayerInstanceRecord mediaPlayerI = iterator.next();
          InstancePriority priorityFocu = InstancePriority.PriorityFocus;
          if (mediaPlayerI.getPriority() == priorityFocu) {
             mediaPlayerI.setPriority(InstancePriority.PriorityDecode);
             mediaPlayerI.getInstanceHandler().onPriorityChanged(priorityFocu, mediaPlayerI.getPriority());
             break ;
          }
       }
       return;
    }
    public final void removeMediaPlayerInstance(int p0){
       KwaiMediaPlayerInstanceManager kwaiMediaPla = KwaiMediaPlayerInstanceManager.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kwaiMediaPla, "5")) {
          return;
       }
       MediaPlayerInstanceRecord mediaPlayerI = this.findRecord(p0);
       if (mediaPlayerI == null) {
          DebugLog.e("KwaiMediaPlayerInstanceManager", "do not found instance for id@"+p0+", do nothing");
          return;
       }else {
          KwaiMediaPlayerInstanceManager.mMediaPlayerInstanceRecords.remove(mediaPlayerI);
          this.checkMediaPlayerInstanceIfNeeded();
          return;
       }
    }
    public final void updateInstancePriority(int p0,InstancePriority p1){
       KwaiMediaPlayerInstanceManager kwaiMediaPla = KwaiMediaPlayerInstanceManager.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, kwaiMediaPla, "6")) {
          return;
       }
       a.p(p1, "priority");
       MediaPlayerInstanceRecord mediaPlayerI = this.findRecord(p0);
       if (mediaPlayerI == null) {
          DebugLog.e("KwaiMediaPlayerInstanceManager", "do not found instance for id@"+p0+", do nothing");
          return;
       }else if(p1 == mediaPlayerI.getPriority()){
          return;
       }else if(p1 == InstancePriority.PriorityFocus){
          this.loseFocusIfNeeded();
       }
       mediaPlayerI.getInstanceHandler().onPriorityChanged(mediaPlayerI.getPriority(), p1);
       mediaPlayerI.setPriority(p1);
       List mMediaPlayer = KwaiMediaPlayerInstanceManager.mMediaPlayerInstanceRecords;
       mMediaPlayer.remove(mediaPlayerI);
       int i = 0;
       Iterator iterator = mMediaPlayer.iterator();
       while (iterator.hasNext() && iterator.next().getPriority().getPriority() <= p1.getPriority()) {
          i = i + 1;
       }
       KwaiMediaPlayerInstanceManager.mMediaPlayerInstanceRecords.add(i, mediaPlayerI);
       this.checkMediaPlayerInstanceIfNeeded();
       return;
    }
}
