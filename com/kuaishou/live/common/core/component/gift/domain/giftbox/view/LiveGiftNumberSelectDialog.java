package com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftNumberSelectDialog;
import ml8.d;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import lnc.a1;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.ViewGroup$MarginLayoutParams;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftNumberSelectDialog$b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.util.List;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftNumberSelectDialog$a;
import java.util.ArrayList;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftNumberSelectDialog$LiveGiftBatchNumberItem;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.fragment.app.DialogFragment;
import android.view.LayoutInflater;
import i2b.a;
import zi1.i;
import android.view.View$OnClickListener;
import android.app.Dialog;
import android.view.Window;
import qka.b;

public class LiveGiftNumberSelectDialog extends LiveSafeDialogFragment implements d	// class@001225
{
    public RecyclerView s;
    public LiveGiftNumberSelectDialog$d t;
    public int u;
    public View v;
    public b w;
    public LiveGiftNumberSelectDialog$a x;
    public static final int y;

    static {
       LiveGiftNumberSelectDialog.y = a1.e(15.00f);
    }
    public void LiveGiftNumberSelectDialog(){
       super();
       this.u = 1;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftNumberSelectDialog.class, "3")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a222f);
       return;
    }
    public void onActivityCreated(Bundle p0){
       List list;
       ArrayList uArrayList;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftNumberSelectDialog.class, "7")) {
          return;
       }
       super.onActivityCreated(p0);
       Object[] objArray = null;
       int i = 1;
       if (PatchProxy.applyVoid(objArray, this, LiveGiftNumberSelectDialog.class, "8") || (this.v != null && this.getActivity() != null)) {
          int[] ointArray = new int[2];
          this.v.getLocationOnScreen(ointArray);
          int[] ointArray1 = new int[2];
          n.f(this.getActivity()).getLocationOnScreen(ointArray1);
          ViewGroup$MarginLayoutParams layoutParams = this.s.getLayoutParams();
          layoutParams.bottomMargin = (n.j(this.getActivity()) - (ointArray[i] - ointArray1[i])) + a1.e(5.00f);
          int i2 = 0;
          layoutParams.leftMargin = ((ointArray[i2] - ointArray1[i2]) + (this.v.getWidth() / 2)) - (layoutParams.width / 2);
          this.s.setLayoutParams(layoutParams);
       }
    label_0073 :
       this.u = this.ch("maxBatchCount", i);
       LiveGiftNumberSelectDialog$b uob = new LiveGiftNumberSelectDialog$b(this);
       LiveGiftNumberSelectDialog tu = this.u;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(LiveGiftNumberSelectDialog.class)) {
          list = PatchProxy.applyOneRefs(Integer.valueOf(tu), this, LiveGiftNumberSelectDialog.class, "9");
          if (list != patchProxyRe) {
          }else {
          label_009e :
             LiveGiftNumberSelectDialog tx = this.x;
             if (tx != null) {
                list = tx.a(tu);
             }else if(PatchProxy.isSupport(LiveGiftNumberSelectDialog.class)){
                uArrayList = PatchProxy.applyOneRefs(Integer.valueOf(tu), objArray, LiveGiftNumberSelectDialog.class, "10");
                if (uArrayList != patchProxyRe) {
                label_00c0 :
                   list = uArrayList;
                }
             }
             uArrayList = new ArrayList();
             int i1 = 1314;
             if (tu >= i1) {
                uArrayList.add(new LiveGiftNumberSelectDialog$LiveGiftBatchNumberItem(i1, a1.p(R.string.arg_RES_7f103a61)));
             }
             i1 = 520;
             if (tu >= i1) {
                uArrayList.add(new LiveGiftNumberSelectDialog$LiveGiftBatchNumberItem(i1, a1.p(R.string.arg_RES_7f103a64)));
             }
             i1 = 188;
             if (tu >= i1) {
                uArrayList.add(new LiveGiftNumberSelectDialog$LiveGiftBatchNumberItem(i1, a1.p(R.string.arg_RES_7f103a62)));
             }
             i1 = 66;
             if (tu >= i1) {
                uArrayList.add(new LiveGiftNumberSelectDialog$LiveGiftBatchNumberItem(i1, a1.p(R.string.arg_RES_7f103a65)));
             }
             i1 = 30;
             if (tu >= i1) {
                uArrayList.add(new LiveGiftNumberSelectDialog$LiveGiftBatchNumberItem(i1, a1.p(R.string.arg_RES_7f103a63)));
             }
             i1 = 10;
             if (tu >= i1) {
                uArrayList.add(new LiveGiftNumberSelectDialog$LiveGiftBatchNumberItem(i1, a1.p(R.string.arg_RES_7f103a60)));
             }
             if (tu >= i) {
                uArrayList.add(new LiveGiftNumberSelectDialog$LiveGiftBatchNumberItem(i, a1.p(R.string.arg_RES_7f103a5f)));
             }
             uArrayList.add(LiveGiftNumberSelectDialog$LiveGiftBatchNumberItem.createEditGiftBatchNumberItem());
             goto label_00c0 ;
          }
       }else {
          goto label_009e ;
       }
       uob.W0(list);
       this.s.setAdapter(uob);
       this.s.setLayoutManager(new LinearLayoutManager(this.getContext()));
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftNumberSelectDialog.class, "4")) {
          return;
       }
       super.onCreate(p0);
       this.setStyle(0, R.style.arg_RES_7f110382);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveGiftNumberSelectDialog.class, "5");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       View view = a.g(p0, R.layout.arg_RES_7f0d0cea, null, false);
       view.setOnClickListener(new i(this));
       this.doBindView(view);
       this.nh(false);
       return view;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, LiveGiftNumberSelectDialog.class, "6")) {
          return;
       }
       super.onStart();
       Dialog dialog = this.getDialog();
       if (dialog != null) {
          b.a(dialog.getWindow());
          dialog.getWindow().setDimAmount(0);
          dialog.getWindow().getDecorView().setPadding(0, 0, 0, 0);
          dialog.getWindow().setLayout(-1, -1);
          dialog.getWindow().setWindowAnimations(0);
          dialog.setCanceledOnTouchOutside(true);
       }
       return;
    }
}
