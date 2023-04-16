package com.eve.tools.EnumTypeAdapter;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.google.gson.Gson;
import java.lang.Enum;
import java.lang.reflect.Field;
import na.a;
import java.lang.annotation.Annotation;
import java.lang.AssertionError;
import com.google.gson.stream.a;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.b;

public final class EnumTypeAdapter extends TypeAdapter	// class@001024
{
    public final Enum a;
    public final TypeAdapter b;
    public final Class c;

    public void EnumTypeAdapter(Class p0){
       object oobject;
       a.p(p0, "classOfT");
       super();
       this.c = p0;
       TypeAdapter typeAdapter = new Gson().k(p0);
       try{
          this.b = typeAdapter;
          Object[] enumConstant = p0.getEnumConstants();
          a.o(enumConstant, "classOfT.enumConstants");
          int len = enumConstant.length;
          int i = 0;
          while (true) {
             if (i < len) {
                oobject = enumConstant[i];
                object oobject1 = (this.c.getField(oobject.name()).getAnnotation(a.class) != null)? 1: null;
                if (oobject1) {
                   break ;
                }else {
                   i = i + 1;
                }
             }else {
                oobject = null;
                break ;
             }
          }
          this.a = oobject;
          return;
       }catch(java.lang.NoSuchFieldException e7){
          throw new AssertionError(e7);
       }
    }
    public Object read(a p0){
       Enum uEnum = PatchProxy.applyOneRefs(p0, this, EnumTypeAdapter.class, "1");
       if (uEnum != PatchProxyResult.class) {
       }else {
          a.p(p0, "in");
          Enum uEnum1 = this.b.read(p0);
          if (uEnum1 == null) {
             uEnum1 = this.a;
          }
          uEnum = uEnum1;
       }
       return uEnum;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EnumTypeAdapter.class, "2")) {
       }else {
          a.p(p0, "out");
          this.b.write(p0, p1);
       }
       return;
    }
}
