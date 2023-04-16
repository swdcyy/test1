package com.yxcorp.gifshow.v3.editor.music_v2.ui_new.recommend.RecommendMusicViewBinderV2$j;
import erd.o;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.recommend.RecommendMusicViewBinderV2;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class RecommendMusicViewBinderV2$j implements o	// class@001116
{
    public final RecommendMusicViewBinderV2 b;

    public void RecommendMusicViewBinderV2$j(RecommendMusicViewBinderV2 p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       Integer integer = PatchProxy.applyOneRefs(p0, this, RecommendMusicViewBinderV2$j.class, "1");
       if (integer != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          integer = Integer.valueOf(this.b.D(p0.intValue()));
       }
       return integer;
    }
}
