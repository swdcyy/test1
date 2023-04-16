package com.yxcorp.gifshow.reminder.friend.presenter.item.FriendSlidePlayUnreadFinishTipsPresenter$4;
import android.text.style.URLSpan;
import com.yxcorp.gifshow.reminder.friend.presenter.item.g;
import java.lang.String;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.mix.FeedFriendInfo;
import android.net.Uri;
import android.content.Context;
import xh7.b;
import xh7.a;
import qh7.b;
import qh7.a;
import android.text.TextPaint;

public class FriendSlidePlayUnreadFinishTipsPresenter$4 extends URLSpan	// class@001ac9
{
    public final String b;
    public final g c;

    public void FriendSlidePlayUnreadFinishTipsPresenter$4(g p0,String p1,String p2){
       this.c = p0;
       this.b = p2;
       super(p1);
    }
    public void onClick(View p0){
       FeedFriendInfo uFeedFriendI;
       if (PatchProxy.applyVoidOneRefs(p0, this, FriendSlidePlayUnreadFinishTipsPresenter$4.class, "1")) {
          return;
       }
       FriendSlidePlayUnreadFinishTipsPresenter$4 tc = this.c;
       String uRL = this.getURL();
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidTwoRefs(p0, uRL, tc, g.class, "14")) {
          Activity activity = tc.getActivity();
          if (activity != null) {
             g r = tc.r;
             if (r != null) {
                CommonMeta mFeedFriendI = r.mFeedFriendInfo;
                if (mFeedFriendI != null) {
                   uFeedFriendI = mFeedFriendI.mBackToPrePage;
                label_0034 :
                   if (uFeedFriendI != null) {
                      activity.finish();
                   }else {
                      b uob = b.j(p0.getContext(), "");
                      uob.i(Uri.parse(uRL));
                      uob.l(R.anim.arg_RES_7f0100e5, 0x7f010112);
                      a.b(uob, null);
                   }
                }
             }
             uFeedFriendI = null;
             goto label_0034 ;
          }
       }
       this.c.P8(this.b, 0);
       return;
    }
    public void updateDrawState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FriendSlidePlayUnreadFinishTipsPresenter$4.class, "2")) {
          return;
       }
       p0.setUnderlineText(false);
       return;
    }
}
