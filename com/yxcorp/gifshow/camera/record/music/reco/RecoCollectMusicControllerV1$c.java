package com.yxcorp.gifshow.camera.record.music.reco.RecoCollectMusicControllerV1$c;
import com.yxcorp.gifshow.bubble.PostBubbleManager$c;
import com.yxcorp.gifshow.camera.record.music.reco.RecoCollectMusicControllerV1;
import java.lang.Object;
import com.yxcorp.gifshow.bubble.a;
import com.kwai.library.widget.popup.common.c;
import ra9.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Set;
import com.yxcorp.gifshow.camera.record.music.reco.BaseRecoCollectMusicController;
import ra9.c;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.Objects;
import com.google.gson.JsonObject;
import java.lang.Integer;
import java.lang.Number;
import com.google.gson.JsonElement;
import com.yxcorp.gifshow.util.PostUtils;

public final class RecoCollectMusicControllerV1$c implements PostBubbleManager$c	// class@000e97
{
    public final RecoCollectMusicControllerV1 a;

    public void RecoCollectMusicControllerV1$c(RecoCollectMusicControllerV1 p0){
       this.a = p0;
       super();
    }
    public void a(a p0,c p1,int p2){
       i.a(this, p0, p1, p2);
    }
    public void b(a p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RecoCollectMusicControllerV1$c.class, "1")) {
          return;
       }
       a.p(p0, "bubble");
       if (CollectionsKt___CollectionsKt.H1(this.a.i2(), p0.d())) {
          Object[] objArray = new Object[0];
          a.D().w("RecoCollectMusicController", "other bubble show "+p0.d()+" , removeBubbleView", objArray);
          RecoCollectMusicControllerV1$c ta = this.a;
          if (ta.y != null) {
             ta.u2();
             ta = this.a;
             c uoc = p0.d();
             a.o(uoc, "bubble.bubbleItem");
             Objects.requireNonNull(ta);
             if (!PatchProxy.applyVoidOneRefs(uoc, ta, RecoCollectMusicControllerV1.class, "7")) {
                JsonObject jsonObject = new JsonObject();
                jsonObject.c0("bubbleName", uoc.name());
                jsonObject.a0("style", Integer.valueOf(ta.k2()));
                PostUtils.x("POST_CMRBULLE_SHOWED", jsonObject.toString());
             }
          }
       }
       return;
    }
    public void c(boolean p0){
       i.b(this, p0);
    }
}
