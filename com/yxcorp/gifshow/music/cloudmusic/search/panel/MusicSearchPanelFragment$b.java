package com.yxcorp.gifshow.music.cloudmusic.search.panel.MusicSearchPanelFragment$b;
import dpb.h;
import com.yxcorp.gifshow.music.cloudmusic.search.panel.MusicSearchPanelFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import io.reactivex.subjects.PublishSubject;
import java.lang.Boolean;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.yxcorp.utility.n;

public final class MusicSearchPanelFragment$b implements h	// class@00203c
{
    public final MusicSearchPanelFragment a;

    public void MusicSearchPanelFragment$b(MusicSearchPanelFragment p0){
       this.a = p0;
       super();
    }
    public void R(){
       if (PatchProxy.applyVoid(null, this, MusicSearchPanelFragment$b.class, "1")) {
          return;
       }
       this.a.eh();
       this.a.dh().onNext(Boolean.TRUE);
       return;
    }
    public void S(){
       if (PatchProxy.applyVoid(null, this, MusicSearchPanelFragment$b.class, "5")) {
          return;
       }
       this.a.eh();
       return;
    }
    public void T(){
       if (PatchProxy.applyVoid(null, this, MusicSearchPanelFragment$b.class, "2")) {
          return;
       }
       this.a.eh();
       this.a.dh().onNext(Boolean.FALSE);
       return;
    }
    public void U(){
       if (PatchProxy.applyVoid(null, this, MusicSearchPanelFragment$b.class, "4")) {
          return;
       }
       this.a.eh();
       return;
    }
    public void a(){
       PatchProxy.applyVoid(null, this, MusicSearchPanelFragment$b.class, "8");
    }
    public void b(){
       PatchProxy.applyVoid(null, this, MusicSearchPanelFragment$b.class, "7");
    }
    public void c(){
       PatchProxy.applyVoid(null, this, MusicSearchPanelFragment$b.class, "6");
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, MusicSearchPanelFragment$b.class, "3")) {
          return;
       }
       this.a.eh();
       n.C(this.a.getActivity());
       this.a.dh().onNext(Boolean.FALSE);
       return;
    }
}
