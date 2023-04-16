package com.kuaishou.live.bridge.commands.migrated.LiveJsCmdFollowUser;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import com.kuaishou.live.bridge.commands.migrated.LiveJsCmdFollowUser$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.bridge.commands.migrated.LiveJsCmdFollowUser$onExecute$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import asd.h;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import lp3.e;
import xp5.g;
import lp3.c;
import kotlin.jvm.internal.a;
import android.app.Activity;
import o63.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import y41.i$a;
import java.util.Objects;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.User;
import xp5.i;
import java.lang.Integer;
import k71.i;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import y41.i;
import dsd.e;
import o63.m;
import java.lang.StringBuilder;
import o63.m$a;

public final class LiveJsCmdFollowUser extends AbstractLiveJsCommand	// class@000e0c
{

    public void LiveJsCmdFollowUser(){
       super();
    }
    public Class a(){
       return LiveJsCmdFollowUser$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       i$a uoa;
       LiveJsCmdFollowUser liveJsCmdFol = LiveJsCmdFollowUser.class;
       LiveJsCmdFollowUser$onExecute$1 obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveJsCmdFollowUser.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p2 instanceof LiveJsCmdFollowUser$onExecute$1) {
          obj = p2;
          LiveJsCmdFollowUser$onExecute$1 label = obj.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             obj.label = label - i;
          label_002b :
             LiveJsCmdFollowUser$onExecute$1 result = obj.result;
             Object obj1 = b.h();
             LiveJsCmdFollowUser$onExecute$1 label1 = obj.label;
             int i1 = 1;
             if (label1 != null) {
                if (label1 == i1) {
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                b.Z(LiveLogTag.LIVE_FOLLOW, "LiveJsCmdFollowUser onExecute");
                if (p0 instanceof LiveJsCmdFollowUser$a) {
                   obj.L$0 = this;
                   obj.L$1 = p0;
                   obj.L$2 = p1;
                   obj.label = i1;
                   h oh = new h(IntrinsicsKt__IntrinsicsJvmKt.d(obj));
                   if (!PatchProxy.applyVoidTwoRefs(p0, oh, this, liveJsCmdFol, "2")) {
                      result = this.h().a(g.class);
                      a.o(result, "serviceManager.getServic¡­eInfoManager::class.java\)");
                      if (b.a(this.h()) instanceof GifshowActivity) {
                         Activity uActivity = b.a(this.h());
                         Objects.requireNonNull(uActivity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
                         uoa = new i$a(uActivity, result.getLiveStreamId());
                      }else {
                         uoa = new i$a(result.getLiveStreamId());
                      }
                      uoa.o(UserInfo.convertToQUser(p0.b()));
                      uoa.r(false);
                      result = this.h().a(i.class);
                      a.o(result, "serviceManager.getServic¡­kageProvider::class.java\)");
                      uoa.m(result.ul());
                      uoa.b(p0.bizCustomParams);
                      if (p0.a() != null) {
                         Integer integer = p0.a();
                         a.m(integer);
                         uoa.n(integer.intValue());
                         integer = p0.a();
                         if (integer != null && integer.intValue() == 197) {
                            uoa.k(291);
                         }
                      }
                      uoa.e(new i(this, p0, oh));
                      uoa.a().c();
                   }
                   result = oh.b();
                   if (result == b.h()) {
                      e.c(obj);
                   }
                   if (result == obj1) {
                      return obj1;
                   }
                }else {
                   result = m.g.c(liveJsCmdFol.getName()+" need params is "+LiveJsCmdFollowUser$a.class.getName());
                label_0151 :
                   return result;
                }
             }
             goto label_0151 ;
          }
       }
       obj = new LiveJsCmdFollowUser$onExecute$1(this, p2);
       goto label_002b ;
    }
}
