package com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager$TextColors;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import zf6.j;
import java.util.List;
import java.util.ArrayList;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager$a;

public class TextStyleDataManager	// class@001470
{
    public final TextStyleDataManager$TextColors[] a;
    public static final TextStyleDataManager$TextColors b;

    static {
       TextStyleDataManager.b = new TextStyleDataManager$TextColors("WHITE", TextStyleDataManager.b(0x7f060788));
    }
    public void TextStyleDataManager(){
       super();
       TextStyleDataManager$TextColors[] textColorsAr = new TextStyleDataManager$TextColors[13];
       textColorsAr[0] = TextStyleDataManager.b;
       textColorsAr[1] = new TextStyleDataManager$TextColors("BLACK", TextStyleDataManager.b(0x7f060725));
       textColorsAr[2] = new TextStyleDataManager$TextColors("ORANGE", TextStyleDataManager.b(0x7f060428));
       textColorsAr[3] = new TextStyleDataManager$TextColors("RED", TextStyleDataManager.b(0x7f0604d9));
       textColorsAr[4] = new TextStyleDataManager$TextColors("YELLOW", TextStyleDataManager.b(0x7f060657));
       textColorsAr[5] = new TextStyleDataManager$TextColors("GREEN", TextStyleDataManager.b(0x7f0603cc));
       textColorsAr[6] = new TextStyleDataManager$TextColors("LIGHT_BLUE", TextStyleDataManager.b(0x7f060726));
       textColorsAr[7] = new TextStyleDataManager$TextColors("BLUE", TextStyleDataManager.b(0x7f0605df));
       textColorsAr[8] = new TextStyleDataManager$TextColors("VIOLET", TextStyleDataManager.b(0x7f060481));
       textColorsAr[9] = new TextStyleDataManager$TextColors("DARK_BROWN", TextStyleDataManager.b(0x7f061a51));
       textColorsAr[10] = new TextStyleDataManager$TextColors("BROWN", TextStyleDataManager.b(0x7f061a6b));
       textColorsAr[11] = new TextStyleDataManager$TextColors("NAVY_BLUE", TextStyleDataManager.b(0x7f0619e0));
       textColorsAr[12] = new TextStyleDataManager$TextColors("SKY_BLUE", TextStyleDataManager.b(0x7f061a5b));
       this.a = textColorsAr;
    }
    public static int b(int p0){
       TextStyleDataManager textStyleDat = TextStyleDataManager.class;
       if (PatchProxy.isSupport(textStyleDat)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, textStyleDat, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return j.a(p0, 1);
    }
    public List a(){
       ArrayList obj = PatchProxy.apply(null, this, TextStyleDataManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       TextStyleDataManager ta = this.a;
       int len = ta.length;
       for (int i = 0; i < len; i = i + 1) {
          obj.add(new TextStyleDataManager$a(ta[i]));
       }
       return obj;
    }
}
