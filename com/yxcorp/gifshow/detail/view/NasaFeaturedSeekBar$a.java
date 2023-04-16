package com.yxcorp.gifshow.detail.view.NasaFeaturedSeekBar$a;
import joc.z;
import com.yxcorp.gifshow.detail.view.NasaFeaturedSeekBar;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.content.Context;
import android.app.Activity;
import e3a.a;
import uo5.a;
import android.view.View$OnTouchListener;
import java.lang.Math;

public class NasaFeaturedSeekBar$a extends z	// class@001a49
{
    public final NasaFeaturedSeekBar e;

    public void NasaFeaturedSeekBar$a(NasaFeaturedSeekBar p0){
       this.e = p0;
       super();
    }
    public boolean d(View p0,MotionEvent p1){
       NasaFeaturedSeekBar$a obj = PatchProxy.applyTwoRefs(p0, p1, this, NasaFeaturedSeekBar$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int actionMasked = p1.getActionMasked();
       if (!actionMasked) {
          this.e.G = (int)p1.getX();
          this.e.H = (int)p1.getY();
          obj = this.e;
          obj.I = obj.G;
          obj.f1 = false;
          obj.F = obj.f(p1);
          obj = this.e;
          if (obj.F != null) {
             a.c(a.b(obj.getContext()), false, 14);
             NasaFeaturedSeekBar h1 = this.e.h1;
             if (h1 != null) {
                h1.onTouch(p0, p1);
             }
          }
       }else if(actionMasked == 0.00f){
          NasaFeaturedSeekBar$a te = this.e;
          int i = te.G - (int)p1.getX();
          int i1 = te.H - (int)p1.getY();
          if (te.l1 != null && te.m1 == null) {
             te.F = te.f(p1);
             i1.m1 = true;
          }else if(te.F != null && (Math.abs(i) >= this.e.L && Math.abs(i) >= Math.abs(i1))){
             NasaFeaturedSeekBar$a te1 = this.e;
             te1.j1 = true;
             te1.f1 = true;
          }
       }
       return this.e.f1;
    }
    public boolean f(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, NasaFeaturedSeekBar$a.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       NasaFeaturedSeekBar$a te = this.e;
       if (te.j1 != null && te.l1 == null) {
          return te.d(p1);
       }
       te.l1 = false;
       return false;
    }
}
