package com.yxcorp.gifshow.camera.record.activity.HtmlCameraFragment;
import mm6.c;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import mm6.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.yoda.bridge.YodaBaseWebView;
import android.view.View;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.kwai.gifshow.post.api.core.model.PosterActivityTabInfo;
import eh9.l;
import rb9.a;
import java.lang.Integer;
import brd.t;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import gr8.c;
import brd.x;
import rb9.b;
import com.yxcorp.gifshow.camera.record.activity.a;
import erd.g;
import crd.b;
import lnc.b9;
import java.lang.Boolean;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import android.view.KeyEvent;
import hka.d;
import hka.c;

public class HtmlCameraFragment extends KwaiYodaWebViewFragment implements c	// class@001c9b
{
    public b C;
    public Integer D;
    public Integer E;
    public static final int F;

    public void HtmlCameraFragment(){
       super();
    }
    public boolean Eh(){
       return false;
    }
    public int Ff(){
       return b.c(this);
    }
    public final void Oh(){
       if (PatchProxy.applyVoid(null, this, HtmlCameraFragment.class, "7")) {
          return;
       }
       YodaBaseWebView yodaBaseWebV = this.Ch();
       if (yodaBaseWebV != null && !yodaBaseWebV.hasFocus()) {
          yodaBaseWebV.requestFocus();
       }
       return;
    }
    public int S5(){
       return b.d(this);
    }
    public String Xa(){
       return b.e(this);
    }
    public boolean a4(){
       return true;
    }
    public void dg(Activity p0){
       b.a(this, p0);
    }
    public boolean f9(){
       return b.f(this);
    }
    public Drawable i9(){
       return b.i(this);
    }
    public boolean lf(){
       return true;
    }
    public boolean onBackPressed(){
       return false;
    }
    public void onCreate(Bundle p0){
       a a;
       if (PatchProxy.applyVoidOneRefs(p0, this, HtmlCameraFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       PosterActivityTabInfo posterActivi = l.i();
       if (posterActivi != null) {
          a = a.a;
          this.D = a.b(posterActivi.mSelectTabColor);
          this.E = a.b(posterActivi.mUnselectTabColor);
       }
       this.C = this.Z0().compose(c.c(this.m(), FragmentEvent.DESTROY_VIEW)).subscribe(new b(this), a.b);
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, HtmlCameraFragment.class, "5")) {
          return;
       }
       super.onDestroy();
       b9.a(this.C);
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, HtmlCameraFragment.class, "4")) {
          return;
       }
       this.bh(false);
       super.onDestroyView();
       return;
    }
    public void onHiddenChanged(boolean p0){
       if (PatchProxy.isSupport(HtmlCameraFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, HtmlCameraFragment.class, "6")) {
          return;
       }
       super.onHiddenChanged(p0);
       Object[] objArray = new Object[0];
       a.D().w("HtmlCameraFragment", "onHiddenChanged: "+p0, objArray);
       this.bh((p0 ^ 0x01));
       return;
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       return c.a(this, p0, p1);
    }
    public boolean onKeyUp(int p0,KeyEvent p1){
       return c.b(this, p0, p1);
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HtmlCameraFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.bh(true);
       this.Oh();
       return;
    }
    public boolean re(){
       return false;
    }
    public boolean x2(){
       return true;
    }
}
