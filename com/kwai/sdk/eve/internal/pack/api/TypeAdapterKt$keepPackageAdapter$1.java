package com.kwai.sdk.eve.internal.pack.api.TypeAdapterKt$keepPackageAdapter$1;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import v97.b;
import rn7.a;
import v97.b$a;

public final class TypeAdapterKt$keepPackageAdapter$1 implements b	// class@001590
{
    public static final TypeAdapterKt$keepPackageAdapter$1 a;

    static {
       TypeAdapterKt$keepPackageAdapter$1.a = new TypeAdapterKt$keepPackageAdapter$1();
    }
    public void TypeAdapterKt$keepPackageAdapter$1(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       b uob = PatchProxy.applyThreeRefs(p0, p1, p2, this, TypeAdapterKt$keepPackageAdapter$1.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          String str = null;
          try{
             uob = b$a.a(b.b, p2.c(p0, a.class), str, 2, str);
          }catch(java.lang.Exception e0){
          }
       }
       return uob;
    }
}
