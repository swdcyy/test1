package com.kuaishou.ax2c.AX2C;
import android.content.Context;
import java.lang.Object;
import com.kuaishou.ax2c.AX2C$1;
import com.kuaishou.ax2c.AX2C$BasicInflater;
import com.kuaishou.ax2c.X2CInflater;
import android.os.Handler;
import android.os.Looper;
import android.os.Handler$Callback;
import com.kuaishou.ax2c.LayoutInflaterDelegate;
import android.view.ViewGroup;
import com.kuaishou.ax2c.AX2C$OnInflateFinishedListener;
import android.widget.FrameLayout;
import java.lang.String;
import java.util.Objects;
import com.kuaishou.ax2c.AX2C$InflateThread;
import com.kuaishou.ax2c.AX2C$InflateRequest;
import android.view.View;
import com.kuaishou.ax2c.PreLoader$InflateListener;
import java.lang.StringBuilder;
import android.app.Activity;
import java.lang.IllegalArgumentException;

public final class AX2C	// class@000fb1
{
    public Context mContext;
    public Handler mHandler;
    public Handler$Callback mHandlerCallback;
    public LayoutInflaterDelegate mInflater;
    public X2CInflater x2CInflater;

    public void AX2C(Context p0){
       super();
       this.mHandlerCallback = new AX2C$1(this);
       this.mInflater = new AX2C$BasicInflater(p0);
       this.x2CInflater = new X2CInflater(p0);
       this.mHandler = new Handler(Looper.getMainLooper(), this.mHandlerCallback);
    }
    public void AX2C(Context p0,LayoutInflaterDelegate p1){
       super();
       this.mHandlerCallback = new AX2C$1(this);
       this.mContext = p0;
       if (p1 != null) {
       }else {
          AX2C$BasicInflater uBasicInflat = new AX2C$BasicInflater(p0);
       }
       this.mInflater = p1;
       this.x2CInflater = new X2CInflater(p0);
       this.mHandler = new Handler(Looper.getMainLooper(), this.mHandlerCallback);
       return;
    }
    public FrameLayout inflate(int p0,ViewGroup p1,AX2C$OnInflateFinishedListener p2){
       return this.inflate(p0, p1, false, p2);
    }
    public FrameLayout inflate(int p0,ViewGroup p1,boolean p2,AX2C$OnInflateFinishedListener p3){
       Objects.requireNonNull(p3, "callback argument may not be null!");
       AX2C$InflateRequest inflateReque = AX2C$InflateThread.getInstance().obtainRequest();
       inflateReque.inflater = this;
       inflateReque.resid = p0;
       inflateReque.parent = p1;
       inflateReque.callback = p3;
       inflateReque.forceAsync = p2;
       AX2C$InflateThread.getInstance().enqueue(inflateReque);
       return new FrameLayout(this.mContext);
    }
    public View inflateSync(int p0,ViewGroup p1,boolean p2){
       return this.inflateSync(p0, p1, p2, true, null);
    }
    public View inflateSync(int p0,ViewGroup p1,boolean p2,boolean p3){
       return this.inflateSync(p0, p1, p2, p3, null);
    }
    public View inflateSync(int p0,ViewGroup p1,boolean p2,boolean p3,PreLoader$InflateListener p4){
       if (!p3) {
          return this.mInflater.inflate(this.mContext, p0, p1, p2);
       }
       View view = this.x2CInflater.inflate(p0, p1, p2);
       if (view == null) {
          if (p4 != null) {
             p4.onFallback("getView failded:"+p0);
          }
          view = this.mInflater.inflate(this.mContext, p0, p1, p2);
       }
       return view;
    }
    public void setContentViewSync(Activity p0,int p1){
       if (p0 == null) {
          throw new IllegalArgumentException("Activity must not be null");
       }
       View view = this.x2CInflater.getView(p1);
       if (view != null) {
          p0.setContentView(view);
       }else {
          p0.setContentView(p1);
       }
       return;
    }
}
