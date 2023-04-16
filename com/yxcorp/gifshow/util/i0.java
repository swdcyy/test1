package com.yxcorp.gifshow.util.i0;
import laa.f;
import java.lang.Object;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Cover$b;
import lnc.p6;
import com.kuaishou.edit.draft.Cover$Type;
import com.kuaishou.edit.draft.VideoCoverParam$b;
import com.kuaishou.edit.draft.VideoCoverParam;

public final class i0 implements f	// class@001f82
{
    public static final i0 a;

    static {
       i0.a = new i0();
    }
    public void i0(){
       super();
    }
    public final void a(GeneratedMessageLite$Builder p0){
       p0.h(Cover$Type.VIDEO);
       VideoCoverParam$b uob = VideoCoverParam.newBuilder();
       uob.a(0);
       p0.i(uob);
    }
}
