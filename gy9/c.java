package gy9.c;
import com.yxcorp.gifshow.comment.e$c;
import com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement;
import java.lang.Object;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.comment.e$g;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.c2;
import lnc.ba;
import qp7.x0;
import qp7.b;
import dr7.f0;
import w4.e;
import e17.i;
import ek9.d1;

public final class c implements e$c	// class@002509
{
    public final IntensifyFollowElement a;

    public void c(IntensifyFollowElement p0){
       this.a = p0;
       super();
    }
    public void a(QComment p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "2")) {
          return;
       }
       a.p(p0, "comment");
       a.p(p1, "error");
       return;
    }
    public void b(QComment p0,e$g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "1")) {
          return;
       }
       a.p(p0, "comment");
       a.p(p1, "intercept");
       c2.f(IntensifyFollowElement.o0(this.a), IntensifyFollowElement.n0(this.a), "QUICK_COMMENT_INPUT_CARD", -1, p0);
       ba.c(IntensifyFollowElement.o0(this.a).getPhotoId());
       this.a.E().j(null);
       i.a(R.style.arg_RES_7f11066a, 0x7f100107);
       return;
    }
    public void c(){
    }
    public void d(QComment p0,Throwable p1){
       d1.d(this, p0, p1);
    }
}
