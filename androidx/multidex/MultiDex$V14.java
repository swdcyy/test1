package androidx.multidex.MultiDex$V14;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import androidx.multidex.MultiDex$V14$ICSElementConstructor;
import androidx.multidex.MultiDex$V14$JBMR11ElementConstructor;
import androidx.multidex.MultiDex$V14$JBMR2ElementConstructor;
import java.lang.ClassLoader;
import java.util.List;
import java.lang.reflect.Field;
import androidx.multidex.MultiDex;
import java.io.File;
import java.lang.StringBuilder;
import dalvik.system.DexFile;
import androidx.multidex.MultiDex$V14$ElementConstructor;

public final class MultiDex$V14	// class@000853
{
    public final MultiDex$V14$ElementConstructor elementConstructor;
    public static final int EXTRACTED_SUFFIX_LENGTH = 4;

    public void MultiDex$V14(){
       MultiDex$V14$ICSElementConstructor v14$ICSEleme;
       super();
       Class uClass = Class.forName("dalvik.system.DexPathList$Element");
       try{
          v14$ICSEleme = new MultiDex$V14$ICSElementConstructor(uClass);
       }catch(java.lang.NoSuchMethodException e0){
          try{
             v14$ICSEleme = new MultiDex$V14$JBMR11ElementConstructor(e0);
          }catch(java.lang.NoSuchMethodException e0){
             v14$ICSEleme = new MultiDex$V14$JBMR2ElementConstructor(e0);
          }
       }
       this.elementConstructor = v14$ICSEleme;
       return;
    }
    public static void install(ClassLoader p0,List p1){
       p0 = MultiDex.findField(p0, "pathList").get(p0);
       Object[] objArray = new MultiDex$V14().makeDexElements(p1);
       try{
          MultiDex.expandFieldArray(p0, "dexElements", objArray);
       }catch(java.lang.NoSuchFieldException e0){
          MultiDex.expandFieldArray(p0, "pathElements", objArray);
       }
       return;
    }
    public static String optimizedPathFor(File p0){
       String name = p0.getName();
       return new File(p0.getParentFile(), name.substring(0, (name.length() - MultiDex$V14.EXTRACTED_SUFFIX_LENGTH))+".dex").getPath();
    }
    public final Object[] makeDexElements(List p0){
       int i = p0.size();
       Object[] objArray = new Object[i];
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          File uFile = p0.get(i1);
          objArray[i1] = this.elementConstructor.newInstance(uFile, DexFile.loadDex(uFile.getPath(), MultiDex$V14.optimizedPathFor(uFile), 0));
       }
       return objArray;
    }
}
