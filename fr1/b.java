package fr1.b;
import er1.a;
import dr1.f;
import er1.c;
import xp5.g;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.widget.LiveMultiLineArenaLineMemberModel;
import xp5.i;
import oq1.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import yh3.a;
import fr1.b$b;
import fr1.b$c;
import fr1.b$d;
import androidx.lifecycle.Observer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.ViewModel;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.widget.LiveMultiLineArenaLineMemberModel$MemberCountdownState;
import dr1.d;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Map;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import dr1.e;
import lnc.a1;
import dr1.a;
import java.util.Objects;

public final class b extends a	// class@00238e
{
    public final LiveData g;
    public final MutableLiveData h;
    public final Observer i;
    public final Observer j;
    public final Observer k;
    public final boolean l;
    public final f m;
    public final c n;
    public final g o;
    public final LiveMultiLineArenaLineMemberModel p;
    public final i q;
    public final b r;

    public void b(boolean p0,f p1,c p2,g p3,LiveMultiLineArenaLineMemberModel p4,i p5,b p6){
       a.p(p1, "arenaLineModel");
       a.p(p2, "widgetDelegate");
       a.p(p3, "infoManager");
       a.p(p4, "arenaMemberModel");
       a.p(p5, "liveLogPackageProvider");
       a.p(p6, "multiLineLogParamsProvider");
       super();
       this.l = p0;
       this.m = p1;
       this.n = p2;
       this.o = p3;
       this.p = p4;
       this.q = p5;
       this.r = p6;
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.g = mutableLiveD;
       this.h = new MutableLiveData();
       b$b uob = new b$b(this);
       this.i = uob;
       b$c uoc = new b$c(this);
       this.j = uoc;
       b$d uod = new b$d(this);
       this.k = uod;
       p4.b().observeForever(uob);
       p4.a().observeForever(uoc);
       p1.b().observeForever(uod);
    }
    public LiveData f(){
       return this.h;
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       super.onCleared();
       this.p.b().removeObserver(this.i);
       this.p.a().removeObserver(this.j);
       this.m.b().removeObserver(this.k);
       return;
    }
    public final boolean v0(){
       boolean b;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, uob, "6");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       b = true;
       if (this.l != null && this.p.a().getValue() == LiveMultiLineArenaLineMemberModel$MemberCountdownState.TIMEOUT) {
          obj = this.o.d();
          d value = this.m.d().getValue();
          if (value != null) {
             objArray = value.b();
          }
          if (TextUtils.n(obj, objArray)) {
             d value1 = this.m.d().getValue();
             Object obj1 = PatchProxy.applyOneRefs(value1, this, uob, "7");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else if(value1 != null){
                Map map = value1.c();
                if (map != null) {
                   Collection uCollection = map.values();
                   if (uCollection != null) {
                      Iterator iterator = uCollection.iterator();
                      while (true) {
                         if (iterator.hasNext()) {
                            if (iterator.next().d() == 3) {
                               b1 = true;
                            }
                         }
                      }
                      return b;
                   }
                }
             }
             b1 = false;
             if (b1) {
                goto label_008f ;
             }
          }
       }
    label_008e :
       b = false;
       goto label_008f ;
    }
    public final void w0(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       String str = a1.p(R.string.arg_RES_7f101df2);
       a.o(str, "CommonUtil.string\(R.string.live_arena_line_next\)");
       Objects.requireNonNull(a.f);
       this.u0(R.string.arg_RES_7f1025b5, null, str, a.e);
       return;
    }
}
