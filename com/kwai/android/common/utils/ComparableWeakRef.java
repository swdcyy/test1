package com.kwai.android.common.utils.ComparableWeakRef;
import java.lang.ref.WeakReference;
import java.lang.Object;
import java.lang.ref.ReferenceQueue;

public final class ComparableWeakRef extends WeakReference	// class@00099a
{

    public void ComparableWeakRef(Object p0){
       super(p0);
    }
    public void ComparableWeakRef(Object p0,ReferenceQueue p1){
       super(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       boolean b = false;
       if (!p0 instanceof ComparableWeakRef) {
          return b;
       }
       Object obj = this.get();
       if (obj != null) {
          b = obj.equals(p0.get());
       }
       return b;
    }
    public int hashCode(){
       Object obj = this.get();
       int i = (obj != null)? obj.hashCode(): super.hashCode();
       return i;
    }
}
