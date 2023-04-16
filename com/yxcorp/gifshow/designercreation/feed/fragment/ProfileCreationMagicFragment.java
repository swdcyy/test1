package com.yxcorp.gifshow.designercreation.feed.fragment.ProfileCreationMagicFragment;
import com.yxcorp.gifshow.designermagic.v2.ProfileMagicDesignerFragmentV2;
import com.yxcorp.gifshow.designercreation.feed.fragment.ProfileCreationMagicFragment$a;
import nsd.u;
import com.yxcorp.gifshow.designercreation.feed.fragment.ProfileCreationMagicFragment$isSubFragment$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.View;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import qvb.i;
import java.util.Map;
import java.util.HashMap;
import java.lang.Boolean;
import lnc.a1;
import sw9.b;
import qsd.d;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;

public final class ProfileCreationMagicFragment extends ProfileMagicDesignerFragmentV2	// class@0012d3
{
    public final p J;
    public HashMap K;
    public static final ProfileCreationMagicFragment$a L;

    static {
       ProfileCreationMagicFragment.L = new ProfileCreationMagicFragment$a(null);
    }
    public void ProfileCreationMagicFragment(){
       super();
       this.J = s.c(new ProfileCreationMagicFragment$isSubFragment$2(this));
    }
    public PresenterV2 B2(){
       int intx;
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, ProfileCreationMagicFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       Bundle arguments = this.getArguments();
       if (arguments != null) {
          intx = arguments.getInt("ROOT_FRAGMENT_HASH_CODE");
       }else {
          Fragment parentFragme = this.getParentFragment();
          intx = (parentFragme != null)? parentFragme.hashCode(): 0;
       }
       obj.U7(new ProfileCreationScrollSizePresenter(intx));
       PatchProxy.onMethodExit(ProfileCreationMagicFragment.class, "3");
       return obj;
    }
    public void fh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProfileCreationMagicFragment.class, "2")) {
          return;
       }
       a.p(p0, "view");
       super.fh(p0, p1);
       this.q().a();
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfileCreationMagicFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(ProfileCreationMagicFragment.class, null);
       return objectsByTag;
    }
    public boolean i0(){
       return true;
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, ProfileCreationMagicFragment.class, "6")) {
       }else {
          ProfileCreationMagicFragment tK = this.K;
          if (tK != null) {
             tK.clear();
          }
       }
       return;
    }
    public void th(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ProfileCreationMagicFragment.class, "4")) {
          return;
       }
       super.th();
       Boolean uBoolean = PatchProxy.apply(objArray, this, ProfileCreationMagicFragment.class, "1");
       if (uBoolean == PatchProxyResult.class) {
          uBoolean = this.J.getValue();
       }
       if (uBoolean.booleanValue()) {
          this.h0().setPadding(d.H0(((float)a1.e(15.00f) * b.a)), 0, d.H0(((float)a1.e(15.00f) * b.a)), d.H0(((float)a1.e(15.00f) * b.a)));
       }
       return;
    }
}
