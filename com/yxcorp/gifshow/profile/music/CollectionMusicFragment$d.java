package com.yxcorp.gifshow.profile.music.CollectionMusicFragment$d;
import y3c.a0;
import com.yxcorp.gifshow.profile.music.CollectionMusicFragment;
import java.lang.Object;
import com.kuaishou.android.model.music.Music;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import kob.r;
import u07.t$a;
import android.app.Activity;
import u07.f;
import y3c.j;
import u07.u;
import com.yxcorp.gifshow.profile.music.CollectionMusicFragment$d$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import java.util.Objects;
import java.lang.Boolean;
import java.lang.Integer;
import s1c.r0;
import com.kwai.framework.model.user.User;
import l2c.b;

public class CollectionMusicFragment$d implements a0	// class@0013f7
{
    public final CollectionMusicFragment a;

    public void CollectionMusicFragment$d(CollectionMusicFragment p0){
       this.a = p0;
       super();
    }
    public void a(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CollectionMusicFragment$d.class, "3")) {
          return;
       }
       if (p0 == null || (this.a.Ih() && p0.isOffline())) {
          if (this.a.getActivity() == null) {
             return;
          }else {
             t$a uoa = f.e(new t$a(this.a.getActivity()));
             uoa.W0(R.string.arg_RES_7f10380c);
             uoa.S0(R.string.arg_RES_7f104280);
             uoa.Q0(R.string.cancel);
             uoa.u0(new j(this, p0));
             uoa.Y(new CollectionMusicFragment$d$a(this, this.a.O.isPlaying()));
          }
       }
       return;
    }
    public void b(Music p0){
    }
    public void c(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CollectionMusicFragment$d.class, "2")) {
          return;
       }
       CollectionMusicFragment$d ta = this.a;
       boolean b = ta.O.e40();
       int i = 1;
       Objects.requireNonNull(ta);
       if (!PatchProxy.isSupport(CollectionMusicFragment.class) || !PatchProxy.applyVoidThreeRefs(Boolean.valueOf(b), Integer.valueOf(i), p0, ta, CollectionMusicFragment.class, "16")) {
          b.c(b, 1, p0, 1, 0, 906, ta.G.b.getId());
       }
       return;
    }
    public void d(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CollectionMusicFragment$d.class, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       CollectionMusicFragment$d ta = this.a;
       boolean b = ta.O.e40();
       int i = 1;
       Objects.requireNonNull(ta);
       if (!PatchProxy.isSupport(CollectionMusicFragment.class) || !PatchProxy.applyVoidThreeRefs(Boolean.valueOf(b), Integer.valueOf(i), p0, ta, CollectionMusicFragment.class, "15")) {
          b.c(b, 1, p0, 1, 0, 904, ta.G.b.getId());
       }
       return;
    }
}
