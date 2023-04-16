package com.kuaishou.live.common.core.component.hotspot.detail.normalmediaarea.LiveHotSpotDetailNormalMediaAreaViewModel$logClickEvent$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import ln1.b;
import java.lang.Object;
import lnc.i3;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class LiveHotSpotDetailNormalMediaAreaViewModel$logClickEvent$1 extends Lambda implements l	// class@0013df
{
    public final b $itemData;
    public final String $type;

    public void LiveHotSpotDetailNormalMediaAreaViewModel$logClickEvent$1(String p0,b p1){
       this.$type = p0;
       this.$itemData = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(i3 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHotSpotDetailNormalMediaAreaViewModel$logClickEvent$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.d("content_type", this.$type);
       p0.d("related_author_id", this.$itemData.getAuthorId());
       p0.d("related_content_id", this.$itemData.getRelatedId());
       p0.d("server_exp_tag", this.$itemData.getServerExpTag());
       return;
    }
}
