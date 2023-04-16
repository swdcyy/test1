package com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$a;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import android.view.View;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ag6.a;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.widget.PopupBackgroundView;
import com.yxcorp.gifshow.widget.PopupBackgroundView$ArrowPosition;
import lnc.a1;
import android.graphics.drawable.GradientDrawable$Orientation;
import o07.n;

public final class UserListBubble$a implements PopupInterface$f	// class@001a11
{
    public final int b;
    public final int[] c;
    public final View d;
    public final boolean e;

    public void UserListBubble$a(int p0,int[] p1,View p2,boolean p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       p3 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, UserListBubble$a.class, "1");
       if (p3 != PatchProxyResult.class) {
          return p3;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "inflater");
       a.p(p2, "container");
       boolean b = false;
       View view = a.c(p1, R.layout.arg_RES_7f0d0149, p2, b);
       RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
       boolean b1 = true;
       if (recyclerView != null) {
          recyclerView.getLayoutParams().height = this.b;
          recyclerView.setHasFixedSize(b1);
       }
       PopupBackgroundView popupBackgro = view.findViewById(R.id.bubble_background_view);
       if (popupBackgro != null) {
          popupBackgro.setArrowRightInWindow(((float)this.c[b] + ((float)this.d.getMeasuredWidth() / 2.00f)));
          PopupBackgroundView$ArrowPosition tOP = (this.e != null)? PopupBackgroundView$ArrowPosition.TOP: PopupBackgroundView$ArrowPosition.BOTTOM;
          popupBackgro.setArrowPos(tOP);
          int[] ointArray = new int[b1];
          ointArray[b] = a1.a(0x7f060737);
          popupBackgro.e(ointArray, GradientDrawable$Orientation.LEFT_RIGHT);
       }
       return view;
    }
    public void b(c p0){
       n.a(this, p0);
    }
}
