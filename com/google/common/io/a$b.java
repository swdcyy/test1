package com.google.common.io.a$b;
import com.google.common.io.b;
import com.google.common.io.a;
import java.nio.charset.Charset;
import com.google.common.io.a$a;
import java.lang.Object;
import ok.n;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.lang.String;
import java.lang.StringBuilder;

public final class a$b extends b	// class@0018e4
{
    public final Charset a;
    public final a b;

    public void a$b(a p0,Charset p1,a$a p2){
       this.b = p0;
       super();
       n.j(p1);
       this.a = p1;
    }
    public Writer a(){
       return new OutputStreamWriter(this.b.a(), this.a);
    }
    public String toString(){
       return this.b.toString()+".asCharSink\("+this.a+"\)";
    }
}
