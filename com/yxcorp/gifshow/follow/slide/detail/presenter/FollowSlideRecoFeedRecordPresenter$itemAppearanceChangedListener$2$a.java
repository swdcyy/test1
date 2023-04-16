package com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideRecoFeedRecordPresenter$itemAppearanceChangedListener$2$a;
import qw6.b;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideRecoFeedRecordPresenter$itemAppearanceChangedListener$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideRecoFeedRecordPresenter;
import com.kwai.robust.PatchProxyResult;
import cia.w;
import kotlin.jvm.internal.a;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Map;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import java.util.Set;
import g7c.a;
import com.yxcorp.gifshow.pymk.log.PymkLogSender;

public final class FollowSlideRecoFeedRecordPresenter$itemAppearanceChangedListener$2$a extends b	// class@001132
{
    public final FollowSlideRecoFeedRecordPresenter$itemAppearanceChangedListener$2 b;

    public void FollowSlideRecoFeedRecordPresenter$itemAppearanceChangedListener$2$a(FollowSlideRecoFeedRecordPresenter$itemAppearanceChangedListener$2 p0){
       this.b = p0;
       super();
    }
    public void Q1(){
       String userId;
       BaseFeed entity;
       String str = "1";
       if (PatchProxy.applyVoid(null, this, FollowSlideRecoFeedRecordPresenter$itemAppearanceChangedListener$2$a.class, str)) {
          return;
       }
       FollowSlideRecoFeedRecordPresenter$itemAppearanceChangedListener$2 this$0 = this.b.this$0;
       Objects.requireNonNull(this$0);
       FollowSlideRecoFeedRecordPresenter uFollowSlide = PatchProxy.apply(null, this$0, FollowSlideRecoFeedRecordPresenter.class, str);
       if (uFollowSlide != PatchProxyResult.class) {
       }else {
          uFollowSlide = this$0.p;
          if (uFollowSlide == null) {
             a.S("mFollowSlideInjectAdapter");
          }
       }
       SlidePlayViewModel slidePlayVie = uFollowSlide.O();
       if (slidePlayVie != null) {
          QPhoto currentPhoto = slidePlayVie.getCurrentPhoto();
          if (currentPhoto != null) {
             a.o(currentPhoto, "currentPhoto ?: return@apply");
             String str1 = "photo.userId";
             if (this.b.this$0.r.containsKey(currentPhoto.getUserId())) {
                userId = currentPhoto.getUserId();
                a.o(userId, str1);
                entity = currentPhoto.getEntity();
                a.o(entity, "photo.entity");
                this.b.this$0.r.put(userId, entity);
             }
             if (currentPhoto.getUser() != null) {
                User user = currentPhoto.getUser();
                a.o(user, "photo.user");
                if (!user.isFollowingOrFollowRequesting() && !this.b.this$0.q.contains(currentPhoto.getPhotoId())) {
                   userId = currentPhoto.getPhotoId();
                   a.o(userId, "photo.photoId");
                   this.b.this$0.q.add(userId);
                   userId = currentPhoto.getUserId();
                   a.o(userId, str1);
                   BaseFeed entity1 = currentPhoto.getEntity();
                   a.o(entity1, "photo.entity");
                   this.b.this$0.r.put(userId, entity1);
                   BaseFeed entity2 = currentPhoto.getEntity();
                   a.o(entity2, "photo.entity");
                   PymkLogSender.reportShowUser(12, null, currentPhoto.getUser(), this.b.this$0.R8(entity2));
                }
             }
          }
       }
    label_00cc :
       return;
    }
}
