package com.yxcorp.gifshow.photo.download.task.s;
import ixb.y;
import com.yxcorp.gifshow.photo.download.task.b;
import java.lang.Object;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.photo.download.model.StatModel;
import exb.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.imagepipeline.request.ImageRequest;
import com.kuaishou.android.model.mix.CoverMeta;
import jp.a;
import jd.c;
import wb5.b;
import android.graphics.Bitmap;
import com.kwai.framework.model.user.User;
import android.app.Application;
import o56.a;
import android.content.Context;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import lnc.a1;
import android.graphics.Bitmap$Config;
import com.yxcorp.gifshow.util.BitmapUtil;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.Collection;
import ekd.q;
import java.lang.Math;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.io.File;
import java.lang.Boolean;
import java.lang.reflect.Type;
import com.kwai.framework.abtest.f;
import ixb.j0;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;
import ixb.a0;
import ekd.k1;
import java.lang.System;
import ixb.b0;
import ixb.f0;
import java.lang.Exception;
import com.yxcorp.gifshow.media.util.c;
import o56.c;
import jxb.a;
import ixb.d0;
import com.kwai.video.videoprocessor.JpegBuilderException;
import ywb.e;
import q87.c;
import android.util.Pair;
import com.yxcorp.gifshow.photo.download.task.r;
import ixb.c0;
import brd.t;
import com.yxcorp.gifshow.photo.download.task.n;
import erd.g;
import ixb.i0;
import erd.o;
import brd.z;
import lrd.b;
import com.yxcorp.gifshow.photo.download.task.m;
import brd.w;
import erd.c;
import vo7.c;
import lnc.i3;
import com.yxcorp.gifshow.photo.download.task.o;
import ixb.h0;
import com.yxcorp.gifshow.photo.download.task.p;
import com.yxcorp.gifshow.photo.download.task.q;
import java.lang.Integer;
import java.util.List;
import e17.i;
import com.yxcorp.gifshow.model.CDNUrl;
import wb5.d;
import com.yxcorp.gifshow.photo.download.task.s$a;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import com.yxcorp.gifshow.video.d;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.qa;
import java.lang.Throwable;
import java.lang.InterruptedException;
import com.yxcorp.gifshow.video.d$a;
import com.yxcorp.gifshow.video.api.watermark.BitmapAlignType;
import nxc.d;
import fxb.d;
import java.lang.IllegalStateException;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.model.mix.PhotoMeta;
import jxb.i;
import com.yxcorp.gifshow.photo.download.api.response.DownloadPhotoInfoResponse;
import com.yxcorp.gifshow.photo.download.utils.e;
import ixb.g0;
import java.util.concurrent.Callable;
import t45.d;
import crd.b;

public class s extends b implements y	// class@000f18
{
    public ImageRequest[] i;
    public int j;
    public boolean k;
    public static Pair l;
    public static final Object m;

