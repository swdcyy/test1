package com.yxcorp.gifshow.profile.music.ProfileMusicFragment$c;
import y3c.z;
import com.yxcorp.gifshow.profile.music.ProfileMusicFragment;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.music.Music;
import npb.c;

public class ProfileMusicFragment$c extends z	// class@0013fd
{
    public final ProfileMusicFragment i;

    public void ProfileMusicFragment$c(ProfileMusicFragment p0){
       this.i = p0;
       super();
    }
    public List a(List p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, ProfileMusicFragment$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       if (q.f(p0)) {
          return obj;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Music music = iterator.next().getMusic();
          if (music != null) {
             obj.add(new c(music));
          }
       }
       return obj;
    }
}
