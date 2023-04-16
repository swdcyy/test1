package com.facebook.react.module.model.MethodDescriptor$MethodValueKind;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class MethodDescriptor$MethodValueKind extends Enum	// class@00126a
{
    public static final MethodDescriptor$MethodValueKind[] $VALUES;
    public static final MethodDescriptor$MethodValueKind ArrayKind;
    public static final MethodDescriptor$MethodValueKind BooleanKind;
    public static final MethodDescriptor$MethodValueKind FunctionKind;
    public static final MethodDescriptor$MethodValueKind NumberKind;
    public static final MethodDescriptor$MethodValueKind ObjectKind;
    public static final MethodDescriptor$MethodValueKind PromiseKind;
    public static final MethodDescriptor$MethodValueKind StringKind;
    public static final MethodDescriptor$MethodValueKind VoidKind;

    static {
       MethodDescriptor$MethodValueKind methodValueK = new MethodDescriptor$MethodValueKind("VoidKind", 0);
       MethodDescriptor$MethodValueKind.VoidKind = methodValueK;
       MethodDescriptor$MethodValueKind methodValueK1 = new MethodDescriptor$MethodValueKind("BooleanKind", 1);
       MethodDescriptor$MethodValueKind.BooleanKind = methodValueK1;
       MethodDescriptor$MethodValueKind methodValueK2 = new MethodDescriptor$MethodValueKind("NumberKind", 2);
       MethodDescriptor$MethodValueKind.NumberKind = methodValueK2;
       MethodDescriptor$MethodValueKind methodValueK3 = new MethodDescriptor$MethodValueKind("StringKind", 3);
       MethodDescriptor$MethodValueKind.StringKind = methodValueK3;
       MethodDescriptor$MethodValueKind methodValueK4 = new MethodDescriptor$MethodValueKind("ObjectKind", 4);
       MethodDescriptor$MethodValueKind.ObjectKind = methodValueK4;
       MethodDescriptor$MethodValueKind methodValueK5 = new MethodDescriptor$MethodValueKind("ArrayKind", 5);
       MethodDescriptor$MethodValueKind.ArrayKind = methodValueK5;
       MethodDescriptor$MethodValueKind methodValueK6 = new MethodDescriptor$MethodValueKind("FunctionKind", 6);
       MethodDescriptor$MethodValueKind.FunctionKind = methodValueK6;
       MethodDescriptor$MethodValueKind methodValueK7 = new MethodDescriptor$MethodValueKind("PromiseKind", 7);
       MethodDescriptor$MethodValueKind.PromiseKind = methodValueK7;
       MethodDescriptor$MethodValueKind[] methodValueK8 = new MethodDescriptor$MethodValueKind[]{methodValueK,methodValueK1,methodValueK2,methodValueK3,methodValueK4,methodValueK5,methodValueK6,methodValueK7};
       MethodDescriptor$MethodValueKind.$VALUES = methodValueK8;
    }
    public void MethodDescriptor$MethodValueKind(String p0,int p1){
       super(p0, p1);
    }
    public static MethodDescriptor$MethodValueKind valueOf(String p0){
       return Enum.valueOf(MethodDescriptor$MethodValueKind.class, p0);
    }
    public static MethodDescriptor$MethodValueKind[] values(){
       return MethodDescriptor$MethodValueKind.$VALUES.clone();
    }
}
