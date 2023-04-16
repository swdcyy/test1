package com.kuaishou.live.gzone.v2.activity.e$a;
import erd.g;
import com.kuaishou.live.gzone.v2.activity.e;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import y43.a;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import android.content.res.Configuration;

public class e$a implements g	// class@001cba
{
    public final e b;

    public void e$a(e p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
       }else if(p0 == FragmentEvent.RESUME){
          p0 = this.b;
          p0.l0(p0.y.O().getResources().getConfiguration());
       }
       return;
    }
}
