package com.kuaishou.live.core.show.music.audiencelyrics.d$e;
import erd.g;
import com.kuaishou.live.core.show.music.audiencelyrics.d;
import java.lang.Object;
import com.yxcorp.gifshow.model.Lyrics;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.music.audiencelyrics.view.LiveAudienceLyricsPendantView;
import java.lang.StringBuilder;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveMusicPackage;
import com.kuaishou.live.core.show.music.audiencelyrics.LiveAudienceLyricsLogger;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;

public class d$e implements g	// class@000d33
{
    public final d b;

    public void d$e(d p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$e.class, "1")) {
       }else {
          d t = this.b.t;
          if (t != null) {
             if (p0 != null) {
                t.b(p0);
                p0 = this.b;
                long l = 0;
                p0.E = l;
                p0.t.j(l);
                p0 = this.b;
                p0.t.g((p0.Z8() ^ 1), 1);
             }else {
                t.g(false, false);
             }
             d$e tb = this.b;
             LiveAudienceLyricsLogger.c(this.b.L+this.b.J, this.b.t.d(), 1, LiveAudienceLyricsLogger.a(tb.J, tb.K, tb.I), this.b.q.Z2.a());
          }
       }
       return;
    }
}
