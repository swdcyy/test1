package com.kuaishou.live.core.show.closepage.audience.basicinfo.a;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import g52.i;
import f52.a;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.widget.TextView;
import com.kuaishou.live.core.basic.model.QLivePushEndInfo$AuthorLabel;
import lnc.a1;
import java.lang.CharSequence;
import android.view.View;
import ekd.m1;
import t02.a0;

public class a extends c	// class@000a31
{
    public a0 p;
    public i q;
    public View r;
    public TextView s;
    public TextView t;
    public TextView u;
    public static String sLivePresenterClassName = "LivePlayClosedAnchorAttributePresenter";

    public void a(){
       super();
    }
    public void E8(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "4")) {
          this.X7(this.q.a().subscribe(new a(this), Functions.d()));
       }
       return;
    }
    public final void P8(TextView p0,QLivePushEndInfo$AuthorLabel p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "6")) {
          return;
       }
       if ((p1.mShowType).equals("genderMale")) {
          p0.setCompoundDrawablesWithIntrinsicBounds(R.drawable.arg_RES_7f081191, 0, 0, 0);
          p0.setCompoundDrawablePadding(a1.e(2.00f));
       }else if((p1.mShowType).equals("genderFemale")){
          p0.setCompoundDrawablesWithIntrinsicBounds(R.drawable.arg_RES_7f081190, 0, 0, 0);
          p0.setCompoundDrawablePadding(a1.e(2.00f));
       }
       p0.setText(p1.mText);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       p0 = m1.f(p0, R.id.live_play_closed_v3_anchor_attribute_container);
       this.r = p0;
       this.s = p0.findViewById(0x7f0a22b2);
       this.t = this.r.findViewById(0x7f0a22b3);
       this.u = this.r.findViewById(0x7f0a22b4);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.q = this.q8(i.class);
       this.p = this.q8(a0.class);
       return;
    }
}
