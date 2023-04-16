package com.yxcorp.gifshow.v3.editor.music_v2.ui_new.recommend.RecommendMusicViewBinderV2$b;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.util.PostUtils;

public final class RecommendMusicViewBinderV2$b implements g	// class@00110d
{
    public static final RecommendMusicViewBinderV2$b b;

    static {
       RecommendMusicViewBinderV2$b.b = new RecommendMusicViewBinderV2$b();
    }
    public void RecommendMusicViewBinderV2$b(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecommendMusicViewBinderV2$b.class, "1")) {
       }else {
          a.p(p0, "throwable");
          PostUtils.D("RecommendMusicViewBinder", "lifecycle", p0);
       }
       return;
    }
}
