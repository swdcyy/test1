package b2.e;
import java.lang.Object;
import android.os.Build$VERSION;
import b2.e$c;
import b2.e$b;
import b2.d;
import android.os.Bundle;

public class e	// class@000ac7
{
    public final Object a;

    public void e(){
       super();
       this.a = (Build$VERSION.SDK_INT >= 26)? new e$c(this): new e$b(this);
       return;
    }
    public void e(Object p0){
       super();
       this.a = p0;
    }
    public d a(int p0){
       return null;
    }
    public d b(int p0){
       return null;
    }
    public Object c(){
       return this.a;
    }
    public boolean d(int p0,int p1,Bundle p2){
       return false;
    }
}
