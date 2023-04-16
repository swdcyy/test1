package np1.a;
import gp1.a;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.common.core.component.multichat.audience.core.LiveAudienceMultiChatCoreModel;
import wp1.a;
import yp1.g;
import zp1.l;
import yp1.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import np1.a$a;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.MutableLiveData;
import xp1.b;
import up1.b;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;

public final class a extends ViewController implements a	// class@0033a2
{
    public final Observer j;
    public final LiveAudienceMultiChatCoreModel k;
    public final a l;
    public final g m;
    public final l n;
    public final b o;

    public void a(LiveAudienceMultiChatCoreModel p0,a p1,g p2,l p3,b p4){
       a.p(p0, "chatCoreModel");
       a.p(p1, "chatDelegate");
       a.p(p2, "renderModel");
       a.p(p3, "renderCellDelegate");
       a.p(p4, "chatRenderModel");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.n = p3;
       this.o = p4;
       this.j = new a$a(this);
    }
    public void E1(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       a.p(p0, "servingUserList");
       this.o.b().setValue(p0);
       return;
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.k.m().c().observeForever(this.j);
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.k.m().c().removeObserver(this.j);
       return;
    }
}
