package com.android.kwai.foundation.network.core.KwaiRpcServiceProxy;
import java.lang.reflect.InvocationHandler;
import com.android.kwai.foundation.network.core.KwaiRpcServiceFactory;
import java.lang.Class;
import android.net.Uri;
import java.lang.Object;
import java.lang.String;
import okhttp3.OkHttpClient;
import java.util.HashSet;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.Collections;
import okhttp3.RequestBody;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import com.android.kwai.foundation.network.core.annotation.BodyParameter;
import java.util.Map;
import java.lang.IllegalArgumentException;
import com.android.kwai.foundation.network.core.serializers.ISerializer;
import okhttp3.Request$Builder;
import com.android.kwai.foundation.network.core.annotation.HeaderParameter;
import java.lang.CharSequence;
import java.util.Iterator;
import okhttp3.OkHttpClient$Builder;
import com.android.kwai.foundation.network.core.annotation.Interceptor;
import okhttp3.Interceptor;
import com.android.kwai.foundation.network.core.annotation.method.Get;
import com.android.kwai.foundation.network.core.annotation.method.Head;
import com.android.kwai.foundation.network.core.annotation.method.Delete;
import com.android.kwai.foundation.network.core.annotation.method.Patch;
import com.android.kwai.foundation.network.core.annotation.method.Post;
import com.android.kwai.foundation.network.core.annotation.method.Put;
import java.lang.NoSuchMethodException;
import com.android.kwai.foundation.network.core.annotation.ParameterPath;
import com.android.kwai.foundation.network.core.annotation.Path;
import java.util.NoSuchElementException;
import android.net.Uri$Builder;
import com.android.kwai.foundation.network.core.annotation.QueryParameter;
import com.android.kwai.foundation.network.core.deserializers.IDeserializer;
import com.android.kwai.foundation.network.core.logicrecognize.ILogicRecognize;
import com.android.kwai.foundation.network.core.RpcSyncDelegate;
import com.android.kwai.foundation.network.SyncResult;
import com.android.kwai.foundation.network.core.RpcAsyncDelegate;
import com.android.kwai.foundation.network.core.ICancelFeature;
import com.android.kwai.foundation.network.IRpcService$Callback;
import com.android.kwai.foundation.network.core.wrapper.CallbackWrapper;
import com.android.kwai.foundation.network.core.utils.FailureCall;
import com.android.kwai.foundation.network.ThreadType;
import java.lang.Throwable;
import com.android.kwai.foundation.network.IRpcService$ResponseProgressListener;
import com.android.kwai.foundation.network.IRpcService$RequestProgressListener;
import com.android.kwai.foundation.network.core.annotation.Deserializer;
import com.android.kwai.foundation.network.core.deserializers.BeanDeserializer;
import com.android.kwai.foundation.network.core.annotation.LogicRecognize;
import java.lang.Exception;
import com.android.kwai.foundation.network.core.annotation.Serializer;
import com.android.kwai.foundation.network.core.serializers.FormSerializer;
import com.android.kwai.foundation.network.core.annotation.Sync;
import java.lang.Void;
import com.android.kwai.foundation.network.core.annotation.CallThreadType;
import java.lang.StringBuilder;
import java.lang.Integer;

public final class KwaiRpcServiceProxy implements InvocationHandler	// class@0003da
{
    public OkHttpClient mClient;
    public Class mRpcClz;
    public Uri mRpcHost;
    public Set mRpcMethod;

