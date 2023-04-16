package com.kuaishou.tuna.plc.logic.PlcPreDecideScheme;
import ry4.a;
import com.kuaishou.tuna.plc.logic.PlcPreDecideScheme$mNeedJudgeScheme$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.detail.plc.adapter.PlcEntryDataAdapter;
import com.yxcorp.gifshow.detail.plc.model.PlcPreDecideWhiteInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.plc.model.PlcPreDecideWhiteInfo$WhiteInfo;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.CharSequence;
import kotlin.jvm.internal.a;
import zsd.u;

public final class PlcPreDecideScheme extends a	// class@001030
{
    public final p b;

    public void PlcPreDecideScheme(){
       super();
       this.b = s.c(PlcPreDecideScheme$mNeedJudgeScheme$2.INSTANCE);
    }
    public int d(){
       return 2;
    }
    public int getBizType(){
       return 0;
    }
    public boolean h(PlcEntryDataAdapter p0,PlcPreDecideWhiteInfo p1){
       PlcPreDecideWhiteInfo$WhiteInfo whiteUrlTemp;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PlcPreDecideScheme plcPreDecide = PlcPreDecideScheme.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, plcPreDecide, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return true;
       }
       Boolean uBoolean = PatchProxy.apply(null, this, plcPreDecide, "1");
       if (uBoolean == patchProxyRe) {
          uBoolean = this.b.getValue();
       }
       if (!uBoolean.booleanValue()) {
          return true;
       }else if(!this.g(p0, 3)){
          return true;
       }else if(p1 != null){
          PlcPreDecideWhiteInfo mSchemeWhite = p1.mSchemeWhiteInfo;
          if (mSchemeWhite != null) {
             whiteUrlTemp = mSchemeWhite.whiteUrlTemplates;
          label_0042 :
             if (q.f(whiteUrlTemp)) {
                return true;
             }else if(p1 != null){
                p1 = p1.mSchemeWhiteInfo;
                if (p1 != null) {
                   PlcPreDecideWhiteInfo$WhiteInfo whiteUrlTemp1 = p1.whiteUrlTemplates;
                   if (whiteUrlTemp1 != null) {
                      Iterator iterator = whiteUrlTemp1.iterator();
                      while (iterator.hasNext()) {
                         String str = iterator.next();
                         String actionUrl = p0.getActionUrl();
                         actionUrl = (actionUrl == null || !actionUrl.length())? 1: null;
                         if (!actionUrl) {
                            actionUrl = p0.getActionUrl();
                            if (actionUrl != null) {
                               a.o(str, "scheme");
                               if (u.q2(actionUrl, str, false, 2, null) == true) {
                                  return true;
                               }
                            }
                         }
                      }
                   }
                }
             }
             return false;
          }
       }
       whiteUrlTemp = null;
       goto label_0042 ;
    }
}
