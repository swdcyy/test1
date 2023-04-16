package com.yxcorp.gifshow.autoplay.dispatch.b;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.autoplay.dispatch.b$a;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import s99.b;
import android.view.ViewGroup;
import s99.f;

public class b extends RecyclerView$r	// class@001be8
{
    public int a;
    public int b;
    public int c;
    public int d;
    public b$a e;
    public int f;

    public void b(int p0,b$a p1,int p2){
       super();
       this.a = 0;
       this.d = p0;
       this.e = p1;
       this.f = p2;
    }
    public void a(RecyclerView p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "1")) {
          return;
       }
       this.a = p1;
       this.f(p0, p1);
       if (!p1) {
          b te = this.e;
          if (te != null) {
             te.a(p0, this.g(this.c, this.b));
          }
          this.c = 0;
          this.b = 0;
       }
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, b.class, "2")) {
          return;
       }
       this.c = this.c + p2;
       this.b = this.b + p1;
       this.e(p0, p1, p2);
       if (!p2 && !p0.getScrollState()) {
          b te = this.e;
          if (te != null) {
             te.a(p0, 1);
          }
       }
       return;
    }
    public final boolean c(View p0){
       boolean b;
       b obj = PatchProxy.applyOneRefs(p0, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          obj = this.d;
          if (obj != null && p0.findViewById(obj) instanceof b) {
             b = true;
          label_0024 :
             return b;
          }
       }
       b = false;
       goto label_0024 ;
    }
    public final boolean d(View p0){
       boolean b;
       b obj = PatchProxy.applyOneRefs(p0, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          obj = this.f;
          if (obj != null && p0.findViewById(obj) instanceof RecyclerView) {
             b = true;
          label_0024 :
             return b;
          }
       }
       b = false;
       goto label_0024 ;
    }
    public final void e(RecyclerView p0,int p1,int p2){
       int i3;
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, b.class, "3")) {
          return;
       }
       int i = 0;
       int i1 = (this.a == 1)? 0: 1;
       int childCount = p0.getChildCount();
       int i2 = 0;
       while (i < childCount) {
          if (this.c > null || this.b > null) {
             i3 = i;
          }else {
             i3 = childCount - i;
             i3 = i3 - 1;
          }
          View childAt = p0.getChildAt(i3);
          if (this.d(childAt)) {
             this.e(childAt.findViewById(this.f), p1, p2);
          }else if(this.c(childAt)){
             childAt.findViewById(this.d).c(p1, p2, this.g(this.c, this.b), i2, childCount, i1);
          }else if(childAt instanceof b){
             childAt.c(p1, p2, this.g(this.c, this.b), i2, childCount, i1);
          }
          i2 = i2 + 1;
          i = i + 1;
       }
       return;
    }
    public final void f(RecyclerView p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "4")) {
          return;
       }
       int childCount = p0.getChildCount();
       int i = 0;
       while (i < childCount) {
          View childAt = p0.getChildAt(i);
          if (this.d(childAt)) {
             this.f(childAt.findViewById(this.f), p1);
          }else if(this.c(childAt)){
             childAt.findViewById(this.d).onScrollStateChanged(p1);
          }else if(childAt instanceof b){
             childAt.onScrollStateChanged(p1);
          }
          i = i + 1;
       }
       return;
    }
    public final int g(int p0,int p1){
       if (p0 > 0) {
          return 1;
       }
       if (p0 < 0) {
          return -1;
       }
       if (p1 > 0) {
          return 2;
       }
       if (p1 < 0) {
          return -2;
       }
       return 1;
    }
}
