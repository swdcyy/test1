package com.yxcorp.gifshow.log.y;
import java.lang.Runnable;
import com.yxcorp.gifshow.log.c0;
import com.kuaishou.log.realshow.nano.RealShowLogs$RealShowFeed;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import com.kwai.component.uiconfig.browsestyle.model.BrowseStyle;
import uh5.e;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import com.yxcorp.utility.TextUtils;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import f3b.h;
import p56.b;
import com.kwai.framework.app.huaweisuperapp.HuaweiSuperAppPrelaunchStage;
import com.yxcorp.gifshow.log.g;
import ok.o;
import com.yxcorp.gifshow.log.g$b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTransList;
import com.google.gson.JsonObject;
import rkd.b;
import java.lang.Integer;
import java.lang.Number;
import com.google.gson.JsonElement;
import k2b.u1;
import lnc.o5;
import com.google.common.base.Optional;
import com.yxcorp.gifshow.log.realtime.RealShowDao;
import com.yxcorp.gifshow.log.realtime.RealShow;
import java.lang.Long;
import com.google.protobuf.nano.MessageNano;
import com.yxcorp.gifshow.log.policy.LogPolicy$Save;
import com.yxcorp.gifshow.log.policy.LogPolicy;
import java.lang.Boolean;
import org.greenrobot.greendao.AbstractDao;
import k2b.x2;
import msd.a;
import com.kwai.framework.kgi.sdk.Kgi;
import java.lang.Throwable;
import android.util.Log;
import java.lang.Exception;

public final class y implements Runnable	// class@001b62
{
    public final c0 b;
    public final RealShowLogs$RealShowFeed c;
    public final String d;
    public final String e;

    public void y(c0 p0,RealShowLogs$RealShowFeed p1,String p2,String p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       boolean b;
       y tb = this.b;
       y tc = this.c;
       y td = this.d;
       y te = this.e;
       try{
          Objects.requireNonNull(tb);
          tc.browseType = e.d().getRealShowType();
          tc.grantBrowseType = TextUtils.k(VisitorModeManager.e());
          tc.topPage = td;
          int i = 0x4b316083;
          tc.sessionId = TextUtils.k(b.a(i).getSessionId());
          b = false;
          boolean b1 = (!h.b(true))? true: false;
          tc.isBackground = b1;
          if (b.d) {
             tc.isAppPrelaunch = b.b();
             b1 = (b.c() != HuaweiSuperAppPrelaunchStage.USER_LAUNCH)? true: false;
             tc.isAppPrelaunching = b1;
          }
          ClientEvent$ExpTagTransList uExpTagTrans = b.a(0xe0ff4fb).b(null).b();
          if (uExpTagTrans != null) {
             tc.expTagList = uExpTagTrans;
          }
          JsonObject jsonObject = tb.o(tc.expParams);
          if (b.f()) {
             String str = "is_pad";
             int i1 = (b.f())? 1: 0;
             jsonObject.a0(str, Integer.valueOf(i1));
             str = "is_horizontal";
             i1 = (b.e())? 1: 0;
             jsonObject.a0(str, Integer.valueOf(i1));
          }
          tc.expParams = TextUtils.k(jsonObject.toString());
          b.a(i).F(13);
          if (u1.d()) {
             tb.r(o5.c(te), tc);
          }else if(tb.h.isPresent()){
             RealShowDao realShowDao = tb.h.get();
             Long longx = Long.valueOf(o5.c(te));
             byte[] uobyteArray = MessageNano.toByteArray(tc);
             if (tb.j.getSavePolicy() == LogPolicy$Save.DELAY) {
                b = true;
             }
             realShowDao.insert(new RealShow(null, longx, uobyteArray, Boolean.valueOf(b)));
          }
          Kgi.c(new x2(tc));
          tb.l = tb.l + true;
       }catch(java.lang.Exception e0){
          u1.Q("realShowLogSaveError", Log.getStackTraceString(e0));
          e0.printStackTrace();
       }
       return;
    }
}
