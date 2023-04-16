package com.facebook.jni.MapIteratorHelper;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public class MapIteratorHelper	// class@00115d
{
    public final Iterator mIterator;
    public Object mKey;
    public Object mValue;

    public void MapIteratorHelper(Map p0){
       super();
       this.mIterator = p0.entrySet().iterator();
    }
    public boolean hasNext(){
       if (this.mIterator.hasNext()) {
          Map$Entry uEntry = this.mIterator.next();
          this.mKey = uEntry.getKey();
          this.mValue = uEntry.getValue();
          return true;
       }else {
          this.mKey = null;
          this.mValue = null;
          return false;
       }
    }
}
