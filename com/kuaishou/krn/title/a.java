package com.kuaishou.krn.title.a;
import kk0.c;
import ik0.g;
import android.view.View;
import android.widget.FrameLayout;
import com.kuaishou.krn.model.LaunchModel;
import kk0.a;
import java.lang.Object;
import com.kuaishou.krn.title.KrnTopBar;
import android.content.Context;
import android.app.Activity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.krn.title.ButtonParams;
import com.kuaishou.krn.title.ButtonParams$PositionId;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import com.kuaishou.krn.title.TopBarParams;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.graphics.Color;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.kuaishou.krn.title.KrnTopBar$b;
import java.util.Objects;
import android.text.TextUtils$TruncateAt;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.content.res.Resources;
import cw9.c;
import com.yxcorp.utility.n;
import java.util.Locale;
import com.kuaishou.krn.title.ButtonParams$Icon;
import android.graphics.drawable.Drawable;
import android.widget.ImageButton;
import android.graphics.PorterDuff$Mode;
import kk0.b;
import android.view.View$OnClickListener;

public class a implements c	// class@00091e
{
    public KrnTopBar a;
    public View b;
    public View c;
    public LaunchModel d;
    public a e;
    public FrameLayout f;
    public g g;
    public Activity h;

    public void a(g p0,View p1,FrameLayout p2,LaunchModel p3,a p4){
       super();
       this.g = p0;
       this.b = p1;
       this.f = p2;
       this.d = p3;
       this.e = p4;
       this.a = p1.findViewById(0x7f0a3f40);
       this.c = p1.findViewById(0x7f0a0462);
       this.h = this.b.getContext();
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "1")) {
       }else if(!this.d.n()){
          this.g();
          if (!PatchProxy.applyVoid(objArray, this, uoa, "3")) {
             ButtonParams uButtonParam = new ButtonParams();
             uButtonParam.buttonId = ButtonParams$PositionId.CENTER;
             a td = this.d;
             uButtonParam.title = td.b;
             String str = PatchProxy.apply(objArray, td, LaunchModel.class, "16");
             if (str != PatchProxyResult.class) {
             }else {
                str = td.d.getString("titleColor", "");
             }
             uButtonParam.textColor = str;
             this.b(uButtonParam);
          }
          this.f();
       }
       return;
    }
    public void a(TopBarParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "10")) {
          return;
       }
       if (this.a == null) {
          return;
       }
       if (this.b.getVisibility()) {
          this.g();
          this.f();
       }
       try{
          if (!TextUtils.isEmpty(p0.backgroundColor)) {
             this.a.setBackgroundColor(Color.parseColor(p0.backgroundColor));
          }else {
             this.a.setBackgroundResource(this.e.c);
          }
          try{
             if (!TextUtils.isEmpty(p0.borderBottomColor)) {
                this.c.setBackgroundColor(Color.parseColor(p0.borderBottomColor));
             }else {
                this.c.setBackgroundResource(this.e.d);
             }
             return;
          }catch(java.lang.Exception e0){
          }
       }catch(java.lang.Exception e0){
       }
    }
    public void b(ButtonParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "9")) {
          return;
       }
       if (this.a == null) {
          return;
       }
       if (TextUtils.isEmpty(p0.title)) {
          this.c(8);
          return;
       }else if(this.b.getVisibility()){
          this.g();
          this.f();
       }
       ButtonParams$PositionId cENTER = ButtonParams$PositionId.CENTER;
       TextView textView = this.a.findViewById(cENTER.positionId);
       if (textView == null) {
          KrnTopBar$b uob = this.e(this.a.getContext());
          Objects.requireNonNull(uob);
          TextView textView1 = PatchProxy.apply(null, uob, KrnTopBar$b.class, "2");
          if (textView1 != PatchProxyResult.class) {
          }else {
             textView1 = new TextView(uob.a);
             textView1.setText(uob.d);
             textView1.setTextColor(uob.c);
             textView1.setGravity(17);
             textView1.setSingleLine(true);
             textView1.setTextSize(0, (float)uob.b);
             textView1.setEllipsize(TextUtils$TruncateAt.END);
          }
          this.h(textView1, p0);
          textView1.setId(cENTER.positionId);
          this.a.setTitle(textView1);
          return;
       }else {
          this.h(textView, p0);
          return;
       }
    }
    public void c(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "8")) {
          return;
       }
       this.b.setVisibility(p0);
       FrameLayout$LayoutParams layoutParams = this.f.getLayoutParams();
       String str = null;
       int i = c.b(this.h.getResources(), R.dimen.arg_RES_7f07047d);
       int i1 = n.A(this.h);
       if (!p0) {
          if (("1").equals(this.d.m())) {
             i = i + i1;
          }
          str = i;
       }
       layoutParams.topMargin = str;
       this.f.setLayoutParams(layoutParams);
       return;
    }
    public void d(ButtonParams p0){
       ButtonParams textColor;
       ImageButton imageButton;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "11")) {
          return;
       }
       if (this.a == null) {
          return;
       }
       if (this.b.getVisibility()) {
          this.g();
       }
       KrnTopBar$b uob = KrnTopBar$b.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KrnTopBar$b obj = PatchProxy.applyOneRefs(p0, this, uoa, "7");
       if (obj != patchProxyRe) {
       }else {
          obj = this.e(this.a.getContext());
          if (!TextUtils.isEmpty(p0.image)) {
             ButtonParams$Icon iconId = ButtonParams$Icon.valueOf((p0.image).toUpperCase(Locale.US)).iconId;
             Objects.requireNonNull(obj);
             if (PatchProxy.isSupport(uob) && PatchProxy.applyOneRefs(Integer.valueOf(iconId), obj, uob, "1") != patchProxyRe) {
             }else {
                obj.f = obj.a.getResources().getDrawable(iconId);
             }
          }
          if (!TextUtils.isEmpty(p0.textColor)) {
             textColor = p0.textColor;
          }else {
             a td = this.d;
             Objects.requireNonNull(td);
             Object obj1 = PatchProxy.apply(null, td, LaunchModel.class, "17");
             textColor = (obj1 != patchProxyRe)? obj1: td.d.getString("titleIconColor", "");
          }
          if (!TextUtils.isEmpty(textColor)) {
             try{
                obj.e = Color.parseColor(textColor);
             }catch(java.lang.Exception e0){
             }
          }
       }
       if (!PatchProxy.applyVoidOneRefs(obj, this, uoa, "12") && obj != null) {
          obj.setOnClickListener(new b(this));
       }
       this.a.b(p0.buttonId, obj);
       return;
    }
    public final KrnTopBar$b e(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KrnTopBar$b(p0, this.e);
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       ButtonParams uButtonParam = new ButtonParams();
       uButtonParam.buttonId = ButtonParams$PositionId.LEFT1;
       uButtonParam.image = ButtonParams$Icon.BACK.value;
       this.d(uButtonParam);
       return;
    }
    public final void g(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "2")) {
          return;
       }
       if (("1").equals(this.d.m())) {
          FrameLayout$LayoutParams layoutParams = this.b.getLayoutParams();
          layoutParams.topMargin = n.A(this.h);
          this.b.setLayoutParams(layoutParams);
       }
       this.c(0);
       TopBarParams topBarParams = new TopBarParams();
       a td = this.d;
       Objects.requireNonNull(td);
       String str = PatchProxy.apply(objArray, td, LaunchModel.class, "15");
       if (str != patchProxyRe) {
       }else {
          str = td.d.getString("topBarBgColor", "");
       }
       topBarParams.backgroundColor = str;
       td = this.d;
       Objects.requireNonNull(td);
       String str1 = PatchProxy.apply(objArray, td, LaunchModel.class, "18");
       if (str1 != patchProxyRe) {
       }else {
          str1 = td.d.getString("borderBottomColor", "");
       }
       topBarParams.borderBottomColor = str1;
       this.a(topBarParams);
       return;
    }
    public final void h(TextView p0,ButtonParams p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "5")) {
          return;
       }
       try{
          if (!TextUtils.isEmpty(p1.title)) {
             p0.setText(p1.title);
             if (!TextUtils.isEmpty(p1.textColor)) {
                p0.setTextColor(Color.parseColor(p1.textColor));
             }
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
