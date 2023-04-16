package cl9.u1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import cl9.u1$a;
import erd.g;
import crd.b;
import brd.t;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import al9.a;

public final class u1 extends PresenterV2	// class@000670
{
    public QPhoto p;
    public RecyclerFragment q;
    public a r;
    public t s;
    public boolean t;

    public void u1(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, u1.class, "2")) {
          return;
       }
       u1 ts = this.s;
       if (ts == null) {
          a.S("mCommentDifferNotifyFinishObservable");
       }
       this.X7(ts.subscribe(new u1$a(this)));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, u1.class, "1")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.p = obj;
       obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.q = obj;
       obj = this.r8("PAGE_LIST");
       a.o(obj, "inject\(PageAccessIds.PAGE_LIST\)");
       this.r = obj;
       obj = this.r8("COMMENT_DIFFER_NOTIFY_FINISH_OBSERVABLE");
       a.o(obj, "inject\(CommentAccessIds.¡­NOTIFY_FINISH_OBSERVABLE\)");
       this.s = obj;
       return;
    }
}
