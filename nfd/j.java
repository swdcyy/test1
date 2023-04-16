package nfd.j;
import androidx.lifecycle.ViewModel;
import nfd.j$a;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.google.gson.JsonObject;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.google.gson.JsonElement;
import zk.g;
import java.lang.Boolean;
import java.lang.Number;
import yr4.a$a;
import java.lang.StringBuilder;
import uy5.b;
import nfd.r3;

public final class j extends ViewModel	// class@001dc1
{
    public a$a a;
    public JsonObject b;
    public JsonObject c;
    public static final ViewModelProvider$Factory d;

    static {
       j.d = new j$a();
    }
    public void j(){
       super();
    }
    public static j q0(Fragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ViewModelProviders.of(p0, j.d).get(j.class);
    }
    public final void o0(JsonObject p0,JsonObject p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "4")) {
          return;
       }
       if (p1 != null && p1.size() > 0) {
          Iterator iterator = p1.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             JsonElement value = uEntry.getValue();
             if (value.F()) {
                g og = value.s();
                if (og.G()) {
                   p0.H(uEntry.getKey(), Boolean.valueOf(og.d()));
                }else if(og.N()){
                   p0.a0(uEntry.getKey(), og.u());
                }else {
                   p0.c0(uEntry.getKey(), og.w());
                }
             }else {
                p0.G(uEntry.getKey(), value);
             }
          }
       }
       return;
    }
    public a$a p0(){
       return this.a;
    }
    public JsonObject r0(JsonObject p0){
       j obj = PatchProxy.applyOneRefs(p0, this, j.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj == null || obj.size() <= 0) {
          b.c("FragmentInfoViewModel", "mergeAndGetExtParams, originJsonObject:"+p0);
          return p0;
       }else if(this.c == null){
          JsonObject jsonObject = new JsonObject();
          this.c = jsonObject;
          this.o0(jsonObject, p0);
          this.o0(this.c, this.b);
       }
       b.c("FragmentInfoViewModel", "mergeAndGetExtParams, mAdditionalExtParams:"+this.b+" extParams:"+p0);
       return this.c;
    }
    public void s0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "2")) {
          return;
       }
       JsonObject jsonObject = null;
       this.b = (p0 == null)? jsonObject: r3.j(p0, JsonObject.class);
       this.c = jsonObject;
       b.c("FragmentInfoViewModel", "setExtParams, mAdditionalExtParams:"+this.b+" extParams:"+p0);
       return;
    }
}
