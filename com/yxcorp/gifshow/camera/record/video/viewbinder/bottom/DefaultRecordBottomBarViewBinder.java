package com.yxcorp.gifshow.camera.record.video.viewbinder.bottom.DefaultRecordBottomBarViewBinder;
import com.yxcorp.gifshow.camera.record.video.viewbinder.bottom.AbsRecordBottomBarViewBinder;
import c35.c;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.viewbinder.BaseViewBinder;
import android.view.View;
import c35.p;
import android.widget.ImageView;
import kotlin.jvm.internal.a;
import ekd.m1;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.ViewStub;
import androidx.constraintlayout.widget.Guideline;
import q5b.f;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import ag6.a;

public class DefaultRecordBottomBarViewBinder extends AbsRecordBottomBarViewBinder	// class@000f9a
{

    public void DefaultRecordBottomBarViewBinder(c p0){
       super(p0);
    }
    public KwaiImageView K(){
       Object obj = PatchProxy.apply(null, this, DefaultRecordBottomBarViewBinder.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p.c(this.d, 0x7f0a05dd, 0x7f0a05dc);
    }
    public ImageView L(){
       Object obj = PatchProxy.apply(null, this, DefaultRecordBottomBarViewBinder.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p.c(this.d, 0x7f0a05c6, 0x7f0a05c5);
    }
    public void s(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DefaultRecordBottomBarViewBinder.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       this.e = m1.f(p0, 0x7f0a0086);
       this.j = m1.f(p0, 0x7f0a0620);
       this.k = m1.f(p0, 0x7f0a0622);
       this.l = m1.f(p0, 0x7f0a0621);
       this.n = m1.f(p0, 0x7f0a061f);
       this.o = m1.f(p0, 0x7f0a061b);
       this.p = m1.f(p0, 0x7f0a2a16);
       this.q = m1.f(p0, 0x7f0a2a18);
       this.r = m1.f(p0, 0x7f0a2a14);
       this.u = m1.f(p0, 0x7f0a05de);
       this.v = m1.f(p0, 0x7f0a05db);
       this.w = m1.f(p0, 0x7f0a05dd);
       this.x = m1.f(p0, 0x7f0a2c9c);
       this.t = m1.f(p0, 0x7f0a05c9);
       this.y = m1.f(p0, 0x7f0a05c6);
       this.f = m1.f(p0, 0x7f0a34a6);
       this.g = m1.f(p0, 0x7f0a2c6b);
       this.h = m1.f(p0, 0x7f0a0ff7);
       this.i = m1.f(p0, 0x7f0a0081);
       this.m = m1.f(p0, 0x7f0a0623);
       if (f.a() && this.E() != null) {
          TextView textView = this.E();
          a.m(textView);
          textView.setText(R.string.arg_RES_7f104a51);
       }
       this.s = m1.f(p0, 0x7f0a061d);
       return;
    }
    public View u(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, DefaultRecordBottomBarViewBinder.class, "4");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.c(p0, R.layout.arg_RES_7f0d0163, p1, false);
       a.o(view, "inflater.inflate\(R.layou¡­een_v3, container, false\)");
       return view;
    }
    public int w(){
       return 0x7f0a0086;
    }
}
