package com.yxcorp.gifshow.v3.editor.music_v2.vm.MusicMiddleware$startGenerateRapMusic$2;
import erd.a;
import msc.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.music_v2.vm.MusicMiddleware$startGenerateRapMusic$2$1;
import com.yxcorp.gifshow.v3.framework.KSStore;
import tvc.c;
import tvc.e;
import urc.e;
import urc.f;
import urc.b;
import trc.t0;
import com.yxcorp.gifshow.v3.editor.music_v2.network.RapRepo;
import com.yxcorp.gifshow.v3.editor.music_v2.network.LyricRepo;
import com.yxcorp.gifshow.v3.editor.music_v2.network.LyricRepo$a;
import src.g;
import com.yxcorp.gifshow.v3.editor.music_v2.action.MusicSelectedAction;
import src.n;
import urc.k;
import com.yxcorp.gifshow.plugin.music.SelectSource;
import src.b;
import tvc.a;

public final class MusicMiddleware$startGenerateRapMusic$2 implements a	// class@001131
{
    public final e b;

    public void MusicMiddleware$startGenerateRapMusic$2(e p0){
       this.b = p0;
       super();
    }
    public final void run(){
       b uob1;
       String str;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MusicMiddleware$startGenerateRapMusic$2.class, "1")) {
          return;
       }
       MusicMiddleware$startGenerateRapMusic$2$1 ostartGenera = new MusicMiddleware$startGenerateRapMusic$2$1(this);
       KSStore kSStore = this.b.a();
       if (kSStore != null) {
          b uob = kSStore.b().s().f();
          if (uob != null) {
             uob1 = uob;
          }else {
             t0 ot0 = this.b.i.b();
             if (ot0 != null) {
                str = ot0.c();
                if (str != null) {
                label_003e :
                   g og = LyricRepo.i.b().c(str);
                   if (og != null) {
                      objArray = ostartGenera.invoke(og);
                   }
                   uob1 = objArray;
                }
             }
             str = "lyrics_classic";
             goto label_003e ;
          }
          MusicSelectedAction musicSelecte = new MusicSelectedAction(new n(this.b.i.b()), kSStore.b().v().c(), kSStore.b().r(), SelectSource.RAP_MUSIC, kSStore.b().t(), uob1, (kSStore.b().v().g() ^ 0x01));
          kSStore.a(ostartGenera);
       }
       return;
    }
}
