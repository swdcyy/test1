package com.kuaishou.live.common.core.component.pendant.miniwidget.position.lefttop.b;
import lf3.g;
import com.kuaishou.live.common.core.component.pendant.miniwidget.position.lefttop.d;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetUpdate;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z51.i$a;
import java.lang.StringBuilder;
import z51.j;
import p91.m;
import com.kuaishou.livestream.message.nano.LiveCommonActivityWidgetProto$LiveCommonActivityWidget;
import com.kuaishou.livestream.message.nano.LiveCommonActivityWidgetProto$LiveKdsWidgetContent;
import z51.i;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import z51.h;
import com.kuaishou.android.live.log.b;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.livestream.message.nano.LiveCommonActivityWidgetProto$LiveCommonActivityWidgetProperty;
import java.lang.Long;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import rp5.a;
import lp3.c;
import lp3.i;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.b5;
import com.kuaishou.live.common.core.component.pendant.miniwidget.position.lefttop.c;
import java.lang.Number;
import java.util.Random;
import com.yxcorp.utility.SystemUtil;
import o56.a;
import e17.i;
import java.lang.Runnable;
import ekd.k1;
import wv1.s;
import lf3.f;

public final class b implements g	// class@001703
{
    public final d b;

    public void b(d p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       String str1;
       int i;
       boolean b1;
       long l;
       int b2;
       LiveCommonActivityWidgetProto$LiveCommonActivityWidget property;
       b b = this.b;
       Object obj = p0;
       Objects.requireNonNull(b);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(obj, b, uod, "3")) {
       }else {
          i$a uoa = new i$a();
          uoa.g(j.b()+"_"+b.p.s());
          String str = "";
          if (obj != null) {
             LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetUpdate widget = obj.widget;
             if (widget != null) {
                LiveCommonActivityWidgetProto$LiveCommonActivityWidget kdsContent = widget.kdsContent;
                if (kdsContent != null) {
                   LiveCommonActivityWidgetProto$LiveKdsWidgetContent bundleId = kdsContent.bundleId;
                label_004f :
                   uoa.b(bundleId);
                   widget = obj.widget;
                   kdsContent = (widget != null)? widget.id: str;
                   uoa.e(kdsContent);
                   widget = obj.widget;
                   if (widget != null) {
                      kdsContent = widget.kdsContent;
                      if (kdsContent != null) {
                         str = kdsContent.data;
                      }
                   }
                   uoa.c(str);
                   uoa.d(b.p.getLiveStreamId());
                   uoa.f(i.h);
                   i oi = uoa.a();
                   LiveLogTag lIVE_LEFT_TO = LiveLogTag.LIVE_LEFT_TOP_MINI_WIDGET;
                   str1 = "LiveActivityWidgetMessagePresenter";
                   lIVE_LEFT_TO.appendTag(str1);
                   b.S(lIVE_LEFT_TO, j.a(oi.a, h.a)+"leftTop receive tk pendant", "tkPendantTraceInfo", oi.a());
                   i a = oi.a;
                   LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetUpdate obj1 = PatchProxy.applyTwoRefs(obj, a, b, uod, "12");
                   i = 0;
                   if (obj1 != patchProxyRe) {
                      b1 = obj1.booleanValue();
                   }else {
                      String str2 = j.a(a, h.a);
                      obj1 = obj.widget;
                      if (obj1 == null) {
                         b.r(lIVE_LEFT_TO.appendTag(str1), str2+" onReceiveWidgetUpdateSignal widgetUpdateSignal == null");
                      }else {
                         d obj2 = PatchProxy.applyOneRefs(obj1, b, uod, "13");
                         if (obj2 != patchProxyRe) {
                            b2 = obj2.booleanValue();
                         }else if(obj1.itemType == 2){
                            property = obj1.kdsContent;
                            if (property != null && !TextUtils.isEmpty(property.bundleId)) {
                               b2 = true;
                            }
                         }
                         b2 = false;
                         if (!b2) {
                            b.r(lIVE_LEFT_TO.appendTag(str1), str2+" KdsItem content  is not valid");
                         }else {
                            property = obj.widget.property;
                            if (property == null) {
                               b.r(lIVE_LEFT_TO.appendTag(str1), str2+" onReceiveWidgetUpdateSignal widgetUpdateSignal.widget.property == null");
                            }else if(b.p.s() - property.endTime > 0){
                               b.S(lIVE_LEFT_TO.appendTag(str1), str2+" onReceiveWidgetUpdateSignal time expire", "endTime", Long.valueOf(property.endTime));
                            }else {
                               obj2 = b.q;
                               String str3 = (obj2 != null && (obj2.getLivePlayConfig() != null && b.q.getLivePlayConfig().mIsSpecialAccount != null))? 1: null;
                               if (property.grprShow == null && str3) {
                                  b.S(lIVE_LEFT_TO.appendTag(str1), str2+" gr live room not display", "anchorId", b.p.d());
                               }else {
                                  Object obj3 = PatchProxy.apply(null, b, uod, "11");
                                  b2 = (obj3 != patchProxyRe)? obj3.booleanValue(): b.t.a(a.class).X4() ^ 1;
                                  if (b2) {
                                     b.P(lIVE_LEFT_TO.appendTag(str1), str2+" doHandleWidgetUpdateSignalFailed fragment is hide");
                                  }else if(b5.a(b.getActivity())){
                                     b.P(lIVE_LEFT_TO.appendTag(str1), str2+" doHandleWidgetUpdateSignalFailed activity is in multiWindowMode");
                                  }else {
                                     b1 = true;
                                  }
                               }
                            }
                         }
                      }
                      b1 = false;
                   }
                   if (b1) {
                      LiveCommonActivityWidgetProto$LiveCommonActivityWidget maxDelayMill = obj.widget.maxDelayMillis;
                      if (maxDelayMill > 0) {
                         i = 1;
                      }
                      if (i) {
                         b.v = Long.MAX_VALUE;
                         c uoc = new c(b, obj, oi);
                         if (PatchProxy.isSupport(uod)) {
                            obj = PatchProxy.applyOneRefs(Long.valueOf(maxDelayMill), b, uod, "4");
                            if (obj != patchProxyRe) {
                               l = obj.longValue();
                            label_024a :
                               if (SystemUtil.K() && a.d()) {
                                  i.d(R.style.arg_RES_7f11066a, "运营位打散时间："+l);
                               }
                               k1.s(uoc, b, l);
                            }
                         }
                         l = (long)(new Random().nextDouble() * (double)maxDelayMill);
                         goto label_024a ;
                      }else {
                         b.R8(new s(b, obj, oi));
                      }
                   }
                }
             }
          }
          str1 = str;
          goto label_004f ;
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
