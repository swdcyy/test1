package com.google.common.reflect.d;
import com.google.common.reflect.c$c;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.Type;
import java.lang.reflect.GenericDeclaration;
import java.lang.Object;

public class d extends c$c	// class@00191e
{
    public final TypeVariable b;
    public final c$c c;
    public final c$c d;

    public void d(c$c p0,TypeVariable p1,c$c p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public Type a(TypeVariable p0,c$c p1){
       if (p0.getGenericDeclaration().equals(this.b.getGenericDeclaration())) {
          return p0;
       }
       return this.c.a(p0, p1);
    }
}
