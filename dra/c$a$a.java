package dra.c$a$a;
import erd.g;
import dra.c$a;
import java.lang.String;
import brd.v;
import java.lang.Object;
import com.yxcorp.gifshow.growth.vfc.model.GrowthVfcInviteResponse;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.growth.vfc.model.GrowthVfcInviteDialog;
import dra.b;
import java.lang.Enum;
import kotlin.NoWhenBranchMatchedException;
import fra.f;
import com.yxcorp.gifshow.growth.vfc.model.NonReceiveCouponDialog;
import fra.c;
import com.yxcorp.gifshow.growth.vfc.model.ShowShareDialog;
import fra.a;
import com.yxcorp.gifshow.growth.vfc.model.ShowShareAwardDialog;
import dra.a;
import fra.b;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import tkd.b;
import tkd.d;
import ss3.a;
import brd.g;

public final class c$a$a implements g	// class@002502
{
    public final c$a b;
    public final String c;
    public final v d;

    public void c$a$a(c$a p0,String p1,v p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       f uof;
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a$a.class, "1")) {
       }else {
          p0 = p0.dialog;
          int i = b.b[p0.dialogType.ordinal()];
          if (i != 1) {
             if (i != 2) {
                if (i == 3 || i == 4) {
                   GrowthVfcInviteDialog errorDialog = p0.errorDialog;
                   NonReceiveCouponDialog shareObjectI = (errorDialog != null)? errorDialog.shareObjectId: null;
                   uof = new f(errorDialog, shareObjectI, this.c);
                }else {
                   throw new NoWhenBranchMatchedException();
                }
             }else {
                uof = new c(p0.showShareDialog, this.c);
             }
          }else {
             uof = new a(p0.showShareAwardDialog, this.c, this.b.c);
          }
          new a(uof).c();
          Boolean tRUE = Boolean.TRUE;
          if (a.g(p0.closeWidget, tRUE)) {
             d.a(0x50a4ea96).Yn();
          }
          this.d.onNext(tRUE);
          this.d.onComplete();
       }
       return;
    }
}
