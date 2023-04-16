package com.google.common.collect.Maps$EntryFunction;
import ok.h;
import java.lang.Enum;
import com.google.common.collect.Maps$EntryFunction$1;
import java.lang.String;
import com.google.common.collect.Maps$EntryFunction$2;
import com.google.common.collect.Maps$a;
import java.lang.Class;
import java.lang.Object;

public abstract class Maps$EntryFunction extends Enum implements h	// class@00183d
{
    public static final Maps$EntryFunction[] $VALUES;
    public static final Maps$EntryFunction KEY;
    public static final Maps$EntryFunction VALUE;

    static {
       Maps$EntryFunction$1 uEntryFuncti = new Maps$EntryFunction$1("KEY", 0);
       Maps$EntryFunction.KEY = uEntryFuncti;
       Maps$EntryFunction$2 uEntryFuncti1 = new Maps$EntryFunction$2("VALUE", 1);
       Maps$EntryFunction.VALUE = uEntryFuncti1;
       Maps$EntryFunction[] uEntryFuncti2 = new Maps$EntryFunction[]{uEntryFuncti,uEntryFuncti1};
       Maps$EntryFunction.$VALUES = uEntryFuncti2;
    }
    public void Maps$EntryFunction(String p0,int p1){
       super(p0, p1);
    }
    public void Maps$EntryFunction(String p0,int p1,Maps$a p2){
       super(p0, p1);
    }
    public static Maps$EntryFunction valueOf(String p0){
       return Enum.valueOf(Maps$EntryFunction.class, p0);
    }
    public static Maps$EntryFunction[] values(){
       return Maps$EntryFunction.$VALUES.clone();
    }
}
