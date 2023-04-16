package com.yxcorp.gifshow.webview.yoda.utils.k;
import ub7.f;
import java.lang.Object;
import com.yxcorp.gifshow.webview.yoda.utils.q;
import wkd.b;
import ob6.p;
import ob6.h;
import com.kwai.framework.network.keyconfig.WebLocationConfigModel;
import com.kwai.framework.network.keyconfig.BaseConfig;
import java.lang.Boolean;

public final class k implements f	// class@0017d3
{
    public static final k a;

    static {
       k.a = new k();
    }
    public void k(){
       super();
    }
    public final Object get(){
       Boolean uBoolean;
       h oh = b.a(0x36463d96).f();
       if (oh != null) {
          oh = oh.mBaseConfig;
          if (oh != null) {
             WebLocationConfigModel webLocationC = oh.e();
             if (webLocationC != null) {
                uBoolean = Boolean.valueOf(webLocationC.llAllEnable);
             label_0024 :
                return uBoolean;
             }
          }
       }
       uBoolean = Boolean.FALSE;
       goto label_0024 ;
    }
}
