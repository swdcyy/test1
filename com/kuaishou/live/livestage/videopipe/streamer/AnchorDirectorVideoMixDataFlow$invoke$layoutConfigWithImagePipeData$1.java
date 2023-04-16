package com.kuaishou.live.livestage.videopipe.streamer.AnchorDirectorVideoMixDataFlow$invoke$layoutConfigWithImagePipeData$1;
import msd.q;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import oe3.h;
import kotlin.Triple;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import kotlin.Pair;

public final class AnchorDirectorVideoMixDataFlow$invoke$layoutConfigWithImagePipeData$1 extends Lambda implements q	// class@000c1d
{
    public static final AnchorDirectorVideoMixDataFlow$invoke$layoutConfigWithImagePipeData$1 INSTANCE;

    static {
       AnchorDirectorVideoMixDataFlow$invoke$layoutConfigWithImagePipeData$1.INSTANCE = new AnchorDirectorVideoMixDataFlow$invoke$layoutConfigWithImagePipeData$1();
    }
    public void AnchorDirectorVideoMixDataFlow$invoke$layoutConfigWithImagePipeData$1(){
       super(3);
    }
    public Object invoke(Object p0,Object p1,Object p2){
       return this.invoke(p0, p1, p2);
    }
    public final Triple invoke(LayoutConfig p0,h p1,h p2){
       Pair obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, AnchorDirectorVideoMixDataFlow$invoke$layoutConfigWithImagePipeData$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "lhs");
       a.p(p1, "rhs");
       a.p(p2, "ths");
       obj = p1.a();
       Triple triple = null;
       LayoutConfig first = (obj != null)? obj.getFirst(): triple;
       if (a.g(p0, first) && p2.a() != null) {
          triple = new Triple(p0, p1.a().getSecond(), p2.a());
       }
       return triple;
    }
}
