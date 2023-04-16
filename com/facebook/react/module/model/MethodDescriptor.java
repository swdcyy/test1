package com.facebook.react.module.model.MethodDescriptor;
import java.lang.Object;
import java.lang.String;
import com.facebook.react.module.model.MethodDescriptor$MethodValueKind;
import java.lang.StringBuilder;
import java.lang.Enum;

public class MethodDescriptor	// class@00126b
{
    public int argCount;
    public String name;
    public MethodDescriptor$MethodValueKind retKind;
    public String signature;

    public void MethodDescriptor(){
       super();
    }
    public void MethodDescriptor(String p0,int p1,int p2,String p3){
       super();
       this.name = p0;
       this.argCount = p1;
       this.retKind = MethodDescriptor$MethodValueKind.values()[p2];
       this.signature = p3;
    }
    public String a(){
       return this.name+":"+this.signature+":"+this.retKind.name();
    }
}
