package com.yxcorp.gifshow.detail.comment.limitcomment.d;
import java.lang.Object;
import java.util.ArrayList;
import e0a.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Boolean;
import e17.i;
import qvb.q;
import qvb.a;

public final class d	// class@00137a
{
    public List a;
    public final int b;
    public ProductCommentLimitFragment$d c;
    public List d;
    public List e;

    public void d(){
       super();
       this.a = new ArrayList();
       this.d = new ArrayList();
       this.e = new ArrayList();
       Object obj = PatchProxy.apply(null, null, j.class, "7");
       int i = 9;
       int i1 = (obj != PatchProxyResult.class)? obj.intValue(): a.t().a("comment_limit_photo_threshold", i);
       if (i1 > 0) {
          i = i1;
       }
       this.b = i;
       return;
    }
    public final boolean a(List p0,List p1,QPhoto p2){
       int i;
       String obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0.contains(p2.getPhotoId())) {
          p0.add(p2.getPhotoId());
          obj = 1;
       }else {
          obj = null;
       }
       if (p1.contains(p2.getPhotoId())) {
          p1.remove(p2.getPhotoId());
          i = 1;
       }else {
          i = 0;
       }
       if ((p0.size() + p1.size()) > this.b) {
          if (obj) {
             p0.remove(p2.getPhotoId());
          }
          if (i) {
             p1.add(p2.getPhotoId());
          }
          i.a(R.style.arg_RES_7f11066a, 0x7f1007a2);
          return true;
       }else {
          return false;
       }
    }
    public List b(){
       return this.e;
    }
    public List c(){
       return this.d;
    }
    public void d(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       this.c.h(p0);
       return;
    }
    public void e(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.c.f(p0);
       return;
    }
}
