package eub.q;
import eub.i;
import androidx.fragment.app.FragmentActivity;
import q16.a;
import com.kuaishou.edit.draft.Workspace$Type;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import g6c.c;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.fragment.AttrAnimProgressFragment;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import eub.q$a;
import erd.o;

public final class q extends i	// class@002833
{
    public AttrAnimProgressFragment j;
    public final FragmentActivity k;

    public void q(FragmentActivity p0,a p1,Workspace$Type p2){
       a.p(p0, "activity");
       a.p(p1, "editPageParam");
       super(p1, null);
       this.k = p0;
    }
    public t b(c p0){
       q oq = q.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, oq, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "noUiPublishManager");
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("EditPageNoUiToShareParamStageImpl", "initDraft", objArray);
       if (!PatchProxy.applyVoid(null, this, oq, "3")) {
          if (this.j == null) {
             AttrAnimProgressFragment uAttrAnimPro = new AttrAnimProgressFragment();
             this.j = uAttrAnimPro;
             a.m(uAttrAnimPro);
             uAttrAnimPro.vh(true);
             oq = this.j;
             a.m(oq);
             oq.uh(R.dimen.arg_RES_7f070340, 0x7f070340);
          }
          oq = this.j;
          a.m(oq);
          oq.setCancelable(i);
          oq = this.j;
          a.m(oq);
          oq.show(this.k.getSupportFragmentManager(), "processing");
       }
       return super.b(p0);
    }
    public t o(t p0,c p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, q.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "nextStepObservable");
       a.p(p1, "noUiPublishManager");
       p0 = p0.flatMap(new q$a(this));
       a.o(p0, "nextStepObservable.flatM¡­nComplete\(\)\n      }\n    }");
       return p0;
    }
}
