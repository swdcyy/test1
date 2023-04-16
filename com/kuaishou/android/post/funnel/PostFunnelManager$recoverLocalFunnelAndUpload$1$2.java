package com.kuaishou.android.post.funnel.PostFunnelManager$recoverLocalFunnelAndUpload$1$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.StringBuilder;
import java.lang.Object;
import com.kuaishou.protobuf.photo.funnel.PostFunnelStat$c;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class PostFunnelManager$recoverLocalFunnelAndUpload$1$2 extends Lambda implements l	// class@000eb3
{
    public final StringBuilder $sb;

    public void PostFunnelManager$recoverLocalFunnelAndUpload$1$2(StringBuilder p0){
       this.$sb = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(PostFunnelStat$c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostFunnelManager$recoverLocalFunnelAndUpload$1$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "builder");
       p0.e(this.$sb);
       return "";
    }
}
