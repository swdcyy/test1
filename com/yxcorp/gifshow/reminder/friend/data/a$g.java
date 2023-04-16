package com.yxcorp.gifshow.reminder.friend.data.a$g;
import erd.o;
import com.yxcorp.gifshow.reminder.friend.data.a;
import java.lang.Object;
import android.util.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import zcc.l;
import com.yxcorp.gifshow.reminder.friend.heartbeat.FriendTabNotify$Common;
import com.yxcorp.gifshow.reminder.friend.heartbeat.RedDotRepository;
import j9c.b;
import com.google.gson.JsonObject;
import com.yxcorp.gifshow.reminder.friend.heartbeat.FriendTabNotify$RedDotUser;
import java.lang.Integer;
import java.lang.Number;
import com.google.gson.Gson;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import brd.t;

public final class a$g implements o	// class@001a88
{
    public final a b;

    public void a$g(a p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, a$g.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "pair");
          Pair first = p0.first;
          p0 = p0.second;
          int i = 1;
          FriendTabNotify$Common uCommon = (l.a())? RedDotRepository.c(i): b.c(-7, FriendTabNotify$Common.class);
          FriendTabNotify$RedDotUser redDotUser = null;
          JsonObject jsonObject = new JsonObject();
          if (uCommon != null) {
             uCommon = uCommon.mRedDotUser;
             if (uCommon != null) {
                jsonObject.c0("feedId", uCommon.mFeedId);
                jsonObject.a0("feedType", Integer.valueOf(uCommon.mFeedType));
                jsonObject.c0("reason", uCommon.mTopFeedReason);
                JsonObject[] jsonObjectAr = new JsonObject[i];
                jsonObjectAr[0] = jsonObject;
                redDotUser = new Gson().q(Lists.e(jsonObjectAr));
             }
          }
          ot = this.b.i2(0, first, p0, redDotUser);
       }
       return ot;
    }
}
