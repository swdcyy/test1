package com.yxcorp.gifshow.ad.detail.vm.rightactionbar.like.a;
import erd.g;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.like.AdLikeElement;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.user.QCurrentUser;
import p1a.a$a;
import i29.b;
import tl8.g;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.yxcorp.gifshow.activity.GifshowActivity;
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
import qp7.x0;
import qp7.b;
import com.kwai.slide.play.detail.rightactionbar.like.b;

public final class a implements g	// class@001726
{
    public final AdLikeElement b;

    public void a(AdLikeElement p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       p0 = AdLikeElement.class;
       if (PatchProxy.applyVoid(null, tb, p0, "2")) {
       }else {
          int i = 1;
          if (tb.u.isLiked()) {
             tb.r0();
             tb.q0();
             if (QCurrentUser.ME.isLogined()) {
                AdLikeElement u = tb.u;
                if (!PatchProxy.applyVoidOneRefs(u, tb, p0, "8")) {
                   a$a uoa = a$a.a(i, "");
                   uoa.r(i);
                   uoa.h(new b(u));
                   uoa.f("DISLIKE_PHOTO");
                   uoa.j(u.getFeedLogCtx());
                   tb.w.a(uoa);
                }
             }
          }else if(PatchProxy.isSupport(p0) && PatchProxy.applyVoidOneRefs(Boolean.FALSE, tb, p0, "9")){
             Object[] objArray = new Object[2];
             int i1 = 0;
             String str = "_";
             String str1 = (tb.v.getDetailCommonParam().getPreUserId() == null)? str: tb.v.getDetailCommonParam().getPreUserId();
             objArray[i1] = str1;
             if (tb.v.getDetailCommonParam().getPrePhotoId() != null) {
                str = tb.v.getDetailCommonParam().getPrePhotoId();
             }
             objArray[i] = str;
             new x(tb.u, tb.t.getUrl()+"#like", tb.v.getDetailCommonParam().getPreExpTag(), String.format("%s/%s", objArray)).b(tb.t, false, tb.A.c(), tb.A.getPlayer().getCurrentPosition());
          }
          tb.p0();
          if (!PatchProxy.isSupport(p0) || (!PatchProxy.applyVoidOneRefs(Boolean.FALSE, tb, p0, "10") && b$a.c())) {
             p0 = new a$a(i, 306, "like_photo");
             p0.r(i);
             i3 oi3 = i3.f();
             if (tb.u.getVideoDuration() > 0 || tb.u.getMusic() != null) {
                oi3.c("like_photo_duration", Long.valueOf(tb.A.getPlayer().getCurrentPosition()));
             }
             p0.m(oi3.e());
             p0.j(tb.u.getFeedLogCtx());
             p0.r(i);
             tb.w.a(p0);
          }
       label_0154 :
          tb.E().i(tb.u.isLiked());
       }
       return;
    }
}
