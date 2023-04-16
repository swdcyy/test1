package com.yxcorp.gifshow.profile.fragment.PhotoFragmentItemType$PRIVACY;
import com.yxcorp.gifshow.profile.fragment.PhotoFragmentItemType;
import java.lang.String;
import nsd.u;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import s1c.r0;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import y2c.o;
import com.yxcorp.gifshow.profile.presenter.profile.w;
import y2c.a;
import qvb.i;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.profile.http.l;
import com.kwai.framework.model.user.User;
import gu7.b;
import lnc.a1;

public final class PhotoFragmentItemType$PRIVACY extends PhotoFragmentItemType	// class@00130d
{

    public void PhotoFragmentItemType$PRIVACY(String p0,int p1){
       super(p0, p1, null);
    }
    public void addMyPresenter(PresenterV2 p0,r0 p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, PhotoFragmentItemType$PRIVACY.class, "3")) {
          return;
       }
       a.p(p0, "presenter");
       a.p(p1, "profilePageParam");
       p0.U7(new o());
       p0.U7(new w(p1));
       p0.U7(new a());
       PatchProxy.onMethodExit(PhotoFragmentItemType$PRIVACY.class, "3");
       return;
    }
    public i createPageList(String p0,r0 p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, PhotoFragmentItemType$PRIVACY.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "profilePageParam");
       p1 = p1.b;
       a.o(p1, "profilePageParam.mUser");
       l ol = new l(p1.getId(), true, p0, false, null);
       return obj;
    }
    public String getTabName(){
       String obj = PatchProxy.apply(null, this, PhotoFragmentItemType$PRIVACY.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a1.p(R.string.arg_RES_7f103fd5);
       a.o(obj, "CommonUtil.string\(R.string.profile_tab_privates\)");
       return obj;
    }
}
