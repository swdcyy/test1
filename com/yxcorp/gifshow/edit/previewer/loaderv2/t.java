package com.yxcorp.gifshow.edit.previewer.loaderv2.t;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a$a;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.edit.draft.Workspace$Source;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import wba.d0;
import wba.g0;
import android.graphics.RectF;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ProbedStream;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import java.lang.Boolean;
import com.kwai.video.minecraft.model.nano.Minecraft$AssetTransform;
import com.kwai.video.minecraft.model.nano.Minecraft$CropOptions;
import java.lang.Float;
import hba.a;
import java.util.List;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.Iterator;
import com.kuaishou.edit.draft.Text;
import com.kuaishou.edit.draft.FeatureId;
import haa.f;
import java.lang.StringBuilder;
import q87.c;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import lnc.a1;
import android.graphics.Rect;
import java.lang.Math;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;
import java.io.File;
import com.yxcorp.gifshow.util.BitmapUtil;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import java.util.ArrayList;
import java.lang.Integer;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import android.widget.TextView;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.view.View$MeasureSpec;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import wba.x;
import eba.a;
import com.kuaishou.edit.draft.Sticker;
import com.kuaishou.edit.draft.Sticker$Type;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import com.kuaishou.edit.draft.StickerResult;
import java.lang.System;
import qkd.b;
import android.graphics.drawable.Drawable;
import android.graphics.BitmapFactory$Options;
import android.graphics.BitmapFactory;
import rba.c;
import com.kwai.video.clipkit.mv.EditorSdk2MvCreationResult;
import wba.b0;

public class t extends a	// class@001b4c
{
    public d h;
    public EditorSdk2MvCreationResult i;

