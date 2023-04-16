package com.kwai.live.gzone.accompanyplay.audience.w0$a;
import t77.a$b;
import com.kwai.live.gzone.accompanyplay.audience.w0;
import android.view.ViewGroup;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class w0$a implements a$b	// class@000bc2
{
    public final ViewGroup a;
    public final w0 b;

    public void w0$a(w0 p0,ViewGroup p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(Fragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w0$a.class, "1")) {
          return;
       }
       if (p0 instanceof BaseFragment) {
          p0.bh(true);
       }
       return;
    }
    public ViewGroup b(){
       return this.a;
    }
}
