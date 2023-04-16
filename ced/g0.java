package ced.g0;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.search.result.hashtag.presenters.o;
import java.lang.Object;
import android.view.View;
import com.yxcorp.plugin.search.result.hashtag.entity.TagInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.music.Music;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import zdd.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import k2b.e0;
import gbd.t;

public final class g0 implements View$OnClickListener	// class@000556
{
    public final o b;

    public void g0(o p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       g0 tb = this.b;
       o p = tb.p;
       String str = "music";
       if (p.mIsMusicPlaying != null) {
          tb.S8();
          if (!PatchProxy.applyVoid(null, tb, o.class, "17")) {
             p = tb.r;
             o p1 = tb.p;
             TagInfo mMusic = p1.mMusic;
             Music mId = (mMusic != null)? mMusic.mId: "";
             t.l(1, p, a.b(mId, str, "", p1, "HEAD_PLAYPAUSE_SUBCARD"), a.d());
          }
       }else {
          o r = tb.r;
          TagInfo mMusic1 = p.mMusic;
          Music mId1 = (mMusic1 != null)? mMusic1.mId: "";
          t.l(1, r, a.b(mId1, str, "", p, "HEAD_PLAY_SUBCARD"), a.d());
          tb.R8();
       }
       return;
    }
}
