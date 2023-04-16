package androidx.multidex.MultiDex$V4;
import java.lang.Object;
import java.lang.ClassLoader;
import java.util.List;
import java.lang.String;
import java.lang.reflect.Field;
import androidx.multidex.MultiDex;
import java.lang.StringBuilder;
import java.io.File;
import java.util.zip.ZipFile;
import dalvik.system.DexFile;
import java.util.ListIterator;

public final class MultiDex$V4	// class@000855
{

    public void MultiDex$V4(){
       super();
    }
    public static void install(ClassLoader p0,List p1){
       int i = p1.size();
       Field uField = MultiDex.findField(p0, "path");
       String str = uField.get(p0);
       String[] stringArray = new String[i];
       File[] uFileArray = new File[i];
       ZipFile[] zipFileArray = new ZipFile[i];
       DexFile[] uDexFileArra = new DexFile[i];
       ListIterator listIterator = p1.listIterator();
       while (listIterator.hasNext()) {
          File uFile = listIterator.next();
          String absolutePath = uFile.getAbsolutePath();
          str = str+':'+absolutePath;
          int i1 = listIterator.previousIndex();
          stringArray[i1] = absolutePath;
          uFileArray[i1] = uFile;
          zipFileArray[i1] = new ZipFile(uFile);
          uDexFileArra[i1] = DexFile.loadDex(absolutePath, absolutePath+".dex", 0);
       }
       uField.set(p0, str);
       MultiDex.expandFieldArray(p0, "mPaths", stringArray);
       MultiDex.expandFieldArray(p0, "mFiles", uFileArray);
       MultiDex.expandFieldArray(p0, "mZips", zipFileArray);
       MultiDex.expandFieldArray(p0, "mDexs", uDexFileArra);
       return;
    }
}
