package b99.n0;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import b99.h;
import b99.s;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import m99.f;
import b99.d0;
import java.lang.Class;
import b99.g0;
import b99.h0;
import b99.i0;
import b99.j0;
import b99.k0;
import b99.l0;
import b99.m0;
import b99.i;
import b99.j;
import b99.k;
import b99.l;
import b99.m;
import b99.n;
import com.yxcorp.gifshow.entity.QPhoto;
import b99.o;
import b99.p;
import de5.a;
import b99.q;
import android.view.ViewGroup;
import b99.r;
import n4a.a;
import b99.t;
import f4a.b0;
import b99.u;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import b99.v;
import b99.w;
import b99.x;
import b99.y;
import f4a.j0;
import b99.z;
import b99.a0;
import b99.b0;
import b99.c0;
import b99.e0;
import b99.f0;
import mm8.a;

public final class n0 implements b	// class@0003af
{

    public void n0(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("PHOTO_DETAIL_ACTIVITY_FINISH_EVENT", new s(this, p1));
       p0.h(f.class, new d0(this, p1));
       p0.i("DETAIL_ATLAS_SEEKBAR_POSITION_OBSERVABLE", new g0(this, p1));
       p0.i("DETAIL_BOTTOM_BAR_CONTROLLER", new h0(this, p1));
       p0.i("DETAIL_COMMENT_RECYCLER_VIEW", new i0(this, p1));
       p0.i("PLC_ENTRY_CONTAINER_SHOW_CONTROLLER", new j0(this, p1));
       p0.i("DETAIL_PLC_STATE_GETTER", new k0(this, p1));
       p0.i("PLC_ENTRY_DOWNLOAD_ACTION_OBSERVABLE", new l0(this, p1));
       p0.i("PLC_DOWNLOAD_CHECK_INTERFACE", new m0(this, p1));
       p0.i("PLC_ENTRY_DOWNLOAD_ACTION_OBSERVER", new i(this, p1));
       p0.i("DETAIL_FRAGMENT", new j(this, p1));
       p0.i("DETAIL_HEADER_RECYCLER_VIEW", new k(this, p1));
       p0.i("DETAIL_LOGGER", new l(this, p1));
       p0.i("DETAIL_ON_CONFIGURATION_CHANGED_EVENT", new m(this, p1));
       p0.i("DETAIL_SCROLL_LISTENERS", new n(this, p1));
       p0.h(QPhoto.class, new o(this, p1));
       p0.i("ATLAS_VIEW_PAGER", new p(this, p1));
       p0.h(a.class, new q(this, p1));
       p0.h(ViewGroup.class, new r(this, p1));
       p0.h(a.class, new t(this, p1));
       p0.h(b0.class, new u(this, p1));
       p0.h(PlcEntryStyleInfo.class, new v(this, p1));
       p0.i("DETAIL_PLC_COUPLE_PERF_LOGGER", new w(this, p1));
       p0.i("PLC_SEEK_BAR_PUBLISHER", new x(this, p1));
       p0.i("DETAIL_PLC_STATE_OBSERVER", new y(this, p1));
       p0.h(j0.class, new z(this, p1));
       p0.i("PLC_WEAK_EVENT_BUS", new a0(this, p1));
       p0.i("DETAIL_PROCESS_EVENT", new b0(this, p1));
       p0.i("PLC_ENTRY_STATE_CHANGE_OBSERVABLE", new c0(this, p1));
       e0 uoe0 = new e0(this, p1);
       String str = "PLC_ENTRY_STATE_CHANGE_OBSERVER";
       try{
          p0.i(str, uoe0);
          p0.h(h.class, new f0(this, p1));
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
