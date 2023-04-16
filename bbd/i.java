package bbd.i;
import x9d.l;
import nfd.a0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.yxcorp.plugin.search.entity.kbox.KBoxItem;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateUserFeed;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserExtraInfo;
import android.widget.TextView;
import java.lang.CharSequence;
import nfd.o3;
import com.yxcorp.utility.TextUtils;
import android.view.View;
import ekd.m1;

public class i extends l	// class@0003da
{
    public TextView K;

    public void i(a0 p0){
       super();
       this.q = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, i.class, "2")) {
          return;
       }
       SearchItem mKBoxItem = this.G.mKBoxItem;
       if (mKBoxItem != null && mKBoxItem.mType == 4) {
          this.p = mKBoxItem.mBaseFeed.mUser;
       }
       if (this.p == null) {
          return;
       }else {
          this.c9();
          return;
       }
    }
    public void c9(){
       String str;
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "3")) {
          return;
       }
       if (this.p != null && this.getContext() != null) {
          i tK = this.K;
          User mExtraInfo = this.p.mExtraInfo;
          UserExtraInfo mLastLiveDes = (mExtraInfo != null)? mExtraInfo.mLastLiveDesc: "";
          o3.G(tK, mLastLiveDes);
          User mExtraInfo1 = this.p.mExtraInfo;
          boolean b = (mExtraInfo1 != null && mExtraInfo1.mUserInfoExposed != null)? true: false;
          if (b) {
             objArray = mExtraInfo1;
          }
          this.Y8(this.R8(b, objArray));
          mExtraInfo1 = (!TextUtils.x(this.p.mRankInfo) && this.I == null)? this.p.mRankInfo: this.S8(b, objArray);
          if (TextUtils.x(mExtraInfo1)) {
             str = this.P8(this.p);
          }
          String str1 = this.V8(b, objArray);
          if (!PatchProxy.applyVoidOneRefs(str, this, oi, "4")) {
             l tq = this.q;
             if (tq == null || (tq.b != null && (TextUtils.x(str) || TextUtils.n("searchInvisible", str)))) {
                o3.H(this.s, 8);
             }else {
                super.a9(str);
             }
          }
          this.Z8(str1);
          this.b9(this.p);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       super.doBindView(p0);
       this.K = m1.f(p0, 0x7f0a2d1c);
       return;
    }
}
