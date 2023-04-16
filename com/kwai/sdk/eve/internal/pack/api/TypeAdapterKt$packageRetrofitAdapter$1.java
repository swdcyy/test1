package com.kwai.sdk.eve.internal.pack.api.TypeAdapterKt$packageRetrofitAdapter$1;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import njd.a;
import rn7.d;

public final class TypeAdapterKt$packageRetrofitAdapter$1 implements b	// class@001593
{
    public static final TypeAdapterKt$packageRetrofitAdapter$1 a;

    static {
       TypeAdapterKt$packageRetrofitAdapter$1.a = new TypeAdapterKt$packageRetrofitAdapter$1();
    }
    public void TypeAdapterKt$packageRetrofitAdapter$1(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       int i;
       a uoa = PatchProxy.applyThreeRefs(p0, p1, p2, this, TypeAdapterKt$packageRetrofitAdapter$1.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          try{
             a uoa1 = new a(p2.c(p0, d.class), 0, null, null, 0, 0);
          }catch(java.lang.Exception e0){
             i = 0;
          }
          uoa = i;
       }
       return uoa;
    }
}
