package com.google.android.flexbox.a$c;
import java.lang.Comparable;
import java.lang.Object;
import com.google.android.flexbox.a$a;
import java.lang.String;
import java.lang.StringBuilder;

public class a$c implements Comparable	// class@001609
{
    public int b;
    public int c;

    public void a$c(){
       super();
    }
    public void a$c(a$a p0){
       super();
    }
    public int a(a$c p0){
       a$c tc = this.c;
       a$c c = p0.c;
       if (tc != c) {
          return (tc - c);
       }
       return (this.b - p0.b);
    }
    public int compareTo(Object p0){
       return this.a(p0);
    }
    public String toString(){
       return "Order{order="+this.c+", index="+this.b+'}';
    }
}
