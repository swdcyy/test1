package ajc.o$a;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.share.KwaiOperator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.share.OperationModel;
import e17.i;

public final class o$a implements Callable	// class@000143
{
    public final KwaiOperator b;

    public void o$a(KwaiOperator p0){
       this.b = p0;
       super();
    }
    public Object call(){
       OperationModel operationMod = PatchProxy.apply(null, this, o$a.class, "1");
       if (operationMod != PatchProxyResult.class) {
       }else {
          i.a(R.style.arg_RES_7f11066a, 0x7f1047d8);
          operationMod = this.b.i();
       }
       return operationMod;
    }
}
