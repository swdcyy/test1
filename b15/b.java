package b15.b;
import xx5.d;
import java.lang.Object;
import com.kwai.framework.model.tuna.button.TunaButtonModel;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import b15.a;
import com.kwai.framework.model.tuna.button.ActionParams;
import androidx.collection.ArrayMap;
import java.util.Map;
import ekd.q;
import fg6.a;
import com.google.gson.Gson;
import com.kwai.framework.model.tuna.button.JumpUrlModel;
import kotlin.jvm.internal.a;
import com.kuaishou.tuna_logger.KsgLogTunaLiveTag;
import java.util.List;
import com.kuaishou.tuna_live.plugin.TunaLiveLogUtils$appendTunaExtraInfoForLiveOnTunaButtonModel$$inlined$let$lambda$1;
import msd.a;
import c15.b;
import com.kuaishou.tuna_live.plugin.TunaLiveLogUtils$appendTunaExtraInfoForLiveOnTunaButtonModel$$inlined$let$lambda$2;
import com.kuaishou.tuna_live.plugin.TunaLiveLogUtils$appendTunaExtraInfoForLiveOnTunaButtonModel$$inlined$let$lambda$3;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.tuna_live.plugin.TunaLiveLogUtils$appendTunaExtraLogInfo$1$1;
import android.content.Intent;
import java.lang.CharSequence;
import com.kuaishou.tuna_live.plugin.a;
import wp5.c;
import com.kwai.robust.PatchProxyResult;
import wp5.b;
import java.util.Collection;
import java.util.ArrayList;
import cy5.a;
import com.kuaishou.tuna_live.plugin.TunaLiveNoticePerfLogger;
import android.net.Uri;
import xkd.b;

public class b implements d	// class@000335
{

