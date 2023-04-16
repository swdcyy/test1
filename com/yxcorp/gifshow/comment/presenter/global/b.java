package com.yxcorp.gifshow.comment.presenter.global.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import el9.s;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import java.lang.Boolean;
import brd.y;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import com.yxcorp.gifshow.comment.CommentParams;

public class b extends PresenterV2	// class@0010f1
{
    public CommentsFragment p;
    public CommentParams q;
    public boolean r;
    public boolean s;
    public y t;

    public void b(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.X7(this.p.Vg().i().subscribe(new s(this), Functions.e));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       if (this.s != null) {
          this.t.onNext(Boolean.FALSE);
       }
       this.s = false;
       this.r = false;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.q = this.q8(CommentParams.class);
       this.t = this.r8("COMMENT_PAGES_ATTACH_OBSERVER");
       return;
    }
}
