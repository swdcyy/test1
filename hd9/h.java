package hd9.h;
import om6.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import nm6.d;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.PhotoMeta;
import tl8.d;
import com.kuaishou.android.model.mix.FollowShootModel;
import lnc.s6;
import android.os.Bundle;
import com.yxcorp.gifshow.camera.record.followshoot.FollowShootActivity;
import hd9.b;
import r8c.g;
import r8c.h;

public class h implements e	// class@002613
{

    public void h(){
       super();
    }
    public boolean Hn(){
       Object obj = PatchProxy.apply(null, this, h.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return PostExperimentUtils.g1();
    }
    public void Qh(GifshowActivity p0,QPhoto p1,d p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, h.class, "3")) {
          return;
       }
       BaseFeed entity = p1.getEntity();
       PhotoMeta mFollowShoot = (entity != null)? entity.a(PhotoMeta.class).mFollowShootModel: null;
       if (mFollowShoot != null && mFollowShoot.mIsLipsSyncPhoto != null) {
          p2.o(true);
       }
       this.uI(p0, p1, p2);
       return;
    }
    public boolean isAvailable(){
       return true;
    }
    public void uI(GifshowActivity p0,QPhoto p1,d p2){
       boolean b1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, h.class, "1")) {
          return;
       }
       if (s6.H()) {
          Object obj = PatchProxy.applyOneRefs(p2, this, h.class, "2");
          boolean b = true;
          if (obj != PatchProxyResult.class) {
             b1 = obj.booleanValue();
          }else if(p2 != null && (p2.d() != null && ("slip").equals(p2.d().getString("uimode")))){
             b1 = true;
          }else {
             b1 = false;
          }
          if (!b1) {
             p2.r(b);
          }
       }
       if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, FollowShootActivity.class, "10")) {
          h.b(p0, p1, p2, new b(p2));
       }
       return;
    }
}
