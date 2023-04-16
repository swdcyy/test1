package com.yxcorp.gifshow.util.resource.f;
import jz6.a;
import android.content.Context;
import java.util.ArrayList;
import com.yxcorp.gifshow.util.resource.f$c;
import android.app.Dialog;
import com.yxcorp.gifshow.util.resource.n$c;
import qfc.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import q87.c;
import com.yxcorp.gifshow.util.resource.n;
import java.lang.IllegalArgumentException;
import android.view.View;
import android.view.View$OnClickListener;
import com.kwai.feature.post.api.model.DownloadStatus;
import boc.b;
import z3b.t0;
import java.util.List;
import ekd.p0;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import android.graphics.Typeface;
import com.yxcorp.gifshow.util.resource.f$b;
import java.lang.Enum;
import java.util.Iterator;
import android.widget.ProgressBar;
import android.widget.Button;
import android.os.Bundle;
import android.widget.ImageView;
import boc.l;
import boc.m;
import com.yxcorp.gifshow.util.resource.f$a;
import android.content.DialogInterface$OnCancelListener;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.l0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public abstract class f extends a	// class@000ce6
{
    public TextView b;
    public ImageView c;
    public ProgressBar d;
    public Button e;
    public boolean f;
    public boolean g;
    public View$OnClickListener h;
    public DownloadStatus i;
    public n$c j;
    public List k;
    public f$c l;

    public void f(Context p0){
       super(p0, 0x7f110362);
       this.f = false;
       this.g = false;
       this.k = new ArrayList();
    }
    public void cancel(){
       f tl = this.l;
       if (tl != null) {
          tl.b();
       }
       super.cancel();
       return;
    }
    public abstract void d(n$c p0);
    public void dismiss(){
       f tl = this.l;
       if (tl != null) {
          tl.c();
       }
       try{
          super.dismiss();
       }catch(java.lang.Exception e0){
          Object[] objArray = new Object[0];
          a.C().u("ResourceDownloadBaseDialog", e0, objArray);
       }
       if (this.f != null) {
          return;
       }else {
          try{
             tl = this.j;
             if (tl != null) {
                n.w(tl);
             }
          }catch(java.lang.IllegalArgumentException e0){
             e0.printStackTrace();
          }
          return;
       }
    }
    public void e(){
       if (this.f != null) {
          f th = this.h;
          if (th != null) {
             th.onClick(this.e);
          }
          return;
       }else if(this.i == DownloadStatus.DOWNLOAD_USE_MOBILE_NET_PROMPT){
          this.j(false);
       }else {
          this.j(true);
       }
       return;
    }
    public abstract void f(b p0,DownloadStatus p1,float p2);
    public abstract void g(boolean p0);
    public void h(f$c p0){
       this.l = p0;
    }
    public void i(t0 p0){
       if (!this.k.contains(p0)) {
          this.k.add(p0);
       }
       return;
    }
    public final void j(boolean p0){
       if (p0 && (p0.A(this.getContext()) && !p0.F(this.getContext()))) {
          this.k(DownloadStatus.DOWNLOAD_USE_MOBILE_NET_PROMPT);
          return;
       }else if(!p0.C(this.getContext())){
          this.k(DownloadStatus.DOWNLOAD_NETWORK_UNCONNECTED);
          return;
       }else {
          this.g = true;
          this.g(p0);
          return;
       }
    }
    public void k(DownloadStatus p0){
       Iterator iterator;
       this.i = p0;
       f tb = this.b;
       tb.setTextColor(ContextCompat.getColor(tb.getContext(), R.color.arg_RES_7f061f81));
       this.b.setTypeface(Typeface.DEFAULT);
       int i = f$b.a[p0.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                if (i != 4) {
                   if (i == 5) {
                      iterator = this.k.iterator();
                      while (iterator.hasNext()) {
                         iterator.next().onSuccess();
                      }
                      this.dismiss();
                   }
                }else {
                   this.d.setVisibility(8);
                   this.d.setProgress(0);
                   this.e.setVisibility(0);
                   this.b.setText(R.string.arg_RES_7f100c5b);
                   this.e.setText(R.string.arg_RES_7f100c5d);
                   iterator = this.k.iterator();
                   while (iterator.hasNext()) {
                      iterator.next().a();
                   }
                }
             }else {
                this.d.setVisibility(8);
                this.d.setProgress(0);
                this.e.setVisibility(0);
                this.b.setText(R.string.arg_RES_7f100dd5);
                this.e.setText(R.string.arg_RES_7f100c5d);
                iterator = this.k.iterator();
                while (iterator.hasNext()) {
                   iterator.next().onFailed();
                }
             }
          }else {
             this.d.setVisibility(8);
             this.e.setVisibility(0);
             this.b.setText(R.string.arg_RES_7f100c58);
             this.e.setText(R.string.arg_RES_7f100c57);
          }
       }else {
          this.d.setVisibility(0);
          this.e.setVisibility(4);
          this.b.setText(R.string.arg_RES_7f100c59);
       }
       return;
    }
    public void onCreate(Bundle p0){
       Object[] objArray;
       super.onCreate(p0);
       this.setContentView(R.layout.arg_RES_7f0d131e);
       this.b = this.findViewById(0x7f0a3b55);
       this.c = this.findViewById(0x7f0a03a4);
       this.d = this.findViewById(0x7f0a0c1b);
       Button uButton = this.findViewById(R.id.download_btn);
       this.e = uButton;
       uButton.setOnClickListener(new l(this));
       this.findViewById(R.id.close_iv).setOnClickListener(new m(this));
       int i = 0;
       if (this.f != null) {
          this.d.setVisibility(8);
          this.d.setProgress(i);
          this.e.setVisibility(i);
          return;
       }else if(this.i != null){
          objArray = new Object[i];
          a.C().s("ResourceDownloadBaseDialog", "即将显示失败/断网dialog", objArray);
          this.k(this.i);
       }else {
          objArray = new Object[i];
          a.C().s("ResourceDownloadBaseDialog", "即将从头开始下载", objArray);
          this.e();
       }
       f$a uoa = new f$a(this);
       this.j = uoa;
       this.d(uoa);
       return;
    }
    public void setOnCancelListener(DialogInterface$OnCancelListener p0){
       super.setOnCancelListener(p0);
    }
    public void show(){
       f tl = this.l;
       if (tl != null) {
          tl.onShow();
       }
       u1.u0(4, l0.c(""), l0.b("pop_up_32_43_1"));
       super.show();
       return;
    }
}
