package d82.e;
import erd.g;
import d82.f;
import com.kuaishou.live.basic.escrow.LiveEscrowParam;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.System;
import java.lang.String;
import qs5.a;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import tkd.b;
import tkd.d;
import g02.b;
import android.app.Activity;
import d82.f$a;
import android.app.Dialog;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;

public final class e implements g	// class@00248d
{
    public final f b;
    public final LiveEscrowParam c;

    public void e(f p0,LiveEscrowParam p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       e tb = this.b;
       e tc = this.c;
       Objects.requireNonNull(tb);
       f k = tb.k;
       long l = System.currentTimeMillis() - k;
       if (l > 0 && k > 0) {
          a.b("LIVE_ESCROW", l, tb.l, p0.booleanValue());
       }
       tb.k = 0;
       String str = "LiveAudienceEscrowEntryDialog";
       if (p0.booleanValue()) {
          b.P(LiveLogTag.LIVE_ESCROW.appendTag(str), "install live_anchor_plugin success");
          d.a(-1143495286).Pv(tb.f, tc);
          p0 = tb.h;
          if (p0 != null) {
             p0.onResult(true);
          }
          tb.dismiss();
          PluginDownloadExtension.k.a("live_anchor_plugin");
       }else {
          b.r(LiveLogTag.LIVE_ESCROW.appendTag(str), "install live_anchor_plugin fail");
          i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f100a3e));
          p0 = tb.h;
          if (p0 != null) {
             p0.onResult(false);
          }
          tb.dismiss();
       }
       return;
    }
}
