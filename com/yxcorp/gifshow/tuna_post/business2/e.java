package com.yxcorp.gifshow.tuna_post.business2.e;
import qh7.b;
import java.lang.String;
import java.lang.Object;
import yh7.a;
import com.kuaishou.tuna_logger.KsLogTunaPlcTag;
import java.util.List;
import tmc.i;
import msd.a;
import c15.b;
import e17.i;

public final class e implements b	// class@001e32
{
    public final String a;

    public void e(String p0){
       this.a = p0;
    }
    public final void a(a p0){
       e ta = this.a;
       if (p0.a != 200) {
          b.d(KsLogTunaPlcTag.PLC_POST.appendTag("ShareBusinessLinkJumpUtil"), new i(p0, ta));
          if (p0.a == 404) {
             i.a(R.style.arg_RES_7f110668, 0x7f100070);
          }else {
             i.a(R.style.arg_RES_7f110668, 0x7f101869);
          }
       }
       return;
    }
}
