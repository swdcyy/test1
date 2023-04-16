package bu7.f0;
import bu7.m;
import com.kwai.tokenshare.model.TokenInfoModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bu7.d0;

public class f0 implements m	// class@000485
{
    public final TokenInfoModel b;

    public void f0(TokenInfoModel p0){
       this.b = p0;
       super();
    }
    public void Gf(){
       if (PatchProxy.applyVoid(null, this, f0.class, "3")) {
          return;
       }
       d0.k(1136, this.b, true, false);
       return;
    }
    public void H1(){
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, f0.class, "4")) {
          return;
       }
       d0.k(1137, this.b, false, true);
       return;
    }
    public void Zc(){
       if (PatchProxy.applyVoid(null, this, f0.class, "2")) {
          return;
       }
       d0.k(1136, this.b, false, false);
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, f0.class, "1")) {
          return;
       }
       d0.l();
       return;
    }
}
