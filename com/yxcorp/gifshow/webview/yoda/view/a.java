package com.yxcorp.gifshow.webview.yoda.view.a;
import ok.x;
import java.lang.Object;
import syc.a;
import java.lang.StringBuilder;
import com.yxcorp.utility.AbiUtil;
import java.lang.String;
import com.yxcorp.utility.SystemUtil;

public final class a implements x	// class@0017e4
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final Object get(){
       StringBuilder str = "";
       String str1 = (AbiUtil.b())? " OS_PRO_BIT/64": " OS_PRO_BIT/32";
       return str+str1+" MAX_PHY_MEM/"+(SystemUtil.t() >> 20);
    }
}
