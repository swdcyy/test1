package com.kuaishou.live.lite.square.notice.e;
import com.kuaishou.live.lite.square.notice.g$a;
import com.kuaishou.live.lite.square.notice.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import z1.a;
import java.lang.Integer;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import android.net.Uri$Builder;
import e93.b;
import k2b.e0;
import xp5.i;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import va3.a;

public class e implements g$a	// class@000b72
{
    public final f a;

    public void e(f p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       b.j0(LiveLiteLogTag.SQUARE, "notice hide");
       this.a.m.accept(null);
       return;
    }
    public void b(String p0,int p1){
       String str;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoe, "2")) {
          return;
       }
       uoe = this.a;
       f k = uoe.k;
       Objects.requireNonNull(uoe);
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          str = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), uoe, uof, "4");
          if (str != PatchProxyResult.class) {
          label_0088 :
             k.qc(str, false);
             e ta = this.a;
             a.a(this.a.l.getPage(), ta.j, ta.l.c0(), "MORE_LIVE_PUSH", this.a.l.a());
             return;
          }
       }
       b.Z(LiveLiteLogTag.SQUARE, "click:"+p0+","+p1);
       Uri$Builder uBuilder = new Uri$Builder().scheme("kwailive").authority("slidesquare").appendQueryParameter("tabid", "1").appendQueryParameter("pinUpSource", "3");
       uBuilder.appendQueryParameter("pinUpLiveStreamIds", p0);
       Uri$Builder uBuilder1 = uBuilder;
       str = uBuilder1.appendQueryParameter("pinUpLiveFeedNoticeType", String.valueOf(p1)).toString();
       goto label_0088 ;
    }
}
