package com.yxcorp.gifshow.v3.editor.music_v2.network.LyricAEResourceDownloader;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.music_v2.network.LyricAEResourceDownloader$materialDownloader$2;
import msd.a;
import qrd.p;
import qrd.s;
import src.g;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.v3.editor.music_v2.network.LyricAEResourceDownloader$b;
import io.reactivex.g;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.v3.editor.music_v2.network.LyricAEResourceDownloader$c;
import erd.g;

public final class LyricAEResourceDownloader	// class@0010a1
{
    public final p a;

    public void LyricAEResourceDownloader(){
       super();
       this.a = s.c(LyricAEResourceDownloader$materialDownloader$2.INSTANCE);
    }
    public final t a(g p0){
       z obj = PatchProxy.applyOneRefs(p0, this, LyricAEResourceDownloader.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "item");
       Object[] objArray = new Object[0];
       a.D().w("LyricAEResourceDownloader", "download editLyricAnimMaterialData: "+p0, objArray);
       obj = d.c;
       t ot = t.create(new LyricAEResourceDownloader$b(this, p0)).subscribeOn(obj).observeOn(obj);
       ot = ot.doOnError(LyricAEResourceDownloader$c.b);
       a.o(ot, "Observable.create { emit¡­${it.message}\"\)\n        }");
       return ot;
    }
}
