package gy9.e;
import com.yxcorp.gifshow.comment.e$c;
import com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement;
import m9a.t$c;
import java.lang.Object;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Throwable;
import ek9.d1;
import com.yxcorp.gifshow.comment.e$g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.c2;
import lnc.ba;
import bk5.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.app.Application;
import o56.a;
import gy9.e$a;
import android.content.Context;
import com.yxcorp.gifshow.detail.util.e$b;
import crd.b;
import com.yxcorp.gifshow.detail.util.e;
import qp7.b;

public final class e implements e$c	// class@00250c
{
    public final IntensifyFollowElement a;
    public final int b;
    public final t$c c;

    public void e(IntensifyFollowElement p0,int p1,t$c p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void a(QComment p0,Throwable p1){
       d1.a(this, p0, p1);
    }
    public void b(QComment p0,e$g p1){
       t$c a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "1")) {
          return;
       }
       a.p(p1, "intercept");
       c2.f(IntensifyFollowElement.o0(this.a), IntensifyFollowElement.n0(this.a), "QUICK_COMMENT_EMOJI", this.b, p0);
       ba.c(IntensifyFollowElement.o0(this.a).getPhotoId());
       a = this.c.a;
       if (a != null && !TextUtils.x(a.b)) {
          b uob = e.a(a.b(), this.c.a.b, new e$a(this));
          a.o(uob, "QuickCommentEmotionAnima¡­          \)\n            }");
          this.a.j(uob);
       }
       return;
    }
    public void c(){
       d1.b(this);
    }
    public void d(QComment p0,Throwable p1){
       d1.d(this, p0, p1);
    }
}
