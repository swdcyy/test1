package com.yxcorp.gifshow.webview.config.a$a;
import n3d.a;
import com.yxcorp.gifshow.webview.config.a;
import com.kuaishou.webkit.ValueCallback;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.net.Uri;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import sy7.b;
import java.lang.Throwable;
import android.app.Activity;
import brd.t;
import com.kwai.framework.ui.popupmanager.dialog.a;
import com.yxcorp.gifshow.webview.config.a$a$a;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public class a$a implements a	// class@00173e
{
    public final ValueCallback b;
    public final ValueCallback c;
    public final a d;

    public void a$a(a p0,ValueCallback p1,ValueCallback p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onActivityCallback(int p0,int p1,Intent p2){
       boolean b;
       a$a tb;
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, a$a.class, "1")) {
          return;
       }
       if (p1 == -1 && (p0 == 5 && (p2 != null && !TextUtils.isEmpty(p2.getDataString())))) {
          Uri data = p2.getData();
          a$a td = this.d;
          Objects.requireNonNull(td);
          Object obj = PatchProxy.applyOneRefs(data, td, a.class, "9");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(!a.t().d("yoda_file_chooser_internal_check", false)){
             b = td.g(data);
          }
          if (b) {
             tb = this.b;
             if (tb != null) {
                tb.onReceiveValue(null);
             }else {
                this.c.onReceiveValue(null);
             }
             return;
          }else {
             a.g(this.d.e, "android.permission.WRITE_EXTERNAL_STORAGE").subscribe(new a$a$a(this, p2), Functions.d());
          }
       }else {
          tb = this.b;
          if (tb != null) {
             tb.onReceiveValue(null);
          }else {
             this.c.onReceiveValue(null);
          }
       }
       return;
    }
}
