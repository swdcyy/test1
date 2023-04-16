package gs2.h$a;
import com.kuaishou.live.core.voiceparty.music.util.LiveVoicePartyKtvMusicDownloadHelper$d;
import brd.v;
import java.lang.Object;
import com.kuaishou.android.model.music.Music;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import brd.g;
import java.util.concurrent.CancellationException;
import java.lang.Throwable;
import java.lang.Integer;

public final class h$a implements LiveVoicePartyKtvMusicDownloadHelper$d	// class@002b96
{
    public final v b;

    public void h$a(v p0){
       this.b = p0;
       super();
    }
    public void A1(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$a.class, "5")) {
          return;
       }
       a.p(p0, "music");
       b.P(LiveVoicePartyLogTag.KTV.appendTag("VoicePartyKtvAudienceOrderGuideController"), "DownloadHelper.Listener -- onCompleted");
       this.b.onNext(p0);
       return;
    }
    public void F0(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$a.class, "4")) {
          return;
       }
       a.p(p0, "music");
       b.P(LiveVoicePartyLogTag.KTV.appendTag("VoicePartyKtvAudienceOrderGuideController"), "DownloadHelper.Listener -- onCancelled");
       this.b.onError(new CancellationException());
       return;
    }
    public void P0(Music p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h$a.class, "3")) {
          return;
       }
       a.p(p0, "music");
       a.p(p1, "e");
       b.P(LiveVoicePartyLogTag.KTV.appendTag("VoicePartyKtvAudienceOrderGuideController"), "DownloadHelper.Listener -- onFailed");
       this.b.onError(p1);
       return;
    }
    public void o2(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$a.class, "1")) {
          return;
       }
       a.p(p0, "music");
       b.P(LiveVoicePartyLogTag.KTV.appendTag("VoicePartyKtvAudienceOrderGuideController"), "DownloadHelper.Listener -- onCreate");
       return;
    }
    public void s1(Music p0,int p1,int p2){
       if (PatchProxy.isSupport(h$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, h$a.class, "2")) {
          return;
       }
       a.p(p0, "music");
       b.P(LiveVoicePartyLogTag.KTV.appendTag("VoicePartyKtvAudienceOrderGuideController"), "DownloadHelper.Listener -- onProgress");
       return;
    }
}
