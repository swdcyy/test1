package kshark.lite.PrimitiveType;
import java.lang.Enum;
import java.lang.String;
import kshark.lite.PrimitiveType$a;
import nsd.u;
import java.util.ArrayList;
import java.lang.Integer;
import java.lang.Object;
import kotlin.Pair;
import qrd.r0;
import java.util.Collection;
import java.lang.Iterable;
import java.util.Map;
import trd.t0;
import java.lang.Class;

public final class PrimitiveType extends Enum	// class@001bb7
{
    public final int byteSize;
    public final int hprofType;
    public static final PrimitiveType[] $VALUES;
    public static final PrimitiveType BOOLEAN;
    public static final PrimitiveType BYTE;
    public static final PrimitiveType CHAR;
    public static final PrimitiveType$a Companion;
    public static final PrimitiveType DOUBLE;
    public static final PrimitiveType FLOAT;
    public static final PrimitiveType INT;
    public static final PrimitiveType LONG;
    public static final PrimitiveType SHORT;
    public static final Map byteSizeByHprofType;
    public static final Map primitiveTypeByHprofType;

    static {
       PrimitiveType primitiveTyp1;
       PrimitiveType[] primitiveTyp = new PrimitiveType[]{primitiveTyp1,primitiveTyp1,primitiveTyp1,primitiveTyp1,primitiveTyp1,primitiveTyp1,primitiveTyp1,primitiveTyp1};
       int i = 0;
       primitiveTyp1 = new PrimitiveType("BOOLEAN", i, 4, 1);
       PrimitiveType.BOOLEAN = primitiveTyp1;
       primitiveTyp1 = new PrimitiveType("CHAR", 1, 5, 2);
       PrimitiveType.CHAR = primitiveTyp1;
       primitiveTyp1 = new PrimitiveType("FLOAT", 2, 6, 4);
       PrimitiveType.FLOAT = primitiveTyp1;
       primitiveTyp1 = new PrimitiveType("DOUBLE", 3, 7, 8);
       PrimitiveType.DOUBLE = primitiveTyp1;
       primitiveTyp1 = new PrimitiveType("BYTE", 4, 8, 1);
       PrimitiveType.BYTE = primitiveTyp1;
       primitiveTyp1 = new PrimitiveType("SHORT", 5, 9, 2);
       PrimitiveType.SHORT = primitiveTyp1;
       primitiveTyp1 = new PrimitiveType("INT", 6, 10, 4);
       PrimitiveType.INT = primitiveTyp1;
       primitiveTyp1 = new PrimitiveType("LONG", 7, 11, 8);
       PrimitiveType.LONG = primitiveTyp1;
       PrimitiveType.$VALUES = primitiveTyp;
       PrimitiveType.Companion = new PrimitiveType$a(null);
       PrimitiveType[] primitiveTyp2 = PrimitiveType.values();
       ArrayList uArrayList = new ArrayList(primitiveTyp2.length);
       int len = primitiveTyp2.length;
       for (int i1 = 0; i1 < len; i1 = i1 + 1) {
          object oobject = primitiveTyp2[i1];
          uArrayList.add(r0.a(Integer.valueOf(oobject.hprofType), Integer.valueOf(oobject.byteSize)));
       }
       PrimitiveType.byteSizeByHprofType = t0.B0(uArrayList);
       primitiveTyp2 = PrimitiveType.values();
       uArrayList = new ArrayList(primitiveTyp2.length);
       len = primitiveTyp2.length;
       for (; i < len; i = i + 1) {
          object oobject1 = primitiveTyp2[i];
          uArrayList.add(r0.a(Integer.valueOf(oobject1.hprofType), oobject1));
       }
       PrimitiveType.primitiveTypeByHprofType = t0.B0(uArrayList);
    }
    public void PrimitiveType(String p0,int p1,int p2,int p3){
       super(p0, p1);
       this.hprofType = p2;
       this.byteSize = p3;
    }
    public static PrimitiveType valueOf(String p0){
       return Enum.valueOf(PrimitiveType.class, p0);
    }
    public static PrimitiveType[] values(){
       return PrimitiveType.$VALUES.clone();
    }
    public final int getByteSize(){
       return this.byteSize;
    }
    public final int getHprofType(){
       return this.hprofType;
    }
}
