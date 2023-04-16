package com.kuaishou.live.common.core.component.bottombubble.notices.gzone.f$a;
import bq5.d;
import lp3.e;
import java.lang.Object;
import j47.a;
import java.lang.Class;
import lp3.c;
import j47.d;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.utility.SystemUtil;
import java.lang.CharSequence;
import e17.i;
import va1.b0;
import com.kwai.live.gzone.common.LiveGzoneConfigResponse;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import java.util.List;
import java.lang.StringBuilder;
import bq5.c;

public class f$a implements d	// class@000fc7
{
    public a a;
    public d b;
    public LiveGenericCommentNoticeInfo c;

    public void f$a(e p0){
       super();
       if (p0 != null) {
          this.a = p0.a(a.class);
          this.b = p0.a(d.class);
       }
       return;
    }
    public boolean a(){
       f$a obj = PatchProxy.apply(null, this, f$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a;
       if (obj != null && obj.uk()) {
          if (SystemUtil.I()) {
             i.d(R.style.arg_RES_7f110668, "锁屏不展示强提醒");
          }
          return false;
       }else {
          boolean b = true;
          if (b0.a()) {
             obj = this.b;
             if (obj != null) {
                LiveGzoneConfigResponse liveGzoneCon = obj.Ue();
                if (liveGzoneCon != null) {
                   f$a tc = this.c;
                   if (tc != null) {
                      liveGzoneCon = liveGzoneCon.mLandscapeCommentNoticeBizTypes;
                      if (liveGzoneCon != null && liveGzoneCon.contains(String.valueOf(tc.mBizType))) {
                         return b;
                      }
                   }
                }
                if (SystemUtil.I() && this.c != null) {
                   i.d(R.style.arg_RES_7f110668, this.c.mBizType+"不在横屏展示强提醒白名单");
                }
                return false;
             }
          }
          return b;
       }
    }
    public void b(){
       c.b(this);
    }
    public void onDismiss(){
       c.a(this);
    }
    public void onShow(){
       c.c(this);
    }
}
