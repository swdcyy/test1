package com.eclipsesource.v8.debug.mirror.Scope$ScopeType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class Scope$ScopeType extends Enum	// class@001008
{
    public int index;
    public static final Scope$ScopeType[] $VALUES;
    public static final Scope$ScopeType Block;
    public static final Scope$ScopeType Catch;
    public static final Scope$ScopeType Closure;
    public static final Scope$ScopeType Global;
    public static final Scope$ScopeType Local;
    public static final Scope$ScopeType Script;
    public static final Scope$ScopeType With;

    static {
       Scope$ScopeType scopeType = new Scope$ScopeType("Global", 0, 0);
       Scope$ScopeType.Global = scopeType;
       Scope$ScopeType scopeType1 = new Scope$ScopeType("Local", 1, 1);
       Scope$ScopeType.Local = scopeType1;
       Scope$ScopeType scopeType2 = new Scope$ScopeType("With", 2, 2);
       Scope$ScopeType.With = scopeType2;
       Scope$ScopeType scopeType3 = new Scope$ScopeType("Closure", 3, 3);
       Scope$ScopeType.Closure = scopeType3;
       Scope$ScopeType scopeType4 = new Scope$ScopeType("Catch", 4, 4);
       Scope$ScopeType.Catch = scopeType4;
       Scope$ScopeType scopeType5 = new Scope$ScopeType("Block", 5, 5);
       Scope$ScopeType.Block = scopeType5;
       Scope$ScopeType scopeType6 = new Scope$ScopeType("Script", 6, 6);
       Scope$ScopeType.Script = scopeType6;
       Scope$ScopeType[] scopeTypeArr = new Scope$ScopeType[]{scopeType,scopeType1,scopeType2,scopeType3,scopeType4,scopeType5,scopeType6};
       Scope$ScopeType.$VALUES = scopeTypeArr;
    }
    public void Scope$ScopeType(String p0,int p1,int p2){
       super(p0, p1);
       this.index = p2;
    }
    public static Scope$ScopeType valueOf(String p0){
       return Enum.valueOf(Scope$ScopeType.class, p0);
    }
    public static Scope$ScopeType[] values(){
       return Scope$ScopeType.$VALUES.clone();
    }
}
