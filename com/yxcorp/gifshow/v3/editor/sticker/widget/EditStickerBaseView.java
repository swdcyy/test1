package com.yxcorp.gifshow.v3.editor.sticker.widget.EditStickerBaseView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.sticker.widget.ChineseLunarDateStickerView;
import com.yxcorp.gifshow.v3.editor.sticker.widget.GreyDateIdStickerView;
import com.yxcorp.gifshow.v3.editor.sticker.widget.OrangeIdStickerView;
import com.yxcorp.gifshow.v3.editor.sticker.widget.KuaiShouIdStickerView;
import com.yxcorp.gifshow.v3.editor.sticker.widget.GreyTimeStickerView;
import com.yxcorp.gifshow.v3.editor.sticker.widget.CircleDateStickerView;
import com.yxcorp.gifshow.v3.editor.sticker.widget.TimeDashStickerView;
import com.yxcorp.gifshow.v3.editor.sticker.widget.DateSquareStickerView;
import com.yxcorp.gifshow.v3.editor.sticker.widget.DateWeekDayStickerView;
import com.yxcorp.gifshow.v3.editor.sticker.widget.OrangeDateTimeStickerView;
import com.yxcorp.gifshow.v3.editor.sticker.widget.FollowIdStickerView;
import com.yxcorp.gifshow.v3.editor.sticker.widget.OrangeIdBubbleStickerView;
import com.yxcorp.gifshow.v3.editor.sticker.widget.KuaiShouOrangeIdStickerView;
import java.io.File;
import android.graphics.Bitmap;
import java.lang.System;
import android.graphics.BitmapFactory$Options;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.graphics.BitmapFactory;
import faa.a;
import java.lang.StringBuilder;
import ekd.k1;
import q87.c;
import android.graphics.Canvas;
import android.text.TextPaint;
import java.lang.Integer;
import android.graphics.Paint;
import itc.k3;
import java.lang.Boolean;
import xtc.a;
import io.reactivex.e;
import brd.m;
import t45.d;
import brd.z;
import xtc.b;
import com.yxcorp.gifshow.v3.editor.sticker.widget.a;
import erd.g;
import crd.b;
import java.lang.ref.WeakReference;
import xtc.c;
import java.lang.Runnable;
import android.graphics.Paint$Cap;
import android.graphics.Paint$Align;
import android.graphics.Typeface;
import lnc.a1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditWaterMarkStickerDrawer;

public abstract class EditStickerBaseView extends View	// class@0012e2
{
    public String b;
    public float c;
    public static final int d;

