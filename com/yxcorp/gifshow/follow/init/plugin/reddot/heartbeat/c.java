package com.yxcorp.gifshow.follow.init.plugin.reddot.heartbeat.c;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.yxcorp.gifshow.follow.init.plugin.reddot.heartbeat.b;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.follow.init.plugin.reddot.heartbeat.FollowFeedsHeartbeatPojo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import sha.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.System;
import oe6.e;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil;
import xf6.l;
import com.yxcorp.gifshow.follow.init.plugin.reddot.heartbeat.FollowFeedsHeartbeatPojo$FollowTabNotifyWrapper;
import wkd.b;
import com.kwai.framework.network.sntp.a;
import java.lang.Long;
import com.yxcorp.gifshow.util.rx.RxBus;
import lha.b;
import com.yxcorp.gifshow.model.FollowTabNotify;

public class c extends ConfigAutoParseJsonConsumer	// class@0010f7
{
    public long e;
    public static c f;

    static {
       c.f = new c();
    }
    public void c(){
       super(b.b);
       this.e = 0;
    }
    public void b(Object p0){
       boolean b;
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "3")) {
       }else if(p0.mMyFollowTabNotify != null){
          Object[] objArray = null;
          Object obj = PatchProxy.apply(objArray, objArray, a.class, "1");
          long l = 0;
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if((System.currentTimeMillis() - e.a.getLong(b.d("user")+"lastMyFollowRequestTime", l)) - FollowConfigUtil.p() > 0){
             b = true;
          }else {
             b = false;
          }
          if (b || (l.c("ENABLE_FOLLOW_RED_POINT_IGNORE_TIME_INTERVAL", false) && p0.mMyFollowTabNotify.valid())) {
             if (!PatchProxy.applyVoid(objArray, this, uoc, "4")) {
                int i = 0x3b1f7b44;
                if (b.a(i).a() != null) {
                   l = b.a(i).a().longValue();
                }
                this.e = l;
             }
             p0 = p0.mMyFollowTabNotify;
             RxBus.f.b(new b(p0.mCommonFollowTabNotify, p0.mInTabFollowTabNotify));
          }
       }
       return;
    }
}
