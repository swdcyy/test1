package com.yxcorp.gifshow.v3.editor.cover.n0;
import laa.f;
import java.lang.Object;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Cover$b;
import com.kuaishou.edit.draft.Cover$Type;
import com.kuaishou.edit.draft.VideoCoverParam$b;
import com.kuaishou.edit.draft.VideoCoverParam;

public final class n0 implements f	// class@000e83
{
    public static final n0 a;

    static {
       n0.a = new n0();
    }
    public void n0(){
       super();
    }
    public final void a(GeneratedMessageLite$Builder p0){
       p0.h(Cover$Type.PICTURE);
       VideoCoverParam$b uob = VideoCoverParam.newBuilder();
       uob.a(0);
       p0.i(uob);
    }
}
