package ch2.h;
import com.kuaishou.live.core.show.redpacket.krn.f$c;
import com.kuaishou.live.core.show.redpacket.krn.j;
import com.kuaishou.livestream.message.nano.LiveKrnRedPackMessage$LiveKrnRedPack;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import k2b.e0;
import tw1.d;
import uw1.m;

public final class h implements f$c	// class@000539
{
    public final j a;
    public final LiveKrnRedPackMessage$LiveKrnRedPack b;

    public void h(j p0,LiveKrnRedPackMessage$LiveKrnRedPack p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(String p0){
       h ta = this.a;
       h tb = this.b;
       d.e(null, ta.v.b(), ta.v.a(), ta.v.y(), tb.redPackId, 0, tb.grabTime, 17);
       j y = ta.y;
       if (y != null) {
          y.j(p0, null);
       }
       return;
    }
}
