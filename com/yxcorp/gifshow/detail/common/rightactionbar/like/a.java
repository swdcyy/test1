package com.yxcorp.gifshow.detail.common.rightactionbar.like.a;
import erd.g;
import com.yxcorp.gifshow.detail.common.rightactionbar.like.LikeElement;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import qp7.t0;
import qp7.b;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import e17.i;
import com.kwai.framework.model.user.QCurrentUser;
import o56.a;
import android.app.Application;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import tkd.b;
import tkd.d;
import gx5.d;
import com.yxcorp.gifshow.entity.QPhoto;
import io.reactivex.subjects.PublishSubject;
import p1a.a$a;
import pz9.f;
import tl8.g;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import p1a.a;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import uf5.x;
import java.lang.StringBuilder;
import de5.a;
import p5a.e;
import com.kwai.framework.player.core.b;
import uf5.b$a;
import lnc.i3;
import com.kuaishou.android.model.music.Music;
import java.lang.Long;
import java.lang.Number;
import up.a;
import com.kuaishou.android.model.actionreport.PhotoActionReportParams;
import java.lang.Integer;
import qp7.x0;
import com.kwai.slide.play.detail.rightactionbar.like.b;

public final class a implements g	// class@0014a5
{
    public final LikeElement b;

    public void a(LikeElement p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       p0 = LikeElement.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, p0, "7")) {
       }else {
          int i = 1;
          if (!VisitorModeManager.g(i)) {
             if (tb.H().k0()) {
                i.a(R.style.arg_RES_7f11066a, 0x7f10054d);
             }else {
                String str = "";
                if (!QCurrentUser.ME.isLogined()) {
                   if (!PatchProxy.applyVoid(objArray, tb, p0, "21")) {
                      p0 = a.B.getString(R.string.arg_RES_7f103079);
                      if (!TextUtils.x(tb.t.U2()) && d.a(-1188553266).VA(tb.t.U2(), str)) {
                         tb.s0(tb.t, p0, 27);
                      }else {
                         tb.s0(tb.t, p0, 18);
                      }
                   }
                }else if(tb.v.isLiked()){
                   tb.H().q1.onNext(Boolean.FALSE);
                   tb.u0();
                   tb.r0();
                   if (QCurrentUser.ME.isLogined()) {
                      LikeElement v = tb.v;
                      if (!PatchProxy.applyVoidOneRefs(v, tb, p0, "14")) {
                         a$a uoa = a$a.a(i, str);
                         uoa.r(i);
                         uoa.h(new f(v));
                         uoa.f("DISLIKE_PHOTO");
                         uoa.j(v.getFeedLogCtx());
                         tb.x.a(uoa);
                      }
                   }
                }else {
                   tb.H().q1.onNext(Boolean.TRUE);
                   if (!PatchProxy.isSupport(p0) || !PatchProxy.applyVoidOneRefs(Boolean.FALSE, tb, p0, "15")) {
                      objArray = new Object[2];
                      int i1 = 0;
                      String str1 = "_";
                      str = (tb.w.getDetailCommonParam().getPreUserId() == null)? str1: tb.w.getDetailCommonParam().getPreUserId();
                      objArray[i1] = str;
                      if (tb.w.getDetailCommonParam().getPrePhotoId() != null) {
                         str1 = tb.w.getDetailCommonParam().getPrePhotoId();
                      }
                      objArray[i] = str1;
                      new x(tb.v, tb.t.getUrl()+"#like", tb.w.getDetailCommonParam().getPreExpTag(), String.format("%s/%s", objArray)).b(tb.t, false, tb.B.c(), tb.B.getPlayer().getCurrentPosition());
                   }
                   tb.q0();
                   if (!PatchProxy.isSupport(p0) || (!PatchProxy.applyVoidOneRefs(Boolean.FALSE, tb, p0, "16") && b$a.c())) {
                      p0 = new a$a(i, 306, "like_photo");
                      p0.r(i);
                      i3 oi3 = i3.f();
                      if (tb.v.getVideoDuration() > 0 || tb.v.getMusic() != null) {
                         oi3.c("like_photo_duration", Long.valueOf(tb.u.getPlayer().getCurrentPosition()));
                      }
                      if (tb.v.getActionReportFetcher() != null && tb.v.getActionReportFetcher().a() != null) {
                         oi3.c("play_cnt", Integer.valueOf(tb.v.getActionReportFetcher().a().mPlayCnt));
                         oi3.c("play_time", Long.valueOf(tb.v.getActionReportFetcher().a().mActionRelativeTime));
                      }
                      p0.m(oi3.e());
                      p0.j(tb.v.getFeedLogCtx());
                      p0.r(i);
                      tb.x.a(p0);
                   }
                }
             label_021b :
                tb.E().i(tb.v.isLiked());
             }
          }
       }
       return;
    }
}
