package com.yxcorp.gifshow.comment.presenter.global.e;
import java.lang.Runnable;
import com.yxcorp.gifshow.comment.presenter.global.f;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import g9c.d;
import y8c.g;
import g9c.a;
import com.kuaishou.android.model.mix.QComment;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import pk9.e;
import com.yxcorp.gifshow.widget.popup.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.widget.popup.KwaiBubbleOption;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import com.kwai.library.widget.popup.bubble.a$c;
import lnc.a1;
import com.kwai.library.widget.popup.common.c$b;
import el9.t;
import android.view.View$OnClickListener;
import el9.x;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import android.content.Context;
import hl9.t;
import com.kwai.library.widget.popup.bubble.a;
import k07.p;

public final class e implements Runnable	// class@0010f4
{
    public final f b;
    public final int c;

    public void e(f p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       boolean b;
       e tb = this.b;
       e tc = this.c;
       RecyclerView recyclerView = tb.t.h0();
       f uof = f.class;
       if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidTwoRefs(recyclerView, Integer.valueOf(tc), tb, uof, "6")) {
          LinearLayoutManager layoutManage = recyclerView.getLayoutManager();
          int i = tb.t.ia().b1();
          int i1 = layoutManage.E() - i;
          if (tc >= (layoutManage.h() - i) && tc <= i1) {
             e uoe = tc;
             while (uoe <= i1) {
                if (uoe >= tc && uoe < tb.t.g7().getItemCount()) {
                   QComment qComment = tb.t.g7().N0(uoe);
                   if (qComment == null || qComment.mType == 2) {
                      if (qComment != null && !TextUtils.x(qComment.mConversation)) {
                         int i2 = uoe + i;
                         View view = layoutManage.findViewByPosition(i2);
                         if (view != null) {
                            int i3 = 0x7f0a0846;
                            if (view.findViewById(i3) != null) {
                               View view1 = view.findViewById(i3);
                               if (!PatchProxy.applyVoidTwoRefs(view1, qComment, tb, uof, "8")) {
                                  a obj = PatchProxy.apply(null, tb, uof, "7");
                                  if (obj != PatchProxyResult.class) {
                                     b = obj.booleanValue();
                                  }else if(tb.x.e() && tb.y.e()){
                                     b = true;
                                  }else {
                                     b = false;
                                  }
                                  if (b && view1 != null) {
                                     obj = new a(tb.getActivity());
                                     obj.I0(0x2727);
                                     obj.K0(KwaiBubbleOption.f);
                                     obj.D0(BubbleInterface$Position.BOTTOM);
                                     obj.o0(view1);
                                     obj.q0(true);
                                     obj.F0(a1.p(R.string.arg_RES_7f1030d1));
                                     obj.T(3000);
                                     obj.A(true);
                                     obj.P(true);
                                     obj.K(new t(tb));
                                     obj.M(new x(tb, qComment));
                                     if (t.W8(view1.getContext())) {
                                        tb.v = p.c(obj);
                                        break ;
                                     }else {
                                        tb.v = p.e(obj);
                                        break ;
                                     }
                                  }
                               }
                            }
                         }
                      }
                   }
                }
                uoe = uoe + 1;
             }
          }
       }
    label_0117 :
       return;
    }
}
