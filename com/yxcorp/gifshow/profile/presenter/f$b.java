package com.yxcorp.gifshow.profile.presenter.f$b;
import com.yxcorp.gifshow.profile.presenter.f$c;
import com.yxcorp.gifshow.profile.presenter.f;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import qvb.a;
import java.util.Iterator;
import java.lang.Number;
import com.yxcorp.gifshow.profile.model.feed.RewardNotFocusHostFeed;
import java.lang.Boolean;

public class f$b extends f$c	// class@001447
{
    public boolean d;
    public final f e;

    public void f$b(f p0,QPhoto p1){
       this.e = p0;
       super(p0, p1);
       this.d = this.b.isLiked();
    }
    public void b(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f$b uob = f$b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "2")) {
          return;
       }
       String photoId = this.b.getPhotoId();
       Object[] objArray1 = PatchProxy.applyOneRefs(photoId, this, uob, "4");
       if (objArray1 != patchProxyRe) {
       }else {
          f r2 = this.e.r;
          if (r2 != null) {
             Iterator iterator = r2.getItems().iterator();
             while (true) {
                if (iterator.hasNext()) {
                   QPhoto qPhoto = iterator.next();
                   if ((qPhoto.getPhotoId()).equals(photoId)) {
                      objArray = qPhoto;
                   }
                }
             }
          }
          objArray1 = objArray;
       }
       if (this.b.isLiked()) {
          if (objArray1 == null) {
             f r = this.e.r;
             if (r != null) {
                List items = r.getItems();
                Iterator obj = PatchProxy.applyOneRefs(items, this, uob, "3");
                if (obj != patchProxyRe) {
                   i = obj.intValue();
                }else {
                   i = 0;
                   if (items != null && items.size()) {
                      obj = items.iterator();
                      while (obj.hasNext()) {
                         if (obj.next().mEntity instanceof RewardNotFocusHostFeed) {
                            i = i + 1;
                         }else {
                            continue ;
                         }
                      }
                   }
                }
                r.add(i, this.b);
             }
          }
       }else if(objArray1 != null){
          f r1 = this.e.r;
          if (r1 != null) {
             r1.remove(objArray1);
             this.e.u = true;
          }
       }
       this.d = this.b.isLiked();
       return;
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, f$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.b.isLiked() != this.d && this.e.r != null)? true: false;
       return b;
    }
}
