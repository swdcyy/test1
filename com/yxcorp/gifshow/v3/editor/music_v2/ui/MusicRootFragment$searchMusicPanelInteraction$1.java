package com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicRootFragment$searchMusicPanelInteraction$1;
import com.kwai.feature.post.api.music.cloudmusic.SearchMusicPanelInteraction;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicRootFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import msc.q;
import com.yxcorp.gifshow.v3.editor.music_v2.action.MusicSearchPanelShowAction;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import android.content.Intent;
import java.lang.StringBuilder;
import qrc.r;
import qrc.k;

public final class MusicRootFragment$searchMusicPanelInteraction$1 extends SearchMusicPanelInteraction	// class@0010cd
{
    public final MusicRootFragment this$0;

    public void MusicRootFragment$searchMusicPanelInteraction$1(MusicRootFragment p0){
       this.this$0 = p0;
       super();
    }
    public void onClickMusicEntrance(){
       if (PatchProxy.applyVoid(null, this, MusicRootFragment$searchMusicPanelInteraction$1.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("MusicRootFragment", "onClickMusicEntrance", objArray);
       this.this$0.Kh();
       return;
    }
    public void onHideMusicSearchPanel(){
       if (PatchProxy.applyVoid(null, this, MusicRootFragment$searchMusicPanelInteraction$1.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("MusicRootFragment", "onHideMusicSearchPanel", objArray);
       this.this$0.Eh().t0(new MusicSearchPanelShowAction(0));
       return;
    }
    public void onOpenMusicSearchPanel(){
       if (PatchProxy.applyVoid(null, this, MusicRootFragment$searchMusicPanelInteraction$1.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("MusicRootFragment", "onOpenMusicSearchPanel", objArray);
       this.this$0.Eh().t0(new MusicSearchPanelShowAction(true));
       return;
    }
    public void onSelectMusic(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicRootFragment$searchMusicPanelInteraction$1.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("MusicRootFragment", "onSelectMusic "+p0, objArray);
       if (p0 != null && this.this$0.Gh().g().d()) {
          this.this$0.Ih(0, p0);
       }
       return;
    }
}
