package o4a.b0;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.detail.plc.presenter.PlcEntryLoggerImplPresenter;
import o4a.y;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import f4a.b0;
import o4a.z;
import java.lang.Class;
import o4a.a0;
import mm8.a;

public final class b0 implements b	// class@003281
{

    public void b0(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("PLC_ENTRY_LOG_INTERFACE", new y(this, p1));
       b0 uob0 = b0.class;
       z oz = new z(this, p1);
       try{
          p0.h(uob0, oz);
          p0.h(PlcEntryLoggerImplPresenter.class, new a0(this, p1));
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
