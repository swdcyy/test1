package com.kuaishou.commercial.splash.SplashModelDeserializer;
import com.google.gson.b;
import java.util.HashMap;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import com.kuaishou.android.model.mix.CommonMeta;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.google.gson.JsonObject;
import ok.h;
import com.kuaishou.android.model.feed.FeedDeserializer;
import java.lang.ReflectiveOperationException;
import java.util.ArrayList;
import java.lang.reflect.Field;
import java.util.Set;
import java.util.Iterator;
import ga6.d;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.k0;

public class SplashModelDeserializer implements b	// class@001581
{
    public static final Map a;

    static {
       HashMap hashMap = new HashMap();
       SplashModelDeserializer.a = hashMap;
       String[] stringArray = new String[]{"mAd","mVideoModel","mCommonMeta"};
       hashMap.put(BaseFeed.class, Arrays.asList(stringArray));
       stringArray = new String[]{"mListLoadSequenceID"};
       hashMap.put(CommonMeta.class, Arrays.asList(stringArray));
    }
    public void SplashModelDeserializer(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       Object obj1;
       List list;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, SplashModelDeserializer.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       JsonObject jsonObject = p0.r();
       obj = (p1.equals(BaseFeed.class))? FeedDeserializer.c().apply(jsonObject): p1.newInstance();
    label_0036 :
       if (obj != null && !PatchProxy.applyVoidFourRefs(jsonObject, obj, p2, p1, this, SplashModelDeserializer.class, "2")) {
          ArrayList uArrayList = PatchProxy.applyTwoRefs(obj, p1, this, SplashModelDeserializer.class, "3");
          if (uArrayList != patchProxyRe) {
          }else {
             Field[] declaredFiel = obj.getClass().getDeclaredFields();
             uArrayList = new ArrayList(declaredFiel.length);
             Iterator iterator1 = SplashModelDeserializer.a.keySet().iterator();
             while (true) {
                if (iterator1.hasNext()) {
                   Class uClass = iterator1.next();
                   if (uClass.isInstance(p1) || uClass.isAssignableFrom(p1)) {
                      list = SplashModelDeserializer.a.get(uClass);
                   }
                }else {
                   list = null;
                }
                int len = declaredFiel.length;
                int uClass1 = 0;
                while (uClass1 < len) {
                   object oobject = declaredFiel[uClass1];
                   if (list != null && list.contains(oobject.getName())) {
                      uArrayList.add(d.a(oobject));
                   }
                   uClass1++;
                }
             }
          }
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             d uod = iterator.next();
             if (TextUtils.x(uod.c)) {
                obj1 = p2.c(jsonObject, uod.b);
             }else if(k0.a(jsonObject, uod.c)){
                obj1 = p2.c(k0.e(jsonObject, uod.c), uod.b);
             }else if(uod.d != null){
                obj1 = p2.c(jsonObject, uod.b);
             }else {
                obj1 = null;
             }
             if (obj1 != null) {
                uod.b(obj, obj1);
             }else {
                continue ;
             }
          }
       }
       return obj;
    }
}
