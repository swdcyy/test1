package com.kwai.live.gzone.tab.accompanyplay.LiveGzoneAccompanyPlayTogetherFragment$d;
import y8c.g;
import com.kwai.live.gzone.tab.accompanyplay.LiveGzoneAccompanyPlayTogetherFragment;
import y43.a;
import java.lang.String;
import fq5.b;
import java.lang.Object;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import i2b.a;
import com.kwai.live.gzone.tab.accompanyplay.LiveGzoneAccompanyPlayTogetherFragment$c;
import ml8.c;

public class LiveGzoneAccompanyPlayTogetherFragment$d extends g	// class@000dfd
{
    public final LiveGzoneAccompanyPlayTogetherFragment w;

    public void LiveGzoneAccompanyPlayTogetherFragment$d(LiveGzoneAccompanyPlayTogetherFragment p0,a p1){
       this.w = p0;
       super();
       this.n1("ANCHOR_ID", p1.m.d());
       this.n1("ANCHOR_ID", p1.m.d());
       this.n1("LIVE_BASIC_CONTEXT", p1.m);
       a y = p1.Y;
       if (y != null) {
          this.n1("LIVE_GZONE_AUDIENCE_ACCOMPANY_SERVICE", y);
       }
       y = p1.Z;
       if (y != null) {
          this.n1("LIVE_GZONE_ANCHOR_ACCOMPANY_SERVICE", y);
       }
       return;
    }
    public f h1(ViewGroup p0,int p1){
       LiveGzoneAccompanyPlayTogetherFragment$d uod = LiveGzoneAccompanyPlayTogetherFragment$d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uod, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.i(p0, 0x7f0d0b66), new LiveGzoneAccompanyPlayTogetherFragment$c());
    }
}
