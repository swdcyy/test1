package f62.c;
import erd.g;
import com.kuaishou.live.core.show.conditionredpacket.grab.share.a;
import java.lang.Object;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import p91.m;
import z52.a;
import android.widget.TextView;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LiveData;
import java.lang.Boolean;
import nt5.a;
import com.kuaishou.live.core.show.conditionredpacket.logger.RedPacketType;
import h62.a;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketAction;
import java.lang.Enum;
import u52.t;
import h62.e;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketGrabButtonType;
import h62.d;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import java.lang.CharSequence;
import brd.y;

public final class c implements g	// class@0028af
{
    public final a b;

    public void c(a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       tb.G = p0;
       if (p0 != null) {
          p0 = a.class;
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, tb, p0, "7") && tb.G != null) {
             int i = 0;
             tb.P8(i);
             if (tb.F.e()) {
                a g = tb.G;
                if (!PatchProxy.applyVoidOneRefs(g, tb, p0, "10")) {
                   if (a.a(g)) {
                      tb.v.setVisibility(i);
                      p0 = tb.v.getLayoutParams();
                      if (p0 instanceof ConstraintLayout$LayoutParams) {
                         ViewGroup$LayoutParams layoutParams = p0;
                         layoutParams.bottomMargin = i;
                         layoutParams.j = 0x7f0a1b71;
                         tb.v.setLayoutParams(p0);
                         tb.v.setTextSize(1, 12.00f);
                         tb.v.setTypeface(Typeface.DEFAULT_BOLD);
                      }
                   }else {
                      tb.v.setVisibility(8);
                   }
                   tb.u.setVisibility(8);
                   tb.w.setVisibility(i);
                   tb.H.setVisibility(8);
                   tb.I.setVisibility(8);
                   tb.y.setVisibility(i);
                   tb.S8();
                   tb.R8(i);
                }
             }else if(PatchProxy.applyVoid(objArray, tb, p0, "9")){
                a g1 = tb.G;
                if (g1 != null) {
                   if (g1.q.getValue().booleanValue()) {
                      tb.y.setVisibility(8);
                      tb.w.setVisibility(8);
                      tb.x.setVisibility(8);
                   }else {
                      tb.y.setVisibility(i);
                      g1 = tb.G;
                      a g2 = tb.G;
                      d.i(tb.G.x.a(), g1.c, RedPacketType.RED_PACKET_TYPE_CONDITION, a.a(g1.b), e.a(tb.q, g2.c, g2.b, LiveRedPacketAction.RED_PACK_POPUP_GRAB_SHOW.name()), LiveRedPacketGrabButtonType.JOIN_BUTTON);
                      tb.u.setVisibility(8);
                      tb.I.setVisibility(8);
                      tb.H.setVisibility(8);
                      tb.S8();
                      if (!PatchProxy.applyVoid(objArray, tb, p0, "15")) {
                         tb.y.setVisibility(i);
                         a z = tb.z;
                         p0 = PatchProxy.apply(objArray, tb, p0, "16");
                         if (p0 != PatchProxyResult.class) {
                         }else {
                            p0 = a1.p(R.string.arg_RES_7f101fe7);
                         }
                         z.setText(p0);
                         p0 = tb.G;
                         if (p0 != null) {
                            tb.t.onNext(p0);
                         }
                      }
                      tb.R8(1);
                   }
                }
             }
          }
       }
       return;
    }
}
