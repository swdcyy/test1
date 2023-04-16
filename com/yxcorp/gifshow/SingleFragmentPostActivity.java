package com.yxcorp.gifshow.SingleFragmentPostActivity;
import com.yxcorp.gifshow.activity.BasePostActivity;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import android.os.Bundle;
import androidx.fragment.app.e;

public abstract class SingleFragmentPostActivity extends BasePostActivity	// class@001304
{

    public void SingleFragmentPostActivity(){
       super();
    }
    public abstract Fragment G3();
    public int H3(){
       return 0x7f0a0fe6;
    }
    public Fragment I3(){
       Object obj = PatchProxy.apply(null, this, SingleFragmentPostActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getSupportFragmentManager().findFragmentById(this.H3());
    }
    public int J3(){
       return 0x7f0d0028;
    }
    public void onCreate(Bundle p0){
       SingleFragmentPostActivity singleFragme = SingleFragmentPostActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, singleFragme, "1")) {
          return;
       }
       super.onCreate(p0);
       this.setContentView(this.J3());
       if (!PatchProxy.applyVoid(null, this, singleFragme, "2")) {
          Fragment uFragment = this.G3();
          if (uFragment != null) {
             e uoe = this.getSupportFragmentManager().beginTransaction();
             uoe.v(this.H3(), uFragment);
             uoe.m();
          }
       }
       return;
    }
}
