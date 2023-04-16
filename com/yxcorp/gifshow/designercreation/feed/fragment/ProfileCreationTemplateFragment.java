package com.yxcorp.gifshow.designercreation.feed.fragment.ProfileCreationTemplateFragment;
import k3c.v1;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.designercreation.feed.fragment.ProfileCreationTemplateFragment$a;
import nsd.u;
import com.yxcorp.gifshow.designercreation.feed.fragment.ProfileCreationTemplateFragment$adapter$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.designercreation.feed.fragment.ProfileCreationTemplateFragment$b;
import com.yxcorp.gifshow.designercreation.feed.fragment.ProfileCreationTemplateFragment$rootParentFragmentHashCode$2;
import com.yxcorp.gifshow.designercreation.feed.fragment.ProfileCreationTemplateFragment$isSubFragment$2;
import com.yxcorp.gifshow.designercreation.feed.fragment.ProfileCreationTemplateFragment$tabType$2;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter;
import java.lang.Number;
import kotlin.jvm.internal.a;
import y8c.t;
import com.yxcorp.gifshow.designercreation.feed.helper.DesignerTemplateTipsHelper;
import s1c.r0;
import java.util.List;
import qvb.i;
import im8.c;
import android.view.View;
import android.os.Bundle;
import java.util.Map;
import com.yxcorp.gifshow.designercreation.pagelist.ProfileCreationPageListManager;
import com.yxcorp.gifshow.designercreation.pagelist.ProfileCreationPageListManager$a;
import com.kwai.framework.model.user.User;
import java.util.Objects;
import java.util.HashMap;
import qvb.q;
import qvb.j;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Boolean;
import android.view.ViewGroup;
import y8c.g;
import ew9.a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.res.Resources;
import android.app.Activity;
import android.content.res.Configuration;
import rkd.b;
import androidx.recyclerview.widget.GridLayoutManager;
import android.content.Context;
import com.yxcorp.gifshow.designercreation.feed.fragment.ProfileCreationTemplateFragment$c;
import androidx.recyclerview.widget.GridLayoutManager$b;
import com.yxcorp.gifshow.designercreation.pagelist.ProfileCreationTemplatePageList;
import qvb.a;

public final class ProfileCreationTemplateFragment extends RecyclerFragment implements v1	// class@0012db
{
    public boolean F;
    public final int G;
    public final int H;
    public r0 I;
    public final p J;
    public final q K;
    public final p L;
    public final p M;
    public final p N;
    public HashMap O;
    public static final ProfileCreationTemplateFragment$a P;

