package com.yxcorp.gifshow.music.cloudmusic.a$b;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.music.cloudmusic.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.music.cloudmusic.local.LocalMusicFragmentWrapper;
import com.yxcorp.gifshow.music.cloudmusic.local.LocalMusicFragment;

public class a$b extends m	// class@001fec
{
    public final a c;

    public void a$b(a p0,boolean p1,long p2){
       this.c = p0;
       super(p1, p2);
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
          return;
       }
       a$b tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, a.class, "10")) {
          a r = tc.r;
          if (r != null && r instanceof LocalMusicFragmentWrapper) {
             r.ch().Ph();
          }
       }
       return;
    }
}
