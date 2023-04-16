package com.yxcorp.gifshow.ad.detail.presenter.ad.playend.view.AdPlayEndBaseView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.view.AdPlayEndBaseView$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import e3a.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import java.lang.Integer;
import gz8.a;
import com.yxcorp.gifshow.entity.QPhoto;
import androidx.lifecycle.Lifecycle;
import n49.o;

public class AdPlayEndBaseView extends FrameLayout	// class@0015f2
{
    public Context b;
    public a c;
    public o d;
    public boolean e;
    public a f;

    public void AdPlayEndBaseView(Context p0){
       super(p0, null);
    }
    public void AdPlayEndBaseView(Context p0,AttributeSet p1){
       super(p0, null, 0);
    }
    public void AdPlayEndBaseView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.e = false;
       this.f = new AdPlayEndBaseView$a(this);
       this.b = p0;
       this.a();
    }
    public void a(){
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, AdPlayEndBaseView.class, "2")) {
          return;
       }
       a.b(this.b).l3(this.f);
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, AdPlayEndBaseView.class, "1")) {
          return;
       }
       a.b(this.b).F2(this.f);
       return;
    }
    public void d(int p0){
       if (PatchProxy.isSupport(AdPlayEndBaseView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, AdPlayEndBaseView.class, "3")) {
          return;
       }
       AdPlayEndBaseView tc = this.c;
       if (tc != null) {
          tc.z5(p0);
       }
       return;
    }
    public void e(int p0){
       if (PatchProxy.isSupport(AdPlayEndBaseView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, AdPlayEndBaseView.class, "5")) {
          return;
       }
       AdPlayEndBaseView tc = this.c;
       if (tc != null) {
          tc.q2(p0);
       }
       return;
    }
    public void f(QPhoto p0,Lifecycle p1){
    }
    public void setAdPlayEndViewClickListener(a p0){
       this.c = p0;
    }
    public void setCloseByPhysicalBack(boolean p0){
       this.e = p0;
    }
    public void setPhotoAdActionBarClickProcessor(o p0){
       this.d = p0;
    }
}
