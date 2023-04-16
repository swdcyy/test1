package com.yxcorp.gifshow.v3.vm.MusicIconViewModel;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.MutableLiveData;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Float;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import yaa.c;
import com.kuaishou.edit.draft.Music;
import lnc.w6;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.v3.vm.MusicIconViewModel$MusicFromMusicDraft;
import com.kuaishou.edit.draft.Music$Type;
import androidx.lifecycle.LiveData;
import android.os.Handler;
import android.os.Looper;
import com.yxcorp.gifshow.v3.vm.MusicIconViewModel$a;
import java.lang.Runnable;

public final class MusicIconViewModel extends ViewModel	// class@001627
{
    public MutableLiveData a;
    public MutableLiveData b;
    public MutableLiveData c;
    public MutableLiveData d;
    public int e;
    public long f;

    public void MusicIconViewModel(){
       super();
       this.a = new MutableLiveData();
       this.b = new MutableLiveData();
       this.c = new MutableLiveData(Integer.valueOf(1));
       this.d = new MutableLiveData(Float.valueOf(0));
       this.f = -1;
    }
    public final void o0(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicIconViewModel.class, "9")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       Music music = w6.c(p0.J0());
       if (music == null) {
          this.a.setValue(null);
          this.p0(null, 1);
       }else {
          p0 = p0.J0();
          a.m(p0);
          a.o(p0, "workspaceDraft.musicDraft!!");
          this.a.setValue(new MusicIconViewModel$MusicFromMusicDraft(music, p0));
          if (music.getType() != Music$Type.MAGIC_EMOJI) {
             this.p0(this.a.getValue(), 3);
          }
       }
       return;
    }
    public final void p0(Music p0,int p1){
       MusicIconViewModel musicIconVie = MusicIconViewModel.class;
       if (PatchProxy.isSupport(musicIconVie) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, musicIconVie, "7")) {
          return;
       }
       new Handler(Looper.getMainLooper()).post(new MusicIconViewModel$a(this, p1));
       return;
    }
}
