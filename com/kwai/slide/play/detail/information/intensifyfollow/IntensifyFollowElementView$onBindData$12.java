package com.kwai.slide.play.detail.information.intensifyfollow.IntensifyFollowElementView$onBindData$12;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import dr7.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.util.List;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import android.view.View;
import qp7.d;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.content.Context;
import com.yxcorp.utility.n;
import lnc.a1;
import xq7.a;
import xq7.a$a;
import kotlin.jvm.internal.a;
import or7.v;

public final class IntensifyFollowElementView$onBindData$12 extends FunctionReferenceImpl implements l	// class@0017ea
{

    public void IntensifyFollowElementView$onBindData$12(a p0){
       super(1, p0, a.class, "setEmojiBitmapList", "setEmojiBitmapList\(Ljava/util/List;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IntensifyFollowElementView$onBindData$12.class, "1")) {
          return;
       }
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, a.class, "4")) {
          View view = null;
          if (treceiver.p().getParent() != null) {
             ViewParent parent = treceiver.p().getParent();
             Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
             view = parent.getWidth();
          }
          if (view <= 0) {
             view = (n.z(treceiver.p().getContext()) - a1.d(0x7f070267)) - a.w.a();
          }
          a u = treceiver.u;
          if (u == null) {
             a.S("mQuickCommentViewHolder");
          }
          u.e(p0, view);
       }
       return;
    }
}
