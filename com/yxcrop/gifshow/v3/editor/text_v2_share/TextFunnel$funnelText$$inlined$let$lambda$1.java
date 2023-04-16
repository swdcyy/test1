package com.yxcrop.gifshow.v3.editor.text_v2_share.TextFunnel$funnelText$$inlined$let$lambda$1;
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
import java.util.Objects;
import com.kuaishou.protobuf.photo.funnel.TextStat;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.PostFunnelStat;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.TextStat$b;
import java.util.Collection;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextBaseElement;
import com.kuaishou.protobuf.photo.funnel.TextStat$TextItem$a;
import com.kuaishou.protobuf.photo.funnel.TextStat$TextItem;
import com.smile.gifmaker.mvps.utils.DefaultSyncable;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextBaseElementData;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Float;

public final class TextFunnel$funnelText$$inlined$let$lambda$1 extends Lambda implements l	// class@000b6e
{
    public final List $elementList$inlined;

    public void TextFunnel$funnelText$$inlined$let$lambda$1(List p0){
       this.$elementList$inlined = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(PostFunnelStat$c p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       TextStat obj = PatchProxy.applyOneRefsWithListener(p0, this, TextFunnel$funnelText$$inlined$let$lambda$1.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "it");
       Objects.requireNonNull(p0);
       obj = PatchProxy.apply(null, p0, PostFunnelStat$c.class, "55");
       if (obj != patchProxyRe) {
       }else {
          obj = p0.instance.getText();
       }
       TextStat$b uob = obj.toBuilder();
       if (this.$elementList$inlined.isEmpty() ^ 0x01) {
          int i = 0;
          if (!this.$elementList$inlined.get(i).isSubtitle()) {
             int i1 = this.$elementList$inlined.size();
             while (i < i1) {
                TextStat$TextItem$a textItem$a = TextStat$TextItem.newBuilder();
                a.o(textItem$a, "textBuilder");
                String bizId = this.$elementList$inlined.get(i).getBizId();
                Objects.requireNonNull(textItem$a);
                if (PatchProxy.applyOneRefs(bizId, textItem$a, TextStat$TextItem$a.class, "3") != patchProxyRe) {
                }else {
                   textItem$a.copyOnWrite();
                   textItem$a.instance.setId(bizId);
                }
                bizId = this.$elementList$inlined.get(i).getTextBaseElementData().F0();
                if (PatchProxy.applyOneRefs(bizId, textItem$a, TextStat$TextItem$a.class, "8") != patchProxyRe) {
                }else {
                   textItem$a.copyOnWrite();
                   textItem$a.instance.setText(bizId);
                }
                float f = (float)this.$elementList$inlined.get(i).getStartTime();
                if (PatchProxy.isSupport(TextStat$TextItem$a.class) && PatchProxy.applyOneRefs(Float.valueOf(f), textItem$a, TextStat$TextItem$a.class, "20") != patchProxyRe) {
                }else {
                   textItem$a.copyOnWrite();
                   textItem$a.instance.setStartTime(f);
                }
                f = (float)this.$elementList$inlined.get(i).getDuration();
                if (PatchProxy.isSupport(TextStat$TextItem$a.class) && PatchProxy.applyOneRefs(Float.valueOf(f), textItem$a, TextStat$TextItem$a.class, "23") != patchProxyRe) {
                }else {
                   textItem$a.copyOnWrite();
                   textItem$a.instance.setDuration(f);
                }
                TextStat$TextItem textItem = textItem$a.build();
                Objects.requireNonNull(uob);
                if (PatchProxy.applyOneRefs(textItem, uob, TextStat$b.class, "6") != patchProxyRe) {
                }else {
                   uob.copyOnWrite();
                   uob.instance.addItem(textItem);
                }
                i = i + 1;
             }
          }
       }
       p0.k(uob.build());
       PatchProxy.onMethodExit(TextFunnel$funnelText$$inlined$let$lambda$1.class, "1");
       return "funnelText";
    }
}
