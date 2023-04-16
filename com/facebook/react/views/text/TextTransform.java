package com.facebook.react.views.text.TextTransform;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.views.text.TextTransform$a;
import java.text.BreakIterator;
import java.lang.StringBuilder;
import java.lang.Character;

public final class TextTransform extends Enum	// class@001419
{
    public static final TextTransform[] $VALUES;
    public static final TextTransform CAPITALIZE;
    public static final TextTransform LOWERCASE;
    public static final TextTransform NONE;
    public static final TextTransform UNSET;
    public static final TextTransform UPPERCASE;

    static {
       TextTransform textTransfor = new TextTransform("NONE", 0);
       TextTransform.NONE = textTransfor;
       TextTransform textTransfor1 = new TextTransform("UPPERCASE", 1);
       TextTransform.UPPERCASE = textTransfor1;
       TextTransform textTransfor2 = new TextTransform("LOWERCASE", 2);
       TextTransform.LOWERCASE = textTransfor2;
       TextTransform textTransfor3 = new TextTransform("CAPITALIZE", 3);
       TextTransform.CAPITALIZE = textTransfor3;
       TextTransform textTransfor4 = new TextTransform("UNSET", 4);
       TextTransform.UNSET = textTransfor4;
       TextTransform[] textTransfor5 = new TextTransform[]{textTransfor,textTransfor1,textTransfor2,textTransfor3,textTransfor4};
       TextTransform.$VALUES = textTransfor5;
    }
    public void TextTransform(String p0,int p1){
       super(p0, p1);
    }
    public static String apply(String p0,TextTransform p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, TextTransform.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       int i = TextTransform$a.a[p1.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i == 3) {
                p0 = TextTransform.capitalize(p0);
             }
          }else {
             p0 = p0.toLowerCase();
          }
       }else {
          p0 = p0.toUpperCase();
       }
       return p0;
    }
    public static String capitalize(String p0){
       BreakIterator obj = PatchProxy.applyOneRefs(p0, null, TextTransform.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = BreakIterator.getWordInstance();
       obj.setText(p0);
       StringBuilder str = new StringBuilder(p0.length());
       int i = obj.first();
       int i1 = i;
       i = obj.next();
       while (i != -1) {
          String str1 = p0.substring(i1, i);
          int i2 = 0;
          if (Character.isLetterOrDigit(str1.charAt(i2))) {
             str = str+Character.toUpperCase(str1.charAt(i2))+(str1.substring(1)).toLowerCase();
          }else {
             str = str+str1;
          }
       }
       return str;
    }
    public static TextTransform valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TextTransform.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(TextTransform.class, p0);
    }
    public static TextTransform[] values(){
       Object obj = PatchProxy.apply(null, null, TextTransform.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TextTransform.$VALUES.clone();
    }
}
