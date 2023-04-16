package com.yxcorp.login.userlogin.fragment.QRCodeLoginFragment;
import ml8.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import w1d.j;
import wkd.b;
import m1d.a;
import brd.t;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import java.lang.Boolean;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.CharSequence;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import cjd.e;
import erd.o;
import com.yxcorp.login.userlogin.fragment.QRCodeLoginFragment$b;
import com.yxcorp.login.userlogin.fragment.QRCodeLoginFragment$c;
import android.view.View;
import ekd.m1;
import android.widget.TextView;
import com.yxcorp.login.userlogin.widget.QrCodeActionBar;
import y1d.m4;
import android.view.View$OnClickListener;
import y1d.l4;
import y1d.n4;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$TaskDetailPackage;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$QRCodeDetailPackage;
import q2b.h$b;
import k2b.e0;
import k2b.u1;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import java.util.Objects;
import java.lang.Integer;
import android.widget.ImageView;
import android.text.TextUtils;
import com.yxcorp.login.userlogin.fragment.QRCodeLoginFragment$a;
import android.content.Intent;
import lnc.b9;
import com.trello.rxlifecycle3.components.support.RxFragment;

public class QRCodeLoginFragment extends BaseFragment implements d	// class@001b3f
{
    public TextView j;
    public TextView k;
    public QrCodeActionBar l;
    public TextView m;
    public TextView n;
    public TextView o;
    public String p;
    public boolean q;
    public b r;
    public static final int s;

