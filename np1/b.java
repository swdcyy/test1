package np1.b;
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
import np1.b$a;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.MutableLiveData;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.live.common.core.component.chat.widget.LiveChatCountdownDialog;
import com.kuaishou.live.common.core.component.chat.widget.LiveChatCountdownDialog$DialogMode;
import np1.d;
import com.kuaishou.live.common.core.component.chat.widget.LiveChatCountdownDialog$a;
import np1.c;
import android.content.DialogInterface$OnDismissListener;
import xp1.b;
import up1.b;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;

public final class b extends ViewController implements a	// class@0033a4
{
    public LiveChatCountdownDialog j;
    public final Observer k;
    public final LiveAudienceMultiChatCoreModel l;
    public final a m;
    public final g n;
    public final l o;
    public final b p;

    public void b(LiveAudienceMultiChatCoreModel p0,a p1,g p2,l p3,b p4){
       a.p(p0, "chatCoreModel");
       a.p(p1, "chatDelegate");
       a.p(p2, "renderModel");
       a.p(p3, "renderDelegate");
       a.p(p4, "chatRenderModel");
       super();
       this.l = p0;
       this.m = p1;
       this.n = p2;
       this.o = p3;
       this.p = p4;
       this.k = new b$a(this);
    }
    public void E1(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "5")) {
          return;
       }
       a.p(p0, "servingUserList");
       this.p.b().setValue(p0);
       return;
    }
    public void F2(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "2")) {
          c uoc = this.m.b();
          if (uoc != null) {
             b tj = this.j;
             if (tj != null) {
                tj.dismiss();
             }
             this.j = objArray;
             LiveChatCountdownDialog liveChatCoun = new LiveChatCountdownDialog(LiveChatCountdownDialog$DialogMode.ANCHOR, d.a);
             this.j = liveChatCoun;
             liveChatCoun.k0(new c(this));
             b tj1 = this.j;
             if (tj1 != null) {
                tj1.Cb(uoc, "LiveAnchorMultiChatOverlayController");
             }
          }
       }
       this.l.m().c().observeForever(this.k);
       return;
    }
    public void J2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "3")) {
          return;
       }
       b tj = this.j;
       if (tj != null) {
          tj.dismiss();
       }
       this.j = objArray;
       this.l.m().c().removeObserver(this.k);
       return;
    }
}