    static {
       s.m = new Object();
    }
    public void s(GifshowActivity p0,QPhoto p1,StatModel p2,b p3){
       super(p0, p1, p2, p3);
       this.j = -1;
       boolean b = false;
       this.k = b;
       b tb = this.b;
       ImageRequest[] imageRequest = PatchProxy.applyOneRefs(tb, null, s.class, "3");
       if (imageRequest != PatchProxyResult.class) {
       }else {
          CoverMeta coverMeta = tb.getCoverMeta();
          ImageRequest[] imageRequest1 = (coverMeta != null)? b.a(coverMeta, a.b, null): new ImageRequest[b];
          imageRequest = imageRequest1;
       }
       this.i = imageRequest;
       return;
    }
    public static Bitmap f(Bitmap p0,Bitmap p1,QPhoto p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, s.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return s.g(p0, p1, p2.getUser().getName());
    }
    public static Bitmap g(Bitmap p0,Bitmap p1,String p2){
       View obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, s.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ViewGroup viewGroup = null;
       obj = a.c(a.b(), R.layout.arg_RES_7f0d0619, viewGroup);
       obj.findViewById(R.id.user_qrCode).setImageBitmap(p1);
       obj.findViewById(R.id.user_name).setText("@"+p2);
       int i = a1.d(R.dimen.arg_RES_7f07030e);
       Bitmap uBitmap = BitmapUtil.g(obj, i, a1.d(R.dimen.arg_RES_7f070254), Bitmap$Config.ARGB_8888);
       if (i >= p0.getWidth()) {
          p0 = BitmapUtil.W(p0, ((float)i / (float)p0.getWidth()));
       }else {
          uBitmap = BitmapUtil.W(uBitmap, ((float)p0.getWidth() / (float)i));
       }
       Bitmap[] uBitmapArray = new Bitmap[]{p0,uBitmap};
       int i1 = 0;
       int i2 = 1;
       ArrayList uArrayList = Lists.e(uBitmapArray);
       if (!q.f(uArrayList)) {
          Bitmap uBitmap1 = uArrayList.get(i1);
          int width = uBitmap1.getWidth();
          int height = uBitmap1.getHeight();
          for (int i3 = 1; i3 < uArrayList.size(); i3 = i3 + 1) {
             width = Math.max(width, uArrayList.get(i3).getWidth());
             height = height + uArrayList.get(i3).getHeight();
          }
          uBitmap1 = Bitmap.createBitmap(width, height, Bitmap$Config.ARGB_8888);
          Canvas uCanvas = new Canvas(uBitmap1);
          Paint paint = new Paint();
          paint.setDither(i2);
          i2 = 0;
          for (; i1 < uArrayList.size(); i1 = i1 + 1) {
             uCanvas.drawBitmap(uArrayList.get(i1), 0, (float)i2, paint);
             i2 = i2 + uArrayList.get(i1).getHeight();
          }
       }
       p0.recycle();
       p1.recycle();
       uBitmap.recycle();
       return viewGroup;
    }
    public static void h(QPhoto p0,boolean p1,ImageRequest[] p2,File p3,StatModel p4,b p5,y p6){
       Object[] objArray;
       Bitmap uBitmap;
       Object[] objArray1;
       object oobject = p0;
       object oobject1 = p2;
       object oobject2 = p3;
       object oobject3 = p4;
       object oobject4 = p5;
       object oobject5 = p6;
       s os = s.class;
       Object obj = null;
       int i = 6;
       int i1 = 5;
       int i2 = 3;
       int i3 = 7;
       int i4 = 1;
       if (PatchProxy.isSupport(os)) {
          objArray = new Object[i3];
          objArray[0] = oobject;
          objArray[i4] = Boolean.valueOf(p1);
          objArray[2] = oobject1;
          objArray[i2] = oobject2;
          objArray[4] = oobject3;
          objArray[i1] = oobject4;
          objArray[i] = oobject5;
          if (PatchProxy.applyVoid(objArray, obj, os, "6")) {
             return;
          }
       }
       try{
          if (f.b("photoDownload", Boolean.class, Boolean.FALSE).booleanValue()) {
             if (PatchProxy.isSupport(os)) {
                objArray = new Object[i3];
                objArray[0] = oobject;
                objArray[i4] = Boolean.valueOf(p1);
                objArray[2] = oobject1;
                objArray[i2] = oobject2;
                objArray[4] = oobject3;
                objArray[i1] = oobject4;
                objArray[6] = oobject5;
                if (!PatchProxy.applyVoid(objArray, null, os, "15")) {
                }
             }else if(s.p(p0.getUserId())){
                s.i(p0, p1, p2, p3, p4, p5, p6);
             }else {
                Object m = s.m;
                _monitor_enter(m);
                if (s.p(p0.getUserId())) {
                   j0 oj0 = new j0(p0, p1, p2, p3, p4, p5, p6);
                   c.k(i1);
                }else {
                   s.i(p0, p1, p2, p3, p4, p5, p6);
                }
                _monitor_exit(m);
             }
          }else if(PatchProxy.isSupport(os)){
             objArray = new Object[i3];
             objArray[0] = oobject;
             objArray[i4] = Boolean.valueOf(p1);
             objArray[2] = oobject1;
             objArray[i2] = oobject2;
             objArray[4] = oobject3;
             objArray[i1] = oobject4;
             objArray[6] = oobject5;
             if (!PatchProxy.applyVoid(objArray, null, os, "8")) {
             }
          }else {
          }
       }catch(java.lang.Exception e0){
          k1.o(new f0(oobject4, e0));
       }
    label_0152 :
       return;
    }
    public static void i(QPhoto p0,boolean p1,ImageRequest[] p2,File p3,StatModel p4,b p5,y p6){
       s os = s.class;
       if (PatchProxy.isSupport(os)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),p2,p3,p4,p5,p6};
          if (PatchProxy.applyVoid(objArray, null, os, "13")) {
             return;
          }
       }
       QPhoto qPhoto = p0;
       boolean b = p1;
       ImageRequest[] imageRequest = p2;
       StatModel statModel = p4;
       b uob = p5;
       y oy = p6;
       try{
          r or = new r(s.j(qPhoto, b, imageRequest, statModel, uob, oy), p0, p3, p4, p5);
          c.k(p1);
       }catch(java.lang.Exception e0){
          k1.o(new c0(p5));
       }
       return;
    }
    public static Pair j(QPhoto p0,boolean p1,ImageRequest[] p2,StatModel p3,b p4,y p5){
       s os = s.class;
       if (PatchProxy.isSupport(os)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),p2,p3,p4,p5};
          Object obj = PatchProxy.apply(objArray, null, os, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return t.zip(t.just(p2).doOnNext(new n(p4, p3, p1)).map(new i0(p2, p4, p5)).subscribeOn(b.c()), s.k(p0.getUserId()), m.a).blockingLast();
    }
    public static t k(String p0){
       t ot;
       Object obj = PatchProxy.applyOneRefs(p0, null, s.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (s.p(p0)) {
          ot = t.just(s.l.second);
       }else {
          i3 oi3 = i3.f();
          oi3.a("isForJoinPictureShare", Boolean.TRUE);
          String str = oi3.e();
          ot = c.b.a("QR_CODE_PROFILE", p0, "wechat", null, str).map(o.b).doOnNext(new h0(p0));
       }
       return ot.map(p.b).onErrorReturn(q.b).subscribeOn(b.c());
    }
    public static ImageRequest[] l(QPhoto p0,int p1){
       s os = s.class;
       if (PatchProxy.isSupport(os)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, os, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       List atlasPhotosC = p0.getAtlasPhotosCdn(p1);
       if (q.f(atlasPhotosC)) {
          i.a(R.style.arg_RES_7f110668, 0x7f100dd5);
          return null;
       }else {
          CDNUrl[] uCDNUrlArray = new CDNUrl[atlasPhotosC.size()];
          return d.b(atlasPhotosC.toArray(uCDNUrlArray));
       }
    }
    public static ImageRequest[] m(QPhoto p0,List p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, null, s.class, "5");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       if (q.f(p1)) {
          i.a(R.style.arg_RES_7f110668, 0x7f100dd5);
          return null;
       }else {
          CDNUrl[] uCDNUrlArray = new CDNUrl[p1.size()];
          return d.b(p1.toArray(uCDNUrlArray));
       }
    }
    public static Bitmap n(ImageRequest[] p0,b p1,y p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, s.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       Bitmap uBitmap = null;
       while (i < p0.length) {
          try{
             s$a uoa = new s$a(p1);
             a.d(p0[i], uoa);
             Drawable uDrawable = uoa.q();
             if (p2.isCanceled()) {
                return null;
             }else if(uDrawable instanceof BitmapDrawable){
                uBitmap = uDrawable.getBitmap();
             }else {
                uBitmap = null;
             }
             if (uBitmap != null) {
                break ;
             }
          }catch(java.lang.Exception e3){
             e3.printStackTrace();
          }
             i = i + 1;
       }
       return uBitmap;
    }
    public static Bitmap o(Bitmap p0,QPhoto p1){
       d uod;
       d$a obj = PatchProxy.applyTwoRefs(p0, p1, null, s.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       do {
          obj = null;
          try{
             uod = qa.s(d.class, LoadPolicy.SILENT_IMMEDIATE).e();
          }catch(java.lang.Exception e0){
             v0 = e0.getCause() instanceof InterruptedException;
          }
       } while (!e0);
       if (uod == null) {
          throw new IllegalStateException("plugin load failed ");
       }
       obj = uod.WV();
       b.h.g(obj.a());
       return obj.b(p0, uod.LZ(p1.getUser()), false, true, BitmapAlignType.BOTTOM_CENTER_ONE_LINE);
    }
    public static boolean p(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, s.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (s.l != null && (TextUtils.n(s.l.first, p0) && !TextUtils.x(s.l.second)))? true: false;
       return b;
    }
    public t b(){
       Object obj = PatchProxy.apply(null, this, s.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b.getPhotoMeta() != null && this.b.getPhotoMeta().mPostWorkInfoId >= null) {
          return i.e(this.b);
       }
       return super.b();
    }
    public void cancel(){
       this.k = true;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, s.class, "2")) {
          return;
       }
       t.fromCallable(new g0(this, (this.f.mNotNeedWaterMark ^ 0x01), e.b(this.b))).subscribeOn(d.c).subscribe();
       return;
    }
    public boolean isCanceled(){
       return this.k;
    }
}
