package com.kuaishou.live.core.show.activityredpacket.user.LiveActivityRedPacketCoupleUserView;
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
import android.widget.ImageView;
import com.kuaishou.live.core.show.activityredpacket.user.c;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.activityredpacket.user.d;
import com.kuaishou.live.core.show.activityredpacket.user.e;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Integer;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import com.facebook.drawee.generic.RoundingParams;
import lnc.a1;
import z12.x;
import ekd.j;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.core.show.activityredpacket.user.LiveActivityRedPacketCoupleUserView$a;

public class LiveActivityRedPacketCoupleUserView extends ConstraintLayout	// class@00099b
{
    public KwaiImageView B;
    public KwaiImageView C;
    public KwaiImageView D;
    public KwaiImageView E;
    public LiveActivityRedPacketCoupleUserView$a F;

    public void LiveActivityRedPacketCoupleUserView(Context p0){
       super(p0, null);
    }
    public void LiveActivityRedPacketCoupleUserView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveActivityRedPacketCoupleUserView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveActivityRedPacketCoupleUserView.class, "5")) {
       }else {
          a.c(p0, R.layout.arg_RES_7f0d09b5, this);
          this.B = m1.f(this, 0x7f0a183a);
          this.C = m1.f(this, 0x7f0a183b);
          this.D = m1.f(this, 0x7f0a183c);
          this.E = m1.f(this, 0x7f0a183d);
          this.D.setVisibility(8);
          this.E.setVisibility(8);
          this.B.setOnClickListener(new c(this));
          this.C.setOnClickListener(new d(this));
          this.D.setOnClickListener(new e(this));
       }
       return;
    }
    public final void L(KwaiImageView p0,CDNUrl[] p1,String p2,int p3){
       if (PatchProxy.isSupport(LiveActivityRedPacketCoupleUserView.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, LiveActivityRedPacketCoupleUserView.class, "6")) {
          return;
       }
       RoundingParams roundingPara = p0.getHierarchy().n();
       if (roundingPara == null) {
          roundingPara = new RoundingParams();
       }
       roundingPara.q(true);
       roundingPara.j(p3, (float)a1.e(0x3f800000));
       p0.getHierarchy().L(roundingPara);
       if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, x.class, "23")) {
          if (!j.h(p1)) {
             p0.U(p1);
          }else if(!TextUtils.x(p2)){
             p0.L(p2);
          }
       }
       return;
    }
    public void setListener(LiveActivityRedPacketCoupleUserView$a p0){
       this.F = p0;
    }
    public void setRightUserIcon(CDNUrl[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveActivityRedPacketCoupleUserView.class, "3")) {
          return;
       }
       if (j.h(p0)) {
          this.D.setVisibility(8);
       }else {
          this.D.setVisibility(0);
          this.D.U(p0);
       }
       return;
    }
    public void setRightUserShadow(CDNUrl[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveActivityRedPacketCoupleUserView.class, "4")) {
          return;
       }
       if (j.h(p0)) {
          this.E.setVisibility(8);
       }else {
          this.E.setVisibility(0);
          this.E.U(p0);
       }
       return;
    }
}
