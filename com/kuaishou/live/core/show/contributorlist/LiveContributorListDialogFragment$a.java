package com.kuaishou.live.core.show.contributorlist.LiveContributorListDialogFragment$a;
import qvb.f;
import com.kuaishou.live.core.show.contributorlist.LiveContributorListDialogFragment;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o02.f;
import o02.e;
import java.util.Objects;
import com.kwai.framework.model.user.UserInfo;
import com.yxcorp.utility.TextUtils;
import cjd.e;
import erd.o;

public class LiveContributorListDialogFragment$a extends f	// class@000ad0
{
    public final LiveContributorListDialogFragment p;

    public void LiveContributorListDialogFragment$a(LiveContributorListDialogFragment p0){
       this.p = p0;
       super();
    }
    public t I1(){
       String str1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       f obj = PatchProxy.apply(objArray, this, LiveContributorListDialogFragment$a.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = e.a();
       LiveContributorListDialogFragment$a tp = this.p;
       LiveContributorListDialogFragment a = tp.A;
       Objects.requireNonNull(tp);
       String str = PatchProxy.apply(objArray, tp, LiveContributorListDialogFragment.class, "8");
       if (str != patchProxyRe) {
       }else {
          LiveContributorListDialogFragment b = tp.B;
          if (b != null) {
             UserInfo mId = b.mId;
             if (mId != null) {
                str1 = TextUtils.k(mId);
             label_0037 :
                str = str1;
             }
          }
          str1 = "";
          goto label_0037 ;
       }
       return obj.v(a, str, this.p.C).map(new e());
    }
}
