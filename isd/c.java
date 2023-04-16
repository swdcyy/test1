package isd.c;
import java.lang.System;
import java.lang.Byte;
import java.lang.Object;
import java.io.PrintStream;
import java.lang.Short;
import java.lang.String;
import isd.m;
import kotlin.jvm.internal.a;
import java.nio.charset.Charset;
import java.io.InputStream;

public final class c	// class@001502
{

    public static final void a(byte p0){
       System.out.print(Byte.valueOf(p0));
    }
    public static final void b(char p0){
       System.out.print(p0);
    }
    public static final void c(double p0){
       System.out.print(p0);
    }
    public static final void d(float p0){
       System.out.print(p0);
    }
    public static final void e(int p0){
       System.out.print(p0);
    }
    public static final void f(long p0){
       System.out.print(p0);
    }
    public static final void g(Object p0){
       System.out.print(p0);
    }
    public static final void h(short p0){
       System.out.print(Short.valueOf(p0));
    }
    public static final void i(boolean p0){
       System.out.print(p0);
    }
    public static final void j(char[] p0){
       System.out.print(p0);
    }
    public static final void k(){
       System.out.println();
    }
    public static final void l(byte p0){
       System.out.println(Byte.valueOf(p0));
    }
    public static final void m(char p0){
       System.out.println(p0);
    }
    public static final void n(double p0){
       System.out.println(p0);
    }
    public static final void o(float p0){
       System.out.println(p0);
    }
    public static final void p(int p0){
       System.out.println(p0);
    }
    public static final void q(long p0){
       System.out.println(p0);
    }
    public static final void r(Object p0){
       System.out.println(p0);
    }
    public static final void s(short p0){
       System.out.println(Short.valueOf(p0));
    }
    public static final void t(boolean p0){
       System.out.println(p0);
    }
    public static final void u(char[] p0){
       System.out.println(p0);
    }
    public static final String v(){
       InputStream in = System.in;
       a.o(in, "System.`in`");
       Charset uCharset = Charset.defaultCharset();
       a.o(uCharset, "Charset.defaultCharset\(\)");
       return m.h.f(in, uCharset);
    }
}
