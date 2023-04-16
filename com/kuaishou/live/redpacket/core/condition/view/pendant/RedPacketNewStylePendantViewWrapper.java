package com.kuaishou.live.redpacket.core.condition.view.pendant.RedPacketNewStylePendantViewWrapper;
import vw1.b;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.widget.TextView;
import android.view.ViewPropertyAnimator;
import eo3.w;
import eo3.g;
import eo3.f;
import com.kuaishou.live.redpacket.core.condition.data.RedPacketConditionRedPackInfoWrapper;
import com.kuaishou.live.redpacket.core.condition.data.RedPacketConditionRedPackInfoWrapper$BottomAreaStatus;
import eo3.e;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;

public class RedPacketNewStylePendantViewWrapper extends FrameLayout implements b	// class@000ed5
{
    public TextView b;
    public int c;
    public int d;
    public g e;

    public void RedPacketNewStylePendantViewWrapper(Context p0){
       super(p0);
       this.a();
    }
    public void RedPacketNewStylePendantViewWrapper(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a();
    }
    public void RedPacketNewStylePendantViewWrapper(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, RedPacketNewStylePendantViewWrapper.class, "1")) {
          return;
       }
       this.setClipChildren(false);
       a.k(this, R.layout.arg_RES_7f0d0d97, true);
       this.b = this.findViewById(0x7f0a24e9);
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, RedPacketNewStylePendantViewWrapper.class, "4")) {
          return;
       }
       this.b.setAlpha(0);
       this.b.setScaleX(0.20f);
       this.b.setScaleY(0.20f);
       this.b.animate().withLayer().alpha(0x3f800000).scaleX(0x3f800000).scaleY(0x3f800000).start();
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, RedPacketNewStylePendantViewWrapper.class, "5")) {
          return;
       }
       RedPacketNewStylePendantViewWrapper te = this.e;
       if (te == null) {
          return;
       }
       RedPacketConditionRedPackInfoWrapper redPacketCon = te.getContext().c();
       if (redPacketCon == null) {
          return;
       }
       redPacketCon.p(RedPacketConditionRedPackInfoWrapper$BottomAreaStatus.SHOW);
       this.e.c(redPacketCon);
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, RedPacketNewStylePendantViewWrapper.class, "6")) {
          return;
       }
       RedPacketNewStylePendantViewWrapper te = this.e;
       if (te == null) {
          return;
       }
       RedPacketConditionRedPackInfoWrapper redPacketCon = te.getContext().c();
       if (redPacketCon == null) {
          return;
       }
       redPacketCon.p(RedPacketConditionRedPackInfoWrapper$BottomAreaStatus.HIDE);
       this.e.c(redPacketCon);
       return;
    }
    public void g(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RedPacketNewStylePendantViewWrapper.class, "3")) {
          return;
       }
       if (TextUtils.x(p0)) {
          this.b.setVisibility(4);
       }else {
          this.b.setVisibility(0);
          this.b.setText(p0);
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(RedPacketNewStylePendantViewWrapper.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, RedPacketNewStylePendantViewWrapper.class, "7")) {
          return;
       }
       super.onMeasure(p0, p1);
       this.c = p0;
       this.d = p1;
       return;
    }
}
