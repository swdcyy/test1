package b96.a;
import z1.a;
import b96.d;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import jk0.b;
import jk0.c;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import e17.i;

public final class a implements a	// class@000442
{
    public final d a;

    public void a(d p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       boolean b;
       try{
          a ta = this.a;
          Objects.requireNonNull(ta);
          d uod = d.class;
          if (PatchProxy.applyVoidOneRefs(p0, ta, uod, "4")) {
          }else {
             Object obj = PatchProxy.applyOneRefs(p0, ta, uod, "5");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else if(("true").equalsIgnoreCase(p0) || ("false").equalsIgnoreCase(p0)){
                b = true;
             }else {
                b = false;
             }
             if (b) {
                p0 = Boolean.valueOf(Boolean.parseBoolean(p0));
                c.a().h(p0.booleanValue());
                StringBuilder str = "KDS";
                p0 = (p0.booleanValue())? "打开": "关闭";
                i.d(R.style.arg_RES_7f11066a, str+p0+"水印开关成功");
             }
          }
       }catch(java.lang.Exception e4){
          i.d(R.style.arg_RES_7f110668, "KDS操作水印开关失败，失败原因："+e4);
       }
       return;
    }
}
