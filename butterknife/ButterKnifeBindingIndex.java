package butterknife.ButterKnifeBindingIndex;
import java.lang.Object;
import java.lang.String;
import butterknife.ButterKnife;

public class ButterKnifeBindingIndex	// class@000b8c
{
    public static String[] bindingClasses;

    public void ButterKnifeBindingIndex(){
       super();
    }
    public static boolean isClassExistInIndex(String p0){
       if (ButterKnifeBindingIndex.bindingClasses == null) {
          return true;
       }
       String[] bindingClass = ButterKnifeBindingIndex.bindingClasses;
       int len = bindingClass.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return false;
          }
          if ((bindingClass[i]).equals(p0)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
}
