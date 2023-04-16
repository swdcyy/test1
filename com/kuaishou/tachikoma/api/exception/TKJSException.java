package com.kuaishou.tachikoma.api.exception.TKJSException;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.util.List;
import java.util.ArrayList;
import java.lang.StackTraceElement;

public abstract class TKJSException extends RuntimeException	// class@000f82
{
    public final int endColumn;
    public final String fileName;
    public final String jsMessage;
    public final String jsStackTrace;
    public final int lineNumber;
    public final String sourceLine;
    public final int startColumn;

    public void TKJSException(String p0,int p1,String p2,String p3,int p4,int p5,String p6,Throwable p7){
       super();
       this.fileName = p0;
       this.lineNumber = p1;
       this.jsMessage = p2;
       this.sourceLine = p3;
       this.startColumn = p4;
       this.endColumn = p5;
       this.jsStackTrace = p6;
       if (p7 != null) {
          this.initCause(p7);
       }
       return;
    }
    public final char[] a(int p0,char p1){
       char[] uocharArray = new char[p0];
       for (int i = 0; i < p0; i = i + 1) {
          uocharArray[i] = p1;
       }
       return uocharArray;
    }
    public final String b(){
       Object obj = PatchProxy.apply(null, this, TKJSException.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.jsMessage+"\n"+this.fileName+":"+this.lineNumber+":"+(this.startColumn + 1);
    }
    public String getFileName(){
       return this.fileName;
    }
    public String getJsMessage(){
       return this.jsMessage;
    }
    public String getJsStackTrace(){
       return this.jsStackTrace;
    }
    public String getMessage(){
       Object obj = PatchProxy.apply(null, this, TKJSException.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b();
    }
    public List getStackTraceList(){
       ArrayList obj = PatchProxy.apply(null, this, TKJSException.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       StackTraceElement[] stackTrace = this.getStackTrace();
       if (stackTrace != null && stackTrace.length >= 1) {
          int len = stackTrace.length;
          for (int i = 0; i < len; i = i + 1) {
             obj.add(stackTrace[i].toString());
          }
       }
       return obj;
    }
    public String toString(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       StringBuilder obj = PatchProxy.apply(objArray, this, TKJSException.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.b();
       StringBuilder str = PatchProxy.apply(objArray, this, TKJSException.class, "5");
       if (str != patchProxyRe) {
       }else {
          str = "";
          TKJSException tsourceLine = this.sourceLine;
          if (tsourceLine != null && (!tsourceLine.isEmpty() && (this.sourceLine).length() <= 350)) {
             str = str+10+this.sourceLine+10;
             tsourceLine = this.startColumn;
             if (tsourceLine >= null) {
                str = str+this.a(tsourceLine, ' ')+this.a((this.endColumn - this.startColumn), '^');
             }
          }
          str = str;
       }
       obj = obj+str;
       String str1 = PatchProxy.apply(objArray, this, TKJSException.class, "4");
       if (str1 != patchProxyRe) {
       }else if(this.jsStackTrace != null){
          str1 = "\n"+this.jsStackTrace;
       }else {
          str1 = "";
       }
       return obj+str1+"\n"+this.getClass().getName();
    }
}
