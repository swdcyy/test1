package com.yxcorp.gifshow.webview.yoda.view.d;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView;
import java.lang.StringBuilder;
import com.yxcorp.utility.AbiUtil;
import java.lang.String;
import com.yxcorp.utility.SystemUtil;

public final class d implements x	// class@0017e8
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final Object get(){
       StringBuilder str = "";
       String str1 = (AbiUtil.b())? " OS_PRO_BIT/64": " OS_PRO_BIT/32";
       return str+str1+" MAX_PHY_MEM/"+(SystemUtil.t() >> 20);
    }
}
