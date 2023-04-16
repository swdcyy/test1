package com.kwai.video.wayne.player.main._2_AbstractPlayerListenerDelegate$ListenerInterceptorStore;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Class;
import java.util.List;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import java.util.ArrayList;
import java.util.Iterator;
import com.kwai.video.wayne.player.main._2_AbstractPlayerListenerDelegate$AbsListenerInterceptor;

public class _2_AbstractPlayerListenerDelegate$ListenerInterceptorStore	// class@000daa
{
    public final Map mInterceptorsByType;

    public void _2_AbstractPlayerListenerDelegate$ListenerInterceptorStore(){
       super();
       this.mInterceptorsByType = new HashMap();
    }
    public List get(Class p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, _2_AbstractPlayerListenerDelegate$ListenerInterceptorStore.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       List list = this.mInterceptorsByType.get(p0);
       if (list == null) {
          return null;
       }
       obj = new ArrayList();
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          obj.add(iterator.next());
       }
       return obj;
    }
    public void put(Class p0,_2_AbstractPlayerListenerDelegate$AbsListenerInterceptor p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, _2_AbstractPlayerListenerDelegate$ListenerInterceptorStore.class, "1")) {
          return;
       }
       List list = this.mInterceptorsByType.get(p0);
       if (list == null) {
          list = new ArrayList();
          this.mInterceptorsByType.put(p0, list);
       }
       list.add(p1);
       return;
    }
}
