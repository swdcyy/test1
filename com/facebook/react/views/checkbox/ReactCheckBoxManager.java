package com.facebook.react.views.checkbox.ReactCheckBoxManager;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.views.checkbox.ReactCheckBoxManager$a;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.content.res.Resources;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import ze.n0;
import android.view.View;
import com.facebook.react.views.checkbox.ReactCheckBox;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.widget.CheckBox;
import com.facebook.react.bridge.ReadableArray;
import java.util.Objects;
import java.lang.Boolean;
import com.facebook.react.bridge.ReadableMap;
import android.content.res.ColorStateList;
import android.widget.CompoundButton;
import e2.b;

public class ReactCheckBoxManager extends SimpleViewManager	// class@0013a0
{
    public static final CompoundButton$OnCheckedChangeListener ON_CHECKED_CHANGE_LISTENER;

    static {
       ReactCheckBoxManager.ON_CHECKED_CHANGE_LISTENER = new ReactCheckBoxManager$a();
    }
    public void ReactCheckBoxManager(){
       super();
    }
    public static int getIdentifier(Context p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, ReactCheckBoxManager.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return p0.getResources().getIdentifier(p1, "attr", p0.getPackageName());
    }
    public static int getThemeColor(Context p0,String p1){
       TypedValue obj = PatchProxy.applyTwoRefs(p0, p1, null, ReactCheckBoxManager.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new TypedValue();
       p0.getTheme().resolveAttribute(ReactCheckBoxManager.getIdentifier(p0, p1), obj, true);
       return obj.data;
    }
    public void addEventEmitters(n0 p0,View p1){
       this.addEventEmitters(p0, p1);
    }
    public void addEventEmitters(n0 p0,ReactCheckBox p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactCheckBoxManager.class, "1")) {
          return;
       }
       p1.setOnCheckedChangeListener(ReactCheckBoxManager.ON_CHECKED_CHANGE_LISTENER);
       return;
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public ReactCheckBox createViewInstance(n0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReactCheckBoxManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ReactCheckBox(p0);
    }
    public String getName(){
       return "AndroidCheckBox";
    }
    public void receiveCommand(View p0,String p1,ReadableArray p2){
       this.receiveCommand(p0, p1, p2);
    }
    public void receiveCommand(ReactCheckBox p0,String p1,ReadableArray p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ReactCheckBoxManager.class, "5")) {
          return;
       }
       Objects.requireNonNull(p1);
       if (p1.equals("setNativeValue") && p2 != null) {
          this.setOn(p0, p2.getBoolean(0));
       }
       return;
    }
    public void setEnabled(ReactCheckBox p0,boolean p1){
       ReactCheckBoxManager reactCheckBo = ReactCheckBoxManager.class;
       if (PatchProxy.isSupport(reactCheckBo) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactCheckBo, "3")) {
          return;
       }
       p0.setEnabled(p1);
       return;
    }
    public void setOn(ReactCheckBox p0,boolean p1){
       ReactCheckBoxManager reactCheckBo = ReactCheckBoxManager.class;
       if (PatchProxy.isSupport(reactCheckBo) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactCheckBo, "4")) {
          return;
       }
       p0.setOnCheckedChangeListener(null);
       p0.setOn(p1);
       p0.setOnCheckedChangeListener(ReactCheckBoxManager.ON_CHECKED_CHANGE_LISTENER);
       return;
    }
    public void setTintColors(ReactCheckBox p0,ReadableMap p1){
       int themeColor;
       int themeColor1;
       int[] ointArray1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactCheckBoxManager.class, "8")) {
          return;
       }
       if (p1 != null) {
          String str = "true";
          if (p1.hasKey(str)) {
             themeColor = p1.getInt(str);
          label_0025 :
             if (p1 != null) {
                String str1 = "false";
                if (p1.hasKey(str1)) {
                   themeColor1 = p1.getInt(str1);
                label_003f :
                   int[][] ointArray = new int[][2]{ointArray1,ointArray1};
                   ointArray1 = new int[]{0x10100a0};
                   ointArray1 = new int[]{-16842912};
                   int[] ointArray2 = new int[]{themeColor,themeColor1};
                   b.b(p0, new ColorStateList(ointArray, ointArray2));
                   return;
                }
             }
             themeColor1 = ReactCheckBoxManager.getThemeColor(p0.getContext(), "colorPrimaryDark");
             goto label_003f ;
          }
       }
       themeColor = ReactCheckBoxManager.getThemeColor(p0.getContext(), "colorAccent");
       goto label_0025 ;
    }
}
