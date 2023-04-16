package fia.z$b;
import erd.g;
import fia.z;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.Long;
import bia.f;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.feed.BaseFeed;
import bia.e;
import java.lang.Iterable;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Iterator;
import com.yxcorp.gifshow.follow.common.model.FollowingUserBannerFeed$UserBannerInfo;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.follow.config.model.FollowLiveTipsGuideConfig;
import com.yxcorp.gifshow.follow.config.model.FollowLiveTipsGuideConfig$LiveTipsFullyGuide;
import com.yxcorp.gifshow.follow.config.model.FollowLiveTipsGuideConfig$LiveTipsSimpleGuide;
import com.yxcorp.gifshow.follow.config.model.FollowLiveTipsGuideConfig$LiveTipsFrequency;
import com.yxcorp.gifshow.util.DateUtils;
import java.util.ArrayList;
import kha.a;
import com.kwai.framework.model.user.User;
import java.lang.Number;
import com.yxcorp.gifshow.follow.config.model.FollowLiveTipsFrequencyConfig;
import java.lang.System;
import java.util.Collection;
import java.lang.CharSequence;
import android.text.TextUtils;
import kp.r1;
import com.kwai.feature.api.social.followStagger.model.FeedUserAvatarInfo;
import java.util.Objects;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import com.kuaishou.android.model.mix.CommonMeta;
import nsd.r0;
import java.util.Arrays;
import android.widget.TextView;
import android.text.TextPaint;
import fia.e0;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.animation.AnimatorSet;
import android.view.View;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import lnc.a1;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import com.airbnb.lottie.LottieAnimationView;
import android.widget.ImageView;
import android.animation.Animator;
import fia.i0;
import android.animation.Animator$AnimatorListener;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import fia.c0;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import fia.h0;

public final class z$b implements g	// class@00293e
{
    public final z b;
    public final QPhoto c;

