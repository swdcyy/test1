package mhc.m2;
import uo7.b0;
import java.lang.Object;
import uo7.k;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import wo7.a;
import e17.i$b;
import e17.i;
import com.kwai.sharelib.KsShareApi;
import android.app.Application;
import java.lang.CharSequence;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.io.IOException;
import qrd.l1;
import rq4.d;
import zic.m0;
import android.util.Log;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import k2b.e0;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import com.kwai.sharelib.model.ShareAnyResponse;
import com.kwai.sharelib.model.ShareAnyResponse$ShareAnyData;
import uo7.h0;
import com.kwai.sharelib.exception.ForwardCancelException;
import com.yxcorp.gifshow.share.exception.ForwardCancelException;
import com.yxcorp.retrofit.model.KwaiException;

public class m2 implements b0	// class@003585
{

    public void m2(){
       super();
    }
    public void a(k p0,Throwable p1){
       l1 a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, m2.class, "3")) {
          return;
       }
       a.p(p0, "conf");
       a.p(p1, "it");
       String str = null;
       a uoa = (!p1 instanceof a)? str: p1;
       Integer integer = 0x7f1038e7;
       int i = 0x7f110668;
       if (uoa) {
          i$b uob = i.m();
          String toast = uoa.getToast();
          if (toast == null) {
             toast = KsShareApi.s.k().getString(integer);
             a.o(toast, "KsShareApi.context.getSt¡­ring.network_unavailable\)");
          }
          uob.y(toast);
          uob.o(0);
          uob.l(true);
          i.c(i, uob);
       }else if(!ExceptionHandler.handleException(KsShareApi.s.k(), p1) && p1 instanceof IOException){
          i.a(i, integer);
       }
       a = l1.a;
       d uod = m0.a(p0, str);
       uod.r = Log.getStackTraceString(p1);
       i3 oi3 = i3.f();
       oi3.c("share_with_sdk", Integer.valueOf(true));
       oi3.c("defaultError", Integer.valueOf(2));
       uod.v = oi3.e();
       Activity uActivity = p0.k();
       if (uActivity instanceof GifshowActivity) {
          str = uActivity;
       }
       m0.h(uod, true, str);
       return;
    }
    public void b(k p0,ShareInitResponse$SharePanelElement p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, m2.class, "1")) {
          return;
       }
       a.p(p0, "conf");
       a.p(p1, "element");
       return;
    }
    public void c(k p0,ShareInitResponse$SharePanelElement p1,Throwable p2){
       int i;
       CharSequence uCharSequenc1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, m2.class, "2")) {
          return;
       }
       a.p(p0, "conf");
       a.p(p1, "element");
       a.p(p2, "it");
       ShareAnyResponse shareAnyResp = p0.r();
       CharSequence uCharSequenc = null;
       if (shareAnyResp != null) {
          shareAnyResp = shareAnyResp.mShareAnyData;
          if (shareAnyResp != null) {
             ShareAnyResponse$ShareAnyData mShareChanne = shareAnyResp.mShareChannel;
          label_002d :
             if (a.g(mShareChanne, "IM")) {
                return;
             }else {
                shareAnyResp = p0.r();
                if (shareAnyResp != null) {
                   shareAnyResp = shareAnyResp.mShareAnyData;
                   if (shareAnyResp != null) {
                      mShareChanne = shareAnyResp.mShareChannel;
                   label_0044 :
                      if (a.g(mShareChanne, "SMS")) {
                         return;
                      }else {
                         h0 oh0 = p0.a();
                         String str = (oh0 != null)? oh0.c(): uCharSequenc;
                         if (a.g(str, "moment")) {
                            return;
                         }else if(p2 instanceof ForwardCancelException || p2 instanceof ForwardCancelException){
                            if (p2 instanceof a) {
                               str = p2.getToast();
                               if (str != null) {
                                  i = (str.length() > 0)? 1: 0;
                                  if (i) {
                                     uCharSequenc = str;
                                  }
                                  if (uCharSequenc != null) {
                                  label_009b :
                                     i.d(R.style.arg_RES_7f110668, uCharSequenc);
                                  }
                               }
                               uCharSequenc = KsShareApi.s.k().getString(R.string.arg_RES_7f10474b);
                               a.o(uCharSequenc, "KsShareApi.context.getString\(R.string.share_err\)");
                               goto label_009b ;
                            }else if(p2 instanceof KwaiException && (p2.getErrorCode() == 0xc350 || p2.getErrorCode() == 0xc351)){
                               return;
                            }else {
                               i.a(R.style.arg_RES_7f110668, 0x7f10474b);
                            }
                         }
                         return;
                      }
                   }
                }
                uCharSequenc1 = uCharSequenc;
                goto label_0044 ;
             }
          }
       }
       uCharSequenc1 = uCharSequenc;
       goto label_002d ;
    }
}
