package com.hhh.smartwidget.inputpanel.InputPanel;
import androidx.lifecycle.LifecycleObserver;
import com.hhh.smartwidget.popup.c;
import com.hhh.smartwidget.inputpanel.InputPanel$b;
import com.hhh.smartwidget.popup.c$a;
import android.os.Bundle;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import android.view.View;
import com.hhh.smartwidget.inputpanel.d$b;
import com.hhh.smartwidget.inputpanel.d;
import android.os.IBinder;
import android.widget.EditText;
import com.hhh.smartwidget.a;
import mm.k;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import java.util.List;
import java.util.ArrayList;
import android.text.InputFilter;
import java.util.Collection;
import java.lang.Object;
import java.util.Collections;
import android.text.Editable;
import com.hhh.smartwidget.inputpanel.c;
import android.text.TextWatcher;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import mm.c;
import android.view.View$OnClickListener;
import mm.d;
import android.widget.TextView$OnEditorActionListener;
import android.widget.TextView;
import mm.a;
import mm.b;
import com.hhh.smartwidget.inputpanel.b;
import android.view.ViewTreeObserver;
import mm.f;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import androidx.lifecycle.LifecycleOwner;
import mm.e;
import java.lang.Runnable;
import mm.i;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import android.view.ViewGroup;
import android.content.Context;
import android.view.LayoutInflater;
import ag6.a;
import android.view.ViewGroup$LayoutParams;
import com.hhh.smartwidget.inputpanel.InputPanel$a;

public class InputPanel extends c implements LifecycleObserver	// class@000582
{
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public EditText q;
    public View r;
    public d$b s;
    public static final int t;

    public void InputPanel(InputPanel$b p0){
       super(p0);
       this.l = true;
    }
    public void m(Bundle p0){
       this.f().getLifecycle().removeObserver(this);
       d.b(this.d, this.s);
       a.f(this.q.getWindowToken());
       InputPanel$b uob = this.t();
       if (this.k == null) {
          uob = uob.S;
          if (uob != null) {
             uob.b(this, this.q);
          }
       }
       return;
    }
    public void n(Bundle p0){
       InputPanel$b d;
       InputPanel$b q;
       this.f().getLifecycle().addObserver(this);
       this.q = this.e(0x7f0a13fa);
       InputPanel$b uob = this.t();
       if (!TextUtils.isEmpty(uob.M)) {
          this.q.setHint(uob.M);
       }
       if (!TextUtils.isEmpty(uob.N)) {
          this.q.setText(uob.N);
          this.q.setSelection(uob.N.length());
       }
       this.q.setMaxLines(uob.B);
       InputPanel$b c = uob.C;
       c uoc = -1;
       if (c != uoc) {
          this.q.setInputType(c);
          c = uob.C;
          if (c != 144) {
             int i = 128;
             if ((c & i) == i) {
                this.q.setTransformationMethod(PasswordTransformationMethod.getInstance());
             }
          }
       }
       if (!uob.y.isEmpty()) {
          ArrayList uArrayList = new ArrayList();
          if (this.q.getFilters().length > 0) {
             Collections.addAll(uArrayList, this.q.getFilters());
          }
          uArrayList.addAll(uob.y);
          InputFilter[] inputFilterA = new InputFilter[uArrayList.size()];
          this.q.setFilters(uArrayList.toArray(inputFilterA));
       }
       this.v(this.q.getText());
       this.q.addTextChangedListener(new c(this, uob));
       View view = this.e(R.id.at);
       b uob1 = 8;
       if (view != null) {
          d = this.t();
          q = d.O;
          if (q != null && view instanceof ImageView) {
             view.setImageDrawable(q);
          }
          if (d.R == null) {
             view.setVisibility(uob1);
          }else {
             view.setVisibility(0);
             view.setOnClickListener(new c(this, d));
          }
       }
       uob = this.t();
       d = uob.D;
       int i1 = 0x10000000;
       if (d > null) {
          this.q.setImeOptions((d | i1));
          this.q.setOnEditorActionListener(new d(this, uob));
       }else {
          this.q.setImeOptions(i1);
       }
       View view1 = this.e(R.id.send);
       if (view1 != null) {
          q = uob.Q;
          if (q != null) {
             view1.setBackground(q);
          }
          view1.setVisibility(0);
          if (!TextUtils.isEmpty(uob.L) && view1 instanceof TextView) {
             view1.setText(uob.L);
          }
          view1.setOnClickListener(new a(this));
       }
       view = this.e(R.id.emotion);
       if (view != null) {
          d = this.t();
          if (d.E == uoc) {
             view.setVisibility(uob1);
          }else {
             c = d.P;
             if (c != null && view instanceof ImageView) {
                view.setImageDrawable(c);
             }
             view.setVisibility(0);
             view.setOnClickListener(new b(this));
          }
       }
       uob = this.t();
       uob1 = new b(this, uob);
       this.s = uob1;
       d.a(this.d, uob1);
       if (uob.F == null) {
          this.g.getViewTreeObserver().addOnGlobalLayoutListener(new f(this));
          a.k(this.q);
       }else {
          this.u();
          this.r(true);
       }
       return;
    }
    public void onPause(LifecycleOwner p0){
       this.l = false;
    }
    public void onResume(LifecycleOwner p0){
       if (this.n == null) {
          InputPanel tq = this.q;
          if (tq != null) {
             tq.post(new e(this));
          }
       }
       return;
    }
    public void r(boolean p0){
       InputPanel$b t = this.t().T;
       if (t != null) {
          if (p0) {
             t.b(this, this.r);
          }else {
             t.a(this, this.r);
          }
       }
       return;
    }
    public void s(int p0,int p1){
       float[] uofloatArray = new float[]{(float)p0,(float)p1};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this.g, View.TRANSLATION_Y, uofloatArray);
       objectAnimat.setInterpolator(new DecelerateInterpolator(0x3fc00000));
       objectAnimat.setDuration(280);
       objectAnimat.start();
    }
    public InputPanel$b t(){
       return this.b;
    }
    public final void u(){
       ViewGroup viewGroup = this.e(R.id.emotion_container);
       viewGroup.setVisibility(0);
       InputPanel$b uob = this.t();
       View view = a.c(LayoutInflater.from(this.f()), uob.E, viewGroup, true);
       this.r = view;
       InputPanel$b t = uob.T;
       if (t != null) {
          t.c(this, view);
       }
       if (uob.K != null && this.o > null) {
          this.r.getLayoutParams().height = this.o;
       }
       this.r.getViewTreeObserver().addOnGlobalLayoutListener(new InputPanel$a(this, uob));
       return;
    }
    public void v(CharSequence p0){
       View view = this.e(R.id.send);
       if (view == null) {
          return;
       }
       InputPanel$b uob = this.t();
       if (uob.z > null && (TextUtils.isEmpty(p0) || p0.length() < uob.z)) {
          view.setEnabled(false);
          return;
       }else if(uob.A > null && (!TextUtils.isEmpty(p0) && p0.length() > uob.A)){
          view.setEnabled(false);
          return;
       }else {
          view.setEnabled(true);
          return;
       }
    }
    public void w(){
       InputPanel$b uob = this.t();
       InputPanel$b s = uob.S;
       if (s != null) {
          s.a(this, this.q);
       }
       if (uob.J != null) {
          this.k = true;
          this.d(4);
       }else {
          this.q.setText("");
       }
       return;
    }
}
