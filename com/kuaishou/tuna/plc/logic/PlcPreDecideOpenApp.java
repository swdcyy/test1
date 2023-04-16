package com.kuaishou.tuna.plc.logic.PlcPreDecideOpenApp;
import ry4.a;
import com.kuaishou.tuna.plc.logic.PlcPreDecideOpenApp$mNeedJudgeDeepLink$2;
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
import java.util.List;
import java.lang.Integer;

public final class PlcPreDecideOpenApp extends a	// class@00102d
{
    public final p b;

    public void PlcPreDecideOpenApp(){
       super();
       this.b = s.c(PlcPreDecideOpenApp$mNeedJudgeDeepLink$2.INSTANCE);
    }
    public int d(){
       return 3;
    }
    public int getBizType(){
       return 0;
    }
    public boolean h(PlcEntryDataAdapter p0,PlcPreDecideWhiteInfo p1){
       PlcPreDecideWhiteInfo$WhiteInfo whiteBizType;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PlcPreDecideOpenApp plcPreDecide = PlcPreDecideOpenApp.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, plcPreDecide, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return true;
       }
       if (!this.g(p0, true)) {
          return true;
       }
       if (p1 != null) {
          PlcPreDecideWhiteInfo mDeepLinkWhi = p1.mDeepLinkWhiteInfo;
          if (mDeepLinkWhi != null) {
             whiteBizType = mDeepLinkWhi.whiteBizType;
          label_0029 :
             if (q.f(whiteBizType)) {
                return true;
             }else {
                Boolean uBoolean = PatchProxy.apply(null, this, plcPreDecide, "1");
                if (uBoolean == patchProxyRe) {
                   uBoolean = this.b.getValue();
                }
                if (!uBoolean.booleanValue()) {
                   return true;
                }else if(p1 != null){
                   p1 = p1.mDeepLinkWhiteInfo;
                   if (p1 != null) {
                      Iterator iterator = p1.whiteBizType.iterator();
                      while (iterator.hasNext()) {
                         Integer integer = iterator.next();
                         int bizType = p0.getBizType();
                         if (integer != null && integer.intValue() == bizType) {
                            return true;
                         }
                      }
                   }
                }
                return false;
             }
          }
       }
       whiteBizType = null;
       goto label_0029 ;
    }
}
