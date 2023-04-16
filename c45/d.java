package c45.d;
import java.lang.Object;
import android.content.Context;
import java.io.File;
import java.lang.String;

public final class d	// class@000386
{

    public void d(){
       super();
    }
    public static final void a(d p0,Context p1,boolean p2){
       File uFile = new File(p1.getCacheDir(), "from_longinus_flag");
       if (p2) {
          uFile.createNewFile();
       }else {
          uFile.delete();
       }
       return;
    }
}
