package com.yxcorp.gifshow.profile.b$a;
import wvb.e$a;
import com.yxcorp.gifshow.profile.b;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.social.profile.model.ProfileDraftsFeed;

public class b$a implements e$a	// class@00121e
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public List a(List p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, b$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       if (p0 != null && !p0.isEmpty()) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             QPhoto qPhoto = iterator.next();
             if (!qPhoto.mEntity instanceof ProfileDraftsFeed) {
                obj.add(qPhoto);
             }
          }
       }
       return obj;
    }
    public Object convert(Object p0){
       return p0;
    }
}
