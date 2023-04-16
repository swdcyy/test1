package com.facebook.react.bridge.JavaOnlyMap$1;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.JavaOnlyMap;
import java.lang.Object;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Map$Entry;

public class JavaOnlyMap$1 implements ReadableMapKeySetIterator	// class@0011f3
{
    public Iterator mIterator;
    public final JavaOnlyMap this$0;

    public void JavaOnlyMap$1(JavaOnlyMap p0){
       this.this$0 = p0;
       super();
       this.mIterator = p0.mBackingMap.entrySet().iterator();
    }
    public boolean hasNextKey(){
       Object obj = PatchProxy.apply(null, this, JavaOnlyMap$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mIterator.hasNext();
    }
    public String nextKey(){
       Object obj = PatchProxy.apply(null, this, JavaOnlyMap$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mIterator.next().getKey();
    }
}
