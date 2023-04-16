package com.kds.headertabscrollview.viewmanager.TabLayoutViewManager;
import com.facebook.react.uimanager.SimpleViewManager;
import com.kds.headertabscrollview.viewmanager.TabLayoutViewManager$a;
import nsd.u;
import ze.n0;
import android.view.View;
import com.kds.headertabscrollview.layout.TabsView;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.content.Context;
import java.util.Map;
import java.lang.Integer;
import vd.d;
import vd.d$b;
import com.kds.headertabscrollview.event.TabEvent;
import com.facebook.react.uimanager.BaseViewManager;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout$f;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import ze.p;
import android.widget.HorizontalScrollView;
import android.graphics.drawable.Drawable;
import r0.a;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources;
import android.graphics.Color;
import java.util.ArrayList;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import java.lang.Class;
import com.facebook.react.bridge.NativeModule;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.d;
import com.kds.headertabscrollview.viewmanager.TabLayoutViewManager$b;
import com.google.android.material.tabs.d$b;

public final class TabLayoutViewManager extends SimpleViewManager	// class@00073b
{
    public float normalTextSize;
    public static final TabLayoutViewManager$a Companion;

    static {
       TabLayoutViewManager.Companion = new TabLayoutViewManager$a(null);
    }
    public void TabLayoutViewManager(){
       super();
       this.normalTextSize = 0xbf800000;
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public TabsView createViewInstance(n0 p0){
       a.q(p0, "reactContext");
       return new TabsView(p0);
    }
    public Map getCommandsMap(){
       return d.d("selectTab", Integer.valueOf(1));
    }
    public Map getExportedCustomDirectEventTypeConstants(){
       d$b uob = d.a();
       TabEvent oN_TAB_SELEC = TabEvent.ON_TAB_SELECTED;
       String str = oN_TAB_SELEC.toString();
       uob.b(str, d.d("registrationName", oN_TAB_SELEC.toString()));
       oN_TAB_SELEC = TabEvent.ON_TAB_UNSELECTED;
       str = oN_TAB_SELEC.toString();
       uob.b(str, d.d("registrationName", oN_TAB_SELEC.toString()));
       oN_TAB_SELEC = TabEvent.ON_TAB_RESELECTED;
       str = oN_TAB_SELEC.toString();
       uob.b(str, d.d("registrationName", oN_TAB_SELEC.toString()));
       Map map = uob.a();
       a.h(map, "MapBuilder.builder<Strin¡­\)\)\n      \)\n      .build\(\)");
       return map;
    }
    public String getName(){
       return "TabLayout";
    }
    public void onAfterUpdateTransaction(View p0){
       this.onAfterUpdateTransaction(p0);
    }
    public void onAfterUpdateTransaction(TabsView p0){
       a.q(p0, "view");
       super.onAfterUpdateTransaction(p0);
       int tabCount = p0.getTabCount();
       int i = 0;
       while (i < tabCount) {
          TabLayout$f uof = p0.v(i);
          if (uof != null) {
             p0.P(uof, uof.f());
          }
          i = i + 1;
       }
       return;
    }
    public void receiveCommand(View p0,int p1,ReadableArray p2){
       this.receiveCommand(p0, p1, p2);
    }
    public void receiveCommand(View p0,String p1,ReadableArray p2){
       this.receiveCommand(p0, p1, p2);
    }
    public void receiveCommand(TabsView p0,int p1,ReadableArray p2){
       a.q(p0, "root");
       if (p1 != 1) {
       }else {
          p0.N(p2);
       }
       return;
    }
    public void receiveCommand(TabsView p0,String p1,ReadableArray p2){
       a.q(p0, "root");
       a.q(p1, "commandId");
       if (p1.hashCode() != -1715986183) {
       }else if(p1.equals("selectTab")){
          p0.N(p2);
       }
       return;
    }
    public final void setPaddings(TabsView p0,ReadableMap p1){
       a.q(p0, "view");
       a.q(p1, "map");
       String str = "paddingLeft";
       double d = 0;
       double doublex = (p1.hasKey(str))? p1.getDouble(str): d;
       String str1 = "paddingTop";
       double doublex1 = (p1.hasKey(str1))? p1.getDouble(str1): d;
       String str2 = "paddingRight";
       double doublex2 = (p1.hasKey(str2))? p1.getDouble(str2): d;
       if (p1.hasKey("paddingBottom")) {
          d = p1.getDouble("paddingBottom");
       }
       p0.setPadding((int)p.b(doublex), (int)p.b(doublex1), (int)p.b(doublex2), (int)p.b(d));
       return;
    }
    public final void setTabBoldWhenSelected(TabsView p0,boolean p1){
       a.q(p0, "view");
       p0.setBoldWhenSelected(p1);
    }
    public final void setTabIndicator(TabsView p0,ReadableMap p1){
       boolean i1;
       a.q(p0, "tabsView");
       a.q(p1, "args");
       String str = "height";
       float f = (p1.hasKey(str))? (float)p1.getInt(str): 2.00f;
       int i = (int)p.c(f);
       String str1 = "width";
       if (p1.hasKey(str1)) {
          i1 = (int)p.b((double)p1.getInt(str1));
          Context context = p0.getContext();
          Drawable uDrawable = a.d(context, R.drawable.arg_RES_7f080677);
          if (uDrawable == null) {
             a.L();
          }
          a.h(uDrawable, "AppCompatResources.getDr¡­wable.custom_indicator\)!!");
          Bitmap uBitmap = Bitmap.createBitmap(i1, i, Bitmap$Config.ARGB_8888);
          a.h(uBitmap, "Bitmap.createBitmap\(indi¡­ Bitmap.Config.ARGB_8888\)");
          Canvas uCanvas = new Canvas(uBitmap);
          uDrawable.setBounds(0, 0, uCanvas.getWidth(), uCanvas.getHeight());
          uDrawable.draw(uCanvas);
          a.h(context, "context");
          BitmapDrawable uBitmapDrawa = new BitmapDrawable(context.getResources(), uBitmap);
          uBitmapDrawa.setGravity(17);
          p0.setSelectedTabIndicator(uBitmapDrawa);
       }else {
          str1 = "useFullWidth";
          i1 = (p1.hasKey(str1))? p1.getBoolean(str1): true;
          p0.setTabIndicatorFullWidth(i1);
          p0.setSelectedTabIndicatorHeight(i);
       }
       if (p1.hasKey("color")) {
          p0.setSelectedTabIndicatorColor(Color.parseColor(p1.getString("color")));
       }
       return;
    }
    public final void setTabMode(TabsView p0,int p1){
       a.q(p0, "view");
       p0.setTabMode(p1);
    }
    public final void setTabNormalTextColor(TabsView p0,int p1){
       a.q(p0, "view");
       p0.setNormalTextColor(p1);
    }
    public final void setTabSelectedTextColor(TabsView p0,int p1){
       a.q(p0, "view");
       p0.setSelectedTextColor(p1);
    }
    public final void setTabSelectedTextSize(TabsView p0,float p1){
       a.q(p0, "view");
       p0.setSelectedTabTextSize(p.c(p1));
    }
    public final void setTabTextSize(TabsView p0,float p1){
       a.q(p0, "view");
       this.normalTextSize = p.c(p1);
       p0.setTabTextSize(p.c(p1));
    }
    public final void setTabTitles(TabsView p0,ReadableArray p1){
       a.q(p0, "tabsView");
       a.q(p1, "args");
       p0.getTabTexts().clear();
       int i = p1.size();
       int i1 = 0;
       while (i1 < i) {
          String str = p1.getString(i1);
          if (str != null) {
             p0.getTabTexts().add(str);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public final void setViewPager(TabsView p0,int p1){
       View view1;
       a.q(p0, "tabsView");
       if (p1 == -1) {
          return;
       }
       ReactContext context = p0.getContext();
       View view = null;
       if (context != null) {
          UIManagerModule nativeModule = context.getNativeModule(UIManagerModule.class);
          if (nativeModule != null) {
             view1 = nativeModule.resolveView(p1);
          label_0022 :
             if (view1 != null) {
                view = view1.findViewWithTag("ViewPager2");
             }
             if (view instanceof ViewPager2) {
                new d(p0, view, new TabLayoutViewManager$b(this, p0)).a();
             }
             return;
          }
       }
       view1 = view;
       goto label_0022 ;
    }
}
