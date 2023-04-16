package com.yxcorp.gifshow.activity.SingleFragmentActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.activity.x;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.activity.SingleFragmentActivity$a;
import android.os.Bundle;
import android.app.Activity;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import com.gifshow.tuna.player.poi.PoiFoodListSlidePlayActivity;
import androidx.fragment.app.e;

public abstract class SingleFragmentActivity extends GifshowActivity	// class@001035
{

    public void SingleFragmentActivity(){
       super();
    }
    public x d3(){
       Object obj = PatchProxy.apply(null, this, SingleFragmentActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new SingleFragmentActivity$a(this);
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SingleFragmentActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       if (this.y3()) {
          w9.a(this);
       }
       this.setContentView(this.x3());
       this.z3();
       return;
    }
    public abstract Fragment u3();
    public int v3(){
       return 0x7f0a0fe6;
    }
    public Fragment w3(){
       Object obj = PatchProxy.apply(null, this, SingleFragmentActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getSupportFragmentManager().findFragmentById(this.v3());
    }
    public int x3(){
       return 0x7f0d0028;
    }
    public boolean y3(){
       return this instanceof PoiFoodListSlidePlayActivity;
    }
    public void z3(){
       if (PatchProxy.applyVoid(null, this, SingleFragmentActivity.class, "2")) {
          return;
       }
       Fragment uFragment = this.u3();
       if (uFragment == null) {
          return;
       }
       e uoe = this.getSupportFragmentManager().beginTransaction();
       uoe.v(this.v3(), uFragment);
       uoe.m();
       return;
    }
}
