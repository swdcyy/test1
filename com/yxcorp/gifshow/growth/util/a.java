package com.yxcorp.gifshow.growth.util.a;
import java.util.HashSet;
import java.lang.Object;
import android.net.Uri;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import cra.j;
import java.lang.Runnable;
import t45.c;
import android.content.Context;
import com.kwai.robust.PatchProxyResult;
import android.content.ClipboardManager;
import android.content.ClipData;
import com.kwai.privacykit.interceptor.ClipboardInterceptor;
import android.content.ClipDescription;
import android.content.ClipData$Item;
import java.lang.Boolean;
import wa5.e;
import cra.w;
import q87.c;
import android.app.Application;
import o56.a;
import java.lang.Exception;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class a	// class@00159e
{
    public boolean a;
    public static Set b;

    static {
       a.b = new HashSet(2);
    }
    public void a(){
       super();
       this.a = false;
    }
    public static void a(Uri p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "3")) {
          return;
       }
       if (p0 != null && !TextUtils.x(p0.getQueryParameter("growth_channel_id"))) {
          c.a(new j(p0));
       }
       return;
    }
    public static CharSequence c(Context p0){
       ClipData primaryClip;
       CharSequence text;
       String obj = PatchProxy.applyOneRefs(p0, null, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ClipboardManager systemServic = p0.getSystemService("clipboard");
       obj = "";
       if (systemServic == null) {
          return obj;
       }
       try{
          primaryClip = ClipboardInterceptor.getPrimaryClip(systemServic);
       }catch(java.lang.SecurityException e0){
       }
       if (primaryClip != null && primaryClip.getItemCount() > 0) {
          ClipDescription description = primaryClip.getDescription();
          if (description != null && (description.getMimeTypeCount() > 0 && ("text/plain").equals(description.getMimeType(0)))) {
             ClipData$Item itemAt = primaryClip.getItemAt(0);
             if (itemAt != null && itemAt.getText() != null) {
                text = itemAt.getText();
             }
          }
       }
    label_0055 :
       return e0;
    }
    public final String b(boolean p0,boolean p1){
       String obj;
       String str1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "7");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = "";
       if (p0) {
          String str = "GrowthDeepLinkManager";
          int i = 0;
          if (e.f()) {
             Object[] objArray = new Object[i];
             w.C().w(str, "clipboard privacy permission is not agreed in menu setting", objArray);
             return obj;
          }else {
             try{
                str1 = a.c(a.b()).toString();
             }catch(java.lang.Exception e8){
                Object[] objArray1 = new Object[i];
                w.C().t(str, e8.getLocalizedMessage(), objArray1);
                str1 = obj;
             }
             if (p1) {
                String str2 = "^\(kwai|ksnebula\)://.*$";
                Object obj1 = PatchProxy.applyTwoRefs(str1, str2, this, uoa, "11");
                if (obj1 != patchProxyRe) {
                   i = obj1.booleanValue();
                }else if(TextUtils.x(str1)){
                   i = Pattern.compile(str2).matcher(str1).find();
                }
                if (i) {
                label_007b :
                   obj = str1;
                }
             }else {
                goto label_007b ;
             }
          }
       }
       return obj;
    }
}
