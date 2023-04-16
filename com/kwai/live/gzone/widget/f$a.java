package com.kwai.live.gzone.widget.f$a;
import t77.a$b;
import com.kwai.live.gzone.widget.f;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.view.ViewGroup;

public class f$a implements a$b	// class@000e90
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public void a(Fragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "1")) {
          return;
       }
       if (p0 instanceof BaseFragment) {
          p0.bh(true);
       }
       return;
    }
    public ViewGroup b(){
       return this.a.D;
    }
}
