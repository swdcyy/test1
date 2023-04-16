package com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicRootFragment$b;
import voc.b0;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicRootFragment;
import java.lang.Object;
import orc.b;
import voc.a0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import voc.b0$b;
import faa.a;
import java.lang.StringBuilder;
import q87.c;

public final class MusicRootFragment$b implements b0	// class@0010c3
{
    public final MusicRootFragment b;

    public void MusicRootFragment$b(MusicRootFragment p0){
       this.b = p0;
       super();
    }
    public void a(b p0,a0 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MusicRootFragment$b.class, "2")) {
          return;
       }
       String str = "importMusicData";
       a.p(p0, str);
       String str1 = "repo";
       a.p(p1, str1);
       if (!PatchProxy.applyVoidThreeRefs(this, p0, p1, null, b0$b.class, "2")) {
          a.p(p0, str);
          a.p(p1, str1);
       }
       p1.Q = true;
       Object[] objArray = new Object[0];
       a.D().w("MusicRootFragment", "addImportMusic listener importMusicData:"+p0, objArray);
       return;
    }
    public void b(String p0,a0 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MusicRootFragment$b.class, "1")) {
          return;
       }
       String str = "importMusicDataId";
       a.p(p0, str);
       String str1 = "repo";
       a.p(p1, str1);
       if (!PatchProxy.applyVoidThreeRefs(this, p0, p1, null, b0$b.class, "1")) {
          a.p(p0, str);
          a.p(p1, str1);
       }
       Object[] objArray = new Object[0];
       a.D().w("MusicRootFragment", "deleteImportMusic listener importMusicData:"+p0, objArray);
       p0.Q = true;
       return;
    }
}
