package com.kuaishou.live.gzone.treasurebox.i$a;
import androidx.fragment.app.c$b;
import com.kuaishou.live.gzone.treasurebox.i;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import com.kwai.live.gzone.popup.bean.LiveGzoneCommonPopupInfo;
import brd.t;
import brd.z;
import io.reactivex.android.schedulers.a;
import java.util.concurrent.TimeUnit;
import m53.k;
import m53.l;
import erd.g;

public class i$a extends c$b	// class@001c6b
{
    public final i a;

    public void i$a(i p0){
       this.a = p0;
       super();
    }
    public void i(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i$a.class, "1")) {
          return;
       }
       i$a ta = this.a;
       if (ta.G != null) {
          i h = ta.H;
          if (h != null) {
             h.dispose();
          }
          ta = this.a;
          ta.H = ta.S8(ta.G.mRecordId).subscribeOn(a.c()).throttleFirst(10, TimeUnit.MILLISECONDS).subscribe(new k(this), new l(this));
       }
       return;
    }
}
