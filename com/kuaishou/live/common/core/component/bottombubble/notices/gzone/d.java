package com.kuaishou.live.common.core.component.bottombubble.notices.gzone.d;
import com.kuaishou.live.common.core.component.bottombubble.notices.gzone.f$a;
import com.kuaishou.live.common.core.component.bottombubble.notices.gzone.e;
import lp3.e;
import com.kuaishou.live.common.core.component.bottombubble.notices.gzone.LiveGzoneCommonNoticeInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import ez1.a;
import s81.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import mc1.a;
import java.util.Objects;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.gzone.LiveGzoneCommonNoticeInfo$ExtraInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import hz1.a;
import lp3.c;
import xp5.g;
import zc1.c;
import java.lang.reflect.Type;
import el.a;
import java.util.LinkedHashMap;
import com.kwai.live.gzone.util.LruMap;
import java.util.Map;
import java.util.HashMap;
import java.lang.Integer;
import zc1.d;
import java.lang.System;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Long;
import com.yxcorp.gifshow.util.DateUtils;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class d extends f$a	// class@000fc5
{
    public final LiveGzoneCommonNoticeInfo d;
    public final e e;

    public void d(e p0,e p1,LiveGzoneCommonNoticeInfo p2){
       this.e = p0;
       this.d = p2;
       super(p1);
    }
    public void onShow(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "1")) {
          return;
       }
       LiveCommentNoticeBaseInfo mNoticeType = this.d.mNoticeType;
       d uod = 30;
       if (mNoticeType != 103 && (mNoticeType != uod && mNoticeType != 52)) {
          return;
       }
       if (mNoticeType == uod && !PatchProxy.applyVoid(objArray, objArray, a.class, "3")) {
          SharedPreferences$Editor uEditor2 = a.a.edit();
          uEditor2.putString(b.d("user")+"gzonePasswordLotteryNoticeShowTime", a.a());
          g.a(uEditor2);
       }
       uod = this.d;
       a.f(this.e.e.a(), String.valueOf(this.d.mNoticeType), uod.mBizId, this.e.d(uod));
       d te = this.e;
       d td = this.d;
       Objects.requireNonNull(te);
       e uoe = e.class;
       if (!PatchProxy.applyVoidOneRefs(td, te, uoe, "8")) {
          LiveGenericCommentNoticeInfo mExtraInfo = td.mExtraInfo;
          if (mExtraInfo != null && (mExtraInfo.canShowTimes != null || mExtraInfo.mDailyShowTimes != null)) {
             String obj = PatchProxy.apply(objArray, te, uoe, "4");
             int i = 1;
             int i1 = 0;
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else {
                a uoa = te.d.a(a.class);
                b = (uoa.l() && !uoa.h4())? false: true;
             }
             if (b) {
                obj = te.d.a(g.class).getLiveStreamId();
                int i2 = 10;
                if (td.mExtraInfo.canShowTimes > null) {
                   LinkedHashMap linkedHashMa = a.e(new c(te).getType());
                   LruMap lruMap = new LruMap(i2);
                   if (linkedHashMa != null) {
                      lruMap.putAll(linkedHashMa);
                   }
                   Map map = lruMap.get(obj);
                   if (map == null) {
                      map = new HashMap();
                      lruMap.put(obj, map);
                   }
                   Integer integer = map.get(Integer.valueOf(td.mBizType));
                   if (integer != null) {
                      map.put(Integer.valueOf(td.mBizType), Integer.valueOf((integer.intValue() + i)));
                   }else {
                      map.put(Integer.valueOf(td.mBizType), Integer.valueOf(i));
                   }
                   SharedPreferences$Editor uEditor = a.a.edit();
                   uEditor.putString("gzoneLiveStreamNoticeShowMap", b.e(lruMap));
                   g.a(uEditor);
                }
                if (td.mExtraInfo.mDailyShowTimes > null) {
                   LinkedHashMap linkedHashMa1 = a.f(new d(te).getType());
                   LruMap lruMap1 = new LruMap(i2);
                   if (linkedHashMa1 != null) {
                      lruMap1.putAll(linkedHashMa1);
                   }
                   String str = lruMap1.get(Integer.valueOf(td.mBizType));
                   long l = System.currentTimeMillis();
                   if (TextUtils.x(str)) {
                      lruMap1.put(Integer.valueOf(td.mBizType), l+",1");
                   }else {
                      String str1 = ",";
                      String[] stringArray = str.split(str1);
                      if (DateUtils.r(Long.parseLong(stringArray[i1]), l)) {
                         stringArray[i1] = String.valueOf(System.currentTimeMillis());
                         stringArray[i] = String.valueOf(i);
                      }else {
                         stringArray[i] = String.valueOf((Integer.parseInt(stringArray[i]) + i));
                      }
                      lruMap1.put(Integer.valueOf(td.mBizType), stringArray[i1]+str1+stringArray[i]);
                   }
                   SharedPreferences$Editor uEditor1 = a.a.edit();
                   uEditor1.putString("gzoneNoticeShowCountMap", b.e(lruMap1));
                   g.a(uEditor1);
                   b.Z(LiveLogTag.GZONE, "updateShowTimes: dalyCountMap "+lruMap1.get(Integer.valueOf(td.mBizType)));
                }
             }
          }
       }
    label_0215 :
       return;
    }
}
