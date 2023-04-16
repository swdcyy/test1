package com.yxcorp.gifshow.reminder.friend.kcube.container.presenter.FriendTabContainerActionSearchPresenter$mSearchActionCallback$1;
import oy5.b;
import com.yxcorp.gifshow.reminder.friend.kcube.container.presenter.FriendTabContainerActionSearchPresenter;
import java.lang.Object;
import com.kwai.feature.component.entry.SearchEntryParams;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import androidx.fragment.app.Fragment;
import wq6.f;
import lec.x;
import kotlin.jvm.internal.a;
import oy5.i;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.entity.QPhoto;
import com.google.gson.JsonObject;
import java.lang.Long;
import java.lang.Number;
import com.google.gson.JsonElement;
import oy5.e;
import com.yxcorp.gifshow.reminder.friend.kcube.container.presenter.FriendTabContainerActionSearchPresenter$mSearchActionCallback$1$beforeGotoSearch$1;
import msd.a;
import com.kwai.framework.kgi.sdk.Kgi;

public final class FriendTabContainerActionSearchPresenter$mSearchActionCallback$1 implements b	// class@001ab1
{
    public final FriendTabContainerActionSearchPresenter a;

    public void FriendTabContainerActionSearchPresenter$mSearchActionCallback$1(FriendTabContainerActionSearchPresenter p0){
       this.a = p0;
       super();
    }
    public SearchEntryParams a(int p0){
       FriendTabContainerActionSearchPresenter$mSearchActionCallback$1 obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FriendTabContainerActionSearchPresenter$mSearchActionCallback$1 omSearchActi = FriendTabContainerActionSearchPresenter$mSearchActionCallback$1.class;
       if (PatchProxy.isSupport(omSearchActi)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, omSearchActi, "3");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = this.a;
       Objects.requireNonNull(obj);
       SearchEntryParams searchEntryP = PatchProxy.apply(null, obj, FriendTabContainerActionSearchPresenter.class, "4");
       if (searchEntryP != patchProxyRe) {
       }else {
          searchEntryP = SearchEntryParams.Instance().entrySource("search_entrance_buddy").realActionBizType("FRIENDS");
          Fragment uFragment = obj.r.t();
          if (uFragment != null) {
             x.a(searchEntryP, uFragment);
          }
          a.o(searchEntryP, "params");
       }
       return searchEntryP;
    }
    public i b(int p0,int p1){
       FriendTabContainerActionSearchPresenter$mSearchActionCallback$1 obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FriendTabContainerActionSearchPresenter$mSearchActionCallback$1 omSearchActi = FriendTabContainerActionSearchPresenter$mSearchActionCallback$1.class;
       if (PatchProxy.isSupport(omSearchActi)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, omSearchActi, "2");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = this.a;
       Objects.requireNonNull(obj);
       Object[] objArray = null;
       i oi = PatchProxy.apply(objArray, obj, FriendTabContainerActionSearchPresenter.class, "5");
       if (oi != patchProxyRe) {
       }else {
          Fragment uFragment = obj.r.t();
          SlidePlayViewModel slidePlayVie = (uFragment != null)? SlidePlayViewModel.S0(uFragment): objArray;
          if (slidePlayVie != null) {
             objArray = slidePlayVie.getCurrentPhoto();
          }
          JsonObject jsonObject = new JsonObject();
          JsonObject jsonObject1 = new JsonObject();
          long l = (uFragment != null)? x.b(uFragment): -1;
          jsonObject1.a0("photo_play_duration", Long.valueOf(l));
          jsonObject.G("params", jsonObject1);
          i oi1 = new i();
          oi1.c = jsonObject;
          oi1.a = objArray;
          oi = oi1;
       }
       return oi;
    }
    public void c(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FriendTabContainerActionSearchPresenter$mSearchActionCallback$1.class, "1")) {
          return;
       }
       Kgi.c(FriendTabContainerActionSearchPresenter$mSearchActionCallback$1$beforeGotoSearch$1.INSTANCE);
       return;
    }
}