    public void b(){
       super();
    }
    public void K4(TunaButtonModel p0,BaseFeed p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "4")) {
          return;
       }
       JumpUrlModel jumpUrlModel = null;
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, jumpUrlModel, a.class, "2") && p0 != null) {
          try{
             p0 = p0.mActionParams;
             if (p0 != null) {
                ActionParams mJumpUrlMode = p0.mJumpUrlModel;
                if (mJumpUrlMode != null) {
                   ArrayMap uArrayMap = new ArrayMap();
                   Map map = a.b(p1);
                   if (!q.h(map)) {
                      uArrayMap.putAll(map);
                   }
                   String str = a.a.q(uArrayMap);
                   JumpUrlModel mUrl = mJumpUrlMode.mUrl;
                   int i = 0;
                   if (mUrl != null) {
                      TunaLiveLogUtils$appendTunaExtraInfoForLiveOnTunaButtonModel$$inlined$let$lambda$1 uoappendTuna = (mUrl.length() > 0)? 1: null;
                      if (!uoappendTuna) {
                         mUrl = jumpUrlModel;
                      }
                      if (mUrl != null) {
                         a.o(str, "appendParamsJson");
                         mJumpUrlMode.mUrl = a.a(mUrl, "tuna_extra_info_for_live", str);
                         b.f(KsgLogTunaLiveTag.TUNA_LIVE_APPEND_PARAMS.appendTag("appendTunaButtonModel"), new TunaLiveLogUtils$appendTunaExtraInfoForLiveOnTunaButtonModel$$inlined$let$lambda$1(mJumpUrlMode, str));
                      }
                   }
                   mUrl = mJumpUrlMode.mKrnUrl;
                   if (mUrl != null) {
                      TunaLiveLogUtils$appendTunaExtraInfoForLiveOnTunaButtonModel$$inlined$let$lambda$2 uoappendTuna1 = (mUrl.length() > 0)? 1: null;
                      if (!uoappendTuna1) {
                         mUrl = jumpUrlModel;
                      }
                      if (mUrl != null) {
                         a.o(str, "appendParamsJson");
                         mJumpUrlMode.mKrnUrl = a.a(mUrl, "tuna_extra_info_for_live", str);
                         b.f(KsgLogTunaLiveTag.TUNA_LIVE_APPEND_PARAMS.appendTag("appendTunaButtonModel"), new TunaLiveLogUtils$appendTunaExtraInfoForLiveOnTunaButtonModel$$inlined$let$lambda$2(mJumpUrlMode, str));
                      }
                   }
                   mUrl = mJumpUrlMode.mLiteKrnUrl;
                   if (mUrl != null) {
                      if (mUrl.length() > 0) {
                         i = 1;
                      }
                      if (i) {
                         jumpUrlModel = mUrl;
                      }
                      if (jumpUrlModel != null) {
                         a.o(str, "appendParamsJson");
                         mJumpUrlMode.mLiteKrnUrl = a.a(jumpUrlModel, "tuna_extra_info_for_live", str);
                         b.f(KsgLogTunaLiveTag.TUNA_LIVE_APPEND_PARAMS.appendTag("appendTunaButtonModel"), new TunaLiveLogUtils$appendTunaExtraInfoForLiveOnTunaButtonModel$$inlined$let$lambda$3(mJumpUrlMode, str));
                      }
                   }
                }
             }
          }catch(java.lang.Exception e9){
             ExceptionHandler.handleCaughtException(new IllegalArgumentException("Tuna appendTunaExtraInfoForLiveOnTunaButtonModel crash!", e9));
          }
       }
    }
    public void Y9(Map p0,TunaButtonModel p1,BaseFeed p2){
       ActionParams mActionParam1;
       JumpUrlModel mActionParam1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "3")) {
          return;
       }
       try{
          if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a.class, "1") && p0 != null) {
             ArrayMap uArrayMap = new ArrayMap();
             String str = "url";
             JumpUrlModel jumpUrlModel = null;
             if (p1 != null) {
                TunaButtonModel mActionParam = p1.mActionParams;
                if (mActionParam != null) {
                   mActionParam1 = mActionParam.mJumpUrlModel;
                   if (mActionParam1 != null) {
                      mActionParam1 = mActionParam1.mUrl;
                   label_0036 :
                      uArrayMap.put(str, TextUtils.I(mActionParam1));
                      if (p1 != null) {
                         p1 = p1.mActionParams;
                         if (p1 != null) {
                            ActionParams mJumpUrlMode = p1.mJumpUrlModel;
                            if (mJumpUrlMode != null) {
                               jumpUrlModel = mJumpUrlMode.mKrnUrl;
                            }
                         }
                      }
                      uArrayMap.put("krn_url", TextUtils.I(jumpUrlModel));
                      Map map = a.b(p2);
                      if (!q.h(map)) {
                         uArrayMap.putAll(map);
                      }
                      String str1 = a.a.q(uArrayMap);
                      a.o(str1, "Gsons.KWAI_GSON.toJson\(tunaLogParams\)");
                      p0.put("tuna_extra_info_for_live", str1);
                      b.f(KsgLogTunaLiveTag.TUNA_LIVE_APPEND_PARAMS.appendTag("appendTunaExtraLogInfo"), new TunaLiveLogUtils$appendTunaExtraLogInfo$1$1(p0));
                   }
                }
             }
             mActionParam1 = jumpUrlModel;
             goto label_0036 ;
          }
       }catch(java.lang.Exception e8){
          ExceptionHandler.handleCaughtException(new IllegalArgumentException("Tuna appendTunaExtraLogInfo crash!", e8));
       }
       return;
    }
    public void gG(Intent p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "7")) {
          return;
       }
       if (p0 != null && !TextUtils.x(p1)) {
          p0.putExtra("tunaMakeMoneyParams", p1);
       }else {
          b.g(KsgLogTunaLiveTag.MAKE_MONEY_ENTRY.appendTag("appendStartLiveTunaTaskInfo"), a.b);
       }
       return;
    }
    public void hb(Map p0,BaseFeed p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "5")) {
          return;
       }
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "3") && p0 != null) {
          ArrayMap uArrayMap = new ArrayMap();
          Map map = a.b(p1);
          if (!q.h(map)) {
             uArrayMap.putAll(map);
          }
          String str = a.a.q(uArrayMap);
          a.o(str, "appendParamsJson");
          p0.put("tuna_extra_info_for_live", str);
       }
       return;
    }
    public c i0(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b();
    }
    public boolean isAvailable(){
       return true;
    }
    public Collection p(){
       ArrayList obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add("CommercialYodaWebActivity");
       obj.add("KwaiYodaWebViewActivity");
       obj.add("KwaiWebViewActivity");
       return obj;
    }
    public a rA(){
       Object obj = PatchProxy.apply(null, this, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new TunaLiveNoticePerfLogger();
    }
    public String tY(String p0,BaseFeed p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Uri obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = b.g(p0);
       if (TextUtils.x(p0) || obj == null) {
          return p0;
       }
       Object obj1 = null;
       String str = PatchProxy.applyTwoRefs(p0, p1, obj1, a.class, "5");
       if (str != patchProxyRe) {
       }else {
          a.p(p0, "scheme");
          Gson gson = (p0.length() > 0)? 1: null;
          if (gson) {
             obj1 = p0;
          }
          if (obj1 != null) {
             String str1 = a.a.q(a.b(p1));
             a.o(str1, "appendJson");
             p0 = a.a(p0, "tuna_extra_info_for_live", str1);
          }
          str = p0;
       }
       return str;
    }
}
