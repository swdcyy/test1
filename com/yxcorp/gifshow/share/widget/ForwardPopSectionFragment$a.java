package com.yxcorp.gifshow.share.widget.ForwardPopSectionFragment$a;
import java.lang.Object;
import nsd.u;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.share.widget.ForwardPopSectionFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;
import com.kwai.sharelib.ui.SharePanelFragment;
import mp7.e;

public final class ForwardPopSectionFragment$a	// class@001cf5
{

    public void ForwardPopSectionFragment$a(){
       super();
    }
    public void ForwardPopSectionFragment$a(u p0){
       super();
    }
    public final ForwardPopSectionFragment a(GifshowActivity p0,int p1){
       ForwardPopSectionFragment obj;
       ForwardPopSectionFragment$a uoa = ForwardPopSectionFragment$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "activity");
       obj = new ForwardPopSectionFragment(null);
       obj.fi(p0);
       obj.Y0 = p1;
       if (obj.ai()) {
          obj.Xh().Xg(R.layout.arg_RES_7f0d0495, obj.Nh());
       }else {
          obj.Xh().Xg(R.layout.arg_RES_7f0d0494, obj.Nh());
       }
       return obj;
    }
}
