package com.yxcorp.gifshow.homepage.presenter.PhotoSharePresenter$d;
import androidx.recyclerview.widget.RecyclerView$n;
import com.yxcorp.gifshow.homepage.presenter.PhotoSharePresenter;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import cua.a;
import lnc.a1;
import jzc.a;
import g9c.a;

public final class PhotoSharePresenter$d extends RecyclerView$n	// class@00179e
{
    public final PhotoSharePresenter a;

    public void PhotoSharePresenter$d(PhotoSharePresenter p0){
       this.a = p0;
       super();
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, PhotoSharePresenter$d.class, "1")) {
          return;
       }
       a.p(p0, "outRect");
       a.p(p1, "view");
       a.p(p2, "parent");
       a.p(p3, "state");
       PhotoSharePresenter v0 = this.a.V0;
       Boolean uBoolean = null;
       Boolean uBoolean1 = (v0 != null)? v0.b(): uBoolean;
       Boolean tRUE = Boolean.TRUE;
       if (!a.g(uBoolean1, tRUE)) {
          v0 = this.a.V0;
          uBoolean1 = (v0 != null)? v0.c(): uBoolean;
          if (a.g(uBoolean1, tRUE)) {
          label_0056 :
             v0 = this.a.V0;
             if (v0 != null) {
                uBoolean = v0.c();
             }
             int b = a.g(uBoolean, tRUE);
             if (this.a.a9().getItemCount() == 2) {
                b = (b)? a1.d(R.dimen.arg_RES_7f070271): a1.d(R.dimen.arg_RES_7f0702ef);
                p0.right = b;
             }else if(this.a.a9().getItemCount() == 3){
                b = (b)? a1.d(R.dimen.arg_RES_7f07033f): a1.d(R.dimen.arg_RES_7f070283);
                p0.right = b;
             }
          }else {
             p0.right = a1.d(0x7f07104d);
          }
       }else {
          goto label_0056 ;
       }
       return;
    }
}
