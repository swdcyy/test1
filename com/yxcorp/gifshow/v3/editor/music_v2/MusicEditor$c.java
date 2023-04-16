package com.yxcorp.gifshow.v3.editor.music_v2.MusicEditor$c;
import com.yxcorp.gifshow.v3.EditorManager$b;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicEditor;
import java.lang.Object;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.BaseEditor;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import voc.n;
import com.yxcorp.gifshow.v3.editor.music_v2.action.CancelAutoMusicAction;
import xvc.b;
import ooc.c1;

public final class MusicEditor$c implements EditorManager$b	// class@001044
{
    public final MusicEditor a;

    public void MusicEditor$c(MusicEditor p0){
       this.a = p0;
       super();
    }
    public void d(EditorItemFunc p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicEditor$c.class, "1")) {
          return;
       }
       a.p(p0, "func");
       BaseEditor uBaseEditor = this.a.d.P(p0);
       if (uBaseEditor != null && uBaseEditor.y() == true) {
          this.a.T().t0(new CancelAutoMusicAction());
       }
       return;
    }
    public void e(){
       c1.b(this);
    }
    public void f(){
       c1.a(this);
    }
}
