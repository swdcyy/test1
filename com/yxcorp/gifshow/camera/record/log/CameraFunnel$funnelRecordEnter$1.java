package com.yxcorp.gifshow.camera.record.log.CameraFunnel$funnelRecordEnter$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kuaishou.protobuf.photo.funnel.PostFunnelStat$c;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.protobuf.photo.funnel.RecordStat;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.PostFunnelStat;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.RecordStat$b;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$b;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$PageTimestampStat$a;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$PageTimestampStat;
import java.lang.System;
import java.lang.Long;

public final class CameraFunnel$funnelRecordEnter$1 extends Lambda implements l	// class@000e1f
{
    public final int $enterTimes;

    public void CameraFunnel$funnelRecordEnter$1(int p0){
       this.$enterTimes = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(PostFunnelStat$c p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       RecordStat obj = PatchProxy.applyOneRefs(p0, this, CameraFunnel$funnelRecordEnter$1.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "it");
       Objects.requireNonNull(p0);
       Object[] objArray = null;
       obj = PatchProxy.apply(objArray, p0, PostFunnelStat$c.class, "22");
       if (obj != patchProxyRe) {
       }else {
          obj = p0.instance.getRecord();
       }
       RecordStat$b uob = obj.toBuilder();
       a.o(uob, "builder");
       Objects.requireNonNull(uob);
       RecordBaseStat recordBaseSt = PatchProxy.apply(objArray, uob, RecordStat$b.class, "8");
       if (recordBaseSt != patchProxyRe) {
       }else {
          recordBaseSt = uob.instance.getPageBase();
       }
       RecordBaseStat$b uob1 = recordBaseSt.toBuilder();
       RecordBaseStat$PageTimestampStat$a pageTimestam = RecordBaseStat$PageTimestampStat.newBuilder();
       a.o(pageTimestam, "enterTimeBuilder");
       long l = System.currentTimeMillis();
       Objects.requireNonNull(pageTimestam);
       if (PatchProxy.isSupport(RecordBaseStat$PageTimestampStat$a.class) && PatchProxy.applyOneRefs(Long.valueOf(l), pageTimestam, RecordBaseStat$PageTimestampStat$a.class, "2") != patchProxyRe) {
       }else {
          pageTimestam.copyOnWrite();
          pageTimestam.instance.setInit(l);
       }
       a.o(uob1, "pageBuilder");
       RecordBaseStat$PageTimestampStat pageTimestam1 = pageTimestam.build();
       Objects.requireNonNull(uob1);
       if (PatchProxy.applyOneRefs(pageTimestam1, uob1, RecordBaseStat$b.class, "3") != patchProxyRe) {
       }else {
          uob1.copyOnWrite();
          uob1.instance.setPostVCTimestamp(pageTimestam1);
       }
       String str = String.valueOf(this.$enterTimes);
       if (PatchProxy.applyOneRefs(str, uob1, RecordBaseStat$b.class, "93") != patchProxyRe) {
       }else {
          uob1.copyOnWrite();
          uob1.instance.setEnterShootTimes(str);
       }
       uob.a(uob1.build());
       p0.g(uob.build());
       return "funnelCameraEnter";
    }
}
