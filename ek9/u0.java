package ek9.u0;
import erd.g;
import com.yxcorp.gifshow.comment.e;
import android.app.Activity;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.gifshow.comment.e$c;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.String;
import lnc.a1;
import e17.i;

public final class u0 implements g	// class@0021a5
{
    public final e b;
    public final Activity c;
    public final QPhoto d;
    public final QComment e;
    public final e$c f;

    public void u0(e p0,Activity p1,QPhoto p2,QComment p3,e$c p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void accept(Object p0){
       this.b.m(this.c, this.d, this.e, this.f, p0);
       p0 = (p0 instanceof KwaiException)? p0.mErrorMessage: null;
       if (TextUtils.x(p0)) {
          p0 = a1.p(R.string.arg_RES_7f101604);
       }
       i.d(R.style.arg_RES_7f11066a, p0);
       return;
    }
}
