package com.yxcorp.gifshow.reminder.friend.heartbeat.d;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.yxcorp.gifshow.reminder.friend.heartbeat.c;
import ok.x;
import java.lang.Object;
import jdc.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.reminder.friend.heartbeat.FriendTabNotify;
import zcc.l;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.reminder.friend.heartbeat.FriendTabNotify$Common;
import com.yxcorp.gifshow.reminder.friend.heartbeat.RedDotRepository;
import lec.q;

public class d extends ConfigAutoParseJsonConsumer	// class@001a9f
{

    public void d(){
       super(c.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "3")) {
       }else {
          a mTabNotify = p0.mTabNotify;
          if (mTabNotify == null || mTabNotify.mCommon == null) {
             if (!l.e()) {
                FriendTabNotify uFriendTabNo = PatchProxy.apply(null, null, FriendTabNotify.class, "1");
                if (uFriendTabNo != PatchProxyResult.class) {
                }else {
                   uFriendTabNo = new FriendTabNotify();
                   uFriendTabNo.mCommon = new FriendTabNotify$Common();
                }
                p0.mTabNotify = uFriendTabNo;
             }
          }
          mTabNotify = p0.mTabNotify;
          FriendTabNotify mCommon = mTabNotify.mCommon;
          if (mCommon != null) {
             mCommon.a = mTabNotify.mNotifyId;
             if (l.a()) {
                RedDotRepository.b(p0.mTabNotify.mCommon);
             }else {
                q.a(p0.mTabNotify.mCommon);
             }
          }
       }
       return;
    }
}
