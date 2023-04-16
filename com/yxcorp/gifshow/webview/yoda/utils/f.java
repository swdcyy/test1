package com.yxcorp.gifshow.webview.yoda.utils.f;
import erd.o;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.webview.yoda.utils.q;
import ua6.b;
import ua6.b$a;
import ia0.c;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Boolean;

public final class f implements o	// class@0017ce
{
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
    }
    public final Object apply(Object p0){
       boolean b;
       if (("appver").equals(p0)) {
          p0 = Boolean.valueOf(TextUtils.isEmpty(b.c.a().e().getAppVersion()));
       }else if(("did").equals(p0)){
          p0 = Boolean.valueOf(TextUtils.isEmpty(b.c.a().e().getDeviceId()));
       }else if(("token").equals(p0)){
          p0 = Boolean.valueOf(TextUtils.isEmpty(b.c.a().e().a()));
       }else if(("kuaishou.api_st").equals(p0)){
          p0 = Boolean.valueOf(TextUtils.isEmpty(b.c.a().e().G()));
       }else if(("kuaishou.h5_st").equals(p0)){
          p0 = Boolean.valueOf(TextUtils.isEmpty(b.c.a().e().k()));
       }else if(("client_key").equals(p0)){
          p0 = Boolean.valueOf(TextUtils.isEmpty(b.c.a().e().n()));
       }else if(("userId").equals(p0)){
          p0 = b.c;
          b = (TextUtils.isEmpty(p0.a().e().getUserId()) || ("0").equals(p0.a().e().getUserId()))? true: false;
          b = Boolean.valueOf(b);
       }else if(("kpn").equals(p0)){
          p0 = Boolean.valueOf(TextUtils.isEmpty(b.c.a().e().getKpn()));
       }else {
          p0 = Boolean.FALSE;
       }
       return p0;
    }
}
