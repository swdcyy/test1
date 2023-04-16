package com.yxcorp.gifshow.profile.background.ProfileBackgroundImagePreviewFragment$a;
import im8.g;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.profile.background.e;
import java.util.Map;
import java.util.HashMap;

public final class ProfileBackgroundImagePreviewFragment$a implements g	// class@001222
{
    public Fragment b;
    public ArrayList c;
    public String d;

    public void ProfileBackgroundImagePreviewFragment$a(){
       super();
    }
    public final void a(Fragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileBackgroundImagePreviewFragment$a.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.b = p0;
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfileBackgroundImagePreviewFragment$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, ProfileBackgroundImagePreviewFragment$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(ProfileBackgroundImagePreviewFragment$a.class, new e());
       }else {
          obj.put(ProfileBackgroundImagePreviewFragment$a.class, null);
       }
       return obj;
    }
}
