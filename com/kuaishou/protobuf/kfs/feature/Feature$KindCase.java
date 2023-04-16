package com.kuaishou.protobuf.kfs.feature.Feature$KindCase;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class Feature$KindCase extends Enum	// class@000bed
{
    public final int value;
    public static final Feature$KindCase[] $VALUES;
    public static final Feature$KindCase BYTES_LIST;
    public static final Feature$KindCase FLOAT_LIST;
    public static final Feature$KindCase INT64_LIST;
    public static final Feature$KindCase KIND_NOT_SET;

    static {
       Feature$KindCase kindCase = new Feature$KindCase("BYTES_LIST", 0, 1);
       Feature$KindCase.BYTES_LIST = kindCase;
       Feature$KindCase kindCase1 = new Feature$KindCase("FLOAT_LIST", 1, 2);
       Feature$KindCase.FLOAT_LIST = kindCase1;
       Feature$KindCase kindCase2 = new Feature$KindCase("INT64_LIST", 2, 3);
       Feature$KindCase.INT64_LIST = kindCase2;
       Feature$KindCase kindCase3 = new Feature$KindCase("KIND_NOT_SET", 3, 0);
       Feature$KindCase.KIND_NOT_SET = kindCase3;
       Feature$KindCase[] kindCaseArra = new Feature$KindCase[]{kindCase,kindCase1,kindCase2,kindCase3};
       Feature$KindCase.$VALUES = kindCaseArra;
    }
    public void Feature$KindCase(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static Feature$KindCase forNumber(int p0){
       if (!p0) {
          return Feature$KindCase.KIND_NOT_SET;
       }
       if (p0 == 1) {
          return Feature$KindCase.BYTES_LIST;
       }
       if (p0 == 2) {
          return Feature$KindCase.FLOAT_LIST;
       }
       if (p0 != 3) {
          return null;
       }
       return Feature$KindCase.INT64_LIST;
    }
    public static Feature$KindCase valueOf(int p0){
       return Feature$KindCase.forNumber(p0);
    }
    public static Feature$KindCase valueOf(String p0){
       return Enum.valueOf(Feature$KindCase.class, p0);
    }
    public static Feature$KindCase[] values(){
       return Feature$KindCase.$VALUES.clone();
    }
    public int getNumber(){
       return this.value;
    }
}
