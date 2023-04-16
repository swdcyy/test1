package com.yxcorp.gifshow.follow.common.model.FollowingUserBannerFeed$UserBannerInfoSerializer;
import zk.i;
import com.smile.gifmaker.mvps.utils.model.decouple.BaseDecoupledDeserializer;
import com.yxcorp.gifshow.follow.common.model.m;
import com.yxcorp.gifshow.follow.common.model.n;
import ok.h;
import java.lang.Object;
import java.lang.Iterable;
import com.yxcorp.gifshow.follow.common.model.FollowingUserBannerFeed$UserBannerInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.lang.reflect.Modifier;
import wl8.a;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import zk.h;
import com.google.gson.JsonObject;
import al.c;
import java.lang.annotation.Annotation;
import java.lang.IllegalAccessException;
import ekd.k0;

public final class FollowingUserBannerFeed$UserBannerInfoSerializer extends BaseDecoupledDeserializer implements i	// class@00117c
{

    public void FollowingUserBannerFeed$UserBannerInfoSerializer(){
       super(m.b, n.b);
    }
    public Iterable a(Object p0){
       ArrayList uArrayList = PatchProxy.applyOneRefs(p0, this, FollowingUserBannerFeed$UserBannerInfoSerializer.class, "3");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          p0 = p0.getClass().getDeclaredFields();
          uArrayList = new ArrayList(p0.length);
          int len = p0.length;
          int i = 0;
          while (i < len) {
             object oobject = p0[i];
             int modifiers = oobject.getModifiers();
             if (!Modifier.isStatic(modifiers) && !Modifier.isTransient(modifiers)) {
                uArrayList.add(a.a(oobject));
             }
             i = i + 1;
          }
       }
       return uArrayList;
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, FollowingUserBannerFeed$UserBannerInfoSerializer.class, "2");
       if (p1 != PatchProxyResult.class) {
       }else {
          p1 = this.b(p0, FollowingUserBannerFeed$UserBannerInfo.class, p2);
       }
       return p1;
    }
    public JsonElement serialize(Object p0,Type p1,h p2){
       object this;
       int i1;
       Object this1;
       JsonObject jsonObject2;
       JsonObject jsonObject = PatchProxy.applyThreeRefs(p0, p1, p2, this, FollowingUserBannerFeed$UserBannerInfoSerializer.class, "4");
       if (jsonObject != PatchProxyResult.class) {
       }else {
          Field[] declaredFiel = p0.getClass().getDeclaredFields();
          JsonObject jsonObject1 = new JsonObject();
          int len = declaredFiel.length;
          int i = 0;
          while (i < len) {
             this = declaredFiel[i];
             int modifiers = this.getModifiers();
             if (Modifier.isStatic(modifiers) || (Modifier.isTransient(modifiers) || (!this.getType().isPrimitive() && !this.getType().isAssignableFrom(String.class)))) {
                c annotation = this.getAnnotation(c.class);
                this.setAccessible(true);
                try{
                   i1 = 0;
                   this1 = this.get(p0);
                }catch(java.lang.IllegalAccessException e3){
                   e3.printStackTrace();
                   this1 = i1;
                }
                if (annotation == null) {
                   if (this1 != null) {
                      jsonObject2 = p2.b(this1, this1.getClass()).r();
                   }
                }else {
                   jsonObject2 = new JsonObject();
                   if (this1 != null) {
                      jsonObject2.G(annotation.value(), p2.b(this1, this1.getClass()));
                   }
                }
                if (jsonObject2 != null) {
                   k0.b(jsonObject1, jsonObject2);
                }
             }
          label_0093 :
             i = i + 1;
          }
          jsonObject = jsonObject1;
       }
       return jsonObject;
    }
}
