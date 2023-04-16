package n1a.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import n1a.g$a;
import n1a.g$b;
import n1a.g$c;
import n1a.g$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import n1a.g$e;
import android.view.View;
import android.view.ViewGroup;
import a27.d;
import android.view.WindowManager;
import android.view.Display;
import android.graphics.Point;
import a27.c$a;
import z17.b;
import a27.c$b;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.widget.TextView;
import n1a.f;
import java.lang.Runnable;
import n1a.b;
import android.view.View$OnClickListener;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View$OnTouchListener;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView$OnEditorActionListener;
import android.text.Editable;
import n1a.c;
import android.text.TextPaint;
import qvb.i;
import qvb.q;
import qvb.j;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import k2b.e0;
import k1a.b;
import android.content.Context;
import ekd.m1;

public class g extends PresenterV2	// class@0030bd
{
    public ViewTreeObserver$OnGlobalLayoutListener A;
    public boolean B;
    public TextView p;
    public View q;
    public EditText r;
    public TextView s;
    public TextView t;
    public TextView u;
    public final RecyclerFragment v;
    public final q w;
    public final View$OnTouchListener x;
    public final u4 y;
    public final TextView$OnEditorActionListener z;

    public void g(RecyclerFragment p0){
       super();
       this.w = new g$a(this);
       this.x = new g$b(this);
       this.y = new g$c(this);
       this.z = new g$d(this);
       this.v = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
          return;
       }
       Activity activity = this.getActivity();
       View view = activity.findViewById(0x1020002);
       boolean b = d.b(activity);
       boolean b1 = d.c(activity);
       boolean b2 = d.a(activity);
       Point point = new Point();
       activity.getWindowManager().getDefaultDisplay().getSize(point);
       c$a uoa = new c$a(b, b1, b2, view, new g$e(this), null, point.y);
       view.getViewTreeObserver().addOnGlobalLayoutListener(activity);
       this.A = activity;
       this.p.setText(R.string.arg_RES_7f10010e);
       boolean b3 = true;
       if (this.B == null) {
          this.p.post(new f(this));
          this.B = b3;
       }
       this.p.setOnClickListener(new b(this));
       this.v.h0().setOnTouchListener(this.x);
       this.r.addTextChangedListener(this.y);
       this.r.setOnEditorActionListener(this.z);
       this.s.setEnabled(this.P8(this.r.getText().toString()));
       this.s.setOnClickListener(new c(this));
       this.t.setText(R.string.arg_RES_7f1003c4);
       this.u.getPaint().setFakeBoldText(b3);
       this.S8();
       this.v.q().h(this.w);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, g.class, "9")) {
          return;
       }
       this.v.q().f(this.w);
       this.r.removeTextChangedListener(this.y);
       this.getActivity().findViewById(0x1020002).getViewTreeObserver().removeOnGlobalLayoutListener(this.A);
       return;
    }
    public boolean P8(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.length() >= 2 && (p0.trim()).length() > 0)? true: false;
       return b;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       if (!this.p.getVisibility()) {
          return;
       }
       this.q.setVisibility(8);
       this.p.setVisibility(0);
       this.r.setText(null);
       b.d(this.v);
       return;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, g.class, "8")) {
          return;
       }
       int count = this.v.q().getCount();
       g tu = this.u;
       int i = 0;
       int i1 = (count > 0)? 0: 4;
       tu.setVisibility(i1);
       Object[] objArray = new Object[]{String.valueOf(count),String.valueOf(30)};
       this.u.setText(this.getContext().getString(R.string.arg_RES_7f1017fa, objArray));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3b28);
       this.q = m1.f(p0, 0x7f0a0180);
       this.r = m1.f(p0, 0x7f0a017f);
       this.s = m1.f(p0, 0x7f0a017e);
       this.t = m1.f(p0, 0x7f0a0448);
       this.u = m1.f(p0, 0x7f0a0446);
       return;
    }
}
