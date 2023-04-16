package eo2.f;
import ok.x;
import eo2.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import androidx.lifecycle.LiveData;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Number;

public final class f implements x	// class@00279d
{
    public final h b;

    public void f(h p0){
       this.b = p0;
       super();
    }
    public Object get(){
       JsonObject jsonObject = PatchProxy.apply(null, this, f.class, "1");
       if (jsonObject != PatchProxyResult.class) {
       }else {
          jsonObject = new JsonObject();
          int i = 1;
          Object value = this.b.x0().getValue();
          a.m(value);
          if (value.booleanValue()) {
             i = 2;
          }else {
             value = this.b.z0().getValue();
             a.m(value);
             if (value.booleanValue()) {
                i = 3;
             }
          }
          jsonObject.a0("status", Integer.valueOf(i));
       }
       return jsonObject;
    }
}
