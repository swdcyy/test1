package com.yxcorp.gifshow.profile.background.ProfileBackgroundVideoPreviewSelectFragment$a;
import im8.g;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.profile.background.y;
import java.util.Map;
import java.util.HashMap;

public final class ProfileBackgroundVideoPreviewSelectFragment$a implements g	// class@00123d
{
    public Fragment b;
    public ProfileBgVideoInfo c;
    public PublishSubject d;
    public long e;
    public BaseFeed f;
    public User g;
    public String h;
    public boolean i;
    public boolean j;

    public void ProfileBackgroundVideoPreviewSelectFragment$a(){
       super();
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create\(\)");
       this.d = publishSubje;
       this.j = true;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfileBackgroundVideoPreviewSelectFragment$a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new y();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, ProfileBackgroundVideoPreviewSelectFragment$a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(ProfileBackgroundVideoPreviewSelectFragment$a.class, new y());
       }else {
          obj.put(ProfileBackgroundVideoPreviewSelectFragment$a.class, null);
       }
       return obj;
    }
}
