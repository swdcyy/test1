package com.kuaishou.live.core.voiceparty.theater.tube.list.a;
import nqb.a;
import com.kuaishou.live.core.voiceparty.theater.tube.list.a$b;
import nsd.u;
import dx2.p;
import com.kuaishou.live.core.voiceparty.theater.tube.list.a$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import g9c.a;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterTubeFeedWithEpisodes;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterTubeInfo;
import android.view.ViewGroup;
import y8c.f;
import android.view.View;
import i2b.a;
import fx2.h;
import ml8.c;
import com.kuaishou.live.core.voiceparty.theater.tube.list.b;

public final class a extends a	// class@001a2d
{
    public final p w;
    public final a$a x;
    public static final a$b y;

    static {
       a.y = new a$b(null);
    }
    public void a(p p0,a$a p1){
       a.p(p0, "mContext");
       a.p(p1, "mCallback");
       super();
       this.w = p0;
       this.x = p1;
    }
    public int f0(int p0){
       VoicePartyTheaterTubeInfo mTubeType;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       VoicePartyTheaterTubeFeedWithEpisodes voicePartyTh = this.N0(p0);
       int i = 1;
       if (voicePartyTh != null) {
          voicePartyTh = voicePartyTh.mTube;
          if (voicePartyTh != null) {
             mTubeType = voicePartyTh.mTubeType;
          label_002e :
             if (mTubeType == i) {
                i = 0;
             }
             return i;
          }
       }
       mTubeType = 1;
       goto label_002e ;
    }
    public f h1(ViewGroup p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       f uof = (!p1)? new f(a.i(p0, 0x7f0d16f2), new h(this.w, this.x)): new f(a.i(p0, 0x7f0d16f4), new b(this.w, this.x));
       return uof;
    }
}
