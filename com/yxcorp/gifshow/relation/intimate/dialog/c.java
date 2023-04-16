package com.yxcorp.gifshow.relation.intimate.dialog.c;
import com.yxcorp.gifshow.relation.intimate.dialog.e;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.model.IntimateRelationDialogParams;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.relation.intimate.dialog.a;
import ok.x;
import com.google.common.base.Suppliers;
import com.yxcorp.gifshow.relation.intimate.dialog.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.IntimateTag;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.GridLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import tyc.i2;
import java.lang.Integer;
import tyc.j2;
import androidx.recyclerview.widget.RecyclerView$n;
import abc.a;
import java.util.ArrayList;
import java.util.Collection;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.relation.intimate.dialog.c$a;
import com.yxcorp.gifshow.widget.m;
import android.widget.TextView;
import k2b.e0;
import cbc.b;
import com.kwai.library.widget.popup.common.c;
import com.kwai.framework.model.user.QCurrentUser;

public class c extends e	// class@0018e8
{
    public final x m;
    public final x n;

    public void c(GifshowActivity p0,IntimateRelationDialogParams p1,PopupInterface$h p2){
       super(p0, p1, p2);
       this.m = Suppliers.a(a.b);
       this.n = Suppliers.a(b.b);
       this.l = 162;
    }
    public int f(){
       return 0x7f0d063c;
    }
    public void p(View p0){
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "1")) {
          return;
       }
       this.k(p0, true);
       this.h(p0);
       this.o(p0, this.i.mTargetName);
       this.n(p0, a1.r(R.string.arg_RES_7f10178b, this.i.mIntimateTag.nickName));
       this.j(p0, a1.r(R.string.arg_RES_7f10176b, this.i.mIntimateTag.nickName));
       if (!PatchProxy.applyVoidOneRefs(p0, this, uoc, "5")) {
          RecyclerView recyclerView = p0.findViewById(R.id.tips_recycler_view);
          recyclerView.setLayoutManager(new GridLayoutManager(this.g, 2));
          i2 oi2 = new i2(this.m.get().intValue(), 0, 0, this.n.get().intValue(), 0, 0, null);
          recyclerView.addItemDecoration(v4);
          a uoa = new a();
          ArrayList uArrayList = new ArrayList();
          uArrayList.add(Integer.valueOf(R.string.arg_RES_7f1014cd));
          uArrayList.add(Integer.valueOf(R.string.arg_RES_7f101526));
          uArrayList.add(Integer.valueOf(R.string.arg_RES_7f100aff));
          uArrayList.add(Integer.valueOf(R.string.arg_RES_7f1036c5));
          uoa.L0(uArrayList);
          recyclerView.setAdapter(uoa);
       }
       this.i(p0, new c$a(this));
       if (!PatchProxy.applyVoid(null, this, uoc, "4")) {
          e tf = this.f;
          if (tf != null) {
             IntimateRelationDialogParams mRelationSta = this.i.mRelationStatus;
             if (mRelationSta == null) {
                tf.setText(R.string.arg_RES_7f10002e);
             }else if(mRelationSta == true){
                tf.setText(R.string.arg_RES_7f1001c6);
                this.f.setEnabled(false);
             }else if(mRelationSta == 2){
                tf.setText(R.string.arg_RES_7f100dab);
                this.f.setEnabled(false);
             }
          }
       }
       return;
    }
    public void q(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       super.q();
       b.a(this.i.mTargetId, this.g);
       return;
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       super.r();
       b.a(this.i.mTargetId, this.g);
       return;
    }
    public void s(c p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "7")) {
          return;
       }
       super.s(p0, p1);
       if (p1 != 10 && p1 != 11) {
          IntimateRelationDialogParams mTargetId = this.i.mTargetId;
          e tg = this.g;
          if (!PatchProxy.applyVoidTwoRefs(mTargetId, tg, null, b.class, "27")) {
             b.h(mTargetId, QCurrentUser.me().getId(), 1, "CLOSE", true, tg);
          }
       }
       return;
    }
    public void u(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "6")) {
          return;
       }
       IntimateRelationDialogParams mTargetId = this.i.mTargetId;
       e tg = this.g;
       if (!PatchProxy.applyVoidTwoRefs(mTargetId, tg, null, b.class, "22")) {
          b.i(mTargetId, QCurrentUser.me().getId(), 1, tg);
       }
       return;
    }
}
