package com.yxcorp.gifshow.relation.intimate.dialog.l;
import com.yxcorp.gifshow.log.utils.b$a;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.retrofit.model.KwaiException;
import abc.w;
import java.lang.Runnable;
import ekd.k1;

public final class l implements b$a	// class@0018f7
{
    public final Throwable b;

    public void l(Throwable p0){
       this.b = p0;
    }
    public final boolean a(String p0){
       l tb = this.b;
       if (tb instanceof KwaiException) {
          k1.r(new w(tb), 250);
       }
       return true;
    }
}
