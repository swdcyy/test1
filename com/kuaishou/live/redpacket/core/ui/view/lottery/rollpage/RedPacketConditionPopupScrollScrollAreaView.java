package com.kuaishou.live.redpacket.core.ui.view.lottery.rollpage.RedPacketConditionPopupScrollScrollAreaView;
import com.kuaishou.live.redpacket.core.ui.view.lottery.RedPacketPopupScrollScrollAreaView;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import java.util.List;
import po3.a;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.b;

public class RedPacketConditionPopupScrollScrollAreaView extends RedPacketPopupScrollScrollAreaView	// class@000f2c
{
    public static final List f;

    static {
       RedPacketConditionPopupScrollScrollAreaView.f = a.a(LiveLogTag.CONDITION_LEEE, "PopupScrollScrollAreaView");
    }
    public void RedPacketConditionPopupScrollScrollAreaView(Context p0){
       super(p0);
    }
    public void RedPacketConditionPopupScrollScrollAreaView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void RedPacketConditionPopupScrollScrollAreaView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, RedPacketConditionPopupScrollScrollAreaView.class, "2")) {
          return;
       }
       super.b();
       b.P(RedPacketConditionPopupScrollScrollAreaView.f, " do release");
       return;
    }
}
