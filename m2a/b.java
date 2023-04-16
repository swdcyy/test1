package m2a.b;
import mf5.w0;
import android.app.Activity;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import az6.a;
import com.yxcorp.gifshow.entity.QPhoto;
import m9a.e;
import id5.o;
import kf5.g;
import lnc.ja;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.component.photo.reduce.d;
import com.kwai.component.photo.reduce.g;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.yxcorp.utility.TextUtils;
import java.lang.Long;
import bz9.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public class b extends w0	// class@002f01
{
    public final Activity C;
    public BaseFragment D;
    public final PhotoDetailParam E;
    public final QPhoto F;

    public void b(Activity p0,BaseFragment p1,PhotoDetailParam p2){
       super("dislike");
       this.D = p1;
       this.C = p0;
       this.E = p2;
       this.F = p2.mPhoto;
       this.L(R.drawable.arg_RES_7f080b16);
       this.T(R.string.arg_RES_7f100a75);
    }
    public boolean E(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = (e.a(this.E.mSource, this.F) && !o.d(this.F))? true: false;
       return b;
    }
    public void d(w0 p0,g p1){
       b uob = b.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uob, "2")) {
          return;
       }
       ja.a();
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, uob, "4") && this.C instanceof GifshowActivity) {
          d uod = new d(this.E.getPhoto(), this.C);
          if (g.f(this.E.mSource)) {
             uod.i(this.E.mSource, "PLAYER_PANEL_SHARE");
          }else {
             uod.b(this.E.mSource, objArray, "PLAYER_PANEL_SHARE");
          }
          d.h("PLAYER_PANEL_SHARE", this.F);
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "3")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.type = 18;
          uElementPack.action2 = "NO_INTEREST_BTN_IN_LONG_PRESS_MASK";
          i3 oi3 = i3.f();
          oi3.d("source", "PLAYER_PANEL_SHARE");
          uElementPack.params = oi3.e();
          ClientContent$PhotoPackage photoPackage = w1.f(this.F.mEntity);
          photoPackage.identity = TextUtils.k(this.F.getPhotoId());
          photoPackage.authorId = Long.valueOf(this.F.getUserId()).longValue();
          photoPackage.type = (c.a.a(this.F))? 5: 1;
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = photoPackage;
          u1.M("", this.D, 1, uElementPack, uContentPack, null);
       }
       p1.a();
       return;
    }
}
