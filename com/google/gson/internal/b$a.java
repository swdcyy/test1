package com.google.gson.internal.b$a;
import java.io.Writer;
import java.lang.Appendable;
import com.google.gson.internal.b$a$a;
import java.lang.CharSequence;

public final class b$a extends Writer	// class@001953
{
    public final Appendable b;
    public final b$a$a c;

    public void b$a(Appendable p0){
       super();
       this.c = new b$a$a();
       this.b = p0;
    }
    public void close(){
    }
    public void flush(){
    }
    public void write(int p0){
       this.b.append((char)p0);
    }
    public void write(char[] p0,int p1,int p2){
       b$a tc = this.c;
       tc.b = p0;
       this.b.append(tc, p1, (p2 + p1));
    }
}
