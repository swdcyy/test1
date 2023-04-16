package com.kuaishou.edit.draft.EffectSource;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kuaishou.edit.draft.EffectSource$a;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kuaishou.edit.draft.EffectSource$b;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class EffectSource extends Enum implements Internal$EnumLite	// class@00177e
{
    public final int value;
    public static final EffectSource[] $VALUES;
    public static final EffectSource EDITOR_BY_USER;
    public static final EffectSource PIC_TEMPLATE;
    public static final EffectSource UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       EffectSource uEffectSourc = new EffectSource("EDITOR_BY_USER", 0, 0);
       EffectSource.EDITOR_BY_USER = uEffectSourc;
       EffectSource uEffectSourc1 = new EffectSource("PIC_TEMPLATE", 1, 1);
       EffectSource.PIC_TEMPLATE = uEffectSourc1;
       EffectSource uEffectSourc2 = new EffectSource("UNRECOGNIZED", 2, -1);
       EffectSource.UNRECOGNIZED = uEffectSourc2;
       EffectSource[] uEffectSourc3 = new EffectSource[]{uEffectSourc,uEffectSourc1,uEffectSourc2};
       EffectSource.$VALUES = uEffectSourc3;
       EffectSource.internalValueMap = new EffectSource$a();
    }
    public void EffectSource(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static EffectSource forNumber(int p0){
       if (!p0) {
          return EffectSource.EDITOR_BY_USER;
       }
       if (p0 != 1) {
          return null;
       }
       return EffectSource.PIC_TEMPLATE;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return EffectSource.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return EffectSource$b.a;
    }
    public static EffectSource valueOf(int p0){
       return EffectSource.forNumber(p0);
    }
    public static EffectSource valueOf(String p0){
       return Enum.valueOf(EffectSource.class, p0);
    }
    public static EffectSource[] values(){
       return EffectSource.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != EffectSource.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
