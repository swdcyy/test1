package f43.b;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import u07.t;
import android.app.Activity;
import kzc.d;
import u07.t$a;
import f43.a;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.PopupInterface$Excluded;
import f43.b$a;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import android.view.View$OnClickListener;
import lnc.j2;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.Context;
import j75.e;
import com.facebook.drawee.view.SimpleDraweeView;
import java.lang.CharSequence;
import o07.n;

public class b extends t implements PopupInterface$f	// class@00286a
{
    public String A;
    public String B;
    public String C;
    public b$b D;
    public View$OnClickListener E;
    public Activity r;
    public View s;
    public KwaiImageView t;
    public TextView u;
    public TextView v;
    public TextView w;
    public TextView x;
    public TextView y;
    public String z;

    public void b(Activity p0){
       super(new d(p0));
       this.r = p0;
    }
    public void b(d p0){
       super(p0);
       this.E = new a(this);
       p0.b1(KwaiDialogOption.d);
       p0.z(true);
       p0.A(true);
       p0.v(true);
       p0.D(PopupInterface$Excluded.NOT_AGAINST);
       p0.J(new b$a(this));
       p0.L(this);
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       p0 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, b.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       View view = a.g(p1, R.layout.arg_RES_7f0d0543, p2, false);
       if (!PatchProxy.applyVoidOneRefs(view, this, b.class, "2")) {
          this.s = view.findViewById(0x7f0a16dd);
          this.t = view.findViewById(0x7f0a13b3);
          this.u = view.findViewById(0x7f0a4310);
          this.v = view.findViewById(0x7f0a4312);
          this.w = view.findViewById(0x7f0a4311);
          this.x = view.findViewById(0x7f0a053e);
          this.y = view.findViewById(0x7f0a053f);
          this.x.setOnClickListener(this.E);
          this.y.setOnClickListener(this.E);
          if (!j2.a()) {
             ViewGroup$MarginLayoutParams layoutParams = this.s.getLayoutParams();
             layoutParams.bottomMargin = e.b(view.getContext(), 16.00f);
             this.s.setLayoutParams(layoutParams);
          }
          this.t.setImageURI(this.z);
          this.u.setText(this.A);
          this.v.setText(this.B);
          this.w.setText(this.C);
       }
       return view;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       n.a(this, p0);
       return;
    }
}