    public void z$b(z p0,QPhoto p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       boolean i1;
       long l;
       FollowLiveTipsGuideConfig$LiveTipsFullyGuide liveTipsFull;
       z b1;
       z g;
       z d;
       TextPaint paint;
       String str4;
       int i2;
       Object[] objArray;
       String str5;
       long l1;
       List list1;
       int b2;
       int b3;
       User mId;
       int i3;
       List list2;
       z oz1;
       Object obj = this;
       f uof = f.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(p0, obj, z$b.class, "1")) {
       }else {
          z i = obj.b.I;
          z$b c = obj.c;
          String str = "5";
          FollowingUserBannerFeed$UserBannerInfo obj1 = null;
          FeedUserAvatarInfo uFeedUserAva = PatchProxy.applyTwoRefs(i, c, obj1, uof, str);
          String str1 = "";
          String str2 = "8";
          String str3 = "13";
          FollowLiveTipsGuideConfig$LiveTipsFrequency liveTipsFreq = 1;
          if (uFeedUserAva != patchProxyRe) {
          }else if(i != null){
             list1 = CollectionsKt___CollectionsKt.f5(i, new e());
          }else {
             list1 = obj1;
          }
          if (list1 != null) {
             Iterator iterator = list1.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   FollowingUserBannerFeed$UserBannerInfo userBannerIn = iterator.next();
                   Object obj2 = PatchProxy.applyTwoRefs(userBannerIn, c, obj1, uof, "7");
                   if (obj2 != patchProxyRe) {
                      i1 = obj2.booleanValue();
                   }else {
                      str4 = "userBannerInfo";
                      a.p(userBannerIn, str4);
                      if (f.a() != null && f.d() != null) {
                         FollowLiveTipsGuideConfig$LiveTipsFullyGuide liveTipsFull1 = f.d();
                         if (liveTipsFull1 != null) {
                            liveTipsFull1 = liveTipsFull1.mPlayText;
                            if (liveTipsFull1 != null) {
                               liveTipsFull1 = (liveTipsFull1.length() > 0)? 1: null;
                               if (liveTipsFull1 == liveTipsFreq) {
                                  liveTipsFull1 = f.d();
                                  if (liveTipsFull1 != null) {
                                     liveTipsFull1 = liveTipsFull1.mStartPlayText;
                                     if (liveTipsFull1 != null) {
                                        FollowLiveTipsGuideConfig$LiveTipsSimpleGuide liveTipsSimp2 = (liveTipsFull1.length() > 0)? 1: null;
                                        if (liveTipsSimp2 == liveTipsFreq && f.e() != null) {
                                           liveTipsSimp2 = f.e();
                                           if (liveTipsSimp2 != null) {
                                              liveTipsSimp2 = liveTipsSimp2.mText;
                                              if (liveTipsSimp2 != null) {
                                                 FollowLiveTipsGuideConfig$LiveTipsFrequency liveTipsFreq1 = (liveTipsSimp2.length() > 0)? 1: null;
                                                 if (liveTipsFreq1 == liveTipsFreq && f.c() != null) {
                                                    String str6 = (userBannerIn.mLiveToastRank != null)? 1: null;
                                                    if (str6) {
                                                       User obj3 = PatchProxy.applyOneRefs(userBannerIn, obj1, uof, "9");
                                                       if (obj3 != patchProxyRe) {
                                                          b2 = obj3.booleanValue();
                                                       }else if(!DateUtils.H(f.b())){
                                                          a.f(new ArrayList());
                                                       }
                                                       obj3 = userBannerIn.mUser.mId;
                                                       a.o(obj3, "userBannerInfo.mUser.mId");
                                                       FollowLiveTipsGuideConfig$LiveTipsFrequency obj4 = PatchProxy.applyOneRefs(obj3, obj1, uof, str3);
                                                       if (obj4 != patchProxyRe) {
                                                          i3 = obj4.intValue();
                                                       }else {
                                                          list2 = f.f();
                                                          if (list2 != null) {
                                                             Iterator iterator1 = list2.iterator();
                                                             int i5 = 0;
                                                             while (iterator1.hasNext()) {
                                                                if (a.g(obj3, iterator1.next().mAnchorId)) {
                                                                   i5 = i5 + 1;
                                                                }
                                                                Object obj6 = 1;
                                                             }
                                                             i3 = i5;
                                                          }else {
                                                             i3 = 0;
                                                          }
                                                       }
                                                       liveTipsFreq = f.c();
                                                       liveTipsFreq = (liveTipsFreq != null)? liveTipsFreq.mPerAnchorDayShowTime: null;
                                                       if (i3 < liveTipsFreq) {
                                                          l1 = System.currentTimeMillis() - f.b();
                                                          liveTipsFreq1 = f.c();
                                                          z oz = null;
                                                          FollowingUserBannerFeed$UserBannerInfo userBannerIn1 = userBannerIn;
                                                          FollowLiveTipsGuideConfig$LiveTipsFrequency mShowInterva = (liveTipsFreq1 != null)? liveTipsFreq1.mShowInterval: oz;
                                                          if (l1 - mShowInterva >= 0) {
                                                             CharSequence obj5 = PatchProxy.apply(null, null, uof, "14");
                                                             if (obj5 != patchProxyRe) {
                                                                b3 = obj5.intValue();
                                                             }else {
                                                                List list3 = f.f();
                                                                b3 = (list3 != null)? list3.size(): 0;
                                                             }
                                                             long l2 = (long)b3;
                                                             obj4 = f.c();
                                                             obj4 = (obj4 != null)? obj4.mDayMaxShowTime: oz;
                                                             if (l2 - obj4 < 0) {
                                                                l2 = (long)f.a;
                                                                obj4 = f.c();
                                                                if (obj4 != null) {
                                                                   oz = obj4.mPerSlideSessionShowTime;
                                                                }
                                                                if (l2 - oz < 0) {
                                                                   userBannerIn = userBannerIn1;
                                                                   obj1 = userBannerIn.mUser;
                                                                   mId = (obj1 != null)? obj1.mId: null;
                                                                   FollowLiveTipsFrequencyConfig uFollowLiveT1 = PatchProxy.apply(null, null, uof, "11");
                                                                   if (uFollowLiveT1 != patchProxyRe) {
                                                                   }else {
                                                                      list2 = f.f();
                                                                      if (list2 != null) {
                                                                         b2 = 1;
                                                                         int i4 = list2.isEmpty() ^ b2;
                                                                         if (i4 == b2) {
                                                                            uFollowLiveT1 = CollectionsKt___CollectionsKt.Y2(list2).mAnchorId;
                                                                            if (uFollowLiveT1 == null) {
                                                                            }
                                                                         }else {
                                                                         }
                                                                      }else {
                                                                      }
                                                                   }
                                                                   if (!TextUtils.equals(mId, uFollowLiveT1)) {
                                                                      b2 = true;
                                                                   }
                                                                }
                                                             }
                                                          }
                                                       label_01c3 :
                                                          userBannerIn = userBannerIn1;
                                                       }
                                                       b2 = false;
                                                       if (b2) {
                                                          obj4 = PatchProxy.applyTwoRefs(userBannerIn, c, null, uof, str2);
                                                          if (obj4 != patchProxyRe) {
                                                             b3 = obj4.booleanValue();
                                                          }else {
                                                             a.p(userBannerIn, str4);
                                                             if (c != null) {
                                                                obj1 = userBannerIn.mUser;
                                                                mId = (obj1 != null)? obj1.mId: null;
                                                                b3 = TextUtils.equals(mId, r1.U1(c.mEntity)) ^ 1;
                                                             }else {
                                                                b3 = 1;
                                                             }
                                                          }
                                                          if (b3 && !r1.p2(userBannerIn.mAvatarInfo.mLiveStreamFeed)) {
                                                             i1 = true;
                                                          }
                                                       }
                                                    }
                                                 }
                                              }
                                           }
                                        }
                                     }
                                  }
                               }
                            }
                         }
                      }
                   label_01ff :
                      i1 = false;
                   }
                   if (i1) {
                      uFeedUserAva = userBannerIn.mAvatarInfo.mLiveStreamFeed;
                   }else {
                      obj1 = null;
                      liveTipsFreq = 1;
                   }
                }
             }
          }
          uFeedUserAva = null;
          if (uFeedUserAva != null) {
             z$b b = obj.b;
             QPhoto qPhoto = new QPhoto(uFeedUserAva);
             Objects.requireNonNull(b);
             if (!PatchProxy.applyVoidOneRefs(qPhoto, b, z.class, str)) {
                str = r1.U1(qPhoto.mEntity);
                QPhoto qPhoto1 = (str == null || !str.length())? 1: null;
                if (!qPhoto1) {
                   str = r1.U1(qPhoto.mEntity);
                   a.m(str);
                   a.o(str, "FeedExt.getUserId\(guidePhoto.mEntity\)!!");
                   if (!PatchProxy.applyVoidOneRefs(str, null, uof, "12")) {
                      a.p(str, "anchorId");
                      f.a = f.a + 1;
                      l1 = System.currentTimeMillis();
                      List list = f.f();
                      FollowLiveTipsFrequencyConfig uFollowLiveT = (list == null || list.isEmpty())? 1: null;
                      if (uFollowLiveT || !DateUtils.I(l1, list.get(0).mGuideShowTime)) {
                         list = new ArrayList();
                      }
                      uFollowLiveT = new FollowLiveTipsFrequencyConfig();
                      uFollowLiveT.mAnchorId = str;
                      uFollowLiveT.mGuideShowTime = l1;
                      list.add(uFollowLiveT);
                      a.f(list);
                   }
                   i1 = 300;
                   if (!PatchProxy.applyVoidOneRefs(qPhoto, b, z.class, str2) && (f.d() == null || f.e() == null)) {
                      l = i1;
                   }else {
                      liveTipsFull = f.d();
                      a.m(liveTipsFull);
                      FollowLiveTipsGuideConfig$LiveTipsSimpleGuide liveTipsSimp1 = f.e();
                      a.m(liveTipsSimp1);
                      if (!PatchProxy.applyVoidThreeRefs(qPhoto, liveTipsFull, liveTipsSimp1, b, z.class, "12")) {
                         User user = qPhoto.getUser();
                         if (user != null) {
                            z c1 = b.C;
                            if (c1 != null) {
                               g.b(c1, user, HeadImageSize.SMALL);
                            }
                         }
                         d = b.D;
                         if (d != null) {
                            str2 = PatchProxy.applyTwoRefs(qPhoto, liveTipsFull, b, z.class, str3);
                            if (str2 != patchProxyRe) {
                            }else {
                               str4 = "java.lang.String.format\(format, *args\)";
                               if ((System.currentTimeMillis() - r1.w0(qPhoto.mEntity).mCreated) - liveTipsFull.mStartPlayTime <= 0) {
                                  liveTipsFull = liveTipsFull.mStartPlayText;
                                  a.o(liveTipsFull, "fullyGuide.mStartPlayText");
                                  i2 = 1;
                                  objArray = new Object[i2];
                                  objArray[0] = str1;
                                  str5 = String.format(liveTipsFull, Arrays.copyOf(objArray, i2));
                                  a.o(str5, str4);
                               }else {
                                  i2 = 1;
                                  liveTipsFull = liveTipsFull.mPlayText;
                                  a.o(liveTipsFull, "fullyGuide.mPlayText");
                                  objArray = new Object[i2];
                                  objArray[0] = str1;
                                  str5 = String.format(liveTipsFull, Arrays.copyOf(objArray, i2));
                                  a.o(str5, str4);
                               }
                               str2 = str5;
                            }
                            d.setText(str2);
                         }
                         b1 = b.D;
                         if (b1 != null) {
                            paint = b1.getPaint();
                            if (paint != null) {
                               paint.setFakeBoldText(true);
                            }
                         }
                         b1 = b.E;
                         if (b1 != null) {
                            b1.setText(qPhoto.getUserName());
                         }
                         b1 = b.E;
                         if (b1 != null) {
                            paint = b1.getPaint();
                            if (paint != null) {
                               paint.setFakeBoldText(true);
                            }
                         }
                         b1 = b.H;
                         if (b1 != null) {
                            b1.setText(liveTipsSimp1.mText);
                         }
                         b1 = b.H;
                         if (b1 != null) {
                            paint = b1.getPaint();
                            if (paint != null) {
                               paint.setFakeBoldText(true);
                            }
                         }
                         b1 = b.A;
                         if (b1 != null) {
                            b1.setOnClickListener(new e0(b, qPhoto));
                         }
                      }
                      b1 = b.B;
                      if (b1 != null && (b.w != null && b.G != null)) {
                         a.m(b1);
                         g = b.G;
                         a.m(g);
                         z w = b.w;
                         a.m(w);
                         AnimatorSet uAnimatorSet = PatchProxy.applyThreeRefs(b1, g, w, null, f.class, "18");
                         if (uAnimatorSet != patchProxyRe) {
                            l = 300;
                         }else {
                            a.p(b1, "tipsGuide");
                            a.p(g, "guideLottie");
                            a.p(w, "tipsView");
                            uAnimatorSet = new AnimatorSet();
                            float[] uofloatArray = new float[]{(b1.getX() + (float)n.z(a.b())) - (float)a1.e(250.00f),b1.getX()};
                            ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(b1, View.TRANSLATION_X, uofloatArray);
                            a.o(objectAnimat, "translationX");
                            l = 300;
                            objectAnimat.setDuration(l);
                            objectAnimat.setInterpolator(new DecelerateInterpolator());
                            ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(b1, View.ALPHA, new float[2]{0,0x3f800000});
                            a.o(objectAnimat1, "alphaGuide");
                            objectAnimat1.setDuration(l);
                            objectAnimat1.setInterpolator(new DecelerateInterpolator());
                            ObjectAnimator objectAnimat2 = ObjectAnimator.ofFloat(g, View.ALPHA, new float[2]{0,0x3f800000});
                            a.o(objectAnimat2, "alphaLottie");
                            objectAnimat2.setDuration(l);
                            objectAnimat2.setInterpolator(new DecelerateInterpolator());
                            w.setAnimation(R.raw.arg_RES_7f0f006e);
                            w.s();
                            ObjectAnimator objectAnimat3 = ObjectAnimator.ofFloat(w, View.SCALE_X, new float[2]{0x3f800000,0x3f000000});
                            a.o(objectAnimat3, "collapseX");
                            objectAnimat3.setDuration(l);
                            objectAnimat3.setInterpolator(new DecelerateInterpolator());
                            ObjectAnimator objectAnimat4 = ObjectAnimator.ofFloat(w, View.SCALE_Y, new float[2]{0x3f800000,0x3f000000});
                            a.o(objectAnimat4, "collapseY");
                            objectAnimat4.setDuration(l);
                            objectAnimat4.setInterpolator(new DecelerateInterpolator());
                            float[] uofloatArray1 = new float[]{w.getX(),w.getX() + (float)a1.e(8.00f)};
                            ObjectAnimator objectAnimat5 = ObjectAnimator.ofFloat(w, View.TRANSLATION_X, uofloatArray1);
                            a.o(objectAnimat5, "translationTips");
                            objectAnimat5.setDuration(l);
                            objectAnimat5.setInterpolator(new DecelerateInterpolator());
                            Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1,objectAnimat2,objectAnimat3,objectAnimat4};
                            uAnimatorSet.playTogether(uAnimatorArr);
                         }
                         uAnimatorSet.addListener(new i0(b));
                         uAnimatorSet.start();
                      }else {
                         l = 300;
                      }
                   }
                   if (!PatchProxy.applyVoid(null, b, z.class, "7") && f.d() != null) {
                      liveTipsFull = f.d();
                      a.m(liveTipsFull);
                      b.X7(t.timer(liveTipsFull.mShowTime, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new c0(b)));
                   }
                   if (PatchProxy.applyVoid(null, b, z.class, "6") || (f.d() != null && f.e() != null)) {
                      liveTipsFull = f.d();
                      a.m(liveTipsFull);
                      FollowLiveTipsGuideConfig$LiveTipsSimpleGuide liveTipsSimp = f.e();
                      a.m(liveTipsSimp);
                      b.X7(t.timer(((liveTipsFull.mShowTime + liveTipsSimp.mShowTime) + l), TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new h0(b)));
                   }
                }
             }
          }
       }
    label_0536 :
       return;
    }
}
