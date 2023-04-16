package com.kuaishou.tuna.plc.logic.PlcPreDecideDownload;
import ry4.a;
import com.kuaishou.tuna.plc.logic.PlcPreDecideDownload$mNeedJudgeDownload$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.detail.plc.adapter.PlcEntryDataAdapter;
import com.yxcorp.gifshow.detail.plc.model.PlcPreDecideWhiteInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.plc.model.PlcPreDecideWhiteInfo$WhiteInfo;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Integer;
import f4a.i;
import j4a.c;
import android.app.Application;
import o56.a;
import android.content.Context;
import f4a.v;
import java.util.Objects;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.SharedPreferences;
import f4a.m;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.yxcorp.gifshow.detail.plc.helper.ad.a;

public final class PlcPreDecideDownload extends a	// class@00102a
{
    public final p b;

    public void PlcPreDecideDownload(){
       super();
       this.b = s.c(PlcPreDecideDownload$mNeedJudgeDownload$2.INSTANCE);
    }
    public int d(){
       return 1;
    }
    public int getBizType(){
       return 0;
    }
    public boolean h(PlcEntryDataAdapter p0,PlcPreDecideWhiteInfo p1){
       boolean b2;
       PlcPreDecideDownload plcPreDecide = PlcPreDecideDownload.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, plcPreDecide, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 == null) {
          return b;
       }
       Object[] objArray = null;
       Boolean uBoolean = PatchProxy.apply(objArray, this, plcPreDecide, "1");
       if (uBoolean == patchProxyRe) {
          uBoolean = this.b.getValue();
       }
       if (!uBoolean.booleanValue()) {
          return b;
       }else if(p1 != null){
          PlcPreDecideWhiteInfo mDownloadWhi = p1.mDownloadWhiteInfo;
          if (mDownloadWhi != null) {
             objArray = mDownloadWhi.whiteBizType;
          }
       }
       if (q.f(objArray)) {
          return b;
       }else if(!this.g(p0, 2)){
          return b;
       }else if(p1 != null){
          p1 = p1.mDownloadWhiteInfo;
          if (p1 != null) {
             PlcPreDecideWhiteInfo$WhiteInfo whiteBizType = p1.whiteBizType;
             if (whiteBizType != null) {
                Iterator iterator = whiteBizType.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      Integer integer = iterator.next();
                      int bizType = p0.getBizType();
                      if (integer != null && integer.intValue() == bizType) {
                         return b;
                      }
                      continue ;
                   }
                }
             }
          }
       }
       i oi = c.a(p0);
       boolean b1 = oi.f(a.b(), p0.getPackageName());
       if (b1) {
          v ov = v.b();
          String packageName = p0.getPackageName();
          Objects.requireNonNull(ov);
          ov = PatchProxy.applyOneRefs(packageName, ov, v.class, "5");
          if (ov != patchProxyRe) {
             b2 = ov.booleanValue();
          }else if(!TextUtils.x(packageName)){
             b2 = TextUtils.x(v.f.getString(packageName, "")) ^ b;
          }else {
             b2 = 0;
          }
          if (!b2) {
             return false;
          }
       }else {
          b1 = oi.c(p0.getDownloadUrl());
       }
       if (!b1) {
          if (m.h(p0)) {
             b = a.q(p0.getPlcEntryStyleInfo());
          }else if(p0.getBizType() == 29 && !TextUtils.x(p0.getActionSubUrl())){
             b = 0;
          }
          b1 = b;
       }
       return b1;
    }
}
