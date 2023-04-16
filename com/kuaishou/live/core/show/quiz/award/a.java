package com.kuaishou.live.core.show.quiz.award.a;
import ml8.d;
import jz6.a;
import android.content.Context;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import android.widget.TextView;
import android.os.Bundle;
import android.app.Dialog;
import i2b.a;
import zf2.c;
import android.view.View$OnClickListener;
import android.view.Window;
import lnc.a1;

public class a extends a implements d	// class@000e06
{
    public TextView b;

    public void a(Context p0){
       super(p0, 0x7f110383);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a240a);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       super.onCreate(p0);
       View view = a.a(this.getContext(), R.layout.arg_RES_7f0d0d69);
       this.setContentView(view);
       this.doBindView(view);
       if (!PatchProxy.applyVoid(null, this, a.class, "5")) {
          this.b.setOnClickListener(new c(this));
       }
       return;
    }
    public void onStart(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "3")) {
          return;
       }
       super.onStart();
       if (!PatchProxy.applyVoid(objArray, this, a.class, "4")) {
          this.getWindow().setLayout(a1.e(280.00f), a1.e(200.00f));
       }
       return;
    }
}
