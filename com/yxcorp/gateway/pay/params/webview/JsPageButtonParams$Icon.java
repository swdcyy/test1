package com.yxcorp.gateway.pay.params.webview.JsPageButtonParams$Icon;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class JsPageButtonParams$Icon extends Enum	// class@001255
{
    public int mIconId;
    public static final JsPageButtonParams$Icon[] $VALUES;
    public static final JsPageButtonParams$Icon BACK;
    public static final JsPageButtonParams$Icon CAMERA;
    public static final JsPageButtonParams$Icon CHAT;
    public static final JsPageButtonParams$Icon CLOSE;
    public static final JsPageButtonParams$Icon CUSTOM;
    public static final JsPageButtonParams$Icon DEFAULT;
    public static final JsPageButtonParams$Icon DELETE;
    public static final JsPageButtonParams$Icon DONE;
    public static final JsPageButtonParams$Icon EDIT;
    public static final JsPageButtonParams$Icon INFO;
    public static final JsPageButtonParams$Icon MORE;
    public static final JsPageButtonParams$Icon QUESTION;
    public static final JsPageButtonParams$Icon REFRESH;
    public static final JsPageButtonParams$Icon SHARE;
    public static final JsPageButtonParams$Icon WALLET;

    static {
       JsPageButtonParams$Icon icon = new JsPageButtonParams$Icon("WALLET", 0, 0x7f081a62);
       JsPageButtonParams$Icon.WALLET = icon;
       JsPageButtonParams$Icon icon1 = new JsPageButtonParams$Icon("BACK", 1, 0x7f081a53);
       JsPageButtonParams$Icon.BACK = icon1;
       JsPageButtonParams$Icon icon2 = new JsPageButtonParams$Icon("CAMERA", 2, 0x7f081a55);
       JsPageButtonParams$Icon.CAMERA = icon2;
       JsPageButtonParams$Icon icon3 = new JsPageButtonParams$Icon("CHAT", 3, 0x7f081a56);
       JsPageButtonParams$Icon.CHAT = icon3;
       JsPageButtonParams$Icon icon4 = new JsPageButtonParams$Icon("CLOSE", 4, 0x7f081a57);
       JsPageButtonParams$Icon.CLOSE = icon4;
       JsPageButtonParams$Icon icon5 = new JsPageButtonParams$Icon("EDIT", 5, 0x7f081a5a);
       JsPageButtonParams$Icon.EDIT = icon5;
       JsPageButtonParams$Icon icon6 = new JsPageButtonParams$Icon("INFO", 6, 0x7f081a5c);
       JsPageButtonParams$Icon.INFO = icon6;
       JsPageButtonParams$Icon icon7 = new JsPageButtonParams$Icon("MORE", 7, 0x7f081a5d);
       JsPageButtonParams$Icon.MORE = icon7;
       JsPageButtonParams$Icon icon8 = new JsPageButtonParams$Icon("REFRESH", 8, 0x7f081a5e);
       JsPageButtonParams$Icon.REFRESH = icon8;
       JsPageButtonParams$Icon icon9 = new JsPageButtonParams$Icon("SHARE", 9, 0x7f081a61);
       JsPageButtonParams$Icon.SHARE = icon9;
       JsPageButtonParams$Icon icon10 = new JsPageButtonParams$Icon("DONE", 10, 0x7f081a59);
       JsPageButtonParams$Icon.DONE = icon10;
       JsPageButtonParams$Icon icon11 = new JsPageButtonParams$Icon("DELETE", 11, 0x7f081a58);
       JsPageButtonParams$Icon.DELETE = icon11;
       JsPageButtonParams$Icon icon12 = new JsPageButtonParams$Icon("CUSTOM", 12, 0x7f081a53);
       JsPageButtonParams$Icon.CUSTOM = icon12;
       JsPageButtonParams$Icon icon13 = icon12;
       JsPageButtonParams$Icon icon14 = new JsPageButtonParams$Icon("QUESTION", 13, 0x7f081a5b);
       JsPageButtonParams$Icon.QUESTION = icon14;
       JsPageButtonParams$Icon icon15 = icon14;
       icon12 = new JsPageButtonParams$Icon("DEFAULT", 14, -1);
       JsPageButtonParams$Icon.DEFAULT = icon12;
       JsPageButtonParams$Icon[] iconArray = new JsPageButtonParams$Icon[15];
       iconArray[0] = icon;
       iconArray[1] = icon1;
       iconArray[2] = icon2;
       iconArray[3] = icon3;
       iconArray[4] = icon4;
       iconArray[5] = icon5;
       iconArray[6] = icon6;
       iconArray[7] = icon7;
       iconArray[8] = icon8;
       iconArray[9] = icon9;
       iconArray[10] = icon10;
       iconArray[11] = icon11;
       iconArray[12] = icon13;
       iconArray[13] = icon15;
       iconArray[14] = icon12;
       JsPageButtonParams$Icon.$VALUES = iconArray;
    }
    public void JsPageButtonParams$Icon(String p0,int p1,int p2){
       this.mIconId = p2;
    }
    public static JsPageButtonParams$Icon valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, JsPageButtonParams$Icon.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(JsPageButtonParams$Icon.class, p0);
    }
    public static JsPageButtonParams$Icon[] values(){
       Object obj = PatchProxy.apply(null, null, JsPageButtonParams$Icon.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return JsPageButtonParams$Icon.$VALUES.clone();
    }
}
