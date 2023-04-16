package com.kwai.feature.post.api.music.cloudmusic.DefaultSearchInteractionImpl;
import com.kwai.feature.post.api.music.cloudmusic.SearchMusicPanelInteraction;
import com.kwai.feature.post.api.music.cloudmusic.DefaultSearchInteractionImpl$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.p3;
import q87.c;
import android.content.Intent;

public final class DefaultSearchInteractionImpl extends SearchMusicPanelInteraction	// class@001412
{
    public static final DefaultSearchInteractionImpl$a Companion;

    static {
       DefaultSearchInteractionImpl.Companion = new DefaultSearchInteractionImpl$a(null);
    }
    public void DefaultSearchInteractionImpl(){
       super();
    }
    public void onClickMusicEntrance(){
       if (PatchProxy.applyVoid(null, this, DefaultSearchInteractionImpl.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       p3.D().w("DefaultSearchInteractionImpl", "onClickMusicEntrance", objArray);
       return;
    }
    public void onHideMusicSearchPanel(){
       if (PatchProxy.applyVoid(null, this, DefaultSearchInteractionImpl.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       p3.D().w("DefaultSearchInteractionImpl", "onHideMusicSearchPanel", objArray);
       return;
    }
    public void onOpenMusicSearchPanel(){
       if (PatchProxy.applyVoid(null, this, DefaultSearchInteractionImpl.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       p3.D().w("DefaultSearchInteractionImpl", "onOpenMusicSearchPanel", objArray);
       return;
    }
    public void onSelectMusic(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DefaultSearchInteractionImpl.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       p3.D().w("DefaultSearchInteractionImpl", "onSelectMusic", objArray);
       return;
    }
}
