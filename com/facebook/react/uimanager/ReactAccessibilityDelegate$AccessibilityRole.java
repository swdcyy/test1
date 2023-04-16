package com.facebook.react.uimanager.ReactAccessibilityDelegate$AccessibilityRole;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import com.facebook.react.uimanager.ReactAccessibilityDelegate$b;

public final class ReactAccessibilityDelegate$AccessibilityRole extends Enum	// class@00131e
{
    public static final ReactAccessibilityDelegate$AccessibilityRole[] $VALUES;
    public static final ReactAccessibilityDelegate$AccessibilityRole ADJUSTABLE;
    public static final ReactAccessibilityDelegate$AccessibilityRole ALERT;
    public static final ReactAccessibilityDelegate$AccessibilityRole BUTTON;
    public static final ReactAccessibilityDelegate$AccessibilityRole CHECKBOX;
    public static final ReactAccessibilityDelegate$AccessibilityRole COMBOBOX;
    public static final ReactAccessibilityDelegate$AccessibilityRole HEADER;
    public static final ReactAccessibilityDelegate$AccessibilityRole IMAGE;
    public static final ReactAccessibilityDelegate$AccessibilityRole IMAGEBUTTON;
    public static final ReactAccessibilityDelegate$AccessibilityRole KEYBOARDKEY;
    public static final ReactAccessibilityDelegate$AccessibilityRole LINK;
    public static final ReactAccessibilityDelegate$AccessibilityRole MENU;
    public static final ReactAccessibilityDelegate$AccessibilityRole MENUBAR;
    public static final ReactAccessibilityDelegate$AccessibilityRole MENUITEM;
    public static final ReactAccessibilityDelegate$AccessibilityRole NONE;
    public static final ReactAccessibilityDelegate$AccessibilityRole PROGRESSBAR;
    public static final ReactAccessibilityDelegate$AccessibilityRole RADIO;
    public static final ReactAccessibilityDelegate$AccessibilityRole RADIOGROUP;
    public static final ReactAccessibilityDelegate$AccessibilityRole SCROLLBAR;
    public static final ReactAccessibilityDelegate$AccessibilityRole SEARCH;
    public static final ReactAccessibilityDelegate$AccessibilityRole SPINBUTTON;
    public static final ReactAccessibilityDelegate$AccessibilityRole SUMMARY;
    public static final ReactAccessibilityDelegate$AccessibilityRole SWITCH;
    public static final ReactAccessibilityDelegate$AccessibilityRole TAB;
    public static final ReactAccessibilityDelegate$AccessibilityRole TABLIST;
    public static final ReactAccessibilityDelegate$AccessibilityRole TEXT;
    public static final ReactAccessibilityDelegate$AccessibilityRole TIMER;
    public static final ReactAccessibilityDelegate$AccessibilityRole TOOLBAR;

