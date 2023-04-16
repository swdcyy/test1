package com.facebook.react.bridge.ReactSoftException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.Object;
import com.facebook.react.bridge.ReactSoftException$ReactSoftExceptionListener;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.lang.Throwable;
import java.util.Iterator;
import cb.a;

public class ReactSoftException	// class@00122c
{
    public static final List sListeners;

    static {
       ReactSoftException.sListeners = new CopyOnWriteArrayList();
    }
    public void ReactSoftException(){
       super();
    }
    public static void addListener(ReactSoftException$ReactSoftExceptionListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, ReactSoftException.class, "1")) {
          return;
       }
       List sListeners = ReactSoftException.sListeners;
       if (!sListeners.contains(p0)) {
          sListeners.add(p0);
       }
       return;
    }
    public static void clearListeners(){
       if (PatchProxy.applyVoid(null, null, ReactSoftException.class, "3")) {
          return;
       }
       ReactSoftException.sListeners.clear();
       return;
    }
    public static void logSoftException(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, ReactSoftException.class, "4")) {
          return;
       }
       List sListeners = ReactSoftException.sListeners;
       if (sListeners.size() > 0) {
          Iterator iterator = sListeners.iterator();
          while (iterator.hasNext()) {
             iterator.next().logSoftException(p0, p1);
          }
       }else {
          a.h(p0, "Unhandled SoftException", p1);
       }
       return;
    }
    public static void removeListener(ReactSoftException$ReactSoftExceptionListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, ReactSoftException.class, "2")) {
          return;
       }
       ReactSoftException.sListeners.remove(p0);
       return;
    }
}