    public void QRCodeLoginFragment(){
       super();
    }
    public int M(){
       return 1;
    }
    public void ch(){
       if (PatchProxy.applyVoid(null, this, QRCodeLoginFragment.class, "8")) {
          return;
       }
       j.e();
       if (this.q == null) {
          b.a(0x5cfaafff).b(this.p).subscribe(Functions.d(), Functions.d());
       }
       this.getActivity().finish();
       return;
    }
    public void dh(boolean p0){
       if (PatchProxy.isSupport(QRCodeLoginFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, QRCodeLoginFragment.class, "4")) {
          return;
       }
       ProgressFragment progressFrag = new ProgressFragment();
       progressFrag.Jh(this.getActivity().getString(R.string.arg_RES_7f103667));
       progressFrag.show(this.getActivity().getSupportFragmentManager(), "runner");
       b.a(0x5cfaafff).a(this.p, p0).map(new e()).subscribe(new QRCodeLoginFragment$b(this, progressFrag), new QRCodeLoginFragment$c(this, progressFrag));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QRCodeLoginFragment.class, "1")) {
          return;
       }
       this.m = m1.f(p0, 0x7f0a296f);
       this.k = m1.f(p0, 0x7f0a2970);
       this.j = m1.f(p0, 0x7f0a296e);
       this.n = m1.f(p0, 0x7f0a296c);
       this.l = m1.f(p0, 0x7f0a3f6a);
       this.o = m1.f(p0, 0x7f0a2989);
       m1.a(p0, new m4(this), R.id.login_confirm_ok);
       m1.a(p0, new l4(this), R.id.login_confirm_cancel);
       m1.a(p0, new n4(this), R.id.login_retry);
       return;
    }
    public void eh(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QRCodeLoginFragment.class, "7")) {
          return;
       }
       this.j.setText(p0);
       this.j.setVisibility(0);
       this.m.setVisibility(4);
       this.n.setVisibility(4);
       this.o.setVisibility(0);
       if (!PatchProxy.applyVoidOneRefs(p0, null, j.class, "12")) {
          ClientTaskDetail$TaskDetailPackage taskDetailPa = new ClientTaskDetail$TaskDetailPackage();
          ClientTaskDetail$QRCodeDetailPackage qRCodeDetail = new ClientTaskDetail$QRCodeDetailPackage();
          taskDetailPa.qrcodeDetailPackage = qRCodeDetail;
          qRCodeDetail.media = 1;
          qRCodeDetail.qrcodeContent = p0;
          h$b uob = h$b.d(8, 45);
          uob.s(taskDetailPa);
          u1.p0("", null, uob);
       }
       return;
    }
    public int getPage(){
       return 18;
    }
    public String getUrl(){
       return "ks://qrcodelogin";
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       QRCodeLoginFragment i2;
       QrCodeActionBar i2;
       QRCodeLoginFragment qRCodeLoginF = this;
       View obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, QRCodeLoginFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       boolean b = false;
       obj = a.g(p0, R.layout.arg_RES_7f0d12b4, p1, b);
       qRCodeLoginF.doBindView(obj);
       QRCodeLoginFragment l = qRCodeLoginF.l;
       int i = 0x7f0819e0;
       int i1 = -1;
       Objects.requireNonNull(l);
       if (PatchProxy.isSupport(QrCodeActionBar.class)) {
          if (PatchProxy.applyThreeRefs(Integer.valueOf(i), Integer.valueOf(i1), "", l, QrCodeActionBar.class, "7") != PatchProxyResult.class) {
          }else if(PatchProxy.isSupport(QrCodeActionBar.class)){
             QrCodeActionBar obj1 = PatchProxy.applyOneRefs(Integer.valueOf(i), l, QrCodeActionBar.class, "8");
             if (obj1 != PatchProxyResult.class) {
                l = obj1;
             }else {
             label_0074 :
                obj1 = l.c;
                if (obj1 != null) {
                   if (obj1 instanceof TextView) {
                      obj1.setText(i);
                   }else if(obj1 instanceof ImageView){
                      obj1.setImageResource(i);
                   }
                   l.c.setVisibility(b);
                }
             }
          }else {
             goto label_0074 ;
          }
          Objects.requireNonNull(l);
          if (PatchProxy.isSupport(QrCodeActionBar.class)) {
             i2 = PatchProxy.applyOneRefs(Integer.valueOf(i1), l, QrCodeActionBar.class, "9");
             if (i2 != PatchProxyResult.class) {
             label_00d3 :
                Objects.requireNonNull(i2);
                if (PatchProxy.applyOneRefs("", i2, QrCodeActionBar.class, "16") != PatchProxyResult.class) {
                }else if(i2.e == null){
                   if (!TextUtils.isEmpty("")) {
                      i2.e.setText("");
                      i2.e.setVisibility(b);
                   }else {
                      i2.e.setVisibility(4);
                   }
                }
             }
          }
          if (PatchProxy.isSupport(QrCodeActionBar.class)) {
             i2 = PatchProxy.applyTwoRefs(Integer.valueOf(i1), Boolean.TRUE, l, QrCodeActionBar.class, "10");
             if (i2 != PatchProxyResult.class) {
                l = i2;
             }else {
             label_00c7 :
                i2 = l.d;
                if (i2 != null) {
                   i2.setVisibility(4);
                   l.h = null;
                }
             }
          }else {
             goto label_00c7 ;
          }
          i2 = l;
          goto label_00d3 ;
       }else {
          int i3 = 4;
          goto label_005a ;
       }
       l = qRCodeLoginF.l;
       l.j = b;
       l.g = new QRCodeLoginFragment$a(qRCodeLoginF);
       qRCodeLoginF.q = this.getActivity().getIntent().getBooleanExtra("qrLoginFailedView", b);
       String stringExtra = this.getActivity().getIntent().getStringExtra("qrLoginToken");
       qRCodeLoginF.p = stringExtra;
       if (TextUtils.isEmpty(stringExtra) && qRCodeLoginF.q == null) {
          this.getActivity().finish();
       }
       if (qRCodeLoginF.q != null) {
          qRCodeLoginF.eh(this.getActivity().getIntent().getStringExtra("qrLoginMessage"));
       }else {
          qRCodeLoginF.j.setVisibility(4);
          qRCodeLoginF.m.setVisibility(b);
          qRCodeLoginF.n.setVisibility(b);
          qRCodeLoginF.o.setVisibility(4);
       }
       qRCodeLoginF.k.setText(this.getActivity().getIntent().getStringExtra("loginText"));
       if (!PatchProxy.applyVoid(null, null, j.class, "10")) {
          ClientTaskDetail$TaskDetailPackage taskDetailPa = new ClientTaskDetail$TaskDetailPackage();
          ClientTaskDetail$QRCodeDetailPackage qRCodeDetail = new ClientTaskDetail$QRCodeDetailPackage();
          taskDetailPa.qrcodeDetailPackage = qRCodeDetail;
          qRCodeDetail.media = 1;
          h$b uob = h$b.d(1, 45);
          uob.s(taskDetailPa);
          u1.p0("", null, uob);
       }
       return obj;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, QRCodeLoginFragment.class, "9")) {
          return;
       }
       b9.a(this.r);
       this.r = null;
       super.onDestroy();
       return;
    }
}
