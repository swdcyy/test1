package androidx.multidex.MultiDex$V14$ICSElementConstructor;
import androidx.multidex.MultiDex$V14$ElementConstructor;
import java.lang.Class;
import java.lang.Object;
import java.io.File;
import java.util.zip.ZipFile;
import dalvik.system.DexFile;
import java.lang.reflect.Constructor;

public class MultiDex$V14$ICSElementConstructor implements MultiDex$V14$ElementConstructor	// class@000850
{
    public final Constructor elementConstructor;

    public void MultiDex$V14$ICSElementConstructor(Class p0){
       super();
       Class[] uClassArray = new Class[]{File.class,ZipFile.class,DexFile.class};
       Constructor constructor = p0.getConstructor(uClassArray);
       this.elementConstructor = constructor;
       constructor.setAccessible(1);
    }
    public Object newInstance(File p0,DexFile p1){
       Object[] objArray = new Object[]{p0,new ZipFile(p0),p1};
       return this.elementConstructor.newInstance(objArray);
    }
}
