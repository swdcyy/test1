package com.kuaishou.live.core.show.topic.audience.d$a;
import com.kuaishou.live.core.show.topic.audience.d$b;
import com.kuaishou.live.core.show.topic.audience.d;
import java.lang.Object;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailHeaderView;
import com.kuaishou.live.core.show.topic.api.LiveTopicHeaderInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.core.show.topic.audience.e;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailActivityView;
import com.kuaishou.live.core.show.topic.api.LiveTopicActivityInfo;
import java.util.Collection;
import ekd.q;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.CharSequence;
import com.kuaishou.live.common.core.basic.widget.LiveViewFlipper;
import ql2.d;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailActivityView$a;
import com.kuaishou.live.common.core.basic.widget.LiveViewFlipper$a;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.live.external.invoke.deserializer.topic.LiveTopicActivityBasicItemInfo;
import com.kuaishou.live.external.invoke.deserializer.topic.LiveTopicImageTextListActivityItemInfo;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.core.show.topic.audience.a;
import com.yxcorp.gifshow.model.CDNUrl;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import ql2.c;
import android.view.View$OnClickListener;
import com.kuaishou.live.external.invoke.deserializer.topic.LiveTopicImageTextListActivityItemInfo$LiveActivityImageTextListInfo;
import com.kuaishou.live.core.show.topic.audience.b;
import com.kuaishou.live.external.invoke.deserializer.topic.LiveTopicImageActivityItemInfo;
import com.kuaishou.live.external.invoke.deserializer.topic.LiveTopicTextActivityItemInfo;
import android.text.TextUtils;
import com.yxcorp.utility.n;
import ql2.e;
import android.widget.ViewFlipper;
import ql2.b;
import android.content.Context;

