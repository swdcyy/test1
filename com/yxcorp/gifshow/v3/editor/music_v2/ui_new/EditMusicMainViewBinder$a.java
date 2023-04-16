package com.yxcorp.gifshow.v3.editor.music_v2.ui_new.EditMusicMainViewBinder$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.EditMusicMainViewBinder;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import urc.e;
import urc.f;
import urc.i;
import com.kuaishou.android.model.music.Music;
import lsc.g0;
import qrc.e;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import androidx.fragment.app.Fragment;
import lsc.f0;
import lnc.e7;

public final class EditMusicMainViewBinder$a implements View$OnClickListener	// class@0010f4
{
    public final EditMusicMainViewBinder b;

    public void EditMusicMainViewBinder$a(EditMusicMainViewBinder p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditMusicMainViewBinder$a.class, "1")) {
          return;
       }
       i oi = this.b.j.o0().s().i();
       Music music = (oi != null)? oi.g(): null;
       g0.k(music);
       g0.g(this.b.l.a(), "top_right_corner");
       if (PostExperimentUtils.u()) {
          f0.n(this.b.D());
       }else {
          f0.m(this.b.D());
       }
       e7.c("music_library_entrance");
       return;
    }
}
