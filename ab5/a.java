package ab5.a;
import im8.g;
import java.lang.Object;
import androidx.collection.ArraySet;
import io.reactivex.subjects.PublishSubject;
import xl8.b;
import java.lang.Integer;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import uh5.e;
import on5.b;
import androidx.fragment.app.Fragment;
import com.kwai.kcube.TabIdentifier;
import as6.a;
import d6a.u;
import android.content.Context;
import com.yxcorp.utility.n;
import db5.b;
import androidx.recyclerview.widget.RecyclerView;
import g9c.d;
import com.kwai.robust.PatchProxyResult;
import ab5.o;
import java.util.Map;
import java.util.HashMap;

public class a implements g	// class@000048
{
    public int b;
    public Set c;
    public PublishSubject d;
    public Set e;
    public f f;
    public Set g;
    public a h;
    public int i;
    public PublishSubject j;
    public b k;
    public boolean l;
    public PublishSubject m;

    public void a(){
       super();
       this.c = new ArraySet();
       this.d = PublishSubject.g();
       this.e = new ArraySet();
       this.g = new ArraySet();
       this.i = -1;
       this.j = PublishSubject.g();
       this.k = new b(Integer.valueOf(0));
       this.m = PublishSubject.g();
    }
    public void a(RecyclerFragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       int i = a1.d(R.dimen.arg_RES_7f070fdf);
       if (e.f() && !a.c(p0, b.C)) {
          int i1 = (u.a())? n.A(a1.c()): 0;
          this.b = i + i1;
       }
       this.f = new b(p0.h0(), p0.ia());
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new o();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a.class, new o());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
}
