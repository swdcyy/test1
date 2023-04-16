package com.kuaishou.live.core.show.conditionredpacket.widget.LiveConditionRedPacketGiftSendView;
import qh3.e;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import d61.f0;
import com.kuaishou.live.core.show.redpacket.LiveRedPacketResourcePathConstant;
import l12.d;
import va1.f0;
import qh3.f;
import o62.b;
import androidx.lifecycle.LifecycleOwner;
import qh3.b;
import qh3.a;
import qh3.c;
import sh3.a;
import com.kuaishou.live.core.show.conditionredpacket.widget.LiveConditionRedPacketGiftSendView$a;
import android.view.View$OnClickListener;

public class LiveConditionRedPacketGiftSendView extends ConstraintLayout implements e	// class@000aca
{
    public KwaiImageView B;
    public TextView C;
    public TextView D;
    public KwaiImageView E;

    public void LiveConditionRedPacketGiftSendView(Context p0){
       super(p0, null);
    }
    public void LiveConditionRedPacketGiftSendView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveConditionRedPacketGiftSendView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, LiveConditionRedPacketGiftSendView.class, "1")) {
       }else {
          View view = a.c(this.getContext(), R.layout.arg_RES_7f0d0ac6, this);
          this.B = m1.f(view, 0x7f0a10b4);
          this.C = m1.f(view, 0x7f0a10b5);
          this.D = m1.f(view, 0x7f0a10b3);
          this.E = m1.f(view, 0x7f0a10b2);
          f0.f(this.C, "sans-serif-medium");
          f0.a(this.E, this.getDefaultGiftSendButtonBgResource());
       }
       return;
    }
    public void F(f p0){
       this.L(p0);
    }
    public void L(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveConditionRedPacketGiftSendView.class, "2")) {
          return;
       }
       b uob = a.a(p0.a());
       uob.a(this.C, p0.b);
       uob.a(this.D, p0.c);
       uob.a(this, p0.d);
       uob.a(this.B, p0.e);
       this.setOnClickListener(new LiveConditionRedPacketGiftSendView$a(this, p0));
       return;
    }
    public final LiveRedPacketResourcePathConstant getDefaultGiftSendButtonBgResource(){
       return LiveRedPacketResourcePathConstant.LIVE_CONDITION_RED_PACKET_PANEL_RESULT_SEND_TO_ANCHOR_BUTTON_BACKGROUND;
    }
}
