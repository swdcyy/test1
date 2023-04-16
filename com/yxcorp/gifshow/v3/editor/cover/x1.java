package com.yxcorp.gifshow.v3.editor.cover.x1;
import laa.f;
import java.lang.Object;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Cover$b;
import com.kuaishou.edit.draft.Cover$Type;
import com.kuaishou.edit.draft.VideoCoverParam$b;
import com.kuaishou.edit.draft.VideoCoverParam;

public final class x1 implements f	// class@000eeb
{
    public static final x1 a;

    static {
       x1.a = new x1();
    }
    public void x1(){
       super();
    }
    public final void a(GeneratedMessageLite$Builder p0){
       p0.h(Cover$Type.VIDEO);
       VideoCoverParam$b uob = VideoCoverParam.newBuilder();
       uob.a(0);
       p0.i(uob);
    }
}
