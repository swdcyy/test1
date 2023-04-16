package com.yxcorp.gifshow.photo.download.task.DownloadRedPacketHelper;
import com.yxcorp.gifshow.photo.download.task.DownloadRedPacketHelper$a;
import nsd.u;
import com.yxcorp.gifshow.photo.download.task.DownloadRedPacketHelper$Companion$TEMPLATE_FOLDER$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.String;
import xf6.i;
import com.yxcorp.gifshow.photo.download.api.response.DownloadPhotoInfoResponse;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.photo.download.model.config.NebulaDownloadRedPacketConfig;
import java.lang.reflect.Type;
import java.lang.Math;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import com.yxcorp.gifshow.photo.download.task.DownloadRedPacketHelper$b;
import erd.g;
import com.yxcorp.gifshow.photo.download.task.DownloadRedPacketHelper$c;
import erd.o;
import e17.i;

public final class DownloadRedPacketHelper	// class@000eea
{
    public final boolean a;
    public boolean b;
    public boolean c;
    public QrCodeResponse d;
    public DownloadPhotoInfoResponse e;
    public double f;
    public boolean g;
    public static final p h;
    public static final DownloadRedPacketHelper$a i;

    static {
       DownloadRedPacketHelper.i = new DownloadRedPacketHelper$a(null);
       DownloadRedPacketHelper.h = s.c(DownloadRedPacketHelper$Companion$TEMPLATE_FOLDER$2.INSTANCE);
    }
    public void DownloadRedPacketHelper(){
       super();
       this.a = i.c("KEY_NEBULA_FORCE_ADD_RED_PACK");
       this.f = 0x3fc999999999999a;
    }
    public static final DownloadPhotoInfoResponse a(DownloadRedPacketHelper p0){
       p0 = p0.e;
       if (p0 == null) {
          a.S("downloadResponse");
       }
       return p0;
    }
    public final t b(QPhoto p0){
       String obj = PatchProxy.applyOneRefs(p0, this, DownloadRedPacketHelper.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.c != null)? "nebulaDownloadRedPacket": "kuaishouDownloadRedPacket";
       NebulaDownloadRedPacketConfig value = a.t().getValue(obj, NebulaDownloadRedPacketConfig.class, null);
       if (value != null) {
          value.mTemplate = "";
          double d = (double)p0.getHeight() / (double)p0.getWidth();
          if (Math.abs((d - 0x3ffc71c71c71c71c)) - 0x3fb47ae147ae147b < 0) {
             value.mTemplate = value.mTemplateUrlRatio1;
          }else if(Math.abs((d - 0x3ff5555555555555)) - 0x3fb47ae147ae147b < 0){
             value.mTemplate = value.mTemplateUrlRatio2;
          }else if(Math.abs((d - 0x3ff0000000000000)) - 0x3fb47ae147ae147b < 0){
             value.mTemplate = value.mTemplateUrlRatio3;
          }else {
             this.e("不适配改视频尺寸："+d);
          }
       }
       t ot = (value != null && !TextUtils.x(value.mTemplate))? t.just(value): t.error(new IllegalStateException("NebulaDownloadConfig 未下发"));
       if (this.a == null) {
          a.o(ot, "observable");
       }else {
          ot = ot.onErrorReturnItem(new NebulaDownloadRedPacketConfig()).doOnNext(DownloadRedPacketHelper$b.b);
          a.o(ot, "observable.onErrorReturn…ountLimit = 0\n          }");
       }
       return ot;
    }
    public final t c(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DownloadRedPacketHelper.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       t ot = this.b(p0).flatMap(DownloadRedPacketHelper$c.b);
       a.o(ot, "getConfig\(photo\).flatMap…\)\n        }\n      }\n    }");
       return ot;
    }
    public final boolean d(){
       return this.c;
    }
    public final void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DownloadRedPacketHelper.class, "7")) {
          return;
       }
       if (i.c("KEY_NEBULA_RED_PACKET_TEST")) {
          i.d(R.style.arg_RES_7f110668, p0);
       }
       return;
    }
}
