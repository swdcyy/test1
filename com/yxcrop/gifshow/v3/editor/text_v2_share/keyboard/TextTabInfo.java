package com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.TextTabInfo;
import java.lang.Enum;
import java.lang.Object;
import java.lang.String;
import com.kwai.library.widget.popup.common.f;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TextTabInfo extends Enum	// class@000b9b
{
    public final int tabIndex;
    public final String tabLogName;
    public final String tabName;
    public static final TextTabInfo[] $VALUES;
    public static final TextTabInfo TEXT_TAB_FONT;
    public static final TextTabInfo TEXT_TAB_STYLE;
    public static final TextTabInfo TEXT_TAB_TEMPLATE;

    static {
       TextTabInfo textTabInfo;
       TextTabInfo[] textTabInfoA = new TextTabInfo[]{v7,textTabInfo,textTabInfo};
       Object[] objArray = new Object[0];
       String str = f.m(R.string.arg_RES_7f100c97, objArray);
       a.o(str, "WidgetUtils.getString\(R.string.edit_text_template\)");
       textTabInfo = new TextTabInfo("TEXT_TAB_TEMPLATE", 0, str, 0, "template");
       TextTabInfo.TEXT_TAB_TEMPLATE = v7;
       Object[] objArray1 = new Object[0];
       String str1 = f.m(R.string.arg_RES_7f100c92, objArray1);
       a.o(str1, "WidgetUtils.getString\(R.string.edit_text_font\)");
       TextTabInfo textTabInfo1 = new TextTabInfo("TEXT_TAB_FONT", 1, str1, 1, "font");
       TextTabInfo.TEXT_TAB_FONT = textTabInfo;
       objArray1 = new Object[0];
       str1 = f.m(R.string.arg_RES_7f100c94, objArray1);
       a.o(str1, "WidgetUtils.getString\(R.string.edit_text_format\)");
       textTabInfo1 = new TextTabInfo("TEXT_TAB_STYLE", 2, str1, 2, "style");
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
