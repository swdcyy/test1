package com.kwai.library.widget.textview.LabelsView$SelectType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class LabelsView$SelectType extends Enum	// class@000a55
{
    public int value;
    public static final LabelsView$SelectType[] $VALUES;
    public static final LabelsView$SelectType MULTI;
    public static final LabelsView$SelectType NONE;
    public static final LabelsView$SelectType SINGLE;
    public static final LabelsView$SelectType SINGLE_IRREVOCABLY;

    static {
       LabelsView$SelectType selectType = new LabelsView$SelectType("NONE", 0, 1);
       LabelsView$SelectType.NONE = selectType;
       LabelsView$SelectType selectType1 = new LabelsView$SelectType("SINGLE", 1, 2);
       LabelsView$SelectType.SINGLE = selectType1;
       LabelsView$SelectType selectType2 = new LabelsView$SelectType("SINGLE_IRREVOCABLY", 2, 3);
       LabelsView$SelectType.SINGLE_IRREVOCABLY = selectType2;
       LabelsView$SelectType selectType3 = new LabelsView$SelectType("MULTI", 3, 4);
       LabelsView$SelectType.MULTI = selectType3;
       LabelsView$SelectType[] selectTypeAr = new LabelsView$SelectType[]{selectType,selectType1,selectType2,selectType3};
       LabelsView$SelectType.$VALUES = selectTypeAr;
    }
    public void LabelsView$SelectType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static LabelsView$SelectType get(int p0){
       if (p0 == 1) {
          return LabelsView$SelectType.NONE;
       }
       if (p0 == 2) {
          return LabelsView$SelectType.SINGLE;
       }
       if (p0 == 3) {
          return LabelsView$SelectType.SINGLE_IRREVOCABLY;
       }
       if (p0 != 4) {
          return LabelsView$SelectType.NONE;
       }
       return LabelsView$SelectType.MULTI;
    }
    public static LabelsView$SelectType valueOf(String p0){
       return Enum.valueOf(LabelsView$SelectType.class, p0);
    }
    public static LabelsView$SelectType[] values(){
       return LabelsView$SelectType.$VALUES.clone();
    }
}
