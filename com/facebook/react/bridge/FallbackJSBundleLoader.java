package com.facebook.react.bridge.FallbackJSBundleLoader;
import com.facebook.react.bridge.JSBundleLoader;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
import java.util.ListIterator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.RuntimeException;
import java.util.Iterator;
import java.lang.Exception;
import java.lang.Throwable;
import com.facebook.react.bridge.JSBundleLoaderDelegate;
import cb.a;
import cb.c;

public final class FallbackJSBundleLoader extends JSBundleLoader	// class@0011c1
{
    public Stack mLoaders;
    public final ArrayList mRecoveredErrors;

    public void FallbackJSBundleLoader(List p0){
       super();
       this.mRecoveredErrors = new ArrayList();
       this.mLoaders = new Stack();
       ListIterator listIterator = p0.listIterator(p0.size());
       while (listIterator.hasPrevious()) {
          this.mLoaders.push(listIterator.previous());
       }
       return;
    }
    public final JSBundleLoader getDelegateLoader(){
       RuntimeException obj = PatchProxy.apply(null, this, FallbackJSBundleLoader.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.mLoaders.empty()) {
          return this.mLoaders.peek();
       }
       obj = new RuntimeException("No fallback options available");
       Iterator iterator = this.mRecoveredErrors.iterator();
       RuntimeException runtimeExcep = obj;
       while (iterator.hasNext()) {
          runtimeExcep.initCause(iterator.next());
          while (runtimeExcep.getCause() != null) {
             runtimeExcep = runtimeExcep.getCause();
          }
       }
       throw obj;
    }
    public String loadScript(JSBundleLoaderDelegate p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FallbackJSBundleLoader.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
       label_000f :
          return this.getDelegateLoader().loadScript(p0);
       }catch(java.lang.Exception e0){
          if (e0.getMessage() != null && (e0.getMessage()).startsWith("facebook::react::Recoverable")) {
             this.mLoaders.pop();
             this.mRecoveredErrors.add(e0);
             if (a.a.d(6)) {
                a.a.c("FallbackJSBundleLoader", "Falling back from recoverable error", e0);
                goto label_000f ;
             }else {
                goto label_000f ;
             }
          }else {
             throw e0;
          }
       }
    }
}
