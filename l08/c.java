package l08.c;
import d08.b;
import java.lang.Object;
import com.kwaishou.merchant.daccore.pendant.base.PendantState;
import c08.a;
import java.lang.String;
import b08.a;
import n08.a;
import com.google.gson.JsonObject;
import android.view.View;
import com.kwaishou.merchant.daccore.data.model.DataSource;
import java.util.Map;
import com.kwaishou.merchant.daccore.pendant.extension.PendantExtension;
import e08.a;

public abstract class c	// class@00254f
{
    public View a;
    public a b;
    public PendantExtension c;
    public PendantState d;
    public String e;
    public String f;
    public b g;

    public void c(b p0){
       super();
       this.g = p0;
       this.d = PendantState.INIT;
       this.e = p0.a;
       this.f = a.d(p0.b());
       this.b = this.g.c();
       c tg = this.g;
       this.c = tg.c;
       this.a = this.a(tg.a());
    }
    public abstract View a(JsonObject p0);
    public void b(){
       this.d = PendantState.DID_MOUNT;
    }
    public final b c(){
       return this.g;
    }
    public final String d(){
       return this.f;
    }
    public final String e(){
       return this.e;
    }
    public final a f(){
       return this.b;
    }
    public final View g(){
       return this.a;
    }
    public void h(JsonObject p0,DataSource p1){
    }
    public final void i(){
       c tc = this.c;
       if (tc != null) {
          c te = this.e;
          if (te != null) {
             tc.i().remove(te);
          }
       }
       return;
    }
    public void j(JsonObject p0){
    }
    public void k(int p0){
       this.d = PendantState.WILL_UNMOUNT;
    }
}