    static {
       ReactAccessibilityDelegate$AccessibilityRole uAccessibili = new ReactAccessibilityDelegate$AccessibilityRole("NONE", 0);
       ReactAccessibilityDelegate$AccessibilityRole.NONE = uAccessibili;
       ReactAccessibilityDelegate$AccessibilityRole uAccessibili1 = new ReactAccessibilityDelegate$AccessibilityRole("BUTTON", 1);
       ReactAccessibilityDelegate$AccessibilityRole.BUTTON = uAccessibili1;
       ReactAccessibilityDelegate$AccessibilityRole uAccessibili2 = new ReactAccessibilityDelegate$AccessibilityRole("LINK", 2);
       ReactAccessibilityDelegate$AccessibilityRole.LINK = uAccessibili2;
       ReactAccessibilityDelegate$AccessibilityRole uAccessibili3 = new ReactAccessibilityDelegate$AccessibilityRole("SEARCH", 3);
       ReactAccessibilityDelegate$AccessibilityRole.SEARCH = uAccessibili3;
       ReactAccessibilityDelegate$AccessibilityRole uAccessibili4 = new ReactAccessibilityDelegate$AccessibilityRole("IMAGE", 4);
       ReactAccessibilityDelegate$AccessibilityRole.IMAGE = uAccessibili4;
       ReactAccessibilityDelegate$AccessibilityRole uAccessibili5 = new ReactAccessibilityDelegate$AccessibilityRole("IMAGEBUTTON", 5);
       ReactAccessibilityDelegate$AccessibilityRole.IMAGEBUTTON = uAccessibili5;
       ReactAccessibilityDelegate$AccessibilityRole uAccessibili6 = new ReactAccessibilityDelegate$AccessibilityRole("KEYBOARDKEY", 6);
       ReactAccessibilityDelegate$AccessibilityRole.KEYBOARDKEY = uAccessibili6;
       ReactAccessibilityDelegate$AccessibilityRole uAccessibili7 = new ReactAccessibilityDelegate$AccessibilityRole("TEXT", 7);
       ReactAccessibilityDelegate$AccessibilityRole.TEXT = uAccessibili7;
       ReactAccessibilityDelegate$AccessibilityRole uAccessibili8 = new ReactAccessibilityDelegate$AccessibilityRole("ADJUSTABLE", 8);
       ReactAccessibilityDelegate$AccessibilityRole.ADJUSTABLE = uAccessibili8;
       ReactAccessibilityDelegate$AccessibilityRole uAccessibili9 = new ReactAccessibilityDelegate$AccessibilityRole("SUMMARY", 9);
       ReactAccessibilityDelegate$AccessibilityRole.SUMMARY = uAccessibili9;
       ReactAccessibilityDelegate$AccessibilityRole uAccessibili10 = new ReactAccessibilityDelegate$AccessibilityRole("HEADER", 10);
       ReactAccessibilityDelegate$AccessibilityRole.HEADER = uAccessibili10;
       ReactAccessibilityDelegate$AccessibilityRole uAccessibili11 = new ReactAccessibilityDelegate$AccessibilityRole("ALERT", 11);
       ReactAccessibilityDelegate$AccessibilityRole.ALERT = uAccessibili11;
       ReactAccessibilityDelegate$AccessibilityRole uAccessibili12 = new ReactAccessibilityDelegate$AccessibilityRole("CHECKBOX", 12);
       ReactAccessibilityDelegate$AccessibilityRole.CHECKBOX = uAccessibili12;
       ReactAccessibilityDelegate$AccessibilityRole uAccessibili13 = new ReactAccessibilityDelegate$AccessibilityRole("COMBOBOX", 13);
       ReactAccessibilityDelegate$AccessibilityRole.COMBOBOX = uAccessibili13;
       ReactAccessibilityDelegate$AccessibilityRole uAccessibili14 = uAccessibili13;
       ReactAccessibilityDelegate$AccessibilityRole uAccessibili15 = new ReactAccessibilityDelegate$AccessibilityRole("MENU", 14);
       ReactAccessibilityDelegate$AccessibilityRole.MENU = uAccessibili15;
       ReactAccessibilityDelegate$AccessibilityRole uAccessibili16 = uAccessibili15;
       ReactAccessibilityDelegate$AccessibilityRole uAccessibili17 = new ReactAccessibilityDelegate$AccessibilityRole("MENUBAR", 15);
       ReactAccessibilityDelegate$AccessibilityRole.MENUBAR = uAccessibili17;
       ReactAccessibilityDelegate$AccessibilityRole uAccessibili18 = uAccessibili17;
       uAccessibili13 = new ReactAccessibilityDelegate$AccessibilityRole("MENUITEM", 16);
       ReactAccessibilityDelegate$AccessibilityRole.MENUITEM = uAccessibili13;
       ReactAccessibilityDelegate$AccessibilityRole uAccessibili19 = uAccessibili13;
       uAccessibili15 = new ReactAccessibilityDelegate$AccessibilityRole("PROGRESSBAR", 17);
       ReactAccessibilityDelegate$AccessibilityRole.PROGRESSBAR = uAccessibili15;
       ReactAccessibilityDelegate$AccessibilityRole uAccessibili20 = uAccessibili15;
       uAccessibili17 = new ReactAccessibilityDelegate$AccessibilityRole("RADIO", 18);
       ReactAccessibilityDelegate$AccessibilityRole.RADIO = uAccessibili17;
       ReactAccessibilityDelegate$AccessibilityRole uAccessibili21 = uAccessibili17;
       uAccessibili13 = new ReactAccessibilityDelegate$AccessibilityRole("RADIOGROUP", 19);
       ReactAccessibilityDelegate$AccessibilityRole.RADIOGROUP = uAccessibili13;
       ReactAccessibilityDelegate$AccessibilityRole uAccessibili22 = uAccessibili13;
       uAccessibili15 = new ReactAccessibilityDelegate$AccessibilityRole("SCROLLBAR", 20);
       ReactAccessibilityDelegate$AccessibilityRole.SCROLLBAR = uAccessibili15;
       ReactAccessibilityDelegate$AccessibilityRole uAccessibili23 = uAccessibili15;
       uAccessibili17 = new ReactAccessibilityDelegate$AccessibilityRole("SPINBUTTON", 21);
       ReactAccessibilityDelegate$AccessibilityRole.SPINBUTTON = uAccessibili17;
       ReactAccessibilityDelegate$AccessibilityRole uAccessibili24 = uAccessibili17;
       uAccessibili13 = new ReactAccessibilityDelegate$AccessibilityRole("SWITCH", 22);
       ReactAccessibilityDelegate$AccessibilityRole.SWITCH = uAccessibili13;
       ReactAccessibilityDelegate$AccessibilityRole uAccessibili25 = uAccessibili13;
       uAccessibili17 = new ReactAccessibilityDelegate$AccessibilityRole("TAB", 23);
       ReactAccessibilityDelegate$AccessibilityRole.TAB = uAccessibili17;
       ReactAccessibilityDelegate$AccessibilityRole uAccessibili26 = uAccessibili17;
       uAccessibili15 = new ReactAccessibilityDelegate$AccessibilityRole("TABLIST", 24);
       ReactAccessibilityDelegate$AccessibilityRole.TABLIST = uAccessibili15;
       ReactAccessibilityDelegate$AccessibilityRole uAccessibili27 = uAccessibili15;
       uAccessibili17 = new ReactAccessibilityDelegate$AccessibilityRole("TIMER", 25);
       ReactAccessibilityDelegate$AccessibilityRole.TIMER = uAccessibili17;
       ReactAccessibilityDelegate$AccessibilityRole uAccessibili28 = uAccessibili17;
       uAccessibili15 = new ReactAccessibilityDelegate$AccessibilityRole("TOOLBAR", 26);
       ReactAccessibilityDelegate$AccessibilityRole.TOOLBAR = uAccessibili15;
       ReactAccessibilityDelegate$AccessibilityRole[] uAccessibili29 = new ReactAccessibilityDelegate$AccessibilityRole[27];
       uAccessibili29[0] = uAccessibili;
       uAccessibili29[1] = uAccessibili1;
       uAccessibili29[2] = uAccessibili2;
       uAccessibili29[3] = uAccessibili3;
       uAccessibili29[4] = uAccessibili4;
       uAccessibili29[5] = uAccessibili5;
       uAccessibili29[6] = uAccessibili6;
       uAccessibili29[7] = uAccessibili7;
       uAccessibili29[8] = uAccessibili8;
       uAccessibili29[9] = uAccessibili9;
       uAccessibili29[10] = uAccessibili10;
       uAccessibili29[11] = uAccessibili11;
       uAccessibili29[12] = uAccessibili12;
       uAccessibili29[13] = uAccessibili14;
       uAccessibili29[14] = uAccessibili16;
       uAccessibili29[15] = uAccessibili18;
       uAccessibili29[16] = uAccessibili19;
       uAccessibili29[17] = uAccessibili20;
       uAccessibili29[18] = uAccessibili21;
       uAccessibili29[19] = uAccessibili22;
       uAccessibili29[20] = uAccessibili23;
       uAccessibili29[21] = uAccessibili24;
       uAccessibili29[22] = uAccessibili25;
       uAccessibili29[23] = uAccessibili26;
       uAccessibili29[24] = uAccessibili27;
       uAccessibili29[25] = uAccessibili28;
       uAccessibili29[26] = uAccessibili15;
       ReactAccessibilityDelegate$AccessibilityRole.$VALUES = uAccessibili29;
    }
    public void ReactAccessibilityDelegate$AccessibilityRole(String p0,int p1){
       super(p0, p1);
    }
    public static ReactAccessibilityDelegate$AccessibilityRole fromValue(String p0){
       object oobject;
       ReactAccessibilityDelegate$AccessibilityRole[] obj = PatchProxy.applyOneRefs(p0, null, ReactAccessibilityDelegate$AccessibilityRole.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = ReactAccessibilityDelegate$AccessibilityRole.values();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             throw new IllegalArgumentException("Invalid accessibility role value: "+p0);
          }
          oobject = obj[i];
          if ((oobject.name()).equalsIgnoreCase(p0)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public static String getValue(ReactAccessibilityDelegate$AccessibilityRole p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ReactAccessibilityDelegate$AccessibilityRole.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       switch (ReactAccessibilityDelegate$b.a[p0.ordinal()]){
           case 1:
             return "android.widget.Button";
           case 2:
             return "android.widget.EditText";
           case 3:
             return "android.widget.ImageView";
           case 4:
             return "android.widget.ImageButon";
           case 5:
             return "android.inputmethodservice.Keyboard$Key";
           case 6:
             return "android.widget.TextView";
           case 7:
             return "android.widget.SeekBar";
           case 8:
             return "android.widget.CheckBox";
           case 9:
             return "android.widget.RadioButton";
           case 10:
             return "android.widget.SpinButton";
           case 11:
             return "android.widget.Switch";
           case 12:
           case 14:
           case 15:
           case 16:
           case 17:
           case 18:
           case 19:
           case 20:
           case 21:
           case 22:
           case 23:
           case 24:
           case 25:
           case 26:
           case 27:
           case 13:
             return "android.view.View";
           default:
             throw new IllegalArgumentException("Invalid accessibility role value: "+p0);
       }
    }
    public static ReactAccessibilityDelegate$AccessibilityRole valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ReactAccessibilityDelegate$AccessibilityRole.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ReactAccessibilityDelegate$AccessibilityRole.class, p0);
    }
    public static ReactAccessibilityDelegate$AccessibilityRole[] values(){
       Object obj = PatchProxy.apply(null, null, ReactAccessibilityDelegate$AccessibilityRole.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ReactAccessibilityDelegate$AccessibilityRole.$VALUES.clone();
    }
}
