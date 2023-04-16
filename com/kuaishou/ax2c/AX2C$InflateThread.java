package com.kuaishou.ax2c.AX2C$InflateThread;
import java.lang.Thread;
import java.util.concurrent.ArrayBlockingQueue;
import z1.g;
import com.kuaishou.ax2c.AX2C$InflateRequest;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Throwable;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.ThreadLocal;
import java.lang.StringBuilder;
import java.lang.IllegalAccessException;
import java.lang.NoSuchFieldException;
import com.kuaishou.ax2c.AX2C;
import android.view.ViewGroup;
import android.view.View;
import com.kuaishou.ax2c.X2CInflater;
import android.content.Context;
import com.kuaishou.ax2c.LayoutInflaterDelegate;
import com.kuaishou.ax2c.AX2C$OnInflateFinishedListener;
import android.os.Handler;
import android.os.Message;

public class AX2C$InflateThread extends Thread	// class@000faf
{
    public ArrayBlockingQueue mQueue;
    public g mRequestPool;
    public static final AX2C$InflateThread sInstance;

    static {
       AX2C$InflateThread inflateThrea = new AX2C$InflateThread();
       AX2C$InflateThread.sInstance = inflateThrea;
       inflateThrea.start();
    }
    public void AX2C$InflateThread(){
       super();
       this.mQueue = new ArrayBlockingQueue(10);
       this.mRequestPool = new g(10);
    }
    public static AX2C$InflateThread getInstance(){
       return AX2C$InflateThread.sInstance;
    }
    public void enqueue(AX2C$InflateRequest p0){
       try{
          this.mQueue.put(p0);
          return;
       }catch(java.lang.InterruptedException e3){
          throw new RuntimeException("Failed to enqueue async inflate request", e3);
       }
    }
    public AX2C$InflateRequest obtainRequest(){
       AX2C$InflateRequest inflateReque = this.mRequestPool.q();
       if (inflateReque == null) {
          inflateReque = new AX2C$InflateRequest();
       }
       return inflateReque;
    }
    public void releaseRequest(AX2C$InflateRequest p0){
       p0.callback = null;
       p0.inflater = null;
       p0.parent = null;
       p0.resid = 0;
       p0.view = null;
       this.mRequestPool.a(p0);
    }
    public void run(){
       try{
          Field declaredFiel = Looper.class.getDeclaredField("sThreadLocal");
          declaredFiel.setAccessible(true);
          Object obj = declaredFiel.get(Looper.getMainLooper());
          if (obj instanceof ThreadLocal) {
             obj.set(Looper.getMainLooper());
          label_0021 :
             "myLooper:"+Looper.myLooper();
          }else {
             goto label_0021 ;
          }
       }catch(java.lang.NoSuchFieldException e0){
          e0.printStackTrace();
       }catch(java.lang.IllegalAccessException e0){
          e0.printStackTrace();
       }
    }
    public void runInner(){
       int i;
       try{
          AX2C$InflateRequest inflateReque = this.mQueue.take();
          try{
             i = 0;
             View view = inflateReque.inflater.x2CInflater.inflate(inflateReque.resid, inflateReque.parent, i);
             inflateReque.view = view;
             if (view == null) {
                AX2C$InflateRequest inflater = inflateReque.inflater;
                inflateReque.view = inflater.mInflater.inflate(inflater.mContext, inflateReque.resid, inflateReque.parent, i);
             }
          }catch(java.lang.RuntimeException e0){
          }
          if (e0.forceAsync != null) {
             e0.callback.onInflateFinished(e0.view, e0.resid, e0.parent);
          }else {
             Message.obtain(e0.inflater.mHandler, i, e0).sendToTarget();
          }
          return;
       }catch(java.lang.InterruptedException e0){
       }
    }
}
