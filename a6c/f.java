package a6c.f;
import r5c.b;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import com.kwai.framework.model.user.User;
import k2b.f3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import lnc.i3;
import java.lang.Number;
import com.yxcorp.gifshow.follow.state.UserFollowState;
import xja.b;
import java.lang.Integer;
import k2b.e0;

public class f extends b	// class@00008b
{

    public void f(){
       super();
    }
    public void P8(List p0,QPhoto p1){
       ClientContent$UserPackage obj;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "1")) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          User user = iterator.next();
          f3 uof3 = f3.l("1560449", "VIEW_USER_CARD");
          ClientContent$ContentPackage uContentPack = PatchProxy.applyTwoRefs(p1, user, null, f.class, "3");
          int i = 1;
          if (uContentPack != PatchProxyResult.class) {
          }else {
             uContentPack = new ClientContent$ContentPackage();
             obj = new ClientContent$UserPackage();
             obj.identity = user.getId();
             int i1 = user.mPosition + i;
             obj.index = i1;
             uContentPack.userPackage = obj;
             uContentPack.photoPackage = w1.f(p1.mEntity);
          }
          uof3.b(uContentPack);
          uof3.f(p1.getFeedLogCtx());
          i3 oi3 = i3.f();
          obj = PatchProxy.applyOneRefs(user, this, f.class, "2");
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else {
             boolean b = false;
             if (b.a(user, b) != UserFollowState.FOLLOWED_EACH_OTHER) {
                i = (b.a(user, b) == UserFollowState.FOLLOW_FAN)? 2: 0;
             }
          }
          oi3.c("relationship", Integer.valueOf(i));
          uof3.m(oi3.e());
          uof3.h(this.p);
       }
       return;
    }
}
