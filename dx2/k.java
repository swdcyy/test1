package dx2.k;
import gx2.c;
import dx2.l;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import dx2.a;
import com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterPanelFragment;
import dx2.h;
import com.kwai.framework.model.user.User;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterPlayListResponse$VoicePartyTheaterPlayOrderItem;
import java.util.List;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyTheaterCommonConfig$TheaterTab;

public class k implements c	// class@0025d6
{
    public final int a;
    public final l b;

    public void k(l p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "3")) {
          return;
       }
       a uoa = new a();
       uoa.e = "play_list";
       this.b.d.C.a(p0, uoa);
       return;
    }
    public void b(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "2")) {
          return;
       }
       a uoa = new a();
       uoa.e = "play_list";
       this.b.d.C.e(p0, uoa);
       return;
    }
    public void d(VoicePartyTheaterPlayListResponse$VoicePartyTheaterPlayOrderItem p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k.class, "1")) {
          return;
       }
       p1.f = VoicePartyTheaterPanelFragment.Qh().get(this.a).mTabName;
       p1.e = "play_list";
       this.b.d.C.d(p0, p1);
       return;
    }
}
