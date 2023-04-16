package com.yxcorp.gifshow.share.o;
import java.lang.Object;
import com.yxcorp.gifshow.share.OperationModel;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.share.KwaiOperator;
import java.lang.String;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mhc.r2;
import erd.g;
import com.yxcorp.gifshow.share.n;
import erd.o;
import android.content.Context;
import java.util.List;
import java.util.Iterator;
import com.kwai.feature.post.api.feature.upload.model.ForwardResult;
import java.lang.StringBuilder;
import tid.b;
import r4d.a;
import com.yxcorp.gifshow.exception.ForwardException;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class o	// class@001bef
{

    public void o(){
       super();
    }
    public static t a(OperationModel p0,GifshowActivity p1,KwaiOperator p2,String p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, o.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.just(p2).doOnNext(new r2(p0, p1, p3)).map(n.b);
    }
    public static String b(boolean p0){
       if (p0) {
          return "POPUP_QQ";
       }
       return "POPUP_QQ_ZONE";
    }
    public static String c(boolean p0){
       if (p0) {
          return "POPUP_WECHAT";
       }
       return "POPUP_WECHAT_TIMELINE";
    }
    public static void d(Context p0,List p1){
       String str = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, str, o.class, "5")) {
          return;
       }
       if (p1 == null || p1.isEmpty()) {
          return;
       }
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          ForwardResult uForwardResu = iterator.next();
          if (uForwardResu == null || uForwardResu.mResult == null) {
             continue ;
          }else if(str == null){
             str = "";
          }else {
             str = str+"\n";
          }
          str = str+uForwardResu.mResponse;
          if (uForwardResu.mResultCode == 91) {
             a uoa = b.a(b.c(uForwardResu.mPlatform), p0);
             if (uoa != null) {
                uoa.logout();
             }
          }
       }
       if (str == null) {
          return;
       }
       throw new ForwardException(str);
    }
    public static boolean e(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, o.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.x(p0) && (!p0.equals("POPUP_WECHAT") && (!p0.equals("POPUP_WECHAT_TIMELINE") && (p0.equals("POPUP_QQ") || p0.equals("POPUP_QQ_ZONE")))))? true: false;
       return b;
    }
}
