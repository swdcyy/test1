package com.yxcorp.gifshow.profile.status.panel.StatusPanelListFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import r5c.b;
import s5c.v;
import s5c.t;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import s5c.a;
import p5c.c;
import java.util.Objects;
import android.os.Parcelable;
import org.parceler.b;
import com.kwai.framework.model.user.User;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import zf6.k;
import i2b.a;
import java.util.List;
import java.util.Map;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.RecyclerView$s;
import y8c.g;
import p5c.b;

public abstract class StatusPanelListFragment extends RecyclerFragment	// class@0015b8
{
    public c F;

    public void StatusPanelListFragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, StatusPanelListFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       obj.U7(new b());
       obj.U7(new v());
       obj.U7(new t());
       if (this.getArguments() != null && this.getArguments().getBoolean("dynamic", false)) {
          obj.U7(new a());
       }
       PatchProxy.onMethodExit(StatusPanelListFragment.class, "5");
       return obj;
    }
    public c Gh(){
       StatusPanelListFragment obj = PatchProxy.apply(null, this, StatusPanelListFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.F == null) {
          this.F = new c(this);
       }
       obj = this.F;
       Objects.requireNonNull(obj);
       if (!PatchProxy.applyVoidOneRefs(this, obj, c.class, "2")) {
          obj.c = b.a(obj.g.getArguments().getParcelable("user"));
       }
       return this.F;
    }
    public int M(){
       return 1;
    }
    public boolean S0(){
       return false;
    }
    public boolean S1(){
       return false;
    }
    public boolean Xg(){
       return false;
    }
    public View eh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, StatusPanelListFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.h(p0, 0x7f0d1569, p1, false, k.e());
    }
    public List fg(){
       List obj = PatchProxy.apply(null, this, StatusPanelListFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.fg();
       obj.add(this.Gh());
       return obj;
    }
    public int getLayoutResId(){
       return 0x7f0d1569;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StatusPanelListFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(StatusPanelListFragment.class, null);
       return objectsByTag;
    }
    public boolean mh(){
       return false;
    }
    public void th(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, StatusPanelListFragment.class, "2")) {
          return;
       }
       super.th();
       RecyclerView recyclerView = this.h0();
       recyclerView.setHasFixedSize(true);
       recyclerView.setItemAnimator(objArray);
       recyclerView.setRecycledViewPool(this.Gh().i);
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, StatusPanelListFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[]{this.Gh()};
       return new b(objArray);
    }
    public boolean x0(){
       return false;
    }
}
