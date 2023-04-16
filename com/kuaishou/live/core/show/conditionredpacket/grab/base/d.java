package com.kuaishou.live.core.show.conditionredpacket.grab.base.d;
import erd.g;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.e;
import java.lang.Object;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import p91.m;
import android.view.View;
import com.kuaishou.live.core.show.redpacket.LiveRedPacketResourcePathConstant;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import gi2.d;
import b62.b;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import android.os.Message;
import crd.b;
import lnc.b9;
import u52.t;
import i62.z;
import i62.t$c;
import brd.t;
import b62.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class d implements g	// class@000a83
{
    public final e b;

    public void d(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == null) {
       }else {
          tb.G = p0;
          tb.V8(p0);
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, tb, e.class, "10") && tb.u.e()) {
             tb.x.setVisibility(0);
             tb.x.setClickable(0);
             tb.H7(tb.z, tb.y, LiveRedPacketResourcePathConstant.LIVE_CONDITION_RED_PACKET_CURRENT_INFO_TIP_ICON_LARGE);
          }
          tb.X8(p0);
          b uob = new b(tb, p0);
          tb.F = uob;
          LiveConditionRedPacketInfo t = p0.t;
          tb.E = t;
          t.observeForever(uob);
          tb.S8(p0, objArray);
          tb.W8(p0, objArray);
          tb.Y8(p0, objArray);
          b9.a(tb.H);
          p0 = tb.p.c.n().d(2).subscribe(new g(tb, p0));
          tb.H = p0;
          tb.X7(p0);
       }
       return;
    }
}
