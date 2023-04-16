package com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicRootFragment$d;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicRootFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import lsc.h0;

public final class MusicRootFragment$d implements Runnable	// class@0010c6
{
    public final MusicRootFragment b;

    public void MusicRootFragment$d(MusicRootFragment p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, MusicRootFragment$d.class, "1")) {
          return;
       }
       BaseEditorFragment t = this.b.t;
       a.o(t, "mEditorDelegate");
       h0.e(t);
       t = this.b.t;
       a.o(t, "mEditorDelegate");
       h0.d(t);
       return;
    }
}
