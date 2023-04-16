package com.kwai.framework.debuglog.RetrieveType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class RetrieveType extends Enum	// class@001510
{
    public String type;
    public static final RetrieveType[] $VALUES;
    public static final RetrieveType BASE;
    public static final RetrieveType FILE;
    public static final RetrieveType LIB;
    public static final RetrieveType OAT;
    public static final RetrieveType TREE;

    static {
       RetrieveType retrieveType = new RetrieveType("OAT", 0, "oat");
       RetrieveType.OAT = retrieveType;
       RetrieveType retrieveType1 = new RetrieveType("LIB", 1, "lib");
       RetrieveType.LIB = retrieveType1;
       RetrieveType retrieveType2 = new RetrieveType("BASE", 2, "base");
       RetrieveType.BASE = retrieveType2;
       RetrieveType retrieveType3 = new RetrieveType("TREE", 3, "tree");
       RetrieveType.TREE = retrieveType3;
       RetrieveType retrieveType4 = new RetrieveType("FILE", 4, "file");
       RetrieveType.FILE = retrieveType4;
       RetrieveType[] retrieveType5 = new RetrieveType[]{retrieveType,retrieveType1,retrieveType2,retrieveType3,retrieveType4};
       RetrieveType.$VALUES = retrieveType5;
    }
    public void RetrieveType(String p0,int p1,String p2){
       super(p0, p1);
       this.type = p2;
    }
    public static RetrieveType toEnum(String p0){
       object oobject;
       RetrieveType[] obj = PatchProxy.applyOneRefs(p0, null, RetrieveType.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = RetrieveType.values();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return null;
          }
          oobject = obj[i];
          if ((oobject.getType()).equals(p0)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public static RetrieveType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RetrieveType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(RetrieveType.class, p0);
    }
    public static RetrieveType[] values(){
       Object obj = PatchProxy.apply(null, null, RetrieveType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RetrieveType.$VALUES.clone();
    }
    public String getType(){
       return this.type;
    }
}
