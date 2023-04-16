package com.kuaishou.live.common.core.component.bottombubble.notices.router.a;
import lc1.b;
import lp3.e;
import android.content.Context;
import java.lang.Object;
import xp5.g;
import java.lang.Class;
import lp3.c;
import xp5.i;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.live.common.core.component.bottombubble.notices.router.a$a;
import java.lang.reflect.Type;
import el.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.handler.LiveCommentNoticeChannelType;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.router.LiveRouterNoticeInfo;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import s81.a;
import android.content.SharedPreferences;
import com.yxcorp.gifshow.util.DateUtils;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.util.HashMap;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.bottombubble.notices.router.LiveRouterNoticeInfo$ButtonInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.router.c;
import com.kuaishou.live.common.core.component.bottombubble.notices.router.b;
import jd1.e;
import nc1.j$a;
import bq5.f$a;
import jd1.b;
import bq5.d;
import nc1.j;
import nc1.k;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.Integer;
import com.kuaishou.android.live.log.b;
import lc1.e;
import lc1.f;
import lc1.d;
import java.util.Arrays;
import lc1.a;
import s51.c;
import com.kuaishou.live.common.core.component.bottombubble.notices.router.LiveRouterNoticeExtraInfo;
import androidx.fragment.app.KwaiDialogFragment;
import va1.m;
import km8.b;
import lnc.i3;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.service.i;
import java.util.Set;
import java.util.Iterator;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.service.i$b;
import va1.x;
import java.util.Map$Entry;
import java.lang.Character;
import java.lang.Number;
import java.lang.StringBuilder;
import java.lang.Float;
import n91.h;
import com.yxcorp.utility.n;
import jd1.a;
import android.content.DialogInterface$OnDismissListener;

public class a implements b	// class@000ff2
{
    public long b;
    public Map c;
    public final Context d;
    public final e e;
    public final g f;
    public final i g;
    public final Type h;
    public final boolean i;
    public KwaiDialogFragment j;

