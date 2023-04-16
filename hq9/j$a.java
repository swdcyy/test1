package hq9.j$a;
import java.lang.String;
import android.text.TextPaint;
import java.lang.Object;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import hq9.j;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class j$a	// class@00270b
{
    public final String a;
    public final TextPaint b;
    public final int c;
    public final int d;
    public String e;
    public String f;
    public String g;
    public String h;
    public CharacterStyle i;
    public int j;
    public boolean k;
    public int l;

    public void j$a(String p0,TextPaint p1,int p2,int p3){
       super();
       this.l = 0;
       if (TextUtils.x(p0) || p0.equals("...")) {
          p0 = "";
       }
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       return;
    }
    public j a(){
       Object obj = PatchProxy.apply(null, this, j$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new j(this);
    }
    public j$a b(String p0){
       this.e = p0;
       return this;
    }
    public j$a c(String p0){
       this.f = p0;
       return this;
    }
    public j$a d(boolean p0){
       this.k = p0;
       return this;
    }
    public j$a e(String p0){
       this.h = p0;
       return this;
    }
    public j$a f(int p0){
       this.l = p0;
       return this;
    }
}
