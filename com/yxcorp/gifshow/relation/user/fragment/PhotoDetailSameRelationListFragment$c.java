package com.yxcorp.gifshow.relation.user.fragment.PhotoDetailSameRelationListFragment$c;
import s2b.a;
import com.yxcorp.gifshow.relation.user.fragment.PhotoDetailSameRelationListFragment;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import com.kwai.framework.model.user.User;

public class PhotoDetailSameRelationListFragment$c implements a	// class@001a0a
{
    public final PhotoDetailSameRelationListFragment a;

    public void PhotoDetailSameRelationListFragment$c(PhotoDetailSameRelationListFragment p0){
       this.a = p0;
       super();
    }
    public void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailSameRelationListFragment$c.class, "1")) {
          return;
       }
       if (p0 != null) {
          this.a.J.addAll(p0);
       }
       return;
    }
    public boolean b(Object p0){
       boolean b;
       if (p0.mShowed != null) {
          b = false;
       }else {
          p0.mShowed = true;
          b = true;
       }
       return b;
    }
}
