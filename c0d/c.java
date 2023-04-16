package c0d.c;
import c0d.a;
import android.content.Context;
import com.yxcorp.gifshow.log.h;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.ArrayList;
import com.google.gson.JsonObject;
import c0d.b;

public class c implements a	// class@0004c1
{
    public Context a;
    public h b;
    public float c;
    public a d;

    public void c(Context p0,h p1,float p2){
       super();
       this.d = null;
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public synchronized List a(String p0){
       c td = this.d;
       if (td == null) {
          return new ArrayList();
       }
       return td.a(p0);
    }
    public synchronized void b(List p0){
       c td = this.d;
       if (td == null) {
          return;
       }
       td.b(p0);
       return;
    }
    public synchronized void c(String p0){
       c td = this.d;
       if (td == null) {
          return;
       }
       td.c(p0);
       return;
    }
    public synchronized void d(JsonObject p0){
       c td = this.d;
       if (td == null) {
          return;
       }
       td.d(p0);
       return;
    }
    public synchronized void initialize(){
       if (this.d != null) {
          return;
       }
       this.d = new b(this.b, this.c);
       return;
    }
    public synchronized void onBackground(){
       c td = this.d;
       if (td == null) {
          return;
       }
       td.onBackground();
       return;
    }
    public synchronized void onForeground(){
       c td = this.d;
       if (td == null) {
          return;
       }
       td.onForeground();
       return;
    }
}
