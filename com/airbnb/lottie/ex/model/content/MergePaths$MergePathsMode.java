package com.airbnb.lottie.ex.model.content.MergePaths$MergePathsMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class MergePaths$MergePathsMode extends Enum	// class@000dac
{
    public static final MergePaths$MergePathsMode[] $VALUES;
    public static final MergePaths$MergePathsMode ADD;
    public static final MergePaths$MergePathsMode EXCLUDE_INTERSECTIONS;
    public static final MergePaths$MergePathsMode INTERSECT;
    public static final MergePaths$MergePathsMode MERGE;
    public static final MergePaths$MergePathsMode SUBTRACT;

    static {
       MergePaths$MergePathsMode mergePathsMo = new MergePaths$MergePathsMode("MERGE", 0);
       MergePaths$MergePathsMode.MERGE = mergePathsMo;
       MergePaths$MergePathsMode mergePathsMo1 = new MergePaths$MergePathsMode("ADD", 1);
       MergePaths$MergePathsMode.ADD = mergePathsMo1;
       MergePaths$MergePathsMode mergePathsMo2 = new MergePaths$MergePathsMode("SUBTRACT", 2);
       MergePaths$MergePathsMode.SUBTRACT = mergePathsMo2;
       MergePaths$MergePathsMode mergePathsMo3 = new MergePaths$MergePathsMode("INTERSECT", 3);
       MergePaths$MergePathsMode.INTERSECT = mergePathsMo3;
       MergePaths$MergePathsMode mergePathsMo4 = new MergePaths$MergePathsMode("EXCLUDE_INTERSECTIONS", 4);
       MergePaths$MergePathsMode.EXCLUDE_INTERSECTIONS = mergePathsMo4;
       MergePaths$MergePathsMode[] mergePathsMo5 = new MergePaths$MergePathsMode[]{mergePathsMo,mergePathsMo1,mergePathsMo2,mergePathsMo3,mergePathsMo4};
       MergePaths$MergePathsMode.$VALUES = mergePathsMo5;
    }
    public void MergePaths$MergePathsMode(String p0,int p1){
       super(p0, p1);
    }
    public static MergePaths$MergePathsMode forId(int p0){
       if (p0 == 1) {
          return MergePaths$MergePathsMode.MERGE;
       }
       if (p0 == 2) {
          return MergePaths$MergePathsMode.ADD;
       }
       if (p0 == 3) {
          return MergePaths$MergePathsMode.SUBTRACT;
       }
       if (p0 == 4) {
          return MergePaths$MergePathsMode.INTERSECT;
       }
       if (p0 != 5) {
          return MergePaths$MergePathsMode.MERGE;
       }
       return MergePaths$MergePathsMode.EXCLUDE_INTERSECTIONS;
    }
    public static MergePaths$MergePathsMode valueOf(String p0){
       return Enum.valueOf(MergePaths$MergePathsMode.class, p0);
    }
    public static MergePaths$MergePathsMode[] values(){
       return MergePaths$MergePathsMode.$VALUES.clone();
    }
}
