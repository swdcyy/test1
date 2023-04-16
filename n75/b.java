package n75.b;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import android.app.Application;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.chat.kwailink.utils.AndroidUtils;
import java.lang.Integer;
import java.lang.Math;

public class b	// class@001f15
{
    public Context a;
    public int b;
    public String c;
    public String d;
    public String e;
    public int f;
    public boolean g;
    public boolean h;
    public int i;
    public String j;

    public void b(Context p0,String p1){
       super();
       this.b = 4;
       this.f = 0x41eb0;
       this.g = true;
       this.h = true;
       this.i = 0;
       Context applicationC = p0.getApplicationContext();
       this.a = applicationC;
       if (applicationC == null && p0 instanceof Application) {
          this.a = p0;
       }
       if (PatchProxy.applyOneRefs(p1, this, b.class, "1") != PatchProxyResult.class) {
       }else if(!TextUtils.isEmpty(p1)){
          this.c = p1;
       }else {
          this.c = AndroidUtils.getProcessName(this.a);
       }
       return;
    }
    public b a(boolean p0){
       this.g = p0;
       return this;
    }
    public b b(boolean p0){
       this.h = p0;
       return this;
    }
    public b c(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.f = Math.min(0x107ac0, Math.max(0x41eb0, p0));
       return this;
    }
    public b d(int p0){
       this.i = p0;
       return this;
    }
    public b e(String p0){
       this.j = p0;
       return this;
    }
}
