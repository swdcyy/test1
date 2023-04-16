package com.yxcorp.gifshow.message.init.r;
import io.reactivex.g;
import com.yxcorp.gifshow.message.init.s;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import hdb.d0;
import com.kwai.imsdk.m;
import java.lang.String;
import l85.b;
import com.kwai.imsdk.internal.v;
import java.lang.StringBuilder;
import xp6.k;
import org.greenrobot.eventbus.a;
import pp6.g;
import xp6.m;
import bp6.v0;
import java.lang.Runnable;
import crd.b;
import brd.z;
import i85.f;
import com.kwai.imsdk.internal.client.t;
import com.kwai.chat.sdk.signal.BizDispatcher;
import java.util.Set;
import com.kwai.chat.sdk.signal.f;
import i85.a;
import dp6.d0;
import qo6.k;
import com.kwai.chat.sdk.signal.b;
import brd.t;
import java.util.concurrent.TimeUnit;
import j85.k;
import erd.g;
import j85.l;

public final class r implements g	// class@001d63
{
    public final s b;

    public void r(s p0){
       this.b = p0;
    }
    public final void subscribe(v p0){
       r tb = this.b;
       Objects.requireNonNull(tb);
       d0 uod0 = new d0(tb, p0);
       b.i("KwaiIMManager", " disconnect ");
       m.f = null;
       m.F().Q0();
       v ov = v.l();
       Objects.requireNonNull(ov);
       k.a("logout: previous uid="+ov.y());
       a.d().k(new g());
       v.t = null;
       m.e.d(new v0(ov));
       t.D(null);
       t.u(ov.a);
       t.h.remove(BizDispatcher.getStringOrMain(null));
       f.e().t(null);
       t.D(t.j);
       f uof = f.e();
       d0 uod01 = new d0(uod0);
       Objects.requireNonNull(uof);
       t.create(new b(uof)).timeout(5, TimeUnit.SECONDS).subscribe(new k(uod01), new l(uod01));
    }
}
