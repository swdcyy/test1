package com.yxcorp.gifshow.v3.e;
import laa.f;
import java.lang.Object;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Cover$b;
import com.yxcorp.gifshow.v3.f;
import com.kuaishou.edit.draft.Cover$Type;
import com.kuaishou.edit.draft.VideoCoverParam$b;
import com.kuaishou.edit.draft.VideoCoverParam;

public final class e implements f	// class@000d8c
{
    public static final e a;

    static {
       e.a = new e();
    }
    public void e(){
       super();
    }
    public final void a(GeneratedMessageLite$Builder p0){
       p0.h(Cover$Type.VIDEO);
       VideoCoverParam$b uob = VideoCoverParam.newBuilder();
       uob.a(0);
       p0.i(uob);
    }
}
