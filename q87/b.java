package q87.b;
import java.lang.String;
import java.lang.Object;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.List;

public final class b	// class@002246
{
    public String a;
    public final String b;
    public boolean c;
    public int d;
    public boolean e;
    public boolean f;
    public List g;

    public void b(String p0,String p1){
       super();
       this.a = "app";
       this.c = true;
       this.d = 63;
       this.e = false;
       this.f = false;
       if (!TextUtils.isEmpty(p0)) {
          this.a = p0;
       }
       this.b = p1;
       return;
    }
    public boolean a(){
       return this.c;
    }
    public String b(){
       return this.b;
    }
    public int c(){
       return this.d;
    }
    public String d(){
       return this.a;
    }
    public List e(){
       return this.g;
    }
    public void f(boolean p0){
       this.c = p0;
    }
    public void g(int p0){
       this.d = p0;
    }
}
