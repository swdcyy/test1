package com.yxcorp.gifshow.reminder.friend.presenter.item.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.w;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.mix.FeedFriendInfo;
import com.kuaishou.android.model.mix.HyperTag;
import ekd.j;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import lec.u;
import java.lang.Boolean;
import hm8.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import ekd.k1;
import com.yxcorp.gifshow.util.DateUtils;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import im8.f;
import android.view.View;
import xdc.l;
import android.view.View$OnClickListener;
import android.graphics.drawable.Drawable;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import tkd.b;
import tkd.d;
import hn5.n;
import android.app.Activity;
import android.content.Context;
import android.widget.TextView;
import com.yxcorp.gifshow.hypertag.KwaiHyperTagView;
import com.yxcorp.gifshow.hypertag.a;
import xdc.q;
import android.widget.LinearLayout;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.gifshow.hypertag.a$a;
import com.yxcorp.gifshow.hypertag.a$d;
import com.yxcorp.gifshow.hypertag.a$c;
import com.yxcorp.gifshow.hypertag.a$b;
import android.widget.ImageView;
import xdc.r;
import com.yxcorp.utility.n;
import android.text.method.MovementMethod;
import android.text.method.LinkMovementMethod;
import android.text.SpannableStringBuilder;
import android.text.Html$ImageGetter;
import android.text.Html$TagHandler;
import android.text.Spanned;
import android.text.Html;
import android.text.style.URLSpan;
import android.net.Uri;
import ekd.x0;
import java.lang.Integer;
import android.text.style.StyleSpan;
import com.yxcorp.gifshow.reminder.friend.presenter.item.FriendSlidePlayUnreadFinishTipsPresenter$4;
import java.net.URLDecoder;
import android.widget.TextView$BufferType;
import com.yxcorp.gifshow.reminder.friend.presenter.item.f;
import vy6.a;
import com.google.gson.JsonObject;
import lec.f;
import k2b.h;
import crd.b;
import lnc.b9;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class g extends PresenterV2	// class@001ad2
{
    public QPhoto p;
    public BaseFragment q;
    public CommonMeta r;
    public f s;
    public View t;
    public View u;
    public f v;
    public SlidePlayViewModel w;
    public a x;
    public a y;

    public void g(){
       super();
    }
    public void E8(){
       int b;
       AtomicBoolean uAtomicBoole1;
       boolean i;
       View[] viewArray;
       int i3;
       int i4;
       int i5;
       URLSpan[] uRLSpanArray;
       int i7;
       Spanned spanned1;
       SlidePlayViewModel slidePlayVie = this;
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, slidePlayVie, og, "3")) {
          return;
       }
       SlidePlayViewModel slidePlayVie1 = SlidePlayViewModel.B0(slidePlayVie.q.getParentFragment());
       slidePlayVie.w = slidePlayVie1;
       if (slidePlayVie1 == null) {
          return;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (!PatchProxy.applyVoid(objArray, slidePlayVie, og, "5") && slidePlayVie.w != null) {
          QPhoto mEntity = slidePlayVie.p.mEntity;
          if (mEntity != null && !w.r0(mEntity)) {
             g r = slidePlayVie.r;
             if (r != null) {
                CommonMeta mFeedFriendI = r.mFeedFriendInfo;
                if (mFeedFriendI != null && mFeedFriendI.mHasShownUnreadFinishTips == null) {
                   FeedFriendInfo mUnreadFinis = mFeedFriendI.mUnreadFinishTips;
                   FeedFriendInfo uFeedFriendI = PatchProxy.applyOneRefs(mFeedFriendI, objArray, og, "16");
                   if (uFeedFriendI != patchProxyRe) {
                   }else {
                      uFeedFriendI = mFeedFriendI.mUnreadFinishHyperTag;
                      if (uFeedFriendI != null && (!j.h(uFeedFriendI.mIcons) && (TextUtils.x(uFeedFriendI.mUntruncableText) || TextUtils.x(uFeedFriendI.mActionUrl)))) {
                         mFeedFriendI.mUnreadFinishHyperTag = objArray;
                      }
                      uFeedFriendI = mFeedFriendI.mUnreadFinishHyperTag;
                   }
                   Object obj = uFeedFriendI;
                   if (!TextUtils.x(mUnreadFinis) || obj != null) {
                      AtomicBoolean uAtomicBoole = new AtomicBoolean(false);
                      String str = "1";
                      ViewStubInflater2 obj1 = PatchProxy.applyOneRefs(uAtomicBoole, objArray, u.class, str);
                      if (obj1 != patchProxyRe) {
                         b = obj1.booleanValue();
                      }else {
                         b = a.c();
                         if (b > 0) {
                            int i8 = u.a();
                            i = DateUtils.I(a.a.getLong(b.d("user")+"friend_slide_play_unread_finish_tips_last_show_timestamp", 0), k1.i());
                            uAtomicBoole.set(i);
                            if (i && b >= i8) {
                               b = false;
                            }
                         }
                         b = true;
                      }
                      if (b) {
                         if (PatchProxy.applyVoidTwoRefs(mUnreadFinis, obj, slidePlayVie, og, "7")) {
                            uAtomicBoole1 = uAtomicBoole;
                         }else if(slidePlayVie.u == null){
                            i = 0x7f0a101c;
                            obj1 = new ViewStubInflater2(0x7f0a101d, i);
                            obj1.d(slidePlayVie.v.get());
                            View view = obj1.b(i);
                            slidePlayVie.u = view;
                            view.setOnClickListener(new l(slidePlayVie));
                            slidePlayVie.u.setBackground(a1.f(R.color.arg_RES_7f062030));
                            view = slidePlayVie.u.findViewById(R.id.unread_finish_tips_container);
                            if (view.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
                               ViewGroup$MarginLayoutParams layoutParams = view.getLayoutParams();
                               float f = (d.a(-1883158055).U3(this.getActivity()))? 80.00f: 164.00f;
                               layoutParams.bottomMargin = a1.e(f);
                            }
                         }
                         View view1 = slidePlayVie.u.findViewById(0x7f0a42da);
                         View view2 = slidePlayVie.u.findViewById(0x7f0a1305);
                         int i1 = 2;
                         int i2 = 8;
                         if (view2 != null && obj != null) {
                            q oq = PatchProxy.applyOneRefs(obj, objArray, og, "10");
                            if (oq != patchProxyRe) {
                            }else {
                               oq = new q(obj);
                            }
                            if (!PatchProxy.applyVoidOneRefs(oq, view2, KwaiHyperTagView.class, str)) {
                               view2.n = oq;
                               if (oq == null) {
                                  if (!PatchProxy.applyVoid(objArray, view2, KwaiHyperTagView.class, "2")) {
                                     view2.setVisibility(i2);
                                  }
                               }else {
                                  view2.setVisibility(0);
                                  String[] stringArray = oq.h();
                                  if (stringArray != null && stringArray.length > 0) {
                                     ImageRequest[] imageRequest = new ImageRequest[stringArray.length];
                                     i3 = 0;
                                     while (i3 < stringArray.length) {
                                        if (!TextUtils.x(stringArray[i3])) {
                                           imageRequest[i3] = ImageRequest.c(stringArray[i3]);
                                        }
                                        i3 = i3 + 1;
                                     }
                                     view2.b(imageRequest, oq.p(), oq.i(), oq.n());
                                  }else {
                                     view2.b(objArray, oq.p(), oq.i(), oq.n());
                                  }
                                  view2.setShowDivider(oq.k());
                                  view2.setShowMoreArrow(oq.l());
                                  view2.setShowMoreContainer(oq.m());
                                  view2.setReasonMoreMargin(oq.j());
                                  a$a uoa = oq.e();
                                  if (uoa != null) {
                                     view2.d(uoa.a, uoa.b, uoa.c);
                                  }else {
                                     view2.d(objArray, objArray, oq.g());
                                  }
                                  a$d uod = oq.c();
                                  if (uod != null) {
                                     view2.f(uod.a, uod.b, uod.c);
                                  }else {
                                     view2.f(objArray, objArray, oq.g());
                                  }
                                  a$c uoc = oq.d();
                                  if (uoc != null) {
                                     view2.e(uoc.a, uoc.b, uoc.c);
                                  }else {
                                     view2.e(objArray, objArray, oq.g());
                                  }
                                  a$b uob = oq.a();
                                  if (uob == null) {
                                     view2.e.setVisibility(i2);
                                  }else {
                                     view2.c(uob.c, uob.a, uob.b);
                                  }
                                  view2.setBackground(oq.f());
                               }
                            }
                            HyperTag mActionUrl = obj.mActionUrl;
                            HyperTag hyperTag = mActionUrl;
                            HyperTag hyperTag1 = mActionUrl;
                            if (!PatchProxy.applyVoidThreeRefs(view2, obj, hyperTag, this, g.class, "11")) {
                               view2.setOnClickListener(new r(slidePlayVie, hyperTag1, obj));
                            }
                            viewArray = new View[i1];
                            viewArray[0] = slidePlayVie.u;
                            i3 = 1;
                            viewArray[i3] = view2;
                            n.Z(0, viewArray);
                            viewArray = new View[i3];
                            viewArray[0] = view1;
                            n.Z(i2, viewArray);
                            uAtomicBoole1 = uAtomicBoole;
                            i4 = 1;
                            i5 = 0;
                            b = 8;
                         }else {
                            b = 0;
                            i3 = true;
                            if (view1 != null && !TextUtils.x(mUnreadFinis)) {
                               view1.setLinksClickable(i3);
                               view1.setMovementMethod(LinkMovementMethod.getInstance());
                               view1.setHighlightColor(b);
                               SpannableStringBuilder spannableStr = PatchProxy.applyOneRefs(mUnreadFinis, slidePlayVie, og, "12");
                               if (spannableStr != patchProxyRe) {
                                  uAtomicBoole1 = uAtomicBoole;
                               }else {
                                  Spanned spanned = Html.fromHtml(mUnreadFinis, objArray, objArray);
                                  SpannableStringBuilder spannableStr1 = new SpannableStringBuilder(spanned);
                                  URLSpan[] spans = spannableStr1.getSpans(b, spanned.length(), URLSpan.class);
                                  b = spans.length;
                                  int i6 = 0;
                                  while (i6 < b) {
                                     object oobject = spans[i6];
                                     String uRL = oobject.getURL();
                                     Uri uri = x0.f(uRL);
                                     String scheme = (uri != null)? uri.getScheme(): null;
                                     String host = (uri != null)? uri.getHost(): null;
                                     if (uri != null && (host == null || TextUtils.x(scheme))) {
                                        uRLSpanArray = spans;
                                        i7 = b;
                                     label_03ac :
                                        spanned1 = spanned;
                                        uAtomicBoole1 = uAtomicBoole;
                                     }else {
                                        uRLSpanArray = spans;
                                        i4 = spannableStr1.getSpanStart(oobject);
                                        i7 = b;
                                        b = spannableStr1.getSpanEnd(oobject);
                                        if (i4 >= 0) {
                                           uAtomicBoole1 = uAtomicBoole;
                                           if (b > mUnreadFinis.length()) {
                                              spanned1 = spanned;
                                           }else {
                                              String str1 = spanned.toString();
                                              if (PatchProxy.isSupport(og)) {
                                                 spanned1 = spanned;
                                                 str = PatchProxy.applyThreeRefs(str1, Integer.valueOf(i4), Integer.valueOf(b), null, g.class, "17");
                                                 if (str != patchProxyRe) {
                                                 label_0344 :
                                                    if (!TextUtils.x(str)) {
                                                       i3 = spannableStr1.getSpanFlags(oobject);
                                                       spannableStr1.removeSpan(oobject);
                                                       if (PatchProxy.isSupport(og)) {
                                                          Object[] objArray1 = new Object[]{spannableStr1,Integer.valueOf(i4),Integer.valueOf(b),uRL,Integer.valueOf(i3),mUnreadFinis};
                                                          if (!PatchProxy.applyVoid(objArray1, slidePlayVie, og, "13")) {
                                                          }
                                                       }else {
                                                       }
                                                    }
                                                 }
                                              }else {
                                                 spanned1 = spanned;
                                              }
                                              str = str1.substring(i4, b);
                                              goto label_0344 ;
                                           }
                                        }else {
                                           goto label_03ac ;
                                        }
                                     }
                                     i6 = i6 + 1;
                                     spans = uRLSpanArray;
                                     b = i7;
                                     uAtomicBoole = uAtomicBoole1;
                                     spanned = spanned1;
                                     oobject = 8;
                                  }
                                  uAtomicBoole1 = uAtomicBoole;
                                  spannableStr = spannableStr1;
                               }
                               view1.setText(spannableStr, TextView$BufferType.SPANNABLE);
                               viewArray = new View[]{slidePlayVie.u,view1};
                               i5 = 0;
                               i4 = 1;
                               n.Z(i5, viewArray);
                               viewArray = new View[i4];
                               viewArray[i5] = view2;
                               b = 8;
                               n.Z(b, viewArray);
                            }else {
                               uAtomicBoole1 = uAtomicBoole;
                               i4 = 1;
                               i5 = 0;
                               b = 8;
                               viewArray = new View[i4];
                               viewArray[i5] = slidePlayVie.u;
                               n.Z(b, viewArray);
                            }
                         }
                         viewArray = new View[i4];
                         viewArray[i5] = slidePlayVie.t;
                         n.Z(b, viewArray);
                         if (slidePlayVie.x == null) {
                            f uof = new f(this, mFeedFriendI, obj, mUnreadFinis, uAtomicBoole1);
                            slidePlayVie.x = uAtomicBoole;
                            slidePlayVie.w.P(slidePlayVie.q, uAtomicBoole);
                         }
                      }
                   }
                }
             }
          }
       }
    label_0411 :
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, g.class, "4")) {
          return;
       }
       this.R8();
       return;
    }
    public void P8(String p0,int p1){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, og, "15")) {
          return;
       }
       this.R8();
       JsonObject jsonObject = f.a(this.r.mFeedFriendInfo, this.p);
       if (!PatchProxy.isSupport(f.class) || !PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), jsonObject, null, f.class, "7")) {
          h oh = h.m("2859446", "NEW_PHOTO_FINISHED_BUTTON");
          oh.n(f.b(p0, p1, jsonObject));
          oh.h();
       }
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, g.class, "8")) {
          return;
       }
       View[] viewArray = new View[]{this.u};
       n.Z(8, viewArray);
       View[] viewArray1 = new View[]{this.t};
       n.Z(0, viewArray1);
       this.s.set(Boolean.TRUE);
       g tw = this.w;
       if (tw != null) {
          g tx = this.x;
          if (tx != null) {
             tw.D(this.q, tx);
             this.x = null;
          }
       }
       b9.a(this.y);
       this.y = null;
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a3a43);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.r = this.q8(CommonMeta.class);
       this.q = this.r8("DETAIL_FRAGMENT");
       this.s = this.x8("SHOW_BUBBLE_ENABLE");
       this.v = this.x8("FRIEND_SLIDE_PLAY_ITEM_VIEW_STUB_ROOT_VIEW");
       return;
    }
}
