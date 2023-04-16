package com.kuaishou.live.core.show.contributorlist.LiveContributorListDialogFragment$b;
import gka.h;
import com.kuaishou.live.core.show.contributorlist.LiveContributorListDialogFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.core.show.contributorlist.LiveContributorListDialogFragment$d;
import com.yxcorp.gifshow.widget.LiveEmptyView;

public class LiveContributorListDialogFragment$b extends h	// class@000ad1
{
    public final LiveContributorListDialogFragment a;

    public void LiveContributorListDialogFragment$b(LiveContributorListDialogFragment p0){
       this.a = p0;
       super();
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, LiveContributorListDialogFragment$b.class, "2")) {
          return;
       }
       this.a.G.setVisibility(8);
       return;
    }
    public void i(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveContributorListDialogFragment$b.class, "1")) {
          return;
       }
       this.a.G.setVisibility(0);
       LiveContributorListDialogFragment$b ta = this.a;
       Objects.requireNonNull(ta);
       LiveContributorListDialogFragment obj = PatchProxy.apply(objArray, ta, LiveContributorListDialogFragment.class, "20");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = ta.B;
          if (obj != null) {
             boolean b1 = TextUtils.n(obj.mId, QCurrentUser.me().getId());
             if (ta.D == null && !b1) {
                b = true;
             }
          }
          b = false;
       }
       if (b) {
          this.a.F.setVisibility(0);
          LiveContributorListDialogFragment e = this.a.E;
          if (e != null) {
             e.d(true);
          }
          this.a.H.setEmptyText(R.string.arg_RES_7f104644);
       }else {
          this.a.H.setEmptyText(R.string.arg_RES_7f103949);
          this.a.F.setVisibility(8);
       }
       return;
    }
}
