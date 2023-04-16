package com.kuaishou.edit.draft.Cover$ParameterCase;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class Cover$ParameterCase extends Enum implements Internal$EnumLite	// class@001757
{
    public final int value;
    public static final Cover$ParameterCase[] $VALUES;
    public static final Cover$ParameterCase IMPORT_COVER_PARAM;
    public static final Cover$ParameterCase PARAMETER_NOT_SET;
    public static final Cover$ParameterCase PICTURE_COVER_PARAM;
    public static final Cover$ParameterCase VIDEO_COVER_PARAM;

    static {
       Cover$ParameterCase parameterCas = new Cover$ParameterCase("VIDEO_COVER_PARAM", 0, 16);
       Cover$ParameterCase.VIDEO_COVER_PARAM = parameterCas;
       Cover$ParameterCase parameterCas1 = new Cover$ParameterCase("PICTURE_COVER_PARAM", 1, 17);
       Cover$ParameterCase.PICTURE_COVER_PARAM = parameterCas1;
       Cover$ParameterCase parameterCas2 = new Cover$ParameterCase("IMPORT_COVER_PARAM", 2, 18);
       Cover$ParameterCase.IMPORT_COVER_PARAM = parameterCas2;
       Cover$ParameterCase parameterCas3 = new Cover$ParameterCase("PARAMETER_NOT_SET", 3, 0);
       Cover$ParameterCase.PARAMETER_NOT_SET = parameterCas3;
       Cover$ParameterCase[] parameterCas4 = new Cover$ParameterCase[]{parameterCas,parameterCas1,parameterCas2,parameterCas3};
       Cover$ParameterCase.$VALUES = parameterCas4;
    }
    public void Cover$ParameterCase(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static Cover$ParameterCase forNumber(int p0){
       if (!p0) {
          return Cover$ParameterCase.PARAMETER_NOT_SET;
       }
       switch (p0){
           case 16:
             return Cover$ParameterCase.VIDEO_COVER_PARAM;
           case 17:
             return Cover$ParameterCase.PICTURE_COVER_PARAM;
           case 18:
             return Cover$ParameterCase.IMPORT_COVER_PARAM;
           default:
             return null;
       }
    }
    public static Cover$ParameterCase valueOf(int p0){
       return Cover$ParameterCase.forNumber(p0);
    }
    public static Cover$ParameterCase valueOf(String p0){
       return Enum.valueOf(Cover$ParameterCase.class, p0);
    }
    public static Cover$ParameterCase[] values(){
       return Cover$ParameterCase.$VALUES.clone();
    }
    public int getNumber(){
       return this.value;
    }
}
