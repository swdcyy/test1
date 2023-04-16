package com.kwai.feature.post.api.postcard.PostCardView$f;
import erd.o;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import brd.t;
import om6.d;
import lnc.x6;
import lnc.y6;
import com.kwai.feature.post.api.postcard.a;

public final class PostCardView$f implements o	// class@001424
{
    public static final PostCardView$f b;

    static {
       PostCardView$f.b = new PostCardView$f();
    }
    public void PostCardView$f(){
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, PostCardView$f.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "draftCount");
          if (a.t(p0.intValue(), 0) <= 0) {
             p0 = t.empty();
          }else {
             d uod = y6.r(d.class);
             if (uod != null) {
                ot = uod.Bs();
                if (ot != null) {
                   p0 = ot.map(new a(p0));
                   if (p0 == null) {
                   }
                }else {
                }
             }else {
             }
          }
          ot = p0;
       }
       return ot;
    }
}
