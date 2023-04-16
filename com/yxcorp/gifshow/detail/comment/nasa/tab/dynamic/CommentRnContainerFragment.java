package com.yxcorp.gifshow.detail.comment.nasa.tab.dynamic.CommentRnContainerFragment;
import lnc.g2$a;
import com.yxcorp.gifshow.detail.comment.nasa.tab.dynamic.CommentDynamicCommonContainerFragment;
import com.yxcorp.gifshow.detail.comment.nasa.tab.dynamic.CommentRnContainerFragment$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.detail.comment.nasa.tab.dynamic.d;
import androidx.fragment.app.Fragment;
import com.kuaishou.krn.model.LaunchModel$b;
import zf6.k;
import com.kuaishou.android.model.mix.DynamicTabInfo$RnConfigInfo;
import lnc.i3;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Number;
import java.lang.Float;
import com.kuaishou.krn.model.LaunchModel;
import js6.a;
import com.kwai.kds.krn.api.page.KwaiRnFragment;
import zj0.x;
import android.view.View;
import android.os.Bundle;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import ix9.b;
import q87.c;
import java.lang.Throwable;
import android.util.Log;
import k2b.u1;
import ek9.m1;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;

public class CommentRnContainerFragment extends CommentDynamicCommonContainerFragment implements g2$a	// class@00138a
{
    public String D;
    public DynamicTabInfo$RnConfigInfo E;
    public final x F;
    public KwaiRnFragment G;

    public void CommentRnContainerFragment(){
       super();
       this.F = new CommentRnContainerFragment$a(this);
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, CommentRnContainerFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new d());
       PatchProxy.onMethodExit(CommentRnContainerFragment.class, "4");
       return obj;
    }
    public final Fragment b(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LaunchModel$b obj = PatchProxy.apply(objArray, this, CommentRnContainerFragment.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(objArray, this, CommentRnContainerFragment.class, "3");
       if (obj != patchProxyRe) {
       }else {
          obj = new LaunchModel$b();
          LaunchModel$b uob = obj.f("enableBackBtnHandler", false);
          String str = PatchProxy.apply(objArray, this, CommentRnContainerFragment.class, "5");
          if (str != patchProxyRe) {
          }else if(this.w == null && k.d()){
             str = "%2319191E";
          }else {
             str = "%23FFFFFF";
          }
          uob.e("bgColor", str).e("containerSource", "CommentRnTabFragment");
          obj.j(this.E.mComponentName);
          obj.i(this.E.mBundleId);
          uob = obj.l(this.E.mMinVersion);
          String str1 = PatchProxy.apply(objArray, this, CommentRnContainerFragment.class, "7");
          if (str1 != patchProxyRe) {
          }else {
             i3 oi3 = i3.f();
             oi3.a("isNebula", Boolean.FALSE);
             oi3.d("photoId", this.t);
             oi3.c("likeStyle", Integer.valueOf(this.u));
             oi3.d("pageSource", this.v);
             oi3.c("tabHeight", Float.valueOf(this.z));
             oi3.c("tabWidth", Float.valueOf(this.A));
             oi3.a("usePreviewImageBridge", Boolean.valueOf(this.y));
             oi3.a("onlySupportLight", Boolean.valueOf(this.w));
             str1 = oi3.e();
          }
          uob.e("commonParams", str1).e("rnQueryParams", this.D);
       }
       LaunchModel launchModel = obj.h();
       a.b.Gg(launchModel);
       KwaiRnFragment kwaiRnFragme = KwaiRnFragment.Yg(launchModel);
       this.G = kwaiRnFragme;
       kwaiRnFragme.Gg(this.F);
       return this.G;
    }
    public void fh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CommentRnContainerFragment.class, "1")) {
          return;
       }
       int i = 0;
       try{
          super.fh(p0, p1);
          e uoe = this.getChildFragmentManager().beginTransaction();
          uoe.v(R.id.fragment_container, this.b());
          uoe.m();
          Object[] objArray = new Object[i];
          b.C().s("CommentRnTabFragment", "doInitAfterViewCreated", objArray);
       }catch(java.lang.Exception e5){
          i3 oi3 = i3.f();
          oi3.d("errorMsg", Log.getStackTraceString(e5));
          u1.R("COMMENT_WONDERFUL_CONTAINER_CREAT_FAILED", oi3.e(), 14);
          Object[] objArray1 = new Object[i];
          m1.C().u("CommentRnTabFragment", e5, objArray1);
       }
       return;
    }
    public void mh(){
       if (PatchProxy.applyVoid(null, this, CommentRnContainerFragment.class, "8")) {
          return;
       }
       super.mh();
       Bundle arguments = this.getArguments();
       if (arguments != null) {
          this.E = SerializableHook.getSerializable(arguments, "RN_CONFIG_INFO");
          this.D = arguments.getString("RN_QUERY_PARAMS");
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, CommentRnContainerFragment.class, "6")) {
          return;
       }
       super.onDestroyView();
       CommentRnContainerFragment tG = this.G;
       if (tG != null) {
          tG.Rb(this.F);
       }
       return;
    }
}
