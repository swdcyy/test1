package b8a.l;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.e;
import java.lang.Object;
import d0a.f;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
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

public final class l implements g	// class@0003c6
{
    public final e b;

    public void l(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       l tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, e.class, "15")) {
       }else {
          p0 = p0.a;
          if (p0 == 2) {
             p0 = "CROSS";
          }else if(p0 == true){
             p0 = "PHOTO_PLAY";
          }else {
             p0 = null;
          }
          if (!TextUtils.x(p0)) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "QUIT_COMMENTS_AREA";
             i3 oi3 = i3.f();
             oi3.d("quit_type", p0);
             String str = "";
             p0 = (tb.x.get().get().a() == TabsPanelConfig$Style.STYLE2)? "SEARCH_SUMMARY": str;
             oi3.d("sub_BizType", p0);
             if (tb.v.isAtlasPhotos() || tb.v.isLongPhotos()) {
                str = "ALBUM_VIEW";
             }
             oi3.d("caption_type", str);
             uElementPack.params = oi3.toString();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = w1.f(tb.v.getEntity());
             u1.M("2481440", f0.a(tb.w, tb.getActivity()), 1, uElementPack, uContentPack, null);
          }
       }
       return;
    }
}
