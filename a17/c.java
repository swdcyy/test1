package a17.c;
import android.view.View$OnClickListener;
import com.kwai.library.widget.popup.common.c;
import a17.c$a;
import com.kwai.library.widget.popup.common.c$b;
import a17.k;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import a17.m;
import b17.a;
import w07.l;
import x07.b;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import android.os.Bundle;
import java.lang.Object;
import java.util.Objects;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import android.content.Context;
import ll8.c$b;
import android.content.res.TypedArray;
import qrd.l1;
import com.kwai.library.widget.popup.common.exception.KwaiPopupShowException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import android.widget.TextView;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.text.TextPaint;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import java.util.Iterator;
import java.util.List;
import a17.b$a;

public class c extends c implements View$OnClickListener	// class@000012
{
    public boolean p;

    public void c(c$a p0){
       super(p0);
       this.p = false;
    }
    public static c$a b0(int p0,c$a p1){
       int i;
       c$a o = p1.O;
       if (o == null) {
          o = new k(p1);
       }
       p1.e0(o);
       o = p1.J;
       if (o == -1) {
          i = 0x7f0d150b;
       }
       p1.k0(i);
       p1.T = new m(p0);
       p1.a0(0, new a());
       p1.Q(R.id.widget_popup_bottom_anim_view);
       p1.L(new b(R.layout.arg_RES_7f0d150c));
       return p1;
    }
    public boolean L(){
       return false;
    }
    public void O(Bundle p0){
       c$a t;
       TextView textView1;
       TextView textView2;
       l1 a;
       boolean b = 8;
       LinearLayoutManager linearLayout = 1;
       Activity uActivity = null;
       if (this.c0().T != null) {
          t = this.c0().T;
          Objects.requireNonNull(t);
          a.p(this, "target");
          View view = this.z();
          if (view != null && t.s != -1) {
             a.o(view, "it");
             TypedArray typedArray = view.getContext().obtainStyledAttributes(t.s, c$b.i2);
             String str = "it.context\n        .obta¡­d, R.styleable.KwaiSheet\)";
             try{
                a.o(typedArray, str);
                t.r = typedArray.getResourceId(b, t.r);
                t.q = typedArray.getResourceId(13, t.q);
                t.a = typedArray.getResourceId(17, t.a);
                t.n = typedArray.getResourceId(20, t.n);
                t.p = typedArray.getResourceId(18, t.p);
                t.o = typedArray.getResourceId(19, t.o);
                t.f = typedArray.getResourceId(linearLayout, t.f);
                t.g = typedArray.getResourceId(uActivity, t.g);
                t.d = typedArray.getResourceId(2, t.d);
                t.h = typedArray.getResourceId(4, t.h);
                t.e = typedArray.getResourceId(3, t.e);
                t.c = typedArray.getResourceId(15, t.c);
                t.i = typedArray.getResourceId(14, t.i);
                t.j = typedArray.getResourceId(11, t.j);
                t.k = typedArray.getResourceId(12, t.k);
                t.l = typedArray.getResourceId(9, t.l);
                a = l1.a;
             }catch(java.lang.Exception e8){
                ExceptionHandler.handleCaughtException(new KwaiPopupShowException("KwaiSheet Exception", e8));
             }
             typedArray.recycle();
          }
       }
       t = this.c0();
       int i = 0x7f0a42ce;
       TextView textView = this.t(i);
       if (textView != null) {
          textView1 = (!TextUtils.isEmpty(t.K) || !TextUtils.isEmpty(textView.getText()))? 1: null;
          if (!textView1) {
             textView.setVisibility(b);
          }else if(!TextUtils.isEmpty(t.K)){
             textView.setText(t.K);
          }
          textView.getPaint().setFakeBoldText(linearLayout);
          textView.setVisibility(uActivity);
          this.p = linearLayout;
       }
       t = this.c0();
       int i1 = 0x7f0a42cc;
       textView1 = this.t(i1);
       if (textView1 != null) {
          c$a uoa = (!TextUtils.isEmpty(t.L) || !TextUtils.isEmpty(textView1.getText()))? 1: null;
          if (!uoa) {
             textView1.setVisibility(b);
          }else if(!TextUtils.isEmpty(t.L)){
             textView1.setText(t.L);
          }
          textView1.setVisibility(uActivity);
          this.p = linearLayout;
       }
       View view1 = this.t(R.id.title_space);
       if (view1 != null) {
          textView2 = this.t(i);
          textView = this.t(i1);
          textView2 = (textView2 != null && (!textView2.getVisibility() && (textView != null && !textView.getVisibility())))? 1: 0;
          i = (textView2)? 0: 8;
          view1.setVisibility(i);
       }
       view1 = this.t(R.id.v_title_line);
       if (view1 != null) {
          i = (this.p != null)? 0: 8;
          view1.setVisibility(i);
       }
       view1 = this.t(R.id.container_title);
       if (view1 != null) {
          i = (this.p != null)? 0: 8;
          view1.setVisibility(i);
       }
       t = this.c0();
       textView2 = this.t(R.id.tv_button);
       if (textView2 != null) {
          if (!TextUtils.isEmpty(t.M)) {
             textView2.setText(t.M);
             textView2.setVisibility(uActivity);
          }else if(TextUtils.isEmpty(textView2.getText())){
             b = 0;
          }
          textView2.setVisibility(b);
          if (!textView2.getVisibility()) {
             textView2.setOnClickListener(this);
          }
          textView2.getPaint().setFakeBoldText(linearLayout);
       }
       RecyclerView recyclerView = this.t(R.id.recycler_view);
       if (recyclerView != null) {
          recyclerView.setLayoutManager(new LinearLayoutManager(this.u()));
          recyclerView.setAdapter(this.c0().O);
       }
       Iterator iterator = this.c0().I.iterator();
       while (iterator.hasNext()) {
          iterator.next().apply(this);
       }
       return;
    }
    public c$a c0(){
       return this.b;
    }
    public final void onClick(View p0){
       c tb = this.b;
       if (p0.getId() == 0x7f0a4101) {
          if (tb.H != null) {
             this.l(3);
          }
          c$a r = tb.R;
          if (r != null) {
             r.a(this, p0);
          }
       }
       return;
    }
}
