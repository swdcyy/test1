package com.yxcorp.gifshow.v3.d;
import laa.f;
import java.lang.Object;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Cover$b;
import com.yxcorp.gifshow.v3.f;
import com.kuaishou.edit.draft.Cover$Type;
import com.kuaishou.edit.draft.VideoCoverParam$b;
import com.kuaishou.edit.draft.VideoCoverParam;

public final class d implements f	// class@000d8b
{
    public static final d a;

    static {
       d.a = new d();
    }
    public void d(){
       super();
    }
    public final void a(GeneratedMessageLite$Builder p0){
       p0.h(Cover$Type.VIDEO);
       VideoCoverParam$b uob = VideoCoverParam.newBuilder();
       uob.a(0);
       p0.i(uob);
    }
}
