package com.yxcorp.gifshow.reminder.friend.heartbeat.b;
import z1.k;
import java.lang.Object;
import wkd.b;
import zcc.k;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.reminder.friend.heartbeat.FriendTabNotify$Common;
import zcc.l;
import com.yxcorp.gifshow.reminder.friend.heartbeat.RedDotRepository;
import lec.t;
import java.lang.Integer;
import java.util.Map;
import j9c.b;
import com.yxcorp.gifshow.reminder.friend.data.FriendTabShowInfo;
import java.lang.Long;
import java.util.Collection;
import ekd.q;
import com.google.gson.Gson;
import java.util.List;

public final class b implements k	// class@001a9d
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final Object get(){
       FriendTabNotify$Common c;
       k ok = b.a(0x78443100);
       Objects.requireNonNull(ok);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       k ok1 = k.class;
       String str = PatchProxy.apply(null, ok, ok1, "2");
       if (str != patchProxyRe) {
       }else {
          FriendTabNotify$Common uCommon = PatchProxy.apply(null, ok, ok1, "3");
          if (uCommon != patchProxyRe) {
          }else if(l.a()){
             uCommon = RedDotRepository.c(3);
          }else {
             uCommon = PatchProxy.apply(null, null, t.class, "6");
             c = -7;
             if (uCommon == patchProxyRe) {
                uCommon = t.a.get(Integer.valueOf(c));
             }
             if (uCommon == null) {
                uCommon = b.c(c, FriendTabNotify$Common.class);
             }
          }
          if (uCommon == null) {
             str = "";
          }else {
             FriendTabShowInfo uFriendTabSh = new FriendTabShowInfo();
             c = uCommon.c;
             if (c - null > 0) {
                uFriendTabSh.mIconClearTime = Long.valueOf(c);
             }
             if (!q.f(uCommon.d)) {
                uFriendTabSh.mRedDotClearFeeds = uCommon.d;
             }
             str = new Gson().q(uFriendTabSh);
             uCommon.d.clear();
          }
       }
       return str;
    }
}
