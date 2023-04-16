package com.yxcorp.gifshow.detail.fragments.milano.presenter.a;
import erd.g;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.b;
import java.lang.Object;
import njd.a;
import java.util.Objects;
import com.kwai.feature.api.social.relation.model.SimpleUserResponse;
import java.util.List;
import com.kwai.feature.api.social.relation.model.SimpleUserInfo;
import com.kwai.framework.model.user.User;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.framework.model.user.User$FollowStatus;
import o56.a;
import android.app.Application;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import v0a.f;
import android.view.View$OnClickListener;
import v0a.g;
import lu7.f;
import java.lang.CharSequence;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import yl8.b;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import v0a.b;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.e0;
import k2b.u1;
import u6a.a;
import com.yxcorp.gifshow.nasa.NasaTagInfo;
import brd.y;

public final class a implements g	// class@001518
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       p0 = p0.a();
       if (p0 != null) {
          SimpleUserResponse mUserInfo = p0.mUserInfo;
          if (mUserInfo != null && mUserInfo.size() > 0) {
             SimpleUserInfo simpleUserIn = p0.mUserInfo.get(0);
             User user = new User(simpleUserIn.userId, simpleUserIn.mUserName, simpleUserIn.mSex, simpleUserIn.headUrl, simpleUserIn.headUrls);
             tb.y = v8;
             v8.setPrivate(simpleUserIn.mPrivacy);
             b y = tb.y;
             y.mVisitorBeFollowed = simpleUserIn.visitorBeFollowed;
             if (simpleUserIn.following != null) {
                y.setFollowStatus(User$FollowStatus.FOLLOWING);
             }else {
                y.setFollowStatus(User$FollowStatus.UNFOLLOW);
             }
             String str = a.B.getString(R.string.arg_RES_7f100dc7);
             SimpleUserResponse mMessageValu = p0.mMessageValues;
             if (mMessageValu != null) {
                String str1 = "external_share_follow_tip";
                if (mMessageValu.s0(str1)) {
                   str = p0.mMessageValues.e0(str1).w();
                }
             }
             if (tb.y.getFollowStatus() == User$FollowStatus.UNFOLLOW && !PatchProxy.applyVoidOneRefs(str, tb, b.class, "3")) {
                p0 = tb.w;
                if (p0 != null && tb.x == null) {
                   tb.D = true;
                   p0 = p0.inflate();
                   tb.x = p0;
                   tb.z = p0.findViewById(0x7f0a0f4c);
                   tb.A = tb.x.findViewById(0x7f0a4374);
                   tb.B = tb.x.findViewById(0x7f0a4381);
                   tb.C = tb.x.findViewById(0x7f0a3f01);
                   tb.z.setOnClickListener(new f(tb));
                   tb.x.setOnClickListener(new g(tb));
                   if (tb.y.getFollowStatus() == User$FollowStatus.FOLLOWING) {
                      tb.B.setText(f.a(tb.y));
                   }else {
                      tb.B.setText(tb.y.mName);
                   }
                   g.b(tb.A, tb.y, HeadImageSize.MIDDLE);
                   tb.C.setText(str);
                   tb.y.b();
                   tb.X7(tb.y.observable().subscribe(new b(tb)));
                   tb.S8(tb.y);
                   p0 = new ClientEvent$ElementPackage();
                   p0.action2 = "BOTTOM_BAR";
                   i3 oi3 = i3.f();
                   oi3.d("popup_type", "OUTSIDE_SHARE");
                   p0.params = oi3.e();
                   u1.B0(new ShowMetaData().setLogPage(tb.u).setElementPackage(p0));
                   p0 = tb.t;
                   if (p0 != null) {
                      p0.onNext(new a(true, new NasaTagInfo()));
                   }
                }
             }
          }
       }
    label_0160 :
       return;
    }
}
