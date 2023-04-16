package d82.b;
import android.view.View$OnClickListener;
import d82.f;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import jg1.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class b implements View$OnClickListener	// class@00248a
{
    public final f b;

    public void b(f p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, f.class, "3")) {
       }else {
          tb.a();
          BaseFragment uBaseFragmen = tb.e.Z2.b();
          ClientContent$LiveStreamPackage liveStreamPa = tb.e.Z2.a();
          if (!PatchProxy.applyVoidTwoRefs(uBaseFragmen, liveStreamPa, null, b.class, "17")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "TRUSTEESHIP_BUTTON_SUBCARD";
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             u1.M("2447360", uBaseFragmen, 1, uElementPack, uContentPack, null);
          }
       }
       return;
    }
}
