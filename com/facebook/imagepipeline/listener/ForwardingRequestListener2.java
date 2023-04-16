package com.facebook.imagepipeline.listener.ForwardingRequestListener2;
import dd.c;
import java.util.Set;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.lang.String;
import java.lang.Throwable;
import cb.a;
import id.c0;
import id.e0;
import java.util.Map;

public class ForwardingRequestListener2 implements c	// class@00047d
{
    public final List mRequestListeners;

    public void ForwardingRequestListener2(Set p0){
       super();
       this.mRequestListeners = new ArrayList(p0.size());
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          c uoc = iterator.next();
          if (uoc != null) {
             this.mRequestListeners.add(uoc);
          }
       }
       return;
    }
    public void ForwardingRequestListener2(c[] p0){
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
    public void addRequestListener(c p0){
       this.mRequestListeners.add(p0);
    }
    public final void onException(String p0,Throwable p1){
       a.h("ForwardingRequestListener2", p0, p1);
    }
    public void onProducerEvent(c0 p0,String p1,String p2){
       int i = this.mRequestListeners.size();
       int i1 = 0;
       while (i1 < i) {
          c uoc = this.mRequestListeners.get(i1);
          try{
             uoc.onProducerEvent(p0, p1, p2);
          }catch(java.lang.Exception e2){
             this.onException("InternalListener exception in onIntermediateChunkStart", e2);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public void onProducerFinishWithCancellation(c0 p0,String p1,Map p2){
       int i = this.mRequestListeners.size();
       int i1 = 0;
       while (i1 < i) {
          c uoc = this.mRequestListeners.get(i1);
          try{
             uoc.onProducerFinishWithCancellation(p0, p1, p2);
          }catch(java.lang.Exception e2){
             this.onException("InternalListener exception in onProducerFinishWithCancellation", e2);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public void onProducerFinishWithFailure(c0 p0,String p1,Throwable p2,Map p3){
       int i = this.mRequestListeners.size();
       int i1 = 0;
       while (i1 < i) {
          c uoc = this.mRequestListeners.get(i1);
          try{
             uoc.onProducerFinishWithFailure(p0, p1, p2, p3);
          }catch(java.lang.Exception e2){
             this.onException("InternalListener exception in onProducerFinishWithFailure", e2);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public void onProducerFinishWithSuccess(c0 p0,String p1,Map p2){
       int i = this.mRequestListeners.size();
       int i1 = 0;
       while (i1 < i) {
          c uoc = this.mRequestListeners.get(i1);
          try{
             uoc.onProducerFinishWithSuccess(p0, p1, p2);
          }catch(java.lang.Exception e2){
             this.onException("InternalListener exception in onProducerFinishWithSuccess", e2);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public void onProducerStart(c0 p0,String p1){
       int i = this.mRequestListeners.size();
       int i1 = 0;
       while (i1 < i) {
          c uoc = this.mRequestListeners.get(i1);
          try{
             uoc.onProducerStart(p0, p1);
          }catch(java.lang.Exception e2){
             this.onException("InternalListener exception in onProducerStart", e2);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public void onRequestCancellation(c0 p0){
       int i = this.mRequestListeners.size();
       int i1 = 0;
       while (i1 < i) {
          c uoc = this.mRequestListeners.get(i1);
          try{
             uoc.onRequestCancellation(p0);
          }catch(java.lang.Exception e2){
             this.onException("InternalListener exception in onRequestCancellation", e2);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public void onRequestFailure(c0 p0,Throwable p1){
       int i = this.mRequestListeners.size();
       int i1 = 0;
       while (i1 < i) {
          c uoc = this.mRequestListeners.get(i1);
          try{
             uoc.onRequestFailure(p0, p1);
          }catch(java.lang.Exception e2){
             this.onException("InternalListener exception in onRequestFailure", e2);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public void onRequestStart(c0 p0){
       int i = this.mRequestListeners.size();
       int i1 = 0;
       while (i1 < i) {
          c uoc = this.mRequestListeners.get(i1);
          try{
             uoc.onRequestStart(p0);
          }catch(java.lang.Exception e2){
             this.onException("InternalListener exception in onRequestStart", e2);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public void onRequestSuccess(c0 p0){
       int i = this.mRequestListeners.size();
       int i1 = 0;
       while (i1 < i) {
          c uoc = this.mRequestListeners.get(i1);
          try{
             uoc.onRequestSuccess(p0);
          }catch(java.lang.Exception e2){
             this.onException("InternalListener exception in onRequestSuccess", e2);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public void onUltimateProducerReached(c0 p0,String p1,boolean p2){
       int i = this.mRequestListeners.size();
       int i1 = 0;
       while (i1 < i) {
          c uoc = this.mRequestListeners.get(i1);
          try{
             uoc.onUltimateProducerReached(p0, p1, p2);
          }catch(java.lang.Exception e2){
             this.onException("InternalListener exception in onProducerFinishWithSuccess", e2);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public boolean requiresExtraMap(c0 p0,String p1){
       int i = this.mRequestListeners.size();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return false;
          }
          if (this.mRequestListeners.get(i1).requiresExtraMap(p0, p1)) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return true;
    }
}
