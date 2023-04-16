package com.yxcorp.gifshow.log.s;
import com.yxcorp.gifshow.log.r;
import android.content.Context;
import w2b.a;
import k2b.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import w2b.b;
import java.lang.Exception;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.List;
import android.app.Activity;

public class s implements r	// class@0011fd
{
    public a a;
    public final Context b;
    public final b c;

    public void s(Context p0,a p1,b p2){
       super();
       this.a = p1;
       this.b = p0;
       this.c = p2;
    }
    public final void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "6")) {
          return;
       }
       if (this.a == null) {
          this.a = new b(this.b);
       }
       try{
          this.a.j(p0);
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, s.class, "2")) {
          return;
       }
       try{
          s ta = this.a;
          if (ta != null) {
             ta.c();
          }else {
             this.m();
          }
       }catch(java.lang.Exception e0){
          this.m();
       }
       return;
    }
    public final void l(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "7")) {
          return;
       }
       if (this.a == null) {
          this.a = new b(this.b);
       }
       try{
          this.a.i(p0);
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       return;
    }
    public final void m(){
       if (PatchProxy.applyVoid(null, this, s.class, "5")) {
          return;
       }
       if (this.a == null) {
          this.a = new b(this.b);
       }
       try{
          this.a.c();
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return;
    }
    public boolean p(){
       s obj = PatchProxy.apply(null, this, s.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a;
       if (obj != null) {
          return obj.p();
       }
       obj = this.c;
       boolean b = true;
       if (obj != null && obj.e().size() > b) {
          b = false;
       }
       return b;
    }
    public void u(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "1")) {
          return;
       }
       String str = String.valueOf(p0.hashCode());
       try{
          s ta = this.a;
          if (ta != null) {
             ta.j(str);
          }else {
             this.b(str);
          }
       }catch(java.lang.Exception e0){
          this.b(str);
       }
       return;
    }
    public void y0(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "3")) {
          return;
       }
       String str = String.valueOf(p0.hashCode());
       try{
          s ta = this.a;
          if (ta != null) {
             ta.i(str);
          }else {
             this.l(str);
          }
       }catch(java.lang.Exception e0){
          this.l(str);
       }
       return;
    }
}
