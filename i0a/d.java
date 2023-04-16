package i0a.d;
import java.lang.Object;
import k2b.e0;
import com.yxcorp.gifshow.entity.QPhoto;
import p1a.a$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import je5.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import java.lang.CharSequence;
import java.lang.Long;
import tl8.g;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import k2b.l0;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import k2b.u1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import com.yxcorp.gifshow.log.model.CommonParams;
import android.view.View;
import java.util.Collection;
import ekd.q;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchUserPackage;
import java.util.List;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import i0a.c;
import java.lang.Runnable;

public final class d	// class@002748
{

    public void d(){
       super();
    }
    public static void a(e0 p0,QPhoto p1,a$a p2){
       a$a b;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, d.class, "1")) {
          return;
       }
       String str = b.a(p1);
       a$a u = p2.u;
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.type = 1;
       uElementPack.action = p2.b;
       uElementPack.status = p2.g;
       uElementPack.name = TextUtils.k(p2.c);
       uElementPack.action2 = TextUtils.k(p2.e);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(p1.mEntity);
       uElementPack.index = p2.d;
       uElementPack.params = (TextUtils.x(p2.p))? TextUtils.k(str): TextUtils.k(p2.p);
       b = p2.b;
       if (b != 306) {
          if (b != 810) {
             if (b == 0x75d7 && !TextUtils.x(p2.m)) {
                b.authorId = Long.valueOf(p2.m).longValue();
             }
          }else {
             uElementPack.index = 1;
          }
       }else {
          b = p2.a;
          if (1 == b) {
             uElementPack.index = 1;
          }else if(2 == b){
             uElementPack.index = 2;
          }
          b.fullScreenDisplay = false;
       }
       b = p2.k;
       if (b != null) {
          uContentPack.photoSeekBarDragPackage = b;
       }
       b = p2.n;
       if (b != null) {
          b.apply(uContentPack);
       }
       if (!TextUtils.x(p2.q)) {
          uContentPack.ksOrderInfoPackage = l0.a(p2.q);
       }
       if (p2.t != null) {
          u1.B(new ClickMetaData().setLogPage(p0).setType(p2.a).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(p2.w));
          return;
       }else {
          u1.B(new ClickMetaData().setType(p2.a).setDirection(p2.h).setElementPackage(uElementPack).setContentPackage(uContentPack).setAreaPackage(u).setIsRealTime(false).setCommonParams(p2.e()).setFeedLogCtx(p2.w));
          return;
       }
    }
    public static void b(e0 p0,View p1,QPhoto p2,a$a p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, d.class, "2")) {
          return;
       }
       a$a u = p3.u;
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.name = p3.c;
       uElementPack.action2 = TextUtils.k(p3.e);
       uElementPack.type = 2;
       int i = 0;
       uElementPack.status = i;
       uElementPack.action = p3.b;
       uElementPack.index = p3.d;
       uElementPack.value = p3.f;
       uElementPack.params = TextUtils.k(p3.p);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(p2.mEntity);
       a$a n = p3.n;
       if (n != null) {
          n.apply(uContentPack);
       }
       if (!q.f(p3.i)) {
          ClientContent$BatchUserPackage uBatchUserPa = new ClientContent$BatchUserPackage();
          ClientContent$UserPackage[] userPackageA = new ClientContent$UserPackage[p3.i.size()];
          while (i < p3.i.size()) {
             User user = p3.i.get(i);
             if (user != null) {
                ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
                userPackage.identity = user.mId;
                userPackageA[i] = userPackage;
             }
             i = i + 1;
          }
          uBatchUserPa.userPackage = userPackageA;
          uContentPack.batchUserPackage = uBatchUserPa;
       }
       if (!TextUtils.x(p3.q)) {
          uContentPack.ksOrderInfoPackage = l0.a(p3.q);
       }
       ShowMetaData showMetaData = new ShowMetaData().setType(3).setContentPackage(p3.d(uContentPack)).setElementPackage(uElementPack).setAreaPackage(u).setFeedLogCtx(p2.getFeedLogCtx());
       if (p3.t != null) {
          showMetaData.setLogPage(p0);
       }
       p1.post(new c(showMetaData));
       return;
    }
}
