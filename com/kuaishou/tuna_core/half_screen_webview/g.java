package com.kuaishou.tuna_core.half_screen_webview.g;
import agc.e;
import java.lang.Object;
import android.app.Activity;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.utility.n;
import android.net.Uri;
import java.util.Map;
import agc.d;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import com.kuaishou.tuna_logger.KsLogTunaCoreTag;
import java.util.List;
import com.kuaishou.tuna_core.half_screen_webview.f;
import msd.a;
import java.lang.Throwable;
import c15.b;
import android.view.Window;
import com.kuaishou.tuna_core.half_screen_webview.CommercialDialogWebFragment$a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.tuna_core.half_screen_webview.CommercialDialogWebFragment$LayoutStyle;
import com.kuaishou.tuna_core.half_screen_webview.CommercialDialogWebFragment;
import wz4.k;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.KwaiDialogFragment;

public class g implements e	// class@0010ca
{

    public void g(){
       super();
    }
    public static int e(Activity p0,float p1){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), null, og, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return (int)((float)n.j(p0) * p1);
    }
    public String a(){
       return "servicehalfwebview";
    }
    public boolean b(Uri p0,Map p1){
       return d.b(this, p0, p1);
    }
    public String c(){
       return "kwai";
    }
    public void d(Activity p0,Map p1,Map p2){
       int i1;
       boolean b;
       boolean b1;
       boolean b2;
       String str = "halfDialogFixedHeightRatio";
       String str1 = "disableJsSetHeight";
       String str2 = "halfWebDialogToken";
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, g.class, "2")) {
          return;
       }
       String str3 = p1.get("url");
       if (!TextUtils.x(str3)) {
          String str4 = "UNKNOWN";
          Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "3");
          int i = (obj != PatchProxyResult.class)? obj.intValue(): g.e(p0, 0x3f147ae1);
          try{
             i1 = 0;
             if (p2 != null && p2.containsKey(str2)) {
                Object obj1 = p2.get(str2);
                if (obj1 != null) {
                   str4 = obj1.toString();
                }
                b = (p2.containsKey(str1) && Boolean.parseBoolean(p2.get(str1).toString()))? true: false;
                if (p2.containsKey(str)) {
                   i = g.e(p0, Float.parseFloat(p2.get(str).toString()));
                }
                b2 = p2.containsKey("needLoadingView");
             label_008e :
                if (b2) {
                   b1 = Boolean.parseBoolean(p2.get("needLoadingView").toString());
                }else if(!p1.containsKey("needLoadingView") || Boolean.parseBoolean(p1.get("needLoadingView"))){
                   i1 = 1;
                }
                b1 = i1;
             }else {
                b2 = false;
                b = false;
                goto label_008e ;
             }
             p0.getWindow().setSoftInputMode(2);
             CommercialDialogWebFragment$a uoa = new CommercialDialogWebFragment$a(str3);
             uoa.a(true);
             uoa.b(i);
             uoa.d(p0.getSupportFragmentManager(), "CommercialDialogWeb");
             uoa.c(CommercialDialogWebFragment$LayoutStyle.STYLE_ROUND_CORNER);
             uoa.e(str4);
             uoa.k = b;
             uoa.f(b1);
             CommercialDialogWebFragment uCommercialD = CommercialDialogWebFragment.Nh(uoa);
             uCommercialD.k0(new k(p0));
             if (uoa.d != null) {
                uCommercialD.Cb(uoa.e, uoa.f);
             }
          }catch(java.lang.Exception e12){
          }catch(java.lang.Exception e12){
             i1 = b;
          }
          b.e(KsLogTunaCoreTag.TUNA_HALF_WEB_VIEW.appendTag("jumpActionHook"), f.b, e12);
          b = i1;
          b1 = true;
          goto label_00c3 ;
       }
       return;
    }
    public String getPath(){
       return null;
    }
}
