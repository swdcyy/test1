package ghd.u;
import java.lang.Object;
import android.app.Activity;
import erd.g;
import a17.b$b;
import a17.b$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import a17.g;
import lnc.a1;
import java.lang.CharSequence;
import java.util.List;
import a17.c$a;
import agd.b;
import com.kwai.framework.model.user.QCurrentUser;
import java.util.Objects;
import ghd.u$b;
import pgd.d;
import w07.l;
import ghd.u$c;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import a17.f;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import java.lang.Integer;
import wkd.b;
import com.yxcorp.gifshow.retrofit.service.KwaiApiService;
import brd.t;
import ghd.u$a;
import crd.b;

public final class u	// class@000f40
{
    public static final u a;

    static {
       u.a = new u();
    }
    public void u(){
       super();
    }
    public static final void b(Activity p0,g p1,g p2,b$b p3,b$a p4){
       u ou = u.class;
       int i = 0;
       if (PatchProxy.isSupport(ou)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, ou, "2")) {
             return;
          }
       }
       a.p(p1, "errorConsumer");
       ArrayList uArrayList = new ArrayList();
       String str = a1.p(R.string.arg_RES_7f1001a8);
       a.o(str, "CommonUtil.string\(R.string.all_people_can_see\)");
       uArrayList.add(new g(str));
       str = a1.p(R.string.arg_RES_7f1010b6);
       a.o(str, "CommonUtil.string\(R.string.friends_can_see_opt\)");
       uArrayList.add(new g(str));
       str = a1.p(R.string.arg_RES_7f104ab0);
       a.o(str, "CommonUtil.string\(R.stri¡­.stop_show_online_status\)");
       uArrayList.add(new g(str));
       a.m(p0);
       c$a uoa = new c$a(p0);
       uoa.f0(a1.p(R.string.arg_RES_7f103bc8));
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       int onlineStatus = mE.getOnlineStatusSetting();
       Objects.requireNonNull(u.a);
       if (onlineStatus != 1) {
          if (onlineStatus == 3) {
             i = 1;
          }
       }else {
          i = 2;
       }
       uoa.i0(new u$b(p1, p2, p3));
       uoa.j0(uArrayList);
       uoa.g0(R.string.cancel);
       uoa.k0(R.layout.arg_RES_7f0d1648);
       uoa.b0(new d(p0));
       uoa.d0(new u$c(p4));
       uoa.e0(new b(uoa, p0, i));
       f.a(uoa).Y(PopupInterface.a);
       return;
    }
    public final void a(int p0,g p1,g p2){
       if (PatchProxy.isSupport(u.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, u.class, "1")) {
          return;
       }
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       if (p0 == mE.getOnlineStatusSetting()) {
          return;
       }
       b.a(0x330163e).changePrivateOption("online_status_setting", String.valueOf(p0)).subscribe(new u$a(p0, p2), p1);
       return;
    }
}
