package com.kuaishou.live.report.d;
import erd.g;
import android.app.Activity;
import androidx.fragment.app.c;
import lp3.e;
import com.kwai.component.misc.report.ReportInfo;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.lang.String;
import com.kuaishou.live.report.e$a;
import java.lang.Object;
import com.kuaishou.live.report.LiveReportEntranceResponse;
import com.kuaishou.live.report.e;
import d61.g;
import com.kuaishou.live.report.LiveReportEntranceResponse$ReportEntranceInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import tkd.b;
import tkd.d;
import ym5.a;
import ap3.j;
import java.lang.Runnable;
import com.kuaishou.live.report.f;
import java.lang.Integer;
import com.kuaishou.live.report.LiveReportFragment;
import java.util.ArrayList;
import java.util.Collection;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import androidx.fragment.app.Fragment;
import gy2.i;
import com.kuaishou.live.dialog.base.LiveBottomSheetFragment;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.fragment.ContainerFragment;
import ap3.e;
import java.util.List;
import ap3.d;

public final class d implements g	// class@000f5b
{
    public final Activity b;
    public final c c;
    public final e d;
    public final ReportInfo e;
    public final LiveStreamFeed f;
    public final String g;
    public final String h;
    public final String i;
    public final e$a j;
    public final int k;

    public void d(Activity p0,c p1,e p2,ReportInfo p3,LiveStreamFeed p4,String p5,String p6,String p7,e$a p8,int p9){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
       this.j = p8;
       this.k = p9;
    }
    public final void accept(Object p0){
       LiveReportFragment liveReportFr;
       Bundle uBundle;
       i oi;
       e uoe1;
       d uod = this;
       d b = uod.b;
       d c = uod.c;
       d d = uod.d;
       d e = uod.e;
       d f = uod.f;
       d g = uod.g;
       d h = uod.h;
       d i = uod.i;
       d j = uod.j;
       d k = uod.k;
       LiveReportEntranceResponse liveReportEn = p0;
       e uoe = e.class;
       if (g.h(b) || (c != null && liveReportEn)) {
          LiveReportEntranceResponse mReportEntra = liveReportEn.mReportEntranceInfo;
          if (mReportEntra != null) {
             int i1 = 5;
             if (mReportEntra.mEnableUseH5Report != null) {
                if (PatchProxy.isSupport(uoe)) {
                   Object[] objArray = new Object[i1];
                   objArray[0] = b;
                   objArray[1] = c;
                   objArray[2] = d;
                   objArray[3] = e;
                   objArray[4] = liveReportEn;
                   if (!PatchProxy.applyVoid(objArray, null, uoe, "9")) {
                   }
                }else if(TextUtils.equals(e.mSourceType, "audience")){
                   e.mSourceType = "user";
                }
                LiveReportEntranceResponse$ReportEntranceInfo mUrl = liveReportEn.mReportEntranceInfo.mUrl;
                if (!PatchProxy.applyVoidFourRefs(b, c, d, mUrl, null, e.class, "11")) {
                   if (d.a(0x4c5dd1b8).f2()) {
                      e.b(b, c, d, mUrl);
                   }else {
                      f.a(b, new j(b, c, d, mUrl), 500);
                   }
                }
             }else if(PatchProxy.isSupport(uoe)){
                Object[] objArray1 = new Object[10];
                objArray1[0] = b;
                objArray1[1] = c;
                objArray1[2] = e;
                objArray1[3] = liveReportEn;
                objArray1[4] = f;
                objArray1[i1] = g;
                objArray1[6] = h;
                objArray1[7] = i;
                objArray1[8] = j;
                objArray1[9] = Integer.valueOf(k);
                if (!PatchProxy.applyVoid(objArray1, null, uoe, "10")) {
                }
             }else {
             }
          }
       }
    label_0153 :
       return;
    }
}