public class d$a implements d$b	// class@0011fc
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public void a(LiveAudienceTopicDetailHeaderView p0,LiveTopicHeaderInfo p1){
       int i1;
       int i2;
       View[] viewArray;
       View view;
       String str3;
       String str4;
       LiveTopicActivityBasicItemInfo liveTopicAct2;
       ViewGroup viewGroup3;
       KwaiImageView obj = this;
       Object obj1 = p0;
       LiveAudienceTopicDetailHeaderView obj2 = p1;
       String str = "1";
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, d$a.class, str)) {
          return;
       }
       d$a a = obj.a;
       Objects.requireNonNull(a);
       String str1 = "4";
       if (!PatchProxy.applyVoidTwoRefs(obj1, obj2, a, d.class, str1)) {
          LiveTopicHeaderInfo mTopicActivi = obj2.mTopicActivityInfo;
          e uoe = new e(a, obj2);
          Objects.requireNonNull(p0);
          String str2 = "3";
          if (!PatchProxy.applyVoidTwoRefs(mTopicActivi, uoe, obj1, LiveAudienceTopicDetailHeaderView.class, str2)) {
             obj2 = obj1.I;
             Objects.requireNonNull(obj2);
             int i = 2;
             boolean b = true;
             boolean b1 = false;
             if (PatchProxy.applyVoidTwoRefs(mTopicActivi, uoe, obj2, LiveAudienceTopicDetailActivityView.class, str) || q.f(mTopicActivi.mActivityItemList)) {
                i1 = 1;
                i2 = 0;
             }else {
                a.k(obj2, R.layout.arg_RES_7f0d0e1c, b);
                obj2.findViewById(R.id.live_topic_detail_header_activity_title).setText(mTopicActivi.mActivityTitle);
                LiveViewFlipper liveViewFlip = obj2.findViewById(R.id.live_activity_view_flipper);
                liveViewFlip.a(new d(uoe, mTopicActivi));
                Iterator iterator = mTopicActivi.mActivityItemList.iterator();
                while (iterator.hasNext()) {
                   LiveTopicActivityBasicItemInfo liveTopicAct = iterator.next();
                   LiveTopicActivityBasicItemInfo mActivityTyp = liveTopicAct.mActivityType;
                   if (mActivityTyp != b) {
                      if (mActivityTyp != i) {
                         if (mActivityTyp != 3) {
                            view = null;
                            str3 = str2;
                            str4 = str1;
                         label_01de :
                            if (view != null) {
                               liveViewFlip.addView(view);
                               view.setOnClickListener(new b(uoe, liveTopicAct));
                            }
                            str2 = str3;
                            str1 = str4;
                            i = 2;
                            b = true;
                            b1 = false;
                         }else {
                            LiveTopicActivityBasicItemInfo liveTopicAct1 = liveTopicAct;
                            ViewGroup viewGroup = PatchProxy.applyTwoRefs(liveTopicAct1, uoe, obj2, LiveAudienceTopicDetailActivityView.class, str1);
                            if (viewGroup != PatchProxyResult.class) {
                            }else {
                               viewGroup = a.k(obj2, R.layout.arg_RES_7f0d0e24, b1);
                               KwaiImageView kwaiImageVie = viewGroup.findViewById(R.id.live_topic_detail_header_activity_icon_view);
                               kwaiImageVie.a0(liveTopicAct1.mTopicActivityIconUrls, new a(obj2, kwaiImageVie));
                               viewGroup.findViewById(R.id.live_topic_detail_header_activity_content_view).setText(liveTopicAct1.mTopicActivityContent);
                               ViewGroup viewGroup1 = viewGroup.findViewById(R.id.live_topic_detail_header_activity_scroll_group_container);
                               viewGroup1.setOnClickListener(new c(uoe, liveTopicAct1));
                               Iterator iterator1 = liveTopicAct1.mActivityInfoList.iterator();
                               while (iterator1.hasNext()) {
                                  LiveTopicImageTextListActivityItemInfo$LiveActivityImageTextListInfo liveActivity = iterator1.next();
                                  ViewGroup viewGroup2 = a.k(obj2, R.layout.arg_RES_7f0d0e23, false);
                                  obj = viewGroup2.findViewById(R.id.live_topic_detail_header_activity_item_icon_view);
                                  obj.a0(liveActivity.mIconUrls, new b(obj2, obj));
                                  viewGroup2.findViewById(R.id.live_topic_detail_header_activity_item_content_view).setText(liveActivity.mContent);
                                  viewGroup1.addView(viewGroup2);
                                  iterator1 = iterator1;
                                  str1 = str1;
                               }
                            }
                            str4 = str1;
                            view = viewGroup;
                         label_0171 :
                            str3 = str2;
                            goto label_01de ;
                         }
                      }else {
                         str4 = str1;
                         liveTopicAct2 = liveTopicAct;
                         viewGroup3 = PatchProxy.applyOneRefs(liveTopicAct2, obj2, LiveAudienceTopicDetailActivityView.class, str2);
                         if (viewGroup3 != PatchProxyResult.class) {
                         }else {
                            viewGroup3 = a.k(obj2, R.layout.arg_RES_7f0d0e22, false);
                            viewGroup3.findViewById(R.id.live_topic_detail_header_activity_background).U(liveTopicAct2.mTopicActivityCoverUrls);
                         }
                      }
                   }else {
                      str4 = str1;
                      liveTopicAct2 = liveTopicAct;
                      viewGroup3 = PatchProxy.applyOneRefs(liveTopicAct2, obj2, LiveAudienceTopicDetailActivityView.class, "2");
                      if (viewGroup3 != PatchProxyResult.class) {
                      }else {
                         view = a.k(obj2, 0x7f0d0e25, false);
                         KwaiImageView kwaiImageVie1 = view.findViewById(R.id.live_topic_detail_header_activity_icon_view);
                         View view1 = view.findViewById(R.id.live_topic_detail_header_activity_split_view);
                         TextView textView = view.findViewById(R.id.live_topic_detail_header_activity_time_view);
                         view.findViewById(R.id.live_topic_detail_header_activity_content_view).setText(liveTopicAct2.mTopicActivityContent);
                         if (TextUtils.isEmpty(liveTopicAct2.mTopicActivityTime)) {
                            View[] viewArray1 = new View[]{view1,textView};
                            n.Z(8, viewArray1);
                            str3 = str2;
                         }else {
                            str3 = str2;
                            i = 0;
                            viewArray = new View[2];
                            viewArray[i] = view1;
                            viewArray[1] = textView;
                            n.Z(i, viewArray);
                            textView.setText(liveTopicAct2.mTopicActivityTime);
                         }
                         kwaiImageVie1.a0(liveTopicAct2.mTopicActivityIconUrls, new e(obj2, kwaiImageVie1));
                         goto label_01de ;
                      }
                   }
                   view = viewGroup3;
                   goto label_0171 ;
                }
                if (mTopicActivi.mActivityItemList.size() > 1) {
                   liveViewFlip.setFlipInterval(3000);
                   liveViewFlip.setInAnimation(obj2.getContext(), R.anim.arg_RES_7f0100ac);
                   liveViewFlip.setOutAnimation(obj2.getContext(), R.anim.arg_RES_7f0100ad);
                   liveViewFlip.startFlipping();
                }
                i2 = 0;
                uoe.a(mTopicActivi.mActivityItemList.get(i2));
                i1 = 1;
             }
             viewArray = new View[i1];
             viewArray[i2] = obj1.I;
             n.Z(i2, viewArray);
             viewArray = new View[]{obj1.J,obj1.H};
             n.Z(8, viewArray);
          }
       }
       return;
    }
}
