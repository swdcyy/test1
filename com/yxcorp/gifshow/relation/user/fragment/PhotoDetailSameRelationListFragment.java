package com.yxcorp.gifshow.relation.user.fragment.PhotoDetailSameRelationListFragment;
import com.yxcorp.gifshow.relation.user.base.UserListFragment;
import java.util.ArrayList;
import com.kwai.framework.model.user.User;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import hcc.j0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import k2b.u1;
import com.yxcorp.gifshow.relation.user.model.UserListParam;
import s2b.a;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.relation.user.fragment.PhotoDetailSameRelationListFragment$c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ecc.c;
import zbc.c;
import com.yxcorp.gifshow.relation.user.fragment.PhotoDetailSameRelationListFragment$a;
import zbc.d;
import com.yxcorp.gifshow.relation.user.fragment.PhotoDetailSameRelationListFragment$b;
import java.util.Map;
import lnc.i3;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.util.List;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchUserPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import qvb.i;
import xac.r;

public class PhotoDetailSameRelationListFragment extends UserListFragment	// class@001a0b
{
    public List J;
    public static final int K;

    public void PhotoDetailSameRelationListFragment(){
       super();
       this.J = new ArrayList();
    }
    public static void Ph(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, PhotoDetailSameRelationListFragment.class, "9")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "USER_CARD";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.userPackage = j0.b(p0);
       ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
       uClickEvent.elementPackage = uElementPack;
       uClickEvent.contentPackage = uContentPack;
       u1.a0(uClickEvent);
       return;
    }
    public a Gh(UserListFragment p0,UserListParam p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, PhotoDetailSameRelationListFragment.class, "5");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new PhotoDetailSameRelationListFragment$c(this);
    }
    public PresenterV2 Hh(){
       Object obj = PatchProxy.applyWithListener(null, this, PhotoDetailSameRelationListFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(PhotoDetailSameRelationListFragment.class, "1");
       return new c(0);
    }
    public c Kh(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailSameRelationListFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PhotoDetailSameRelationListFragment$a(this);
    }
    public d Mh(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailSameRelationListFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PhotoDetailSameRelationListFragment$b(this);
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PhotoDetailSameRelationListFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(PhotoDetailSameRelationListFragment.class, null);
       return objectsByTag;
    }
    public String getPageParams(){
       i3 obj = PatchProxy.apply(null, this, PhotoDetailSameRelationListFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i3.f();
       obj.d("source", this.F.mSource);
       return obj.e();
    }
    public String o(){
       return "COMMON_FRIENDS";
    }
    public void onPause(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PhotoDetailSameRelationListFragment.class, "6")) {
          return;
       }
       super.onPause();
       PhotoDetailSameRelationListFragment tJ = this.J;
       if (PatchProxy.applyVoidOneRefs(tJ, objArray, PhotoDetailSameRelationListFragment.class, "8") || (tJ != null && !tJ.isEmpty())) {
          ClientContent$UserPackage[] userPackageA = new ClientContent$UserPackage[tJ.size()];
          for (int i = 0; i < tJ.size(); i = i + 1) {
             userPackageA[i] = j0.b(tJ.get(i));
          }
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "COMMON_FRIENDS_INFORMATION";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          ClientContent$BatchUserPackage uBatchUserPa = new ClientContent$BatchUserPackage();
          uContentPack.batchUserPackage = uBatchUserPa;
          uBatchUserPa.userPackage = userPackageA;
          ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
          showEvent.elementPackage = uElementPack;
          showEvent.contentPackage = uContentPack;
          u1.g0(showEvent);
       }
    label_0064 :
       this.J.clear();
       return;
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailSameRelationListFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       UserListFragment tF = this.F;
       return new r(tF.mPhotoId, tF.mReason, tF.mCount);
    }
}
