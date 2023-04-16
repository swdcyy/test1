package b4a.b;
import x3a.c;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import b4a.a;
import java.lang.Runnable;
import t45.c;

public class b extends c	// class@000364
{
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final boolean n;

    public void b(QPhoto p0){
       super(p0);
       this.g = "poi_d_click_plc";
       this.h = "poi_d_is_low_phone";
       this.i = "poi_d_goods_type";
       this.j = "poi_d_from_type";
       this.k = "local_life_jump_source";
       this.l = "local_life_jump_channel";
       this.m = "local_life_is_first_enter";
       this.n = a.t().d("activityISLPForH5", false);
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.v();
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.v();
       return;
    }
    public final void v(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       c.a(new a(this));
       return;
    }
}
