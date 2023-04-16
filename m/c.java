package m.c;
import x38.b;
import m.a;
import java.lang.String;
import com.middleware.security.configs.KSTEWrapperResult;
import com.kuaishou.security.kste.export.KSTEResult;
import java.lang.Exception;
import com.middleware.security.configs.KSTEWrapperResult$Code;
import com.kuaishou.security.kste.export.KSTEResult$Code;
import a.a.a.a.b.a.b;

public class c extends a implements b	// class@00259d
{

    public void c(){
       super();
    }
    public KSTEWrapperResult a(String p0,String p1,String p2,int p3,byte[] p4,int p5){
       KSTEResult kSTEResult;
       byte[] uobyteArray;
       KSTEWrapperResult kSTEWrapperR;
       try{
          kSTEResult = this.b(p0, p1, p2, p3, p4, p5);
       }catch(com.kuaishou.security.kste.logic.event.KSTEException e1){
          e1.printStackTrace();
          kSTEResult = null;
       }
       int i = 0;
       if (kSTEResult != null) {
          KSTEWrapperResult$Code iNVOKE_OK = KSTEWrapperResult$Code.INVOKE_OK;
          uobyteArray = new byte[i];
          if (kSTEResult.getRetCode() == KSTEResult$Code.INVOKE_OK) {
             uobyteArray = kSTEResult.getResult();
          }else if(kSTEResult.getRetCode() == KSTEResult$Code.INVOKE_FAIL){
             iNVOKE_OK = KSTEWrapperResult$Code.INVOKE_FAIL;
          }else if(kSTEResult.getRetCode() == KSTEResult$Code.INVOKE_OFFLINE){
             iNVOKE_OK = KSTEWrapperResult$Code.INVOKE_OFFLINE;
          }else if(kSTEResult.getRetCode() == KSTEResult$Code.INVOKE_PARAM_INVALID){
             iNVOKE_OK = KSTEWrapperResult$Code.INVOKE_PARAM_INVALID;
          }else if(kSTEResult.getRetCode() == KSTEResult$Code.INVOKE_TIMEOUT){
             iNVOKE_OK = KSTEWrapperResult$Code.INVOKE_TIMEOUT;
          }
          kSTEWrapperR = new KSTEWrapperResult(iNVOKE_OK, uobyteArray);
       }else {
          uobyteArray = new byte[i];
          kSTEWrapperR = new KSTEWrapperResult(KSTEWrapperResult$Code.INVOKE_FAIL, uobyteArray);
       }
       return kSTEWrapperR;
    }
    public boolean c(){
       return b.b().t();
    }
}
