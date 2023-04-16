package com.facebook.jni.IteratorHelper;
import java.lang.Iterable;
import java.lang.Object;
import java.util.Iterator;

public class IteratorHelper	// class@00115c
{
    public final Iterator a;
    public Object mElement;

    public void IteratorHelper(Iterable p0){
       super();
       this.a = p0.iterator();
    }
    public void IteratorHelper(Iterator p0){
       super();
       this.a = p0;
    }
    public boolean hasNext(){
       if (this.a.hasNext()) {
          this.mElement = this.a.next();
          return true;
       }else {
          this.mElement = null;
          return false;
       }
    }
}
