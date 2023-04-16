package gd9.b$b;
import k36.f;
import gd9.b$a;
import java.lang.Object;
import com.google.gson.JsonObject;
import java.lang.String;
import java.lang.Boolean;
import com.google.gson.JsonElement;
import k36.e;

public class b$b implements f	// class@002464
{
    public final String a;

    public void b$b(int p0,int p1,int p2,boolean p3,b$a p4){
       super();
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("fromMode", b$b.d(p0));
       jsonObject.c0("targetMode", b$b.d(p1));
       jsonObject.c0("initialMode", b$b.d(p2));
       jsonObject.H("initialSwitch", Boolean.valueOf(p3));
       this.a = jsonObject.toString();
    }
    public static String d(int p0){
       if (!p0) {
          return "Video";
       }
       if (p0 == 1) {
          return "TakePicture";
       }
       if (p0 == 2) {
          return "SnapShot";
       }
       if (p0 != 3) {
          return "";
       }
       return "Activity";
    }
    public String a(){
       return "changeCameraPageMode";
    }
    public boolean b(){
       return e.a(this);
    }
    public String c(){
       return this.a;
    }
}
