package ad8.k;
import xd8.b;
import ma8.i;
import java.lang.Integer;
import ja8.e;
import java.lang.String;
import xd8.i;
import qc8.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import ad8.g;
import com.mini.js.jscomponent.input.model.InputParameter;
import com.mini.js.jscomponent.input.model.b;
import com.mini.d;
import yd8.b;
import xd8.g;

public class k extends b	// class@000083
{

    public void k(i p0){
       super(p0);
    }
    public void b(Integer p0,e p1,int p2,int p3){
    }
    public void destroy(){
    }
    public String i(){
       return null;
    }
    public i k(String p0){
       return null;
    }
    public a l(Integer p0,e p1,Integer p2,int p3){
       a uoa;
       if (PatchProxy.isSupport(k.class)) {
          uoa = PatchProxy.applyFourRefs(p0, p1, p2, Integer.valueOf(p3), this, k.class, "1");
          if (uoa != PatchProxyResult.class) {
          }else {
          label_001f :
             InputParameter inputParamet = b.a(p1.g());
             g og = null;
             if (inputParamet == null) {
                if (d.f()) {
                   d.a("<input>", "showKeyboard failed to parse InputParameter");
                }
                this.m(p1, b.a(101, "showKeyboard failed to parse InputParameter"));
             }else if(inputParamet.style == null){
                if (d.f()) {
                   d.a("<input>", "showKeyboard failed to style is null");
                }
                this.m(p1, b.a(341, "showKeyboard failed to style is null"));
             }else {
                g og1 = new g(this.e, inputParamet);
                if (d.f()) {
                   d.a("<input>", "showKeyboard works");
                }
                uoa = og1;
             }
             uoa = og;
          }
       }else {
          goto label_001f ;
       }
       return uoa;
    }
    public String o(){
       return "input";
    }
}
