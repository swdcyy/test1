package com.kuaishou.merchant.transaction.live.dynamic.component.message.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.transaction.live.dynamic.component.message.a$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.google.gson.JsonObject;
import java.lang.StringBuilder;
import com.kuaishou.merchant.transaction.base.dynamic.component.message.MessageModel;
import com.google.gson.JsonElement;
import bo4.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ue4.g;
import android.widget.TextView;
import android.widget.EditText;
import com.kuaishou.merchant.transaction.live.dynamic.component.message.a$a;
import android.text.TextWatcher;
import android.view.View;
import com.kuaishou.pagedy.container.widget.DynamicRootRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import com.kuaishou.merchant.transaction.live.dynamic.component.message.ListenKeyboardPopupWindow;
import android.app.Activity;
import com.kuaishou.merchant.transaction.live.dynamic.component.message.b;
import java.util.Objects;
import android.widget.PopupWindow;
import android.view.Window;
import yi4.a;
import java.lang.Runnable;
import android.os.Handler;

public class a extends PresenterV2	// class@00079a
{
    public MessageModel p;
    public TextView q;
    public EditText r;
    public Fragment s;
    public ListenKeyboardPopupWindow t;
    public RecyclerView u;
    public TranslateAnimation v;
    public int[] w;
    public Handler x;

    public void a(Fragment p0){
       super();
       int[] ointArray = new int[2];
       this.w = ointArray;
       this.x = new a$b(this);
       this.s = p0;
    }
    public void E8(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          return;
       }
       if (this.p == null) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "7")) {
          JsonObject jsonObject = new JsonObject();
          jsonObject.c0("type", "getStashPageData");
          jsonObject.c0("data", "remind"+this.p.mSellerId);
          String str = b.a(this.s, jsonObject.toString());
          if (!TextUtils.x(str)) {
             jsonObject = g.e(str);
             if (jsonObject != null) {
                String str1 = "content";
                if (jsonObject.s0(str1) && !TextUtils.x(jsonObject.e0(str1).w())) {
                   this.p.mContent = jsonObject.e0(str1).w();
                }
             }
          }
       }
       if (!TextUtils.x(this.p.mLabel)) {
          this.q.setText(this.p.mLabel);
       }
       if (!TextUtils.x(this.p.mHint)) {
          this.r.setHint(this.p.mHint);
       }
       this.r.setText(this.p.mContent);
       this.r.addTextChangedListener(new a$a(this));
       if (!PatchProxy.applyVoid(objArray, this, uoa, "4")) {
          a ts = this.s;
          if (ts != null) {
             View view = ts.getView().findViewById(R.id.root_recyclerView);
             if (view != null && view instanceof DynamicRootRecyclerView) {
                this.u = view;
             }
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "5")) {
          if (this.t == null) {
             ListenKeyboardPopupWindow listenKeyboa = new ListenKeyboardPopupWindow(this.getActivity());
             this.t = listenKeyboa;
             listenKeyboa.c = new b(this);
          }
          uoa = this.t;
          Objects.requireNonNull(uoa);
          if (!PatchProxy.applyVoid(objArray, uoa, ListenKeyboardPopupWindow.class, "2") && !uoa.isShowing()) {
             View decorView = uoa.f.getWindow().getDecorView();
             decorView.postDelayed(new a(uoa, decorView), 100);
          }
       }
    label_011e :
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "8")) {
          return;
       }
       this.x.removeCallbacksAndMessages(null);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.q = p0.findViewById(0x7f0a2c38);
       this.r = p0.findViewById(0x7f0a2c36);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.s8(MessageModel.class);
       return;
    }
}
