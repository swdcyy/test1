package com.yxcorp.gifshow.activity.preview.f;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.b$a;
import java.lang.String;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace;
import com.yxcorp.gifshow.edit.draft.model.DraftEditException;
import java.lang.Throwable;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.edit.draft.Workspace$Source;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.yxcorp.gifshow.encode.EncodeRequest$a;
import com.yxcorp.gifshow.encode.EncodeRequest;
import java.io.File;
import laa.m0;
import c26.c;
import oa0.a;
import gq.a;
import q87.c;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import jw8.i;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.activity.preview.d;
import erd.o;
import com.yxcorp.gifshow.activity.preview.c;
import tkd.b;
import tkd.d;
import f0c.t;
import com.kwai.feature.post.api.feature.encode.model.AtlasInfo;
import qr4.i;
import qr4.m$k0;
import qr4.m$e;
import qr4.m$e$a;
import jw8.j;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.util.Map;
import com.kwai.feature.post.api.feature.encode.model.VideoEncodeSDKInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import ekd.q;
import mca.a;
import java.util.Iterator;
import com.kuaishou.edit.draft.Text;
import com.kuaishou.edit.draft.StickerResult;
import com.kuaishou.edit.draft.Sticker;
import java.lang.Integer;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import android.util.Pair;
import b36.b;
import za9.c;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import com.yxcorp.gifshow.edit.previewer.utils.d;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.edit.draft.FeatureId;
import com.kuaishou.edit.draft.Text$ParameterCase;
import orc.f;
import java.lang.StringBuilder;
import jw8.q;
import com.kuaishou.edit.draft.TagStickerParam;
import wba.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.feature.post.api.feature.text.model.TextBubbleDetail;
import cq.a;
import com.kwai.video.minecraft.model.nano.Minecraft$PropertyKeyFrame;
import com.kwai.video.minecraft.model.nano.Minecraft$AssetTransform;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import lnc.a1;
import android.graphics.RectF;
import android.graphics.Matrix;
import java.lang.Math;
import com.kwai.feature.post.api.feature.text.model.TextBubbleDetail$Location;
import wba.z;
import com.kuaishou.edit.draft.AssetSegment;
import java.lang.Float;
import com.yxcorp.gifshow.activity.preview.f$b;
import vl8.c;
import jw8.k;
import com.kwai.framework.model.user.QCurrentUser;
import s16.j;
import qr4.k$j;
import java.lang.Double;
import com.kwai.camerasdk.Daenerys;
import qr4.m$w;
import qr4.e$h;
import qr4.e$i;
import qba.d;
import com.kwai.feature.post.api.core.model.GSConfig;
import com.kuaishou.edit.draft.TimeEffect;
import com.kuaishou.edit.draft.TimeEffect$Type;
import com.kuaishou.edit.draft.DeletedRange;
import com.kuaishou.edit.draft.TimeRange;
import com.kuaishou.edit.draft.Sticker$ParameterCase;
import com.kuaishou.edit.draft.Karaoke;
import com.kuaishou.edit.draft.KaraokeClip;
import com.kuaishou.edit.draft.Cover;
import com.kuaishou.edit.draft.VideoCoverParam;
import com.kuaishou.edit.draft.ImportCoverParamV2;

public final class f	// class@001366
{
    public static d a;

