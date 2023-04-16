package com.kwai.emotionsdk.customize.CustomizeEmotionPreviewFragment;
import androidx.fragment.app.Fragment;
import crd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import android.content.Intent;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import ag6.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.TextView;
import com.kwai.emotionsdk.widget.FrescoImageView;
import fk5.e;
import android.view.View$OnClickListener;
import com.kwai.emotionsdk.customize.g;
import ak5.j;
import ak5.a;
import ak5.a$c;
import java.util.Objects;
import ac.a;
import com.facebook.drawee.view.DraweeView;
import android.net.Uri;
import ub.b;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.Integer;
import android.net.Uri$Builder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.System;
import fk5.h;
import java.util.concurrent.Callable;
import brd.t;
import jl5.m;
import brd.z;
import fk5.f;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public class CustomizeEmotionPreviewFragment extends Fragment	// class@000da2
{
    public final String b;
    public long c;
    public Button d;
    public Button e;
    public TextView f;
    public TextView g;
    public FrescoImageView h;
    public FrescoImageView i;
    public String j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public a p;
    public static final int q;

    public void CustomizeEmotionPreviewFragment(){
       super();
       this.b = "CustomizeEmotionPreviewFragment";
       this.k = false;
       this.l = 0;
       this.m = 0;
       this.n = 0;
       this.o = 0;
       this.p = new a();
    }
    public final void L(){
       if (PatchProxy.applyVoid(null, this, CustomizeEmotionPreviewFragment.class, "9")) {
          return;
       }
       FragmentActivity activity = this.getActivity();
       if (activity != null) {
          activity.setResult(0, new Intent());
          activity.finish();
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, CustomizeEmotionPreviewFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.c(p0, 0x7f0d03e7, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, CustomizeEmotionPreviewFragment.class, "11")) {
          return;
       }
       super.onDestroyView();
       this.p.dispose();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       CustomizeEmotionPreviewFragment th;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CustomizeEmotionPreviewFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (this.getArguments() != null) {
          String str = this.getArguments().getString("key_image_path");
          this.j = str;
          if (TextUtils.isEmpty(str)) {
             this.L();
             return;
          }else if(PatchProxy.applyVoidOneRefs(p0, this, CustomizeEmotionPreviewFragment.class, "5")){
             this.d = p0.findViewById(0x7f0a1716);
             this.e = p0.findViewById(0x7f0a3643);
             this.f = p0.findViewById(0x7f0a3f7b);
             this.g = p0.findViewById(0x7f0a2b54);
             this.i = p0.findViewById(0x7f0a4455);
             this.h = p0.findViewById(0x7f0a443f);
          }
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, CustomizeEmotionPreviewFragment.class, "6")) {
             this.d.setOnClickListener(new e(this));
             this.e.setOnClickListener(new g(this));
          }
          if (!PatchProxy.applyVoid(objArray, this, CustomizeEmotionPreviewFragment.class, "10")) {
             String str1 = null;
             if (j.o().i() != null && (j.o().i().a != null && !TextUtils.isEmpty(j.o().i().a.c()))) {
                th = this.h;
                String str2 = j.o().i().a.c();
                Objects.requireNonNull(th);
                if (!PatchProxy.applyVoidOneRefs(str2, th, FrescoImageView.class, "13")) {
                   if (str2 == null) {
                      th.setController(objArray);
                   }else {
                      th.x(Uri.parse(str2), str1, str1, objArray);
                   }
                }
             }else {
                th = this.h;
                int i = 0x7f080144;
                Objects.requireNonNull(th);
                if (!PatchProxy.isSupport(FrescoImageView.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(i), Integer.valueOf(str1), Integer.valueOf(str1), th, FrescoImageView.class, "28")) {
                   th.w(new Uri$Builder().scheme("res").path(String.valueOf(i)).build(), str1, str1);
                }
             }
             this.g.setText(new SimpleDateFormat("a:  h:mm").format(new Date(System.currentTimeMillis())));
          }
          if (!PatchProxy.applyVoid(objArray, this, CustomizeEmotionPreviewFragment.class, "3")) {
             this.p.c(t.fromCallable(new h(this)).subscribeOn(m.c).observeOn(m.a).subscribe(new f(this), Functions.d()));
          }
       }else {
          this.L();
       }
       return;
    }
}
