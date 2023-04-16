package com.yxcorp.gifshow.profile.presenter.MyProfileEmptyGuideTipPresenter$d;
import y8c.g;
import com.yxcorp.gifshow.profile.presenter.MyProfileEmptyGuideTipPresenter;
import java.util.List;
import y8c.f;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import kotlin.jvm.internal.a;
import kotlin.collections.CollectionsKt__CollectionsKt;
import y8c.f$b;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import i4c.u;
import ml8.c;

public final class MyProfileEmptyGuideTipPresenter$d extends g	// class@00140a
{
    public final MyProfileEmptyGuideTipPresenter w;
    public final List x;

    public void MyProfileEmptyGuideTipPresenter$d(MyProfileEmptyGuideTipPresenter p0,List p1){
       this.w = p0;
       this.x = p1;
       super();
    }
    public ArrayList a1(int p0,f p1){
       Object[] obj;
       ProfileParam mUser;
       if (PatchProxy.isSupport2(MyProfileEmptyGuideTipPresenter$d.class, "3")) {
          obj = PatchProxy.applyTwoRefsWithListener(Integer.valueOf(p0), p1, this, MyProfileEmptyGuideTipPresenter$d.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new Object[]{mUser,mUser};
       mUser = this.w.a9().mUser;
       a.o(mUser, "mParam.mUser");
       mUser = this.w.a9().mUserProfile;
       a.o(mUser, "mParam.mUserProfile");
       PatchProxy.onMethodExit(MyProfileEmptyGuideTipPresenter$d.class, "3");
       return CollectionsKt__CollectionsKt.r(obj);
    }
    public f$b d1(f$b p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, MyProfileEmptyGuideTipPresenter$d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          p0.f = this.w.X8();
       }
       PatchProxy.onMethodExit(MyProfileEmptyGuideTipPresenter$d.class, "2");
       return null;
    }
    public f h1(ViewGroup p0,int p1){
       if (PatchProxy.isSupport2(MyProfileEmptyGuideTipPresenter$d.class, "1")) {
          Object obj = PatchProxy.applyTwoRefsWithListener(p0, Integer.valueOf(p1), this, MyProfileEmptyGuideTipPresenter$d.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       PatchProxy.onMethodExit(MyProfileEmptyGuideTipPresenter$d.class, "1");
       return new f(a.i(p0, 0x7f0d11f0), new u());
    }
}
