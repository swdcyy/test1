package com.yxcorp.gifshow.edit.previewer.loaderv2.o;
import ekd.q$a;
import java.lang.Object;
import com.kuaishou.edit.draft.Asset;
import com.kuaishou.edit.draft.TimeRange$b;
import com.kuaishou.edit.draft.TimeRange;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class o implements q$a	// class@001b47
{
    public static final o a;

    static {
       o.a = new o();
    }
    public void o(){
       super();
    }
    public final Object apply(Object p0){
       TimeRange$b uob = TimeRange.newBuilder();
       uob.b(0);
       uob.a(p0.getDuration());
       return uob.build();
    }
}
