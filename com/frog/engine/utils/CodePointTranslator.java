package com.frog.engine.utils.CodePointTranslator;
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
import java.lang.Character;

public abstract class CodePointTranslator extends CharSequenceTranslator	// class@00156f
{

    public void CodePointTranslator(){
       super();
    }
    public final int translate(CharSequence p0,int p1,Writer p2){
       if (PatchProxy.isSupport(CodePointTranslator.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, CodePointTranslator.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.translate(Character.codePointAt(p0, p1), p2);
    }
    public abstract boolean translate(int p0,Writer p1);
}
