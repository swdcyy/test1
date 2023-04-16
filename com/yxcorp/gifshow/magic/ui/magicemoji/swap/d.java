package com.yxcorp.gifshow.magic.ui.magicemoji.swap.d;
import y8c.g;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.d$a;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMediaArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import g9c.a;
import com.yxcorp.gifshow.models.QMedia;
import com.yxcorp.gifshow.magic.data.swap.models.SwapQMedia;
import android.view.ViewGroup;
import y8c.f;
import android.view.View;
import ekd.p1;
import kotlin.jvm.internal.a;
import j5b.b;
import j5b.e;
import java.util.Objects;
import android.widget.TextView;
import lnc.a1;
import java.lang.CharSequence;
import j5b.c;
import ml8.c;
import java.util.List;
import java.util.Collection;
import ekd.q;

public final class d extends g	// class@001c3a
{
    public d$a A;
    public SwapMediaArrayList w;
    public int x;
    public boolean y;
    public boolean z;

    public void d(d$a p0){
       super();
       this.A = p0;
       this.w = new SwapMediaArrayList();
       this.x = -1;
    }
    public int f0(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uod, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       QMedia qMedia = this.N0(p0);
       if (qMedia instanceof SwapQMedia) {
          SwapQMedia mErrorTextTy = qMedia.mErrorTextType;
          if (mErrorTextTy == 1) {
             return 2;
          }else if(mErrorTextTy == 2){
             return 3;
          }
       }
       return 1;
    }
    public f h1(ViewGroup p0,int p1){
       View view;
       b uob;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uod, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = "ViewUtils.inflate\(parent¡­t.magic_swap_item_layout\)";
       if (p1 != 1) {
          if (p1 != 2) {
             if (p1 != 3) {
                view = p1.h(p0, R.layout.arg_RES_7f0d0ee2);
                a.o(view, str);
                uob = new b(this, this.A);
             }else {
                view = p1.h(p0, R.layout.arg_RES_7f0d0ee4);
                a.o(view, "ViewUtils.inflate\(parent¡­o_permission_item_layout\)");
                uob = new e(this.A);
             }
          }else {
             view = p1.h(p0, R.layout.arg_RES_7f0d0ee3);
             a.o(view, "ViewUtils.inflate\(parent¡­swap_no_data_item_layout\)");
             Objects.requireNonNull(view, "null cannot be cast to non-null type android.widget.TextView");
             View view1 = view;
             int i = (this.z != null)? 0x7f103107: 0x7f103106;
             view1.setText(a1.p(i));
             view1.setClickable(false);
             uob = new c();
          }
       }else {
          view = p1.h(p0, R.layout.arg_RES_7f0d0ee2);
          a.o(view, str);
          uob = new b(this, this.A);
       }
       return new f(view, uob);
    }
    public final int r1(QMedia p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 == null) {
          return -1;
       }
       List list = this.Q0();
       if (q.f(list)) {
          return -1;
       }
       int i = 0;
       a.o(list, "qMediaList");
       int i1 = list.size();
       while (true) {
          if (i >= i1) {
             return -1;
          }
          QMedia qMedia = list.get(i);
          if (qMedia != null && !p0.id - qMedia.id) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return i;
    }
    public final QMedia s1(){
       Object obj = PatchProxy.apply(null, this, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.N0(this.x);
    }
    public final int t1(){
       return this.x;
    }
    public final SwapMediaArrayList u1(){
       return this.w;
    }
    public final void v1(int p0){
       this.x = p0;
    }
}
