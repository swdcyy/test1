package com.yxcorp.gifshow.profile.collect.fragment.ProfileCollectionBaseFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i2c.l0;
import java.util.Map;
import android.os.Bundle;
import lnc.g2;
import i2c.i0;
import androidx.fragment.app.Fragment;
import lnc.g2$a;
import android.view.View;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView;
import zf6.j;
import android.view.ViewGroup;

public abstract class ProfileCollectionBaseFragment extends RecyclerFragment	// class@0012af
{
    public g2 F;
    public RecyclerFragment G;

    public void ProfileCollectionBaseFragment(){
       super();
    }
    public abstract PresenterV2 Gh();
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfileCollectionBaseFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new l0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, ProfileCollectionBaseFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(ProfileCollectionBaseFragment.class, new l0());
       }else {
          obj.put(ProfileCollectionBaseFragment.class, null);
       }
       return obj;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileCollectionBaseFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.G = this;
       this.F = new g2(this, new i0(this));
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProfileCollectionBaseFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.F.b(this.fg());
       return;
    }
    public void th(){
       if (PatchProxy.applyVoid(null, this, ProfileCollectionBaseFragment.class, "3")) {
          return;
       }
       super.th();
       this.h0().setBackgroundColor(j.d(this.h0(), R.color.arg_RES_7f061ca5));
       return;
    }
}
