package com.yxcorp.gifshow.detail.comment.limitcomment.l$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.detail.comment.limitcomment.l;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.detail.comment.limitcomment.d;
import com.yxcorp.gifshow.detail.model.response.CommentLimitInfo;
import java.lang.Boolean;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.yxcorp.gifshow.detail.comment.limitcomment.d$a;

public class l$a extends m	// class@001385
{
    public final l c;

    public void l$a(l p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       Object obj;
       boolean b;
       Iterator iterator;
       if (PatchProxy.applyVoidOneRefs(p0, this, l$a.class, "1")) {
          return;
       }
       l$a tc = this.c;
       l u = tc.u;
       l t = tc.t;
       l r = tc.r;
       Objects.requireNonNull(u);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       if (!PatchProxy.applyVoidTwoRefs(t, r, u, uod, "6")) {
          CommentLimitInfo mCurrentFrie = t.mCurrentFriendsVisible;
          if (mCurrentFrie == true) {
             obj = PatchProxy.applyOneRefs(r, u, uod, "3");
             b = (obj != patchProxyRe)? obj.booleanValue(): u.a(u.e, u.d, r);
             if (!b) {
                if (!q.f(u.a)) {
                   iterator = u.a.iterator();
                   while (iterator.hasNext()) {
                      iterator.next().a(true, r);
                   }
                   t.mCurrentFriendsVisible = 0;
                }
             }
          }else if(mCurrentFrie == null){
             obj = PatchProxy.applyOneRefs(r, u, uod, "4");
             b = (obj != patchProxyRe)? obj.booleanValue(): u.a(u.d, u.e, r);
             if (!b) {
                if (!q.f(u.a)) {
                   iterator = u.a.iterator();
                   while (iterator.hasNext()) {
                      iterator.next().a(0, r);
                   }
                   t.mCurrentFriendsVisible = 1;
                }
             }
          }
          if (t.mCurrentFriendsVisible == t.mFriendsVisible) {
             u.d.remove(r.getPhotoId());
             u.e.remove(r.getPhotoId());
          }
       }
    label_00ba :
       return;
    }
}
