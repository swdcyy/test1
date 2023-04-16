package com.yxcorp.gifshow.v3.previewer.ktv.KtvSongEditPreviewFragment$b;
import voc.v;
import com.yxcorp.gifshow.v3.previewer.ktv.KtvSongEditPreviewFragment;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment;
import maa.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.edit.draft.model.c;
import lnc.a1;

public class KtvSongEditPreviewFragment$b implements v	// class@0015b0
{
    public final EditorItemFunc a;
    public final KtvSongEditPreviewFragment b;

    public void KtvSongEditPreviewFragment$b(KtvSongEditPreviewFragment p0,EditorItemFunc p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public boolean G0(){
       boolean b = (this.b.q2 != null || this.a == EditorItemFunc.KTV)? true: false;
       return b;
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, KtvSongEditPreviewFragment$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.b.M.o0().p() <= b && this.a == EditorItemFunc.KTV_LYRIC) {
          b = false;
       }
       return b;
    }
    public String b(){
       Object obj = PatchProxy.apply(null, this, KtvSongEditPreviewFragment$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a == EditorItemFunc.KTV || this.b.q2 != null) {
          return null;
       }
       return a1.p(0x7f101af5);
    }
}
