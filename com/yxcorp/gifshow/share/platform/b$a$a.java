package com.yxcorp.gifshow.share.platform.b$a$a;
import fz6.a;
import com.yxcorp.gifshow.share.platform.b$a;
import brd.v;
import java.lang.Object;
import java.lang.String;
import fz6.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.yxcorp.gifshow.share.exception.ForwardCancelException;
import java.lang.Exception;
import nsd.u;
import java.lang.Throwable;
import brd.g;
import com.yxcorp.gifshow.share.OperationModel;
import com.yxcorp.gifshow.share.KwaiOperator;
import java.io.IOException;
import java.lang.StringBuilder;

public final class b$a$a implements a	// class@001c22
{
    public final b$a b;
    public final v c;

    public void b$a$a(b$a p0,v p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void a(int p0,String p1,b p2){
       if (PatchProxy.isSupport(b$a$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, b$a$a.class, "1")) {
          return;
       }
       if (p2.b != null) {
          ForwardCancelException uForwardCanc = new ForwardCancelException("cancel wechat share", null, null, 6, null);
          this.c.onError(p1);
       }else if(p2.a != null){
          this.c.onNext(this.b.c.i());
       }else {
          this.c.onError(new IOException(p2.c+':'+p2.d));
       }
       return;
    }
}