package com.frog.engine.utils.AggregateTranslator;
import com.frog.engine.utils.CharSequenceTranslator;
import java.util.ArrayList;
import java.lang.Object;
import java.util.List;
import java.lang.CharSequence;
import java.io.Writer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Iterator;

public class AggregateTranslator extends CharSequenceTranslator	// class@00156d
{
    public final List translators;

    public void AggregateTranslator(CharSequenceTranslator[] p0){
       super();
       this.translators = new ArrayList();
       if (p0 != null) {
          int len = p0.length;
          int i = 0;
          while (i < len) {
             object oobject = p0[i];
             if (oobject != null) {
                this.translators.add(oobject);
             }
             i = i + 1;
          }
       }
       return;
    }
    public int translate(CharSequence p0,int p1,Writer p2){
       Iterator obj;
       int i;
       if (PatchProxy.isSupport(AggregateTranslator.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, AggregateTranslator.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = this.translators.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return 0;
          }
          i = obj.next().translate(p0, p1, p2);
          if (i) {
             break ;
          }
       }
       return i;
    }
}
