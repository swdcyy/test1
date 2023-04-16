package com.yxcorp.gifshow.v3.editor.music_v2.ui_new.recommend.RecommendMusicViewBinderV2$a;
import erd.g;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.recommend.RecommendMusicViewBinderV2;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k2b.s$b;
import faa.a;
import q87.c;

public final class RecommendMusicViewBinderV2$a implements g	// class@00110c
{
    public final RecommendMusicViewBinderV2 b;

    public void RecommendMusicViewBinderV2$a(RecommendMusicViewBinderV2 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecommendMusicViewBinderV2$a.class, "1")) {
       }else if(p0 == FragmentEvent.PAUSE){
          s$b uob = this.b.F();
          if (uob != null) {
             uob.d();
          }
       }
       if (p0 == FragmentEvent.RESUME) {
          Object[] objArray = new Object[0];
          a.D().w("RecommendMusicViewBinder", "lifecycle", objArray);
          this.b.E();
       }
       return;
    }
}
