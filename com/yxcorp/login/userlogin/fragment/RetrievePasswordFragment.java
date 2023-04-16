package com.yxcorp.login.userlogin.fragment.RetrievePasswordFragment;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.yxcorp.login.userlogin.fragment.RetrievePasswordFragment$RetrievePasswordPage;
import com.google.common.collect.ImmutableList;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import r2d.n0;
import im8.c;
import java.util.ArrayList;
import java.util.Iterator;
import com.kwai.library.widget.viewpager.tabstrip.b;
import java.lang.Enum;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;

public class RetrievePasswordFragment extends TabHostFragment	// class@001b48
{
    public final List B;
    public final int C;
    public PresenterV2 D;

    public void RetrievePasswordFragment(){
       super();
       ImmutableList immutableLis = PatchProxy.apply(null, null, RetrievePasswordFragment.class, "1");
       if (immutableLis != PatchProxyResult.class) {
       }else {
          immutableLis = ImmutableList.of(RetrievePasswordFragment$RetrievePasswordPage.PHONE, RetrievePasswordFragment$RetrievePasswordPage.MAIL);
       }
       this.B = immutableLis;
       this.C = immutableLis.size();
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d088b;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, RetrievePasswordFragment.class, "3")) {
          return;
       }
       super.onDestroyView();
       RetrievePasswordFragment tD = this.D;
       if (tD != null) {
          tD.destroy();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RetrievePasswordFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       Object[] objArray = null;
       if (this.getArguments() != null) {
          String str = this.getArguments().getString("platform", "");
          RetrievePasswordFragment$RetrievePasswordPage mAIL = (!TextUtils.x(str) && str.equals("mail"))? RetrievePasswordFragment$RetrievePasswordPage.MAIL: RetrievePasswordFragment$RetrievePasswordPage.PHONE;
          Object obj = PatchProxy.applyOneRefs(mAIL, this, RetrievePasswordFragment.class, "7");
          if (obj != patchProxyRe) {
             obj.booleanValue();
          }else {
             int i = 0;
             while (i < this.B.size()) {
                if (this.B.get(i) == mAIL) {
                   this.Gh(i, objArray);
                   break ;
                }
                i = i + 1;
             }
          }
       }
       RetrievePasswordFragment retrievePass = PatchProxy.applyWithListener(objArray, this, RetrievePasswordFragment.class, "4");
       if (retrievePass != patchProxyRe) {
       }else {
          PresenterV2 presenterV2 = new PresenterV2();
          this.D = presenterV2;
          presenterV2.U7(new n0());
          retrievePass = this.D;
          PatchProxy.onMethodExit(RetrievePasswordFragment.class, "4");
       }
       this.D = retrievePass;
       retrievePass.f(p0);
       Object[] objArray1 = new Object[]{new c("FRAGMENT", this),this};
       this.D.i(objArray1);
       return;
    }
    public List wh(){
       ArrayList obj = PatchProxy.apply(null, this, RetrievePasswordFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = this.B.iterator();
       while (iterator.hasNext()) {
          RetrievePasswordFragment$RetrievePasswordPage retrievePass = iterator.next();
          b uob = PatchProxy.applyOneRefs(retrievePass, this, RetrievePasswordFragment.class, "6");
          if (uob != PatchProxyResult.class) {
          }else {
             uob = new b(new PagerSlidingTabStrip$d(retrievePass.name(), this.getString(retrievePass.mName)), retrievePass.mClass, this.getArguments());
          }
          obj.add(uob);
       }
       return obj;
    }
}
