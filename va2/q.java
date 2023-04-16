package va2.q;
import k51.c;
import va2.q$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyCommonConfig;
import java.lang.reflect.Type;
import wg3.a;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import qvb.q;
import qvb.j;
import g9c.d;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.a1;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyCommonConfig$LiveSquareEntrance;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.g;
import wkd.b;
import nf6.i;
import android.net.Uri;
import ekd.x0;
import android.content.Context;
import android.content.Intent;
import lo2.d;

public class q extends c	// class@004782
{
    public LiveVoicePartySquareEntranceView p;
    public List q;
    public boolean r;
    public RecyclerFragment s;
    public d t;
    public final q u;
    public static String sLivePresenterClassName = "LiveVoicePartySquareEntrancePresenter";

    public void q(){
       super();
       this.u = new q$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, q.class, "2")) {
          return;
       }
       LiveVoicePartyCommonConfig liveVoicePar = a.M(LiveVoicePartyCommonConfig.class);
       if (liveVoicePar != null && !q.f(liveVoicePar.mSquareEntranceList)) {
          this.q = new ArrayList(liveVoicePar.mSquareEntranceList);
          this.s.q().h(this.u);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, q.class, "3")) {
          return;
       }
       if (this.p != null) {
          this.s.ia().m1(this.p);
       }
       this.s.q().f(this.u);
       this.r = false;
       return;
    }
    public int P8(){
       Object obj = PatchProxy.apply(null, this, q.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.a(0x7f060774);
    }
    public void R8(LiveVoicePartyCommonConfig$LiveSquareEntrance p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "6")) {
          return;
       }
       if (g.h(this.getActivity())) {
          return;
       }
       this.getActivity().startActivity(b.a(0x66dce92a).a(this.getActivity(), x0.f(p0.mTabJumpScheme)));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, q.class, "1")) {
          return;
       }
       this.s = this.r8("FRAGMENT");
       this.t = this.s8(d.class);
       return;
    }
}
