package com.kuaishou.tuna.plc.b;
import u06.f;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicLong;
import android.app.Activity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.tuna.plc.feature_plc_test.PlcTestConfigDialogFragment;
import java.util.Objects;
import y06.b;
import y06.a;
import com.kwai.robust.PatchProxyResult;
import bz4.c;
import android.os.SystemClock;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.util.rx.RxBus;
import u3a.e;
import com.yxcorp.gifshow.detail.plc.utils.TunaPlcLogger;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import crd.a;
import wkd.b;
import l4a.a;
import brd.t;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import by4.a;
import by4.d;
import erd.g;
import crd.b;
import dy4.b;
import x06.a;
import h4a.l;
import k4a.a;
import kotlin.jvm.internal.a;
import by4.b;
import by4.c;
import java.lang.Number;
import com.kwai.feature.plc.api.model.PlcRecoSignalInfo;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import m4a.d;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import kp.r1;
import com.kuaishou.tuna.plc.a;
import ekd.k1;
import java.lang.Runnable;
import t45.c;

public class b implements f	// class@000fbf
{
    public final AtomicLong b;

    public void b(){
       super();
       this.b = new AtomicLong(0);
    }
    public void A4(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "10")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, null, PlcTestConfigDialogFragment.class, "1")) {
          Objects.requireNonNull(PlcTestConfigDialogFragment.j);
       }
       return;
    }
    public a A8(b p0){
       c obj = PatchProxy.applyOneRefs(p0, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new c();
       if (p0 != null) {
          obj.c = p0.c;
          obj.d = p0.d;
          obj.a = p0.a;
          obj.b = p0.b;
          obj.e = p0.e;
          obj.f = p0.f;
          obj.g = p0.g;
          obj.i = p0.h;
          obj.k = p0.i;
       }
       return obj;
    }
    public void Ka(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.b.set(SystemClock.elapsedRealtime());
       return;
    }
    public void Nc(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "4")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          RxBus.f.b(new e(p0));
       }else {
          TunaPlcLogger.e("PlcCorePluginImpl", "notifyPlcUpdate photoId is empty");
       }
       return;
    }
    public void PW(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "5")) {
          return;
       }
       if (p0 == null || (p0.getPlcEntryStyleInfo() != null && p0.getPlcEntryStyleInfo().mBizType != null)) {
          PlcEntryStyleInfo plcEntryStyl = p0.getPlcEntryStyleInfo();
          String photoId = p0.getPhotoId();
          a uoa = new a();
          uoa.c(b.a(0x75aab011).b(photoId, plcEntryStyl.mBizType, plcEntryStyl.showPageType, plcEntryStyl.photoPage).map(new e()).subscribeOn(d.b).subscribe(new a(plcEntryStyl, photoId, p0, uoa), new d(uoa)));
       }
    label_005c :
       return;
    }
    public void bc(){
       if (PatchProxy.applyVoid(null, this, b.class, "7")) {
          return;
       }
       b.b(false);
       return;
    }
    public b f60(a p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       l obj = PatchProxy.applyOneRefs(p0, this, b.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = l.a;
       Objects.requireNonNull(obj);
       t ot = PatchProxy.apply(null, obj, l.class, "2");
       if (ot != patchProxyRe) {
       }else {
          ot = RxBus.f.f(a.class);
          a.o(ot, "RxBus.INSTANCE.toObserva¡­cGlobalEvent::class.java\)");
       }
       return ot.subscribe(new b(p0), new c(p0));
    }
    public boolean isAvailable(){
       return true;
    }
    public long qb(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.b.get();
    }
    public void ub(QPhoto p0,PlcRecoSignalInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "9")) {
          return;
       }
       PhotoDetailLogger photoDetailL = null;
       ClientContent$ContentPackage uContentPack = d.b(p0, photoDetailL);
       if (p0 != null) {
          photoDetailL = r1.O0(p0.mEntity);
       }
       this.zc(uContentPack, photoDetailL, p1);
       return;
    }
    public void zc(ClientContent$ContentPackage p0,FeedLogCtx p1,PlcRecoSignalInfo p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "8")) {
          return;
       }
       a uoa = new a(this, p2, p0, p1);
       if (k1.g()) {
          c.a(uoa);
       }else {
          uoa.run();
       }
       return;
    }
}
