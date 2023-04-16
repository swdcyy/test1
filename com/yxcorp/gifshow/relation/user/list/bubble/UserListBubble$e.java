package com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$e;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import kotlin.jvm.internal.Ref$ObjectRef;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.popup.common.c;
import com.yxcorp.utility.n;
import java.lang.Math;

public final class UserListBubble$e implements ViewTreeObserver$OnGlobalLayoutListener	// class@001a15
{
    public final Ref$ObjectRef b;
    public final int[] c;
    public final View d;

    public void UserListBubble$e(Ref$ObjectRef p0,int[] p1,View p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void onGlobalLayout(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, UserListBubble$e.class, "1")) {
          return;
       }
       Ref$ObjectRef element = this.b.element;
       if (element != null) {
          if (element.K()) {
             objArray = element;
          }
          if (objArray != null && Math.abs((this.c[1] - n.o(this.d)[1])) > 50) {
             objArray.q(3);
          }
       }
    label_0037 :
       return;
    }
}
