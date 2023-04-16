package com.kuaishou.merchant.live.basic.router.i;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import e17.i;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import p74.a;
import java.lang.String;
import o74.a;

public final class i implements g	// class@0018c9
{
    public static final i b;

    static {
       i.b = new i();
    }
    public void i(){
       super();
    }
    public final void accept(Object p0){
       if (p0 instanceof KwaiException) {
          KwaiException mErrorMessag = p0.mErrorMessage;
          if (!TextUtils.x(mErrorMessag)) {
             i.d(R.style.arg_RES_7f11066a, mErrorMessag);
          }
       }
       a.l(MerchantCommonLogBiz.DIALOG, "PopupClickRouterHandler", "notifyPopupClick faile: ", p0);
       return;
    }
}
