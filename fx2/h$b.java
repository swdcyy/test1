package fx2.h$b;
import g9c.a;
import fx2.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import fx2.h$c;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterPhotoWithEpisode;
import java.util.Objects;
import vsd.n;
import rsd.e;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterEpisodePhoto;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import d61.c0;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterPhotoWithEpisode$VoicePartyTheaterEpisodeInfo;
import java.lang.CharSequence;
import fx2.i;
import android.view.View$OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import i2b.a;

public final class h$b extends a	// class@002a04
{
    public a0 g;
    public final h h;

    public void h$b(h p0){
       this.h = p0;
       super();
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, h$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 6;
       if (super.getItemCount() <= i) {
          i = super.getItemCount();
       }
       return i;
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       h$b uob = h$b.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       h$c uoc = h$c.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "3")) {
          a.p(p0, "holder");
          Object obj = this.N0(p1);
          a.m(obj);
          a.o(obj, "getItem\(position\)!!");
          Objects.requireNonNull(p0);
          Object[] objArray = null;
          KwaiImageView kwaiImageVie = PatchProxy.apply(objArray, p0, uoc, "1");
          int i = 0;
          if (kwaiImageVie == patchProxyRe) {
             kwaiImageVie = p0.a.a(p0, h$c.f[i]);
          }
          kwaiImageVie.P(obj.mVoicePartyTheaterEpisodePhoto.mEpisodeCoverThumbnailUrls);
          kwaiImageVie = PatchProxy.apply(objArray, p0, uoc, "4");
          if (kwaiImageVie == patchProxyRe) {
             kwaiImageVie = p0.d.a(p0, h$c.f[3]);
          }
          kwaiImageVie.L(c0.a.b("udata/pkg/kwai-client-image/chat_room/voice_party_theater_tube_more_episode_icon.webp"));
          if (p1 == 5 && this.h.W8()) {
             p0.a().setVisibility(i);
          }else {
             p0.a().setVisibility(8);
          }
          Object obj1 = PatchProxy.apply(objArray, p0, uoc, "2");
          if (obj1 != patchProxyRe) {
          }else {
             obj1 = p0.b.a(p0, h$c.f[1]);
          }
          VoicePartyTheaterPhotoWithEpisode mVoicePartyT = obj.mVoicePartyTheaterEpisodeInfo;
          if (mVoicePartyT != null) {
             objArray = mVoicePartyT.mEpisodeName;
          }
          obj1.setText(objArray);
          p0.itemView.setOnClickListener(new i(this, obj, p1));
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       h$c uoc;
       h$b uob = h$b.class;
       if (PatchProxy.isSupport(uob)) {
          uoc = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "1");
          if (uoc != PatchProxyResult.class) {
          label_0031 :
             return uoc;
          }
       }
       a.p(p0, "parent");
       View view = a.i(p0, R.layout.arg_RES_7f0d16f1);
       a.o(view, "itemView");
       uoc = new h$c(this.h, view);
       goto label_0031 ;
    }
}
