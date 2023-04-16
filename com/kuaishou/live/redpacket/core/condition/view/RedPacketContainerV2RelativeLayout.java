package com.kuaishou.live.redpacket.core.condition.view.RedPacketContainerV2RelativeLayout;
import uw1.a;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import uw1.n;

public class RedPacketContainerV2RelativeLayout extends RelativeLayout implements a	// class@000ecd
{
    public n b;

    public void RedPacketContainerV2RelativeLayout(Context p0){
       super(p0);
    }
    public void RedPacketContainerV2RelativeLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void RedPacketContainerV2RelativeLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RedPacketContainerV2RelativeLayout.class, "1")) {
          return;
       }
       super.dispatchDraw(p0);
       RedPacketContainerV2RelativeLayout tb = this.b;
       if (tb != null) {
          tb.a();
       }
       return;
    }
    public void setDispatchDrawFinishedListener(n p0){
       this.b = p0;
    }
}
