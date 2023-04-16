package com.yxcorp.gifshow.v3.editor.effectv2.action.EffectPanelDetachAction$a;
import java.lang.Runnable;
import java.util.ArrayList;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import kotlin.jvm.internal.a;
import qr4.i;
import qr4.e$j;
import java.util.Objects;
import qr4.e$h;
import qr4.k$e;

public final class EffectPanelDetachAction$a implements Runnable	// class@000f2b
{
    public final ArrayList b;
    public final c c;
    public final ArrayList d;

    public void EffectPanelDetachAction$a(ArrayList p0,c p1,ArrayList p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       VideoContext videoContext;
       if (PatchProxy.applyVoid(null, this, EffectPanelDetachAction$a.class, "1")) {
          return;
       }
       String str = "null cannot be cast to non-null type kotlin.Array<T>";
       int i = 0;
       String str1 = "workspaceDraft.videoContext";
       if (this.b.isEmpty() ^ 0x01) {
          videoContext = this.c.d1();
          a.o(videoContext, str1);
          e$j[] ojArray = new e$j[i];
          Object[] objArray = this.b.toArray(ojArray);
          Objects.requireNonNull(objArray, str);
          videoContext.F().d.n = objArray;
       }else {
          videoContext = this.c.d1();
          a.o(videoContext, str1);
          videoContext.F().d.n = e$j.a();
       }
       if (this.d.isEmpty() ^ 0x01) {
          videoContext = this.c.d1();
          a.o(videoContext, str1);
          k$e[] uoeArray = new k$e[i];
          Object[] objArray1 = this.d.toArray(uoeArray);
          Objects.requireNonNull(objArray1, str);
          videoContext.F().d.O = objArray1;
       }else {
          videoContext = this.c.d1();
          a.o(videoContext, str1);
          videoContext.F().d.O = k$e.a();
       }
       return;
    }
}
