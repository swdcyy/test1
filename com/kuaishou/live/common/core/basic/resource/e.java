package com.kuaishou.live.common.core.basic.resource.e;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$BatchMoreInfoPackage;
import java.util.Collection;
import ekd.q;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$MoreInfoPackage;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileResponse$LiveResourceFileInfo;
import q2b.h$b;
import k2b.u1;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$LiveResourceFileType;
import java.util.HashMap;
import java.lang.reflect.Type;
import z83.a;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import java.lang.Long;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveResourceFilePackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.System;

public class e	// class@000ee2
{

    public void e(){
       super();
    }
    public static void a(int p0,List p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, null, uoe, "2")) {
          return;
       }
       ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
       uContentWrap.batchMoreInfoPackage = new ClientContentWrapper$BatchMoreInfoPackage();
       if (!q.f(p1)) {
          ClientContentWrapper$MoreInfoPackage[] moreInfoPack = new ClientContentWrapper$MoreInfoPackage[p1.size()];
          uContentWrap.batchMoreInfoPackage.moreInfoPackage = moreInfoPack;
          for (int i = 0; i < p1.size(); i = i + 1) {
             ClientContentWrapper$MoreInfoPackage moreInfoPack1 = new ClientContentWrapper$MoreInfoPackage();
             LiveResourceFileResponse$LiveResourceFileInfo liveResource = p1.get(i);
             moreInfoPack1.vlaue = liveResource.mVersion;
             moreInfoPack1.type = liveResource.mType;
             uContentWrap.batchMoreInfoPackage.moreInfoPackage[i] = moreInfoPack1;
          }
       }
       h$b uob = h$b.e(p0, "LIVE_RESOURCE_CONTROLSFILE_REQUEST");
       uob.i(uContentWrap);
       u1.r0(uob);
       return;
    }
    public static void b(){
       if (PatchProxy.applyVoid(null, null, e.class, "5")) {
          return;
       }
       ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
       ClientContentWrapper$BatchMoreInfoPackage uBatchMoreIn = new ClientContentWrapper$BatchMoreInfoPackage();
       uContentWrap.batchMoreInfoPackage = uBatchMoreIn;
       ClientContentWrapper$MoreInfoPackage[] moreInfoPack = new ClientContentWrapper$MoreInfoPackage[LiveResourceFileUtil$LiveResourceFileType.values().length];
       uBatchMoreIn.moreInfoPackage = moreInfoPack;
       HashMap hashMap = a.b(HashMap.class);
       if (hashMap == null) {
          return;
       }
       for (int i = 0; i < LiveResourceFileUtil$LiveResourceFileType.values().length; i = i + 1) {
          object oobject = LiveResourceFileUtil$LiveResourceFileType.values()[i];
          ClientContentWrapper$MoreInfoPackage moreInfoPack1 = new ClientContentWrapper$MoreInfoPackage();
          moreInfoPack1.type = oobject.mType;
          String str = (LiveResourceFileUtil.n(oobject))? "1": "0";
          moreInfoPack1.status = str;
          moreInfoPack1.vlaue = TextUtils.k(hashMap.get(oobject.mType));
          uContentWrap.batchMoreInfoPackage.moreInfoPackage[i] = moreInfoPack1;
       }
       h$b uob = h$b.e(10, "LIVE_RESOURCE_LOCAl_EXIST");
       uob.i(uContentWrap);
       u1.r0(uob);
       return;
    }
    public static void c(LiveResourceFileResponse$LiveResourceFileInfo p0,boolean p1,long p2,String p3,long p4,String p5){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),Long.valueOf(p2),p3,Long.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, null, uoe, "1")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       i3 oi3 = i3.f();
       oi3.c("file_size", Long.valueOf(p4));
       oi3.d("fail_reason", p5);
       uElementPack.params = oi3.toString();
       ClientContent$LiveResourceFilePackage liveResource = new ClientContent$LiveResourceFilePackage();
       liveResource.isZipFile = p0.mIsZipFile;
       liveResource.type = TextUtils.E(p0.mType);
       liveResource.version = TextUtils.E(p0.mVersion);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveResourceFilePackage = liveResource;
       ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
       ClientContentWrapper$MoreInfoPackage moreInfoPack = new ClientContentWrapper$MoreInfoPackage();
       moreInfoPack.vlaue = String.valueOf((System.currentTimeMillis() - p2));
       moreInfoPack.tag = p3;
       uContentWrap.moreInfoPackage = moreInfoPack;
       int i = (p1)? 10: 8;
       h$b uob = h$b.e(i, "LIVE_RESOURCE_DOWNLOAD");
       uob.h(uContentPack);
       uob.i(uContentWrap);
       uob.k(uElementPack);
       u1.r0(uob);
       return;
    }
}
