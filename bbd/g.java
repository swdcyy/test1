package bbd.g;
import fed.l;
import nfd.a0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.yxcorp.plugin.search.entity.kbox.KBoxItem;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateUserFeed;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.framework.model.user.User;
import nfd.p;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.smile.gifmaker.mvps.utils.DefaultSyncable;
import java.lang.Boolean;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateBaseFeed;
import nfd.q1;

public class g extends l	// class@0003d8
{

    public void g(a0 p0){
       super(p0);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       SearchItem mKBoxItem = this.q.mKBoxItem;
       if (mKBoxItem != null && mKBoxItem.mType == 4) {
          TemplateUserFeed mUser = mKBoxItem.mBaseFeed.mUser;
          this.p = mUser;
          if (p.c(mUser, this.getContext())) {
             return;
          }else {
             this.p.startSyncWithFragment(this.r.m());
          }
       }
       super.E8();
       return;
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
          return;
       }
       this.a9(true);
       super.V8();
       return;
    }
    public void Z8(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       this.a9(false);
       super.Z8();
       return;
    }
    public void a9(boolean p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og, "4")) {
          return;
       }
       String str = (p0)? "BASE_USER_FOLLOW_SUBCARD": "BASE_USER_UNFOLLOW_SUBCARD";
       l tq = this.q;
       q1.v(1, this.r, tq, tq.mKBoxItem.mBaseFeed, str);
       return;
    }
}
