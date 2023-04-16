package androidx.multidex.MultiDexExtractor$1;
import java.io.FileFilter;
import androidx.multidex.MultiDexExtractor;
import java.lang.Object;
import java.io.File;
import java.lang.String;

public class MultiDexExtractor$1 implements FileFilter	// class@000858
{
    public final MultiDexExtractor this$0;

    public void MultiDexExtractor$1(MultiDexExtractor p0){
       this.this$0 = p0;
       super();
    }
    public boolean accept(File p0){
       return ((p0.getName()).equals("MultiDex.lock") ^ 0x01);
    }
}
