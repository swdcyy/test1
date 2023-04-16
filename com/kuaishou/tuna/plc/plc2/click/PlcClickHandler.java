package com.kuaishou.tuna.plc.plc2.click.PlcClickHandler;
import uy4.a;
import com.kuaishou.tuna.plc.plc2.click.PlcClickHandler$a;
import nsd.u;
import java.lang.Object;
import com.yxcorp.gifshow.detail.plc.adapter.PlcEntryDataAdapter;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import f4a.i0;
import com.yxcorp.gifshow.detail.plc.helper.ApkDownloadHelper;
import u06.b;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import java.lang.Integer;
import com.yxcorp.gifshow.detail.plc.utils.TunaPlcLogger;
import f4a.b0;
import com.yxcorp.gifshow.detail.plc.mix.PLCLogHelper;
import com.kuaishou.tuna.plc.plc2.click.PlcClickHandler$handleClick$clientLogCallback$1;
import com.kuaishou.tuna.plc.plc2.click.PlcClickHandler$handleClick$adLoggerCallback$1;
import msd.a;
import com.kuaishou.tuna.plc.plc2.click.PlcClickHandler$c;
import msd.l;
import z1.a;
import f4a.i;
import j4a.c;
import com.yxcorp.gifshow.detail.plc.helper.ApkDownloadHelper$b;
import o4a.b;
import o4a.a;
import f4a.g;
import com.kuaishou.tuna.plc.plc2.click.PlcClickHandler$b;
import com.kuaishou.tuna.plc_base.logic.a;

public final class PlcClickHandler implements a	// class@001052
{
    public b a;
    public i0 b;
    public PlcEntryDataAdapter c;
    public PLCLogHelper d;
    public ApkDownloadHelper e;
    public QPhoto f;
    public static final PlcClickHandler$a g;

    static {
       PlcClickHandler.g = new PlcClickHandler$a(null);
    }
    public void PlcClickHandler(){
       super();
    }
    public void a(PlcEntryDataAdapter p0,QPhoto p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PlcClickHandler.class, "5")) {
          return;
       }
       a.p(p0, "dataAdapter");
       a.p(p1, "photo");
       PlcClickHandler tb = this.b;
       if (tb != null) {
          tb.c();
       }
       tb = this.e;
       if (tb != null) {
          tb.b();
       }
       this.e = null;
       this.b = null;
       this.f = p1;
       this.c = p0;
       i0 oi0 = new i0(p0);
       this.b = oi0;
       PlcClickHandler ta = this.a;
       if (ta != null) {
          ta.a(p0, p1, oi0);
       }
       return;
    }
    public void b(Activity p0,Fragment p1,int p2){
       boolean b;
       PlcClickHandler$handleClick$adLoggerCallback$1 this;
       PlcClickHandler plcClickHand = this;
       Object obj = p0;
       int i = p2;
       if (PatchProxy.isSupport(PlcClickHandler.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, PlcClickHandler.class, "2")) {
          return;
       }
       a.p(obj, "activity");
       String str = "PlcClickHandler";
       if (plcClickHand.a == null) {
          TunaPlcLogger.a(str, "handle plc click failed! actionClickHelper is null!");
          return;
       }else {
          PlcClickHandler d = plcClickHand.d;
          int i1 = 0;
          b0 uob0 = (d != null)? d.h(): i1;
          PlcClickHandler c = plcClickHand.c;
          int actionType = (c != null)? c.getActionType(): 0;
          PlcClickHandler$handleClick$adLoggerCallback$1 ohandleClick = new PlcClickHandler$handleClick$adLoggerCallback$1(plcClickHand, i, uob0, actionType);
          super(i, uob0, actionType).invoke();
          d = plcClickHand.a;
          if (d != null) {
             c = plcClickHand.d;
             b0 uob01 = (c != null)? c.h(): i1;
             b = d.c(obj, uob01, new PlcClickHandler$c(ohandleClick));
          }else {
             b = true;
          }
          if (!b) {
             c = plcClickHand.f;
             if (c != null) {
                a.m(c);
                if (!PatchProxy.applyVoidThreeRefs(p0, p1, c, this, PlcClickHandler.class, "3") && (plcClickHand.e == null && p1 != null)) {
                   PlcClickHandler c1 = plcClickHand.c;
                   a.m(c1);
                   PlcClickHandler d1 = plcClickHand.d;
                   b0 uob02 = (d1 != null)? d1.h(): i1;
                   d1 = plcClickHand.f;
                   a.m(d1);
                   c = plcClickHand.c;
                   a.m(c);
                   i oi = c.a(c);
                   this = ohandleClick;
                   ApkDownloadHelper uApkDownload = new ApkDownloadHelper(p0, p1, c1, uob02, null, null, null, d1, oi, plcClickHand.b);
                   plcClickHand.e = b;
                }else {
                   this = ohandleClick;
                }
                d = plcClickHand.e;
                if (d != null) {
                   d.d(new g(new PlcClickHandler$b(this)));
                }
             }else {
                TunaPlcLogger.a(str, "handle download plc click failed!");
             }
          }
          return;
       }
    }
    public void c(QPhoto p0,PlcEntryDataAdapter p1,Activity p2,PLCLogHelper p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, PlcClickHandler.class, "1")) {
          return;
       }
       a.p(p0, "photo");
       a.p(p1, "plcEntryDataAdapter");
       a.p(p2, "activity");
       a.p(p3, "plcLogHelper");
       this.f = p0;
       this.d = p3;
       i0 oi0 = new i0(p1);
       this.b = oi0;
       this.a = new a(p1, p0, p2, oi0);
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, PlcClickHandler.class, "4")) {
          return;
       }
       PlcClickHandler te = this.e;
       if (te != null) {
          te.b();
       }
       te = this.b;
       if (te != null) {
          te.c();
       }
       this.e = null;
       this.b = null;
       this.a = null;
       return;
    }
}
