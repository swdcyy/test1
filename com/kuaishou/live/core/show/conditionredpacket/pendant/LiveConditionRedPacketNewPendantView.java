package com.kuaishou.live.core.show.conditionredpacket.pendant.LiveConditionRedPacketNewPendantView;
import l62.a;
import vw1.b;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.kuaishou.live.core.show.redpacket.newpendant.LiveRedPacketNewPendantViewHelper;
import java.lang.Object;
import java.util.Objects;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import com.kuaishou.live.core.show.redpacket.newpendant.LiveRedPacketNewPendantViewHelper$a;
import com.kuaishou.live.core.show.redpacket.newpendant.LiveRedPacketNewPendantViewHelper$c;

public class LiveConditionRedPacketNewPendantView extends RelativeLayout implements a, b	// class@000abb
{
    public final LiveRedPacketNewPendantViewHelper b;

    public void LiveConditionRedPacketNewPendantView(Context p0){
       super(p0, null);
    }
    public void LiveConditionRedPacketNewPendantView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveConditionRedPacketNewPendantView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       LiveRedPacketNewPendantViewHelper liveRedPacke = new LiveRedPacketNewPendantViewHelper();
       this.b = liveRedPacke;
       this.setClipChildren(false);
       Objects.requireNonNull(liveRedPacke);
       a.k(this, R.layout.arg_RES_7f0d0d9a, true);
       liveRedPacke.doBindView(this);
    }
    public void a(LiveConditionRedPacketInfo p0,long p1){
       if (PatchProxy.isSupport(LiveConditionRedPacketNewPendantView.class) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, LiveConditionRedPacketNewPendantView.class, "1")) {
          return;
       }
       LiveConditionRedPacketNewPendantView tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(p0, tb, LiveRedPacketNewPendantViewHelper.class, "8")) {
          LiveRedPacketNewPendantViewHelper$c uoc = (p0 == null)? null: new LiveRedPacketNewPendantViewHelper$a(p0);
          tb.i(uoc);
       }
       return;
    }
    public void b(long p0){
    }
    public void c(){
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, LiveConditionRedPacketNewPendantView.class, "4")) {
          return;
       }
       this.b.d();
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, LiveConditionRedPacketNewPendantView.class, "5")) {
          return;
       }
       this.b.e();
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, LiveConditionRedPacketNewPendantView.class, "6")) {
          return;
       }
       this.b.f();
       return;
    }
    public void g(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveConditionRedPacketNewPendantView.class, "3")) {
          return;
       }
       this.b.g(p0);
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, LiveConditionRedPacketNewPendantView.class, "2")) {
          return;
       }
       this.b.b();
       return;
    }
}
