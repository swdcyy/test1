package com.kuaishou.ax2c.AX2C$1;
import android.os.Handler$Callback;
import com.kuaishou.ax2c.AX2C;
import java.lang.Object;
import android.os.Message;
import com.kuaishou.ax2c.AX2C$InflateRequest;
import android.view.ViewGroup;
import android.view.View;
import com.kuaishou.ax2c.X2CInflater;
import android.content.Context;
import com.kuaishou.ax2c.LayoutInflaterDelegate;
import com.kuaishou.ax2c.AX2C$OnInflateFinishedListener;
import com.kuaishou.ax2c.AX2C$InflateThread;

public class AX2C$1 implements Handler$Callback	// class@000fac
{
    public final AX2C this$0;

    public void AX2C$1(AX2C p0){
       this.this$0 = p0;
       super();
    }
    public boolean handleMessage(Message p0){
       p0 = p0.obj;
       if (p0.view == null) {
          boolean b = false;
          View view = p0.inflater.x2CInflater.inflate(p0.resid, p0.parent, b);
          p0.view = view;
          if (view == null) {
             p0.view = p0.inflater.mInflater.inflate(this.this$0.mContext, p0.resid, p0.parent, b);
          }
       }
       p0.callback.onInflateFinished(p0.view, p0.resid, p0.parent);
       AX2C$InflateThread.getInstance().releaseRequest(p0);
       return true;
    }
}
