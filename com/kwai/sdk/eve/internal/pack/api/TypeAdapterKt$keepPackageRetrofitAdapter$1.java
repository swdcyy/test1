package com.kwai.sdk.eve.internal.pack.api.TypeAdapterKt$keepPackageRetrofitAdapter$1;
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
import rn7.a;

public final class TypeAdapterKt$keepPackageRetrofitAdapter$1 implements b	// class@001591
{
    public static final TypeAdapterKt$keepPackageRetrofitAdapter$1 a;

    static {
       TypeAdapterKt$keepPackageRetrofitAdapter$1.a = new TypeAdapterKt$keepPackageRetrofitAdapter$1();
    }
    public void TypeAdapterKt$keepPackageRetrofitAdapter$1(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       int i;
       a uoa = PatchProxy.applyThreeRefs(p0, p1, p2, this, TypeAdapterKt$keepPackageRetrofitAdapter$1.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          try{
             a uoa1 = new a(p2.c(p0, a.class), 0, null, null, 0, 0);
          }catch(java.lang.Exception e0){
             i = 0;
          }
          uoa = i;
       }
       return uoa;
    }
}
