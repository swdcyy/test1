package com.yxcorp.gifshow.comment.presenter.global.a$b;
import com.yxcorp.gifshow.comment.e$b;
import com.yxcorp.gifshow.comment.presenter.global.a;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.QComment;
import ek9.c1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import y8c.g;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import fk9.b;
import com.yxcorp.gifshow.comment.e$g;
import jk9.a;
import com.yxcorp.gifshow.comment.config.CommentAtTailEasterEggConfig;
import com.kwai.component.bifrost.BifrostFeatureActivityEntry;
import java.lang.CharSequence;
import yk9.e;
import com.kwai.component.stargateegg.log.StargateEggIntervalLogger;
import java.lang.Throwable;
import com.yxcorp.utility.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import com.yxcorp.gifshow.comment.presenter.global.a$b$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import el9.p;
import java.lang.Runnable;

public class a$b implements e$b	// class@0010ec
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void H5(QPhoto p0,QComment p1){
       c1.e(this, p0, p1);
    }
    public void N1(QPhoto p0,QComment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$b.class, "1")) {
          return;
       }
       g og = this.b.M.g7();
       if (og instanceof b) {
          og.v1(p1);
       }
       return;
    }
    public void P1(QPhoto p0,QComment p1,e$g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a$b.class, "4")) {
          return;
       }
       if (!this.b.F.d() || (this.b.F.c() != null && this.b.F.c().getActivityId() != null)) {
          StargateEggIntervalLogger.e.c(this.b.F.c().getActivityId(), "COMMENT_AT_IMAGE_TAIL", e.b(p1.mComment));
       }
    label_004b :
       return;
    }
    public void c6(QPhoto p0,QComment p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a$b.class, "3")) {
          return;
       }
       if (TextUtils.x(p1.mReplyToCommentId)) {
          this.b.p.h0().getViewTreeObserver().addOnGlobalLayoutListener(new a$b$a(this));
       }
       return;
    }
    public void n7(QPhoto p0,QComment p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a$b.class, "2")) {
          return;
       }
       this.b.p.h0().postDelayed(new p(this, p1), 300);
       return;
    }
    public void t1(QPhoto p0,QComment p1,Throwable p2){
       c1.d(this, p0, p1, p2);
    }
}
