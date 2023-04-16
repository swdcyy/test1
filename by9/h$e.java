package by9.h$e;
import qp7.b1;
import by9.h;
import java.lang.Object;
import qp7.a1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.CoCreateInfo;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import by9.h$a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class h$e implements b1	// class@00051e
{
    public final h a;

    public void h$e(h p0){
       this.a = p0;
       super();
    }
    public void a(){
       a1.a(this);
    }
    public void b(){
       a1.g(this);
    }
    public void c(boolean p0){
       a1.b(this, p0);
    }
    public void d(boolean p0){
       a1.h(this, p0);
    }
    public void e(boolean p0){
       a1.f(this, p0);
    }
    public void f(boolean p0){
       a1.d(this, p0);
    }
    public void g(){
       a1.e(this);
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, h$e.class, "1")) {
          return;
       }
       a1.c(this);
       if (h.o0(this.a).getCoCreateInfo() != null) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "DESCRIPT_AREA_AUTHORS_CREAT";
          u1.D0(null, h.n0(this.a), 3, uElementPack, h.x.a(h.o0(this.a), -1), null);
       }
       return;
    }
}
