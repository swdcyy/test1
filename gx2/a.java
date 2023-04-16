package gx2.a;
import y8c.g;
import dx2.p;
import gx2.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import g9c.a;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterPlayListResponse$VoicePartyTheaterPlayOrderItem;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterPhotoWithEpisode;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterPhotoWithEpisode$VoicePartyTheaterEpisodeInfo;
import android.view.ViewGroup;
import y8c.f;
import android.view.View;
import i2b.a;
import gx2.f;
import ml8.c;
import gx2.g;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.util.List;

public class a extends g	// class@002bb0
{
    public final p w;
    public final c x;

    public void a(p p0,c p1){
       super();
       this.w = p0;
       this.x = p1;
    }
    public int f0(int p0){
       VoicePartyTheaterPhotoWithEpisode$VoicePartyTheaterEpisodeInfo mType;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       VoicePartyTheaterPlayListResponse$VoicePartyTheaterPlayOrderItem voicePartyTh = this.N0(p0);
       voicePartyTh = (voicePartyTh == null)? 1: voicePartyTh.mVoicePartyTheaterPhotoWithEpisode.mVoicePartyTheaterEpisodeInfo.mType;
       return voicePartyTh;
    }
    public f h1(ViewGroup p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       View view = a.i(p0, R.layout.arg_RES_7f0d16ee);
       if (p1 == 1) {
          return new f(view, new f(this.w, this.x));
       }else {
          return new f(view, new g(this.w, this.x));
       }
    }
    public void x0(RecyclerView$ViewHolder p0,int p1,List p2){
       this.g1(p0, p1, p2);
    }
}
