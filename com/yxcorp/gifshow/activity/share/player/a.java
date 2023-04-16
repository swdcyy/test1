package com.yxcorp.gifshow.activity.share.player.a;
import com.yxcorp.gifshow.activity.share.player.PreviewPlayer;
import android.app.Activity;
import com.yxcorp.gifshow.widget.PicturesContainer;
import com.yxcorp.gifshow.widget.l;
import com.yxcorp.gifshow.activity.share.player.a$a;
import android.view.View;
import android.net.Uri;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout$LayoutParams;
import java.lang.Boolean;
import java.util.List;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import yw8.a;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;

public class a extends PreviewPlayer	// class@00139b
{
    public l c;
    public a$a d;

    public void a(Activity p0,PicturesContainer p1,l p2,a$a p3){
       super(p0, p1);
       this.c = p2;
       this.d = p3;
    }
    public void a(Uri p0,int p1,int p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, a.class, "1")) {
          return;
       }
       FrameLayout$LayoutParams layoutParams = this.b.getLayoutParams();
       layoutParams.width = p1;
       layoutParams.height = p2;
       this.b.requestLayout();
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       this.c.l();
       return;
    }
    public void d(){
       PatchProxy.applyVoid(null, this, a.class, "5");
    }
    public void e(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "6")) {
          return;
       }
       if (p0) {
          this.c.l();
          this.c.p();
       }else {
          this.c.m();
       }
       return;
    }
    public t f(List p0,List p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.fromCallable(new a(this, p0, p1)).subscribeOn(d.a);
    }
    public void g(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "8")) {
          return;
       }
       this.d.n(p0);
       return;
    }
    public boolean h(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.c.v();
       return true;
    }
    public boolean i(){
       return true;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, a.class, "7")) {
          return;
       }
       this.d.n(0);
       return;
    }
}
