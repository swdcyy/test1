package com.yxcorp.gifshow.v3.editor.music_v2.MusicEditor$d;
import erd.g;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicEditor;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.BaseEditor;
import kotlin.jvm.internal.a;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.f;
import java.lang.CharSequence;
import android.text.TextUtils;
import kuaishou.perf.page.impl.d;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;

public final class MusicEditor$d implements g	// class@001045
{
    public final MusicEditor b;

    public void MusicEditor$d(MusicEditor p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       MusicEditor musicEditor = MusicEditor.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicEditor$d.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, p0, musicEditor, "6")) {
             p0 = p0.d;
             a.o(p0, "mDelegate");
             p0 = f.m(p0.getType());
             if (!TextUtils.isEmpty(p0)) {
                d.d("postMusicPanelMonitor").n();
                d uod = d.d("postMusicPanelMonitor");
                a.o(uod, "PostPageLogger.getInstan¡­icMonitorTag.MUSIC_PANEL\)");
                uod.l(p0);
                d.d("postMusicPanelMonitor").g("clickToLoadData");
             }
          }
          this.b.W();
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(objArray, p0, musicEditor, "17")) {
             EditorDelegate uEditorDeleg = p0.i();
             a.o(uEditorDeleg, "delegate");
             BaseFragment uBaseFragmen = uEditorDeleg.q();
             a.o(uBaseFragmen, "delegate.previewFragment");
             e uoe = uBaseFragmen.getChildFragmentManager().beginTransaction();
             a.o(uoe, "delegate.previewFragment¡­anager.beginTransaction\(\)");
             uoe.y(R.anim.arg_RES_7f010105, 0x7f01010d);
             p0.b("MusicEditor", uoe);
          }
       }
       return;
    }
}
