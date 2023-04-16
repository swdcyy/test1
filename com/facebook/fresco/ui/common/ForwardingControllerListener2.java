package com.facebook.fresco.ui.common.ForwardingControllerListener2;
import com.facebook.fresco.ui.common.a;
import java.util.ArrayList;
import com.facebook.fresco.ui.common.b;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.lang.Throwable;
import com.facebook.fresco.ui.common.b$a;

public class ForwardingControllerListener2 extends a	// class@0010dc
{
    public final List mListeners;

    public void ForwardingControllerListener2(){
       super();
       this.mListeners = new ArrayList(2);
    }
    public synchronized void addListener(b p0){
       this.mListeners.add(p0);
    }
    public synchronized final void onException(String p0,Throwable p1){
    }
    public void onFailure(String p0,Throwable p1,b$a p2){
       int i = this.mListeners.size();
       int i1 = 0;
       while (i1 < i) {
          try{
             b uob = this.mListeners.get(i1);
             if (uob != null) {
                uob.onFailure(p0, p1, p2);
             }
          }catch(java.lang.Exception e2){
             this.onException("ForwardingControllerListener2 exception in onFailure", e2);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public void onFinalImageSet(String p0,Object p1,b$a p2){
       int i = this.mListeners.size();
       int i1 = 0;
       while (i1 < i) {
          try{
             b uob = this.mListeners.get(i1);
             if (uob != null) {
                uob.onFinalImageSet(p0, p1, p2);
             }
          }catch(java.lang.Exception e2){
             this.onException("ForwardingControllerListener2 exception in onFinalImageSet", e2);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public void onRelease(String p0,b$a p1){
       int i = this.mListeners.size();
       int i1 = 0;
       while (i1 < i) {
          try{
             b uob = this.mListeners.get(i1);
             if (uob != null) {
                uob.onRelease(p0, p1);
             }
          }catch(java.lang.Exception e2){
             this.onException("ForwardingControllerListener2 exception in onRelease", e2);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public void onSubmit(String p0,Object p1,b$a p2){
       int i = this.mListeners.size();
       int i1 = 0;
       while (i1 < i) {
          try{
             b uob = this.mListeners.get(i1);
             if (uob != null) {
                uob.onSubmit(p0, p1, p2);
             }
          }catch(java.lang.Exception e2){
             this.onException("ForwardingControllerListener2 exception in onSubmit", e2);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public synchronized void removeAllListeners(){
       this.mListeners.clear();
    }
    public synchronized void removeListener(b p0){
       int i = this.mListeners.indexOf(p0);
       if (i != -1) {
          this.mListeners.remove(i);
       }
       return;
    }
}
