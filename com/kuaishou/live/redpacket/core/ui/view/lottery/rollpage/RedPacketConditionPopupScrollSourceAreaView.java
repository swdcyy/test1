package com.kuaishou.live.redpacket.core.ui.view.lottery.rollpage.RedPacketConditionPopupScrollSourceAreaView;
import com.kuaishou.live.redpacket.core.ui.view.lottery.RedPacketPopupSourceAreaView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import android.widget.TextView;

public class RedPacketConditionPopupScrollSourceAreaView extends RedPacketPopupSourceAreaView	// class@000f2d
{

    public void RedPacketConditionPopupScrollSourceAreaView(Context p0){
       super(p0);
    }
    public void RedPacketConditionPopupScrollSourceAreaView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void RedPacketConditionPopupScrollSourceAreaView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, RedPacketConditionPopupScrollSourceAreaView.class, "1")) {
          return;
       }
       super.a();
       this.c.setTextColor(a1.a(R.color.arg_RES_7f061d3d));
       return;
    }
}
