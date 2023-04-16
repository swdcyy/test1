package com.kwai.framework.network.dns.a;
import javax.inject.Provider;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.HashSet;
import java.util.Iterator;
import java.net.InetAddress;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class a implements Provider	// class@000c04
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final Object get(){
       String[] stringArray = new String[]{"0.0.0.0","1.1.1.1","::","1:1:1:1:1:1:1:1"};
       HashSet hashSet = new HashSet();
       Iterator iterator = Lists.e(stringArray).iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          try{
             hashSet.addAll(Arrays.asList(InetAddress.getAllByName(str)));
          }catch(java.lang.Exception e2){
             ExceptionHandler.handleCaughtException(e2);
             goto label_0019 ;
          }
       }
       return hashSet;
    }
}
