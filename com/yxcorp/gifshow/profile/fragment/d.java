package com.yxcorp.gifshow.profile.fragment.d;
import erd.g;
import com.yxcorp.gifshow.profile.fragment.MyProfilePhotoFragment;
import java.lang.Object;
import cda.f;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.profile.fragment.BaseProfileFeedFragment;
import s1c.r0;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.w;
import com.kwai.framework.model.user.UserOwnerCount;
import java.lang.Math;
import java.util.HashMap;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import java.util.List;
import v2c.e;
import v2c.g;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Collection;
import ekd.q;
import k3c.u0;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.profile.http.l;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Map;
import k3c.v0;

public final class d implements g	// class@001321
{
    public final MyProfilePhotoFragment b;

    public void d(MyProfilePhotoFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       boolean b2;
       d b = this.b;
       HashMap obj = p0;
       Objects.requireNonNull(b);
       if (PatchProxy.applyVoidOneRefs(obj, b, MyProfilePhotoFragment.class, "16")) {
       }else if(obj == null){
          f b1 = obj.b;
          if (b1 == 5) {
             if (b.K == 1) {
                b.Nh();
             }
          }else if(obj.a == null){
             User mOwnerCount = b.G.b.mOwnerCount;
             int i = 3;
             if (b1 == 6 && b.Vg().c()) {
                b.q().remove(obj.a);
                if (w.j0(obj.a.mEntity)) {
                   b.q().remove(obj.a);
                }
                mOwnerCount.mPhoto = Math.max((mOwnerCount.mPhoto - 1), 0);
                if (obj.a.isPublic() && b.G.c == 1) {
                   mOwnerCount.mPublicPhoto = Math.max((mOwnerCount.mPublicPhoto - 1), 0);
                }else {
                   r0 c = b.G.c;
                   if (c == 2) {
                      mOwnerCount.mPrivatePhoto = Math.max((mOwnerCount.mPrivatePhoto - 1), 0);
                   }else if(c == i){
                      mOwnerCount.mLike = Math.max((mOwnerCount.mLike - 1), 0);
                   }
                }
                obj = new HashMap(i);
                obj.put("mPublicPhoto", String.valueOf(mOwnerCount.mPublicPhoto));
                obj.put("mPrivatePhoto", String.valueOf(mOwnerCount.mPrivatePhoto));
                obj.put("mLike", String.valueOf(mOwnerCount.mLike));
                g.g(KsLogProfileTag.TAB_COUNT.appendTag("MyProfilePhotoFragment"), "PHOTO_DELETED", obj);
             }else {
                b1 = obj.b;
                if (b1 == 7) {
                   if (b.Mh(obj.a, 2)) {
                      mOwnerCount.mPrivatePhoto = mOwnerCount.mPrivatePhoto + 1;
                      if (!b.h0().getLayoutManager().i0() && (!q.f(b.q().getItems()) && !b.q().getItems().indexOf(obj.a))) {
                         k1.s(new u0(b), b, 200);
                      }
                   }
                   if (b.G.c == 1) {
                      if (b.q().remove(obj.a)) {
                         mOwnerCount.mPublicPhoto = Math.max((mOwnerCount.mPublicPhoto - 1), 0);
                      }
                      if (w.j0(obj.a.mEntity)) {
                         b.q().remove(obj.a);
                      }
                   }
                   obj = new HashMap(2);
                   obj.put("mPublicPhoto", String.valueOf(mOwnerCount.mPublicPhoto));
                   obj.put("mPrivatePhoto", String.valueOf(mOwnerCount.mPrivatePhoto));
                   g.g(KsLogProfileTag.TAB_COUNT.appendTag("MyProfilePhotoFragment"), "PHOTO_PRIVACY", obj);
                }else if(b1 == 8 || b1 == 9){
                   if (b.K == 1) {
                      l ol = b.q();
                      String photoId = obj.a.getPhotoId();
                      Objects.requireNonNull(ol);
                      Object obj1 = PatchProxy.applyOneRefs(photoId, ol, l.class, "5");
                      if (obj1 != PatchProxyResult.class) {
                         b2 = obj1.booleanValue();
                      }else if(ol.y.isEmpty()){
                         b2 = false;
                      }else {
                         b2 = ol.y.containsKey(photoId);
                      }
                      if (b2) {
                         b.Nh();
                      }
                   }
                   if (b.Mh(obj.a, 1)) {
                      mOwnerCount.mPublicPhoto = mOwnerCount.mPublicPhoto + 1;
                      if (!b.h0().getLayoutManager().i0() && (!q.f(b.q().getItems()) && !b.q().getItems().indexOf(obj.a))) {
                         k1.s(new v0(b), b, 200);
                      }
                   }
                   if (b.G.c == 2 && b.q().remove(obj.a)) {
                      mOwnerCount.mPrivatePhoto = Math.max((mOwnerCount.mPrivatePhoto - 1), 0);
                   }
                   obj = new HashMap(3);
                   obj.put("mPublicPhoto", String.valueOf(mOwnerCount.mPublicPhoto));
                   obj.put("mPrivatePhoto", String.valueOf(mOwnerCount.mPrivatePhoto));
                   g.g(KsLogProfileTag.TAB_COUNT.appendTag("MyProfilePhotoFragment"), "PHOTO_PUBLIC", obj);
                }
             }
             b.Lh();
          }
       }
       return;
    }
}
