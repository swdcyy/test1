package old.soloader.e;
import old.soloader.i;
import android.content.Context;
import java.lang.String;
import java.io.File;
import old.soloader.i$f;
import old.soloader.e$b;

public class e extends i	// class@002013
{
    public final File g;
    public final String h;

    public void e(Context p0,String p1,File p2,String p3){
       super(p0, p1);
       this.g = p2;
       this.h = p3;
    }
    public i$f i(){
       return new e$b(this, this);
    }
}
