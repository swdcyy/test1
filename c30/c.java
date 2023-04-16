package c30.c;
import com.kuaishou.cover.container.loader.b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import d30.c;
import java.util.Map;
import java.lang.Boolean;

public class c extends b	// class@0002e6
{

    public void c(){
       super();
    }
    public String h(){
       return "KRN";
    }
    public void o(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "1")) {
          return;
       }
       c.d("load by krn");
       if (!PatchProxy.applyVoid(objArray, this, uoc, "2")) {
          b tf = this.f;
          if (tf != null) {
             tf.put("materialId", String.valueOf(this.d));
             tf = this.f;
             boolean b = (this.h == 2)? true: false;
             tf.put("isWidget", Boolean.valueOf(b));
             Boolean fALSE = Boolean.FALSE;
             this.f.put("enableBackBtnHandler", fALSE);
             this.f.put("enableLoading", fALSE);
          }
       }
       return;
    }
}
