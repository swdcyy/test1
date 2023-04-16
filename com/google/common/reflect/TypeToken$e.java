package com.google.common.reflect.TypeToken$e;
import java.lang.reflect.Type;
import java.lang.Object;
import com.google.common.reflect.TypeToken;

public class TypeToken$e	// class@0018fa
{
    public final Type[] a;
    public final boolean b;

    public void TypeToken$e(Type[] p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public boolean a(Type p0){
       TypeToken$e tb;
       TypeToken$e ta = this.a;
       int len = ta.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return (this.b ^ 0x01);
          }
          tb = this.b;
          if (TypeToken.of(ta[i]).isSubtypeOf(p0) == tb) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return tb;
    }
    public boolean b(Type p0){
       TypeToken$e tb;
       TypeToken typeToken = TypeToken.of(p0);
       TypeToken$e ta = this.a;
       int len = ta.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return (this.b ^ 0x01);
          }
          tb = this.b;
          if (typeToken.isSubtypeOf(ta[i]) == tb) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return tb;
    }
}