    public void f(){
       super();
    }
    public static t a(c p0,b$a p1,boolean p2,String p3){
       EncodeRequest$a obj;
       if (PatchProxy.isSupport(f.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Boolean.valueOf(p2), p3, null, f.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       GeneratedMessageLite generatedMes = p0.v();
       if (generatedMes == null) {
          return t.error(new DraftEditException("createEncodeRequest: workspace is null"));
       }else {
          Workspace$Type type = p0.a1();
          Workspace$Source source = p0.T0();
          VideoContext videoContext = p0.d1();
          obj = EncodeRequest.newBuilder().C(generatedMes);
          obj.D(p0.f0());
          EncodeRequest$a uoa = obj.q(p1);
          uoa.x(videoContext);
          uoa.l(a.I());
          uoa.u(p3);
          String str = "PreviewEncodeUtil";
          int i = 0;
          if (!f.j(type)) {
             Object[] objArray = new Object[i];
             a.D().s(str, "Prepare encode request for video workspace", objArray);
             File uFile = DraftFileManager.E().J(generatedMes);
             c uoc = new c(generatedMes, uoa, uFile, type, source, videoContext, p0, p2);
             return t.fromCallable(new i(uFile.getParentFile(), p1, p0)).subscribeOn(d.c).flatMap(new d(videoContext, uoa)).observeOn(d.a).flatMap(d.a);
          }else {
             Object[] objArray1 = new Object[i];
             a.D().s(str, "Prepare encode request for atlas/long_pic workspace", objArray1);
             File uFile1 = DraftFileManager.E().J(generatedMes);
             uoa.r(uFile1.getAbsolutePath());
             uoa.k(i);
             uoa.b(d.a(-273232199).xr(generatedMes, p0.f0()));
             if (type == Workspace$Type.SINGLE_PICTURE) {
                i b = p0.d1().F().b;
                if (b != null) {
                   m$k0 v = b.v;
                   if (v != null) {
                      m$e c = v.c;
                      if (c != null && c.length > 0) {
                         object oobject = c[i];
                         uoa.B(oobject.a);
                         uoa.j(oobject.b);
                      }
                   }
                }
                return t.just(uoa);
             }else if(uFile1.exists()){
                return t.just(uoa);
             }else {
                return t.fromCallable(new j(uFile1, uoa)).subscribeOn(d.c).observeOn(d.a);
             }
          }
       }
    }
    public static VideoEncodeSDKInfo b(c p0,EditorSdk2V2$VideoEditorProject p1,Map p2){
       int i3;
       int b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Workspace obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, f.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = p0.v();
       ArrayList uArrayList = new ArrayList();
       if (obj != null && !q.f(obj.getStickersList())) {
          uArrayList.addAll(obj.getStickersList());
       }
       if (obj != null && !q.f(obj.getTextsList())) {
          uArrayList.addAll(obj.getTextsList());
       }
       VideoEncodeSDKInfo videoEncodeS = PatchProxy.applyFourRefs(uArrayList, p1, p2, p0, null, f.class, "3");
       if (videoEncodeS != patchProxyRe) {
       }else {
          ArrayList uArrayList1 = new ArrayList();
          int i = a.s(p1);
          int i1 = a.r(p1);
          int i2 = 1;
          if (!q.f(uArrayList)) {
             Iterator iterator = uArrayList.iterator();
             i3 = 0;
             while (iterator.hasNext()) {
                GeneratedMessageLite generatedMes = iterator.next();
                if (p2 != null) {
                   GeneratedMessageLite generatedMes1 = -1;
                   if (generatedMes instanceof Text) {
                      generatedMes1 = generatedMes.getResult().getZIndex();
                   }else if(generatedMes instanceof Sticker){
                      b = generatedMes.getResult().getZIndex();
                   }
                   if (p2.get(Integer.valueOf(generatedMes1)) != null && p2.get(Integer.valueOf(generatedMes1)).booleanValue()) {
                      b = true;
                   label_00bc :
                      Pair pair = f.d(new Size(i, i1), generatedMes, p1.animatedSubAssets().toNormalArray(), b);
                      Pair second = pair.second;
                      if (second != null) {
                         uArrayList1.add(second);
                      }
                      boolean b1 = pair.first.booleanValue();
                      if (!i3) {
                         i3 = b1;
                      }
                   }
                }
             label_00bb :
                b = false;
                goto label_00bc ;
             }
          }else {
             i3 = false;
          }
          KtvInfo ktvInfo = d.a(0x2f45bb3a).rn(p0);
          if (ktvInfo == null || !ktvInfo.isSinglePicSongMode()) {
             i2 = 0;
          }
          if (i3 || i2) {
             p1 = p1.clone();
          }
          videoEncodeS = new VideoEncodeSDKInfo(p1, uArrayList1);
       }
       return videoEncodeS;
    }
    public static void c(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, f.class, "4")) {
          return;
       }
       if (!f.j(p0.a1())) {
          return;
       }
       VideoContext videoContext = p0.d1();
       Pair second = d.f(p0, false, false, false, 0x3f800000).second;
       if (!second.isEmpty()) {
          EditorSdk2V2$AnimatedSubAsset[] uAnimatedSub = new EditorSdk2V2$AnimatedSubAsset[second.size()];
          videoContext.v0(a.a.q(f.e(p0, second.toArray(uAnimatedSub))));
       }
       return;
    }
    public static Pair d(Size p0,GeneratedMessageLite p1,EditorSdk2V2$AnimatedSubAsset[] p2,boolean p3){
       EditorSdk2V2$AnimatedSubAsset obj;
       StickerResult result;
       String text1;
       String contentFontN;
       boolean b;
       Boolean uBoolean;
       Object[] objArray;
       float f;
       Size size = p0;
       int i = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          obj = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), null, f.class, "6");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       int i1 = -1;
       int i2 = 1;
       String str = "";
       int i3 = 0;
       Object obj1 = null;
       if (i instanceof Text) {
          Text text = i;
          result = text.getResult();
          text1 = text.getText();
          contentFontN = text.getContentFontName();
          if (text.getFeatureId() != null) {
             FeatureId featureId = text.getFeatureId();
             b = (text.getParameterCase() == Text$ParameterCase.SUBTITLE_EXTRA_PARAM)? true: false;
             f uof1 = f.class;
             if (PatchProxy.isSupport(uof1)) {
                Object obj2 = PatchProxy.applyTwoRefs(featureId, Boolean.valueOf(b), obj1, uof1, "1");
                if (obj2 != patchProxyRe) {
                   str = obj2;
                }
             }
             str = f.a(featureId);
             if (b) {
                str = "subtitle_"+str;
             }
          }
       }else if(i instanceof Sticker){
          Sticker sticker = i;
          result = sticker.getResult();
          text1 = (sticker.getFeatureId() != null)? q.b(sticker.getFeatureId()): str;
          String text2 = (sticker.getTagStickerParam() != null)? sticker.getTagStickerParam().getText(): str;
          contentFontN = str;
          str = text1;
          text1 = text2;
          if (sticker.getTemplateSticker()) {
             uBoolean = null;
          label_00be :
             if (result != null) {
                i1 = result.getZIndex();
             }
             obj = b.j(p2, i1);
             if (obj != null && (result != null && (TextUtils.x(str) || b.q(obj.opaque())))) {
                return new Pair(Boolean.TRUE, obj1);
             }else {
                TextBubbleDetail textBubbleDe = new TextBubbleDetail();
                textBubbleDe.mBubbleName = str;
                textBubbleDe.mText = text1;
                textBubbleDe.mFrames = new ArrayList();
                textBubbleDe.mInSafeArea = p3;
                textBubbleDe.mFontName = contentFontN;
                textBubbleDe.mIsManual = uBoolean;
                int i4 = 2;
                if (b.u(obj.opaque())) {
                   objArray = new Object[i3];
                   a.D().w("PreviewEncodeUtil", "generateBubble type tag", objArray);
                   textBubbleDe.mBubbleType = i4;
                }
                Size b1 = size.b;
                size = size.c;
                if (PatchProxy.isSupport(uof)) {
                   objArray = new Object[]{textBubbleDe,Integer.valueOf(b1),Integer.valueOf(size),result,obj};
                   if (PatchProxy.applyVoid(objArray, obj1, uof, "7")) {
                   label_0204 :
                      return new Pair(Boolean.FALSE, new b(obj.assetId(), textBubbleDe));
                   }
                }
                f = (float)obj.keyFrames(i3).assetTransform().scaleX() / 100.00f;
                float f1 = (float)obj.keyFrames(i3).assetTransform().scaleY() / 100.00f;
                float centerX = result.getCenterX();
                float centerY = result.getCenterY();
                int animatedSubA = EditorSdk2UtilsV2.getAnimatedSubAssetWidth(obj);
                int animatedSubA1 = EditorSdk2UtilsV2.getAnimatedSubAssetHeight(obj);
                if (textBubbleDe.mBubbleType == i4) {
                   animatedSubA = animatedSubA - (a1.d(0x7f070420) * 2);
                   animatedSubA1 = animatedSubA1 - (a1.d(0x7f070420) * 2);
                }
                float f2 = ((float)animatedSubA * f) / (float)b1;
                float f3 = ((float)animatedSubA1 * f1) / (float)size;
                RectF rectF = new RectF();
                centerX = centerX - (f2 / 2.00f);
                rectF.left = centerX;
                rectF.right = centerX + f2;
                centerY = centerY - (f3 / 2.00f);
                rectF.top = centerY;
                rectF.bottom = centerY + f3;
                Matrix matrix = new Matrix();
                matrix.postRotate(result.getRotate(), rectF.centerX(), rectF.centerY());
                RectF rectF1 = new RectF();
                matrix.mapRect(rectF1, rectF);
                f1 = 0x3f800000;
                f3 = Math.min(Math.max(0, rectF1.left), f1);
                centerX = Math.min(Math.max(0, rectF1.right), f1);
                float f4 = Math.min(Math.max(0, rectF1.top), f1);
                f = Math.min(Math.max(0, rectF1.bottom), f1);
                textBubbleDe.mTopLeft = new TextBubbleDetail$Location(f3, f4);
                textBubbleDe.mTopRight = new TextBubbleDetail$Location(centerX, f4);
                textBubbleDe.mBottomLeft = new TextBubbleDetail$Location(f3, f);
                textBubbleDe.mBottomRight = new TextBubbleDetail$Location(centerX, f);
                goto label_0204 ;
             }
          }
       }else {
          text1 = str;
          contentFontN = text1;
          result = obj1;
       }
       uBoolean = 1;
       goto label_00be ;
    }
    public static List e(c p0,EditorSdk2V2$AnimatedSubAsset[] p1){
       ArrayList obj = PatchProxy.applyTwoRefs(p0, p1, null, f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       List list = z.x(p0.a1(), p0);
       List list1 = z.z(list);
       int i = 0;
       while (i < list.size()) {
          Iterator iterator = d.c(p0, list.get(i).getIdentifier(), false, false).iterator();
          while (iterator.hasNext()) {
             Pair second = f.d(list1.get(i), iterator.next(), p1, false).second;
             if (second != null) {
                b mTextBubbleD = second.mTextBubbleDetail;
                int i1 = i + 1;
                mTextBubbleD.mPictureIndex = i1;
                obj.add(mTextBubbleD);
             }
          }
          i = i + 1;
       }
       return obj;
    }
    public static t f(c p0,int p1,int p2,float p3){
       f$b obj;
       t ot;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(f.class)) {
          obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Float.valueOf(p3), null, f.class, "16");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = new f$b(p1, p2);
       Object[] objArray = new Object[]{p0};
       p2 = 0;
       obj.u(objArray);
       f$b uob = f$b.class;
       if (PatchProxy.isSupport(uob)) {
          ot = PatchProxy.applyTwoRefs(Float.valueOf(p3), p0, obj, uob, "1");
          if (ot != patchProxyRe) {
          label_0087 :
             return ot;
          }
       }
       ot = t.just(obj.c.z());
       if (obj.g != null) {
          ot = ot.observeOn(d.c);
       }
       Workspace$Type type = p0.a1();
       if (z.u(type)) {
          List list = z.z(z.x(type, p0));
          if (!list.isEmpty()) {
             obj.f = list.get(p2);
          }
       }
       ot = ot.map(new k(obj, p3, p0));
       goto label_0087 ;
    }
    public static String g(Workspace$Type p0,Workspace$Source p1,VideoContext p2){
       StringBuilder str;
       i b;
       m$k0 f;
       String str1;
       e$h j;
       int i1;
       i c;
       String str2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, f.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = p2.y();
       if (TextUtils.x(obj)) {
          obj = j.a(QCurrentUser.me().getId());
       }
       int i = 0;
       if (p0 == Workspace$Type.PHOTO_MOVIE || p0 == Workspace$Type.SINGLE_PICTURE) {
          obj = obj+"[Photo:"+p2.I()+"]";
       }else if(p0 == Workspace$Type.VIDEO && (p1 == Workspace$Source.FOLLOW_SHOOT || p1 == Workspace$Source.CAPTURE)){
          str1 = obj+"[Camera:";
          Object[] objArray = null;
          Object[] objArray1 = PatchProxy.apply(objArray, p2, VideoContext.class, "31");
          int i2 = 1;
          if (objArray1 != patchProxyRe) {
          }else {
             VideoContext.b();
             c = p2.a.c;
             if (c != null) {
                k$j a2 = c.a;
                if (a2 == i2) {
                   str2 = "f";
                }else if(a2 == 2){
                   str2 = "b";
                }
             }
             objArray1 = objArray;
          }
          str1 = str1+objArray1+"]";
          c = p2.a.c;
          k$j i3 = (c != null)? c.i: 0;
          if (i3 > 0) {
             Object[] objArray2 = new Object[i2];
             objArray2[i] = Double.valueOf(i3);
             str1 = str1+"[RealFps:"+String.format("%.1f", objArray2)+"]";
          }
          str2 = str1+"[DaenerysVersion:";
          str1 = PatchProxy.apply(objArray, objArray, Daenerys.class, "49");
          if (str1 != patchProxyRe) {
          }else {
             str1 = Daenerys.nativeGetVersion();
          }
          obj = str2+str1;
       }
       e$i oi = null;
       if (p2.k() - oi > 0) {
          obj = obj+"[Beauty:"+p2.k()+"]";
       }
       if (!TextUtils.x(p2.q())) {
          obj = obj+"[Encode:"+p2.q()+"]";
       }
       if (!TextUtils.x(p2.M())) {
          obj = obj+"[Recorder:"+p2.M()+"]";
       }
       if (!TextUtils.x(p2.r())) {
          str = obj+"[file:"+new File(p2.r()).getName()+"]"+"[odur:"+p2.C()+"]"+"[ow:";
          b = p2.a.b;
          if (b != null) {
             f = b.f;
             if (f != null) {
                m$w a = f.a;
             label_01c9 :
                str = str+a+"]"+"[oh:";
                b = p2.a.b;
                if (b != null) {
                   f = b.f;
                   if (f != null) {
                      a = f.b;
                   label_01ee :
                      str = str+a+"]"+"[olen:";
                      b = p2.a.b;
                      if (b != null) {
                         f = b.f;
                         if (f != null) {
                            i = (int)f.d;
                         }
                      }
                      obj = str+i+"]";
                   }
                }
                i1 = 0;
                goto label_01ee ;
             }
          }
          i1 = 0;
          goto label_01c9 ;
       }
       str1 = obj+"[EditorVer:";
       i d = p2.a.d;
       obj = "unknown";
       if (d != null) {
          e$h a1 = d.a;
          if (a1 != 2) {
             if (a1 == 3) {
                obj = "fullScreen3";
             }
          }else {
             obj = "normal1";
          }
       }
       str1 = str1+obj+"]";
       if (!TextUtils.x(p2.l())) {
          str1 = str1+"[BeautyType:"+p2.l()+"]";
       }
       if (p2.s() != null) {
          str = str1+"["+p2.s()+":";
          b = p2.a.d;
          if (b != null) {
             j = b.j;
             if (j != null) {
                oi = j.b;
             }
          }
          str1 = str+oi+"]";
       }
       if (!TextUtils.x(p2.R())) {
          str1 = str1+"[theme:"+p2.R()+"]";
       }
       return str1;
    }
    public static d h(){
       Object obj = PatchProxy.apply(null, null, f.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return f.i(false, false);
    }
    public static d i(boolean p0,boolean p1){
       d obj;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), null, uof, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = f.a;
       if (obj != null) {
          obj.g = p0;
          obj.h = p1;
          return obj;
       }else {
          obj = new d();
          f.a = obj;
          obj.a = a1.h();
          f.a.b = a1.g();
          f.a.c = GSConfig.i();
          f.a.d = GSConfig.i();
          f.a.e = GSConfig.h();
          f.a.f = GSConfig.g();
          obj = f.a;
          obj.g = p0;
          obj.h = p1;
          return obj;
       }
    }
    public static boolean j(Workspace$Type p0){
       boolean b = (p0 != Workspace$Type.ATLAS && (p0 == Workspace$Type.LONG_PICTURE || p0 == Workspace$Type.SINGLE_PICTURE))? true: false;
       return b;
    }
    public static boolean k(Workspace p0){
       Workspace$Type obj = PatchProxy.applyOneRefs(p0, null, f.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = p0.getType();
       boolean b = false;
       if (obj == Workspace$Type.ATLAS || (obj != Workspace$Type.LONG_PICTURE && obj != Workspace$Type.SINGLE_PICTURE)) {
          Workspace$Source source = p0.getSource();
          if (source == Workspace$Source.INTOWN || (source != Workspace$Source.SHOP && source != Workspace$Source.JUXING)) {
             if (obj == Workspace$Type.KTV_SONG) {
                if (p0.getAssetsCount() > 1) {
                   b = true;
                }
                return b;
             }else {
                return true;
             }
          }
       }
       return b;
    }
    public static boolean l(Workspace p0){
       Object[] objArray;
       Object[] obj = PatchProxy.applyOneRefs(p0, null, f.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0.getSource() == Workspace$Source.JUXING) {
          obj = new Object[0];
          a.D().w("PreviewEncodeUtil", "needUploadVideoCover source is JUXING, true", obj);
          return b;
       }else {
          String str = ", true";
          String str1 = "needUploadVideoCover type is ";
          if (p0.getType() == Workspace$Type.ATLAS || p0.getType() == Workspace$Type.LONG_PICTURE) {
             objArray = new Object[0];
             a.D().w("PreviewEncodeUtil", str1+p0.getType()+str, objArray);
             return b;
          }else if(p0.getType() == Workspace$Type.SINGLE_PICTURE || (p0.getType() == Workspace$Type.KTV_SONG && p0.getAssetsCount() == b)){
             objArray = new Object[0];
             a.D().w("PreviewEncodeUtil", str1+p0.getType()+", false", objArray);
             return 0;
          }else {
             Iterator iterator = p0.getTimeEffectsList().iterator();
             while (true) {
                if (iterator.hasNext()) {
                   TimeEffect$Type rEVERSE = TimeEffect$Type.REVERSE;
                   if (iterator.next().getType() == rEVERSE) {
                      objArray = new Object[0];
                      a.D().w("PreviewEncodeUtil", "needUploadVideoCover  timeEffect type is "+rEVERSE+str, objArray);
                      return b;
                   }
                }else {
                   iterator = p0.getDeletedRangesList().iterator();
                   while (true) {
                      str = null;
                      if (iterator.hasNext()) {
                         DeletedRange uDeletedRang = iterator.next();
                         if (uDeletedRang.hasRange() && !uDeletedRang.getRange().getStart() - str) {
                            obj = new Object[0];
                            a.D().w("PreviewEncodeUtil", "needUploadVideoCover  deletedRange, true", obj);
                            return b;
                         }else {
                            continue ;
                         }
                      }else {
                         iterator = p0.getStickersList().iterator();
                         while (true) {
                            String str2 = "needUploadVideoCover have STICKER_PARAM, true";
                            if (iterator.hasNext()) {
                               Sticker sticker = iterator.next();
                               if (sticker.getParameterCase() != Sticker$ParameterCase.VOTE_STICKER_PARAM && (sticker.getParameterCase() == Sticker$ParameterCase.TAG_STICKER_PARAM || sticker.getParameterCase() == Sticker$ParameterCase.RELAY_STICKER_PARAM)) {
                                  obj = new Object[0];
                                  a.D().w("PreviewEncodeUtil", str2, obj);
                                  return b;
                               }else {
                                  continue ;
                               }
                            }else if(p0.getType() == Workspace$Type.KTV_MV && p0.getKaraoke().getClip().getSelectedRange().getStart() - str){
                               obj = new Object[0];
                               a.D().w("PreviewEncodeUtil", str2, obj);
                               return b;
                            }else if(!p0.getCoversCount()){
                               obj = new Object[0];
                               a.D().w("PreviewEncodeUtil", "needUploadVideoCover cover count is 0, false", obj);
                               return 0;
                            }else {
                               Cover covers = p0.getCovers(0);
                               VideoCoverParam videoCoverPa = covers.getVideoCoverParam();
                               Iterator iterator1 = videoCoverPa.getTimePointsList().iterator();
                               while (true) {
                                  if (iterator1.hasNext()) {
                                     double d = iterator1.next().doubleValue();
                                     a uoa = a.D();
                                     StringBuilder str3 = "needUploadVideoCover cover point is "+d+" ";
                                     boolean b1 = ((v11 = d - str) > 0)? true: false;
                                     Object[] objArray1 = new Object[0];
                                     uoa.w("PreviewEncodeUtil", str3+b1, objArray1);
                                     if (v11 > 0) {
                                        return b;
                                     }
                                     continue ;
                                  }else if(!TextUtils.x(videoCoverPa.getVideoCoverRatio())){
                                     obj = new Object[0];
                                     a.D().w("PreviewEncodeUtil", "needUploadVideoCover  getVideoCoverRatio type is is not empty, true", obj);
                                     return b;
                                  }else if(covers.getImportCoverParamV2().getUsed()){
                                     obj = new Object[0];
                                     a.D().w("PreviewEncodeUtil", "needUploadVideoCover has used import cover, true", obj);
                                     return b;
                                  }else {
                                     Object[] objArray2 = new Object[0];
                                     a.D().w("PreviewEncodeUtil", "needUploadVideoCover TextCount: "+covers.getTextsCount()+" StickersCount: "+covers.getStickersCount(), objArray2);
                                     if (covers.getTextsCount() <= 0 && covers.getStickersCount() <= 0) {
                                        b = false;
                                        break ;
                                     }
                                     break ;
                                  }
                               }
                               return b;
                            }
                         }
                      }
                   }
                }
             }
          }
       }
    }
}
