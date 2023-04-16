package a8c.p;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import a8c.h;
import com.yxcorp.gifshow.activity.GifshowActivity;
import a8c.i;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import a8c.j;
import java.lang.String;
import com.yxcorp.gifshow.qrcode.model.QrDataWrapper;
import a8c.k;
import com.smile.gifshow.annotation.provider.v2.Accessors;
import com.yxcorp.gifshow.share.OperationModel;
import a8c.l;
import com.kwai.library.widget.popup.common.c;
import a8c.m;
import a8c.n;
import a8c.o;
import mm8.a;

public final class p implements b	// class@0000aa
{

    public void p(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(GifshowActivity.class, new i(this, p1));
       p0.i("SHARE_QR_CODE_CONF", new j(this, p1));
       p0.h(QrDataWrapper.class, new k(this, p1));
       if (p1.b != null) {
          Accessors.d().b(p1.b).a(p0, p1.b);
       }
       p0.h(OperationModel.class, new l(this, p1));
       p0.h(c.class, new m(this, p1));
       n on = new n(this, p1);
       String str = "SHARE_QR_DATA_HELPER";
       try{
          p0.i(str, on);
          p0.h(h.class, new o(this, p1));
          return;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public a b(Object p0){
       return a.a(this, p0);
    }
    public b init(){
       return a.b(this);
    }
}
