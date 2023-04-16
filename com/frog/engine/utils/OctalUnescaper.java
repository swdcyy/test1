package com.frog.engine.utils.OctalUnescaper;
import com.frog.engine.utils.CharSequenceTranslator;
import java.lang.CharSequence;
import java.io.Writer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public class OctalUnescaper extends CharSequenceTranslator	// class@001576
{

    public void OctalUnescaper(){
       super();
    }
    public final boolean isOctalDigit(char p0){
       boolean b = (p0 >= '0' && p0 <= '7')? true: false;
       return b;
    }
    public final boolean isZeroToThree(char p0){
       boolean b = (p0 >= '0' && p0 <= '3')? true: false;
       return b;
    }
    public int translate(CharSequence p0,int p1,Writer p2){
       if (PatchProxy.isSupport(OctalUnescaper.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, OctalUnescaper.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = (p0.length() - p1) - 1;
       StringBuilder str = "";
       if (p0.charAt(p1) == '\' && i > 0) {
          int i1 = p1 + 1;
          if (this.isOctalDigit(p0.charAt(i1))) {
             int i2 = p1 + 2;
             p1 = p1 + 3;
             str = str+p0.charAt(i1);
             if (i > 1 && this.isOctalDigit(p0.charAt(i2))) {
                str = str+p0.charAt(i2);
                if (i > 2 && (this.isZeroToThree(p0.charAt(i1)) && this.isOctalDigit(p0.charAt(p1)))) {
                   str = str+p0.charAt(p1);
                }
             }
          label_0080 :
             p2.write(Integer.parseInt(str, 8));
             return (str.length() + 1);
          }
       }
       return 0;
    }
}
