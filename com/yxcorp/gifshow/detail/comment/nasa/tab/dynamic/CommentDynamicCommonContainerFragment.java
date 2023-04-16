package com.yxcorp.gifshow.detail.comment.nasa.tab.dynamic.CommentDynamicCommonContainerFragment;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import com.yxcorp.gifshow.detail.comment.nasa.tab.dynamic.CommentDynamicCommonContainerFragment$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.Fragment;
import e0a.j;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;

public class CommentDynamicCommonContainerFragment extends LazyInitSupportedFragment	// class@001388
{
    public float A;
    public PresenterV2 B;
    public CommentDynamicCommonContainerFragment$a C;
    public View s;
    public String t;
    public int u;
    public String v;
    public boolean w;
    public boolean x;
    public boolean y;
    public float z;

    public void CommentDynamicCommonContainerFragment(){
       super();
       this.u = 1;
    }
    public View eh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, CommentDynamicCommonContainerFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       this.mh();
       return a.g(p0, 0x7f0d01cb, p1, false);
    }
    public void fh(View p0,Bundle p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CommentDynamicCommonContainerFragment.class, "2")) {
          return;
       }
       CommentDynamicCommonContainerFragment$a uoa = PatchProxy.apply(null, this, CommentDynamicCommonContainerFragment.class, "4");
       if (uoa != patchProxyRe) {
       }else {
          uoa = new CommentDynamicCommonContainerFragment$a(this);
       }
       this.C = uoa;
       String str = "3";
       PresenterV2 presenterV2 = PatchProxy.applyOneRefsWithListener(p0, this, CommentDynamicCommonContainerFragment.class, str);
       if (presenterV2 != patchProxyRe) {
       }else {
          presenterV2 = new PresenterV2();
          presenterV2.f(p0);
          PatchProxy.onMethodExit(CommentDynamicCommonContainerFragment.class, str);
       }
       this.B = presenterV2;
       Object[] objArray = new Object[]{this.C};
       presenterV2.i(objArray);
       this.z = (float)p0.getHeight();
       this.A = (float)p0.getWidth();
       return;
    }
    public boolean lh(){
       return true;
    }
    public void mh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CommentDynamicCommonContainerFragment.class, "5")) {
          return;
       }
       Bundle arguments = this.getArguments();
       if (arguments != null) {
          this.t = arguments.getString("photoId");
          this.v = arguments.getString("pageSource");
          this.u = arguments.getInt("likeStyle");
          this.w = arguments.getBoolean("onlySupportLight");
          this.x = arguments.getBoolean("enableListenTheme");
          Object obj = PatchProxy.apply(objArray, objArray, j.class, "29");
          boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): a.t().d("enableCommentPreviewImage", false);
          this.y = b;
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, CommentDynamicCommonContainerFragment.class, "6")) {
          return;
       }
       super.onDestroy();
       CommentDynamicCommonContainerFragment tB = this.B;
       if (tB != null) {
          tB.destroy();
          this.B = null;
       }
       return;
    }
}
