package com.google.common.reflect.c$c;
import java.lang.Object;
import com.google.common.collect.ImmutableMap;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.Type;
import com.google.common.reflect.c$d;
import com.google.common.reflect.c;
import com.google.common.reflect.c$a;
import com.google.common.reflect.Types$c;
import java.util.Arrays;
import java.lang.reflect.GenericDeclaration;
import java.lang.String;
import com.google.common.reflect.Types;

public class c$c	// class@00191a
{
    public final ImmutableMap a;

    public void c$c(){
       super();
       this.a = ImmutableMap.of();
    }
    public void c$c(ImmutableMap p0){
       super();
       this.a = p0;
    }
    public Type a(TypeVariable p0,c$c p1){
       Type type = this.a.get(new c$d(p0));
       c$a uoa = null;
       if (type != null) {
          return new c(p1, uoa).b(type);
       }
       Type[] bounds = p0.getBounds();
       if (!bounds.length) {
          return p0;
       }
       Type[] typeArray = new c(p1, uoa).c(bounds);
       if (Types$c.a && Arrays.equals(bounds, typeArray)) {
          return p0;
       }
       return Types.e(p0.getGenericDeclaration(), p0.getName(), typeArray);
    }
}
