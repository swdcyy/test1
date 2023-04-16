package com.yxcorp.gifshow.v3.editor.music_v2.ui_new.EditMusicMainViewBinder$e;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.EditMusicMainViewBinder;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import android.content.Context;
import java.util.Objects;
import k2b.e0;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.widget.TextView;
import lsc.g0;
import lsc.f0;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicRootFragment;
import jn9.b;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.volume.MusicVolumeFragmentV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import androidx.fragment.app.c;
import androidx.fragment.app.e;

public final class EditMusicMainViewBinder$e implements View$OnClickListener	// class@0010f9
{
    public final EditMusicMainViewBinder b;

    public void EditMusicMainViewBinder$e(EditMusicMainViewBinder p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditMusicMainViewBinder$e.class, "1")) {
          return;
       }
       Context context = this.b.D().getContext();
       Objects.requireNonNull(context, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
       EditMusicMainViewBinder h = this.b.h;
       a.o(h, "volumeButton");
       g0.i(context, h.getText().toString());
       Fragment uFragment = this.b.D();
       String obj = null;
       if (!PatchProxy.applyVoidOneRefs(uFragment, obj, f0.class, "17")) {
          a.p(uFragment, "childFragment");
          MusicRootFragment musicRootFra = f0.b(uFragment);
          Objects.requireNonNull(musicRootFra);
          if (!PatchProxy.applyVoid(obj, musicRootFra, MusicRootFragment.class, "38")) {
             musicRootFra.Fh().c();
             musicRootFra.zh().c();
             MusicVolumeFragmentV2 musicVolumeF = PatchProxy.apply(obj, musicRootFra, MusicRootFragment.class, "10");
             if (musicVolumeF == PatchProxyResult.class) {
                musicVolumeF = musicRootFra.T.getValue();
             }
             Objects.requireNonNull(musicVolumeF);
             if (!PatchProxy.applyVoid(obj, musicVolumeF, MusicVolumeFragmentV2.class, "14")) {
                MusicVolumeFragmentV2 p = musicVolumeF.p;
                obj = "editorDelegate";
                if (p == null) {
                   a.S(obj);
                }
                BaseFragment uBaseFragmen = p.q();
                String str = "editorDelegate.previewFragment";
                a.o(uBaseFragmen, str);
                e uoe = uBaseFragmen.getChildFragmentManager().beginTransaction();
                a.o(uoe, "editorDelegate.previewFr¡­anager.beginTransaction\(\)");
                uoe.y(R.anim.arg_RES_7f010105, 0x7f01010d);
                if (musicVolumeF.isAdded()) {
                   uoe.E(musicVolumeF);
                }else {
                   MusicVolumeFragmentV2 p1 = musicVolumeF.p;
                   if (p1 == null) {
                      a.S(obj);
                   }
                   BaseFragment uBaseFragmen1 = p1.q();
                   a.o(uBaseFragmen1, str);
                   c childFragmen = uBaseFragmen1.getChildFragmentManager();
                   Fragment uFragment1 = childFragmen.findFragmentByTag("MusicVolumeFragmentV2");
                   if (uFragment1 != null) {
                      uoe.u(uFragment1);
                   }
                   MusicVolumeFragmentV2 p2 = musicVolumeF.p;
                   if (p2 == null) {
                      a.S(obj);
                   }
                   uoe.g(p2.m(), musicVolumeF, "MusicVolumeFragmentV2");
                }
                uoe.o();
             }
          }
       }
       return;
    }
}
