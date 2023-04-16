package b62.h0;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import com.kuaishou.live.core.show.conditionredpacket.model.LiveConditionRedPacketLotteryResultResponse$LiveConditionRedPacketLuckyUser;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.common.core.basic.widget.GreyscaleImageView;
import b61.b;
import d61.f0;
import java.lang.CharSequence;
import lnc.a1;
import java.lang.Integer;
import com.kuaishou.live.core.show.conditionredpacket.model.LiveConditionRedPacketLotteryResultResponse$LiveConditionRedPacketLuckyUserExtraInfo;
import com.yxcorp.utility.TextUtils;
import android.view.View;
import ekd.m1;
import com.kuaishou.live.common.core.basic.widget.LiveUserView;
import b62.h0$a;
import android.view.View$OnClickListener;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import u52.t;
import j62.a;
import java.lang.Boolean;

public class h0 extends c	// class@00033f
{
    public LiveConditionRedPacketLotteryResultResponse$LiveConditionRedPacketLuckyUser p;
    public t q;
    public a r;
    public boolean s;
    public LiveUserView t;
    public TextView u;
    public TextView v;
    public TextView w;
    public static String sLivePresenterClassName = "LiveConditionRedPacketRecyclerUsersPresenter";

    public void h0(){
       super();
    }
    public void E8(){
       h0 tv;
       h0 oh0 = h0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh0, "3")) {
          return;
       }
       if (this.s != null) {
          this.v.setVisibility(0);
       }else {
          this.v.setVisibility(8);
       }
       LiveConditionRedPacketLotteryResultResponse$LiveConditionRedPacketLuckyUser mUserInfo = this.p.mUserInfo;
       if (!PatchProxy.applyVoidOneRefs(mUserInfo, this, oh0, "4")) {
          tv = this.t;
          if (tv != null) {
             tv.p0(mUserInfo, HeadImageSize.SMALL, 0);
          }
       }
       String str = b.c(this.p.mUserInfo);
       if (!PatchProxy.applyVoidOneRefs(str, this, oh0, "5")) {
          tv = this.u;
          if (tv != null) {
             tv.setText(f0.d(str, 7));
          }
       }
       Object[] objArray1 = new Object[]{Integer.valueOf(this.p.mAwardValue)};
       str = String.format(a1.p(R.string.arg_RES_7f100942), objArray1);
       if (!PatchProxy.applyVoidOneRefs(str, this, oh0, "6")) {
          tv = this.v;
          if (tv != null) {
             tv.setText(str);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, oh0, "7") && this.w != null) {
          LiveConditionRedPacketLotteryResultResponse$LiveConditionRedPacketLuckyUserExtraInfo extraInfo = this.p.getExtraInfo();
          if (extraInfo == null || TextUtils.x(extraInfo.mShareCountDesc)) {
             this.w.setVisibility(8);
          }else {
             this.w.setVisibility(0);
             this.w.setText(extraInfo.mShareCountDesc);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h0.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a1ba0);
       this.u = m1.f(p0, 0x7f0a1ba3);
       this.v = m1.f(p0, 0x7f0a1ba1);
       this.w = m1.f(p0, 0x7f0a1ba2);
       p0.setOnClickListener(new h0$a(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h0.class, "1")) {
          return;
       }
       this.p = this.q8(LiveConditionRedPacketLotteryResultResponse$LiveConditionRedPacketLuckyUser.class);
       this.q = this.r8("ConditionRedPacketRecyclerContext");
       this.r = this.r8("ConditionRedPacketKey");
       this.s = this.r8("ConditionRedPacketIsCoinEnable").booleanValue();
       return;
    }
}
