package cra.i;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import cra.w;
import java.lang.String;
import q87.c;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.StringBuilder;
import cra.o;

public final class i implements g	// class@002381
{
    public final boolean b;

    public void i(boolean p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       i tb = this.b;
       Object[] objArray = new Object[0];
       w.C().s("GrowthDeepLinkManager", p0.getLocalizedMessage(), objArray);
       String str = (p0 instanceof KwaiException)? p0.mErrorCode: "0";
       o.a(null, str, p0.getMessage(), tb);
       return;
    }
}
