package com.kuaishou.android.vader.type.Operator;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class Operator extends Enum	// class@000f84
{
    public static final Operator[] $VALUES;
    public static final Operator eq;
    public static final Operator noop;
    public static final Operator regex;

    static {
       Operator operator = new Operator("eq", 0);
       Operator.eq = operator;
       Operator operator1 = new Operator("regex", 1);
       Operator.regex = operator1;
       Operator operator2 = new Operator("noop", 2);
       Operator.noop = operator2;
       Operator[] operatorArra = new Operator[]{operator,operator1,operator2};
       Operator.$VALUES = operatorArra;
    }
    public void Operator(String p0,int p1){
       super(p0, p1);
    }
    public static Operator valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Operator.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(Operator.class, p0);
    }
    public static Operator[] values(){
       Object obj = PatchProxy.apply(null, null, Operator.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Operator.$VALUES.clone();
    }
}
