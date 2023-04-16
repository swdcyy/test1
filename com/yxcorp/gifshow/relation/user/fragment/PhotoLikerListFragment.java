package com.yxcorp.gifshow.relation.user.fragment.PhotoLikerListFragment;
import com.yxcorp.gifshow.relation.user.fragment.NoticeUserListFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ecc.c;
import qvb.n0;
import xac.l;
import com.yxcorp.gifshow.relation.user.base.UserListFragment;
import com.yxcorp.gifshow.relation.user.model.UserListParam;
import java.util.Map;
import java.lang.StringBuilder;
import hcc.j0;
import y8c.g;
import com.yxcorp.gifshow.relation.user.adapter.e$b;
import com.yxcorp.gifshow.relation.user.adapter.d;
import com.yxcorp.gifshow.relation.user.adapter.e;
import qvb.i;

public class PhotoLikerListFragment extends NoticeUserListFragment	// class@001a0c
{

    public void PhotoLikerListFragment(){
       super();
    }
    public PresenterV2 Hh(){
       Object obj = PatchProxy.applyWithListener(null, this, PhotoLikerListFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(PhotoLikerListFragment.class, "1");
       return new c(0);
    }
    public n0 Ph(){
       Object obj = PatchProxy.apply(null, this, PhotoLikerListFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new l(this.F.mPhotoId);
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PhotoLikerListFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(PhotoLikerListFragment.class, null);
       return objectsByTag;
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, PhotoLikerListFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "type=2&"+j0.c(2);
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, PhotoLikerListFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       d uod = new d(new e$b(this));
       uod.t1(true);
       return uod;
    }
    public i yh(){
       return this.Ph();
    }
}
