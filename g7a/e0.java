package g7a.e0;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.d;
import java.lang.Object;
import d0a.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kwai.component.tabs.panel.TabsPanelConfig$Style;
import com.kwai.component.tabs.panel.a;
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

public final class e0 implements g	// class@0023d4
{
    public final d b;

    public void e0(d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e0 tb = this.b;
       tb.R8();
       if (PatchProxy.applyVoidOneRefs(p0, tb, d.class, "12")) {
       }else if(!tb.x.isAtlasPhotos() && !tb.x.isLongPhotos()){
          p0 = p0.a;
          if (p0 == 2) {
             p0 = "CROSS";
          }else if(p0 == true){
             p0 = "PHOTO_PLAY";
          }else {
             p0 = "PULL_DOWN";
          }
          if (!TextUtils.x(p0)) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "QUIT_COMMENTS_AREA";
             i3 oi3 = i3.f();
             d x = tb.X;
             String str = "";
             String str1 = (x != null && x.a() == TabsPanelConfig$Style.STYLE2)? "SEARCH_SUMMARY": str;
             oi3.d("sub_BizType", str1);
             oi3.d("quit_type", p0);
             if (tb.x.isAtlasPhotos() || tb.x.isLongPhotos()) {
                str = "ALBUM_VIEW";
             }
             oi3.d("caption_type", str);
             uElementPack.params = oi3.toString();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = w1.f(tb.x.getEntity());
             u1.M("2481440", f0.a(tb.M, tb.getActivity()), 1, uElementPack, uContentPack, null);
          }
       }
       return;
    }
}
