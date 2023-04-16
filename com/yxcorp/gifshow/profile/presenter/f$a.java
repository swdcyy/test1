package com.yxcorp.gifshow.profile.presenter.f$a;
import com.yxcorp.gifshow.profile.presenter.f$c;
import com.yxcorp.gifshow.profile.presenter.f;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import qvb.a;
import java.util.Iterator;
import qvb.n0;
import com.yxcorp.gifshow.util.MemoryStorageUtil$Key;
import java.lang.Integer;
import com.yxcorp.gifshow.util.MemoryStorageUtil;
import java.lang.Boolean;

public class f$a extends f$c	// class@001446
{
    public boolean d;
    public final f e;

    public void f$a(f p0,QPhoto p1){
       this.e = p0;
       super(p0, p1);
       this.d = this.b.isCollected();
    }
    public void b(){
       f$a uoa = f$a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
          return;
       }
       String photoId = this.b.getPhotoId();
       Object[] objArray1 = PatchProxy.applyOneRefs(photoId, this, uoa, "3");
       if (objArray1 != PatchProxyResult.class) {
       }else {
          f q1 = this.e.q;
          if (q1 != null) {
             Iterator iterator = q1.getItems().iterator();
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
       f q = this.e.q;
       int i = 1;
       if (q != null && q.hasMore()) {
          MemoryStorageUtil.c(MemoryStorageUtil$Key.EUserInfoChanged, Integer.valueOf(i));
       }
       if (this.b.isCollected()) {
          q = this.e.q;
          if (q != null && objArray1 == null) {
             q.add(0, this.b);
          }
       }else {
          q = this.e.q;
          if (q != null && objArray1 != null) {
             q.remove(this.b);
             this.e.u = i;
          }
       }
       this.d = this.b.isCollected();
       return;
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, f$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.d != this.b.isCollected() && this.e.q != null)? true: false;
       return b;
    }
}
