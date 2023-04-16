package com.tachikoma.core.component.button.TKButton;
import com.tachikoma.core.component.e;
import gx4.f;
import java.util.HashMap;
import org.json.JSONObject;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Exception;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.animation.StateListAnimator;
import zo8.a;
import kp8.d;
import java.lang.Number;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import iq8.p;
import java.lang.Integer;
import java.util.Objects;
import com.tachikoma.core.component.view.TKViewBackgroundDrawable;
import android.graphics.drawable.StateListDrawable;
import java.util.Map;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import android.content.res.ColorStateList;
import java.util.ArrayList;
import com.tachikoma.core.bridge.c;
import com.tachikoma.core.component.TKBaseNativeModule;
import java.lang.CharSequence;
import android.text.TextUtils;
import hp8.e;
import android.graphics.Typeface;
import android.widget.TextView;
import wo8.b;
import com.tachikoma.core.component.button.TKButton$a;
import com.tachikoma.core.component.text.a$d;
import com.tachikoma.core.component.text.a;
import android.text.TextUtils$TruncateAt;
import android.os.Build$VERSION;

public class TKButton extends e	// class@000d64
{
    public HashMap disabled;
    public Map fontFace;
    public String mFontFamily;
    public String mFontStyle;
    public String mFontWeight;
    public HashMap pressed;
    public String text;
    public HashMap v;

