package com.yxcorp.gifshow.profile.fragment.PhotoFragmentItemType$LIKE;
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
import com.yxcorp.gifshow.profile.presenter.profile.l;
import y2c.a;
import qvb.i;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.profile.http.c;
import lnc.a1;

public final class PhotoFragmentItemType$LIKE extends PhotoFragmentItemType	// class@00130a
{

    public void PhotoFragmentItemType$LIKE(String p0,int p1){
       super(p0, p1, null);
    }
    public void addMyPresenter(PresenterV2 p0,r0 p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, PhotoFragmentItemType$LIKE.class, "3")) {
          return;
       }
       a.p(p0, "presenter");
       a.p(p1, "profilePageParam");
       p0.U7(new o());
       p0.U7(new l());
       p0.U7(new a());
       PatchProxy.onMethodExit(PhotoFragmentItemType$LIKE.class, "3");
       return;
    }
    public i createPageList(String p0,r0 p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, PhotoFragmentItemType$LIKE.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "profilePageParam");
       return new c(p0);
    }
    public String getTabName(){
       String obj = PatchProxy.apply(null, this, PhotoFragmentItemType$LIKE.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a1.p(R.string.arg_RES_7f103fcd);
       a.o(obj, "CommonUtil.string\(R.string.profile_tab_likes\)");
       return obj;
    }
}
