package com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextTabInfo;
import java.lang.Enum;
import java.lang.Object;
import java.lang.String;
import com.kwai.library.widget.popup.common.f;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TextTabInfo extends Enum	// class@000c52
{
    public final int tabIndex;
    public final String tabLogName;
    public final String tabName;
    public static final TextTabInfo[] $VALUES;
    public static final TextTabInfo TEXT_TAB_COLOR_TEXT;
    public static final TextTabInfo TEXT_TAB_FONT;
    public static final TextTabInfo TEXT_TAB_KEYBOARD;
    public static final TextTabInfo TEXT_TAB_STYLE;
    public static final TextTabInfo TEXT_TAB_TEMPLATE;

    static {
       TextTabInfo textTabInfo;
       TextTabInfo[] textTabInfoA = new TextTabInfo[]{v7,textTabInfo,textTabInfo,textTabInfo,textTabInfo};
       Object[] objArray = new Object[0];
       String str = f.m(R.string.arg_RES_7f103d5d, objArray);
       a.o(str, "WidgetUtils.getString\(R.¡­ng.post_edit_ae_keyboard\)");
       textTabInfo = new TextTabInfo("TEXT_TAB_KEYBOARD", 0, str, 0, "keyboard");
       TextTabInfo.TEXT_TAB_KEYBOARD = v7;
       Object[] objArray1 = new Object[0];
       String str1 = f.m(R.string.arg_RES_7f103d5f, objArray1);
       a.o(str1, "WidgetUtils.getString\(R.¡­ng.post_edit_ae_template\)");
       TextTabInfo textTabInfo1 = new TextTabInfo("TEXT_TAB_TEMPLATE", 1, str1, 1, "text_template");
       TextTabInfo.TEXT_TAB_TEMPLATE = textTabInfo;
       objArray1 = new Object[0];
       str1 = f.m(R.string.arg_RES_7f100c97, objArray1);
       a.o(str1, "WidgetUtils.getString\(R.string.edit_text_template\)");
       textTabInfo1 = new TextTabInfo("TEXT_TAB_COLOR_TEXT", 2, str1, 2, "template");
       TextTabInfo.TEXT_TAB_COLOR_TEXT = textTabInfo;
       objArray1 = new Object[0];
       str1 = f.m(R.string.arg_RES_7f100c92, objArray1);
       a.o(str1, "WidgetUtils.getString\(R.string.edit_text_font\)");
       textTabInfo1 = new TextTabInfo("TEXT_TAB_FONT", 3, str1, 3, "font");
       TextTabInfo.TEXT_TAB_FONT = textTabInfo;
       objArray1 = new Object[0];
       str1 = f.m(R.string.arg_RES_7f100c94, objArray1);
       a.o(str1, "WidgetUtils.getString\(R.string.edit_text_format\)");
       textTabInfo1 = new TextTabInfo("TEXT_TAB_STYLE", 4, str1, 4, "style");
       TextTabInfo.TEXT_TAB_STYLE = textTabInfo;
       TextTabInfo.$VALUES = textTabInfoA;
    }
    public void TextTabInfo(String p0,int p1,String p2,int p3,String p4){
       super(p0, p1);
       this.tabName = p2;
       this.tabIndex = p3;
       this.tabLogName = p4;
    }
    public static TextTabInfo valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TextTabInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(TextTabInfo.class, p0);
    }
    public static TextTabInfo[] values(){
       Object obj = PatchProxy.apply(null, null, TextTabInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TextTabInfo.$VALUES.clone();
    }
    public final int getTabIndex(){
       return this.tabIndex;
    }
    public final String getTabLogName(){
       return this.tabLogName;
    }
    public final String getTabName(){
       return this.tabName;
    }
}
