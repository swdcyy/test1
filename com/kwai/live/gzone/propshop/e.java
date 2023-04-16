package com.kwai.live.gzone.propshop.e;
import lf3.g;
import com.kwai.live.gzone.propshop.h;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCGzoneVirtualTradeOpened;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import java.lang.String;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.k1;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import v67.f;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lf3.f;

public final class e implements g	// class@000de1
{
    public final h b;

    public void e(h p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       b.Z(LiveLogTag.GZONE, "receive prop shop open, url:"+p0.shopUrl);
       if (PatchProxy.applyVoidOneRefs(p0, tb, h.class, "8")) {
       }else if(p0.dynamicUrl == null && TextUtils.x(p0.shopUrl)){
          LiveStreamMessages$SCGzoneVirtualTradeOpened displayMaxDe = p0.displayMaxDelayMillis;
          if (displayMaxDe - null > 0) {
             tb.X7(t.timer(k1.k(displayMaxDe), TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new f(tb, p0), Functions.e));
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
