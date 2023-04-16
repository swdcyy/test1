package com.yxcorp.gifshow.profile.fragment.PhotoFragmentItemType$MENTIONED_ME;
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
import y2c.a;
import j4c.c;
import qvb.i;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.profile.http.e;
import com.kwai.framework.model.user.User;
import lnc.a1;

public final class PhotoFragmentItemType$MENTIONED_ME extends PhotoFragmentItemType	// class@00130b
{

    public void PhotoFragmentItemType$MENTIONED_ME(String p0,int p1){
       super(p0, p1, null);
    }
    public void addMyPresenter(PresenterV2 p0,r0 p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, PhotoFragmentItemType$MENTIONED_ME.class, "3")) {
          return;
       }
       a.p(p0, "presenter");
       a.p(p1, "profilePageParam");
       p0.U7(new o());
       p0.U7(new a());
       p0.U7(new c());
       PatchProxy.onMethodExit(PhotoFragmentItemType$MENTIONED_ME.class, "3");
       return;
    }
    public void addUserPresenter(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, PhotoFragmentItemType$MENTIONED_ME.class, "4")) {
          return;
       }
       a.p(p0, "presenter");
       super.addUserPresenter(p0);
       PatchProxy.onMethodExit(PhotoFragmentItemType$MENTIONED_ME.class, "4");
       return;
    }
    public i createPageList(String p0,r0 p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, PhotoFragmentItemType$MENTIONED_ME.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       a.p(p1, "profilePageParam");
       p1 = p1.b;
       a.o(p1, "profilePageParam.mUser");
       return new e(p1.getId());
    }
    public String getTabName(){
       String obj = PatchProxy.apply(null, this, PhotoFragmentItemType$MENTIONED_ME.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a1.p(R.string.arg_RES_7f100247);
       a.o(obj, "CommonUtil.string\(R.string.at_tab_lead_title\)");
       return obj;
    }
}
