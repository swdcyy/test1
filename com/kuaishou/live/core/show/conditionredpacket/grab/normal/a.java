package com.kuaishou.live.core.show.conditionredpacket.grab.normal.a;
import erd.g;
import com.kuaishou.live.core.show.conditionredpacket.grab.normal.b;
import java.lang.Object;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import java.util.Objects;
import android.os.Message;
import u52.t;
import i62.z;
import i62.t$c;
import brd.t;
import e62.f;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class a implements g	// class@000a99
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == null) {
       }else {
          tb.F = p0;
          tb.a9(p0);
          tb.Z8(p0);
          tb.W8(p0, null);
          tb.X7(tb.p.c.n().d(2).subscribe(new f(tb, p0)));
          tb.V8(p0);
       }
       return;
    }
}
