package com.yxcorp.gifshow.detail.comment.limitcomment.ProductCommentLimitFragment$d;
import qvb.f;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import psb.c;
import psb.a;
import qvb.n0;
import com.yxcorp.gifshow.detail.model.response.CommentLimitResponse;
import cjd.e;
import erd.o;
import java.util.List;
import la6.b;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.yxcorp.gifshow.detail.model.response.CommentLimitInfo;

public class ProductCommentLimitFragment$d extends f	// class@001374
{

    public void ProductCommentLimitFragment$d(){
       super();
    }
    public t I1(){
       Object[] objArray = null;
       c obj = PatchProxy.apply(objArray, this, ProductCommentLimitFragment$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.a();
       if (!this.K() && this.L0() != null) {
          objArray = this.L0().getCursor();
       }
       return obj.w(objArray, 18).map(new e());
    }
    public void M1(Object p0,List p1){
       this.h2(p0, p1);
    }
    public void d2(b p0,List p1){
       this.h2(p0, p1);
    }
    public void h2(CommentLimitResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProductCommentLimitFragment$d.class, "2")) {
          return;
       }
       List items = p0.getItems();
       if (!q.f(items)) {
          Iterator iterator = items.iterator();
          while (iterator.hasNext()) {
             CommentLimitInfo uCommentLimi = iterator.next();
             uCommentLimi.mCurrentFriendsVisible = uCommentLimi.mFriendsVisible;
          }
       }
       super.d2(p0, p1);
       return;
    }
}
