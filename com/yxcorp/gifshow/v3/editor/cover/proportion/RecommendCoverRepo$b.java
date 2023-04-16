package com.yxcorp.gifshow.v3.editor.cover.proportion.RecommendCoverRepo$b;
import laa.f;
import java.lang.Object;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Cover$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.edit.draft.Cover$Type;
import com.kuaishou.edit.draft.VideoCoverParam$b;
import com.kuaishou.edit.draft.VideoCoverParam;

public final class RecommendCoverRepo$b implements f	// class@000e90
{
    public static final RecommendCoverRepo$b a;

    static {
       RecommendCoverRepo$b.a = new RecommendCoverRepo$b();
    }
    public void RecommendCoverRepo$b(){
       super();
    }
    public void a(GeneratedMessageLite$Builder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecommendCoverRepo$b.class, "1")) {
       }else {
          a.p(p0, "builder");
          p0.h(Cover$Type.VIDEO);
          VideoCoverParam$b uob = VideoCoverParam.newBuilder();
          uob.a(0);
          p0.i(uob);
       }
       return;
    }
}
