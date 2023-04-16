package com.yxcorp.gifshow.profile.fragment.ProfileTabItemFragment;
import k3c.w1;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.fragment.app.Fragment;
import java.lang.String;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public abstract class ProfileTabItemFragment extends RecyclerFragment implements w1	// class@001318
{

    public void ProfileTabItemFragment(){
       super();
    }
    public void S2(Fragment p0){
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfileTabItemFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(ProfileTabItemFragment.class, null);
       return objectsByTag;
    }
}
