package com.yxcorp.gifshow.profile.adapter.ProfileTemplateCardAdapter;
import y8c.g;
import com.yxcorp.gifshow.profile.adapter.ProfileTemplateCardAdapter$a;
import nsd.u;
import java.lang.String;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.profile.adapter.ProfileTemplateCardAdapter$mAdditionalCallerContext$2;
import msd.a;
import qrd.p;
import qrd.s;
import y8c.f;
import java.util.ArrayList;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.view.ViewGroup;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import ekd.p1;
import ml8.c;
import i2b.a;
import com.yxcorp.gifshow.profile.presenter.profile.header.template.ProfileTemplateCardItemPresenter;

public final class ProfileTemplateCardAdapter extends g	// class@001205
{
    public final BaseFragment A;
    public final int B;
    public final boolean C;
    public boolean w;
    public final p x;
    public final String y;
    public final long z;
    public static final ProfileTemplateCardAdapter$a D;

    static {
       ProfileTemplateCardAdapter.D = new ProfileTemplateCardAdapter$a(null);
    }
    public void ProfileTemplateCardAdapter(String p0,long p1,BaseFragment p2,int p3,boolean p4){
       a.p(p0, "mUserId");
       a.p(p2, "mBaseFragment");
       super();
       this.y = p0;
       this.z = p1;
       this.A = p2;
       this.B = p3;
       this.C = p4;
       this.x = s.c(new ProfileTemplateCardAdapter$mAdditionalCallerContext$2(this));
    }
    public void Z0(){
       this.w = true;
    }
    public ArrayList a1(int p0,f p1){
       ArrayList obj;
       if (PatchProxy.isSupport(ProfileTemplateCardAdapter.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, ProfileTemplateCardAdapter.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "holder");
       obj = PatchProxy.apply(null, this, ProfileTemplateCardAdapter.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = this.x.getValue();
       }
       return obj;
    }
    public int f0(int p0){
       return 1;
    }
    public f h1(ViewGroup p0,int p1){
       PresenterV2 obj;
       View view;
       f uof;
       ProfileTemplateCardAdapter profileTempl = ProfileTemplateCardAdapter.class;
       if (PatchProxy.isSupport(profileTempl)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, profileTempl, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "parent");
       obj = new PresenterV2();
       if (p1 != 1) {
          view = p1.b(p0);
          a.o(view, "ViewUtils.emptyView\(parent\)");
          uof = new f(view, obj);
       }else if(this.B != 4){
          p1 = 0x7f0d122f;
       }else {
          p1 = 0x7f0d1230;
       }
       view = a.i(p0, p1);
       a.o(view, "KwaiLayoutInflater.inflate\(parent, getLayoutID\(\)\)");
       obj.U7(new ProfileTemplateCardItemPresenter());
       uof = new f(view, obj);
       return uof;
    }
    public final void onDestroy(){
       if (PatchProxy.applyVoid(null, this, ProfileTemplateCardAdapter.class, "4")) {
          return;
       }
       super.Z0();
       return;
    }
}
