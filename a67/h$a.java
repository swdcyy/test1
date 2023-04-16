package a67.h$a;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$b;
import a67.h;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import a67.h$b;
import y43.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import a67.c;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ScreenPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$MoreInfoPackage;
import java.lang.StringBuilder;
import com.yxcorp.utility.TextUtils;
import k2b.u1;
import gq5.f;
import com.kwai.library.widget.popup.common.c;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.activity.GifshowActivity;
import lnc.a1;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import f37.o0;
import android.util.Pair;
import v37.a;
import ft5.b;

public class h$a implements BaseEditorFragment$b	// class@000059
{
    public final h a;

    public void h$a(h p0){
       this.a = p0;
       super();
    }
    public void a(int p0,String p1){
       h$a uoa = h$a.class;
       String str = "2";
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, str)) {
          return;
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.a.p.G.m.a();
       c uoc = c.class;
       int i = 1;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,liveStreamPa,Integer.valueOf(i),Boolean.TRUE};
          if (PatchProxy.applyVoid(objArray, null, uoc, str)) {
          label_00a0 :
             this.a.p.G.V0.p();
             this.a.o();
             if (!QCurrentUser.me().isLogined()) {
                h$b k = this.a.p.K;
                o0.j(k, k.getUrl(), "live_gzone_hot_words", 159, a1.p(R.string.arg_RES_7f103076), null, null, null, null);
                return;
             }else {
                Pair pair = this.a.p.G.j.c();
                if (pair != null) {
                   this.a.p.G.R.Eh(p1, pair.first, pair.second.intValue());
                }else {
                   this.a.p.G.R.U2(p1);
                }
                return;
             }
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "HOT_COMMENT";
       i3 oi3 = i3.f();
       oi3.c("shortcut_comment_type", Integer.valueOf(i));
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = liveStreamPa;
       uContentPack.screenPackage = c.a(i);
       ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
       ClientContentWrapper$MoreInfoPackage moreInfoPack = new ClientContentWrapper$MoreInfoPackage();
       uContentWrap.moreInfoPackage = moreInfoPack;
       String str1 = "";
       moreInfoPack.index = p0+str1;
       uContentWrap.moreInfoPackage.text = TextUtils.I(p1);
       u1.H(str1, i, uElementPack, uContentPack, uContentWrap);
       goto label_00a0 ;
    }
    public void b(int p0,String p1){
       h$a uoa = h$a.class;
       String str = "1";
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, str)) {
          return;
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.a.p.G.m.a();
       c uoc = c.class;
       int i = 1;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,liveStreamPa,Integer.valueOf(i),Boolean.TRUE};
          if (PatchProxy.applyVoid(objArray, null, uoc, str)) {
          label_009e :
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "HOT_COMMENT";
       i3 oi3 = i3.f();
       oi3.c("shortcut_comment_type", Integer.valueOf(i));
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = liveStreamPa;
       uContentPack.screenPackage = c.a(i);
       ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
       ClientContentWrapper$MoreInfoPackage moreInfoPack = new ClientContentWrapper$MoreInfoPackage();
       uContentWrap.moreInfoPackage = moreInfoPack;
       moreInfoPack.index = p0+"";
       p0.text = p1;
       u1.v0(9, uElementPack, uContentPack, uContentWrap);
       goto label_009e ;
    }
}
