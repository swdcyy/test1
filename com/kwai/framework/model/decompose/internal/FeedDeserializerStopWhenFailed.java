package com.kwai.framework.model.decompose.internal.FeedDeserializerStopWhenFailed;
import com.google.gson.b;
import com.kwai.framework.model.decompose.internal.FeedDeserializerStopWhenFailed$a;
import nsd.u;
import java.util.concurrent.ConcurrentHashMap;
import ok.h;
import fa6.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Iterable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.lang.reflect.Modifier;
import ga6.d;
import java.util.Map;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import java.lang.System;
import com.kwai.framework.model.feed.UnknownFeed;
import com.google.gson.JsonObject;
import java.util.Iterator;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.k0;
import mkd.a;
import com.kwai.framework.model.decompose.api.SyncableProviderContainer;
import ga6.e;
import ga6.a;
import ha6.b;
import ha6.e;
import java.lang.NullPointerException;
import ekd.e0;
import java.lang.Throwable;
import java.lang.IllegalStateException;

public final class FeedDeserializerStopWhenFailed implements b	// class@00169f
{
    public final h a;
    public final d b;
    public static final ConcurrentHashMap c;
    public static final FeedDeserializerStopWhenFailed$a d;

    static {
       FeedDeserializerStopWhenFailed.d = new FeedDeserializerStopWhenFailed$a(null);
       FeedDeserializerStopWhenFailed.c = new ConcurrentHashMap();
    }
    public void FeedDeserializerStopWhenFailed(h p0,d p1){
       a.p(p0, "baseFeedFunction");
       a.p(p1, "logger");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final Iterable a(BaseFeed p0){
       List obj = PatchProxy.applyOneRefs(p0, this, FeedDeserializerStopWhenFailed.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.m(p0);
       obj = FeedDeserializerStopWhenFailed.c.get(p0.getClass());
       if (obj != null) {
          return obj;
       }
       Field[] declaredFiel = p0.getClass().getDeclaredFields();
       ArrayList uArrayList = new ArrayList(declaredFiel.length);
       int len = declaredFiel.length;
       int i = 0;
       while (i < len) {
          object oobject = declaredFiel[i];
          a.o(oobject, "field");
          int modifiers = oobject.getModifiers();
          if (!Modifier.isStatic(modifiers) && !Modifier.isTransient(modifiers)) {
             Class type = oobject.getType();
             a.o(type, "field.type");
             if (!type.isPrimitive() && !oobject.getType().isAssignableFrom(String.class)) {
                uArrayList.add(d.a(oobject));
             }
          }
          i = i + 1;
       }
       FeedDeserializerStopWhenFailed.c.put(p0.getClass(), uArrayList);
       return uArrayList;
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       int this;
       d b;
       BaseFeed uBaseFeed = PatchProxy.applyThreeRefs(p0, p1, p2, this, FeedDeserializerStopWhenFailed.class, "1");
       if (uBaseFeed != PatchProxyResult.class) {
       }else {
          a.p(p0, "json");
          a.p(p1, "typeOfT");
          a.p(p2, "context");
          System.nanoTime();
          UnknownFeed unknownFeed = new UnknownFeed();
          Object obj = p0;
          BaseFeed uBaseFeed1 = this.a.apply(obj);
          Iterator iterator = this.a(uBaseFeed1).iterator();
          this = p1;
          BaseFeed uBaseFeed2 = null;
          while (iterator.hasNext()) {
             d uod = iterator.next();
             b = uod.b;
             a.o(b, "field.mType");
             d this1 = uod.c;
             if (TextUtils.x(this1)) {
                uBaseFeed2 = p2.c(p0, uod.b);
             }else if(k0.a(obj, this1)){
                uBaseFeed2 = p2.c(k0.e(obj, this1), uod.b);
             }else if(uod.d != null){
                uBaseFeed2 = p2.c(p0, uod.b);
             }
             if (uBaseFeed2 != null) {
                uod.b(uBaseFeed1, uBaseFeed2);
             }
             this1 = b;
          }
          if (uBaseFeed1 != null) {
             uBaseFeed1.afterDeserialize();
             a.a(uBaseFeed1, uBaseFeed1.getDataMap$framework_model_release(), p1, p0, p2, true);
             if (b.b.a()) {
                if (uBaseFeed1 instanceof e) {
                   uBaseFeed2 = uBaseFeed1;
                }
                if (uBaseFeed2 != null) {
                   uBaseFeed2.setJsonObjectForMetaExt(p0);
                }
             }
             System.nanoTime();
             uBaseFeed = uBaseFeed1;
          }else {
             throw new NullPointerException("null cannot be cast to non-null type com.yxcorp.utility.gson.GsonLifecycle");
          }
       }
       return uBaseFeed;
    }
}
