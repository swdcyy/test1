package com.yxcorp.gifshow.growth.widget.RankListWidgetService$b;
import android.widget.RemoteViewsService$RemoteViewsFactory;
import com.yxcorp.gifshow.growth.widget.RankListWidgetService;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import usd.q;
import android.widget.RemoteViews;
import lra.c$a;
import java.lang.Integer;
import com.yxcorp.gifshow.growth.widget.WidgetType;
import android.app.Application;
import o56.a;
import java.util.Collection;
import ekd.q;
import android.content.res.Resources;
import com.yxcorp.gifshow.growth.model.GrowthWidgetBean;
import java.lang.CharSequence;
import lra.c;
import java.util.Objects;
import nsd.r0;
import java.util.Arrays;
import com.yxcorp.utility.TextUtils;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Color;
import android.graphics.Paint$Style;
import android.content.Context;
import com.yxcorp.utility.n;
import android.graphics.Paint$Align;
import lnc.a1;
import java.lang.Math;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.content.Intent;
import com.yxcorp.gifshow.growth.activity.GrowthRouterActivity;

public final class RankListWidgetService$b implements RemoteViewsService$RemoteViewsFactory	// class@0015d9
{
    public String a;
    public List b;
    public final RankListWidgetService c;

    public void RankListWidgetService$b(RankListWidgetService p0,String p1,List p2){
       a.p(p1, "widgetType");
       a.p(p2, "beanList");
       this.c = p0;
       super();
       this.a = p1;
       this.b = p2;
    }
    public int getCount(){
       Object obj = PatchProxy.apply(null, this, RankListWidgetService$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return q.u(this.b.size(), 5);
    }
    public long getItemId(int p0){
       return (long)p0;
    }
    public RemoteViews getLoadingView(){
       return null;
    }
    public RemoteViews getViewAt(int p0){
       RemoteViews obj1;
       Application uApplication;
       int color;
       PatchProxyResult patchProxyRe1;
       RankListWidgetService$b a;
       Intent intent;
       Object obj = this;
       int i = p0;
       c$a uoa = c$a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       if (PatchProxy.isSupport(RankListWidgetService$b.class)) {
          obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), obj, RankListWidgetService$b.class, str);
          if (obj1 != patchProxyRe) {
             return obj1;
          }
       }
       String str1 = "AppEnv.getAppContext\(\)";
       if (a.g(obj.a, WidgetType.RANK_DARK.getType())) {
          uApplication = a.b();
          a.o(uApplication, str1);
          obj1 = new RemoteViews(uApplication.getPackageName(), 0x7f0d0569);
       }else {
          uApplication = a.b();
          a.o(uApplication, str1);
          obj1 = new RemoteViews(uApplication.getPackageName(), 0x7f0d056a);
       }
       if (q.f(obj.b) || (i >= 0 && i < obj.b.size())) {
          uApplication = a.b();
          a.o(uApplication, str1);
          Resources resources = uApplication.getResources();
          GrowthWidgetBean growthWidget = obj.b.get(i);
          int i1 = 1;
          i = i + i1;
          String str2 = 2;
          if (i != i1) {
             if (i != str2) {
                if (i != 3) {
                   if (i != 4) {
                      if (i != 5) {
                         color = resources.getColor(R.color.arg_RES_7f0600a6);
                      }else if(a.g(obj.a, WidgetType.RANK_LIGHT.getType())){
                         color = resources.getColor(R.color.arg_RES_7f0600fa);
                      }else {
                         color = resources.getColor(R.color.arg_RES_7f0600f9);
                      }
                   }else if(a.g(obj.a, WidgetType.RANK_LIGHT.getType())){
                      color = resources.getColor(R.color.arg_RES_7f0600fc);
                   }else {
                      color = resources.getColor(R.color.arg_RES_7f0600fb);
                   }
                }else if(a.g(obj.a, WidgetType.RANK_LIGHT.getType())){
                   color = resources.getColor(R.color.arg_RES_7f060100);
                }else {
                   color = resources.getColor(R.color.arg_RES_7f0600ff);
                }
             }else if(a.g(obj.a, WidgetType.RANK_LIGHT.getType())){
                color = resources.getColor(R.color.arg_RES_7f060102);
             }else {
                color = resources.getColor(R.color.arg_RES_7f060101);
             }
          }else if(a.g(obj.a, WidgetType.RANK_LIGHT.getType())){
             color = resources.getColor(R.color.arg_RES_7f0600fe);
          }else {
             color = resources.getColor(R.color.arg_RES_7f0600fd);
          }
          obj1.setTextColor(R.id.rank_number, color);
          obj1.setTextViewText(R.id.rank_number, String.valueOf(i));
          obj1.setTextViewText(R.id.hot_rank_title, growthWidget.c());
          color = 0x7f0a12ea;
          c$a b = c.b;
          Application uApplication1 = a.b();
          a.o(uApplication1, str1);
          int i2 = (int)growthWidget.d;
          Objects.requireNonNull(b);
          int i3 = 0;
          if (PatchProxy.isSupport(uoa)) {
             str2 = PatchProxy.applyTwoRefs(uApplication1, Integer.valueOf(i2), b, uoa, "14");
             if (str2 != patchProxyRe) {
             label_01a3 :
                obj1.setTextViewText(color, str2);
                GrowthWidgetBean growthWidget1 = (!TextUtils.x(growthWidget.a()) && !TextUtils.x(growthWidget.b()))? 1: null;
                growthWidget1 = (growthWidget1)? growthWidget: null;
                if (growthWidget1 != null) {
                   obj1.setViewVisibility(R.id.hot_rank_flag, i3);
                   str2 = growthWidget1.a();
                   a.o(str2, "it.iconText");
                   str1 = growthWidget1.b();
                   a.o(str1, "it.iconTextColor");
                   Objects.requireNonNull(b);
                   Bitmap uBitmap = PatchProxy.applyTwoRefs(str2, str1, b, uoa, str);
                   if (uBitmap != patchProxyRe) {
                      patchProxyRe1 = patchProxyRe;
                   }else {
                      a.p(str2, "text");
                      a.p(str1, "color");
                      Paint paint = new Paint();
                      paint.setColor(Color.parseColor("#ffffffff"));
                      paint.setStyle(Paint$Style.FILL);
                      paint.setTextSize((float)n.c0(a.b(), 10.00f));
                      paint.setTextAlign(Paint$Align.CENTER);
                      float f = (float)a1.d(0x7f070295);
                      float f1 = Math.max(f, (paint.measureText(str2) + (float)a1.e(4.00f)));
                      Paint paint1 = new Paint();
                      Bitmap uBitmap1 = Bitmap.createBitmap((int)f1, (int)f, Bitmap$Config.ARGB_8888);
                      Canvas uCanvas = new Canvas(uBitmap1);
                      patchProxyRe1 = patchProxyRe;
                      paint1.setAntiAlias(true);
                      paint1.setColor(Color.parseColor(str1));
                      uCanvas.drawRoundRect(new RectF(0, 0, f1, f), (float)a1.d(R.dimen.arg_RES_7f07030a), (float)a1.d(R.dimen.arg_RES_7f07030a), paint1);
                      float f2 = (float)2;
                      uCanvas.translate((f1 / f2), (f / f2));
                      uCanvas.drawText(str2, 0, str2.length(), 0, (Math.abs((paint.ascent() + paint.descent())) / f2), paint);
                      a.o(uBitmap1, "bitmap");
                      uBitmap = uBitmap1;
                   }
                   obj1.setImageViewBitmap(R.id.hot_rank_flag, uBitmap);
                }else {
                   patchProxyRe1 = patchProxyRe;
                }
                str = growthWidget.c();
                a.o(str, "bean\n            .title");
                a = obj.a;
                Objects.requireNonNull(b);
                if (PatchProxy.isSupport(uoa)) {
                   intent = PatchProxy.applyThreeRefs(str, Integer.valueOf(i), a, b, c$a.class, "15");
                   if (intent != patchProxyRe1) {
                   label_02f0 :
                      obj1.setOnClickFillInIntent(R.id.root, intent);
                   }
                }
                a.p(str, "title");
                a.p(a, "widgetType");
                intent = new Intent(a.b(), GrowthRouterActivity.class).putExtra("key_search_title", str).putExtra("key_rank_list_index", i);
                a.o(intent, "Intent\(AppEnv.getAppCont¡­ANK_LIST_INDEX, position\)");
                goto label_02f0 ;
             }
          }
          a.p(uApplication1, "context");
          Application uApplication2 = a.b();
          a.o(uApplication2, str1);
          Resources resources1 = uApplication2.getResources();
          str1 = resources1.getString(R.string.arg_RES_7f101318);
          a.o(str1, "AppEnv.getAppContext\(\)\n ¡­.growth_prefix_hot_value\)");
          Object[] objArray = new Object[i1];
          objArray[i3] = Integer.valueOf((i2 / 10000));
          str2 = String.format(str1, Arrays.copyOf(objArray, i1));
          a.o(str2, "java.lang.String.format\(format, *args\)");
          goto label_01a3 ;
       }
    label_02f3 :
       return obj1;
    }
    public int getViewTypeCount(){
       return 1;
    }
    public boolean hasStableIds(){
       return false;
    }
    public void onCreate(){
    }
    public void onDataSetChanged(){
    }
    public void onDestroy(){
    }
}
