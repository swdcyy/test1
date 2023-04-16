package com.yxcorp.gifshow.activity.SingleFragmentActivity$a;
import com.yxcorp.gifshow.activity.x;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.ref.WeakReference;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;

public class SingleFragmentActivity$a extends x	// class@00133a
{

    public void SingleFragmentActivity$a(GifshowActivity p0){
       super(p0);
    }
    public Fragment c(){
       Fragment obj = PatchProxy.apply(null, this, SingleFragmentActivity$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d.get();
       if (obj != null) {
          return obj;
       }
       return this.c.getSupportFragmentManager().findFragmentById(this.c.v3());
    }
}
