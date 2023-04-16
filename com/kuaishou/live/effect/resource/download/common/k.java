package com.kuaishou.live.effect.resource.download.common.k;
import erd.g;
import com.kuaishou.live.effect.resource.download.common.LiveMagicGiftDownloadController;
import wz2.a;
import java.lang.Object;
import com.kuaishou.live.effect.resource.download.magicgift.LocalRendingMagicGiftResponse;
import java.util.Objects;
import java.lang.String;
import xz2.a;
import vz2.c0;
import java.lang.Integer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import xz2.a$a;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collection;
import java.util.Iterator;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFaceType;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.util.Map;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.effect.resource.download.track.LiveEffectResCleanManager;
import kotlin.jvm.internal.a;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import b03.e;
import uz2.b;
import uz2.b$a;
import b03.b;
import b03.d;
import nsd.u;
import java.lang.System;
import java.util.Set;
import java.util.Map$Entry;
import java.util.concurrent.TimeUnit;
import b03.c;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import vz2.n;
import java.lang.Runnable;
import t45.c;

public final class k implements g	// class@001b41
{
    public final LiveMagicGiftDownloadController b;
    public final int c;
    public final boolean d;
    public final a e;
    public final boolean f;

    public void k(LiveMagicGiftDownloadController p0,int p1,boolean p2,a p3,boolean p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void accept(Object p0){
       MagicEmoji$MagicFace magicFace;
       k ok = this;
       k b = ok.b;
       k c = ok.c;
       k d = ok.d;
       k e = ok.e;
       k f = ok.f;
       LocalRendingMagicGiftResponse localRending = p0;
       Objects.requireNonNull(b);
       if (!localRending) {
          a.f("FAIL", c);
       }else {
          c0.f(localRending.getExpId());
          String str = "SUCCESS";
          Integer integer = Integer.valueOf(localRending.getPreDownloadNum());
          if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(str, Integer.valueOf(c), integer, null, a.class, "8")) {
             a.a.d(str, c, integer);
          }
          ArrayList uArrayList = PatchProxy.applyOneRefs(localRending, b, LiveMagicGiftDownloadController.class, "9");
          if (uArrayList != PatchProxyResult.class) {
          }else {
             uArrayList = new ArrayList();
             List preDownload = localRending.getPreDownload();
             List magicFaces1 = localRending.getMagicFaces();
             if (preDownload != null && magicFaces1 != null) {
                HashSet hashSet = new HashSet(preDownload);
                Iterator iterator2 = magicFaces1.iterator();
                while (iterator2.hasNext()) {
                   MagicEmoji$MagicFace magicFace2 = iterator2.next();
                   magicFace2.mMagicFaceType = MagicEmoji$MagicFaceType.Gift;
                   if (hashSet.contains(magicFace2.mId)) {
                      uArrayList.add(magicFace2);
                   }
                }
             }
          }
          c0.g(localRending.getMagicFaces());
          if (d != null) {
             uArrayList = b.s(uArrayList);
          }
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             magicFace = iterator.next();
             b.g.put(magicFace.mId, magicFace);
          }
          b.m = b.m + uArrayList.size();
          b.P(b.a, "[asyncDownloadMagicGift]: request succeed, magicGifts size is "+uArrayList.size());
          if (uArrayList.isEmpty()) {
             b.n();
             b.h();
          }else {
             int i = e.d();
             LiveEffectResCleanManager liveEffectRe = LiveEffectResCleanManager.class;
             if (!PatchProxy.isSupport(liveEffectRe) || !PatchProxy.applyVoidTwoRefs(uArrayList, Integer.valueOf(i), null, liveEffectRe, "3")) {
                a.p(uArrayList, "preLoadList");
                b.d0(LiveLogTag.LIVE_EFFECT_RESOURCE_CLEAN, "onFetchMagicList", "preLoadList.size", Integer.valueOf(uArrayList.size()), "from", Integer.valueOf(i));
                Objects.requireNonNull(e.a);
                String str1 = 4;
                b uob = (i != 1 && (i != 2 && (i != 3 && i != str1)))? 1: 2;
                Iterator iterator1 = uArrayList.iterator();
                while (iterator1.hasNext()) {
                   MagicEmoji$MagicFace magicFace1 = iterator1.next();
                   b uob1 = (b.a.e(magicFace1))? 4: uob;
                   d uod = LiveEffectResCleanManager.a.a().get(magicFace1.mId);
                   if (uod == null) {
                      SimpleMagicFace mId = magicFace1.mId;
                      str1 = "magicFace.mId";
                      a.o(mId, str1);
                      SimpleMagicFace simpleMagicF = mId;
                      uod = integer;
                      d uod1 = integer;
                      SimpleMagicFace simpleMagicF1 = simpleMagicF;
                      uod = new d(simpleMagicF1, uob1, 0, 4, null);
                      SimpleMagicFace mId1 = magicFace1.mId;
                      a.o(mId1, str1);
                      LiveEffectResCleanManager.a.a().put(mId1, uod1);
                   }else {
                      uod.d(uob1);
                   }
                   str1 = 4;
                }
                LiveEffectResCleanManager.a.b = System.currentTimeMillis();
                iterator = LiveEffectResCleanManager.a.a().entrySet().iterator();
                while (iterator.hasNext()) {
                   Map$Entry uEntry = iterator.next();
                   if (uEntry.getValue().a() == 2) {
                      long l1 = System.currentTimeMillis() - uEntry.getValue().b();
                      if (l1 - TimeUnit.DAYS.toMillis(LiveEffectResCleanManager.b.g) >= 0) {
                         uEntry.getValue().c(1);
                      }
                   }
                }
                LiveEffectResCleanManager.e.i();
             }
             b.r(uArrayList, e);
          }
          long l = a.t().u("SOURCE_LIVE").b("liveEffectResStateOpt", 0);
          if (!l - 1 || (!l - 2 && f != null)) {
             List magicFaces = localRending.getMagicFaces();
             if (!PatchProxy.applyVoidOneRefs(magicFaces, b, LiveMagicGiftDownloadController.class, "30")) {
                c.a(new n(b, magicFaces));
             }
          }
       }
    label_0223 :
       return;
    }
}
