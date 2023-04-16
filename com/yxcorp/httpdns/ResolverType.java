package com.yxcorp.httpdns.ResolverType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ResolverType extends Enum	// class@0019fe
{
    public final String mValue;
    public static final ResolverType[] $VALUES;
    public static final ResolverType HTTP;
    public static final ResolverType LOCAL;
    public static final ResolverType LOCAL_AND_HTTP;

    static {
       ResolverType resolverType = new ResolverType("LOCAL", 0, "local");
       ResolverType.LOCAL = resolverType;
       ResolverType resolverType1 = new ResolverType("HTTP", 1, "http");
       ResolverType.HTTP = resolverType1;
       ResolverType resolverType2 = new ResolverType("LOCAL_AND_HTTP", 2, "local|http");
       ResolverType.LOCAL_AND_HTTP = resolverType2;
       ResolverType[] resolverType3 = new ResolverType[]{resolverType,resolverType1,resolverType2};
       ResolverType.$VALUES = resolverType3;
    }
    public void ResolverType(String p0,int p1,String p2){
       super(p0, p1);
       this.mValue = p2;
    }
    public static ResolverType valueOf(String p0){
       return Enum.valueOf(ResolverType.class, p0);
    }
    public static ResolverType[] values(){
       return ResolverType.$VALUES.clone();
    }
}
