package com.yxcorp.gifshow.detail.comment.limitcomment.ProductCommentLimitFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.detail.comment.limitcomment.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import e9c.k;
import e9c.f;
import y8c.q;
import e9c.i;
import hka.l;
import com.yxcorp.gifshow.detail.comment.limitcomment.g;
import com.yxcorp.gifshow.detail.comment.limitcomment.j;
import com.yxcorp.gifshow.detail.comment.limitcomment.i;
import dx9.c;
import y8c.t;
import ex9.b;
import java.util.List;
import im8.c;
import java.lang.Integer;
import com.yxcorp.gifshow.detail.comment.limitcomment.ProductCommentLimitFragment$b;
import java.util.Map;
import com.yxcorp.gifshow.detail.comment.limitcomment.ProductCommentLimitFragment$c;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import cw9.c;
import g9c.d;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$n;
import y8c.g;
import dx9.h;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.GridLayoutManager;
import android.content.Context;
import com.yxcorp.gifshow.detail.comment.limitcomment.ProductCommentLimitFragment$a;
import androidx.recyclerview.widget.GridLayoutManager$b;
import qvb.i;
import com.yxcorp.gifshow.detail.comment.limitcomment.ProductCommentLimitFragment$d;

public class ProductCommentLimitFragment extends RecyclerFragment	// class@001375
{
    public ProductCommentLimitFragment$b F;
    public d G;

    public void ProductCommentLimitFragment(){
       super();
       this.G = new d();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, ProductCommentLimitFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new k());
       obj.U7(new f(this));
       obj.U7(new i(this));
       obj.U7(new g());
       obj.U7(new j());
       obj.U7(new i());
       obj.U7(new c(this));
       PatchProxy.onMethodExit(ProductCommentLimitFragment.class, "1");
       return obj;
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, ProductCommentLimitFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b(this);
    }
    public int M(){
       return 1;
    }
    public boolean S1(){
       return false;
    }
    public List fg(){
       List obj = PatchProxy.apply(null, this, ProductCommentLimitFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.fg();
       obj.add(new c("LOAD_MORE_OFFSET", Integer.valueOf(12)));
       ProductCommentLimitFragment$b uob = new ProductCommentLimitFragment$b();
       this.F = uob;
       uob.b = this.G;
       obj.add(uob);
       return obj;
    }
    public int getLayoutResId(){
       return 0x7f0d04ab;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProductCommentLimitFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(ProductCommentLimitFragment.class, null);
       return objectsByTag;
    }
    public String o(){
       return "SETTING_COMMENT_PERMISSION";
    }
    public void th(){
       if (PatchProxy.applyVoid(null, this, ProductCommentLimitFragment.class, "6")) {
          return;
       }
       super.th();
       this.h0().addItemDecoration(new ProductCommentLimitFragment$c(c.b(this.getResources(), R.dimen.arg_RES_7f0703d0), 3, this.ia()));
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, ProductCommentLimitFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new h(this.G);
    }
    public RecyclerView$LayoutManager xh(){
       GridLayoutManager obj = PatchProxy.apply(null, this, ProductCommentLimitFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new GridLayoutManager(this.getContext(), 3);
       obj.m1(new ProductCommentLimitFragment$a(this));
       return obj;
    }
    public i yh(){
       ProductCommentLimitFragment$d obj = PatchProxy.apply(null, this, ProductCommentLimitFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ProductCommentLimitFragment$d();
       this.G.c = obj;
       return obj;
    }
}
