package com.yxcorp.gifshow.util.MarkDown;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class MarkDown	// class@001ef9
{
    public final String content;

    public void MarkDown(String p0){
       a.p(p0, "content");
       super();
       this.content = p0;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof MarkDown && a.g(this.content, p0.content))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       MarkDown tcontent = this.content;
       int i = (tcontent != null)? tcontent.hashCode(): 0;
       return i;
    }
    public String toString(){
       return "MarkDown\(content="+this.content+"\)";
    }
}
