package org.apache.internal.commons.io.output.StringBuilderWriter;
import java.io.Serializable;
import java.io.Writer;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import java.lang.Appendable;
import java.lang.String;

public class StringBuilderWriter extends Writer implements Serializable	// class@00211e
{
    public final StringBuilder builder;

    public void StringBuilderWriter(){
       super();
       this.builder = "";
    }
    public void StringBuilderWriter(int p0){
       super();
       this.builder = new StringBuilder(p0);
    }
    public void StringBuilderWriter(StringBuilder p0){
       super();
       if (p0 != null) {
       }else {
          p0 = "";
       }
       this.builder = p0;
       return;
    }
    public Writer append(char p0){
       this.builder+p0;
       return this;
    }
    public Writer append(CharSequence p0){
       this.builder+p0;
       return this;
    }
    public Writer append(CharSequence p0,int p1,int p2){
       this.builder+p0;
       return this;
    }
    public Appendable append(char p0){
       this.append(p0);
       return this;
    }
    public Appendable append(CharSequence p0){
       this.append(p0);
       return this;
    }
    public Appendable append(CharSequence p0,int p1,int p2){
       this.append(p0, p1, p2);
       return this;
    }
    public void close(){
    }
    public void flush(){
    }
    public StringBuilder getBuilder(){
       return this.builder;
    }
    public String toString(){
       return this.builder;
    }
    public void write(String p0){
       if (p0 != null) {
          this.builder+p0;
       }
       return;
    }
    public void write(char[] p0,int p1,int p2){
       if (p0 != null) {
          this.builder+p0;
       }
       return;
    }
}
