package com.kuaishou.live.merchant.falsepublicity.c;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.live.merchant.falsepublicity.d;
import pp.a;
import java.lang.String;
import q87.c;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.CharSequence;
import e17.i;

public final class c implements g	// class@000caf
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void accept(Object p0){
       a.C().z("LiveMerchantAudienceFalsePublicityDialog", "feedback error", p0);
       if (p0 instanceof KwaiException) {
          i.d(R.style.arg_RES_7f11066a, p0.mErrorMessage);
       }else {
          i.a(R.style.arg_RES_7f11066a, 0x7f10338e);
       }
       return;
    }
}
