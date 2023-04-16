package com.kuaishou.webkit.WebSettings$ZoomDensity;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class WebSettings$ZoomDensity extends Enum	// class@001279
{
    public int value;
    public static final WebSettings$ZoomDensity[] $VALUES;
    public static final WebSettings$ZoomDensity CLOSE;
    public static final WebSettings$ZoomDensity FAR;
    public static final WebSettings$ZoomDensity MEDIUM;

    static {
       WebSettings$ZoomDensity zoomDensity = new WebSettings$ZoomDensity("FAR", 0, 150);
       WebSettings$ZoomDensity.FAR = zoomDensity;
       WebSettings$ZoomDensity zoomDensity1 = new WebSettings$ZoomDensity("MEDIUM", 1, 100);
       WebSettings$ZoomDensity.MEDIUM = zoomDensity1;
       WebSettings$ZoomDensity zoomDensity2 = new WebSettings$ZoomDensity("CLOSE", 2, 75);
       WebSettings$ZoomDensity.CLOSE = zoomDensity2;
       WebSettings$ZoomDensity[] zoomDensityA = new WebSettings$ZoomDensity[]{zoomDensity,zoomDensity1,zoomDensity2};
       WebSettings$ZoomDensity.$VALUES = zoomDensityA;
    }
    public void WebSettings$ZoomDensity(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static WebSettings$ZoomDensity valueOf(String p0){
       return Enum.valueOf(WebSettings$ZoomDensity.class, p0);
    }
    public static WebSettings$ZoomDensity[] values(){
       return WebSettings$ZoomDensity.$VALUES.clone();
    }
    public int getValue(){
       return this.value;
    }
}
