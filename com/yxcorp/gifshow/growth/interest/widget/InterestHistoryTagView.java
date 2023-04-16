package com.yxcorp.gifshow.growth.interest.widget.InterestHistoryTagView;
import android.widget.RelativeLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import aoa.a$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.Result;
import java.lang.Boolean;
import coa.b;
import android.view.View$OnClickListener;
import coa.a;
import android.view.View;
import qrd.l1;
import java.lang.Throwable;
import qrd.j0;
import cra.w;
import q87.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ag6.a;
import android.widget.ImageView;
import android.widget.TextView;
import msd.p;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class InterestHistoryTagView extends RelativeLayout	// class@0013c3
{
    public ImageView b;
    public TextView c;
    public View d;
    public View e;
    public String f;
    public String g;
    public p h;

    public void InterestHistoryTagView(Context p0){
       a.p(p0, "context");
       super(p0);
       this.b(p0);
    }
    public void InterestHistoryTagView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.b(p0);
    }
    public void InterestHistoryTagView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.b(p0);
    }
    public final void a(a$a p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, InterestHistoryTagView.class, "2")) {
          return;
       }
       if (p0 != null) {
          this.f = p0.c();
          this.g = p0.b();
          this.setText(this.f);
          b = p0.a();
          if (!PatchProxy.isSupport(InterestHistoryTagView.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, InterestHistoryTagView.class, "5")) {
             this.setSelected(b);
          }
       }
       if (!PatchProxy.applyVoid(null, this, InterestHistoryTagView.class, "3")) {
          this.setOnClickListener(new b(this));
          InterestHistoryTagView te = this.e;
          if (te != null) {
             te.setOnClickListener(new a(this));
          }
       }
       b = Result.constructor-impl(l1.a);
       Throwable throwable = Result.exceptionOrNull-impl(b);
       if (throwable != null) {
          w.C().e("interestEdit", "TagView bindModel", throwable);
       }
       return;
    }
    public final void b(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, InterestHistoryTagView.class, "1")) {
          return;
       }
       a.c(LayoutInflater.from(p0), this.getLayoutRes(), this, true);
       this.b = this.findViewById(0x7f0a1445);
       this.c = this.findViewById(0x7f0a1447);
       this.d = this.findViewById(0x7f0a43c0);
       this.e = this.findViewById(0x7f0a43ba);
       return;
    }
    public final int getLayoutRes(){
       return 0x7f0d0560;
    }
    public final p getMStatusLambda(){
       return this.h;
    }
    public final void setMStatusLambda(p p0){
       this.h = p0;
    }
    public final void setRightIconVisible(boolean p0){
       if (PatchProxy.isSupport(InterestHistoryTagView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, InterestHistoryTagView.class, "6")) {
          return;
       }
       InterestHistoryTagView td = this.d;
       int i = 8;
       if (td != null) {
          td.setVisibility(i);
       }
       td = this.b;
       if (td != null) {
          int i1 = (p0)? 0: 8;
          td.setVisibility(i1);
       }
       td = this.e;
       if (td != null) {
          if (p0) {
             i = 0;
          }
          td.setVisibility(i);
       }
       this.invalidate();
       Throwable obj = Result.constructor-impl(l1.a);
       obj = Result.exceptionOrNull-impl(obj);
       if (obj != null) {
          w.C().e("interestEdit", "TagView RightIconVisible", obj);
       }
       return;
    }
    public final void setText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, InterestHistoryTagView.class, "4")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          InterestHistoryTagView tc = this.c;
          if (tc != null) {
             tc.setText(p0);
          }
       }
       p0 = Result.constructor-impl(l1.a);
       Throwable throwable = Result.exceptionOrNull-impl(p0);
       if (throwable != null) {
          w.C().e("interestEdit", "TagView setText", throwable);
       }
       return;
    }
}
