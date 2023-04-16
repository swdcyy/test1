package com.kuaishou.live.core.show.wishlist.sendgift.c$d;
import ht5.d;
import com.kuaishou.live.core.show.wishlist.sendgift.c;
import com.yxcorp.gifshow.models.Gift;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.retrofit.model.KwaiException;
import com.kuaishou.live.core.basic.activity.x;
import t02.a0;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.basic.utils.e;
import android.os.SystemClock;
import k2b.e0;
import com.google.gson.JsonElement;
import nn2.r1;
import com.yxcorp.gifshow.model.response.LiveSendNoPanelGiftResponse;
import java.util.Objects;
import java.lang.Integer;
import java.lang.Number;
import java.util.List;
import com.kuaishou.live.core.show.wishlist.model.LiveWishListDetailStat;
import cm1.a;
import android.view.View;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.ProgressBar;
import java.lang.StringBuilder;
import android.text.SpannableStringBuilder;
import java.lang.CharSequence;
import android.text.style.ForegroundColorSpan;
import android.content.res.Resources;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import ekd.d0;

public class c$d implements d	// class@0012f9
{
    public final Gift a;
    public final boolean b;
    public final long c;
    public final c d;

    public void c$d(c p0,Gift p1,boolean p2,long p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public boolean onError(Throwable p0){
       c$d obj = PatchProxy.applyOneRefs(p0, this, c$d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       KwaiException kwaiExceptio = (p0 instanceof KwaiException)? p0.mErrorCode: 0;
       this.d.X8();
       this.d.W8();
       this.d.V8(false, this.a);
       LivePlayFragment livePlayFrag = this.d.u.R().t0();
       c$d td = this.d;
       c u = td.u;
       obj = this.a;
       Gift mId = obj.mId;
       boolean b = (obj.mCanCombo != null && this.b != null)? true: false;
       r1.v(livePlayFrag, u, mId, 1, b, kwaiExceptio, 8, e.r(td.getActivity()), (SystemClock.elapsedRealtime() - this.c), null);
       return false;
    }
    public void onSuccess(Object p0){
       LivePlayFragment livePlayFrag;
       c$d a;
       int b;
       LiveWishListDetailStat obj2;
       int i;
       SpannableStringBuilder spannableStr;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, c$d.class, "1")) {
       }else {
          c$d d = obj.d;
          Gift mId = obj.a.mId;
          Objects.requireNonNull(d);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          c uoc = c.class;
          if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(mId), d, uoc, "10")) {
             livePlayFrag = -1;
             if (PatchProxy.isSupport(uoc)) {
                obj2 = PatchProxy.applyOneRefs(Integer.valueOf(mId), d, uoc, "9");
                if (obj2 != patchProxyRe) {
                   i = obj2.intValue();
                }else {
                label_004f :
                   int i2 = 0;
                   while (true) {
                      if (i2 < d.z.size()) {
                         Gift gift = a.a(d.z.get(i2).mGiftId);
                         if (gift != null && mId == gift.mId) {
                            i = i2;
                         }else {
                            i2 = i2 + 1;
                         }
                      }else {
                         i = -1;
                      }
                   }
                }
             }else {
                goto label_004f ;
             }
             if (i != livePlayFrag) {
                obj2 = d.z.get(i);
                obj2.mCurrentCount = obj2.mCurrentCount + true;
                if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), d, uoc, "18")) {
                   View childAt = d.v.getChildAt(i);
                   if (childAt != null) {
                      LiveWishListDetailStat liveWishList = d.z.get(i);
                      View view = childAt.findViewById(R.id.live_wish_list_detail_complete_tag_image_view);
                      TextView textView = childAt.findViewById(R.id.live_wish_list_detail_gift_progress_title_text_view);
                      ProgressBar progressBar = childAt.findViewById(R.id.live_wish_list_detail_gift_progress_bar);
                      childAt.findViewById(R.id.live_wish_list_detail_gift_progress_container).setVisibility(0);
                      int i1 = 8;
                      childAt.findViewById(R.id.live_wish_list_detail_gift_count).setVisibility(i1);
                      progressBar.setMax(liveWishList.mTargetCount);
                      progressBar.setProgress(liveWishList.mCurrentCount);
                      String str = d.P8(liveWishList.mTargetCount);
                      String str1 = d.P8(liveWishList.mCurrentCount)+"/"+str;
                      b = str.length();
                      if (PatchProxy.isSupport(uoc)) {
                         spannableStr = PatchProxy.applyTwoRefs(str1, Integer.valueOf(b), d, uoc, "19");
                         if (spannableStr != patchProxyRe) {
                         label_0145 :
                            textView.setText(spannableStr);
                            textView.setTypeface(d0.a("alte-din.ttf", a.a().a()));
                            if (liveWishList.mCurrentCount < liveWishList.mTargetCount) {
                               view.setVisibility(i1);
                            }else {
                               view.setVisibility(0);
                            }
                         }
                      }
                      spannableStr = new SpannableStringBuilder();
                      spannableStr.append(str1);
                      spannableStr.setSpan(new ForegroundColorSpan(d.l8().getColor(R.color.arg_RES_7f062007)), ((spannableStr.length() - b) + livePlayFrag), spannableStr.length(), 33);
                      goto label_0145 ;
                   }
                }
             }
          }
       label_0166 :
          obj.d.V8(true, obj.a);
          livePlayFrag = obj.d.u.R().t0();
          d = obj.d;
          c u = d.u;
          a = obj.a;
          Gift mId1 = a.mId;
          b = (a.mCanCombo != null && obj.b != null)? true: false;
          r1.v(livePlayFrag, u, mId1, 1, b, 0, 7, e.r(d.getActivity()), (SystemClock.elapsedRealtime() - obj.c), obj1.mCsLogCorrelateInfo);
       }
       return;
    }
}
