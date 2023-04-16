package e4a.a;
import java.lang.Object;
import com.yxcorp.gifshow.detail.plc.error.exception.BasePlcException;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.detail.plc.error.exception.PlcFeatureException;
import java.lang.Throwable;
import kotlin.jvm.internal.a;

public final class a	// class@002064
{
    public int a;
    public String b;
    public String c;
    public Throwable d;

    public void a(){
       super();
       this.b = "";
       this.c = "";
    }
    public final BasePlcException a(){
       String str;
       Object[] objArray1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, uoa, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       PlcFeatureException plcFeatureEx = PatchProxy.apply(objArray, this, uoa, "5");
       if (plcFeatureEx != patchProxyRe) {
       }else {
          switch (this.a){
              case 2:
                str = "plc crash on pre decide!";
                break;
              case 3:
                str = "plc crash on handle logic!";
                break;
              case 4:
                str = "plc crash on render!";
                break;
              case 5:
                str = "plc crash on inactive!";
                break;
              case 6:
                str = "plc crash on click!";
                break;
              case 7:
                str = "plc crash on refresh!";
                break;
              default:
                str = "plc crash!";
          }
          obj = 0;
          String str1 = ((this.b).length() > 0)? 1: null;
          str1 = (str1)? str: objArray;
          if (str1 != null) {
             str = str+" custom message:"+str1;
          }
          if ((this.c).length() > 0) {
             obj = 1;
          }
          if (obj) {
             objArray = str;
          }
          if (objArray != null) {
             str = str+" extra:"+objArray;
          }
          uoa = this.d;
          if (uoa != null) {
             plcFeatureEx = new PlcFeatureException(str, uoa);
          }else {
             plcFeatureEx = new PlcFeatureException(str);
          }
       }
       return plcFeatureEx;
    }
    public final a b(int p0){
       this.a = p0;
       return this;
    }
    public final a c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "message");
       this.b = p0;
       return this;
    }
    public final a d(Throwable p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "cause");
       this.d = p0;
       return this;
    }
}
