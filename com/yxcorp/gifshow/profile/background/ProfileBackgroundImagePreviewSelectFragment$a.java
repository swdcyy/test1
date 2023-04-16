package com.yxcorp.gifshow.profile.background.ProfileBackgroundImagePreviewSelectFragment$a;
import im8.g;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import androidx.fragment.app.Fragment;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.profile.background.n;
import java.util.Map;
import java.util.HashMap;

public final class ProfileBackgroundImagePreviewSelectFragment$a implements g	// class@001225
{
    public Fragment b;
    public ArrayList c;
    public String d;
    public BaseFeed e;
    public User f;
    public String g;
    public boolean h;

    public void ProfileBackgroundImagePreviewSelectFragment$a(){
       super();
       this.h = true;
    }
    public final void a(BaseFeed p0){
       this.e = p0;
    }
    public final void b(Fragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileBackgroundImagePreviewSelectFragment$a.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.b = p0;
       return;
    }
    public final void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileBackgroundImagePreviewSelectFragment$a.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.g = p0;
       return;
    }
    public final void d(boolean p0){
       this.h = p0;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfileBackgroundImagePreviewSelectFragment$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new n();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, ProfileBackgroundImagePreviewSelectFragment$a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(ProfileBackgroundImagePreviewSelectFragment$a.class, new n());
       }else {
          obj.put(ProfileBackgroundImagePreviewSelectFragment$a.class, null);
       }
       return obj;
    }
}
