package com.yxcorp.gifshow.log.EditFunnel$funnelSubtitleResult$$inlined$let$lambda$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.util.List;
import java.lang.Object;
import com.kuaishou.protobuf.photo.funnel.PostFunnelStat$c;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$b;
import java.util.Objects;
import java.util.Collection;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$Result$a;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$Result;
import com.yxcorp.gifshow.v3.model.SubtitleRecognizedInfo;
import java.lang.Integer;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$RecInfo$a;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$RecInfo;
import com.yxcorp.gifshow.v3.model.SubtitleRecognizedInfo$SubtitleInfo;
import java.lang.Float;

public final class EditFunnel$funnelSubtitleResult$$inlined$let$lambda$1 extends Lambda implements l	// class@001ae8
{
    public final List $list$inlined;

    public void EditFunnel$funnelSubtitleResult$$inlined$let$lambda$1(List p0){
       this.$list$inlined = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(PostFunnelStat$c p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       SubtitleStat$b obj = PatchProxy.applyOneRefsWithListener(p0, this, EditFunnel$funnelSubtitleResult$$inlined$let$lambda$1.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "it");
       obj = p0.getSubtitle().toBuilder();
       Objects.requireNonNull(obj);
       if (PatchProxy.apply(null, obj, SubtitleStat$b.class, "37") != patchProxyRe) {
       }else {
          obj.copyOnWrite();
          obj.instance.clearResults();
       }
       int i = this.$list$inlined.size();
       int i1 = 0;
       while (i1 < i) {
          SubtitleStat$Result$a result$a = SubtitleStat$Result.newBuilder();
          a.o(result$a, "resultBuilder");
          String fileKey = this.$list$inlined.get(i1).getFileKey();
          Objects.requireNonNull(result$a);
          if (PatchProxy.applyOneRefs(fileKey, result$a, SubtitleStat$Result$a.class, "15") != patchProxyRe) {
          }else {
             result$a.copyOnWrite();
             result$a.instance.setFileKey(fileKey);
          }
          int resultType = this.$list$inlined.get(i1).getResultType();
          if (PatchProxy.isSupport(SubtitleStat$Result$a.class) && PatchProxy.applyOneRefs(Integer.valueOf(resultType), result$a, SubtitleStat$Result$a.class, "19") != patchProxyRe) {
          }else {
             result$a.copyOnWrite();
             result$a.instance.setStatus(resultType);
          }
          resultType = this.$list$inlined.get(i1).getSubtitles().size();
          int i2 = 0;
          while (i2 < resultType) {
             SubtitleStat$RecInfo$a recInfo$a = SubtitleStat$RecInfo.newBuilder();
             a.o(recInfo$a, "infoBuilder");
             float startTime = this.$list$inlined.get(i1).getSubtitles().get(i2).getStartTime();
             Objects.requireNonNull(recInfo$a);
             if (PatchProxy.isSupport(SubtitleStat$RecInfo$a.class) && PatchProxy.applyOneRefs(Float.valueOf(startTime), recInfo$a, SubtitleStat$RecInfo$a.class, "7") != patchProxyRe) {
             }else {
                recInfo$a.copyOnWrite();
                recInfo$a.instance.setStart(startTime);
             }
             startTime = this.$list$inlined.get(i1).getSubtitles().get(i2).getEndTime();
             if (PatchProxy.isSupport(SubtitleStat$RecInfo$a.class) && PatchProxy.applyOneRefs(Float.valueOf(startTime), recInfo$a, SubtitleStat$RecInfo$a.class, "10") != patchProxyRe) {
             }else {
                recInfo$a.copyOnWrite();
                recInfo$a.instance.setEnd(startTime);
             }
             String text = this.$list$inlined.get(i1).getSubtitles().get(i2).getText();
             if (PatchProxy.applyOneRefs(text, recInfo$a, SubtitleStat$RecInfo$a.class, "3") != patchProxyRe) {
             }else {
                recInfo$a.copyOnWrite();
                recInfo$a.instance.setText(text);
             }
             SubtitleStat$RecInfo recInfo = recInfo$a.build();
             if (PatchProxy.applyOneRefs(recInfo, result$a, SubtitleStat$Result$a.class, "6") != patchProxyRe) {
             }else {
                result$a.copyOnWrite();
                result$a.instance.addInfo(recInfo);
             }
             i2 = i2 + 1;
          }
          SubtitleStat$Result result = result$a.build();
          if (PatchProxy.applyOneRefs(result, obj, SubtitleStat$b.class, "32") != patchProxyRe) {
          }else {
             obj.copyOnWrite();
             obj.instance.addResults(result);
          }
          i1 = i1 + 1;
       }
       p0.h(obj.build());
       PatchProxy.onMethodExit(EditFunnel$funnelSubtitleResult$$inlined$let$lambda$1.class, "1");
       return "funnelSubtitleResult";
    }
}
