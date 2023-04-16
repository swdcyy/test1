package com.kwai.video.wayne.player.callback.AwesomeCacheCallbackWrapper;
import com.kwai.video.cache.AwesomeCacheCallback;
import java.util.concurrent.CopyOnWriteArraySet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import com.kwai.video.cache.AcCallBackInfo;
import java.util.Iterator;

public class AwesomeCacheCallbackWrapper extends AwesomeCacheCallback	// class@000cc7
{
    public final Set mCallbacks;
    public final Set mNOClearCallbacks;

    public void AwesomeCacheCallbackWrapper(){
       super();
       this.mCallbacks = new CopyOnWriteArraySet();
       this.mNOClearCallbacks = new CopyOnWriteArraySet();
    }
    public void add(AwesomeCacheCallback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AwesomeCacheCallbackWrapper.class, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.mCallbacks.add(p0);
       return;
    }
    public void addNoClearCallBacks(AwesomeCacheCallback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AwesomeCacheCallbackWrapper.class, "2")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.mNOClearCallbacks.add(p0);
       return;
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, AwesomeCacheCallbackWrapper.class, "3")) {
          return;
       }
       this.mCallbacks.clear();
       return;
    }
    public void onDownloadFinish(AcCallBackInfo p0){
       AwesomeCacheCallback uAwesomeCach;
       if (PatchProxy.applyVoidOneRefs(p0, this, AwesomeCacheCallbackWrapper.class, "7")) {
          return;
       }
       Iterator iterator = this.mCallbacks.iterator();
       while (iterator.hasNext()) {
          uAwesomeCach = iterator.next();
          if (uAwesomeCach != null) {
             uAwesomeCach.onDownloadFinish(p0);
          }
       }
       iterator = this.mNOClearCallbacks.iterator();
       while (iterator.hasNext()) {
          uAwesomeCach = iterator.next();
          if (uAwesomeCach != null) {
             uAwesomeCach.onDownloadFinish(p0);
          }
       }
       return;
    }
    public void onSessionProgress(AcCallBackInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AwesomeCacheCallbackWrapper.class, "6")) {
          return;
       }
       Iterator iterator = this.mCallbacks.iterator();
       while (iterator.hasNext()) {
          iterator.next().onSessionProgress(p0);
       }
       iterator = this.mNOClearCallbacks.iterator();
       while (iterator.hasNext()) {
          iterator.next().onSessionProgress(p0);
       }
       return;
    }
    public void remove(AwesomeCacheCallback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AwesomeCacheCallbackWrapper.class, "4")) {
          return;
       }
       this.mCallbacks.remove(p0);
       return;
    }
    public void removeNoClearCallBacks(AwesomeCacheCallback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AwesomeCacheCallbackWrapper.class, "5")) {
          return;
       }
       this.mNOClearCallbacks.remove(p0);
       return;
    }
}
