package com.tachikoma.core.utility.d;
import io.reactivex.i;
import java.lang.String;
import java.lang.Object;
import brd.c0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.tachikoma.core.utility.b;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import s0d.e;
import java.lang.CharSequence;
import android.text.TextUtils;
import zp8.a;
import android.net.Uri;
import java.lang.StringBuilder;
import java.io.File;
import iq8.w;
import android.net.Uri$Builder;
import com.yxcorp.image.request.a;
import s0d.a;
import java.lang.Throwable;

public final class d implements i	// class@000dd8
{
    public final String a;
    public final int b;
    public final int c;
    public final String d;

    public void d(String p0,int p1,int p2,String p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void a(c0 p0){
       Uri obj;
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       d ta = this.a;
       d tb = this.b;
       d tc = this.c;
       d td = this.d;
       if (PatchProxy.isSupport(b.class)) {
          obj = PatchProxy.applyFourRefs(ta, Integer.valueOf(tb), Integer.valueOf(tc), td, null, b.class, "9");
          if (obj != PatchProxyResult.class) {
          }else if(TextUtils.isEmpty(ta)){
             a.i("ImageLoadModule", "uri is empty");
          }else {
             obj = Uri.parse(ta);
             String str = "";
             String str1 = (TextUtils.isEmpty(obj.getScheme()))? "": obj.getScheme();
             str = str+str1+"://";
             str1 = -1;
             switch (str.hashCode()){
                 case 0xa7cec7d8:
                   if (str.equals("bundle://")) {
                      str1 = 5;
                   }
                   break;
                 case 0xcd09289e:
                   if (str.equals("file://")) {
                      str1 = 4;
                   }
                   break;
                 case 0xe9c0ceaa:
                   if (str.equals("asset://")) {
                      str1 = 3;
                   }
                   break;
                 case 0xf81eaacf:
                   if (str.equals("https://")) {
                      str1 = 2;
                   }
                   break;
                 case 0x4a10aa12:
                   if (str.equals("http://")) {
                      str1 = 1;
                   }
                   break;
                 case 0x5604d7b0:
                   if (str.equals("data://")) {
                      str1 = 0;
                   }
                   break;
                 default:
             }
          label_00b6 :
             if (str1 && (str1 != 1 && str1 != 2)) {
                if (str1 != 3) {
                   if (str1 != 4) {
                      obj = (str1 != 5)? Uri.fromFile(new File(w.c(ta, td))): Uri.fromFile(new File(w.c(ta, td)));
                   }else {
                      obj = Uri.fromFile(new File(w.e(ta)));
                   }
                }else {
                   obj = new Uri$Builder().scheme("res").path(String.valueOf(w.d(ta))).build();
                }
             }
             a uoa = a.t(obj);
             if (tb > null && tc > null) {
                uoa.o(tb, tc);
             }
             obj = uoa.q();
          }
       }else {
          goto label_0036 ;
       }
       if (obj == null) {
          p0.onError(new Throwable("request is null"));
       }else {
          p0.onSuccess(obj);
       }
       return;
    }
}
