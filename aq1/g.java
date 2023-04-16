package aq1.g;
import zp1.c;
import java.lang.String;
import yp1.b;
import zp1.i;
import zp1.l;
import java.lang.Object;
import kotlin.jvm.internal.a;
import zp1.m;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import fq1.b;
import com.yxcorp.plugin.live.widget.LiveMediumTextView;
import aq1.g$b;
import android.view.View$OnClickListener;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import com.kuaishou.protobuf.livestream.nano.LiveMultiChatUserLabel;
import java.lang.CharSequence;
import com.kuaishou.live.common.core.component.multichat.chatedit.LiveMultiChatLogType;
import java.util.Map;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.google.common.collect.ImmutableMap;
import rp1.b;
import java.lang.Integer;
import java.lang.Boolean;
import android.view.View;
import android.view.ViewGroup;
import lnc.a1;
import android.text.TextPaint;
import d61.f0;
import android.widget.ImageView;
import fq1.d;
import zp1.a;
import aq1.f;
import java.lang.Number;
import usd.q;
import yh3.a;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Rect;
import java.lang.Float;
import zp1.j;
import aq1.g$a;
import android.view.ViewGroup$LayoutParams;

public abstract class g extends c	// class@000286
{
    public String H;
    public final String I;
    public final b J;
    public final i K;
    public final l L;

