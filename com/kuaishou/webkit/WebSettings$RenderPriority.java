package com.kuaishou.webkit.WebSettings$RenderPriority;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class WebSettings$RenderPriority extends Enum	// class@001277
{
    public static final WebSettings$RenderPriority[] $VALUES;
    public static final WebSettings$RenderPriority HIGH;
    public static final WebSettings$RenderPriority LOW;
    public static final WebSettings$RenderPriority NORMAL;

    static {
       WebSettings$RenderPriority renderPriori = new WebSettings$RenderPriority("NORMAL", 0);
       WebSettings$RenderPriority.NORMAL = renderPriori;
       WebSettings$RenderPriority renderPriori1 = new WebSettings$RenderPriority("HIGH", 1);
       WebSettings$RenderPriority.HIGH = renderPriori1;
       WebSettings$RenderPriority renderPriori2 = new WebSettings$RenderPriority("LOW", 2);
       WebSettings$RenderPriority.LOW = renderPriori2;
       WebSettings$RenderPriority[] renderPriori3 = new WebSettings$RenderPriority[]{renderPriori,renderPriori1,renderPriori2};
       WebSettings$RenderPriority.$VALUES = renderPriori3;
    }
    public void WebSettings$RenderPriority(String p0,int p1){
       super(p0, p1);
    }
    public static WebSettings$RenderPriority valueOf(String p0){
       return Enum.valueOf(WebSettings$RenderPriority.class, p0);
    }
    public static WebSettings$RenderPriority[] values(){
       return WebSettings$RenderPriority.$VALUES.clone();
    }
}
