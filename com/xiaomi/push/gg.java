package com.xiaomi.push.gg;
import java.lang.Exception;
import java.lang.String;
import java.lang.Throwable;
import ws8.r5;
import com.xiaomi.push.f;
import java.lang.System;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.lang.StringBuilder;
import java.lang.Object;

public class gg extends Exception	// class@00110b
{
    public f a;
    public Throwable a;
    public r5 a;

    public void gg(){
       super();
       this.a = null;
       this.a = null;
       this.a = null;
    }
    public void gg(String p0){
       super(p0);
       this.a = null;
       this.a = null;
       this.a = null;
    }
    public void gg(String p0,Throwable p1){
       super(p0);
       this.a = null;
       this.a = null;
       this.a = null;
       this.a = p1;
    }
    public void gg(Throwable p0){
       super();
       this.a = null;
       this.a = null;
       this.a = null;
       this.a = p0;
    }
    public void gg(r5 p0){
       super();
       this.a = null;
       this.a = null;
       this.a = null;
       this.a = p0;
    }
    public Throwable a(){
       return this.a;
    }
    public String getMessage(){
       gg ta;
       String message = super.getMessage();
       if (message == null) {
          ta = this.a;
          if (ta != null) {
             return ta.toString();
          }
       }
       if (message == null) {
          ta = this.a;
          if (ta != null) {
             message = ta.toString();
          }
       }
       return message;
    }
    public void printStackTrace(){
       this.printStackTrace(System.err);
    }
    public void printStackTrace(PrintStream p0){
       super.printStackTrace(p0);
       if (this.a != null) {
          p0.println("Nested Exception: ");
          this.a.printStackTrace(p0);
       }
       return;
    }
    public void printStackTrace(PrintWriter p0){
       super.printStackTrace(p0);
       if (this.a != null) {
          p0.println("Nested Exception: ");
          this.a.printStackTrace(p0);
       }
       return;
    }
    public String toString(){
       StringBuilder str = "";
       String message = super.getMessage();
       if (message != null) {
          str = str+message+": ";
       }
       gg ta = this.a;
       if (ta != null) {
          str = str+ta;
       }
       ta = this.a;
       if (ta != null) {
          str = str+ta;
       }
       if (this.a != null) {
          str = str+"\n  -- caused by: "+this.a;
       }
       return str;
    }
}
