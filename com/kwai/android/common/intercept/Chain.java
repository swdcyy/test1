package com.kwai.android.common.intercept.Chain;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.LinkedHashMap;
import java.util.Collection;
import java.util.Map;
import java.lang.Throwable;
import com.kwai.android.common.intercept.Interceptor;

public class Chain	// class@000995
{
    public final Map deliverParam;
    public Throwable exception;
    public boolean isAbort;
    public final LinkedList linkedList;

    public void Chain(LinkedList p0){
       a.p(p0, "initInterceptors");
       super();
       LinkedList linkedList = new LinkedList();
       this.linkedList = linkedList;
       this.isAbort = true;
       this.deliverParam = new LinkedHashMap();
       linkedList.addAll(p0);
    }
    public final Map getDeliverParam(){
       return this.deliverParam;
    }
    public final Throwable getException(){
       return this.exception;
    }
    public final boolean isAbort(){
       return this.isAbort;
    }
    public final void proceed(){
       Interceptor interceptor = this.linkedList.poll();
       if (interceptor != null) {
          interceptor.intercept(this);
       }else {
          this.isAbort = false;
       }
       return;
    }
    public final void setException(Throwable p0){
       this.exception = p0;
    }
}
