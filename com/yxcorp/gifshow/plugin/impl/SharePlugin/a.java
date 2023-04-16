package com.yxcorp.gifshow.plugin.impl.SharePlugin.a;
import java.lang.Runnable;
import xxb.b;
import mhc.p1;
import com.yxcorp.gifshow.share.OperationModel;
import com.yxcorp.gifshow.share.KwaiOperator;
import java.lang.Object;
import xxb.a;
import brd.t;
import xxb.f;
import xxb.g;
import erd.g;
import crd.b;

public final class a implements Runnable	// class@000fba
{
    public final b b;
    public final p1 c;
    public final OperationModel d;
    public final KwaiOperator e;

    public void a(b p0,p1 p1,OperationModel p2,KwaiOperator p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       a tb = this.b;
       a tc = this.c;
       a td = this.d;
       tb.c(a.i(tc, td));
       tc.P0(this.e).subscribe(new f(tb, tc, td), new g(tb, tc, td));
    }
}
