package com.yxcorp.gifshow.v3.editor.text.model.a;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager$TextColors;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager$a;

public class a extends TextStyleDataManager	// class@001473
{
    public final TextStyleDataManager$TextColors[] c;
    public static final TextStyleDataManager$TextColors d;
    public static final TextStyleDataManager$TextColors e;

    static {
       a.d = new TextStyleDataManager$TextColors("WHITE", TextStyleDataManager.b(0x7f060788));
       a.e = new TextStyleDataManager$TextColors("BLACK", TextStyleDataManager.b(0x7f060725));
    }
    public void a(){
       super();
       TextStyleDataManager$TextColors[] textColorsAr = new TextStyleDataManager$TextColors[16];
       textColorsAr[0] = a.d;
       textColorsAr[1] = new TextStyleDataManager$TextColors("AE_COLOR_2", TextStyleDataManager.b(0x7f060343));
       textColorsAr[2] = a.e;
       textColorsAr[3] = new TextStyleDataManager$TextColors("AE_COLOR_4", TextStyleDataManager.b(0x7f0605df));
       textColorsAr[4] = new TextStyleDataManager$TextColors("AE_COLOR_5", TextStyleDataManager.b(0x7f0605a3));
       textColorsAr[5] = new TextStyleDataManager$TextColors("AE_COLOR_6", TextStyleDataManager.b(0x7f0605ed));
       textColorsAr[6] = new TextStyleDataManager$TextColors("AE_COLOR_7", TextStyleDataManager.b(0x7f06059b));
       textColorsAr[7] = new TextStyleDataManager$TextColors("AE_COLOR_8", TextStyleDataManager.b(0x7f06047e));
       textColorsAr[8] = new TextStyleDataManager$TextColors("AE_COLOR_9", TextStyleDataManager.b(0x7f0606b1));
       textColorsAr[9] = new TextStyleDataManager$TextColors("AE_COLOR_10", TextStyleDataManager.b(0x7f060551));
       textColorsAr[10] = new TextStyleDataManager$TextColors("AE_COLOR_11", TextStyleDataManager.b(0x7f0606b1));
       textColorsAr[11] = new TextStyleDataManager$TextColors("AE_COLOR_12", TextStyleDataManager.b(0x7f0603b8));
       textColorsAr[12] = new TextStyleDataManager$TextColors("AE_COLOR_13", TextStyleDataManager.b(0x7f0603de));
       textColorsAr[13] = new TextStyleDataManager$TextColors("AE_COLOR_14", TextStyleDataManager.b(0x7f060344));
       textColorsAr[14] = new TextStyleDataManager$TextColors("AE_COLOR_15", TextStyleDataManager.b(0x7f060342));
       textColorsAr[15] = new TextStyleDataManager$TextColors("AE_COLOR_16", TextStyleDataManager.b(0x7f060216));
       this.c = textColorsAr;
    }
    public List a(){
       ArrayList obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       a tc = this.c;
       int len = tc.length;
       for (int i = 0; i < len; i = i + 1) {
          obj.add(new TextStyleDataManager$a(tc[i]));
       }
       return obj;
    }
}
