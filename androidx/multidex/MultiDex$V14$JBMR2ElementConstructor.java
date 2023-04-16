package androidx.multidex.MultiDex$V14$JBMR2ElementConstructor;
import androidx.multidex.MultiDex$V14$ElementConstructor;
import java.lang.Class;
import java.lang.Object;
import java.io.File;
import java.lang.Boolean;
import dalvik.system.DexFile;
import java.lang.reflect.Constructor;

public class MultiDex$V14$JBMR2ElementConstructor implements MultiDex$V14$ElementConstructor	// class@000852
{
    public final Constructor elementConstructor;

    public void MultiDex$V14$JBMR2ElementConstructor(Class p0){
       super();
       Class[] uClassArray = new Class[]{File.class,Boolean.TYPE,File.class,DexFile.class};
       Constructor constructor = p0.getConstructor(uClassArray);
       this.elementConstructor = constructor;
       constructor.setAccessible(1);
    }
    public Object newInstance(File p0,DexFile p1){
       Object[] objArray = new Object[]{p0,Boolean.FALSE,p0,p1};
       return this.elementConstructor.newInstance(objArray);
    }
}
