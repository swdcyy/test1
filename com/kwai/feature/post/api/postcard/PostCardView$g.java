package com.kwai.feature.post.api.postcard.PostCardView$g;
import erd.o;
import java.lang.String;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import k46.g;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import java.lang.Integer;
import java.util.List;

public final class PostCardView$g implements o	// class@001425
{
    public final String b;

    public void PostCardView$g(String p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       g og = PatchProxy.applyOneRefs(p0, this, PostCardView$g.class, "1");
       if (og != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          g og1 = new g(null, null, p0.getSecond(), null, null, 4, 3, null, this.b+' '+p0.getFirst(), null);
       }
       return og;
    }
}
