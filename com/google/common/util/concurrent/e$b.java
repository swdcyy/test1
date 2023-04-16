package com.google.common.util.concurrent.e$b;
import com.google.common.util.concurrent.e;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public class e$b extends e	// class@001938
{
    public final Object c;
    public static final e$b d;

    static {
       e$b.d = new e$b(null);
    }
    public void e$b(Object p0){
       super();
       this.c = p0;
    }
    public Object get(){
       return this.c;
    }
    public String toString(){
       return super.toString()+"[status=SUCCESS, result=["+this.c+"]]";
    }
}
