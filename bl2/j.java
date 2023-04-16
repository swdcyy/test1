package bl2.j;
import com.kuaishou.live.core.show.subscribe.edit.a;
import java.lang.StringBuilder;
import java.lang.String;
import com.kwai.framework.model.user.QCurrentUser;
import d61.l0;
import brd.t;
import j26.c;
import bl2.b;
import bl2.j$b;
import j26.c$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import a51.c;
import bl2.c;
import erd.g;
import bl2.e;
import bl2.f;
import crd.b;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.core.show.subscribe.edit.o;
import androidx.lifecycle.Observer;
import pk2.c;
import pk2.b;
import cjd.e;
import erd.o;
import bl2.h;
import bl2.d;
import bl2.g;
import java.lang.Integer;
import com.kuaishou.live.core.show.subscribe.edit.SubscribeDialogParams;
import com.kuaishou.live.core.show.subscribe.edit.SubscribeDialogParams$DisplayMode;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import androidx.fragment.app.c;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.FragmentActivity;
import java.util.Map;

public class j extends a	// class@000414
{
    public final boolean A;
    public j$a B;
    public String C;
    public final Observer D;
    public b E;
    public final t y;
    public final c z;
    public static final l0 F;
    public static String sLivePresenterClassName;

    static {
       j.F = l0.d("live.subscribe.publish.red-dot."+QCurrentUser.me().getId());
    }
    public void j(t p0,c p1,boolean p2){
       super();
       this.D = new b(this);
       this.y = p0;
       this.z = p1;
       this.A = p2;
       p1.d(new j$b(this));
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       super.E8();
       this.y.doOnSubscribe(new c(this)).subscribe(new e(this), f.b);
       this.w.g().observeForever(this.D);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, j.class, "2")) {
          return;
       }
       super.J8();
       this.w.g().removeObserver(this.D);
       return;
    }
    public int S8(){
       int i = (this.A != null)? 11: 10;
       return i;
    }
    public int W8(){
       int i = (this.A != null)? 2: 1;
       return i;
    }
    public final void Z8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "6")) {
          return;
       }
       this.E = b.b().F0(QCurrentUser.me().getId(), p0).doOnSubscribe(new c(this)).map(new e()).map(h.b).subscribe(new d(this), g.b);
       return;
    }
    public void a9(int p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oj, "10")) {
          return;
       }
       SubscribeDialogParams subscribeDia = new SubscribeDialogParams();
       subscribeDia.b = this.S8();
       subscribeDia.c = this.W8();
       subscribeDia.a = SubscribeDialogParams$DisplayMode.SelectSubscribe;
       subscribeDia.d = this.C;
       subscribeDia.g = true;
       subscribeDia.i = p0;
       QPhoto photo = this.z.getPhoto();
       if (photo != null) {
          photo = photo.mEntity;
          if (photo != null) {
             subscribeDia.e = r1.t1(photo);
          }
       }
       this.w.o(subscribeDia);
       return;
    }
    public c b(){
       Object obj = PatchProxy.apply(null, this, j.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getActivity().getSupportFragmentManager();
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(j.class, null);
       return objectsByTag;
    }
}
