package com.facebook.react.uimanager.ReactAccessibilityDelegate;
import a2.a;
import java.util.HashMap;
import b2.d$a;
import java.lang.Integer;
import java.lang.Object;
import com.facebook.react.uimanager.ReactAccessibilityDelegate$a;
import android.view.View;
import b2.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.uimanager.ReactAccessibilityDelegate$AccessibilityRole;
import android.content.Context;
import java.lang.CharSequence;
import java.lang.Enum;
import android.text.SpannableString;
import android.text.style.URLSpan;
import b2.d$c;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.ReadableArray;
import java.lang.IllegalArgumentException;
import b2.d$d;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import java.lang.Throwable;
import com.facebook.react.bridge.ReactSoftException;
import android.os.Handler;
import android.os.Message;
import android.view.accessibility.AccessibilityEvent;

public class ReactAccessibilityDelegate extends a	// class@001321
{
    public Handler d;
    public final HashMap e;
    public static int f = 1056964608;
    public static final HashMap g;

    static {
       HashMap hashMap = new HashMap();
       ReactAccessibilityDelegate.g = hashMap;
       hashMap.put("activate", Integer.valueOf(d$a.i.b()));
       hashMap.put("longpress", Integer.valueOf(d$a.j.b()));
       hashMap.put("increment", Integer.valueOf(d$a.q.b()));
       hashMap.put("decrement", Integer.valueOf(d$a.r.b()));
    }
    public void ReactAccessibilityDelegate(){
       super();
       this.e = new HashMap();
       this.d = new ReactAccessibilityDelegate$a(this);
    }
    public void f(View p0,d p1){
       Context context;
       int i;
       CharSequence uCharSequenc;
       String str3;
       String str4;
       int i4;
       SpannableString spannableStr;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactAccessibilityDelegate.class, "2")) {
          return;
       }
       super.f(p0, p1);
       ReactAccessibilityDelegate$AccessibilityRole tag = p0.getTag(R.id.accessibility_role);
       if (tag != null) {
          context = p0.getContext();
          if (!PatchProxy.applyVoidThreeRefs(p1, tag, context, null, ReactAccessibilityDelegate.class, "6")) {
             p1.a0(ReactAccessibilityDelegate$AccessibilityRole.getValue(tag));
             if (tag.equals(ReactAccessibilityDelegate$AccessibilityRole.LINK)) {
                p1.u0(context.getString(R.string.arg_RES_7f101ccb));
                str3 = "";
                if (p1.q() != null) {
                   spannableStr = new SpannableString(p1.q());
                   spannableStr.setSpan(new URLSpan(str3), 0, spannableStr.length(), 0);
                   p1.e0(spannableStr);
                }
                if (p1.w() != null) {
                   spannableStr = new SpannableString(p1.w());
                   spannableStr.setSpan(new URLSpan(str3), 0, spannableStr.length(), 0);
                   p1.C0(spannableStr);
                }
             }else if(tag.equals(ReactAccessibilityDelegate$AccessibilityRole.SEARCH)){
                p1.u0(context.getString(R.string.arg_RES_7f104493));
             }else if(tag.equals(ReactAccessibilityDelegate$AccessibilityRole.IMAGE)){
                p1.u0(context.getString(R.string.arg_RES_7f10162e));
             }else if(tag.equals(ReactAccessibilityDelegate$AccessibilityRole.IMAGEBUTTON)){
                p1.u0(context.getString(R.string.arg_RES_7f101641));
                p1.b0(1);
             }else if(tag.equals(ReactAccessibilityDelegate$AccessibilityRole.BUTTON)){
                p1.u0(context.getString(R.string.arg_RES_7f10045a));
                p1.b0(1);
             }else if(tag.equals(ReactAccessibilityDelegate$AccessibilityRole.SUMMARY)){
                p1.u0(context.getString(R.string.arg_RES_7f104b4e));
             }else if(tag.equals(ReactAccessibilityDelegate$AccessibilityRole.HEADER)){
                p1.u0(context.getString(R.string.arg_RES_7f1014d6));
                p1.d0(d$c.a(0, 1, 0, 1, 1));
             }else if(tag.equals(ReactAccessibilityDelegate$AccessibilityRole.ALERT)){
                p1.u0(context.getString(R.string.arg_RES_7f10019a));
             }else if(tag.equals(ReactAccessibilityDelegate$AccessibilityRole.COMBOBOX)){
                p1.u0(context.getString(R.string.arg_RES_7f100769));
             }else if(tag.equals(ReactAccessibilityDelegate$AccessibilityRole.MENU)){
                p1.u0(context.getString(R.string.arg_RES_7f1031fb));
             }else if(tag.equals(ReactAccessibilityDelegate$AccessibilityRole.MENUBAR)){
                p1.u0(context.getString(R.string.arg_RES_7f103202));
             }else if(tag.equals(ReactAccessibilityDelegate$AccessibilityRole.MENUITEM)){
                p1.u0(context.getString(R.string.arg_RES_7f103203));
             }else if(tag.equals(ReactAccessibilityDelegate$AccessibilityRole.PROGRESSBAR)){
                p1.u0(context.getString(R.string.arg_RES_7f103ff7));
             }else if(tag.equals(ReactAccessibilityDelegate$AccessibilityRole.RADIOGROUP)){
                p1.u0(context.getString(R.string.arg_RES_7f1040c3));
             }else if(tag.equals(ReactAccessibilityDelegate$AccessibilityRole.SCROLLBAR)){
                p1.u0(context.getString(R.string.arg_RES_7f104462));
             }else if(tag.equals(ReactAccessibilityDelegate$AccessibilityRole.SPINBUTTON)){
                p1.u0(context.getString(R.string.arg_RES_7f104a5d));
             }else if(tag.equals(ReactAccessibilityDelegate$AccessibilityRole.TAB)){
                p1.u0(context.getString(R.string.arg_RES_7f104310));
             }else if(tag.equals(ReactAccessibilityDelegate$AccessibilityRole.TABLIST)){
                p1.u0(context.getString(R.string.arg_RES_7f104b9c));
             }else if(tag.equals(ReactAccessibilityDelegate$AccessibilityRole.TIMER)){
                p1.u0(context.getString(R.string.arg_RES_7f104d03));
             }else if(tag.equals(ReactAccessibilityDelegate$AccessibilityRole.TOOLBAR)){
                p1.u0(context.getString(R.string.arg_RES_7f104d4f));
             }
          }
       }
       ReadableMap tag1 = p0.getTag(R.id.accessibility_state);
       if (tag1 != null) {
          context = p0.getContext();
          if (!PatchProxy.applyVoidThreeRefs(p1, tag1, context, null, ReactAccessibilityDelegate.class, "5")) {
             ReadableMapKeySetIterator readableMapK = tag1.keySetIterator();
             while (readableMapK.hasNextKey()) {
                str4 = readableMapK.nextKey();
                Dynamic dynamic3 = tag1.getDynamic(str4);
                if (str4.equals("selected") && dynamic3.getType() == ReadableType.Boolean) {
                   p1.x0(dynamic3.asBoolean());
                }else if(str4.equals("disabled") && dynamic3.getType() == ReadableType.Boolean){
                   i4 = dynamic3.asBoolean() ^ 1;
                   p1.h0(i4);
                }else if(str4.equals("checked") && dynamic3.getType() == ReadableType.Boolean){
                   i4 = dynamic3.asBoolean();
                   p1.Y(1);
                   p1.Z(i4);
                   if (p1.o().equals(ReactAccessibilityDelegate$AccessibilityRole.getValue(ReactAccessibilityDelegate$AccessibilityRole.SWITCH))) {
                      i4 = (i4)? 0x7f104a9a: 0x7f104a99;
                      p1.C0(context.getString(i4));
                   }
                }
             }
          }
       }
       ReadableArray tag2 = p0.getTag(R.id.accessibility_actions);
       if (tag2 != null) {
          i = 0;
          while (true) {
             if (i < tag2.size()) {
                ReadableMap map = tag2.getMap(i);
                String str = "name";
                if (map.hasKey(str)) {
                   int f = ReactAccessibilityDelegate.f;
                   String str1 = "label";
                   str1 = (map.hasKey(str1))? map.getString(str1): null;
                   HashMap g = ReactAccessibilityDelegate.g;
                   if (g.containsKey(map.getString(str))) {
                      f = g.get(map.getString(str)).intValue();
                   }else {
                      int i1 = ReactAccessibilityDelegate.f + 1;
                      ReactAccessibilityDelegate.f = i1;
                   }
                   this.e.put(Integer.valueOf(f), map.getString(str));
                   p1.b(new d$a(f, str1));
                   i = i + 1;
                }else {
                   throw new IllegalArgumentException("Unknown accessibility action.");
                }
             }
          }
       }
       ReadableMap tag3 = p0.getTag(R.id.accessibility_value);
       if (tag3 != null) {
          String str2 = "min";
          if (tag3.hasKey(str2)) {
             str3 = "now";
             if (tag3.hasKey(str3)) {
                str4 = "max";
                if (tag3.hasKey(str4)) {
                   Dynamic dynamic = tag3.getDynamic(str2);
                   Dynamic dynamic1 = tag3.getDynamic(str3);
                   Dynamic dynamic2 = tag3.getDynamic(str4);
                   if (dynamic != null) {
                      ReadableType number = ReadableType.Number;
                      if (dynamic.getType() == number && (dynamic1 != null && (dynamic1.getType() == number && (dynamic2 != null && dynamic2.getType() == number)))) {
                         int i2 = dynamic.asInt();
                         i = dynamic1.asInt();
                         int i3 = dynamic2.asInt();
                         if (i3 > i2 && (i >= i2 && i3 >= i)) {
                            p1.t0(d$d.a(0, (float)i2, (float)i3, (float)i));
                         }
                      }
                   }
                }
             }
          }
       }
       return;
    }
    public boolean h(View p0,int p1,Bundle p2){
       WritableMap obj;
       ReactAccessibilityDelegate reactAccessi = ReactAccessibilityDelegate.class;
       if (PatchProxy.isSupport(reactAccessi)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, ReactAccessibilityDelegate.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.e.containsKey(Integer.valueOf(p1))) {
          obj = Arguments.createMap();
          obj.putString("actionName", this.e.get(Integer.valueOf(p1)));
          ReactContext context = p0.getContext();
          if (context.hasActiveCatalystInstance()) {
             context.getJSModule(RCTEventEmitter.class).receiveEvent(p0.getId(), "topAccessibilityAction", obj);
          }else {
             ReactSoftException.logSoftException("ReactAccessibilityDelegate", new ReactNoCrashSoftException("Cannot get RCTEventEmitter, no CatalystInstance"));
          }
          ReadableMap tag = p0.getTag(R.id.accessibility_value);
          if (p0.getTag(0x7f0a0062) == ReactAccessibilityDelegate$AccessibilityRole.ADJUSTABLE && (p1 == d$a.q.b() || p1 == d$a.r.b())) {
             if (tag == null || (!tag.hasKey("text") && !PatchProxy.applyVoidOneRefs(p0, this, reactAccessi, "1"))) {
                if (this.d.hasMessages(1, p0)) {
                   this.d.removeMessages(1, p0);
                }
                this.d.sendMessageDelayed(this.d.obtainMessage(1, p0), 200);
             }
          label_00c1 :
             return super.h(p0, p1, p2);
          }else {
             return 1;
          }
       }else {
          return super.h(p0, p1, p2);
       }
    }
    public void onInitializeAccessibilityEvent(View p0,AccessibilityEvent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactAccessibilityDelegate.class, "3")) {
          return;
       }
       super.onInitializeAccessibilityEvent(p0, p1);
       ReadableMap tag = p0.getTag(R.id.accessibility_value);
       if (tag != null) {
          String str = "min";
          if (tag.hasKey(str)) {
             String str1 = "now";
             if (tag.hasKey(str1)) {
                String str2 = "max";
                if (tag.hasKey(str2)) {
                   Dynamic dynamic = tag.getDynamic(str);
                   Dynamic dynamic1 = tag.getDynamic(str1);
                   Dynamic dynamic2 = tag.getDynamic(str2);
                   if (dynamic != null) {
                      ReadableType number = ReadableType.Number;
                      if (dynamic.getType() == number && (dynamic1 != null && (dynamic1.getType() == number && (dynamic2 != null && dynamic2.getType() == number)))) {
                         int i = dynamic.asInt();
                         int i1 = dynamic1.asInt();
                         int i2 = dynamic2.asInt();
                         if (i2 > i && (i1 >= i && i2 >= i1)) {
                            p1.setItemCount((i2 - i));
                            p1.setCurrentItemIndex(i1);
                         }
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
