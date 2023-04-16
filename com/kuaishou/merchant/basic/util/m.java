package com.kuaishou.merchant.basic.util.m;
import java.lang.Object;
import android.app.Activity;
import com.kuaishou.merchant.web.yoda.params.JsSelectIdCardParams;
import f55.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.GifshowActivity;
import wkd.b;
import nf6.i;
import java.lang.StringBuilder;
import android.net.Uri;
import ekd.x0;
import android.content.Context;
import android.content.Intent;
import ot3.c0;
import com.kwai.robust.PatchProxyResult;
import n3d.a;
import ot3.i0;

public class m	// class@0015e2
{

    public void m(){
       super();
    }
    public static void a(Activity p0,JsSelectIdCardParams p1,g p2){
       int b;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, m.class, "1")) {
          return;
       }
       if (p0 instanceof GifshowActivity) {
          Intent intent = b.a(0x66dce92a).c(p0, x0.f("kwai://idcard/takephoto?authorizeType="+p1.mAuthorizeType), false, false);
          GifshowActivity gifshowActiv = p0;
          b = c0.b;
          i0 oi0 = PatchProxy.applyThreeRefs(p0, p1, p2, null, m.class, "2");
          if (oi0 != PatchProxyResult.class) {
          }else {
             oi0 = new i0(p0, p1, p2);
          }
          gifshowActiv.t1(intent, b, oi0);
       }
       return;
    }
}
