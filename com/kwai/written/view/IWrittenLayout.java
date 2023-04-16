package com.kwai.written.view.IWrittenLayout;
import ox7.h;
import ox7.e;
import ox7.j;
import ox7.b;
import ox7.c;
import ox7.n;
import ox7.d;
import ox7.k;
import ox7.g;
import ox7.f;
import ox7.i;
import ox7.a;
import ox7.l;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.written.view.IWrittenLayout$view$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.view.ViewGroup;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import msd.l;
import java.lang.Integer;
import android.widget.TextView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ox7.k$a;
import android.widget.FrameLayout$LayoutParams;
import ox7.e$a;
import android.widget.LinearLayout;
import android.widget.LinearLayout$LayoutParams;
import ox7.h$a;
import qrd.l1;
import android.widget.RelativeLayout;
import ox7.j$a;
import android.widget.ImageView;
import ox7.g$a;
import ox7.l$a;
import android.content.res.Resources;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.Button;
import ox7.a$a;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Float;
import com.yxcorp.utility.n;
import android.widget.FrameLayout;
import ox7.m;
import android.view.View$OnClickListener;
import android.widget.ImageButton;
import ox7.f$a;
import cw9.c;
import android.view.ViewStub;
import ox7.n$a;
import androidx.constraintlayout.widget.ConstraintLayout;
import ox7.b$a;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView;
import ox7.i$a;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import ox7.c$a;
import java.lang.reflect.Constructor;
import android.graphics.drawable.Drawable;
import android.content.res.TypedArray;
import android.widget.EditText;
import ox7.d$a;
import androidx.core.content.ContextCompat;
import android.view.LayoutInflater;
import ag6.a;
import android.content.res.ColorStateList;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import java.lang.Throwable;
import android.util.Log;
import o56.a;
import androidx.appcompat.widget.AppCompatImageView;

public abstract class IWrittenLayout implements h, e, j, b, c, n, d, k, g, f, i, a, l	// class@001150
{
    public final p a;
    public final Context b;

