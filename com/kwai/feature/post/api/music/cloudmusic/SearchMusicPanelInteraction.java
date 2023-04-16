package com.kwai.feature.post.api.music.cloudmusic.SearchMusicPanelInteraction;
import java.io.Serializable;
import java.lang.Object;
import hka.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Intent;

public abstract class SearchMusicPanelInteraction implements Serializable	// class@001414
{
    public a backPressable;

    public void SearchMusicPanelInteraction(){
       super();
    }
    public final a getBackPressable(){
       return this.backPressable;
    }
    public abstract void onClickMusicEntrance();
    public abstract void onHideMusicSearchPanel();
    public abstract void onOpenMusicSearchPanel();
    public final void onPanelBackPressed(){
       if (PatchProxy.applyVoid(null, this, SearchMusicPanelInteraction.class, "1")) {
          return;
       }
       SearchMusicPanelInteraction tbackPressab = this.backPressable;
       if (tbackPressab != null) {
          tbackPressab.onBackPressed();
       }
       return;
    }
    public abstract void onSelectMusic(Intent p0);
    public final void setBackPressable(a p0){
       this.backPressable = p0;
    }
}