    public void a(e p0,Context p1){
       super();
       this.d = p1;
       this.e = p0;
       g og = p0.a(g.class);
       this.f = og;
       this.g = p0.a(i.class);
       this.i = TextUtils.equals(QCurrentUser.me().getId(), og.d());
       this.h = new a$a(this).getType();
    }
    public void a(LiveCommentNoticeChannelType p0,LiveCommentNoticeBaseInfo p1){
       LiveLogTag obj;
       boolean b;
       SharedPreferences a;
       a uoa = a.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoa, "2")) {
       }else if(PatchProxy.applyVoid(null, this, uoa, "12")){
          long l = System.currentTimeMillis();
          a = a.a;
          String str = "liveRouterNoticeShowTimestamp";
          if (!DateUtils.I(l, a.getLong(str, 0))) {
             SharedPreferences$Editor uEditor = a.edit();
             uEditor.putLong(str, l);
             g.a(uEditor);
             a.P(new HashMap());
          }
       }
       if (this.d(p1)) {
          LiveRouterNoticeInfo mButtonInfo = p1.mButtonInfo;
          obj = PatchProxy.applyOneRefs(mButtonInfo, this, uoa, "8");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(mButtonInfo != null && !TextUtils.isEmpty(mButtonInfo.mButtonText)){
             b = true;
          }else {
             b = false;
          }
          p1.mEnableShowButton = b;
          if (!PatchProxy.applyVoidOneRefs(p1, this, uoa, "4")) {
             j$a uoa1 = new j$a();
             uoa1.f(p1.mPriority);
             uoa1.h(p1.mBizId);
             uoa1.j(p1.mDelayDisplayTimeMs);
             uoa1.c(p1.mDisplayDurationMs);
             uoa1.i(p1.mNoticeType);
             uoa1.e(new c(p1, new b(this)));
             uoa1.d(new b(this, p1));
             this.i(k.class).Y9(uoa1.g());
          }
       }else {
          LiveLogTag lIVE_COMMENT = LiveLogTag.LIVE_COMMENT_NOTICE;
          lIVE_COMMENT.appendTag("LiveRouterNoticeHandler");
          obj = lIVE_COMMENT;
          b.U(obj, "unableShowNoticeWidget", "noticeType", Integer.valueOf(p1.mNoticeType), "bizType", Integer.valueOf(p1.mBizType), "totalShowTimes", Integer.valueOf(p1.mTotalShowTimes));
       }
       return;
    }
    public List b(){
       e obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new e(LiveRouterNoticeInfo.class);
       f[] uofArray = new f[]{f.b(200, this.j(), obj),f.b(104, this.j(), obj)};
       return Arrays.asList(uofArray);
    }
    public f c(){
       return a.b(this);
    }
    public boolean d(LiveRouterNoticeInfo p0){
       LiveLogTag obj3;
       boolean b1;
       LiveLogTag liveLogTag;
       LiveRouterNoticeExtraInfo mFrequencyLi;
       boolean b2;
       Object obj = this;
       Object obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       LiveRouterNoticeInfo obj2 = PatchProxy.applyOneRefs(obj1, obj, uoa, "7");
       if (obj2 != patchProxyRe) {
          return obj2.booleanValue();
       }
       obj2 = obj1.mButtonInfo;
       boolean b = true;
       if (obj2 != null) {
          obj3 = PatchProxy.applyOneRefs(obj2, obj, uoa, "9");
          if (obj3 != patchProxyRe) {
             b1 = obj3.booleanValue();
          }else {
             LiveRouterNoticeInfo$ButtonInfo mRouterUrl = obj2.mRouterUrl;
             b1 = (mRouterUrl != null && obj.i(c.class).P0(mRouterUrl))? true: false;
             LiveRouterNoticeInfo$ButtonInfo mHeightPerce = obj2.mHeightPercent;
             int i = 0;
             if (obj.i != null) {
                if (mHeightPerce - i > 0 && mHeightPerce - 0x3f800000 < 0) {
                label_0059 :
                   b2 = true;
                label_005c :
                   boolean b3 = (b2 && !TextUtils.isEmpty(obj2.mWebUrl))? true: false;
                   liveLogTag = LiveLogTag.LIVE_COMMENT_NOTICE;
                   liveLogTag.appendTag("LiveRouterNoticeHandler");
                   b.U(liveLogTag, "check canHandle", "canRouter", Boolean.valueOf(b1), "isValidHeight", Boolean.valueOf(b2), "canShowH5", Boolean.valueOf(b3));
                   if (b1 || b3) {
                      b1 = true;
                   }else {
                      b1 = false;
                   }
                }
             }else if(mHeightPerce - i > 0){
                goto label_0059 ;
             }
             b2 = false;
             goto label_005c ;
          }
          if (!b1) {
             return false;
          }
       }
       LiveRouterNoticeInfo mExtraInfo = obj1.mExtraInfo;
       b1 = (mExtraInfo == null)? 0: mExtraInfo.mFrequencyLimitType;
       b1 = obj.h(obj.g(b1, obj1.mBizType));
       obj3 = LiveLogTag.LIVE_COMMENT_NOTICE;
       obj3.appendTag("LiveRouterNoticeHandler");
       liveLogTag = obj3;
       b.T(liveLogTag, "check showTimes", "noticeShowedTimes", Integer.valueOf(b1), "totalShowTimes", Integer.valueOf(obj1.mTotalShowTimes));
       if (b1 >= obj1.mTotalShowTimes || (TextUtils.isEmpty(obj1.mSubTitle) && TextUtils.isEmpty(obj1.mDescription))) {
          b = false;
       }
       return b;
    }
    public void dispose(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       m.b(this.j);
       return;
    }
    public final Map e(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, a.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.h;
       String str = a.a.getString("liveRouterNoticeShowedTimes", "null");
       if (str != null && str != "") {
          objArray = b.a(str, obj);
       }
       if (objArray == null) {
          objArray = new HashMap();
       }
       return objArray;
    }
    public String f(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       i3 oi3 = i3.f();
       oi3.d("extra_info", p0);
       Iterator iterator = this.e.a(i.class).y7().iterator();
       while (iterator.hasNext()) {
          Map map = iterator.next().get();
          if (PatchProxy.applyVoidTwoRefs(oi3, map, null, x.class, "6") || map == null) {
             continue ;
          }else {
             Iterator iterator1 = map.entrySet().iterator();
             while (iterator1.hasNext()) {
                Map$Entry uEntry = iterator1.next();
                String key = uEntry.getKey();
                Object value = uEntry.getValue();
                if (value instanceof Character) {
                   oi3.b(key, value);
                }else if(value instanceof Number){
                   oi3.c(key, value);
                   continue ;
                }else if(value instanceof Boolean){
                   oi3.a(key, value);
                   continue ;
                }else if(value instanceof String){
                   oi3.d(key, value);
                   continue ;
                }else {
                   continue ;
                }
             }
          }
       }
       return oi3.e();
    }
    public String g(int p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 == 1) {
          return String.valueOf(p1);
       }else {
          return this.f.d()+p1;
       }
    }
    public final int h(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Integer integer = this.e().get(p0);
       int i = (integer == null)? 0: integer.intValue();
       return i;
    }
    public c i(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.a(p0);
    }
    public final int j(){
       LiveCommentNoticeChannelType[] obj = PatchProxy.apply(null, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new LiveCommentNoticeChannelType[]{LiveCommentNoticeChannelType.LONG_CONNECTION,LiveCommentNoticeChannelType.API_ANCHOR_STATUS,LiveCommentNoticeChannelType.API_USER_STATUS,LiveCommentNoticeChannelType.API_DELAY_INFO,LiveCommentNoticeChannelType.PULL_REQUEST};
       return LiveCommentNoticeChannelType.combineChannels(obj);
    }
    public final boolean k(String p0,float p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), this, uoa, "11");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (!TextUtils.isEmpty(p0) && p1 >= 0) {
          if (this.i != null && p1 - 0x3f800000 >= 0) {
             return b;
          }else {
             c uoc = this.i(h.class);
             if (p1 - 0x3f800000 >= 0) {
                return uoc.Mk(p0);
             }else {
                KwaiDialogFragment kwaiDialogFr = uoc.U9(p0, "LiveRouterNoticeHandler", "LiveRouterNoticeHandler", (int)((float)n.v(this.d) * p1), "3", 0, 0, false);
                this.j = kwaiDialogFr;
                if (kwaiDialogFr != null) {
                   kwaiDialogFr.k0(new a(this));
                }
                if (this.j != null) {
                   b = true;
                }
             }
          }
       }
       return b;
    }
}
