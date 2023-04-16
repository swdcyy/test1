package com.facebook.imagepipeline.listener.ForwardingRequestListener;
import dd.d;
import java.util.Set;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.lang.String;
import java.lang.Throwable;
import cb.a;
import id.f0;
import java.util.Map;
import com.facebook.imagepipeline.request.ImageRequest;

public class ForwardingRequestListener implements d	// class@00047e
{
    public final List mRequestListeners;

    public void ForwardingRequestListener(Set p0){
       super();
       this.mRequestListeners = new ArrayList(p0.size());
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          d uod = iterator.next();
          if (uod != null) {
             this.mRequestListeners.add(uod);
          }
       }
       return;
    }
    public void ForwardingRequestListener(d[] p0){
       super();
       this.mRequestListeners = new ArrayList(p0.length);
       int len = p0.length;
       int i = 0;
       while (i < len) {
          object oobject = p0[i];
          if (oobject != null) {
             this.mRequestListeners.add(oobject);
          }
          i = i + 1;
       }
       return;
    }
    public void addRequestListener(d p0){
       this.mRequestListeners.add(p0);
    }
    public final void onException(String p0,Throwable p1){
       a.h("ForwardingRequestListener", p0, p1);
    }
    public void onProducerEvent(String p0,String p1,String p2){
       int i = this.mRequestListeners.size();
       int i1 = 0;
       while (i1 < i) {
          d uod = this.mRequestListeners.get(i1);
          try{
             uod.onProducerEvent(p0, p1, p2);
          }catch(java.lang.Exception e2){
             this.onException("InternalListener exception in onIntermediateChunkStart", e2);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public void onProducerFinishWithCancellation(String p0,String p1,Map p2){
       int i = this.mRequestListeners.size();
       int i1 = 0;
       while (i1 < i) {
          d uod = this.mRequestListeners.get(i1);
          try{
             uod.onProducerFinishWithCancellation(p0, p1, p2);
          }catch(java.lang.Exception e2){
             this.onException("InternalListener exception in onProducerFinishWithCancellation", e2);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public void onProducerFinishWithFailure(String p0,String p1,Throwable p2,Map p3){
       int i = this.mRequestListeners.size();
       int i1 = 0;
       while (i1 < i) {
          d uod = this.mRequestListeners.get(i1);
          try{
             uod.onProducerFinishWithFailure(p0, p1, p2, p3);
          }catch(java.lang.Exception e2){
             this.onException("InternalListener exception in onProducerFinishWithFailure", e2);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public void onProducerFinishWithSuccess(String p0,String p1,Map p2){
       int i = this.mRequestListeners.size();
       int i1 = 0;
       while (i1 < i) {
          d uod = this.mRequestListeners.get(i1);
          try{
             uod.onProducerFinishWithSuccess(p0, p1, p2);
          }catch(java.lang.Exception e2){
             this.onException("InternalListener exception in onProducerFinishWithSuccess", e2);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public void onProducerStart(String p0,String p1){
       int i = this.mRequestListeners.size();
       int i1 = 0;
       while (i1 < i) {
          d uod = this.mRequestListeners.get(i1);
          try{
             uod.onProducerStart(p0, p1);
          }catch(java.lang.Exception e2){
             this.onException("InternalListener exception in onProducerStart", e2);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public void onRequestCancellation(String p0){
       int i = this.mRequestListeners.size();
       int i1 = 0;
       while (i1 < i) {
          d uod = this.mRequestListeners.get(i1);
          try{
             uod.onRequestCancellation(p0);
          }catch(java.lang.Exception e2){
             this.onException("InternalListener exception in onRequestCancellation", e2);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public void onRequestFailure(ImageRequest p0,String p1,Throwable p2,boolean p3){
       int i = this.mRequestListeners.size();
       int i1 = 0;
       while (i1 < i) {
          d uod = this.mRequestListeners.get(i1);
          try{
             uod.onRequestFailure(p0, p1, p2, p3);
          }catch(java.lang.Exception e2){
             this.onException("InternalListener exception in onRequestFailure", e2);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public void onRequestStart(ImageRequest p0,Object p1,String p2,boolean p3){
       int i = this.mRequestListeners.size();
       int i1 = 0;
       while (i1 < i) {
          d uod = this.mRequestListeners.get(i1);
          try{
             uod.onRequestStart(p0, p1, p2, p3);
          }catch(java.lang.Exception e2){
             this.onException("InternalListener exception in onRequestStart", e2);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public void onRequestSuccess(ImageRequest p0,String p1,boolean p2){
       int i = this.mRequestListeners.size();
       int i1 = 0;
       while (i1 < i) {
          d uod = this.mRequestListeners.get(i1);
          try{
             uod.onRequestSuccess(p0, p1, p2);
          }catch(java.lang.Exception e2){
             this.onException("InternalListener exception in onRequestSuccess", e2);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public void onUltimateProducerReached(String p0,String p1,boolean p2){
       int i = this.mRequestListeners.size();
       int i1 = 0;
       while (i1 < i) {
          d uod = this.mRequestListeners.get(i1);
          try{
             uod.onUltimateProducerReached(p0, p1, p2);
          }catch(java.lang.Exception e2){
             this.onException("InternalListener exception in onProducerFinishWithSuccess", e2);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public boolean requiresExtraMap(String p0){
       int i = this.mRequestListeners.size();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return false;
          }
          if (this.mRequestListeners.get(i1).requiresExtraMap(p0)) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return true;
    }
}
