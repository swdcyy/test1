package com.tkruntime.v8.V8ScriptException;
import com.tkruntime.v8.V8RuntimeException;
import java.lang.String;
import java.lang.Throwable;
import java.lang.RuntimeException;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public abstract class V8ScriptException extends V8RuntimeException	// class@000fcb
{
    public final int endColumn;
    public final String fileName;
    public final String jsMessage;
    public final String jsStackTrace;
    public final int lineNumber;
    public final String sourceLine;
    public final int startColumn;

    public void V8ScriptException(String p0,int p1,String p2,String p3,int p4,int p5,String p6,Throwable p7){
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
    public final char[] createCharSequence(int p0,char p1){
       char[] uocharArray = new char[p0];
       for (int i = 0; i < p0; i = i + 1) {
          uocharArray[i] = p1;
       }
       return uocharArray;
    }
    public final String createJSStackDetails(){
       Object obj = PatchProxy.apply(null, this, V8ScriptException.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.jsStackTrace != null) {
          return "\n"+this.jsStackTrace;
       }
       return "";
    }
    public final String createMessageDetails(){
       StringBuilder obj = PatchProxy.apply(null, this, V8ScriptException.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       V8ScriptException tsourceLine = this.sourceLine;
       if (tsourceLine != null && !tsourceLine.isEmpty()) {
          obj = obj+10+this.sourceLine+10;
          tsourceLine = this.startColumn;
          if (tsourceLine >= null) {
             obj = obj+this.createCharSequence(tsourceLine, ' ')+this.createCharSequence((this.endColumn - this.startColumn), '^');
          }
       }
       return obj;
    }
    public final String createMessageLine(){
       Object obj = PatchProxy.apply(null, this, V8ScriptException.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.fileName+":"+this.lineNumber+": "+this.jsMessage;
    }
    public int getEndColumn(){
       return this.endColumn;
    }
    public String getFileName(){
       return this.fileName;
    }
    public String getJSMessage(){
       return this.jsMessage;
    }
    public String getJSStackTrace(){
       return this.jsStackTrace;
    }
    public int getLineNumber(){
       return this.lineNumber;
    }
    public String getMessage(){
       Object obj = PatchProxy.apply(null, this, V8ScriptException.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.createMessageLine();
    }
    public String getSourceLine(){
       return this.sourceLine;
    }
    public int getStartColumn(){
       return this.startColumn;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, V8ScriptException.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.createMessageLine()+this.createMessageDetails()+this.createJSStackDetails()+"\n"+this.getClass().getName();
    }
}
