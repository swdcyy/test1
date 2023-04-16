package com.kuaishou.webkit.WebSettings$TextSize;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class WebSettings$TextSize extends Enum	// class@001278
{
    public int value;
    public static final WebSettings$TextSize[] $VALUES;
    public static final WebSettings$TextSize LARGER;
    public static final WebSettings$TextSize LARGEST;
    public static final WebSettings$TextSize NORMAL;
    public static final WebSettings$TextSize SMALLER;
    public static final WebSettings$TextSize SMALLEST;

    static {
       WebSettings$TextSize textSize = new WebSettings$TextSize("SMALLEST", 0, 50);
       WebSettings$TextSize.SMALLEST = textSize;
       WebSettings$TextSize textSize1 = new WebSettings$TextSize("SMALLER", 1, 75);
       WebSettings$TextSize.SMALLER = textSize1;
       WebSettings$TextSize textSize2 = new WebSettings$TextSize("NORMAL", 2, 100);
       WebSettings$TextSize.NORMAL = textSize2;
       WebSettings$TextSize textSize3 = new WebSettings$TextSize("LARGER", 3, 150);
       WebSettings$TextSize.LARGER = textSize3;
       WebSettings$TextSize textSize4 = new WebSettings$TextSize("LARGEST", 4, 200);
       WebSettings$TextSize.LARGEST = textSize4;
       WebSettings$TextSize[] textSizeArra = new WebSettings$TextSize[]{textSize,textSize1,textSize2,textSize3,textSize4};
       WebSettings$TextSize.$VALUES = textSizeArra;
    }
    public void WebSettings$TextSize(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static WebSettings$TextSize valueOf(String p0){
       return Enum.valueOf(WebSettings$TextSize.class, p0);
    }
    public static WebSettings$TextSize[] values(){
       return WebSettings$TextSize.$VALUES.clone();
    }
}
