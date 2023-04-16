package com.yxcorp.gifshow.relation.appwidget.IntimateSquareProvider;
import android.appwidget.AppWidgetProvider;
import com.yxcorp.gifshow.relation.appwidget.IntimateSquareProvider$a;
import nsd.u;
import android.graphics.Bitmap;
import android.content.res.Resources;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Math;
import eg.a;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import kotlin.jvm.internal.a;
import android.content.Context;
import w9c.h;
import q87.c;
import w9c.i;
import w9c.i$a;
import android.appwidget.AppWidgetManager;
import java.lang.Integer;
import kotlin.jvm.internal.Ref$IntRef;
import v6d.a;
import android.content.SharedPreferences;
import java.lang.Number;
import android.os.Bundle;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.lang.StringBuilder;
import java.lang.System;
import wkd.b;
import xac.s;
import brd.t;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import w9c.f;
import w9c.g;
import erd.g;
import crd.b;

public final class IntimateSquareProvider extends AppWidgetProvider	// class@0017d8
{
    public boolean a;
    public long b;
    public static final IntimateSquareProvider$a c;

    static {
       IntimateSquareProvider.c = new IntimateSquareProvider$a(null);
    }
    public void IntimateSquareProvider(){
       super();
    }
    public final Bitmap a(Bitmap p0,Resources p1,float p2,float p3){
       if (PatchProxy.isSupport(IntimateSquareProvider.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Float.valueOf(p2), Float.valueOf(p3), this, IntimateSquareProvider.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = Math.min(p0.getWidth(), p0.getHeight());
       Bitmap uBitmap = Bitmap.createBitmap(i, i, Bitmap$Config.ARGB_8888);
       int i1 = i - p0.getWidth();
       new Canvas(uBitmap).drawBitmap(p0, ((float)i1 / 2.00f), ((float)(i - p0.getHeight()) / 2.00f), null);
       p0 = Bitmap.createScaledBitmap(uBitmap, a.c(p2, p1), a.c(p3, p1), false);
       a.o(p0, "Bitmap.createScaledBitma¡­ap, width, height, false\)");
       return p0;
    }
    public void onDisabled(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IntimateSquareProvider.class, "3")) {
          return;
       }
       a.p(p0, "context");
       Object[] objArray = new Object[0];
       h.c.w("IntimateSquareWidget", "DeleteWidget", objArray);
       i.a.k(0);
       return;
    }
    public void onEnabled(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IntimateSquareProvider.class, "2")) {
          return;
       }
       a.p(p0, "context");
       Object[] objArray = new Object[0];
       h.c.w("IntimateSquareWidget", "AddWidget", objArray);
       i.a.k(true);
       return;
    }
    public void onUpdate(Context p0,AppWidgetManager p1,int[] p2){
       SharedPreferences a;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, IntimateSquareProvider.class, "1")) {
          return;
       }
       a.p(p0, "context");
       a.p(p1, "appWidgetManager");
       a.p(p2, "appWidgetIds");
       int i = 1;
       int i1 = 0;
       int i2 = (!p2.length)? 1: 0;
       if (i2 ^ i) {
          h c = h.c;
          Object[] objArray = new Object[i1];
          c.s("IntimateSquareWidget", "onUpdate", objArray);
          int i3 = p2[i1];
          if (!PatchProxy.isSupport(IntimateSquareProvider.class) || !PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(i3), this, IntimateSquareProvider.class, "5")) {
             Ref$IntRef intRef = new Ref$IntRef();
             a = a.a;
             int intx = a.getInt("intimate_max_width", i1);
             intRef.element = intx;
             if (!intx) {
                if (PatchProxy.isSupport(IntimateSquareProvider.class)) {
                   Object obj = PatchProxy.applyTwoRefs(p1, Integer.valueOf(i3), this, IntimateSquareProvider.class, "7");
                   if (obj != PatchProxyResult.class) {
                      i3 = obj.intValue();
                   }else {
                   label_0081 :
                      Bundle appWidOption = p1.getAppWidgetOptions(i3);
                      i3 = (appWidOption != null && appWidOption.getInt("appWidgetMinWidth") > 0)? Math.min(appWidOption.getInt("appWidgetMaxWidth"), appWidOption.getInt("appWidgetMaxHeight")): 165;
                   }
                }else {
                   goto label_0081 ;
                }
                intRef.element = i3;
                SharedPreferences$Editor uEditor = a.edit();
                uEditor.putInt("intimate_max_width", i3);
                g.a(uEditor);
             }
             Object[] objArray1 = new Object[i1];
             c.w("IntimateSquareWidget", "request start,currentTime:"+System.currentTimeMillis()+", sinceLastRequest: "+(System.currentTimeMillis() - this.b), objArray1);
             this.b = System.currentTimeMillis();
             i3 = b.a(-1334121008);
             a.o(i3, "Singleton.get\(RelationApiService::class.java\)");
             i3.m().map(new e()).subscribeOn(d.c).observeOn(d.a).subscribe(new f(this, p0, p1, intRef), new g(this, p0, p1, intRef));
          }
       }
       return;
    }
}
