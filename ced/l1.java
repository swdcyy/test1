package ced.l1;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.plugin.search.result.hashtag.presenters.e0;
import com.kwai.framework.model.user.User;
import java.lang.String;
import com.yxcorp.plugin.search.result.hashtag.entity.StrongRelatedUser;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.search.result.hashtag.presenters.a;
import com.yxcorp.plugin.search.result.hashtag.entity.TagInfo;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import zdd.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import k2b.e0;
import gbd.t;
import ded.k;
import java.lang.Boolean;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.activity.GifshowActivity;
import tkd.b;
import tkd.d;
import vu5.b;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;

public class l1 extends m	// class@000566
{
    public final User c;
    public final String d;
    public final StrongRelatedUser e;
    public final e0 f;

    public void l1(e0 p0,User p1,String p2,StrongRelatedUser p3){
       this.f = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l1.class, "1")) {
          return;
       }
       if (this.f.getActivity() == null) {
          return;
       }
       l1 tf = this.f;
       int i = 1;
       t.l(i, tf.t, a.b(this.c.mId, "USER", this.d, tf.K, "HEAD_LINK_USER_SUBCARD"), a.d());
       if (this.e.mProfileTabId != 4) {
          i = false;
       }
       tf = this.c;
       if (!PatchProxy.isSupport(k.class) || !PatchProxy.applyVoidThreeRefs(p0, tf, Boolean.valueOf(i), null, k.class, "2")) {
          d.a(-1718536792).Nl(n.d(p0), ProfileStartParam.l(tf).v(i), 1026);
       }
       return;
    }
}
