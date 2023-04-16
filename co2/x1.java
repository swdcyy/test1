package co2.x1;
import erd.o;
import android.app.Activity;
import java.lang.Object;
import zq8.a;
import android.content.Context;
import brd.t;
import com.kuaishou.live.common.core.basic.arya.LiveSnowManager;
import java.lang.String;
import qs5.d;
import gxc.b;
import com.yxcorp.gifshow.util.LoadPolicy;
import java.lang.Class;
import brd.a0;
import lnc.qa;
import com.kuaishou.live.core.voiceparty.c0;
import brd.w;
import erd.h;
import java.lang.Boolean;

public final class x1 implements o	// class@0005b8
{
    public final Activity b;

    public void x1(Activity p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       x1 tb = this.b;
       p0 = (p0.b != null)? t.combineLatest(LiveSnowManager.h(false, tb), d.a("live_anchor_plugin", 40), qa.s(b.class, LoadPolicy.DIALOG).d0(), c0.a): t.just(Boolean.FALSE);
       return p0;
    }
}
