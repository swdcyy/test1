package com.eclipsesource.v8.debug.mirror.SourceLocation;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;

public class SourceLocation	// class@00100a
{
    public final int column;
    public final int line;
    public final int position;
    public final String scriptName;
    public String sourceText;

    public void SourceLocation(String p0,int p1,int p2,int p3,String p4){
       super();
       this.scriptName = p0;
       this.position = p1;
       this.line = p2;
       this.column = p3;
       this.sourceText = p4;
    }
    public int getColumn(){
       return this.column;
    }
    public int getLine(){
       return this.line;
    }
    public int getPosition(){
       return this.position;
    }
    public String getScriptName(){
       return this.scriptName;
    }
    public String getSourceText(){
       return this.sourceText;
    }
    public String toString(){
       return this.scriptName+" : "+this.position+" : "+this.line+" : "+this.column+" : "+this.sourceText;
    }
}
