package com.yxcorp.gifshow.profile.music.ProfileMusicFragment$b;
import y3c.a0;
import com.yxcorp.gifshow.profile.music.ProfileMusicFragment;
import java.lang.Object;
import com.kuaishou.android.model.music.Music;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kob.r;
import s1c.r0;
import com.kwai.framework.model.user.User;
import z5c.y1;

public class ProfileMusicFragment$b implements a0	// class@0013fc
{
    public final ProfileMusicFragment a;

    public void ProfileMusicFragment$b(ProfileMusicFragment p0){
       this.a = p0;
       super();
    }
    public void a(Music p0){
    }
    public void b(Music p0){
    }
    public void c(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileMusicFragment$b.class, "2")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       y1.G(this.a.N.e40(), 2, this.a.I.b, p0, 1, 0);
       return;
    }
    public void d(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileMusicFragment$b.class, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       y1.H(this.a.N.e40(), 2, this.a.I.b, p0, 1, 0);
       return;
    }
}
