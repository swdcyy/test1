package com.kuaishou.gifshow.kuaishan.logic.r0;
import erd.o;
import com.kuaishou.gifshow.kuaishan.logic.o1;
import java.util.List;
import java.lang.Object;
import com.kwai.video.clipkit.mv.EditorSdk2MvCreationResult;
import java.lang.String;
import com.kwai.feature.post.api.feature.memory.MemorySceneType;
import brd.t;
import x80.h1;
import kotlin.Pair;
import java.lang.Integer;

public final class r0 implements o	// class@001a6e
{
    public final o1 b;
    public final List c;
    public final boolean d;

    public void r0(o1 p0,List p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       r0 tb = this.b;
       r0 tc = this.c;
       r0 td = this.d;
       tb.G0(p0);
       p0 = (tc == null || tc.isEmpty())? t.just(new Pair(Integer.valueOf(100), tb)): tb.P0(tc, null, td, false, true, null, false).map(new h1(tb));
       return p0;
    }
}
