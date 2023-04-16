package com.yxcorp.gifshow.v3.p;
import msd.l;
import java.lang.Object;
import com.kuaishou.protobuf.photo.funnel.PostFunnelStat$c;
import com.yxcorp.gifshow.v3.EditorActivity;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.PostFunnelStat;

public final class p implements l	// class@001578
{
    public static final p b;

    static {
       p.b = new p();
    }
    public void p(){
       super();
    }
    public final Object invoke(Object p0){
       Objects.requireNonNull(p0);
       if (PatchProxy.isSupport(PostFunnelStat$c.class) && PatchProxy.applyOneRefs(Boolean.TRUE, p0, PostFunnelStat$c.class, "28") != PatchProxyResult.class) {
       }else {
          p0.copyOnWrite();
          p0.instance.setIsEditEnter(true);
       }
       return "editEnter";
    }
}