    public void EditStickerBaseView(Context p0){
       super(p0);
       this.c = 0x3f800000;
    }
    public void EditStickerBaseView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.c = 0x3f800000;
    }
    public void EditStickerBaseView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = 0x3f800000;
    }
    public static EditStickerBaseView e(String p0,View p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, EditStickerBaseView.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p0);
       int i = -1;
       switch (p0.hashCode()){
           case '1':
             if (p0.equals("1")) {
                i = 0;
             }
             break;
           case '2':
             if (p0.equals("2")) {
                i = 1;
             }
             break;
           case '3':
             if (p0.equals("3")) {
                i = 2;
             }
             break;
           case '4':
             if (p0.equals("4")) {
                i = 3;
             }
             break;
           case '5':
             if (p0.equals("5")) {
                i = 4;
             }
             break;
           case '6':
             if (p0.equals("6")) {
                i = 5;
             }
             break;
           case '7':
             if (p0.equals("7")) {
                i = 6;
             }
             break;
           case 1567:
             if (p0.equals("10")) {
                i = 7;
             }
             break;
           case 1568:
             if (p0.equals("11")) {
                i = 8;
             }
             break;
           case 1569:
             if (p0.equals("12")) {
                i = 9;
             }
             break;
           case 1570:
             if (p0.equals("13")) {
                i = 10;
             }
             break;
           case 1571:
             if (p0.equals("14")) {
                i = 11;
             }
             break;
           case 1572:
             if (p0.equals("15")) {
                i = 12;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             return new KuaiShouOrangeIdStickerView(p1.getContext());
           case 1:
             return new OrangeIdBubbleStickerView(p1.getContext());
           case 2:
             return new FollowIdStickerView(p1.getContext());
           case 3:
             return new OrangeDateTimeStickerView(p1.getContext());
           case 4:
             return new DateWeekDayStickerView(p1.getContext());
           case 5:
             return new DateSquareStickerView(p1.getContext());
           case 6:
             return new TimeDashStickerView(p1.getContext());
           case 7:
             return new CircleDateStickerView(p1.getContext());
           case 8:
             return new GreyTimeStickerView(p1.getContext());
           case 9:
             return new KuaiShouIdStickerView(p1.getContext());
           case 10:
             return new OrangeIdStickerView(p1.getContext());
           case 11:
             return new GreyDateIdStickerView(p1.getContext());
           case 12:
             return new ChineseLunarDateStickerView(p1.getContext());
           default:
             return null;
       }
    }
    public final Bitmap a(File p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EditStickerBaseView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       BitmapFactory$Options options = new BitmapFactory$Options();
       options.inMutable = true;
       options.inTargetDensity = c.c(a.a().a().getResources()).densityDpi;
       options.inDensity = 320;
       Object[] objArray = new Object[0];
       a.D().w("EditStickerBaseView", "decodeBitmap cost:"+k1.t(System.currentTimeMillis()), objArray);
       return BitmapFactory.decodeFile(p0.getAbsolutePath(), options);
    }
    public abstract void b(Canvas p0,TextPaint p1);
    public void c(Canvas p0,TextPaint p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EditStickerBaseView.class, "6")) {
          return;
       }
       this.b(p0, p1);
       return;
    }
    public void d(Canvas p0,String p1,int p2,int p3,int p4,int p5,TextPaint p6){
       int i = 0;
       if (PatchProxy.isSupport(EditStickerBaseView.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),p6};
          if (PatchProxy.applyVoid(objArray, this, EditStickerBaseView.class, "7")) {
             return;
          }
       }
       if (k3.x(p1, p2, p5, i, p6)) {
          p2 = k3.u(p1, p5, p2, i, p6);
          p5 = 0;
       }else {
          p5 = k3.o(p1, p5, p2, i, p6);
       }
       p6.setTextSize((float)p2);
       for (; i < p1.length(); i = p2) {
          p2 = i + 1;
          p0.drawText(p1.substring(i, p2), (float)p3, (float)p4, p6);
          int i1 = (int)p6.measureText(p1.substring(i, p2)) + p5;
          p3 = p3 + i1;
       }
       return;
    }
    public void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditStickerBaseView.class, "1")) {
          return;
       }
       super.draw(p0);
       p0.save();
       p0.scale(this.c, this.c);
       this.c(p0, this.getPaint());
       p0.restore();
       return;
    }
    public void f(File p0,boolean p1){
       if (PatchProxy.isSupport(EditStickerBaseView.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, EditStickerBaseView.class, "3")) {
          return;
       }
       if (p1) {
          m.f(new a(this, p0)).B(d.c).u(d.a).y(new b(this), a.b);
       }else {
          k1.o(new c(this, new WeakReference(this.a(p0))));
       }
       return;
    }
    public void g(WeakReference p0,boolean p1){
    }
    public final TextPaint getPaint(){
       TextPaint obj = PatchProxy.apply(null, this, EditStickerBaseView.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new TextPaint();
       obj.setFlags(7);
       obj.setAntiAlias(true);
       obj.setDither(true);
       obj.setStrokeCap(Paint$Cap.SQUARE);
       obj.setColor(-1);
       obj.setTextAlign(Paint$Align.CENTER);
       obj.setTypeface(k3.k());
       obj.setShadowLayer((float)a1.e(0x3f800000), 0, (float)a1.e(0x3f800000), 0x20000000);
       return obj;
    }
    public File getResourcePictureFile(){
       File obj = PatchProxy.apply(null, this, EditStickerBaseView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(this.b)) {
          return null;
       }
       obj = new File(this.b);
       if (!obj.exists() || !obj.isFile()) {
          return null;
       }
       return obj;
    }
    public int getStickerSize(){
       return (int)EditWaterMarkStickerDrawer.WATER_MARK_DRAW_SIZE;
    }
    public void setResourceFilePath(String p0){
       this.b = p0;
    }
    public void setScale(float p0){
       this.c = p0;
    }
}
