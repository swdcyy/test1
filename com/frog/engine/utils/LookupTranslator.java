package com.frog.engine.utils.LookupTranslator;
import com.frog.engine.utils.CharSequenceTranslator;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.lang.Object;
import java.util.Map$Entry;
import java.lang.CharSequence;
import java.lang.String;
import java.lang.Character;
import java.security.InvalidParameterException;
import java.io.Writer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class LookupTranslator extends CharSequenceTranslator	// class@001574
{
    public final int longest;
    public final Map lookupMap;
    public final HashSet prefixSet;
    public final int shortest;

    public void LookupTranslator(Map p0){
       super();
       if (p0 == null) {
          throw new InvalidParameterException("lookupMap cannot be null");
       }
       this.lookupMap = new HashMap();
       this.prefixSet = new HashSet();
       int i = Integer.MAX_VALUE;
       Iterator iterator = p0.entrySet().iterator();
       int i1 = 0;
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          this.lookupMap.put(uEntry.getKey().toString(), uEntry.getValue().toString());
          this.prefixSet.add(Character.valueOf(uEntry.getKey().charAt(0)));
          int i2 = uEntry.getKey().length();
          if (i2 < i) {
             i = i2;
          }
          if (i2 > i1) {
             i1 = i2;
          }
       }
       this.shortest = i;
       this.longest = i1;
       return;
    }
    public int translate(CharSequence p0,int p1,Writer p2){
       LookupTranslator obj;
       int i1;
       if (PatchProxy.isSupport(LookupTranslator.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, LookupTranslator.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (this.prefixSet.contains(Character.valueOf(p0.charAt(p1)))) {
          obj = this.longest;
          int i = p1 + obj;
          if (i > p0.length()) {
             i1 = p0.length() - p1;
          }
          while (i1 >= this.shortest) {
             i = p1 + i1;
             String str = this.lookupMap.get(p0.subSequence(p1, i).toString());
             if (str != null) {
                p2.write(str);
                return i1;
             }
             i1 = i1 - 1;
          }
       }
       return 0;
    }
}