    public void g(String p0,b p1,i p2,l p3){
       a.p(p0, "cellUserId");
       a.p(p1, "renderModel");
       a.p(p2, "chatCellBaseDelegate");
       a.p(p3, "chatCellRendDelegate");
       super(p0, p1, p2, p3);
       this.I = p0;
       this.J = p1;
       this.K = p2;
       this.L = p3;
       this.H = "";
    }
    public void A3(m p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "3")) {
          return;
       }
       a.p(p0, "viewModel");
       super.A3(p0);
       if (!b.b()) {
          this.p3().setOnClickListener(new g$b(this, p0));
       }
       return;
    }
    public void B3(m p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "4")) {
          return;
       }
       a.p(p0, "viewModel");
       super.B3(p0);
       if (!b.b()) {
          LiveMultiChatUserLabel value = p0.v0().getValue();
          if (value != null) {
             value = value.label;
             if (value != null) {
                int i = 1;
                g og = (value.length() > 0)? 1: null;
                if (og == i) {
                   og = this.H;
                   LiveMultiChatUserLabel value1 = p0.v0().getValue();
                   value1 = (value1 != null)? value1.label: null;
                   if (a.g(og, value1) ^ i) {
                      value = p0.v0().getValue();
                      String str = "";
                      if (value != null) {
                         value = value.label;
                         if (value != null) {
                         label_0062 :
                            this.H = value;
                            LiveMultiChatLogType sHOW = LiveMultiChatLogType.SHOW;
                            Map map = this.J.e(this.I);
                            e0 uoe0 = this.J.d();
                            ClientContent$LiveStreamPackage liveStreamPa = this.J.f();
                            g tI = this.I;
                            LiveMultiChatUserLabel value2 = p0.v0().getValue();
                            if (value2 != null) {
                               value2 = value2.label;
                               if (value2 != null) {
                                  str = value2;
                               }
                            }
                            ImmutableMap immutableMap = ImmutableMap.of(tI, str);
                            a.o(immutableMap, "ImmutableMap.of\(\n       ¡­ls.EMPTY_STRING\n        \)");
                            b.a(sHOW, map, uoe0, liveStreamPa, immutableMap);
                         }
                      }
                      String str1 = str;
                      goto label_0062 ;
                   }
                }
             }
          }
       }
       return;
    }
    public void E3(int p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Boolean.valueOf(p1), Boolean.valueOf(p2), this, g.class, "10")) {
          return;
       }
       if (this.l3().getMeasuredWidth() > 0 && this.q3().getMeasuredWidth() > 0) {
          p0 = (((this.l3().getMeasuredWidth() - this.q3().getMeasuredWidth()) - this.s3()) - this.t3()) - a1.e(6.00f);
          if (p0 <= 0) {
             return;
          }else {
             TextPaint paint = this.o3().getPaint();
             CharSequence text = this.o3().getText();
             String str = null;
             String str1 = (text != null)? text.toString(): str;
             int i = (int)paint.measureText(f0.b(str1, 2));
             TextPaint paint1 = this.o3().getPaint();
             CharSequence text1 = this.o3().getText();
             if (text1 != null) {
                str = text1.toString();
             }
             int i1 = d.g(this.n3());
             int i2 = (i1 + i) + d.f(this.o3());
             if (p0 < ((d.f(this.o3()) + i1) + (int)paint1.measureText(str))) {
                this.H3(p0, i, i1);
             }
             if (p0 < i2) {
                this.w3();
                this.C3();
                p0 = p0 + this.m3().getMeasuredWidth();
                this.H3(p0, i, i1);
             }
             TextView textView = this.o3();
             p0 = (p0 < i2)? 8: 0;
             textView.setVisibility(p0);
             if (this.k3().getVisibility() != 8) {
                this.k3().requestLayout();
             }
          }
       }
       return;
    }
    public void F3(a p0){
       g og = g.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, og, "7")) {
          return;
       }
       a.p(p0, "viewModel");
       super.f3(p0);
       if (!PatchProxy.applyVoid(null, this, og, "8")) {
          this.l3().setOnClickListener(new f(this));
       }
       return;
    }
    public Integer G3(){
       return null;
    }
    public final void H3(int p0,int p1,int p2){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, g.class, "11")) {
          return;
       }
       if (this.o3().getVisibility()) {
          return;
       }
       TextPaint paint = this.o3().getPaint();
       Integer integer = this.G3();
       String str = null;
       if (integer != null) {
          int i = integer.intValue();
          CharSequence text = this.o3().getText();
          if (text != null) {
             str = text.toString();
          }
          str = f0.b(str, i);
       }
       int i1 = (int)paint.measureText(str);
       p0 = p0 - d.f(this.o3());
       if (!this.n3().getVisibility()) {
          p0 = p0 - p2;
       }
       this.o3().setMaxWidth(q.n(p1, q.u(i1, p0)));
       this.o3().setMinWidth(p1);
       return;
    }
    public void V2(a p0){
       this.F3(p0);
    }
    public a X2(){
       a uoa = PatchProxy.apply(null, this, g.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a(this.J, this.I, this.K, this.L);
       }
       return uoa;
    }
    public void d3(float p0,Rect p1){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), p1, this, og, "5")) {
          return;
       }
       a.p(p1, "cellRect");
       super.d3(p0, p1);
       if (this.J.i(this.I)) {
          if (!PatchProxy.applyVoid(null, this, c.class, "24")) {
             c ts = this.s;
             if (ts == null) {
                a.S("multiUserInfoContainer");
             }
             ts.setVisibility(8);
          }
          this.v3();
       }
       j oj = this.j3();
       if (oj != null) {
          this.n3().setPadding(oj.b(), oj.b(), oj.b(), oj.b());
       }
       return;
    }
    public void e3(m p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       a.p(p0, "viewModel");
       super.e3(p0);
       this.n3().setOnClickListener(new g$a(this, p0));
       return;
    }
    public void f3(m p0){
       this.F3(p0);
    }
    public int g3(){
       return 0x7f0d0ca5;
    }
    public void u3(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, g.class, "6")) {
          return;
       }
       j oj = this.j3();
       Integer integer = (oj != null)? Integer.valueOf(oj.b()): objArray;
       a.m(integer);
       int i = integer.intValue();
       this.n3().setPadding(i, i, i, i);
       ViewGroup$LayoutParams layoutParams = this.n3().getLayoutParams();
       j oj1 = this.j3();
       Integer integer1 = (oj1 != null)? Integer.valueOf(oj1.c()): objArray;
       a.m(integer1);
       int i1 = i * 2;
       layoutParams.width = integer1.intValue() + i1;
       layoutParams = this.n3().getLayoutParams();
       oj1 = this.j3();
       if (oj1 != null) {
          objArray = Integer.valueOf(oj1.a());
       }
       a.m(objArray);
       layoutParams.height = objArray.intValue() + i1;
       this.n3().setPadding(i, i, i, i);
       return;
    }
}
