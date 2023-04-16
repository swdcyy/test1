package com.kuaishou.live.redpacket.core.ui.view.lottery.resultpage.RedPacketConditionPopupResultSourceAreaView;
import com.kuaishou.live.redpacket.core.ui.view.lottery.RedPacketPopupSourceAreaView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import android.widget.TextView;

public class RedPacketConditionPopupResultSourceAreaView extends RedPacketPopupSourceAreaView	// class@000f27
{

    public void RedPacketConditionPopupResultSourceAreaView(Context p0){
       super(p0);
    }
    public void RedPacketConditionPopupResultSourceAreaView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void RedPacketConditionPopupResultSourceAreaView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, RedPacketConditionPopupResultSourceAreaView.class, "1")) {
          return;
       }
       super.a();
       this.c.setTextColor(a1.a(R.color.arg_RES_7f061d3d));
       return;
    }
}
