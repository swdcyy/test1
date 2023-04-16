package com.kuaishou.webkit.WebSettings$LayoutAlgorithm;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class WebSettings$LayoutAlgorithm extends Enum	// class@001274
{
    public static final WebSettings$LayoutAlgorithm[] $VALUES;
    public static final WebSettings$LayoutAlgorithm NARROW_COLUMNS;
    public static final WebSettings$LayoutAlgorithm NORMAL;
    public static final WebSettings$LayoutAlgorithm SINGLE_COLUMN;
    public static final WebSettings$LayoutAlgorithm TEXT_AUTOSIZING;

    static {
       WebSettings$LayoutAlgorithm layoutAlgori = new WebSettings$LayoutAlgorithm("NORMAL", 0);
       WebSettings$LayoutAlgorithm.NORMAL = layoutAlgori;
       WebSettings$LayoutAlgorithm layoutAlgori1 = new WebSettings$LayoutAlgorithm("SINGLE_COLUMN", 1);
       WebSettings$LayoutAlgorithm.SINGLE_COLUMN = layoutAlgori1;
       WebSettings$LayoutAlgorithm layoutAlgori2 = new WebSettings$LayoutAlgorithm("NARROW_COLUMNS", 2);
       WebSettings$LayoutAlgorithm.NARROW_COLUMNS = layoutAlgori2;
       WebSettings$LayoutAlgorithm layoutAlgori3 = new WebSettings$LayoutAlgorithm("TEXT_AUTOSIZING", 3);
       WebSettings$LayoutAlgorithm.TEXT_AUTOSIZING = layoutAlgori3;
       WebSettings$LayoutAlgorithm[] layoutAlgori4 = new WebSettings$LayoutAlgorithm[]{layoutAlgori,layoutAlgori1,layoutAlgori2,layoutAlgori3};
       WebSettings$LayoutAlgorithm.$VALUES = layoutAlgori4;
    }
    public void WebSettings$LayoutAlgorithm(String p0,int p1){
       super(p0, p1);
    }
    public static WebSettings$LayoutAlgorithm valueOf(String p0){
       return Enum.valueOf(WebSettings$LayoutAlgorithm.class, p0);
    }
    public static WebSettings$LayoutAlgorithm[] values(){
       return WebSettings$LayoutAlgorithm.$VALUES.clone();
    }
}
