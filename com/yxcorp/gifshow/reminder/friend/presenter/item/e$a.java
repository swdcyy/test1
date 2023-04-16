package com.yxcorp.gifshow.reminder.friend.presenter.item.e$a;
import d6a.a;
import com.yxcorp.gifshow.reminder.friend.presenter.item.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import im8.f;
import java.lang.Boolean;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.mix.FeedFriendInfo;
import com.kuaishou.android.model.mix.HyperTag;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import android.view.View;
import com.yxcorp.utility.n;
import android.widget.TextView;
import lec.f;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.f3;
import xdc.j;
import java.lang.Runnable;
import ekd.k1;

public class e$a extends a	// class@001ace
{
    public final e b;

    public void e$a(e p0){
       this.b = p0;
       super();
    }
    public void i2(){
       HyperTag mUntruncable;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e$a.class, "1")) {
          return;
       }
       e$a tb = this.b;
       Objects.requireNonNull(tb);
       e uoe = e.class;
       if (!PatchProxy.applyVoid(objArray, tb, uoe, "4") && (tb.s != null && tb.t.get().booleanValue())) {
          e w = tb.w;
          if (w != null) {
             int i = 1;
             if (w.c() == i) {
                CommonMeta mFeedFriendI = tb.s.mFeedFriendInfo;
                if (mFeedFriendI != null) {
                   FeedFriendInfo mOldFeedTips = mFeedFriendI.mOldFeedTips;
                   if (mOldFeedTips != null) {
                      mUntruncable = mOldFeedTips.mUntruncableText;
                   label_004e :
                      if (!TextUtils.x(mUntruncable) && !PatchProxy.applyVoidOneRefs(mUntruncable, tb, uoe, "5")) {
                         if (tb.x == null) {
                            ViewStubInflater2 viewStubInfl = new ViewStubInflater2(0x7f0a101b, 0x7f0a101a);
                            viewStubInfl.d(tb.q.get());
                            tb.x = viewStubInfl.b(0x7f0a101a);
                         }
                         uoe = tb.x;
                         if (uoe != null) {
                            uoe.setAlpha(0x3f800000);
                            tb.x.setScaleX(0x3f800000);
                            tb.x.setScaleY(0x3f800000);
                            View[] viewArray = new View[i];
                            viewArray[0] = tb.x;
                            n.Z(0, viewArray);
                         }
                         uoe = tb.x;
                         if (uoe instanceof TextView) {
                            uoe.setText(mUntruncable);
                         }
                         uoe = tb.p;
                         if (!PatchProxy.applyVoidOneRefs(uoe, objArray, f.class, "10")) {
                            ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                            uContentPack.photoPackage = w1.f(uoe.getEntity());
                            f3 uof3 = f3.l("2984870", "FRIENDS_EARLIER_PHOTOS_BUTTON");
                            uof3.b(uContentPack);
                            uof3.g();
                         }
                         if (tb.z == null) {
                            tb.z = new j(tb);
                         }
                         k1.r(tb.z, 5000);
                      }
                   }
                }
                mUntruncable = objArray;
                goto label_004e ;
             }
          }
       }
    label_00e4 :
       return;
    }
}
