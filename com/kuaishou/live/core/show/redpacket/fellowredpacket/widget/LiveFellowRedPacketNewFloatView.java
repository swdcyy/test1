package com.kuaishou.live.core.show.redpacket.fellowredpacket.widget.LiveFellowRedPacketNewFloatView;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.widget.a;
import vw1.b;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.kuaishou.live.core.show.redpacket.newpendant.LiveRedPacketNewPendantViewHelper;
import android.view.LayoutInflater;
import java.lang.Object;
import java.util.Objects;
import android.view.ViewGroup;
import android.view.View;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.widget.LiveFellowRedPacketNewFloatView$a;
import android.view.View$OnClickListener;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.lang.Math;
import vg2.a;
import com.kuaishou.live.core.show.redpacket.newpendant.LiveRedPacketNewPendantViewHelper$b;
import com.kuaishou.live.core.show.redpacket.newpendant.LiveRedPacketNewPendantViewHelper$c;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.widget.a$a;

public class LiveFellowRedPacketNewFloatView extends RelativeLayout implements a, b	// class@000ecb
{
    public a b;
    public a$a c;
    public int d;
    public long e;
    public final LiveRedPacketNewPendantViewHelper f;

    public void LiveFellowRedPacketNewFloatView(Context p0){
       super(p0, null);
    }
    public void LiveFellowRedPacketNewFloatView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveFellowRedPacketNewFloatView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       LiveRedPacketNewPendantViewHelper liveRedPacke = new LiveRedPacketNewPendantViewHelper();
       this.f = liveRedPacke;
       this.setClipChildren(false);
       Objects.requireNonNull(liveRedPacke);
       LayoutInflater.from(p0).inflate(R.layout.arg_RES_7f0d0d9a, this);
       liveRedPacke.doBindView(this);
       this.setOnClickListener(new LiveFellowRedPacketNewFloatView$a(this));
    }
    public void a(int p0,long p1){
       if (PatchProxy.isSupport(LiveFellowRedPacketNewFloatView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Long.valueOf(p1), this, LiveFellowRedPacketNewFloatView.class, "3")) {
          return;
       }
       this.d = Math.max(p0, 0);
       this.e = Math.max(p1, 0);
       return;
    }
    public void b(String p0){
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, LiveFellowRedPacketNewFloatView.class, "5")) {
          return;
       }
       this.f.d();
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, LiveFellowRedPacketNewFloatView.class, "6")) {
          return;
       }
       this.f.e();
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, LiveFellowRedPacketNewFloatView.class, "7")) {
          return;
       }
       this.f.f();
       return;
    }
    public void g(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFellowRedPacketNewFloatView.class, "4")) {
          return;
       }
       this.f.g(p0);
       return;
    }
    public int getCurrentDisplayCount(){
       return this.d;
    }
    public long getMaxDisplayCount(){
       return this.e;
    }
    public a getRedPackInfo(){
       return this.b;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, LiveFellowRedPacketNewFloatView.class, "2")) {
          return;
       }
       this.f.b();
       return;
    }
    public void setLiveFellowRedPackInfo(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFellowRedPacketNewFloatView.class, "1")) {
          return;
       }
       this.b = p0;
       LiveFellowRedPacketNewFloatView tf = this.f;
       Objects.requireNonNull(tf);
       if (!PatchProxy.applyVoidOneRefs(p0, tf, LiveRedPacketNewPendantViewHelper.class, "6")) {
          LiveRedPacketNewPendantViewHelper$c uoc = (p0 == null || p0.a == null)? null: new LiveRedPacketNewPendantViewHelper$b(p0);
          tf.i(uoc);
       }
       return;
    }
    public void setOnLiveFellowRedPackFloatViewClickListener(a$a p0){
       this.c = p0;
    }
}
