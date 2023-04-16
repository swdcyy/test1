package com.yxcorp.gifshow.albumwrapper.imagecrop.j;
import io.reactivex.g;
import com.yxcorp.gifshow.albumwrapper.imagecrop.k;
import lz6.e$a;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lz6.e;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import com.yxcorp.gifshow.albumwrapper.imagecrop.j$a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import jz6.a;
import android.widget.GridView;
import lz6.b;
import android.app.Dialog;
import nz6.c;
import android.view.View$OnClickListener;
import android.widget.ListAdapter;
import lz6.c;
import android.widget.AdapterView$OnItemClickListener;
import android.view.Window;
import android.view.WindowManager$LayoutParams;
import lz6.d;
import android.content.DialogInterface$OnCancelListener;

public class j implements g	// class@001b6e
{
    public final e$a b;
    public final k c;

    public void j(k p0,e$a p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       e uoe = new e(this.c.b.getActivity());
       uoe.f = this.b;
       uoe.c = 2;
       uoe.d = new j$a(this, p0);
       View view = LayoutInflater.from(uoe.b).inflate(R.layout.arg_RES_7f0d12ad, null);
       a uoa = new a(uoe.b, 0x7f110373);
       uoe.a = view.findViewById(0x7f0a01e6);
       b uob = new b(uoe, uoa);
       if (uoe.g != null) {
          View view1 = c.c(uoe.b, view);
          if (view1 != view) {
             view1.setOnClickListener(uob);
          }
          uoa.setContentView(view1);
       }else {
          uoa.setContentView(view);
       }
       uoa.setContentView(view);
       uoa.setCanceledOnTouchOutside(true);
       view.findViewById(R.id.alert_dialog_cancle_tv).setOnClickListener(uob);
       uoe.a.setNumColumns(uoe.c);
       uoe.a.setAdapter(uoe.f);
       uoe.a.setOnItemClickListener(new c(uoe, uoa));
       Window window = uoa.getWindow();
       if (window != null) {
          window.setWindowAnimations(R.style.arg_RES_7f110364);
          WindowManager$LayoutParams attributes = window.getAttributes();
          if (uoe.g != null) {
             c.a(uoe.b, attributes);
          }
          attributes.width = -1;
          attributes.horizontalMargin = 0;
          attributes.gravity = 81;
       }
       uoa.setCancelable(true);
       uoa.setCanceledOnTouchOutside(true);
       uoa.setOnCancelListener(new d(uoe, uob));
       uoa.show();
       return;
    }
}
