package c5.l$a;
import com.airbnb.lottie.ex.model.content.MergePaths$MergePathsMode;
import java.lang.Enum;

public class l$a	// class@000cd6
{
    public static final int[] a;

    static {
       int[] ointArray = new int[MergePaths$MergePathsMode.values().length];
       try{
          l$a.a = ointArray;
          ointArray[MergePaths$MergePathsMode.MERGE.ordinal()] = 1;
          try{
             l$a.a[MergePaths$MergePathsMode.ADD.ordinal()] = 2;
             try{
                l$a.a[MergePaths$MergePathsMode.SUBTRACT.ordinal()] = 3;
                try{
                   l$a.a[MergePaths$MergePathsMode.INTERSECT.ordinal()] = 4;
                   try{
                      l$a.a[MergePaths$MergePathsMode.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
                   }catch(java.lang.NoSuchFieldError e0){
                   }
                }catch(java.lang.NoSuchFieldError e0){
                }
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
