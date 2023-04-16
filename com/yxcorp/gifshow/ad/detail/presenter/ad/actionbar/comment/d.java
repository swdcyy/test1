package com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.comment.d;
import s85.c;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import s85.e;
import s85.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.comment.ThanosAdCommentTopBarElement;

public final class d implements c	// class@00156c
{

    public void d(){
       super();
    }
    public b a(QPhoto p0,e p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       return new ThanosAdCommentTopBarElement(p0);
    }
    public boolean b(QPhoto p0,e p1,String p2){
       return true;
    }
}
