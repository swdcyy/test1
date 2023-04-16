package com.yxcorp.gifshow.detail.comment.limitcomment.ProductCommentLimitFragment$a;
import androidx.recyclerview.widget.GridLayoutManager$b;
import com.yxcorp.gifshow.detail.comment.limitcomment.ProductCommentLimitFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import g9c.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;

public class ProductCommentLimitFragment$a extends GridLayoutManager$b	// class@001371
{
    public final ProductCommentLimitFragment e;

    public void ProductCommentLimitFragment$a(ProductCommentLimitFragment p0){
       this.e = p0;
       super();
    }
    public int f(int p0){
       ProductCommentLimitFragment$a uoa = ProductCommentLimitFragment$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 < this.e.ia().b1() || p0 >= (this.e.ia().getItemCount() - this.e.ia().Z0())) {
          return 3;
       }else {
          return 1;
       }
    }
}
