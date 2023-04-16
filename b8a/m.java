package b8a.m;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.slidev2.presenter.e$a;
import java.lang.Object;
import java.util.Objects;
import com.yxcorp.gifshow.detail.slidev2.presenter.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im8.f;
import z1.k;
import com.kwai.component.tabs.panel.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kwai.component.tabs.panel.TabsPanelConfig$Style;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import k2b.f0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class m implements Runnable	// class@0003ca
{
    public final e$a b;

    public void m(e$a p0){
       this.b = p0;
    }
    public final void run(){
       e$a b = this.b.b;
       Objects.requireNonNull(b);
       if (PatchProxy.applyVoid(null, b, e.class, "14")) {
       }else {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "COMMENTS_AREA";
          i3 oi3 = i3.f();
          String str = "";
          String str1 = (b.x.get().get().a() == TabsPanelConfig$Style.STYLE2)? "SEARCH_SUMMARY": str;
          oi3.d("sub_BizType", str1);
          if (b.v.isAtlasPhotos() || b.v.isLongPhotos()) {
             str = "ALBUM_VIEW";
          }
          oi3.d("caption_type", str);
          uElementPack.params = oi3.toString();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = w1.f(b.v.getEntity());
          u1.D0("2481440", f0.a(b.w, b.getActivity()), 3, uElementPack, uContentPack, null);
       }
       return;
    }
}
