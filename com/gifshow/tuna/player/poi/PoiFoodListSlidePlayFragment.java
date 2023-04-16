package com.gifshow.tuna.player.poi.PoiFoodListSlidePlayFragment;
import com.gifshow.tuna.player.component.TunaSlidePlayFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import oj.l;
import brd.t;
import cjd.e;
import erd.o;
import com.gifshow.tuna.player.poi.g;
import oj.g;
import erd.g;
import crd.b;
import crd.a;
import nj.h;
import com.kwai.robust.PatchProxyResult;
import oj.k;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import nj.d;
import com.gifshow.tuna.player.component.TunaSlidePlayFragment$PageState;
import android.view.ViewGroup;
import android.view.View;
import android.os.Bundle;

public class PoiFoodListSlidePlayFragment extends TunaSlidePlayFragment	// class@0015ee
{
    public PoiFoodFeedListModel t;
    public String u;
    public int v;
    public static final int w;

    public void PoiFoodListSlidePlayFragment(){
       super();
    }
    public void ch(){
       if (PatchProxy.applyVoid(null, this, PoiFoodListSlidePlayFragment.class, "2")) {
          return;
       }
       b uob = b.a(-1882797052).a(this.u, 0).map(new e()).subscribe(new g(this), new g(this));
       if (!PatchProxy.applyVoidOneRefs(uob, this, TunaSlidePlayFragment.class, "6")) {
          this.o.c(uob);
       }
       return;
    }
    public h dh(){
       Object obj = PatchProxy.apply(null, this, PoiFoodListSlidePlayFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new k(this.getActivity(), this);
    }
    public final void fh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PoiFoodListSlidePlayFragment.class, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, TunaSlidePlayFragment.class, "9")) {
          this.p = TunaSlidePlayFragment$PageState.ERROR;
          this.j.setVisibility(4);
          this.k.setVisibility(4);
          this.l.setVisibility(0);
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PoiFoodListSlidePlayFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       p0 = this.getArguments();
       if (p0 != null) {
          this.u = p0.getString("poiId");
          this.v = p0.getInt("index");
       }
       return;
    }
}
