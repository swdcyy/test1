package com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.drawing.f;
import k51.c;
import pz0.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mk1.h;
import com.kuaishou.live.core.show.gift.DrawingGift;
import xk1.a;
import java.util.List;
import pz0.k;
import android.view.View$OnClickListener;
import android.view.View;
import pz0.l;
import pz0.m;
import android.widget.ImageView;
import pz0.n;
import yk1.b;
import yk1.d;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.drawing.f$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import pz0.i;
import android.view.View$OnKeyListener;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.drawing.e;
import android.view.View$OnTouchListener;
import com.kuaishou.live.common.core.component.gift.DrawingGiftEditView$b;
import java.lang.Integer;
import lnc.a1;
import java.lang.CharSequence;
import android.widget.TextView;
import mk1.w;
import com.kwai.robust.PatchProxyResult;
import android.text.SpannableString;
import java.lang.StringBuilder;
import android.text.style.ForegroundColorSpan;
import ekd.m1;
import mk1.b;
import qk1.d;

public class f extends c	// class@000b3e
{
    public h p;
    public b q;
    public d r;
    public View s;
    public View t;
    public View u;
    public TextView v;
    public ImageView w;
    public final d x;
    public DrawingGiftEditView$b y;
    public static String sLivePresenterClassName = "LiveAudienceDrawingGiftBoxTitlePresenter";

    public void f(){
       super();
       this.x = new j(this);
    }
    public void E8(){
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uof, "4")) {
          this.P8(this.p.p.o().mPoints.size());
          this.t.setOnClickListener(new k(this));
          this.u.setOnClickListener(new l(this));
          this.w.setOnClickListener(new m(this));
          this.s.setOnClickListener(new n(this));
       }
       this.w.setVisibility(this.p.F.d());
       this.p.F.e(this.x);
       this.y = new f$a(this);
       View view = this.m8();
       if (view != null) {
          view.setFocusableInTouchMode(true);
          view.requestFocus();
          view.setOnKeyListener(new i(this));
          view.setOnTouchListener(e.b);
       }
       this.p.p.d(this.y);
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f.class, "7")) {
          return;
       }
       this.m8().setOnKeyListener(objArray);
       this.p.p.h(this.y);
       this.p.F.c(this.x);
       return;
    }
    public void P8(int p0){
       SpannableString spannableStr;
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uof, "5")) {
          return;
       }
       int i = 10;
       if (p0 < i) {
          this.v.setText(a1.q(R.string.arg_RES_7f102259, i));
       }else {
          f tv = this.v;
          p0 = w.a(this.p.p.o());
          if (PatchProxy.isSupport(uof)) {
             spannableStr = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uof, "6");
             if (spannableStr != PatchProxyResult.class) {
             label_0086 :
                tv.setText(spannableStr);
             }
          }
          String str = " "+p0+" ";
          String str1 = a1.r(R.string.arg_RES_7f100aec, str);
          int i1 = str1.indexOf(str);
          SpannableString spannableStr1 = new SpannableString(str1);
          spannableStr1.setSpan(new ForegroundColorSpan(a1.a(R.color.arg_RES_7f060164)), i1, (str.length() + i1), 33);
          spannableStr = spannableStr1;
          goto label_0086 ;
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a0c51);
       this.s = m1.f(p0, 0x7f0a10a4);
       this.u = m1.f(p0, 0x7f0a0c43);
       this.v = m1.f(p0, 0x7f0a0c4f);
       this.w = m1.f(p0, 0x7f0a1d22);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.p = this.q8(h.class);
       this.q = this.q8(b.class);
       this.r = this.q8(d.class);
       return;
    }
}
