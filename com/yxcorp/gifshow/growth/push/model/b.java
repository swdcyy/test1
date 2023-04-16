package com.yxcorp.gifshow.growth.push.model.b;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.yxcorp.gifshow.growth.push.model.a;
import ok.x;
import java.lang.Object;
import iqa.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.growth.push.model.PushConfigRecord;
import fg6.a;
import com.google.gson.Gson;
import vma.a;
import java.lang.Exception;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.growth.push.model.HotPushResp;
import java.util.List;
import java.util.Iterator;
import com.yxcorp.gifshow.growth.push.model.PushGuideType;
import com.yxcorp.gifshow.growth.push.model.PushOpenConfig;
import com.yxcorp.gifshow.growth.push.model.PushCofigRdItem;
import cra.g;
import java.lang.Integer;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class b extends ConfigAutoParseJsonConsumer	// class@0014a6
{

    public void b(){
       super(a.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
       }else {
          try{
             PushConfigRecord pushConfigRe = this.f();
             if (this.d(p0)) {
                this.e(pushConfigRe, p0);
                a.q(a.a.q(p0.mGuideResp));
             }else {
                a.q("");
             }
          }catch(java.lang.Exception e3){
             e3.printStackTrace();
          }
       }
    }
    public final boolean d(a p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          a mGuideResp = p0.mGuideResp;
          if (mGuideResp != null) {
             HotPushResp mPushType = mGuideResp.mPushType;
             if (mPushType != null && !mPushType.isEmpty()) {
                Iterator iterator = p0.mGuideResp.mPushType.iterator();
                while (true) {
                   b = true;
                   if (!iterator.hasNext()) {
                      return b;
                   }
                   PushGuideType pushGuideTyp = iterator.next();
                   if (pushGuideTyp == null) {
                      break ;
                   }else if(pushGuideTyp.status == b){
                      pushGuideTyp = pushGuideTyp.config;
                      if (pushGuideTyp != null && (pushGuideTyp.dayMax > null && pushGuideTyp.perMax > null)) {
                      label_004f :
                         if (!b) {
                            return false;
                         }
                      }
                   }
                   b = false;
                   goto label_004f ;
                }
                return false;
             }
          }
       }
       return false;
    }
    public final void e(PushConfigRecord p0,a p1){
       PushConfigRecord b;
       PushCofigRdItem pushCofigRdI;
       long l;
       PushGuideType pushGuideTyp;
       PushOpenConfig period;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "4")) {
          return;
       }
       p0 = (p0 == null)? a.a.h(a.h(), PushConfigRecord.class): null;
       if (p0 == null) {
          this.g(new PushConfigRecord());
          return;
       }else {
          b = p0.b;
          if (b != null && b.size() > 0) {
             Iterator iterator = p0.b.iterator();
             while (iterator.hasNext()) {
                pushCofigRdI = iterator.next();
                if (pushCofigRdI != null) {
                   l = pushCofigRdI.b();
                   if (l > 0 && g.a(l) > 0) {
                      p0.d(pushCofigRdI.a(), 0);
                      p0.b(pushCofigRdI.a(), 0);
                   }
                }
             }
             iterator = p0.c.iterator();
             while (iterator.hasNext()) {
                pushCofigRdI = iterator.next();
                if (pushCofigRdI != null) {
                   l = pushCofigRdI.b();
                   if (l > 0) {
                      l = g.a(l);
                      int i = pushCofigRdI.a();
                      if (PatchProxy.isSupport(b.class)) {
                         pushGuideTyp = PatchProxy.applyTwoRefs(Integer.valueOf(i), p1, this, b.class, "6");
                         if (pushGuideTyp != PatchProxyResult.class) {
                         }else if(p1 != null){
                            a mGuideResp = p1.mGuideResp;
                            if (mGuideResp != null) {
                               HotPushResp mPushType = mGuideResp.mPushType;
                               if (mPushType != null && !mPushType.isEmpty()) {
                                  Iterator iterator1 = p1.mGuideResp.mPushType.iterator();
                                  while (true) {
                                     if (iterator1.hasNext()) {
                                        PushGuideType pushGuideTyp1 = iterator1.next();
                                        if (pushGuideTyp1.index == i) {
                                           pushGuideTyp = pushGuideTyp1.config;
                                        }else {
                                           continue ;
                                        }
                                     }
                                  }
                               }
                            }
                         }
                         pushGuideTyp = null;
                      }else {
                         goto label_00a3 ;
                      }
                      i = (pushGuideTyp == null)? -1: pushGuideTyp.period;
                      if (i >= null && l - (long)i > 0) {
                         p0.e(pushCofigRdI.a(), 0);
                         p0.b(pushCofigRdI.a(), 0);
                         p0.c(pushCofigRdI.a(), 0);
                      }
                   }
                }
             }
          }
          this.g(p0);
          return;
       }
    }
    public final PushConfigRecord f(){
       Object[] objArray = null;
       SharedPreferences obj = PatchProxy.apply(objArray, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.a;
       String str = "hot_push_guide_last_show_time";
       long l = 0;
       long longx = obj.getLong(str, l);
       if (longx - l <= 0) {
          return objArray;
       }
       PushConfigRecord pushConfigRe = new PushConfigRecord();
       pushConfigRe.b.add(new PushCofigRdItem(18, longx));
       pushConfigRe.c.add(new PushCofigRdItem(18, obj.getLong("hot_push_guide_first_show_time", l)));
       pushConfigRe.d.add(new PushCofigRdItem(18, (long)obj.getInt("hot_push_guide_show_count_day", 0)));
       pushConfigRe.e.add(new PushCofigRdItem(18, (long)obj.getInt("hot_push_guide_show_count_period", 0)));
       a.w(a.a.q(pushConfigRe));
       SharedPreferences$Editor uEditor = obj.edit();
       uEditor.putLong(str, 0);
       g.a(uEditor);
       SharedPreferences$Editor uEditor1 = obj.edit();
       uEditor1.putLong("hot_push_guide_first_show_time", 0);
       g.a(uEditor1);
       SharedPreferences$Editor uEditor2 = obj.edit();
       uEditor2.putInt("hot_push_guide_show_count_day", 0);
       g.a(uEditor2);
       SharedPreferences$Editor uEditor3 = obj.edit();
       uEditor3.putInt("hot_push_guide_show_count_period", 0);
       g.a(uEditor3);
       return pushConfigRe;
    }
    public final void g(PushConfigRecord p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "5")) {
          return;
       }
       a.w(a.a.q(p0));
       return;
    }
}
