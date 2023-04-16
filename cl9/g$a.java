package cl9.g$a;
import com.yxcorp.gifshow.widget.m;
import cl9.g;
import com.kwai.framework.model.user.User;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import k2b.f0;
import java.util.Objects;
import yk9.d;
import com.kuaishou.android.model.mix.QComment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import uh5.e;
import com.yxcorp.gifshow.log.model.CommonParams;
import k2b.u1;
import k2b.k2;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.google.gson.JsonObject;
import java.lang.Integer;
import java.lang.Number;
import java.lang.Long;
import com.google.common.collect.ImmutableMap$b;
import com.google.common.collect.ImmutableMap;
import zk.g;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import cl9.f;
import java.util.HashMap;
import erd.g;
import com.yxcorp.gifshow.comment.utils.d;

public class g$a extends m	// class@000621
{
    public final User c;
    public final g d;

    public void g$a(g p0,boolean p1,long p2,User p3){
       this.d = p0;
       this.c = p3;
       super(p1, p2);
    }
    public void a(View p0){
       g$a td;
       g r;
       g q;
       e0 uoe0;
       ClientContent$ContentPackage uContentPack;
       ClientEvent$ElementPackage uElementPack;
       CommonParams uCommonParam;
       k2 d;
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "1")) {
          return;
       }
       int i = 1;
       String str = 3;
       boolean b = false;
       if ((this.d.p.getUserId()).equals(this.c.getId())) {
          td = this.d;
          r = td.r;
          q = td.q;
          uoe0 = f0.a(td.s, td.getActivity());
          Objects.requireNonNull(r);
          if (PatchProxy.applyVoidThreeRefs(q, p0, uoe0, r, d.class, "35") || (r.a != null && q != null)) {
             uContentPack = r.c(q, q.mReplyToCommentId, b);
             uContentPack.photoPackage = r.i();
             uElementPack = r.h(q, str, "author_head", 810);
             uElementPack.index = 2;
             ClickMetaData uClickMetaDa = new ClickMetaData().setLogPage(uoe0).setType(i).setDirection(810).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(r.a.getFeedLogCtx());
             if (e.f()) {
                uClickMetaDa.setCommonParams(r.m(uContentPack, "CLICK_HEAD"));
             }
             u1.B(uClickMetaDa);
          }
       }else {
          td = this.d;
          r = td.r;
          q = td.q;
          uoe0 = f0.a(td.s, td.getActivity());
          Objects.requireNonNull(r);
          if (!PatchProxy.applyVoidThreeRefs(q, p0, uoe0, r, d.class, "32") && r.a != null) {
             QComment mReplyToComm = (q != null)? q.mReplyToCommentId: null;
             uContentPack = r.c(q, mReplyToComm, b);
             uContentPack.photoPackage = r.i();
             uElementPack = r.h(q, str, "audience_head", 510);
             String str1 = "CLICK_AUDIENCE_HEAD";
             if (e.f()) {
                uCommonParam = r.m(uContentPack, str1);
             }else if(u1.j() != null && !TextUtils.x(u1.j().d)){
                d = u1.j().d;
             }else {
                d = "";
             }
             JsonObject jsonObject = new JsonObject();
             jsonObject.a0("type", Integer.valueOf(uContentPack.photoPackage.type));
             jsonObject.c0("identity", uContentPack.photoPackage.identity);
             jsonObject.c0("exp_tag", uContentPack.photoPackage.expTag);
             jsonObject.a0("index", Long.valueOf(uContentPack.photoPackage.index));
             jsonObject.c0("llsid", uContentPack.photoPackage.llsid);
             jsonObject.c0("s_author_id", uContentPack.photoPackage.sAuthorId);
             CommonParams uCommonParam1 = new CommonParams();
             uCommonParam1.mEntryTag = ImmutableMap.builder().c("element_action", new g(str1)).c("page_name", new g(d)).c("params", jsonObject).a();
             uCommonParam = uCommonParam1;
             u1.B(new ClickMetaData().setLogPage(uoe0).setType(i).setElementPackage(uElementPack).setContentPackage(uContentPack).setCommonParams(uCommonParam).setFeedLogCtx(r.a.getFeedLogCtx()));
          }
       }
    label_019b :
       f b1 = f.b;
       HashMap hashMap = new HashMap();
       hashMap.put("clickType", Integer.valueOf(49));
       Activity activity = this.d.getActivity();
       g$a td1 = this.d;
       g p = td1.p;
       g q1 = td1.q;
       User user = q1.getUser();
       f uof = (k.B(this.d.p) != null)? b1: null;
       d.i(activity, p, q1, user, uof, hashMap, this.d.u);
       return;
    }
}
