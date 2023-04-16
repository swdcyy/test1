package com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement$l;
import erd.g;
import com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement;
import java.lang.Object;
import java.lang.Number;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.j;
import k2b.c2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import kotlin.jvm.internal.a;
import m9a.t$c;
import java.util.Objects;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import bk5.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import gy9.e;
import com.yxcorp.gifshow.comment.e$c;
import gy9.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.comment.CommentPageListConfig;
import m9a.d;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import zf6.l;
import o56.a;
import android.app.Application;
import com.kwai.emotionsdk.bean.EmotionInfo;
import uid.a;
import com.yxcorp.gifshow.models.QMedia;
import com.yxcorp.gifshow.comment.utils.d;
import android.os.Bundle;
import ak5.j;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import com.kwai.feature.component.commonfragment.baseeditor.FloatEditorFragment;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.i;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$c;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import e8a.r0;
import android.content.DialogInterface$OnShowListener;
import androidx.fragment.app.KwaiDialogFragment;
import e8a.q0;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibleEvent;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibleEvent$Operation;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibilityCause;

public final class IntensifyFollowElement$l implements g	// class@00141a
{
    public final IntensifyFollowElement b;

    public void IntensifyFollowElement$l(IntensifyFollowElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       IntensifyFollowElement z;
       IntensifyFollowElement b;
       EmotionFloatEditorFragment uEmotionFloa;
       Object obj = this;
       int i = p0.intValue();
       j oj = j.class;
       c2 uoc2 = c2.class;
       IntensifyFollowElement intensifyFol = IntensifyFollowElement.class;
       IntensifyFollowElement$l ol = IntensifyFollowElement$l.class;
       if (!PatchProxy.isSupport(ol) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), obj, ol, "1")) {
          ol = 1;
          String str = "";
          String str1 = "mFragment";
          String str2 = "3";
          String str3 = "mPhoto";
          List list = null;
          if (i >= 0) {
             List list1 = obj.b.x0();
             if (list1 != null) {
                if (list1.size() <= i) {
                   ol = null;
                }
                if (ol) {
                   list = list1;
                }
                if (list != null) {
                   ol = obj.b;
                   Object obj1 = list.get(i);
                   a.o(obj1, "it[index]");
                   Objects.requireNonNull(ol);
                   if (!PatchProxy.isSupport(intensifyFol) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), obj1, ol, intensifyFol, "36")) {
                      intensifyFol = ol.u;
                      if (intensifyFol == null) {
                         a.S(str3);
                      }
                      z = ol.z;
                      if (z == null) {
                         a.S(str1);
                      }
                      if (!PatchProxy.isSupport(uoc2) || !PatchProxy.applyVoidThreeRefs(intensifyFol, z, Integer.valueOf(i), null, c2.class, "9")) {
                         c2.c(intensifyFol, z, i, str);
                      }
                      if (!TextUtils.x(obj1.a.a)) {
                         b = ol.B;
                         if (b == null) {
                            a.S("mQuickCommentHelper");
                         }
                         if (!b.a()) {
                            String str4 = obj1.a.a+obj1.a.a+obj1.a.a;
                            intensifyFol = ol.B;
                            if (intensifyFol == null) {
                               a.S("mQuickCommentHelper");
                            }
                            e uoe = new e(ol, i, obj1);
                            Objects.requireNonNull(intensifyFol);
                            if (!PatchProxy.applyVoidTwoRefs(str4, uoe, intensifyFol, oj, str2)) {
                               intensifyFol.b(intensifyFol.c, str4, false, uoe);
                            }
                         }
                      }
                   }
                }
             }
          }else {
             IntensifyFollowElement$l b1 = obj.b;
             Objects.requireNonNull(b1);
             if (!PatchProxy.applyVoid(list, b1, intensifyFol, "37")) {
                intensifyFol = b1.B;
                if (intensifyFol == null) {
                   a.S("mQuickCommentHelper");
                }
                if (!intensifyFol.a()) {
                   intensifyFol = b1.u;
                   if (intensifyFol == null) {
                      a.S(str3);
                   }
                   z = b1.z;
                   if (z == null) {
                      a.S(str1);
                   }
                   if (!PatchProxy.applyVoidTwoRefs(intensifyFol, z, list, uoc2, str2)) {
                      c2.e(intensifyFol, z, str);
                   }
                   b = b1.B;
                   if (b == null) {
                      a.S("mQuickCommentHelper");
                   }
                   c uoc = new c(b1);
                   Objects.requireNonNull(b);
                   if (!PatchProxy.applyVoidOneRefs(uoc, b, oj, "2")) {
                      j b2 = b.b;
                      if (b2 instanceof GifshowActivity) {
                         CommentPageListConfig uCommentPage = d.b(b.d.mPhoto);
                         BaseEditorFragment$Arguments uArguments = new BaseEditorFragment$Arguments().setEnableAtFriends(ol).setEnableInputAt(ol).setMonitorTextChange(ol).setCancelWhileKeyboardHidden(ol).setShowLeftBtn(false).setEnableEmoji(ol).setOnlyShowKwaiEmoji(ol).setSendBtnPermanent(ol).setShowEmojiFirst(false).setShowUserAlias(ol).setEnableEditorOpt(ol).setInterceptEvent(ol).setEnableFinishShowWithSpace(ol).setForceDayNightMode(l.i(false, 16)).setHintText(a.B.getString(R.string.arg_RES_7f100781)).setFinishButtonTextColorResId(R.color.arg_RES_7f061fd5).setSelectUserBizId(1006);
                         if (uCommentPage.mEnableCommentEmotion != null) {
                            uArguments.setEnableNewGifEmotions(ol).setEmotionInfo(b.h);
                         }
                         if (a.a()) {
                            j c = b.c;
                            if (c != null && c.enablePictureCommentForPhoto()) {
                               uArguments.setEnableSendPicture(ol).setQMediaInfo(b.i);
                            }
                         }
                         uArguments.setAtFriendMaxLimit(d.a, R.string.arg_RES_7f100240);
                         uArguments.setTheme(R.style.arg_RES_7f110144);
                         uArguments.setSlidePlay(ol);
                         Bundle uBundle = uArguments.build();
                         uArguments.setForceNewEditorStyle(ol);
                         uBundle.putCharSequence("text", TextUtils.k(b.j));
                         if (j.o().t()) {
                            uEmotionFloa = (uCommentPage.mEnableCommentEmotion != null)? EmotionFloatEditorFragment.vi(uBundle): EmotionFloatEditorFragment.ui(uBundle);
                         }else {
                            uEmotionFloa = new FloatEditorFragment();
                            j.o().d();
                         }
                         uEmotionFloa.setArguments(uBundle);
                         uEmotionFloa.ai(new i(b, uoc));
                         uEmotionFloa.ph(new r0(uEmotionFloa));
                         uEmotionFloa.k0(new q0(b, uEmotionFloa, b2));
                         uEmotionFloa.show(b2.getSupportFragmentManager(), oj.getName());
                         b.e.onNext(Boolean.TRUE);
                         b.f.onNext(new ChangeScreenVisibleEvent(b.c, ChangeScreenVisibleEvent$Operation.CLEAR, ChangeScreenVisibilityCause.SHOW_COMMENT));
                      }
                   }
                }
             }
          }
       }
    label_0257 :
       return;
    }
}
