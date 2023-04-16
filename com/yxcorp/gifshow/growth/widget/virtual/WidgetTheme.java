package com.yxcorp.gifshow.growth.widget.virtual.WidgetTheme;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class WidgetTheme extends Enum	// class@00160d
{
    public final int bgDrawable;
    public final int imgToken;
    public final int textColor;
    public final String textDef;
    public final int textResource;
    public static final WidgetTheme[] $VALUES;
    public static final WidgetTheme FAILURE;
    public static final WidgetTheme PREPARE;
    public static final WidgetTheme SUCCESS;

    static {
       WidgetTheme widgetTheme = new WidgetTheme("PREPARE", 0, 0x7f0824fc, 0x7f0604b8, 0x7f10135c, 0x7f104ec0, "准备中");
       WidgetTheme.PREPARE = v8;
       WidgetTheme widgetTheme1 = new WidgetTheme("SUCCESS", 1, 0x7f0824fd, 0x7f060837, 0x7f101365, 0x7f104ec1, "模拟中");
       WidgetTheme.SUCCESS = widgetTheme;
       WidgetTheme widgetTheme2 = new WidgetTheme("FAILURE", 2, 0x7f0824fb, 0x7f0601ba, 0x7f10135b, 0x7f104ebf, "模拟失败");
       WidgetTheme.FAILURE = v1;
       WidgetTheme[] widgetThemeA = new WidgetTheme[]{v8,widgetTheme,v1};
       WidgetTheme.$VALUES = widgetThemeA;
    }
    public void WidgetTheme(String p0,int p1,int p2,int p3,int p4,int p5,String p6){
       super(p0, p1);
       this.bgDrawable = p2;
       this.textColor = p3;
       this.imgToken = p4;
       this.textResource = p5;
       this.textDef = p6;
    }
    public static WidgetTheme valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, WidgetTheme.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(WidgetTheme.class, p0);
    }
    public static WidgetTheme[] values(){
       Object obj = PatchProxy.apply(null, null, WidgetTheme.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return WidgetTheme.$VALUES.clone();
    }
    public int getBgDrawable(){
       return this.bgDrawable;
    }
    public int getImgToken(){
       return this.imgToken;
    }
    public int getTextColor(){
       return this.textColor;
    }
    public String getTextDef(){
       return this.textDef;
    }
    public int getTextResource(){
       return this.textResource;
    }
}