    public void KwaiRpcServiceProxy(KwaiRpcServiceFactory p0,Class p1,Uri p2){
       super();
       this.mClient = p0.getOkHttpClient(p2.getScheme());
       this.mRpcClz = p1;
       this.mRpcHost = p2;
       this.mRpcMethod = Collections.unmodifiableSet(new HashSet(Arrays.asList(p1.getMethods())));
    }
    public final RequestBody addBodyParameter(Object p0,Method p1,Object[] p2){
       p0 = p1.getParameterAnnotations();
       HashMap hashMap = new HashMap();
       int i = 0;
       while (true) {
          if (i < p0.length) {
             object oobject = p2[i];
             object oobject1 = p0[i];
             int len = oobject1.length;
             int i1 = 0;
             while (true) {
                if (i1 < len) {
                   object oobject2 = oobject1[i1];
                   if (BodyParameter.class.equals(oobject2.annotationType())) {
                      String str = oobject2.value();
                      if (!(str.trim()).length()) {
                         if (oobject != null) {
                            if (oobject instanceof Map) {
                               hashMap.putAll(oobject);
                            label_0053 :
                               i = i + 1;
                            }else {
                            }
                         }
                      }else {
                         hashMap.remove(str);
                         hashMap.put(str, oobject);
                         goto label_0053 ;
                      }
                   }
                   i1 = i1 + 1;
                }else {
                   goto label_0053 ;
                }
             }
             return this.getSerializer(p1, p2).serialize(hashMap);
          }else {
             goto label_0056 ;
          }
       }
       throw new IllegalArgumentException("BodyParameter should either has key or parameter is instanceof map");
    }
    public final void addHeaderData(Object p0,Method p1,Object[] p2,Request$Builder p3){
       p0 = p1.getParameterAnnotations();
       int i = 0;
       while (true) {
          if (i < p0.length) {
             object oobject = p2[i];
             object oobject1 = p0[i];
             int len = oobject1.length;
             int i1 = 0;
             while (true) {
                if (i1 < len) {
                   object oobject2 = oobject1[i1];
                   if (HeaderParameter.class.equals(oobject2.annotationType())) {
                      if (oobject instanceof CharSequence) {
                         p3.addHeader(oobject2.value(), oobject.toString());
                      }else if(oobject instanceof Map){
                         Iterator iterator = oobject.keySet().iterator();
                         while (iterator.hasNext()) {
                            Object obj = iterator.next();
                            Object obj1 = oobject.get(obj);
                            if (obj != null && obj1 != null) {
                               p3.addHeader(obj.toString(), obj1.toString());
                            }else {
                               continue ;
                            }
                         }
                         i = i + 1;
                      }else {
                      }
                   }else {
                      i1 = i1 + 1;
                   }
                }else {
                   goto label_0068 ;
                }
             }
             return;
          }else {
             goto label_006b ;
          }
       }
       throw new IllegalArgumentException("@HeaderParameter should be put in front of parameters of type <Map<String,String>> or <CharSequence>");
    }
    public final void addInterceptor(Object p0,Method p1,Object[] p2,OkHttpClient$Builder p3){
       if (p1.isAnnotationPresent(Interceptor.class)) {
          p0 = p1.getAnnotation(Interceptor.class).value();
          int len = p0.length;
          for (int i = 0; i < len; i++) {
             p3.addInterceptor(p0[i].newInstance());
          }
       }
       return;
    }
    public final void addMethod(Method p0,Request$Builder p1,RequestBody p2){
       if (p0.isAnnotationPresent(Get.class) || (p0.isAnnotationPresent(Head.class) || (p0.isAnnotationPresent(Delete.class) || (p0.isAnnotationPresent(Patch.class) || (!p0.isAnnotationPresent(Post.class) && !p0.isAnnotationPresent(Put.class)))))) {
          throw new NoSuchMethodException("http method is empty please define method in front of function");
       }
       if (p0.isAnnotationPresent(Delete.class)) {
          p1.delete(p2);
       }else if(p0.isAnnotationPresent(Patch.class)){
          p1.patch(p2);
       }else if(p0.isAnnotationPresent(Post.class)){
          p1.post(p2);
       }else if(p0.isAnnotationPresent(Put.class)){
          p1.put(p2);
       }else if(p0.isAnnotationPresent(Get.class)){
          p1.get();
       }else if(p0.isAnnotationPresent(Head.class)){
          p1.head();
       }
       return;
    }
    public final Uri addPath(Object p0,Method p1,Object[] p2){
       Uri$Builder uBuilder;
       KwaiRpcServiceProxy kwaiRpcServi = this;
       Method method = p1;
       Annotation[][] parameterAnn = p1.getParameterAnnotations();
       String str = "";
       String str1 = str;
       int i = 0;
       int i1 = 0;
       while (true) {
          if (i < parameterAnn.length) {
             object oobject = p2[i];
             object oobject1 = parameterAnn[i];
             int len = oobject1.length;
             int i2 = 0;
             while (true) {
                if (i2 < len) {
                   if (ParameterPath.class.equals(oobject1[i2].annotationType())) {
                      if (oobject instanceof CharSequence) {
                         str1 = (oobject.length() > 0 && oobject.startsWith("/"))? oobject.substring(1): oobject;
                         i1 = 1;
                      label_0050 :
                         i = i + 1;
                      }else {
                         throw new IllegalArgumentException("@ParameterPath should be put in front of parameters of type <String> or <CharSequence>");
                      }
                   }else {
                      i2 = i2 + 1;
                   }
                }else {
                   goto label_0050 ;
                }
             }
          }else if(i1 || method.isAnnotationPresent(Path.class)){
             String str2 = (kwaiRpcServi.mRpcClz.isAnnotationPresent(Path.class))? kwaiRpcServi.mRpcClz.getAnnotation(Path.class).value(): str;
             if (method.isAnnotationPresent(Path.class)) {
                str = method.getAnnotation(Path.class).value();
                if (str.startsWith("/")) {
                   str = str.substring(1);
                }
             }
             uBuilder = new Uri$Builder();
             uBuilder.scheme(kwaiRpcServi.mRpcHost.getScheme());
             uBuilder.encodedAuthority(kwaiRpcServi.mRpcHost.getEncodedAuthority());
             if (str2.length() > 0) {
                uBuilder.encodedPath(str2);
                if (str.length() > 0) {
                   uBuilder.appendEncodedPath(str);
                }
                if (str1.length() > 0) {
                   uBuilder.appendEncodedPath(str1);
                   break ;
                }
             }else if(str.length() > 0){
                uBuilder.encodedPath(str);
                if (str1.length() > 0) {
                   uBuilder.appendEncodedPath(str1);
                   break ;
                }
             }else {
                uBuilder.encodedPath(str1);
                break ;
             }
             break ;
          }else {
             throw new NoSuchElementException("Path annotation must be defined front of the method or you can use ParameterPath annotation");
          }
       }
       return uBuilder.build();
    }
    public final void addQueryParameter(Object p0,Method p1,Object[] p2,Uri p3,Request$Builder p4){
       p0 = p1.getParameterAnnotations();
       HashMap hashMap = new HashMap();
       int i = 0;
       while (true) {
          if (i < p0.length) {
             object oobject = p2[i];
             object oobject1 = p0[i];
             int len = oobject1.length;
             int i1 = 0;
             while (true) {
                if (i1 < len) {
                   object oobject2 = oobject1[i1];
                   if (QueryParameter.class.equals(oobject2.annotationType())) {
                      String str = oobject2.value();
                      if (!(str.trim()).length()) {
                         if (oobject != null) {
                            if (oobject instanceof Map) {
                               hashMap.putAll(oobject);
                            label_0053 :
                               i = i + 1;
                            }else {
                               throw new IllegalArgumentException("QueryParameter should either has key or parameter is instanceof map");
                            }
                         }
                      }else {
                         hashMap.remove(str);
                         hashMap.put(str, oobject);
                         goto label_0053 ;
                      }
                   }
                   i1 = i1 + 1;
                }else {
                   goto label_0053 ;
                }
             }
          }else {
             p0 = hashMap.keySet().iterator();
             Uri$Builder uBuilder = p3.buildUpon();
             while (p0.hasNext()) {
                String str1 = p0.next();
                uBuilder.appendQueryParameter(str1, String.valueOf(hashMap.get(str1)));
             }
             if (hashMap.isEmpty()) {
                p4.url(p3.toString());
             }else {
                p4.url(uBuilder.build().toString());
             }
             return;
          }
       }
    }
    public final Object execute(Object p0,Method p1,Object[] p2){
       RequestBody requestBody;
       boolean b = false;
       Request$Builder uBuilder = new Request$Builder();
       OkHttpClient$Builder uBuilder1 = this.mClient.newBuilder();
       Map callback = this.getCallback(p1, p2);
       this.addHeaderData(p0, p1, p2, uBuilder);
       this.addInterceptor(p0, p1, p2, uBuilder1);
       Uri uri = this.addPath(p0, p1, p2);
       if (p1.isAnnotationPresent(Get.class) || p1.isAnnotationPresent(Head.class)) {
          this.addQueryParameter(p0, p1, p2, uri, uBuilder);
          requestBody = b;
       }else {
          requestBody = this.addBodyParameter(p0, p1, p2);
          this.addQueryParameter(p0, p1, p2, uri, uBuilder);
       }
       this.addMethod(p1, uBuilder, requestBody);
       IDeserializer deserializer = this.getDeserializer(p1);
       p0 = this.getLogicRecognize(p1);
       p0 = (this.isSync(p1))? super(this.getSyncDeserializeBeanClass(p1)).makeTheRealCall(p1, p2, uBuilder, uBuilder1, deserializer, callback, p0): super().makeTheRealCall(p1, p2, uBuilder, uBuilder1, deserializer, callback, p0);
       return p0;
    }
    public final Map getCallback(Method p0,Object[] p1){
       HashMap hashMap = new HashMap();
       if (p1 != null && p1.length > 0) {
          int i = p1.length - 1;
          while (i >= 0) {
             if (p1[i] instanceof IRpcService$Callback && !hashMap.containsKey(IRpcService$Callback.class)) {
                hashMap.put(IRpcService$Callback.class, new CallbackWrapper(p1[i], this.getThreadType(p0, i)));
             }
             if (p1[i] instanceof IRpcService$RequestProgressListener && !hashMap.containsKey(IRpcService$RequestProgressListener.class)) {
                hashMap.put(IRpcService$RequestProgressListener.class, new CallbackWrapper(p1[i], this.getThreadType(p0, i)));
             }
             if (p1[i] instanceof IRpcService$ResponseProgressListener && !hashMap.containsKey(IRpcService$ResponseProgressListener.class)) {
                hashMap.put(IRpcService$ResponseProgressListener.class, new CallbackWrapper(p1[i], this.getThreadType(p0, i)));
             }
             i = i - 1;
          }
       }
       return hashMap;
    }
    public final IDeserializer getDeserializer(Method p0){
       if (p0.isAnnotationPresent(Deserializer.class)) {
          return p0.getAnnotation(Deserializer.class).value().newInstance();
       }
       return new BeanDeserializer();
    }
    public final ILogicRecognize getLogicRecognize(Method p0){
       if (p0.isAnnotationPresent(LogicRecognize.class)) {
          LogicRecognize annotation = p0.getAnnotation(LogicRecognize.class);
          try{
             return annotation.value().newInstance();
          }catch(java.lang.Exception e2){
             e2.printStackTrace();
          }
          return null;
       }else {
          goto label_001f ;
       }
    }
    public final ISerializer getSerializer(Method p0,Object[] p1){
       if (p0.isAnnotationPresent(Serializer.class)) {
          return p0.getAnnotation(Serializer.class).value().newInstance();
       }
       return new FormSerializer();
    }
    public final Class getSyncDeserializeBeanClass(Method p0){
       if (p0.isAnnotationPresent(Sync.class)) {
          return p0.getAnnotation(Sync.class).value();
       }
       return Void.class;
    }
    public final ThreadType getThreadType(Method p0,int p1){
       object oobject1;
       object oobject = p0.getParameterAnnotations()[p1];
       p1 = oobject.length;
       int i = 0;
       while (true) {
          if (i >= p1) {
             return ThreadType.Main;
          }
          oobject1 = oobject[i];
          if (CallThreadType.class.equals(oobject1.annotationType())) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject1.value();
    }
    public Object invoke(Object p0,Method p1,Object[] p2){
       if (this.mRpcMethod.contains(p1)) {
          return this.execute(p0, p1, p2);
       }
       return p1.invoke(this, p2);
    }
    public final boolean isSync(Method p0){
       if (p0.isAnnotationPresent(Sync.class)) {
          return true;
       }
       return false;
    }
    public String toString(){
       return this.mRpcClz.getName()+"@"+Integer.toHexString(this.hashCode());
    }
}
