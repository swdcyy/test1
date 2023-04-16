package com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowSummaryPresenter$d;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowSummaryPresenter;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.gifshow.postwork.PostStatus;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import vja.c;
import uf5.x;
import n3d.a;

public final class HomeFollowSummaryPresenter$d implements View$OnClickListener	// class@0011ff
{
    public final HomeFollowSummaryPresenter b;

    public void HomeFollowSummaryPresenter$d(HomeFollowSummaryPresenter p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       String str;
       HomeFollowSummaryPresenter$d tb;
       GifshowActivity activity;
       HomeFollowSummaryPresenter r;
       QPhoto mEntity;
       Object[] objArray1;
       HomeFollowSummaryPresenter homeFollowSu = HomeFollowSummaryPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeFollowSummaryPresenter$d.class, "1")) {
          return;
       }
       HomeFollowSummaryPresenter p = this.b.p;
       if (p != null) {
          Object[] objArray = null;
          PhotoMeta mPostWorkSta = (p != null)? p.mPostWorkStatus: objArray;
          boolean b = false;
          if (mPostWorkSta != null) {
             mPostWorkSta = (p != null)? p.mPostWorkStatus: objArray;
             if (mPostWorkSta != PostStatus.UPLOAD_COMPLETE) {
                str = null;
             label_002b :
                if (str) {
                   a.m(p);
                   String str1 = "mQPhoto.mEntity";
                   if (!p.isLiked()) {
                      tb = this.b;
                      Objects.requireNonNull(tb);
                      if (!PatchProxy.applyVoid(objArray, tb, homeFollowSu, "21")) {
                         activity = tb.getActivity();
                         String str2 = "";
                         r = tb.r;
                         if (r == null) {
                            a.S("mQPhoto");
                         }
                         mEntity = r.mEntity;
                         a.o(mEntity, str1);
                         str2 = str2+c.a(mEntity)+"#like";
                         p = tb.r;
                         if (p == null) {
                            a.S("mQPhoto");
                         }
                         new x(p, str2, "").a(activity, b);
                      }
                   }else {
                      tb = this.b;
                      Objects.requireNonNull(tb);
                      if (!PatchProxy.applyVoid(objArray, tb, homeFollowSu, "22")) {
                         activity = tb.getActivity();
                         String str3 = "";
                         r = tb.r;
                         if (r == null) {
                            a.S("mQPhoto");
                         }
                         mEntity = r.mEntity;
                         a.o(mEntity, str1);
                         str3 = str3+c.a(mEntity)+"#unlike";
                         p = tb.r;
                         if (p == null) {
                            a.S("mQPhoto");
                         }
                         new x(p, str3, "").h(activity, objArray);
                      }
                   }
                }
             }
          }
          str = 1;
          goto label_002b ;
       }
    label_00c8 :
       return;
    }
}