    public void TKButton(f p0){
       super(p0);
       this.v = new HashMap();
    }
    public JSONObject collectViewAttrs(){
       JSONObject obj = PatchProxy.apply(null, this, TKButton.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.collectViewAttrs();
       try{
          obj.put("text", this.text);
       }catch(java.lang.Exception e1){
          e1.printStackTrace();
       }
       return obj;
    }
    public View createViewInstance(Context p0){
       return this.createViewInstance(p0);
    }
    public Button createViewInstance(Context p0){
       Button obj = PatchProxy.applyOneRefs(p0, this, TKButton.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Button(p0);
       obj.setMinimumWidth(0);
       obj.setMinimumHeight(0);
       obj.setMinWidth(0);
       obj.setMinHeight(0);
       obj.setAllCaps(0);
       obj.setPadding(0, 0, 0, 0);
       obj.setStateListAnimator(null);
       return obj;
    }
    public final void m(int[] p0,HashMap p1){
       int i;
       Iterator iterator;
       Map$Entry uEntry;
       String str;
       int i2;
       int[] ointArray;
       int[] key;
       Drawable value2;
       d d;
       Iterator iterator1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKButton.class, "16")) {
          return;
       }
       d viewBackgrou = this.getViewBackgroundManager();
       Object obj = null;
       d obj1 = PatchProxy.applyOneRefs(p1, obj, uoa, "1");
       if (obj1 != patchProxyRe) {
          i = obj1.intValue();
       }else if(p1 == null || p1.size() <= 0){
          iterator1 = p1.entrySet().iterator();
          while (true) {
             if (iterator1.hasNext()) {
                uEntry = iterator1.next();
                str = uEntry.getKey().toString();
                Integer value3 = uEntry.getValue();
                if (value3 instanceof String && ("backgroundColor").equals(str)) {
                   value3 = Integer.valueOf(p.b(value3));
                   if (value3 != null) {
                      i = value3.intValue();
                      break ;
                   }
                }
             }
          }
       }
       i = -1;
       Objects.requireNonNull(viewBackgrou);
       obj1 = d.class;
       int i1 = 0;
       if (!PatchProxy.isSupport(obj1) || (!PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(i), viewBackgrou, obj1, "4") && (viewBackgrou.h == null && p0.length > 0))) {
          TKViewBackgroundDrawable tKViewBackgr = viewBackgrou.a();
          TKViewBackgroundDrawable tKViewBackgr1 = tKViewBackgr.newDrawable();
          tKViewBackgr1.setColor(i);
          viewBackgrou.c = new StateListDrawable();
          if (!PatchProxy.applyVoidOneRefs(p0, viewBackgrou, obj1, "5") && p0.length > 0) {
             d = viewBackgrou.d;
             if (d != null && d.size() > 0) {
                iterator1 = viewBackgrou.d.entrySet().iterator();
                while (iterator1.hasNext()) {
                   key = iterator1.next().getKey();
                   if (key != null && key.length == p0.length) {
                      int i4 = 0;
                      while (true) {
                         if (i4 < key.length) {
                            if (key[i4] == p0[i4]) {
                               i4 = i4 + 1;
                            }
                         }else {
                            key = 1;
                         label_00ed :
                            if (key) {
                               iterator1.remove();
                            }else {
                               continue ;
                            }
                         }
                      }
                   }
                   key = null;
                   goto label_00ed ;
                }
             }
          }
          if (viewBackgrou.d == null) {
             viewBackgrou.d = new HashMap();
          }
          viewBackgrou.d.put(p0, tKViewBackgr1);
          iterator = viewBackgrou.d.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry1 = iterator.next();
             if (uEntry1 == null) {
                continue ;
             }else {
                key = uEntry1.getKey();
                value2 = uEntry1.getValue();
                if (key != null && (key.length <= 0 || value2 == null)) {
                   continue ;
                }
             }
             viewBackgrou.c.addState(key, value2);
          }
          viewBackgrou.c.addState(StateSet.WILD_CARD, tKViewBackgr);
          viewBackgrou.c(viewBackgrou.c);
       }
    label_0141 :
       TKButton tv = this.v;
       i = PatchProxy.applyOneRefs(tv, obj, uoa, "2");
       if (i != patchProxyRe) {
          obj = i;
       }else if(tv == null || tv.size() <= 0){
          iterator = tv.entrySet().iterator();
          ArrayList uArrayList = new ArrayList();
          ArrayList uArrayList1 = new ArrayList();
          while (iterator.hasNext()) {
             uEntry = iterator.next();
             str = uEntry.getKey().toString();
             Iterator value = uEntry.getValue();
             if (!value instanceof HashMap) {
             }else {
                Map$Entry obj2 = PatchProxy.applyOneRefs(value, obj, uoa, "3");
                if (obj2 != patchProxyRe) {
                   i2 = obj2.intValue();
                }else {
                   value = value.entrySet().iterator();
                   while (true) {
                      if (value.hasNext()) {
                         obj2 = value.next();
                         String str1 = obj2.getKey().toString();
                         Integer value1 = obj2.getValue();
                         if (value1 instanceof String && ("color").equals(str1)) {
                            value1 = Integer.valueOf(p.b(value1));
                            if (value1 != null) {
                               i2 = value1.intValue();
                            }else {
                               continue ;
                            }
                         }else {
                            continue ;
                         }
                      }else {
                         i2 = 0xff000000;
                      }
                   }
                }
                if (("disabled").equals(str)) {
                   ointArray = new int[1];
                   ointArray[i1] = -16842910;
                   uArrayList.add(ointArray);
                   uArrayList1.add(Integer.valueOf(i2));
                }else if(("pressed").equals(str)){
                   ointArray = new int[1];
                   ointArray[i1] = 0x10100a7;
                   uArrayList.add(ointArray);
                   uArrayList1.add(Integer.valueOf(i2));
                }else if(("normal").equals(str)){
                   ointArray = new int[i1];
                   uArrayList.add(ointArray);
                   uArrayList1.add(Integer.valueOf(i2));
                }
             }
          }
          if (uArrayList.size() > 0) {
             int[][] ointArray1 = new int[][uArrayList.size()];
             int[] ointArray2 = new int[uArrayList1.size()];
             int i3 = uArrayList.size() - 1;
             while (i3 >= 0) {
                ointArray1[i1] = uArrayList.get(i3);
                ointArray2[i1] = uArrayList1.get(i3).intValue();
                i3 = i3 - 1;
                i1 = i1 + 1;
             }
             obj = new ColorStateList(ointArray1, ointArray2);
          }
       }
       if (obj != null) {
          this.getView().setTextColor(obj);
       }
       return;
    }
    public void setColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKButton.class, "15")) {
          return;
       }
       Integer integer = Integer.valueOf(p.c(p0, this.getJSContext()));
       if (integer == null) {
          return;
       }
       this.getView().setTextColor(integer.intValue());
       return;
    }
    public void setDisabled(HashMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKButton.class, "11")) {
          return;
       }
       if (p0 != null && p0.size() > 0) {
          if (this.disabled == null) {
             this.disabled = new HashMap();
          }
          this.disabled.putAll(p0);
          this.v.put("disabled", this.disabled);
          int[] ointArray = new int[]{-16842910};
          this.m(ointArray, this.disabled);
       }
       return;
    }
    public void setFontFace(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKButton.class, "18")) {
          return;
       }
       if (p0 != null && !p0.isEmpty()) {
          this.fontFace = p0;
          String str = p0.get("src");
          String str1 = p0.get("fileName");
          if (!TextUtils.isEmpty(str1)) {
             TKButton tmFontFamily = this.mFontFamily;
             if (tmFontFamily == null || !tmFontFamily.equals(str1)) {
                this.mFontFamily = str1;
                if (e.c().b(str1, 0) != null) {
                   b.a(this.getView(), str1, this.mFontWeight, this.mFontStyle, this.getRootDir());
                   return;
                }else {
                   a.b(this.getContext(), str, str1, new TKButton$a(this, str1));
                }
             }
          }
       }
       return;
    }
    public void setFontFamily(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKButton.class, "13")) {
          return;
       }
       if (!TextUtils.isEmpty(p0) && !p0.equals(this.mFontFamily)) {
          this.mFontFamily = p0;
          b.a(this.getView(), p0, this.mFontWeight, this.mFontStyle, this.getRootDir());
       }
       return;
    }
    public void setFontSize(int p0){
       TKButton tKButton = TKButton.class;
       if (PatchProxy.isSupport(tKButton) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKButton, "14")) {
          return;
       }
       this.getView().setTextSize(1, (float)p0);
       return;
    }
    public void setFontStyle(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKButton.class, "8")) {
          return;
       }
       TKButton tmFontStyle = this.mFontStyle;
       if (tmFontStyle != null && tmFontStyle.equals(p0)) {
          return;
       }
       this.mFontStyle = p0;
       b.a(this.getView(), this.mFontFamily, this.mFontWeight, p0, this.getRootDir());
       return;
    }
    public void setFontWeight(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKButton.class, "7")) {
          return;
       }
       if (!TextUtils.isEmpty(p0) && !p0.equals(this.mFontWeight)) {
          this.mFontWeight = p0;
          b.a(this.getView(), this.mFontFamily, p0, this.mFontStyle, this.getRootDir());
       }
       return;
    }
    public void setLineClamp(int p0){
       TKButton tKButton = TKButton.class;
       if (PatchProxy.isSupport(tKButton) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKButton, "6")) {
          return;
       }
       this.setTextLineClamp(p0);
       return;
    }
    public void setPressed(HashMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKButton.class, "10")) {
          return;
       }
       if (p0 != null && p0.size() > 0) {
          if (this.pressed == null) {
             this.pressed = new HashMap();
          }
          this.pressed.putAll(p0);
          this.v.put("pressed", this.pressed);
          this.m(new int[2]{0x10100a7,0x101009e}, p0);
       }
       return;
    }
    public void setStyle(HashMap p0){
       TKButton tKButton = TKButton.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, tKButton, "2")) {
          return;
       }
       this.takeControlOfPaddingSet(p0);
       super.setStyle(p0);
       if (PatchProxy.applyVoidOneRefs(p0, this, tKButton, "3") || (p0 != null && p0.size() > 0)) {
          HashMap hashMap = this.v.get("normal");
          if (hashMap == null || hashMap.size() <= 0) {
             this.v.put("normal", p0);
          }else {
             hashMap.putAll(p0);
          }
       }
       return;
    }
    public void setText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKButton.class, "4")) {
          return;
       }
       if (p0 != null && p0.equals(this.text)) {
          return;
       }
       this.text = p0;
       this.getView().setText(this.text);
       return;
    }
    public void setTextAlign(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKButton.class, "12")) {
          return;
       }
       Objects.requireNonNull(p0);
       int i = -1;
       switch (p0.hashCode()){
           case 0xaeb2cc55:
             if (p0.equals("center")) {
                i = 0;
             }
             break;
           case 0x32a007:
             if (p0.equals("left")) {
                i = 1;
             }
             break;
           case 0x677c21c:
             if (p0.equals("right")) {
                i = 2;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             this.getView().setGravity(17);
             break;
           case 1:
             this.getView().setGravity(19);
             break;
           case 2:
             this.getView().setGravity(21);
             break;
           default:
       }
       return;
    }
    public void setTextLineClamp(int p0){
       TKButton tKButton = TKButton.class;
       if (PatchProxy.isSupport(tKButton) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKButton, "5")) {
          return;
       }
       Button view = this.getView();
       if (p0 <= 0) {
          p0 = Integer.MAX_VALUE;
       }
       view.setMaxLines(p0);
       return;
    }
    public void setTextOverflow(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKButton.class, "9")) {
          return;
       }
       if (("clip").equalsIgnoreCase(p0)) {
          this.getView().setEllipsize(null);
       }else if(("ellipsis").equalsIgnoreCase(p0)){
          this.getView().setEllipsize(TextUtils$TruncateAt.valueOf("END"));
       }
       return;
    }
    public boolean supportAsyncPrepareView(){
       boolean b = (Build$VERSION.SDK_INT > 25)? true: false;
       return b;
    }
}
