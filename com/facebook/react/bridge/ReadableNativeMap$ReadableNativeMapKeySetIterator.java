package com.facebook.react.bridge.ReadableNativeMap$ReadableNativeMapKeySetIterator;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableNativeMap;
import java.lang.Object;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class ReadableNativeMap$ReadableNativeMapKeySetIterator implements ReadableMapKeySetIterator	// class@001233
{
    public final Iterator mIterator;

    public void ReadableNativeMap$ReadableNativeMapKeySetIterator(ReadableNativeMap p0){
       super();
       this.mIterator = p0.getLocalMap().keySet().iterator();
    }
    public boolean hasNextKey(){
       Object obj = PatchProxy.apply(null, this, ReadableNativeMap$ReadableNativeMapKeySetIterator.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mIterator.hasNext();
    }
    public String nextKey(){
       Object obj = PatchProxy.apply(null, this, ReadableNativeMap$ReadableNativeMapKeySetIterator.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mIterator.next();
    }
}