    static {
       ProfileCreationTemplateFragment.P = new ProfileCreationTemplateFragment$a(null);
    }
    public void ProfileCreationTemplateFragment(){
       super();
       this.G = 3;
       this.H = 5;
       this.J = s.c(new ProfileCreationTemplateFragment$adapter$2(this));
       this.K = new ProfileCreationTemplateFragment$b(this);
       this.L = s.c(new ProfileCreationTemplateFragment$rootParentFragmentHashCode$2(this));
       this.M = s.c(new ProfileCreationTemplateFragment$isSubFragment$2(this));
       this.N = s.c(new ProfileCreationTemplateFragment$tabType$2(this));
    }
    public PresenterV2 B2(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       PresenterV2 obj = PatchProxy.applyWithListener(objArray, this, ProfileCreationTemplateFragment.class, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = super.B2();
       Number number = PatchProxy.apply(objArray, this, ProfileCreationTemplateFragment.class, "2");
       if (number == patchProxyRe) {
          number = this.L.getValue();
       }
       obj.U7(new ProfileCreationScrollSizePresenter(number.intValue()));
       a.o(obj, "presenter");
       PatchProxy.onMethodExit(ProfileCreationTemplateFragment.class, "5");
       return obj;
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, ProfileCreationTemplateFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new DesignerTemplateTipsHelper(this);
    }
    public boolean Eh(){
       return false;
    }
    public void Fc(r0 p0){
       this.I = p0;
    }
    public boolean S1(){
       return false;
    }
    public boolean Xg(){
       return false;
    }
    public List fg(){
       List obj = PatchProxy.apply(null, this, ProfileCreationTemplateFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.fg();
       a.o(obj, "super.onCreateCallerContext\(\)");
       obj.add(this);
       ProfileCreationTemplateFragment tI = this.I;
       if (tI != null) {
          obj.add(tI);
          obj.add(tI.e);
       }
       obj.add(c.a("PAGE_LIST", this.q()));
       return obj;
    }
    public void fh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProfileCreationTemplateFragment.class, "9")) {
          return;
       }
       a.p(p0, "view");
       super.fh(p0, p1);
       this.a();
       return;
    }
    public void ga(boolean p0){
       this.F = p0;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfileCreationTemplateFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(ProfileCreationTemplateFragment.class, null);
       return objectsByTag;
    }
    public boolean h9(){
       return this.F;
    }
    public boolean i0(){
       return true;
    }
    public void onDestroy(){
       String id;
       if (PatchProxy.applyVoid(null, this, ProfileCreationTemplateFragment.class, "13")) {
          return;
       }
       super.onDestroy();
       ProfileCreationPageListManager profileCreat = ProfileCreationPageListManager.c.a();
       ProfileCreationTemplateFragment tI = this.I;
       if (tI != null) {
          r0 b = tI.b;
          if (b != null) {
             id = b.getId();
             if (id != null) {
             label_0026 :
                Objects.requireNonNull(profileCreat);
                if (!PatchProxy.applyVoidOneRefs(id, profileCreat, ProfileCreationPageListManager.class, "2")) {
                   a.p(id, "userId");
                   profileCreat.a.remove(id);
                }
                return;
             }
          }
       }
       id = "";
       goto label_0026 ;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, ProfileCreationTemplateFragment.class, "8")) {
          return;
       }
       super.onDestroyView();
       this.q().f(this.K);
       if (!PatchProxy.applyVoid(null, this, ProfileCreationTemplateFragment.class, "16")) {
          ProfileCreationTemplateFragment tO = this.O;
          if (tO != null) {
             tO.clear();
          }
       }
       return;
    }
    public void th(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ProfileCreationTemplateFragment.class, "11")) {
          return;
       }
       super.th();
       int i = a1.e(15.00f);
       RecyclerView recyclerView = this.h0();
       Boolean uBoolean = PatchProxy.apply(objArray, this, ProfileCreationTemplateFragment.class, "3");
       if (uBoolean == PatchProxyResult.class) {
          uBoolean = this.M.getValue();
       }
       int i1 = (uBoolean.booleanValue())? 0: i;
       recyclerView.setPadding(i, i1, i, i);
       RecyclerView recyclerView1 = this.h0();
       a.o(recyclerView1, "recyclerView");
       recyclerView1.setClipChildren(false);
       recyclerView1 = this.h0();
       a.o(recyclerView1, "recyclerView");
       recyclerView1.setClipToPadding(false);
       return;
    }
    public g vh(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, this, ProfileCreationTemplateFragment.class, "10");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(null, this, ProfileCreationTemplateFragment.class, "1");
       if (obj != patchProxyRe) {
       }else {
          obj = this.J.getValue();
       }
       return obj;
    }
    public boolean x0(){
       return false;
    }
    public RecyclerView$LayoutManager xh(){
       Configuration configuratio;
       ProfileCreationTemplateFragment obj = PatchProxy.apply(null, this, ProfileCreationTemplateFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.G;
       FragmentActivity activity = this.getActivity();
       if (activity != null) {
          Resources resources = activity.getResources();
          if (resources != null) {
             configuratio = resources.getConfiguration();
             if (configuratio != null) {
                configuratio = configuratio.orientation;
             label_0028 :
                if (b.g() && configuratio == 2) {
                   obj = this.H;
                }
                GridLayoutManager gridLayoutMa = new GridLayoutManager(this.getContext(), obj);
                gridLayoutMa.m1(new ProfileCreationTemplateFragment$c(this, obj));
                return gridLayoutMa;
             }
          }
       }
       configuratio = 1;
       goto label_0028 ;
    }
    public i yh(){
       String id;
       ProfileCreationPageListManager obj = PatchProxy.apply(null, this, ProfileCreationTemplateFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = ProfileCreationPageListManager.c.a();
       ProfileCreationTemplateFragment tI = this.I;
       if (tI != null) {
          r0 b = tI.b;
          if (b != null) {
             id = b.getId();
             if (id != null) {
             label_0027 :
                ProfileCreationTemplatePageList profileCreat = obj.a(id);
                profileCreat.h(this.K);
                return profileCreat;
             }
          }
       }
       id = "";
       goto label_0027 ;
    }
}
