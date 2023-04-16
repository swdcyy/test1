package com.facebook.drawee.controller.ForwardingControllerListener;
import ub.b;
import kc.c;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;
import java.lang.Throwable;
import android.graphics.drawable.Animatable;
import kc.a;

public class ForwardingControllerListener implements b, c	// class@00108a
{
    public final List mListeners;

    public void ForwardingControllerListener(){
       super();
       this.mListeners = new ArrayList(2);
    }
    public static ForwardingControllerListener create(){
       return new ForwardingControllerListener();
    }
    public static ForwardingControllerListener of(b p0){
       ForwardingControllerListener uForwardingC = ForwardingControllerListener.create();
       uForwardingC.addListener(p0);
       return uForwardingC;
    }
    public static ForwardingControllerListener of(b p0,b p1){
       ForwardingControllerListener uForwardingC = ForwardingControllerListener.create();
       uForwardingC.addListener(p0);
       uForwardingC.addListener(p1);
       return uForwardingC;
    }
    public synchronized void addListener(b p0){
       this.mListeners.add(p0);
    }
    public synchronized void clearListeners(){
       this.mListeners.clear();
    }
    public synchronized final void onException(String p0,Throwable p1){
    }
    public synchronized void onFailure(String p0,Throwable p1){
       int i = this.mListeners.size();
       int i1 = 0;
       while (i1 < i) {
          try{
             b uob = this.mListeners.get(i1);
             if (uob != null) {
                uob.onFailure(p0, p1);
             }
          }catch(java.lang.Exception e2){
             this.onException("InternalListener exception in onFailure", e2);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public synchronized void onFinalImageSet(String p0,Object p1,Animatable p2){
       int i = this.mListeners.size();
       int i1 = 0;
       while (i1 < i) {
          try{
             b uob = this.mListeners.get(i1);
             if (uob != null) {
                uob.onFinalImageSet(p0, p1, p2);
             }
          }catch(java.lang.Exception e2){
             this.onException("InternalListener exception in onFinalImageSet", e2);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public void onImageDrawn(String p0,Object p1,a p2){
       int i = this.mListeners.size();
       int i1 = 0;
       while (i1 < i) {
          try{
             b uob = this.mListeners.get(i1);
             if (uob instanceof c) {
                uob.onImageDrawn(p0, p1, p2);
             }
          }catch(java.lang.Exception e2){
             this.onException("InternalListener exception in onImageDrawn", e2);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public void onIntermediateImageFailed(String p0,Throwable p1){
       int i = this.mListeners.size();
       int i1 = 0;
       while (i1 < i) {
          try{
             b uob = this.mListeners.get(i1);
             if (uob != null) {
                uob.onIntermediateImageFailed(p0, p1);
             }
          }catch(java.lang.Exception e2){
             this.onException("InternalListener exception in onIntermediateImageFailed", e2);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public void onIntermediateImageSet(String p0,Object p1){
       int i = this.mListeners.size();
       int i1 = 0;
       while (i1 < i) {
          try{
             b uob = this.mListeners.get(i1);
             if (uob != null) {
                uob.onIntermediateImageSet(p0, p1);
             }
          }catch(java.lang.Exception e2){
             this.onException("InternalListener exception in onIntermediateImageSet", e2);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public synchronized void onRelease(String p0){
       int i = this.mListeners.size();
       int i1 = 0;
       while (i1 < i) {
          try{
             b uob = this.mListeners.get(i1);
             if (uob != null) {
                uob.onRelease(p0);
             }
          }catch(java.lang.Exception e2){
             this.onException("InternalListener exception in onRelease", e2);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public synchronized void onSubmit(String p0,Object p1){
       int i = this.mListeners.size();
       int i1 = 0;
       while (i1 < i) {
          try{
             b uob = this.mListeners.get(i1);
             if (uob != null) {
                uob.onSubmit(p0, p1);
             }
          }catch(java.lang.Exception e2){
             this.onException("InternalListener exception in onSubmit", e2);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public synchronized void removeListener(b p0){
       int i = this.mListeners.indexOf(p0);
       if (i != -1) {
          this.mListeners.set(i, null);
       }
       return;
    }
}
