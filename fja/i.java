package fja.i;
import ok.x;
import rja.c;
import qvb.i;
import java.lang.Object;
import fja.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.QCurrentUser;
import lga.a;
import com.kwai.social.config.utils.HoldoutConfigUtilKt;

public final class i implements x	// class@002954
{
    public final c b;
    public final i c;

    public void i(c p0,i p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object get(){
       boolean b;
       i tb = this.b;
       i tc = this.c;
       Object obj = PatchProxy.applyTwoRefs(tb, tc, null, l.class, "4");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(QCurrentUser.ME.isLogined() && (!a.a() && (!HoldoutConfigUtilKt.a() && (tb.d() && tc.isEmpty())))){
          b = true;
       }else {
          b = false;
       }
       return Boolean.valueOf(b);
    }
}
