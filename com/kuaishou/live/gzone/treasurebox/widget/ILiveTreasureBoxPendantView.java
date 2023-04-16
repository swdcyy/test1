package com.kuaishou.live.gzone.treasurebox.widget.ILiveTreasureBoxPendantView;
import com.kuaishou.live.common.gzone.pendant.LiveScaleFrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Runnable;
import com.kuaishou.live.gzone.treasurebox.bean.LiveTreasureBoxModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import java.lang.Boolean;
import java.lang.Integer;
import android.widget.FrameLayout;
import p53.q1;

public abstract class ILiveTreasureBoxPendantView extends LiveScaleFrameLayout	// class@001ca5
{
    public boolean d;
    public boolean e;

    public void ILiveTreasureBoxPendantView(Context p0){
       super(p0);
    }
    public void ILiveTreasureBoxPendantView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void ILiveTreasureBoxPendantView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public abstract void b();
    public abstract Runnable c();
    public abstract void d(LiveTreasureBoxModel p0);
    public abstract void e(int p0);
    public float getCountingTextSize(){
       return 9.00f;
    }
    public float getDefaultTextSize(){
       return 8.00f;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, ILiveTreasureBoxPendantView.class, "1")) {
          return;
       }
       super.onAttachedToWindow();
       this.d = true;
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(ILiveTreasureBoxPendantView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, ILiveTreasureBoxPendantView.class, "2")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       if (this.e == null && (p3 > p1 && p4 > p2)) {
          this.e = true;
       }
    label_0046 :
       return;
    }
    public abstract void setLogProvider(q1 p0);
}