    public void t(){
       super();
    }
    public void c(a$a p0,Object[] p1){
       this.h = p0.f;
       this.d = p0.e;
    }
    public void d(){
       a a;
       EditorSdk2V2$TrackAsset trackAsset;
       float f1;
       int i3;
       float f2;
       float f3;
       Minecraft$AssetTransform uAssetTransf;
       a uoa;
       int a1;
       float f4;
       float f5;
       Bitmap uBitmap;
       String str5;
       int i4;
       EditorSdk2V2$AnimatedSubAsset[] uAnimatedSub;
       String j;
       int i5;
       ViewGroup viewGroup;
       View obj1;
       Object obj2;
       TextView obj3;
       a obj4;
       String str6;
       View view;
       EditorSdk2$ProbedStream obj5;
       int b2;
       int i6;
       int b3;
       Canvas uCanvas;
       float f6;
       double d;
       float f7;
       Minecraft$AssetTransform uAssetTransf1;
       a uoa2;
       a uoa3;
       float f9;
       Minecraft$CropOptions uCropOptions;
       String str8;
       File obj6;
       ViewGroup obj7;
       Bitmap obj8;
       Iterator iterator1;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, t.class, "1")) {
          return;
       }
       obj.a("load project");
       String str = "3";
       float f = 0x3f800000;
       String str1 = "origin video height or width is not valid";
       String str2 = "4";
       String str3 = "2";
       int i = 0;
       int i1 = 1;
       int i2 = 0;
       if (obj.a.T0() == Workspace$Source.VIDEO_RECREATION) {
          a b = obj.b;
          if (b != null) {
             d0.v(b);
             b = obj.b;
             a = obj.a;
             g0 og0 = g0.class;
             if (!PatchProxy.applyVoidTwoRefs(b, a, objArray, og0, str3) && b.trackAssetsSize() > 0) {
                if (!PatchProxy.applyVoid(objArray, objArray, og0, str2)) {
                   g0.g.setEmpty();
                   g0.h.setEmpty();
                }
                trackAsset = b.trackAssets(i2);
                EditorSdk2$ProbedStream probedStream = EditorSdk2UtilsV2.trackAssetProbedVideoStream(trackAsset);
                if (probedStream != null) {
                   if (!(probedStream.rotation() % 180)) {
                      f1 = (float)probedStream.height();
                      i3 = probedStream.width();
                   }else {
                      f1 = (float)probedStream.width();
                      i3 = probedStream.height();
                   }
                   f2 = (float)i3;
                }else {
                   f2 = 0;
                   f1 = 0;
                }
                String str4 = "RecreationUtils";
                if (f1 - i <= 0 || f2 - i <= 0) {
                   PostUtils.D(str4, str1, new IllegalStateException(str1));
                }else {
                   trackAsset.setPositioningMethod(i1);
                   f3 = f1 / f2;
                   boolean b1 = (f3 - f > 0)? true: false;
                   if (PatchProxy.isSupport(og0)) {
                      uAssetTransf = PatchProxy.applyOneRefs(Boolean.valueOf(b1), objArray, og0, "15");
                      if (uAssetTransf != patchProxyRe) {
                         uoa = a;
                      }else {
                      label_00b5 :
                         uAssetTransf = new Minecraft$AssetTransform();
                         uoa = a;
                         uAssetTransf.setPositionX(50.00f);
                         uAssetTransf.setPositionY((double)((0x3f000000 - (g0.f / (float)g0.b)) * 100.00f));
                         if (b1) {
                            d = 0x404f638e20000000;
                            uAssetTransf.setScaleX(d);
                            uAssetTransf.setScaleY(d);
                         }else {
                            d = 78.26f;
                            uAssetTransf.setScaleX(d);
                            uAssetTransf.setScaleY(d);
                         }
                      }
                   }else {
                      goto label_00b5 ;
                   }
                   trackAsset.setAssetTransform(uAssetTransf);
                   a1 = g0.a;
                   f4 = (float)a1;
                   f5 = (b1)? 0x3f20b60b: 0x3f48590b;
                   f4 = f4 * f5;
                   f5 = 0x3fe38e39;
                   if ((v13 = f3 - f5) > 0) {
                      f1 = f2 * f5;
                   }
                   f5 = (v13 > 0)? f5 * f4: f4 * f3;
                   trackAsset.setCropOptions(g0.e(f2, f1));
                   if (!PatchProxy.isSupport(og0) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(f4), Float.valueOf(f5), null, og0, str)) {
                      f6 = ((float)a1 - f4) / 2.00f;
                      f3 = (((float)g0.b - f5) / 2.00f) - g0.f;
                      g0.h.set(f6, f3, (f4 + f6), (f5 + f3));
                   }
                   a uoa1 = uoa;
                   if (!PatchProxy.applyVoidOneRefs(uoa1, null, og0, "10")) {
                      obj4 = uoa1.W0();
                      if (obj4 != null) {
                         Iterator iterator = obj4.z().iterator();
                         while (iterator.hasNext()) {
                            Text text = iterator.next();
                            if (text != null && ("RECREATION").equals(text.getFeatureId().getExternal())) {
                               g0.i = text.getAuthorText();
                               g0.j = text.getText();
                            }
                         }
                      }
                   }
                   Object[] objArray1 = new Object[0];
                   f.D().w(str4, "author = "+g0.i+"caption = "+g0.j, objArray1);
                   if (PatchProxy.isSupport(og0)) {
                      uBitmap = PatchProxy.applyTwoRefs(Float.valueOf(f4), Float.valueOf(f5), null, og0, "11");
                      if (uBitmap != patchProxyRe) {
                      label_023a :
                         str = g0.a();
                         BitmapUtil.O(uBitmap, str, 75);
                         ArrayList uArrayList = new ArrayList();
                         uArrayList.add(g0.f(trackAsset, 50.00f, 50.00f, str, 100.00f, 100.00f));
                         str5 = "@";
                         if (b1) {
                            if (!PatchProxy.isSupport(og0) || !PatchProxy.applyVoidFourRefs(trackAsset, uArrayList, Float.valueOf(f5), Float.valueOf(f4), null, g0.class, "6")) {
                               j = g0.j;
                               i5 = (int)f4;
                               if (PatchProxy.isSupport(og0)) {
                                  viewGroup = null;
                                  obj1 = PatchProxy.applyTwoRefs(j, Integer.valueOf(i5), viewGroup, og0, "9");
                                  if (obj1 != patchProxyRe) {
                                     obj2 = obj1;
                                  }else {
                                  label_029a :
                                     obj1 = a.c(LayoutInflater.from(a1.c()), R.layout.arg_RES_7f0d12e4, viewGroup, false);
                                     TextView textView = obj1.findViewById(R.id.recreation_caption);
                                     if (TextUtils.isEmpty(j)) {
                                        textView.setVisibility(8);
                                        objArray1 = new Object[0];
                                        f.D().w(str4, "drawVerticalCaptionBitmap caption is empty", objArray1);
                                        obj2 = null;
                                     }else {
                                        textView.setText(j);
                                        obj1.measure(View$MeasureSpec.makeMeasureSpec(i5, 0x40000000), View$MeasureSpec.makeMeasureSpec(0x3fffffff, Integer.MIN_VALUE));
                                        obj1.layout(0, 0, i5, obj1.getMeasuredHeight());
                                        obj2 = Bitmap.createBitmap(i5, obj1.getMeasuredHeight(), Bitmap$Config.ARGB_8888);
                                        obj1.draw(new Canvas(obj2));
                                     }
                                  }
                               }else {
                                  viewGroup = null;
                                  goto label_029a ;
                               }
                               if (obj2 != null) {
                                  j = g0.b("VERTICAL_CAPTION");
                                  BitmapUtil.O(obj2, j, 100);
                                  uArrayList.add(g0.f(trackAsset, 50.00f, (((((((f5 / 2.00f) - ((float)obj2.getHeight() / 2.00f)) - g0.f) / ((float)g0.b / 2.00f)) / 2.00f) + 0x3f000000) * 100.00f), j, 100.00f, 100.00f));
                               }
                               j = g0.i;
                               if (PatchProxy.isSupport(og0)) {
                                  obj3 = PatchProxy.applyThreeRefs(j, Integer.valueOf(i5), Float.valueOf(f5), null, g0.class, "8");
                                  if (obj3 != patchProxyRe) {
                                     obj4 = obj3;
                                  }else {
                                  label_0356 :
                                     view = a.c(LayoutInflater.from(a1.c()), R.layout.arg_RES_7f0d12e3, null, false);
                                     obj3 = view.findViewById(R.id.recreation_author);
                                     if (TextUtils.isEmpty(j)) {
                                        obj3.setVisibility(8);
                                        objArray = new Object[false];
                                        f.D().w(str4, "drawVerticalAuthorBitmap author is empty", objArray);
                                        obj4 = null;
                                     }else {
                                        objArray1 = new Object[]{str5+j};
                                        obj3.setText(String.format(a1.p(R.string.arg_RES_7f104200), objArray1));
                                        view.measure(View$MeasureSpec.makeMeasureSpec(i5, 0x40000000), View$MeasureSpec.makeMeasureSpec(0x3fffffff, Integer.MIN_VALUE));
                                        view.layout(false, false, i5, view.getMeasuredHeight());
                                        obj4 = Bitmap.createBitmap(i5, view.getMeasuredHeight(), Bitmap$Config.ARGB_8888);
                                        view.draw(new Canvas(obj4));
                                        f4 = (float)(g0.a - i5) / 2.00f;
                                        f = (((((float)g0.b - f5) / 2.00f) + f5) - g0.f) + (float)g0.e;
                                        g0.g.set(f4, f, ((float)obj3.getMeasuredWidth() + f4), ((float)view.getMeasuredHeight() + f));
                                     }
                                  }
                               }else {
                                  goto label_0356 ;
                               }
                               if (obj4 != null) {
                                  str6 = g0.b("VERTICAL_AUTHOR");
                                  BitmapUtil.O(obj4, str6, 100);
                                  uArrayList.add(g0.f(trackAsset, 50.00f, ((((((((f5 / 2.00f) + ((float)obj4.getHeight() / 2.00f)) + (float)g0.e) - g0.f) / ((float)g0.b / 2.00f)) / 2.00f) + 0x3f000000) * 100.00f), str6, 100.00f, 100.00f));
                               }
                            }
                         }else if(PatchProxy.isSupport(og0) && PatchProxy.applyVoidFourRefs(trackAsset, uArrayList, Float.valueOf(f5), Float.valueOf(f4), null, g0.class, "5")){
                            str1 = g0.i;
                            str3 = g0.j;
                            i5 = (int)f4;
                            if (PatchProxy.isSupport(og0)) {
                               obj5 = PatchProxy.applyFourRefs(str1, str3, Integer.valueOf(i5), Float.valueOf(f5), null, g0.class, "7");
                               if (obj5 != patchProxyRe) {
                                  obj4 = obj5;
                               }else if(TextUtils.isEmpty(str1) && TextUtils.isEmpty(str3)){
                                  objArray = new Object[0];
                                  f.D().w(str4, "drawHorizontalBitmap both author and caption are empty", objArray);
                                  uBitmap = null;
                               }else {
                                  b2 = false;
                                  view = a.c(LayoutInflater.from(a1.c()), R.layout.arg_RES_7f0d12e1, null, b2);
                                  TextView textView1 = view.findViewById(R.id.recreation_author);
                                  TextView textView2 = view.findViewById(R.id.recreation_caption);
                                  if (TextUtils.isEmpty(str3)) {
                                     i6 = 8;
                                     textView2.setVisibility(i6);
                                  }else {
                                     i6 = 8;
                                     textView2.setVisibility(b2);
                                     textView2.setText(str3);
                                  }
                                  if (TextUtils.isEmpty(str1)) {
                                     textView1.setVisibility(i6);
                                  }else {
                                     textView1.setVisibility(b2);
                                     objArray1 = new Object[]{str5+str1};
                                     textView1.setText(String.format(a1.p(R.string.arg_RES_7f104200), objArray1));
                                  }
                                  view.measure(View$MeasureSpec.makeMeasureSpec(i5, 0x40000000), View$MeasureSpec.makeMeasureSpec(0x3fffffff, Integer.MIN_VALUE));
                                  view.layout(b2, b2, i5, view.getMeasuredHeight());
                                  uBitmap = Bitmap.createBitmap(i5, view.getMeasuredHeight(), Bitmap$Config.ARGB_8888);
                                  view.draw(new Canvas(uBitmap));
                                  f4 = (float)(g0.a - i5) / 2.00f;
                                  f = ((((((float)g0.b - f5) / 2.00f) + f5) - g0.f) + (float)g0.e) + (float)view.getMeasuredHeight();
                                  g0.g.set(f4, (f - (float)textView1.getMeasuredHeight()), ((float)textView1.getMeasuredWidth() + f4), f);
                               }
                            }else {
                               goto label_0480 ;
                            }
                            if (obj4 != null) {
                               str6 = g0.b("HORIZONTAL");
                               BitmapUtil.O(obj4, str6, 100);
                               uArrayList.add(g0.f(trackAsset, 50.00f, ((((((((f5 / 2.00f) + ((float)obj4.getHeight() / 2.00f)) + (float)g0.e) - g0.f) / ((float)g0.b / 2.00f)) / 2.00f) + 0x3f000000) * 100.00f), str6, 100.00f, 100.00f));
                            }
                         }
                         i4 = 0;
                         uAnimatedSub = new EditorSdk2V2$AnimatedSubAsset[i4];
                         b.setAnimatedSubAssets(uArrayList.toArray(uAnimatedSub));
                      }
                   }
                   a1 = g0.a;
                   b3 = g0.b;
                   Bitmap uBitmap1 = Bitmap.createBitmap(a1, b3, Bitmap$Config.ARGB_8888);
                   uCanvas = new Canvas(uBitmap1);
                   Paint paint = new Paint();
                   paint.setAntiAlias(true);
                   paint.setStyle(Paint$Style.FILL);
                   paint.setColor(a1.a(R.color.arg_RES_7f061d66));
                   uCanvas.drawRect(new Rect(0, 0, a1, b3), paint);
                   b3 = Math.round(((((float)b3 - f5) / 2.00f) - g0.f));
                   a1 = Math.round((((float)a1 - f4) / 2.00f));
                   i2 = Math.round(f4) + a1;
                   i1 = Math.round(f5) + b3;
                   Bitmap uBitmap2 = uBitmap1;
                   paint.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.CLEAR));
                   uCanvas.drawRoundRect(new RectF((float)a1, (float)b3, (float)i2, (float)i1), (float)a1.d(R.dimen.arg_RES_7f07042b), (float)a1.d(R.dimen.arg_RES_7f07042b), paint);
                   uBitmap = uBitmap2;
                   goto label_023a ;
                }
             }
          }else if(obj.a.T0() == Workspace$Source.MUSIC_RECREATION){
             obj4 = obj.b;
             if (obj4 != null) {
                d0.v(obj4);
                obj4 = obj.b;
                a = obj.a;
                x ox = x.class;
                obj5 = null;
                if (!PatchProxy.applyVoidTwoRefs(obj4, a, obj5, ox, str3) && obj4.trackAssetsSize() > 0) {
                   if (!PatchProxy.applyVoid(obj5, obj5, ox, str2)) {
                      g0.c().setEmpty();
                      g0.d().setEmpty();
                   }
                   trackAsset = obj4.trackAssets(0);
                   obj5 = EditorSdk2UtilsV2.trackAssetProbedVideoStream(trackAsset);
                   if (obj5 != null) {
                      if (!(obj5.rotation() % 180)) {
                         f2 = (float)obj5.height();
                         b2 = obj5.width();
                      }else {
                         f2 = (float)obj5.width();
                         b2 = obj5.height();
                      }
                      f7 = (float)b2;
                   }else {
                      f7 = 0;
                      f2 = 0;
                   }
                   String str7 = "MusicRecreationUtils";
                   if (f2 - i <= 0 || f7 - i <= 0) {
                      PostUtils.D(str7, str1, new IllegalStateException(str1));
                   }else {
                      trackAsset.setPositioningMethod(1);
                      f3 = (float)g0.d * 0x3f000000;
                      float f8 = (float)g0.a;
                      f1 = f3 / f8;
                      if (PatchProxy.isSupport(ox)) {
                         uAssetTransf1 = PatchProxy.applyOneRefs(Float.valueOf(f1), null, ox, "12");
                         if (uAssetTransf1 != patchProxyRe) {
                            uoa2 = obj4;
                            uoa3 = a;
                            j = str7;
                            f9 = f8;
                         label_067b :
                            trackAsset.setAssetTransform(uAssetTransf1);
                            if (PatchProxy.isSupport(ox)) {
                               uCropOptions = PatchProxy.applyTwoRefs(Float.valueOf(f7), Float.valueOf(f2), null, ox, "11");
                               if (uCropOptions != patchProxyRe) {
                               label_06c8 :
                                  trackAsset.setCropOptions(uCropOptions);
                                  if (!PatchProxy.isSupport(ox) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(f3), Float.valueOf(f3), null, ox, str)) {
                                     f8 = (f9 - f3) / 2.00f;
                                     f6 = (((float)g0.b - f3) / 2.00f) - x.b;
                                     g0.i(new RectF(f8, f6, (f3 + f8), (f3 + f6)));
                                  }
                                  obj4 = uoa3;
                                  if (!PatchProxy.applyVoidOneRefs(obj4, null, ox, "9")) {
                                     b = obj4.W0();
                                     obj4 = obj4.U0();
                                     if (b != null) {
                                        iterator1 = b.z().iterator();
                                        while (iterator1.hasNext()) {
                                           Text text1 = iterator1.next();
                                           if (text1 != null && ("RECREATION").equals(text1.getFeatureId().getExternal())) {
                                              x.i = text1.getAuthorText();
                                              x.j = text1.getText();
                                              x.k = ("SOUND_TRACK").equals(text1.getLocationText());
                                           }
                                        }
                                     }
                                     if (obj4 != null) {
                                        iterator1 = obj4.z().iterator();
                                        while (iterator1.hasNext()) {
                                           Sticker sticker = iterator1.next();
                                           if (sticker != null && sticker.getStickerType() == Sticker$Type.LOCAL_DYNAMIC_IMAGE_STICKER) {
                                              File uFile1 = DraftFileManager.E().B(sticker.getResult().getOutputImageFile(), obj4);
                                              str8 = (uFile1 != null)? uFile1.getAbsolutePath(): "";
                                              x.l = str8;
                                           }
                                        }
                                     }
                                  }
                                  Object[] objArray2 = new Object[0];
                                  f.D().w(j, "author = "+x.i+"caption = "+x.j, objArray2);
                                  ArrayList uArrayList1 = new ArrayList();
                                  str8 = ".png";
                                  if (!PatchProxy.isSupport(ox) || !PatchProxy.applyVoidFourRefs(trackAsset, uArrayList1, Float.valueOf(f3), Float.valueOf(f3), null, x.class, "5")) {
                                     if (PatchProxy.isSupport(ox)) {
                                        uBitmap = PatchProxy.applyTwoRefs(Float.valueOf(f3), Float.valueOf(f3), null, ox, "10");
                                        if (uBitmap != patchProxyRe) {
                                        label_0865 :
                                           str = PatchProxy.apply(null, null, ox, "14");
                                           if (str != patchProxyRe) {
                                           }else {
                                              obj6 = new File(PostUtils.f(), "RECREATION_BG_"+System.currentTimeMillis()+str8);
                                              b.q(obj6);
                                              str = obj6.getAbsolutePath();
                                           }
                                           BitmapUtil.O(uBitmap, str, 75);
                                           uArrayList1.add(g0.f(trackAsset, 50.00f, 50.00f, str, 100.00f, 100.00f));
                                        }
                                     }
                                     a1 = g0.a;
                                     b3 = g0.b;
                                     Bitmap uBitmap3 = Bitmap.createBitmap(a1, b3, Bitmap$Config.ARGB_8888);
                                     uCanvas = new Canvas(uBitmap3);
                                     Paint paint1 = new Paint();
                                     paint1.setAntiAlias(true);
                                     paint1.setStyle(Paint$Style.FILL);
                                     paint1.setColor(a1.a(R.color.arg_RES_7f061d66));
                                     uCanvas.drawRect(new Rect(0, 0, a1, b3), paint1);
                                     b3 = Math.round(((((float)b3 - f3) / 2.00f) - x.b));
                                     a1 = Math.round((((float)a1 - f3) / 2.00f));
                                     i6 = Math.round(f3) + a1;
                                     i2 = Math.round(f3) + b3;
                                     paint1.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.CLEAR));
                                     uCanvas.drawRoundRect(new RectF((float)a1, (float)b3, (float)i6, (float)i2), (float)a1.d(R.dimen.arg_RES_7f07042b), (float)a1.d(R.dimen.arg_RES_7f07042b), paint1);
                                     uBitmap = uBitmap3;
                                     goto label_0865 ;
                                  }
                                  if (!PatchProxy.isSupport(ox) || !PatchProxy.applyVoidFourRefs(trackAsset, uArrayList1, Float.valueOf(f3), Float.valueOf(f3), null, x.class, "7")) {
                                     str5 = x.i;
                                     str = x.j;
                                     b2 = (int)f3;
                                     if (PatchProxy.isSupport(ox)) {
                                        obj6 = PatchProxy.applyFourRefs(str5, str, Integer.valueOf(b2), Float.valueOf(f3), null, x.class, "8");
                                        if (obj6 != patchProxyRe) {
                                           obj7 = obj6;
                                        }else if(TextUtils.isEmpty(str5) && TextUtils.isEmpty(str)){
                                           objArray2 = new Object[0];
                                           f.D().w(j, "drawHorizontalBitmap both author and caption are empty", objArray2);
                                           obj7 = null;
                                        }else {
                                           obj7 = null;
                                           obj1 = a.c(LayoutInflater.from(a1.c()), R.layout.arg_RES_7f0d1021, obj7, false);
                                           obj3 = obj1.findViewById(R.id.recreation_author);
                                           TextView textView3 = obj1.findViewById(R.id.recreation_caption);
                                           if (!x.k) {
                                              obj3.setBackground(obj7);
                                           }
                                           if (TextUtils.isEmpty(str)) {
                                              i6 = 8;
                                              textView3.setVisibility(i6);
                                              f1 = 0;
                                           }else {
                                              i6 = 8;
                                              i2 = 0;
                                              textView3.setVisibility(i2);
                                              textView3.setText(str);
                                           }
                                           if (TextUtils.isEmpty(str5)) {
                                              obj3.setVisibility(i6);
                                           }else {
                                              obj3.setVisibility(f1);
                                              obj3.setText(str5);
                                           }
                                           a1 = g0.d;
                                           obj1.measure(View$MeasureSpec.makeMeasureSpec((a1 - (x.f * 2)), 0x40000000), View$MeasureSpec.makeMeasureSpec(0x3fffffff, Integer.MIN_VALUE));
                                           obj1.layout(0, 0, obj1.getMeasuredWidth(), obj1.getMeasuredHeight());
                                           obj8 = Bitmap.createBitmap(obj1.getMeasuredWidth(), obj1.getMeasuredHeight(), Bitmap$Config.ARGB_8888);
                                           obj1.draw(new Canvas(obj8));
                                           f6 = (float)(a1 - obj3.getMeasuredWidth()) / 2.00f;
                                           f5 = (((((float)g0.b * 0x3f000000) - x.b) + (f3 * 0x3f000000)) + (float)x.c) + (float)obj1.getMeasuredHeight();
                                           g0.h(new RectF(f6, (f5 - (float)obj3.getMeasuredHeight()), ((float)obj3.getMeasuredWidth() + f6), f5));
                                           obj7 = obj8;
                                        }
                                     }else {
                                        goto label_08fa ;
                                     }
                                     if (obj7 != null) {
                                        f6 = (float)g0.b;
                                        f7 = (((((f6 * 0x3f000000) - x.b) + (f3 * 0x3f000000)) + (float)x.c) + ((float)obj7.getHeight() * 0x3f000000)) / f6;
                                        str5 = "HORIZONTAL";
                                        obj8 = PatchProxy.applyOneRefs(str5, null, ox, "13");
                                        if (obj8 != patchProxyRe) {
                                           str6 = obj8;
                                        }else {
                                           File uFile = new File(PostUtils.f(), "RECREATION_"+str5+"_"+System.currentTimeMillis()+str8);
                                           b.q(uFile);
                                           str6 = uFile.getAbsolutePath();
                                        }
                                        BitmapUtil.O(obj7, str6, 100);
                                        uArrayList1.add(g0.f(trackAsset, 50.00f, (f7 * 100.00f), str6, 100.00f, 100.00f));
                                     }
                                  }
                                  if (!PatchProxy.applyVoidTwoRefs(trackAsset, uArrayList1, null, ox, "6")) {
                                     str6 = x.l;
                                     b3 = 0;
                                     Object[] objArray3 = new Object[b3];
                                     f.D().w(j, "addSoundWaveSubAssets soundWavePath = "+str6, objArray3);
                                     if (TextUtils.isEmpty(str6)) {
                                        objArray = new Object[b3];
                                        f.D().A(j, "soundWavePath is empty", objArray);
                                     }else {
                                        BitmapFactory$Options options = new BitmapFactory$Options();
                                        options.inJustDecodeBounds = true;
                                        BitmapFactory.decodeFile(str6, options);
                                        f4 = (float)x.h;
                                        uArrayList1.add(g0.g(trackAsset, 50.00f, ((((g0.c().bottom + (float)x.e) + (f4 * 0x3f000000)) / (float)g0.b) * 100.00f), str6, ((((float)x.g * 0x3f800000) / (float)options.outWidth) * 100.00f), (((f4 * 0x3f800000) / (float)options.outHeight) * 100.00f), 70.00f));
                                     }
                                  }
                                  i4 = 0;
                                  uAnimatedSub = new EditorSdk2V2$AnimatedSubAsset[i4];
                                  uoa2.setAnimatedSubAssets(uArrayList1.toArray(uAnimatedSub));
                               }
                            }
                            uCropOptions = new Minecraft$CropOptions();
                            uCropOptions.setBorderRadius(0.08f);
                            uCropOptions.setBorderPosLeftTop(true);
                            uCropOptions.setBorderPosLeftBottom(true);
                            uCropOptions.setBorderPosRightBottom(true);
                            uCropOptions.setBorderPosRightTop(true);
                            uCropOptions.setHeight((int)f2);
                            uCropOptions.setWidth((int)f7);
                            Minecraft$AssetTransform uAssetTransf2 = new Minecraft$AssetTransform();
                            double d1 = 50.00f;
                            uAssetTransf2.setPositionX(d1);
                            uAssetTransf2.setPositionY(d1);
                            uCropOptions.setTransform(uAssetTransf2);
                            goto label_06c8 ;
                         }
                      }
                      uAssetTransf1 = new Minecraft$AssetTransform();
                      uoa2 = obj4;
                      uoa3 = a;
                      uAssetTransf1.setPositionX(50.00f);
                      j = str7;
                      f9 = f8;
                      uAssetTransf1.setPositionY((double)((0x3f000000 - (x.b / (float)g0.b)) * 100.00f));
                      d = (double)(f1 * 100.00f);
                      uAssetTransf1.setScaleX(d);
                      uAssetTransf1.setScaleY(d);
                      goto label_067b ;
                   }
                }
             }
          }
          if (obj.a.T0() == Workspace$Source.PICTURE_RECREATION && obj.b != null) {
             EditorSdk2MvCreationResult uEditorSdk2M = b0.c(obj.a, obj.d);
             obj.i = uEditorSdk2M;
             d0.v(uEditorSdk2M.getProject());
          }
       }else {
          goto label_05ad ;
       }
    label_0b0b :
       return;
    }
    public int g(){
       return 0;
    }
}
