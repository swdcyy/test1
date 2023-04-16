package com.kwai.logger.upload.internal.f$b;
import java.lang.reflect.ParameterizedType;
import com.kwai.logger.upload.internal.f;
import java.lang.Class;
import java.lang.reflect.Type;
import java.lang.Object;

public class f$b implements ParameterizedType	// class@000ed0
{
    public final Class b;
    public final Type[] c;
    public final f d;

    public void f$b(f p0,Class p1,Type[] p2){
       this.d = p0;
       super();
       this.b = p1;
       this.c = p2;
    }
    public Type[] getActualTypeArguments(){
       return this.c;
    }
    public Type getOwnerType(){
       return null;
    }
    public Type getRawType(){
       return this.b;
    }
}
