package com.yxcorp.gifshow.reminder.friend.kcube.container.presenter.FriendTabContainerActionSearchPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import wq6.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.reminder.friend.kcube.container.presenter.FriendTabContainerActionSearchPresenter$mSearchActionCallback$1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import com.kwai.feature.component.entry.view.SearchIconEntryView;
import android.view.View;
import ekd.m1;
import oy5.b;

public final class FriendTabContainerActionSearchPresenter extends PresenterV2	// class@001ab2
{
    public SearchIconEntryView p;
    public final b q;
    public final f r;

    public void FriendTabContainerActionSearchPresenter(f p0){
       a.p(p0, "containerController");
       super();
       this.r = p0;
       this.q = new FriendTabContainerActionSearchPresenter$mSearchActionCallback$1(this);
    }
    public void E8(){
       FriendTabContainerActionSearchPresenter uFriendTabCo = FriendTabContainerActionSearchPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uFriendTabCo, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uFriendTabCo, "3")) {
          uFriendTabCo = this.p;
          if (uFriendTabCo != null) {
             uFriendTabCo.setVisibility(0);
             uFriendTabCo.p0();
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FriendTabContainerActionSearchPresenter.class, "1")) {
          return;
       }
       SearchIconEntryView searchIconEn = m1.f(p0, R.id.right_btn);
       this.p = searchIconEn;
       if (searchIconEn != null) {
          searchIconEn.setSearchActionCallback(this.q);
       }
       return;
    }
}
