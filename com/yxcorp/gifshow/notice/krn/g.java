package com.yxcorp.gifshow.notice.krn.g;
import java.lang.Runnable;
import com.yxcorp.gifshow.permission.ContactPermissionHolder;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import f55.g;
import java.lang.Object;
import tkd.b;
import tkd.d;
import wu5.a;
import android.content.Context;
import android.content.Intent;
import qtb.c;
import n3d.a;
import com.kwai.feature.api.social.bridge.beans.JsAddressInfoResult;

public final class g implements Runnable	// class@0021a7
{
    public final ContactPermissionHolder b;
    public final Activity c;
    public final GifshowActivity d;
    public final g e;

    public void g(ContactPermissionHolder p0,Activity p1,GifshowActivity p2,g p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       g tc = this.c;
       g td = this.d;
       g te = this.e;
       if (this.b.d()) {
          td.t1(d.a(0x6de3c81e).g4(tc, 100), 2049, new c(te));
       }else {
          te.onSuccess(new JsAddressInfoResult(1, false, false));
       }
       return;
    }
}
