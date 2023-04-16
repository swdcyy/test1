package com.yxcorp.gifshow.relation.explore.presenter.n$c;
import erd.g;
import com.yxcorp.gifshow.relation.explore.presenter.n;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import g9c.a;
import com.kwai.framework.model.user.RecoUser;
import y6c.i;
import com.yxcorp.gifshow.relation.feed.presenter.FeedBigCardStatePresenter;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import f7c.c;

public class n$c implements g	// class@001859
{
    public final n b;

    public void n$c(n p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n$c.class, "1")) {
       }else {
          RecoUser recoUser = this.b.Z0.N0(0);
          int i = 1;
          if (i == p0.intValue()) {
             this.b.t9(i);
          }else if(3 == p0.intValue()){
             if (recoUser != null && recoUser.mUser != null) {
                new i(this.b.z.getActivity(), this.b.m8(), recoUser, this.b.x).b();
             }
          }else if(4 == p0.intValue()){
             if (recoUser != null && recoUser.mUser != null) {
                this.b.u9(recoUser);
             }
          }else if(7 == p0.intValue()){
             this.b.x9();
          }
       }
       return;
    }
}