    public void IWrittenLayout(Context p0){
       a.p(p0, "context");
       super();
       this.b = p0;
       this.a = s.c(new IWrittenLayout$view$2(this));
    }
    public static View i1(IWrittenLayout p0,ViewGroup p1,View p2,ViewGroup$LayoutParams p3,l p4,int p5,Object p6){
       return p0.g1(p1, p2, p3, null);
    }
    public static View j1(IWrittenLayout p0,ViewGroup p1,Integer p2,View p3,ViewGroup$LayoutParams p4,l p5,int p6,Object p7){
       Integer integer = (p6 & 0x01)? null: p2;
       return p0.h1(p1, integer, p3, p4, null);
    }
    public TextView A(TextView p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, IWrittenLayout.class, "11");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$top");
       Object obj1 = PatchProxy.applyTwoRefs(this, p0, null, k$a.class, "3");
       if (obj1 != patchProxyRe) {
          p0 = obj1;
       }else {
          a.p(p0, "$this$top");
          p0.setGravity(48);
       }
       return p0;
    }
    public FrameLayout$LayoutParams A0(FrameLayout$LayoutParams p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, IWrittenLayout.class, "25");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$start");
       Object obj1 = PatchProxy.applyTwoRefs(this, p0, null, e$a.class, "9");
       if (obj1 != patchProxyRe) {
          i = obj1;
       }else {
          a.p(p0, "$this$start");
          p0.gravity = 0x800003;
       }
       return i;
    }
    public FrameLayout$LayoutParams B(FrameLayout$LayoutParams p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, IWrittenLayout.class, "19");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$left");
       Object obj1 = PatchProxy.applyTwoRefs(this, p0, null, e$a.class, "8");
       if (obj1 != patchProxyRe) {
          i = obj1;
       }else {
          a.p(p0, "$this$left");
          p0.gravity = 3;
       }
       return i;
    }
    public LinearLayout$LayoutParams B0(LinearLayout p0,l p1){
       LinearLayout$LayoutParams this;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, IWrittenLayout.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$matchLparams");
       this = PatchProxy.applyThreeRefs(this, p0, p1, null, h$a.class, "16");
       if (this != PatchProxyResult.class) {
       }else {
          a.p(p0, "$this$matchLparams");
          super(-1, -1);
          if (p1 != null) {
             p1.invoke(this);
          }
       }
       return this;
    }
    public TextView C(TextView p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, IWrittenLayout.class, "29");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$end");
       Object obj1 = PatchProxy.applyTwoRefs(this, p0, null, k$a.class, "8");
       if (obj1 != patchProxyRe) {
          p0 = obj1;
       }else {
          a.p(p0, "$this$end");
          p0.setGravity(0x800005);
       }
       return p0;
    }
    public FrameLayout$LayoutParams C0(FrameLayout$LayoutParams p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, IWrittenLayout.class, "31");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$centerHorizontal");
       Object obj1 = PatchProxy.applyTwoRefs(this, p0, null, e$a.class, "12");
       if (obj1 != patchProxyRe) {
          i = obj1;
       }else {
          a.p(p0, "$this$centerHorizontal");
          p0.gravity = 1;
       }
       return i;
    }
    public RelativeLayout D(ViewGroup$LayoutParams p0,l p1){
       RelativeLayout this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, IWrittenLayout.class, "53");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "lparams");
       this = PatchProxy.applyThreeRefs(this, p0, p1, null, j$a.class, "3");
       if (this != patchProxyRe) {
       }else {
          a.p(p0, "lparams");
          this = this.p(null, p0, p1);
       }
       return this;
    }
    public ImageView D0(ViewGroup p0,ViewGroup$LayoutParams p1,l p2){
       ImageView this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, IWrittenLayout.class, "75");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$imageView");
       a.p(p1, "lparams");
       this = PatchProxy.applyFourRefs(this, p0, p1, p2, null, g$a.class, "1");
       if (this != patchProxyRe) {
       }else {
          a.p(p0, "$this$imageView");
          a.p(p1, "lparams");
          this = this.v0(p0, null, p1, p2);
       }
       return this;
    }
    public TextView E(ViewGroup p0,ViewGroup$LayoutParams p1,l p2){
       TextView this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, IWrittenLayout.class, "72");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$textView");
       a.p(p1, "lparams");
       this = PatchProxy.applyFourRefs(this, p0, p1, p2, null, k$a.class, "1");
       if (this != patchProxyRe) {
       }else {
          a.p(p0, "$this$textView");
          a.p(p1, "lparams");
          this = this.l(p0, null, p1, p2);
       }
       return this;
    }
    public RelativeLayout E0(ViewGroup p0,Integer p1,ViewGroup$LayoutParams p2,l p3){
       RelativeLayout relativeLayo;
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, IWrittenLayout.class, "52");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$relativeLayout");
       a.p(p2, "lparams");
       j$a uoa = j$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{this,p0,p1,p2,p3};
          relativeLayo = PatchProxy.apply(objArray, null, uoa, "2");
          if (relativeLayo != PatchProxyResult.class) {
          label_0051 :
             return relativeLayo;
          }
       }
       a.p(p0, "$this$relativeLayout");
       a.p(p2, "lparams");
       relativeLayo = this.p(p1, p2, p3);
       p0.addView(relativeLayo);
       goto label_0051 ;
    }
    public LinearLayout$LayoutParams F(LinearLayout$LayoutParams p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, IWrittenLayout.class, "21");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$center");
       Object obj1 = PatchProxy.applyTwoRefs(this, p0, null, h$a.class, "9");
       if (obj1 != patchProxyRe) {
          i = obj1;
       }else {
          a.p(p0, "$this$center");
          p0.gravity = 17;
       }
       return i;
    }
    public LinearLayout F0(Integer p0,int p1,ViewGroup$LayoutParams p2,l p3){
       LinearLayout linearLayout;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(IWrittenLayout.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), p2, p3, this, IWrittenLayout.class, "8");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       a.p(p2, "lparams");
       h$a uoa = h$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{this,p0,Integer.valueOf(p1),p2,p3};
          linearLayout = PatchProxy.apply(objArray, null, uoa, "4");
          if (linearLayout != patchProxyRe) {
          }else {
          label_004e :
             a.p(p2, "lparams");
             linearLayout = new LinearLayout(this.getContext());
             linearLayout.setOrientation(p1);
             linearLayout.setLayoutParams(p2);
             if (p0 != null) {
                linearLayout.setId(p0.intValue());
             }
             if (p3 != null) {
                p3.invoke(linearLayout);
             }
          }
       }else {
          goto label_004e ;
       }
       return linearLayout;
    }
    public LinearLayout$LayoutParams G(LinearLayout$LayoutParams p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, IWrittenLayout.class, "12");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$right");
       Object obj1 = PatchProxy.applyTwoRefs(this, p0, null, h$a.class, "6");
       if (obj1 != patchProxyRe) {
          i = obj1;
       }else {
          a.p(p0, "$this$right");
          p0.gravity = 5;
       }
       return i;
    }
    public String G0(View p0,int p1){
       String str;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       IWrittenLayout iWrittenLayo = IWrittenLayout.class;
       if (PatchProxy.isSupport(iWrittenLayo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, iWrittenLayo, "92");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       a.p(p0, "$this$string");
       if (PatchProxy.isSupport(l$a.class)) {
          str = PatchProxy.applyThreeRefs(this, p0, Integer.valueOf(p1), null, l$a.class, "10");
          if (str != patchProxyRe) {
          label_0053 :
             return str;
          }
       }
       a.p(p0, "$this$string");
       Context context = p0.getContext();
       a.o(context, "context");
       str = context.getResources().getString(p1);
       a.o(str, "context.resources.getString\(res\)");
       goto label_0053 ;
    }
    public TextView H(TextView p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, IWrittenLayout.class, "17");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$bottom");
       Object obj1 = PatchProxy.applyTwoRefs(this, p0, null, k$a.class, "5");
       if (obj1 != patchProxyRe) {
          p0 = obj1;
       }else {
          a.p(p0, "$this$bottom");
          p0.setGravity(80);
       }
       return p0;
    }
    public LinearLayout$LayoutParams H0(LinearLayout$LayoutParams p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, IWrittenLayout.class, "30");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$centerHorizontal");
       Object obj1 = PatchProxy.applyTwoRefs(this, p0, null, h$a.class, "12");
       if (obj1 != patchProxyRe) {
          i = obj1;
       }else {
          a.p(p0, "$this$centerHorizontal");
          p0.gravity = 1;
       }
       return i;
    }
    public RelativeLayout$LayoutParams I(RelativeLayout$LayoutParams p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, IWrittenLayout.class, "58");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$alignParentRight");
       Object obj1 = PatchProxy.applyTwoRefs(this, p0, null, j$a.class, "10");
       if (obj1 != patchProxyRe) {
          p0 = obj1;
       }else {
          a.p(p0, "$this$alignParentRight");
          p0.addRule(11);
       }
       return p0;
    }
    public TextView I0(TextView p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, IWrittenLayout.class, "23");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$center");
       Object obj1 = PatchProxy.applyTwoRefs(this, p0, null, k$a.class, "9");
       if (obj1 != patchProxyRe) {
          p0 = obj1;
       }else {
          a.p(p0, "$this$center");
          p0.setGravity(17);
       }
       return p0;
    }
    public Button J(ViewGroup p0,ViewGroup$LayoutParams p1,l p2){
       Button this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, IWrittenLayout.class, "81");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$button");
       a.p(p1, "lparams");
       this = PatchProxy.applyFourRefs(this, p0, p1, p2, null, a$a.class, "1");
       if (this != patchProxyRe) {
       }else {
          a.p(p0, "$this$button");
          a.p(p1, "lparams");
          this = this.p0(p0, null, p1, p2);
       }
       return this;
    }
    public ViewGroup$LayoutParams J0(ViewGroup$LayoutParams p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, IWrittenLayout.class, "104");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$matchHeight");
       Object obj1 = PatchProxy.applyTwoRefs(this, p0, null, l$a.class, "22");
       if (obj1 != patchProxyRe) {
          i = obj1;
       }else {
          a.p(p0, "$this$matchHeight");
          p0.height = -1;
       }
       return i;
    }
    public ViewGroup$MarginLayoutParams K(ViewGroup$MarginLayoutParams p0,int p1){
       String obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       IWrittenLayout iWrittenLayo = IWrittenLayout.class;
       if (PatchProxy.isSupport(iWrittenLayo)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, iWrittenLayo, "109");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = "$this$marginTop";
       a.p(p0, obj);
       if (PatchProxy.isSupport(l$a.class)) {
          Object obj1 = PatchProxy.applyThreeRefs(this, p0, Integer.valueOf(p1), null, l$a.class, "27");
          if (obj1 != patchProxyRe) {
             p0 = obj1;
          label_0047 :
             return p0;
          }
       }
       a.p(p0, obj);
       p0.setMargins(p0.leftMargin, p1, p0.rightMargin, p0.bottomMargin);
       goto label_0047 ;
    }
    public ViewGroup$LayoutParams K0(ViewGroup$LayoutParams p0,float p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       IWrittenLayout iWrittenLayo = IWrittenLayout.class;
       if (PatchProxy.isSupport(iWrittenLayo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), this, iWrittenLayo, "101");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       a.p(p0, "$this$dpWidth");
       if (PatchProxy.isSupport(l$a.class)) {
          Object obj1 = PatchProxy.applyThreeRefs(this, p0, Float.valueOf(p1), null, l$a.class, "19");
          if (obj1 != patchProxyRe) {
             int i = obj1;
          label_0048 :
             return i;
          }
       }
       a.p(p0, "$this$dpWidth");
       p0.width = n.c(this.getContext(), p1);
       goto label_0048 ;
    }
    public FrameLayout L(Integer p0,ViewGroup$LayoutParams p1,l p2){
       FrameLayout this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, IWrittenLayout.class, "50");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p1, "lparams");
       this = PatchProxy.applyFourRefs(this, p0, p1, p2, null, e$a.class, "4");
       if (this != patchProxyRe) {
       }else {
          a.p(p1, "lparams");
          super(this.getContext());
          if (p0 != null) {
             this.setId(p0.intValue());
          }
          this.setLayoutParams(p1);
          if (p2 != null) {
             p2.invoke(this);
          }
       }
       return this;
    }
    public void L0(View p0,l p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, IWrittenLayout.class, "114")) {
          return;
       }
       String str = "$this$onClick";
       a.p(p0, str);
       a.p(p1, "handler");
       if (!PatchProxy.applyVoidThreeRefs(this, p0, p1, null, l$a.class, "32")) {
          a.p(p0, str);
          a.p(p1, "handler");
          p0.setOnClickListener(new m(p1));
       }
       return;
    }
    public ImageButton M(ViewGroup p0,Integer p1,ViewGroup$LayoutParams p2,l p3){
       ImageButton imageButton;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, IWrittenLayout.class, "78");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$imageButton");
       a.p(p2, "lparams");
       f$a uoa = f$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{this,p0,p1,p2,p3};
          imageButton = PatchProxy.apply(objArray, null, uoa, "2");
          if (imageButton != patchProxyRe) {
          label_0067 :
             return imageButton;
          }
       }
       a.p(p0, "$this$imageButton");
       a.p(p2, "lparams");
       imageButton = new ImageButton(p0.getContext());
       if (p3 != null) {
          p3.invoke(imageButton);
       }
       if (p1 != null) {
          imageButton.setId(p1.intValue());
       }
       p0.addView(imageButton, p2);
       goto label_0067 ;
    }
    public ViewGroup$LayoutParams M0(ViewGroup$LayoutParams p0,l p1){
       Object this;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, IWrittenLayout.class, "113");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$custom");
       a.p(p1, "init");
       this = PatchProxy.applyThreeRefs(this, p0, p1, null, l$a.class, "31");
       if (this != PatchProxyResult.class) {
          p0 = this;
       }else {
          a.p(p0, "$this$custom");
          a.p(p1, "init");
          p1.invoke(p0);
       }
       return p0;
    }
    public ViewGroup$LayoutParams N(ViewGroup$LayoutParams p0,int p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       IWrittenLayout iWrittenLayo = IWrittenLayout.class;
       if (PatchProxy.isSupport(iWrittenLayo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, iWrittenLayo, "105");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       a.p(p0, "$this$dimenHeight");
       if (PatchProxy.isSupport(l$a.class)) {
          Object obj1 = PatchProxy.applyThreeRefs(this, p0, Integer.valueOf(p1), null, l$a.class, "23");
          if (obj1 != patchProxyRe) {
             int i = obj1;
          label_004c :
             return i;
          }
       }
       a.p(p0, "$this$dimenHeight");
       p0.height = c.a(this.getContext().getResources(), p1);
       goto label_004c ;
    }
    public ViewStub N0(ViewGroup p0,Integer p1,ViewGroup$LayoutParams p2,l p3){
       ViewStub viewStub;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, IWrittenLayout.class, "69");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$viewStub");
       a.p(p2, "lparams");
       n$a uoa = n$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{this,p0,p1,p2,p3};
          viewStub = PatchProxy.apply(objArray, null, uoa, "2");
          if (viewStub != patchProxyRe) {
          label_006b :
             return viewStub;
          }
       }
       a.p(p0, "$this$viewStub");
       a.p(p2, "lparams");
       viewStub = new ViewStub(p0.getContext());
       if (p1 != null) {
          viewStub.setId(p1.intValue());
       }
       viewStub.setInflatedId(-1);
       if (p3 != null) {
          p3.invoke(viewStub);
       }
       p0.addView(viewStub, p2);
       goto label_006b ;
    }
    public FrameLayout$LayoutParams O(FrameLayout$LayoutParams p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, IWrittenLayout.class, "13");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$right");
       Object obj1 = PatchProxy.applyTwoRefs(this, p0, null, e$a.class, "6");
       if (obj1 != patchProxyRe) {
          i = obj1;
       }else {
          a.p(p0, "$this$right");
          p0.gravity = 5;
       }
       return i;
    }
    public TextView O0(TextView p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, IWrittenLayout.class, "33");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$centerHorizontal");
       Object obj1 = PatchProxy.applyTwoRefs(this, p0, null, k$a.class, "10");
       if (obj1 != patchProxyRe) {
          p0 = obj1;
       }else {
          a.p(p0, "$this$centerHorizontal");
          p0.setGravity(1);
       }
       return p0;
    }
    public View P(View p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, IWrittenLayout.class, "85");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$gone");
       Object obj1 = PatchProxy.applyTwoRefs(this, p0, null, l$a.class, "3");
       if (obj1 != patchProxyRe) {
          p0 = obj1;
       }else {
          a.p(p0, "$this$gone");
          p0.setVisibility(8);
       }
       return p0;
    }
    public LinearLayout$LayoutParams P0(LinearLayout$LayoutParams p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, IWrittenLayout.class, "15");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$bottom");
       Object obj1 = PatchProxy.applyTwoRefs(this, p0, null, h$a.class, "7");
       if (obj1 != patchProxyRe) {
          i = obj1;
       }else {
          a.p(p0, "$this$bottom");
          p0.gravity = 80;
       }
       return i;
    }
    public ConstraintLayout Q(ViewGroup$LayoutParams p0,l p1){
       ConstraintLayout this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, IWrittenLayout.class, "62");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "lparams");
       this = PatchProxy.applyThreeRefs(this, p0, p1, null, b$a.class, "3");
       if (this != patchProxyRe) {
       }else {
          a.p(p0, "lparams");
          this = this.k(null, p0, p1);
       }
       return this;
    }
    public int Q0(View p0,float p1){
       int i;
       IWrittenLayout iWrittenLayo = IWrittenLayout.class;
       if (PatchProxy.isSupport(iWrittenLayo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), this, iWrittenLayo, "88");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       a.p(p0, "$this$dip2px");
       if (PatchProxy.isSupport(l$a.class)) {
          Object obj1 = PatchProxy.applyThreeRefs(this, p0, Float.valueOf(p1), null, l$a.class, "6");
          if (obj1 != PatchProxyResult.class) {
             i = obj1.intValue();
          label_004d :
             return i;
          }
       }
       a.p(p0, "$this$dip2px");
       i = n.c(p0.getContext(), p1);
       goto label_004d ;
    }
    public RecyclerView R(ViewGroup p0,Integer p1,ViewGroup$LayoutParams p2,l p3){
       RecyclerView recyclerView;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, IWrittenLayout.class, "80");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$recyclerView");
       a.p(p2, "lparams");
       i$a uoa = i$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{this,p0,p1,p2,p3};
          recyclerView = PatchProxy.apply(objArray, null, uoa, "2");
          if (recyclerView != patchProxyRe) {
          label_0067 :
             return recyclerView;
          }
       }
       a.p(p0, "$this$recyclerView");
       a.p(p2, "lparams");
       recyclerView = new RecyclerView(p0.getContext());
       if (p1 != null) {
          recyclerView.setId(p1.intValue());
       }
       if (p3 != null) {
          p3.invoke(recyclerView);
       }
       p0.addView(recyclerView, p2);
       goto label_0067 ;
    }
    public FrameLayout$LayoutParams R0(FrameLayout$LayoutParams p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, IWrittenLayout.class, "35");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$centerVertical");
       Object obj1 = PatchProxy.applyTwoRefs(this, p0, null, e$a.class, "13");
       if (obj1 != patchProxyRe) {
          i = obj1;
       }else {
          a.p(p0, "$this$centerVertical");
          p0.gravity = 16;
       }
       return i;
    }
    public ConstraintLayout$LayoutParams S(ConstraintLayout p0,l p1){
       ConstraintLayout$LayoutParams this;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, IWrittenLayout.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$matchLparams");
       this = PatchProxy.applyThreeRefs(this, p0, p1, null, b$a.class, "6");
       if (this != PatchProxyResult.class) {
       }else {
          a.p(p0, "$this$matchLparams");
          super(-1, -1);
          if (p1 != null) {
             p1.invoke(this);
          }
       }
       return this;
    }
    public View S0(View p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, IWrittenLayout.class, "86");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$visible");
       Object obj1 = PatchProxy.applyTwoRefs(this, p0, null, l$a.class, "4");
       if (obj1 != patchProxyRe) {
          p0 = obj1;
       }else {
          a.p(p0, "$this$visible");
          p0.setVisibility(0);
       }
       return p0;
    }
    public FrameLayout T(ViewGroup$LayoutParams p0,l p1){
       FrameLayout this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, IWrittenLayout.class, "49");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "lparams");
       this = PatchProxy.applyThreeRefs(this, p0, p1, null, e$a.class, "3");
       if (this != patchProxyRe) {
       }else {
          a.p(p0, "lparams");
          this = this.L(null, p0, p1);
       }
       return this;
    }
    public RelativeLayout$LayoutParams T0(RelativeLayout$LayoutParams p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, IWrittenLayout.class, "57");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$alignParentTop");
       Object obj1 = PatchProxy.applyTwoRefs(this, p0, null, j$a.class, "9");
       if (obj1 != patchProxyRe) {
          p0 = obj1;
       }else {
          a.p(p0, "$this$alignParentTop");
          p0.addRule(10);
       }
       return p0;
    }
    public View U(View p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, IWrittenLayout.class, "87");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$invisible");
       Object obj1 = PatchProxy.applyTwoRefs(this, p0, null, l$a.class, "5");
       if (obj1 != patchProxyRe) {
          p0 = obj1;
       }else {
          a.p(p0, "$this$invisible");
          p0.setVisibility(4);
       }
       return p0;
    }
    public FrameLayout U0(ViewGroup p0,Integer p1,ViewGroup$LayoutParams p2,l p3){
       FrameLayout uFrameLayout;
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, IWrittenLayout.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$frameLayout");
       a.p(p2, "lparams");
       e$a uoa = e$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{this,p0,p1,p2,p3};
          uFrameLayout = PatchProxy.apply(objArray, null, uoa, "2");
          if (uFrameLayout != PatchProxyResult.class) {
          label_0051 :
             return uFrameLayout;
          }
       }
       a.p(p0, "$this$frameLayout");
       a.p(p2, "lparams");
       uFrameLayout = this.L(p1, p2, p3);
       p0.addView(uFrameLayout);
       goto label_0051 ;
    }
    public ViewGroup$LayoutParams V(ViewGroup$LayoutParams p0,int p1){
       IWrittenLayout iWrittenLayo = IWrittenLayout.class;
       if (PatchProxy.isSupport(iWrittenLayo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, iWrittenLayo, "107");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "$this$pxHeight");
       if (PatchProxy.isSupport(l$a.class)) {
          Object obj1 = PatchProxy.applyThreeRefs(this, p0, Integer.valueOf(p1), null, l$a.class, "25");
          if (obj1 != PatchProxyResult.class) {
             int i = obj1;
          label_0040 :
             return i;
          }
       }
       a.p(p0, "$this$pxHeight");
       p0.height = p1;
       goto label_0040 ;
    }
    public LinearLayout V0(ViewGroup p0,int p1,ViewGroup$LayoutParams p2,l p3){
       LinearLayout linearLayout;
       if (PatchProxy.isSupport(IWrittenLayout.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), p2, p3, this, IWrittenLayout.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "$this$linearLayout");
       a.p(p2, "lparams");
       h$a uoa = h$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{this,p0,Integer.valueOf(p1),p2,p3};
          linearLayout = PatchProxy.apply(objArray, null, uoa, "1");
          if (linearLayout != PatchProxyResult.class) {
          label_0063 :
             return linearLayout;
          }
       }
       a.p(p0, "$this$linearLayout");
       a.p(p2, "lparams");
       linearLayout = this.g(p0, null, p1, p2, p3);
       goto label_0063 ;
    }
    public ConstraintLayout W(ViewGroup p0,ViewGroup$LayoutParams p1,l p2){
       ConstraintLayout this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, IWrittenLayout.class, "60");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$constraintLayout");
       a.p(p1, "lparams");
       this = PatchProxy.applyFourRefs(this, p0, p1, p2, null, b$a.class, "1");
       if (this != patchProxyRe) {
       }else {
          a.p(p0, "$this$constraintLayout");
          a.p(p1, "lparams");
          this = this.c1(p0, null, p1, p2);
       }
       return this;
    }
    public View W0(ViewGroup p0,ViewGroup$LayoutParams p1,l p2){
       View this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, IWrittenLayout.class, "83");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$view");
       a.p(p1, "lparams");
       this = PatchProxy.applyFourRefs(this, p0, p1, p2, null, l$a.class, "1");
       if (this != patchProxyRe) {
       }else {
          a.p(p0, "$this$view");
          a.p(p1, "lparams");
          this = this.w0(p0, null, p1, p2);
       }
       return this;
    }
    public LinearLayout X(int p0,ViewGroup$LayoutParams p1,l p2){
       LinearLayout linearLayout;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(IWrittenLayout.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, IWrittenLayout.class, "7");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       a.p(p1, "lparams");
       if (PatchProxy.isSupport(h$a.class)) {
          linearLayout = PatchProxy.applyFourRefs(this, Integer.valueOf(p0), p1, p2, null, h$a.class, "3");
          if (linearLayout != patchProxyRe) {
          label_0048 :
             return linearLayout;
          }
       }
       a.p(p1, "lparams");
       linearLayout = this.F0(null, p0, p1, p2);
       goto label_0048 ;
    }
    public int X0(View p0,float p1){
       int i;
       IWrittenLayout iWrittenLayo = IWrittenLayout.class;
       if (PatchProxy.isSupport(iWrittenLayo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), this, iWrittenLayo, "89");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       a.p(p0, "$this$px2dip");
       if (PatchProxy.isSupport(l$a.class)) {
          Object obj1 = PatchProxy.applyThreeRefs(this, p0, Float.valueOf(p1), null, l$a.class, "7");
          if (obj1 != PatchProxyResult.class) {
             i = obj1.intValue();
          label_004d :
             return i;
          }
       }
       a.p(p0, "$this$px2dip");
       i = n.P(p0.getContext(), p1);
       goto label_004d ;
    }
    public FrameLayout$LayoutParams Y(FrameLayout$LayoutParams p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, IWrittenLayout.class, "28");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$end");
       Object obj1 = PatchProxy.applyTwoRefs(this, p0, null, e$a.class, "10");
       if (obj1 != patchProxyRe) {
          i = obj1;
       }else {
          a.p(p0, "$this$end");
          p0.gravity = 0x800005;
       }
       return i;
    }
    public TextView Y0(TextView p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, IWrittenLayout.class, "20");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$left");
       Object obj1 = PatchProxy.applyTwoRefs(this, p0, null, k$a.class, "6");
       if (obj1 != patchProxyRe) {
          p0 = obj1;
       }else {
          a.p(p0, "$this$left");
          p0.setGravity(3);
       }
       return p0;
    }
    public RelativeLayout$LayoutParams Z(RelativeLayout$LayoutParams p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, IWrittenLayout.class, "55");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$centerInParent");
       Object obj1 = PatchProxy.applyTwoRefs(this, p0, null, j$a.class, "6");
       if (obj1 != patchProxyRe) {
          p0 = obj1;
       }else {
          a.p(p0, "$this$centerInParent");
          p0.addRule(13);
       }
       return p0;
    }
    public ViewGroup Z0(Integer p0,Class p1,ViewGroup$LayoutParams p2,l p3){
       Object obj1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, IWrittenLayout.class, "67");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = "viewGroup";
       a.p(p1, obj);
       a.p(p2, "lparams");
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{this,p0,p1,p2,p3};
          obj1 = PatchProxy.apply(objArray, null, uoa, "4");
          if (obj1 != patchProxyRe) {
          label_0084 :
             return obj1;
          }
       }
       a.p(p1, obj);
       a.p(p2, "lparams");
       Class[] uClassArray = new Class[]{Context.class};
       Object[] objArray1 = new Object[]{this.getContext()};
       p1 = p1.getConstructor(uClassArray).newInstance(objArray1);
       obj1 = p1;
       if (p0 != null) {
          a.o(obj1, "it");
          obj1.setId(p0.intValue());
       }
       a.o(obj1, "it");
       obj1.setLayoutParams(p2);
       if (p3 != null) {
          l1 ol1 = p3.invoke(obj1);
       }
       a.o(p1, "viewGroup.getConstructor\x20\x02   init?.invoke\(it\)\n    }\x00");
       goto label_0084 ;
    }
    public LinearLayout$LayoutParams a(LinearLayout$LayoutParams p0,float p1){
       IWrittenLayout iWrittenLayo = IWrittenLayout.class;
       if (PatchProxy.isSupport(iWrittenLayo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), this, iWrittenLayo, "38");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "$this$weight");
       if (PatchProxy.isSupport(h$a.class)) {
          Object obj1 = PatchProxy.applyThreeRefs(this, p0, Float.valueOf(p1), null, h$a.class, "14");
          if (obj1 != PatchProxyResult.class) {
             float f = obj1;
          label_0040 :
             return f;
          }
       }
       a.p(p0, "$this$weight");
       p0.weight = p1;
       goto label_0040 ;
    }
    public ViewGroup$MarginLayoutParams a0(ViewGroup$MarginLayoutParams p0,int p1){
       String obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       IWrittenLayout iWrittenLayo = IWrittenLayout.class;
       if (PatchProxy.isSupport(iWrittenLayo)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, iWrittenLayo, "112");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = "$this$marginLeft";
       a.p(p0, obj);
       if (PatchProxy.isSupport(l$a.class)) {
          Object obj1 = PatchProxy.applyThreeRefs(this, p0, Integer.valueOf(p1), null, l$a.class, "30");
          if (obj1 != patchProxyRe) {
             p0 = obj1;
          label_0047 :
             return p0;
          }
       }
       a.p(p0, obj);
       p0.setMargins(p1, p0.topMargin, p0.rightMargin, p0.bottomMargin);
       goto label_0047 ;
    }
    public ViewGroup$LayoutParams a1(ViewGroup$LayoutParams p0,int p1){
       IWrittenLayout iWrittenLayo = IWrittenLayout.class;
       if (PatchProxy.isSupport(iWrittenLayo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, iWrittenLayo, "102");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "$this$pxWidth");
       if (PatchProxy.isSupport(l$a.class)) {
          Object obj1 = PatchProxy.applyThreeRefs(this, p0, Integer.valueOf(p1), null, l$a.class, "20");
          if (obj1 != PatchProxyResult.class) {
             int i = obj1;
          label_0040 :
             return i;
          }
       }
       a.p(p0, "$this$pxWidth");
       p0.width = p1;
       goto label_0040 ;
    }
    public Drawable b(View p0,int[] p1,int p2){
       Drawable uDrawable;
       if (PatchProxy.isSupport(IWrittenLayout.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, IWrittenLayout.class, "94");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "$this$drawableFromAttrs");
       a.p(p1, "attrs");
       if (PatchProxy.isSupport(l$a.class)) {
          uDrawable = PatchProxy.applyFourRefs(this, p0, p1, Integer.valueOf(p2), null, l$a.class, "12");
          if (uDrawable != PatchProxyResult.class) {
          label_005f :
             return uDrawable;
          }
       }
       a.p(p0, "$this$drawableFromAttrs");
       a.p(p1, "attrs");
       TypedArray typedArray = p0.getContext().obtainStyledAttributes(p1);
       a.o(typedArray, "context.obtainStyledAttributes\(attrs\)");
       uDrawable = typedArray.getDrawable(p2);
       typedArray.recycle();
       goto label_005f ;
    }
    public FrameLayout$LayoutParams b0(FrameLayout p0,l p1){
       FrameLayout$LayoutParams this;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, IWrittenLayout.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$matchLparams");
       this = PatchProxy.applyThreeRefs(this, p0, p1, null, e$a.class, "15");
       if (this != PatchProxyResult.class) {
       }else {
          a.p(p0, "$this$matchLparams");
          super(-1, -1);
          if (p1 != null) {
             p1.invoke(this);
          }
       }
       return this;
    }
    public RecyclerView b1(ViewGroup p0,ViewGroup$LayoutParams p1,l p2){
       RecyclerView this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, IWrittenLayout.class, "79");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$recyclerView");
       a.p(p1, "lparams");
       this = PatchProxy.applyFourRefs(this, p0, p1, p2, null, i$a.class, "1");
       if (this != patchProxyRe) {
       }else {
          a.p(p0, "$this$recyclerView");
          a.p(p1, "lparams");
          this = this.R(p0, null, p1, p2);
       }
       return this;
    }
    public TextView c(TextView p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, IWrittenLayout.class, "37");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$centerVertical");
       Object obj1 = PatchProxy.applyTwoRefs(this, p0, null, k$a.class, "11");
       if (obj1 != patchProxyRe) {
          p0 = obj1;
       }else {
          a.p(p0, "$this$centerVertical");
          p0.setGravity(16);
       }
       return p0;
    }
    public LinearLayout$LayoutParams c0(LinearLayout$LayoutParams p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, IWrittenLayout.class, "9");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$top");
       Object obj1 = PatchProxy.applyTwoRefs(this, p0, null, h$a.class, "5");
       if (obj1 != patchProxyRe) {
          i = obj1;
       }else {
          a.p(p0, "$this$top");
          p0.gravity = 48;
       }
       return i;
    }
    public ConstraintLayout c1(ViewGroup p0,Integer p1,ViewGroup$LayoutParams p2,l p3){
       ConstraintLayout uConstraintL;
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, IWrittenLayout.class, "61");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$constraintLayout");
       a.p(p2, "lparams");
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{this,p0,p1,p2,p3};
          uConstraintL = PatchProxy.apply(objArray, null, uoa, "2");
          if (uConstraintL != PatchProxyResult.class) {
          label_0051 :
             return uConstraintL;
          }
       }
       a.p(p0, "$this$constraintLayout");
       a.p(p2, "lparams");
       uConstraintL = this.k(p1, p2, p3);
       p0.addView(uConstraintL);
       goto label_0051 ;
    }
    public ViewGroup$LayoutParams d(ViewGroup$LayoutParams p0,float p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       IWrittenLayout iWrittenLayo = IWrittenLayout.class;
       if (PatchProxy.isSupport(iWrittenLayo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), this, iWrittenLayo, "106");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       a.p(p0, "$this$dpHeight");
       if (PatchProxy.isSupport(l$a.class)) {
          Object obj1 = PatchProxy.applyThreeRefs(this, p0, Float.valueOf(p1), null, l$a.class, "24");
          if (obj1 != patchProxyRe) {
             int i = obj1;
          label_0048 :
             return i;
          }
       }
       a.p(p0, "$this$dpHeight");
       p0.height = n.c(this.getContext(), p1);
       goto label_0048 ;
    }
    public ViewGroup$LayoutParams d0(ViewGroup$LayoutParams p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, IWrittenLayout.class, "103");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$wrapHeight");
       Object obj1 = PatchProxy.applyTwoRefs(this, p0, null, l$a.class, "21");
       if (obj1 != patchProxyRe) {
          i = obj1;
       }else {
          a.p(p0, "$this$wrapHeight");
          p0.height = -2;
       }
       return i;
    }
    public ViewGroup$MarginLayoutParams d1(ViewGroup$MarginLayoutParams p0,int p1){
       String obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       IWrittenLayout iWrittenLayo = IWrittenLayout.class;
       if (PatchProxy.isSupport(iWrittenLayo)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, iWrittenLayo, "111");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = "$this$marginBottom";
       a.p(p0, obj);
       if (PatchProxy.isSupport(l$a.class)) {
          Object obj1 = PatchProxy.applyThreeRefs(this, p0, Integer.valueOf(p1), null, l$a.class, "29");
          if (obj1 != patchProxyRe) {
             p0 = obj1;
          label_0047 :
             return p0;
          }
       }
       a.p(p0, obj);
       p0.setMargins(p0.leftMargin, p0.topMargin, p0.rightMargin, p1);
       goto label_0047 ;
    }
    public ViewGroup$MarginLayoutParams e(ViewGroup$MarginLayoutParams p0,int p1){
       String obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       IWrittenLayout iWrittenLayo = IWrittenLayout.class;
       if (PatchProxy.isSupport(iWrittenLayo)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, iWrittenLayo, "110");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = "$this$marginRight";
       a.p(p0, obj);
       if (PatchProxy.isSupport(l$a.class)) {
          Object obj1 = PatchProxy.applyThreeRefs(this, p0, Integer.valueOf(p1), null, l$a.class, "28");
          if (obj1 != patchProxyRe) {
             p0 = obj1;
          label_0047 :
             return p0;
          }
       }
       a.p(p0, obj);
       p0.setMargins(p0.leftMargin, p0.topMargin, p1, p0.bottomMargin);
       goto label_0047 ;
    }
    public FrameLayout$LayoutParams e0(FrameLayout$LayoutParams p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, IWrittenLayout.class, "10");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$top");
       Object obj1 = PatchProxy.applyTwoRefs(this, p0, null, e$a.class, "5");
       if (obj1 != patchProxyRe) {
          i = obj1;
       }else {
          a.p(p0, "$this$top");
          p0.gravity = 48;
       }
       return i;
    }
    public int e1(View p0,int[] p1,int p2,int p3){
       int i;
       if (PatchProxy.isSupport(IWrittenLayout.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, IWrittenLayout.class, "97");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       a.p(p0, "$this$colorFromAttrs");
       a.p(p1, "attrs");
       l$a uoa = l$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{this,p0,p1,Integer.valueOf(p2),Integer.valueOf(p3)};
          Object obj1 = PatchProxy.apply(objArray, null, uoa, "15");
          if (obj1 != PatchProxyResult.class) {
             i = obj1.intValue();
          label_007d :
             return i;
          }
       }
       a.p(p0, "$this$colorFromAttrs");
       a.p(p1, "attrs");
       TypedArray typedArray = p0.getContext().obtainStyledAttributes(p1);
       a.o(typedArray, "context.obtainStyledAttributes\(attrs\)");
       typedArray.recycle();
       i = typedArray.getColor(p2, p3);
       goto label_007d ;
    }
    public ViewGroup f(ViewGroup p0,Integer p1,Class p2,ViewGroup$LayoutParams p3,l p4){
       ViewGroup viewGroup;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p4;
       IWrittenLayout iWrittenLayo = IWrittenLayout.class;
       int i = 5;
       int i1 = 4;
       int i2 = 3;
       int i3 = 2;
       if (PatchProxy.isSupport(iWrittenLayo)) {
          Object[] objArray = new Object[i];
          objArray[0] = oobject;
          objArray[1] = oobject1;
          objArray[i3] = oobject2;
          objArray[i2] = oobject3;
          objArray[i1] = oobject4;
          Object obj1 = PatchProxy.apply(objArray, obj, iWrittenLayo, "65");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       a.p(oobject, "$this$customLayout");
       a.p(oobject2, "viewGroup");
       a.p(oobject3, "lparams");
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray1 = new Object[]{obj,oobject,oobject1,oobject2,oobject3,oobject4};
          viewGroup = PatchProxy.apply(objArray1, null, uoa, "2");
          if (viewGroup != PatchProxyResult.class) {
          label_0074 :
             return viewGroup;
          }
       }
       a.p(oobject, "$this$customLayout");
       a.p(oobject2, "viewGroup");
       a.p(oobject3, "lparams");
       viewGroup = obj.Z0(oobject1, oobject2, oobject3, oobject4);
       goto label_0074 ;
    }
    public EditText f0(ViewGroup p0,Integer p1,ViewGroup$LayoutParams p2,l p3){
       EditText uEditText;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, IWrittenLayout.class, "71");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$editText");
       a.p(p2, "lparams");
       d$a uoa = d$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{this,p0,p1,p2,p3};
          uEditText = PatchProxy.apply(objArray, null, uoa, "2");
          if (uEditText != patchProxyRe) {
          label_0067 :
             return uEditText;
          }
       }
       a.p(p0, "$this$editText");
       a.p(p2, "lparams");
       uEditText = new EditText(p0.getContext());
       if (p1 != null) {
          uEditText.setId(p1.intValue());
       }
       if (p3 != null) {
          p3.invoke(uEditText);
       }
       p0.addView(uEditText, p2);
       goto label_0067 ;
    }
    public LinearLayout$LayoutParams f1(LinearLayout p0,l p1){
       LinearLayout$LayoutParams this;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, IWrittenLayout.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$wrapLparams");
       this = PatchProxy.applyThreeRefs(this, p0, p1, null, h$a.class, "15");
       if (this != PatchProxyResult.class) {
       }else {
          a.p(p0, "$this$wrapLparams");
          super(-2, -2);
          if (p1 != null) {
             p1.invoke(this);
          }
       }
       return this;
    }
    public LinearLayout g(ViewGroup p0,Integer p1,int p2,ViewGroup$LayoutParams p3,l p4){
       LinearLayout linearLayout;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p3;
       object oobject3 = p4;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       IWrittenLayout iWrittenLayo = IWrittenLayout.class;
       int i = 5;
       int i1 = 4;
       int i2 = 2;
       if (PatchProxy.isSupport(iWrittenLayo)) {
          Object[] objArray = new Object[i];
          objArray[0] = oobject;
          objArray[1] = oobject1;
          objArray[i2] = Integer.valueOf(p2);
          objArray[3] = oobject2;
          objArray[i1] = oobject3;
          Object obj1 = PatchProxy.apply(objArray, obj, iWrittenLayo, "6");
          if (obj1 != patchProxyRe) {
             return obj1;
          }
       }
       a.p(oobject, "$this$linearLayout");
       a.p(oobject2, "lparams");
       if (PatchProxy.isSupport(h$a.class)) {
          Object[] objArray1 = new Object[]{obj,oobject,oobject1,Integer.valueOf(p2),oobject2,oobject3};
          linearLayout = PatchProxy.apply(objArray1, null, h$a.class, "2");
          if (linearLayout != patchProxyRe) {
          label_0075 :
             return linearLayout;
          }
       }
       a.p(oobject, "$this$linearLayout");
       a.p(oobject2, "lparams");
       linearLayout = obj.F0(oobject1, p2, oobject2, oobject3);
       oobject.addView(linearLayout);
       goto label_0075 ;
    }
    public LinearLayout$LayoutParams g0(LinearLayout$LayoutParams p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, IWrittenLayout.class, "27");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$end");
       Object obj1 = PatchProxy.applyTwoRefs(this, p0, null, h$a.class, "11");
       if (obj1 != patchProxyRe) {
          i = obj1;
       }else {
          a.p(p0, "$this$end");
          p0.gravity = 0x800005;
       }
       return i;
    }
    public final View g1(ViewGroup p0,View p1,ViewGroup$LayoutParams p2,l p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, IWrittenLayout.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$add");
       a.p(p1, "view");
       a.p(p2, "lparams");
       return this.h1(p0, null, p1, p2, p3);
    }
    public Context getContext(){
       return this.b;
    }
    public int h(View p0,int p1){
       int i;
       IWrittenLayout iWrittenLayo = IWrittenLayout.class;
       if (PatchProxy.isSupport(iWrittenLayo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, iWrittenLayo, "96");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       a.p(p0, "$this$color");
       if (PatchProxy.isSupport(l$a.class)) {
          Object obj1 = PatchProxy.applyThreeRefs(this, p0, Integer.valueOf(p1), null, l$a.class, "14");
          if (obj1 != PatchProxyResult.class) {
             i = obj1.intValue();
          label_004d :
             return i;
          }
       }
       a.p(p0, "$this$color");
       i = ContextCompat.getColor(p0.getContext(), p1);
       goto label_004d ;
    }
    public TextView h0(TextView p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, IWrittenLayout.class, "26");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$start");
       Object obj1 = PatchProxy.applyTwoRefs(this, p0, null, k$a.class, "7");
       if (obj1 != patchProxyRe) {
          p0 = obj1;
       }else {
          a.p(p0, "$this$start");
          p0.setGravity(0x800003);
       }
       return p0;
    }
    public final View h1(ViewGroup p0,Integer p1,View p2,ViewGroup$LayoutParams p3,l p4){
       IWrittenLayout iWrittenLayo = IWrittenLayout.class;
       if (PatchProxy.isSupport(iWrittenLayo)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, this, iWrittenLayo, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "$this$add");
       a.p(p2, "view");
       a.p(p3, "lparams");
       if (p1 != null) {
          p2.setId(p1.intValue());
       }
       if (p4 != null) {
          l1 ol1 = p4.invoke(p2);
       }
       p0.addView(p2, p3);
       return p2;
    }
    public EditText i(ViewGroup p0,ViewGroup$LayoutParams p1,l p2){
       EditText this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, IWrittenLayout.class, "70");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$editText");
       a.p(p1, "lparams");
       this = PatchProxy.applyFourRefs(this, p0, p1, p2, null, d$a.class, "1");
       if (this != patchProxyRe) {
       }else {
          a.p(p0, "$this$editText");
          a.p(p1, "lparams");
          this = this.f0(p0, null, p1, p2);
       }
       return this;
    }
    public ViewStub i0(ViewGroup p0,ViewGroup$LayoutParams p1,l p2){
       ViewStub this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, IWrittenLayout.class, "68");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$viewStub");
       a.p(p1, "lparams");
       this = PatchProxy.applyFourRefs(this, p0, p1, p2, null, n$a.class, "1");
       if (this != patchProxyRe) {
       }else {
          a.p(p0, "$this$viewStub");
          a.p(p1, "lparams");
          this = this.N0(p0, null, p1, p2);
       }
       return this;
    }
    public ImageButton j(ViewGroup p0,ViewGroup$LayoutParams p1,l p2){
       ImageButton this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, IWrittenLayout.class, "77");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$imageButton");
       a.p(p1, "lparams");
       this = PatchProxy.applyFourRefs(this, p0, p1, p2, null, f$a.class, "1");
       if (this != patchProxyRe) {
       }else {
          a.p(p0, "$this$imageButton");
          a.p(p1, "lparams");
          this = this.M(p0, null, p1, p2);
       }
       return this;
    }
    public FrameLayout j0(ViewGroup p0,ViewGroup$LayoutParams p1,l p2){
       FrameLayout this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, IWrittenLayout.class, "47");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$frameLayout");
       a.p(p1, "lparams");
       this = PatchProxy.applyFourRefs(this, p0, p1, p2, null, e$a.class, "1");
       if (this != patchProxyRe) {
       }else {
          a.p(p0, "$this$frameLayout");
          a.p(p1, "lparams");
          this = this.U0(p0, null, p1, p2);
       }
       return this;
    }
    public ConstraintLayout k(Integer p0,ViewGroup$LayoutParams p1,l p2){
       ConstraintLayout this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, IWrittenLayout.class, "63");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p1, "lparams");
       this = PatchProxy.applyFourRefs(this, p0, p1, p2, null, b$a.class, "4");
       if (this != patchProxyRe) {
       }else {
          a.p(p1, "lparams");
          super(this.getContext());
          if (p0 != null) {
             this.setId(p0.intValue());
          }
          this.setLayoutParams(p1);
          if (p2 != null) {
             p2.invoke(this);
          }
       }
       return this;
    }
    public Drawable k0(View p0,int p1){
       Drawable uDrawable;
       IWrittenLayout iWrittenLayo = IWrittenLayout.class;
       if (PatchProxy.isSupport(iWrittenLayo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, iWrittenLayo, "93");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "$this$drawable");
       if (PatchProxy.isSupport(l$a.class)) {
          uDrawable = PatchProxy.applyThreeRefs(this, p0, Integer.valueOf(p1), null, l$a.class, "11");
          if (uDrawable != PatchProxyResult.class) {
          label_0045 :
             return uDrawable;
          }
       }
       a.p(p0, "$this$drawable");
       uDrawable = ContextCompat.getDrawable(p0.getContext(), p1);
       goto label_0045 ;
    }
    public abstract View k1();
    public TextView l(ViewGroup p0,Integer p1,ViewGroup$LayoutParams p2,l p3){
       TextView textView;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, IWrittenLayout.class, "73");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$textView");
       a.p(p2, "lparams");
       k$a uoa = k$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{this,p0,p1,p2,p3};
          textView = PatchProxy.apply(objArray, null, uoa, "2");
          if (textView != patchProxyRe) {
          label_0067 :
             return textView;
          }
       }
       a.p(p0, "$this$textView");
       a.p(p2, "lparams");
       textView = new TextView(p0.getContext());
       if (p1 != null) {
          textView.setId(p1.intValue());
       }
       if (p3 != null) {
          p3.invoke(textView);
       }
       p0.addView(textView, p2);
       goto label_0067 ;
    }
    public LinearLayout$LayoutParams l0(LinearLayout$LayoutParams p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, IWrittenLayout.class, "24");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$start");
       Object obj1 = PatchProxy.applyTwoRefs(this, p0, null, h$a.class, "10");
       if (obj1 != patchProxyRe) {
          i = obj1;
       }else {
          a.p(p0, "$this$start");
          p0.gravity = 0x800003;
       }
       return i;
    }
    public final View l1(){
       Object obj = PatchProxy.apply(null, this, IWrittenLayout.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public FrameLayout$LayoutParams m(FrameLayout$LayoutParams p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, IWrittenLayout.class, "16");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$bottom");
       Object obj1 = PatchProxy.applyTwoRefs(this, p0, null, e$a.class, "7");
       if (obj1 != patchProxyRe) {
          i = obj1;
       }else {
          a.p(p0, "$this$bottom");
          p0.gravity = 80;
       }
       return i;
    }
    public ViewGroup$MarginLayoutParams m0(ViewGroup$MarginLayoutParams p0,int p1,int p2,int p3,int p4){
       IWrittenLayout iWrittenLayo = IWrittenLayout.class;
       int i = 5;
       int i1 = 4;
       int i2 = 3;
       int i3 = 2;
       int i4 = 1;
       if (PatchProxy.isSupport(iWrittenLayo)) {
          Object[] objArray = new Object[i];
          objArray[0] = p0;
          objArray[i4] = Integer.valueOf(p1);
          objArray[i3] = Integer.valueOf(p2);
          objArray[i2] = Integer.valueOf(p3);
          objArray[i1] = Integer.valueOf(p4);
          Object obj = PatchProxy.apply(objArray, this, iWrittenLayo, "108");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "$this$margins");
       l$a uoa = l$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray1 = new Object[]{this,p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          Object obj1 = PatchProxy.apply(objArray1, null, uoa, "26");
          if (obj1 != PatchProxyResult.class) {
             p0 = obj1;
          label_0076 :
             return p0;
          }
       }
       a.p(p0, "$this$margins");
       p0.setMargins(p1, p2, p3, p4);
       goto label_0076 ;
    }
    public final View m1(ViewGroup p0,int p1,l p2){
       if (PatchProxy.isSupport(IWrittenLayout.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, IWrittenLayout.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "$this$include");
       View view = a.c(LayoutInflater.from(p0.getContext()), p1, p0, false);
       a.o(view, "it");
       p2.invoke(view);
       p0.addView(view);
       a.o(view, "LayoutInflater.from\(cont¡­      addView\(it\)\n      }");
       return view;
    }
    public RelativeLayout$LayoutParams n(RelativeLayout$LayoutParams p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, IWrittenLayout.class, "59");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$alignParentLeft");
       Object obj1 = PatchProxy.applyTwoRefs(this, p0, null, j$a.class, "11");
       if (obj1 != patchProxyRe) {
          p0 = obj1;
       }else {
          a.p(p0, "$this$alignParentLeft");
          p0.addRule(9);
       }
       return p0;
    }
    public int n0(View p0,float p1){
       int i;
       IWrittenLayout iWrittenLayo = IWrittenLayout.class;
       if (PatchProxy.isSupport(iWrittenLayo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), this, iWrittenLayo, "90");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       a.p(p0, "$this$sp2px");
       if (PatchProxy.isSupport(l$a.class)) {
          Object obj1 = PatchProxy.applyThreeRefs(this, p0, Float.valueOf(p1), null, l$a.class, "8");
          if (obj1 != PatchProxyResult.class) {
             i = obj1.intValue();
          label_004d :
             return i;
          }
       }
       a.p(p0, "$this$sp2px");
       i = n.c0(p0.getContext(), p1);
       goto label_004d ;
    }
    public FrameLayout$LayoutParams o(FrameLayout$LayoutParams p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, IWrittenLayout.class, "22");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$center");
       Object obj1 = PatchProxy.applyTwoRefs(this, p0, null, e$a.class, "11");
       if (obj1 != patchProxyRe) {
          i = obj1;
       }else {
          a.p(p0, "$this$center");
          p0.gravity = 17;
       }
       return i;
    }
    public int o0(View p0,int p1){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       IWrittenLayout iWrittenLayo = IWrittenLayout.class;
       if (PatchProxy.isSupport(iWrittenLayo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, iWrittenLayo, "91");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       a.p(p0, "$this$dimen");
       if (PatchProxy.isSupport(l$a.class)) {
          Object obj1 = PatchProxy.applyThreeRefs(this, p0, Integer.valueOf(p1), null, l$a.class, "9");
          if (obj1 != patchProxyRe) {
             i = obj1.intValue();
          label_0056 :
             return i;
          }
       }
       a.p(p0, "$this$dimen");
       Context context = p0.getContext();
       a.o(context, "context");
       i = c.a(context.getResources(), p1);
       goto label_0056 ;
    }
    public RelativeLayout p(Integer p0,ViewGroup$LayoutParams p1,l p2){
       RelativeLayout this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, IWrittenLayout.class, "54");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p1, "lparams");
       this = PatchProxy.applyFourRefs(this, p0, p1, p2, null, j$a.class, "4");
       if (this != patchProxyRe) {
       }else {
          a.p(p1, "lparams");
          super(this.getContext());
          if (p0 != null) {
             this.setId(p0.intValue());
          }
          this.setLayoutParams(p1);
          if (p2 != null) {
             p2.invoke(this);
          }
       }
       return this;
    }
    public Button p0(ViewGroup p0,Integer p1,ViewGroup$LayoutParams p2,l p3){
       Button uButton;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, IWrittenLayout.class, "82");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$button");
       a.p(p2, "lparams");
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{this,p0,p1,p2,p3};
          uButton = PatchProxy.apply(objArray, null, uoa, "2");
          if (uButton != patchProxyRe) {
          label_0067 :
             return uButton;
          }
       }
       a.p(p0, "$this$button");
       a.p(p2, "lparams");
       uButton = new Button(p0.getContext());
       if (p1 != null) {
          uButton.setId(p1.intValue());
       }
       if (p3 != null) {
          p3.invoke(uButton);
       }
       p0.addView(uButton, p2);
       goto label_0067 ;
    }
    public RelativeLayout$LayoutParams q(RelativeLayout$LayoutParams p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, IWrittenLayout.class, "32");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$centerHorizontal");
       Object obj1 = PatchProxy.applyTwoRefs(this, p0, null, j$a.class, "5");
       if (obj1 != patchProxyRe) {
          p0 = obj1;
       }else {
          a.p(p0, "$this$centerHorizontal");
          p0.addRule(14);
       }
       return p0;
    }
    public RelativeLayout$LayoutParams q0(RelativeLayout p0,l p1){
       RelativeLayout$LayoutParams this;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, IWrittenLayout.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$matchLparams");
       this = PatchProxy.applyThreeRefs(this, p0, p1, null, j$a.class, "13");
       if (this != PatchProxyResult.class) {
       }else {
          a.p(p0, "$this$matchLparams");
          super(-1, -1);
          if (p1 != null) {
             p1.invoke(this);
          }
       }
       return this;
    }
    public ConstraintLayout$LayoutParams r(ConstraintLayout p0,l p1){
       ConstraintLayout$LayoutParams this;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, IWrittenLayout.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$wrapLparams");
       this = PatchProxy.applyThreeRefs(this, p0, p1, null, b$a.class, "5");
       if (this != PatchProxyResult.class) {
       }else {
          a.p(p0, "$this$wrapLparams");
          super(-2, -2);
          if (p1 != null) {
             p1.invoke(this);
          }
       }
       return this;
    }
    public RelativeLayout$LayoutParams r0(RelativeLayout$LayoutParams p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, IWrittenLayout.class, "56");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$alignParentBottom");
       Object obj1 = PatchProxy.applyTwoRefs(this, p0, null, j$a.class, "8");
       if (obj1 != patchProxyRe) {
          p0 = obj1;
       }else {
          a.p(p0, "$this$alignParentBottom");
          p0.addRule(12);
       }
       return p0;
    }
    public RelativeLayout$LayoutParams s(RelativeLayout p0,l p1){
       RelativeLayout$LayoutParams this;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, IWrittenLayout.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$wrapLparams");
       this = PatchProxy.applyThreeRefs(this, p0, p1, null, j$a.class, "12");
       if (this != PatchProxyResult.class) {
       }else {
          a.p(p0, "$this$wrapLparams");
          super(-2, -2);
          if (p1 != null) {
             p1.invoke(this);
          }
       }
       return this;
    }
    public LinearLayout$LayoutParams s0(LinearLayout$LayoutParams p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, IWrittenLayout.class, "34");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$centerVertical");
       Object obj1 = PatchProxy.applyTwoRefs(this, p0, null, h$a.class, "13");
       if (obj1 != patchProxyRe) {
          i = obj1;
       }else {
          a.p(p0, "$this$centerVertical");
          p0.gravity = 16;
       }
       return i;
    }
    public RelativeLayout t(ViewGroup p0,ViewGroup$LayoutParams p1,l p2){
       RelativeLayout this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, IWrittenLayout.class, "51");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$relativeLayout");
       a.p(p1, "lparams");
       this = PatchProxy.applyFourRefs(this, p0, p1, p2, null, j$a.class, "1");
       if (this != patchProxyRe) {
       }else {
          a.p(p0, "$this$relativeLayout");
          a.p(p1, "lparams");
          this = this.E0(p0, null, p1, p2);
       }
       return this;
    }
    public ColorStateList t0(View p0,int p1){
       ColorStateList uColorStateL;
       IWrittenLayout iWrittenLayo = IWrittenLayout.class;
       if (PatchProxy.isSupport(iWrittenLayo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, iWrittenLayo, "95");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "$this$colorStateList");
       if (PatchProxy.isSupport(l$a.class)) {
          uColorStateL = PatchProxy.applyThreeRefs(this, p0, Integer.valueOf(p1), null, l$a.class, "13");
          if (uColorStateL != PatchProxyResult.class) {
          label_0045 :
             return uColorStateL;
          }
       }
       a.p(p0, "$this$colorStateList");
       uColorStateL = ContextCompat.getColorStateList(p0.getContext(), p1);
       goto label_0045 ;
    }
    public LinearLayout$LayoutParams u(LinearLayout$LayoutParams p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, IWrittenLayout.class, "18");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$left");
       Object obj1 = PatchProxy.applyTwoRefs(this, p0, null, h$a.class, "8");
       if (obj1 != patchProxyRe) {
          i = obj1;
       }else {
          a.p(p0, "$this$left");
          p0.gravity = 3;
       }
       return i;
    }
    public ViewGroup u0(ViewGroup p0,Class p1,ViewGroup$LayoutParams p2,l p3){
       ViewGroup viewGroup;
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, IWrittenLayout.class, "64");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$customLayout");
       a.p(p1, "viewGroup");
       a.p(p2, "lparams");
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{this,p0,p1,p2,p3};
          viewGroup = PatchProxy.apply(objArray, null, uoa, "1");
          if (viewGroup != PatchProxyResult.class) {
          label_005c :
             return viewGroup;
          }
       }
       a.p(p0, "$this$customLayout");
       a.p(p1, "viewGroup");
       a.p(p2, "lparams");
       viewGroup = this.f(p0, null, p1, p2, p3);
       goto label_005c ;
    }
    public void v(TextView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, IWrittenLayout.class, "74")) {
          return;
       }
       String str = "$this$fontFamily";
       a.p(p0, str);
       String str1 = "path";
       a.p(p1, str1);
       if (!PatchProxy.applyVoidThreeRefs(this, p0, p1, null, k$a.class, "12")) {
          a.p(p0, str);
          a.p(p1, str1);
          Context context = p0.getContext();
          a.o(context, "context");
          p0.setTypeface(Typeface.createFromAsset(context.getAssets(), p1));
       }
       return;
    }
    public ImageView v0(ViewGroup p0,Integer p1,ViewGroup$LayoutParams p2,l p3){
       AppCompatImageView uAppCompatIm;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, IWrittenLayout.class, "76");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$imageView");
       a.p(p2, "lparams");
       g$a uoa = g$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{this,p0,p1,p2,p3};
          uAppCompatIm = PatchProxy.apply(objArray, null, uoa, "2");
          if (uAppCompatIm != patchProxyRe) {
          label_0067 :
             return uAppCompatIm;
          }
       }
       a.p(p0, "$this$imageView");
       a.p(p2, "lparams");
       uAppCompatIm = new AppCompatImageView(p0.getContext());
       if (p3 != null) {
          p3.invoke(uAppCompatIm);
       }
       if (p1 != null) {
          uAppCompatIm.setId(p1.intValue());
       }
       p0.addView(uAppCompatIm, p2);
       goto label_0067 ;
    }
    public TextView w(TextView p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, IWrittenLayout.class, "14");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$right");
       Object obj1 = PatchProxy.applyTwoRefs(this, p0, null, k$a.class, "4");
       if (obj1 != patchProxyRe) {
          p0 = obj1;
       }else {
          a.p(p0, "$this$right");
          p0.setGravity(5);
       }
       return p0;
    }
    public View w0(ViewGroup p0,Integer p1,ViewGroup$LayoutParams p2,l p3){
       View view;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, IWrittenLayout.class, "84");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$view");
       a.p(p2, "lparams");
       l$a uoa = l$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{this,p0,p1,p2,p3};
          view = PatchProxy.apply(objArray, null, uoa, "2");
          if (view != patchProxyRe) {
          label_0067 :
             return view;
          }
       }
       a.p(p0, "$this$view");
       a.p(p2, "lparams");
       view = new View(p0.getContext());
       if (p1 != null) {
          view.setId(p1.intValue());
       }
       if (p3 != null) {
          p3.invoke(view);
       }
       p0.addView(view, p2);
       goto label_0067 ;
    }
    public ViewGroup$LayoutParams x(ViewGroup$LayoutParams p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, IWrittenLayout.class, "99");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$matchWidth");
       Object obj1 = PatchProxy.applyTwoRefs(this, p0, null, l$a.class, "17");
       if (obj1 != patchProxyRe) {
          i = obj1;
       }else {
          a.p(p0, "$this$matchWidth");
          p0.width = -1;
       }
       return i;
    }
    public ViewGroup$LayoutParams x0(ViewGroup$LayoutParams p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, IWrittenLayout.class, "98");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$wrapWidth");
       Object obj1 = PatchProxy.applyTwoRefs(this, p0, null, l$a.class, "16");
       if (obj1 != patchProxyRe) {
          i = obj1;
       }else {
          a.p(p0, "$this$wrapWidth");
          p0.width = -2;
       }
       return i;
    }
    public RelativeLayout$LayoutParams y(RelativeLayout$LayoutParams p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, IWrittenLayout.class, "36");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$centerVertical");
       Object obj1 = PatchProxy.applyTwoRefs(this, p0, null, j$a.class, "7");
       if (obj1 != patchProxyRe) {
          p0 = obj1;
       }else {
          a.p(p0, "$this$centerVertical");
          p0.addRule(15);
       }
       return p0;
    }
    public ViewGroup y0(Class p0,ViewGroup$LayoutParams p1,l p2){
       ViewGroup this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, IWrittenLayout.class, "66");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "viewGroup");
       a.p(p1, "lparams");
       this = PatchProxy.applyFourRefs(this, p0, p1, p2, null, c$a.class, "3");
       if (this != patchProxyRe) {
       }else {
          a.p(p0, "viewGroup");
          a.p(p1, "lparams");
          this = this.Z0(null, p0, p1, p2);
       }
       return this;
    }
    public FrameLayout$LayoutParams z(FrameLayout p0,l p1){
       FrameLayout$LayoutParams this;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, IWrittenLayout.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$wrapLparams");
       this = PatchProxy.applyThreeRefs(this, p0, p1, null, e$a.class, "14");
       if (this != PatchProxyResult.class) {
       }else {
          a.p(p0, "$this$wrapLparams");
          super(-2, -2);
          if (p1 != null) {
             p1.invoke(this);
          }
       }
       return this;
    }
    public ViewGroup$LayoutParams z0(ViewGroup$LayoutParams p0,int p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       IWrittenLayout iWrittenLayo = IWrittenLayout.class;
       if (PatchProxy.isSupport(iWrittenLayo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, iWrittenLayo, "100");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       a.p(p0, "$this$dimenWidth");
       if (PatchProxy.isSupport(l$a.class)) {
          Object obj1 = PatchProxy.applyThreeRefs(this, p0, Integer.valueOf(p1), null, l$a.class, "18");
          if (obj1 != patchProxyRe) {
             int i = obj1;
          label_004c :
             return i;
          }
       }
       a.p(p0, "$this$dimenWidth");
       p0.width = c.a(this.getContext().getResources(), p1);
       goto label_004c ;
    }
}
