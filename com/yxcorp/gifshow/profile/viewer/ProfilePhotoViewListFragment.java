package com.yxcorp.gifshow.profile.viewer.ProfilePhotoViewListFragment;
import com.yxcorp.gifshow.profile.status.panel.StatusPanelListFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import a6c.f;
import y8c.t;
import com.yxcorp.gifshow.profile.viewer.ProfilePhotoViewListFragment$a;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.util.Map;
import java.lang.Boolean;
import qvb.i;
import p5c.c;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.PhotoMeta;
import kp.r1;
import y8c.g;
import a6c.e;
import o3c.j;

public class ProfilePhotoViewListFragment extends StatusPanelListFragment	// class@0015e8
{

    public void ProfilePhotoViewListFragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, ProfilePhotoViewListFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       obj.U7(new f());
       PatchProxy.onMethodExit(ProfilePhotoViewListFragment.class, "2");
       return obj;
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, ProfilePhotoViewListFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ProfilePhotoViewListFragment$a(this, this);
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfilePhotoViewListFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(ProfilePhotoViewListFragment.class, null);
       return objectsByTag;
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(ProfilePhotoViewListFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, ProfilePhotoViewListFragment.class, "4")) {
          return;
       }
       super.v2(p0, p1);
       if (!this.q().hasMore()) {
          PhotoMeta photoMeta = r1.u1(this.Gh().b.mEntity);
          photoMeta.mViewerCount = this.q().getCount();
          photoMeta.sync(photoMeta);
       }
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, ProfilePhotoViewListFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[]{this.Gh()};
       return new e(objArray);
    }
    public i yh(){
       j obj = PatchProxy.apply(null, this, ProfilePhotoViewListFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new j(this.Gh().b);
       this.Gh().h = obj;
       return obj;
    }
}
