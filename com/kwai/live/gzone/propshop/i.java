package com.kwai.live.gzone.propshop.i;
import erd.g;
import com.kwai.live.gzone.propshop.h;
import java.lang.Object;
import com.kwai.live.gzone.propshop.LiveGzoneAudiencePropShopResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import e17.i;

public class i implements g	// class@000deb
{
    public final h b;

    public void i(h p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
       }else {
          p0 = p0.mTradeUrl;
          this.b.A = p0;
          if (TextUtils.x(p0)) {
             i.a(R.style.arg_RES_7f110669, 0x7f1009ca);
          }else {
             p0 = this.b;
             p0.Z8(p0.A);
          }
       }
       return;
    }
}
