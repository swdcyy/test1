package oj4.a;
import vd4.b;
import androidx.fragment.app.Fragment;
import com.google.gson.JsonObject;
import java.lang.String;

public abstract class a extends b	// class@002c87
{
    public final int y;
    public final int z;

    public void a(Fragment p0,int p1,int p2){
       super(p0);
       this.y = p1;
       this.z = p2;
    }
    public abstract JsonObject o9();
    public abstract int q9();
    public int s9(){
       return this.z;
    }
    public abstract String t9();
}
