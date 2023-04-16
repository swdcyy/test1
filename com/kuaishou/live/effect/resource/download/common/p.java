package com.kuaishou.live.effect.resource.download.common.p;
import c03.b;
import com.kuaishou.live.effect.engine.log.LiveEffectLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import java.util.Map;
import java.lang.Integer;
import com.yxcorp.download.DownloadManager;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import wz2.a;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import com.kuaishou.live.effect.resource.download.common.LiveMagicGiftDownloadVersion;
import uz2.b;
import vz2.i;
import java.lang.Number;
import java.util.Objects;
import java.io.File;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import uz2.b$a;
import com.yxcorp.download.DownloadTask$DownloadRequest;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import com.kuaishou.android.live.log.LiveLogTag;
import com.kuaishou.android.live.log.b;
import com.yxcorp.download.DownloadTask$DownloadBizExtra;
import com.kuaishou.live.effect.resource.download.switc.LiveEffectDownloadSwitchContainer;
import com.kuaishou.live.effect.resource.download.common.p$a;
import vz2.w;
import com.yxcorp.download.b;
import com.yxcorp.gifshow.model.SimpleMagicFace;

public class p implements b	// class@001b47
{
    public final Map a;
    public final Map b;
    public final Map c;
    public static final List d;

    static {
       p.d = LiveEffectLogTag.LIVE_EFFECT_DOWNLOAD.appendTag("LiveMagicGiftDownloadHelper");
    }
    public void p(){
       super();
       this.a = new ConcurrentHashMap();
       this.b = new ConcurrentHashMap();
       this.c = new ConcurrentHashMap();
    }
    public void a(MagicEmoji$MagicFace p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "8")) {
          return;
       }
       Integer integer = this.b.get(p0.getUniqueIdentifier());
       if (integer == null) {
          return;
       }
       DownloadManager.n().c(integer.intValue());
       return;
    }
    public void b(MagicEmoji$MagicFace p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "10")) {
          return;
       }
       Integer integer = this.b.get(p0.getUniqueIdentifier());
       if (integer != null) {
          DownloadManager.n().F(integer.intValue());
       }
       return;
    }
    public void c(MagicEmoji$MagicFace p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "7")) {
          return;
       }
       Integer integer = this.b.get(p0.getUniqueIdentifier());
       if (integer == null) {
          return;
       }
       DownloadManager.n().z(integer.intValue());
       return;
    }
    public boolean d(MagicEmoji$MagicFace p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, p.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Integer integer = this.b.get(p0.getUniqueIdentifier());
       if (integer == null) {
          return false;
       }
       return DownloadManager.n().x(integer.intValue());
    }
    public void e(MagicEmoji$MagicFace p0,a p1){
       p op = p.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, op, "1")) {
          return;
       }
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, op, "2")) {
          this.h(0, e0.b(p0.mResources, p0.mResource), p0, p1);
       }
       return;
    }
    public LiveMagicGiftDownloadVersion f(){
       return LiveMagicGiftDownloadVersion.V1;
    }
    public boolean g(MagicEmoji$MagicFace p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, p.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.g(p0);
    }
    public int h(int p0,String[] p1,MagicEmoji$MagicFace p2,a p3){
       i obj1;
       String this;
       DownloadTask$DownloadRequest uDownloadReq1;
       p op = this;
       int i = p0;
       object oobject = p1;
       Object obj = p2;
       object oobject1 = p3;
       i oi = i.class;
       if (PatchProxy.isSupport(p.class)) {
          obj1 = PatchProxy.applyFourRefs(Integer.valueOf(p0), p1, p2, p3, this, p.class, "3");
          if (obj1 != PatchProxyResult.class) {
             return obj1.intValue();
          }
       }
       int i1 = Integer.MIN_VALUE;
       if (i >= oobject.length) {
          op.c.remove(p2.getUniqueIdentifier());
          return i1;
       }else {
          obj1 = i.e;
          Objects.requireNonNull(obj1);
          String str = PatchProxy.apply(null, obj1, oi, "2");
          if (str != PatchProxyResult.class) {
          }else {
             str = i.d.getAbsolutePath();
             a.o(str, "effectFolderTmp.absolutePath");
          }
          String str1 = "4";
          this = PatchProxy.applyOneRefs(obj, obj1, oi, str1);
          if (this != PatchProxyResult.class) {
          }else {
             this = "magicGift";
             a.p(obj, this);
             StringBuilder str2 = "";
             String str3 = PatchProxy.applyOneRefs(obj, obj1, oi, "3");
             if (str3 != PatchProxyResult.class) {
             }else {
                a.p(obj, this);
                str3 = b.a.b(obj);
                if (str3 == null) {
                   str3 = "";
                }
             }
             this = str2+str3+".tmp";
          }
          int i2 = 3;
          int i3 = 1;
          if (PatchProxy.isSupport(p.class)) {
             Object[] objArray = new Object[]{Integer.valueOf(p0),oobject,obj,str,this,oobject1};
             p$a obj2 = PatchProxy.apply(objArray, op, p.class, str1);
             if (obj2 != PatchProxyResult.class) {
                i1 = obj2.intValue();
             }else if(i >= oobject.length){
                op.c.remove(p2.getUniqueIdentifier());
             }else {
                op.c.put(p2.getUniqueIdentifier(), Integer.valueOf(p0));
                DownloadTask$DownloadRequest uDownloadReq = new DownloadTask$DownloadRequest(oobject[i]).setDestinationDir(str).setAllowedNetworkTypes(i2).setDestinationFileName(this);
                if (MagicEmoji$MagicFace.isMagicGift(p2)) {
                   uDownloadReq.setDownloadTaskType(p3.b());
                }
                if (b.f(p2)) {
                   uDownloadReq1 = uDownloadReq;
                   b.d0(LiveLogTag.MAGIC_GIFT, "[LiveMagicGiftDownloadHelper][add] isHighPriorityPreDownload", "downloadConfig", p3, "isNeedAbTest", Boolean.valueOf(p3.g()));
                   if (p3.g()) {
                      if (p3.b() == DownloadTask$DownloadTaskType.PRE_DOWNLOAD) {
                         uDownloadReq1.setDownloadTaskType(DownloadTask$DownloadTaskType.ENQUEUE);
                      }
                   }else {
                      uDownloadReq1.setDownloadTaskType(DownloadTask$DownloadTaskType.IMMEDIATE);
                   }
                }else {
                   uDownloadReq1 = uDownloadReq;
                }
                if (p3.b() == DownloadTask$DownloadTaskType.PRE_DOWNLOAD) {
                   uDownloadReq1.setDownloadHostType(6);
                }
                b.c0(LiveLogTag.MAGIC_GIFT, "download magic gift", " taskType", p3.b());
                uDownloadReq1.setBizInfo(":ks-components:live-debug-log", "live_magic_gift", null);
                uDownloadReq1.setPriority(p3.f());
                uDownloadReq1.setP2spPolicy(LiveEffectDownloadSwitchContainer.getP2spPolicy());
                uDownloadReq1.setNeedCDNReport(0);
                obj2 = op.a.get(p2.getUniqueIdentifier());
                if (obj2 == null) {
                   obj2 = PatchProxy.applyTwoRefs(obj, oobject1, op, p.class, "11");
                   if (obj2 != PatchProxyResult.class) {
                   }else {
                      obj2 = new p$a(obj, oobject1, 29);
                   }
                }
                obj2.g = oobject[i];
                obj2.h = p3.d();
                if (!i) {
                   w ow = new w(op, oobject, oobject1);
                   if (!PatchProxy.applyVoidOneRefs(ow, obj2, p$a.class, "1") && !obj2.c.contains(ow)) {
                      obj2.c.add(ow);
                   }
                }
                b[] uobArray = new b[]{obj2};
                i1 = DownloadManager.n().E(uDownloadReq1, uobArray);
                b.P(p.d, "LiveMagicGiftDownloadHelper really create download task !!!!  magicGift: "+obj+"  dowloadId: "+i1+" downloadTaskType: "+p3.b());
                if (MagicEmoji$MagicFace.isMagicGift(p2)) {
                   Objects.requireNonNull(DownloadManager.n());
                }
                op.b.put(p2.getUniqueIdentifier(), Integer.valueOf(i1));
                op.b.put(obj.mId, Integer.valueOf(i1));
                op.a.put(p2.getUniqueIdentifier(), obj2);
             }
          }else {
             goto label_00c8 ;
          }
          return i1;
       }
    }
    public void i(MagicEmoji$MagicFace p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "5")) {
          return;
       }
       this.b.remove(p0.getUniqueIdentifier());
       this.b.remove(p0.mId);
       return;
    }
}
