package com.kwai.framework.model.user.b;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.kwai.framework.model.user.UserExtraInfo$RoleInfo$TypeAdapter;
import java.lang.Object;
import com.yxcorp.gifshow.model.CDNUrl;

public class b implements KnownTypeAdapters$f	// class@001780
{
    public final UserExtraInfo$RoleInfo$TypeAdapter a;

    public void b(UserExtraInfo$RoleInfo$TypeAdapter p0){
       this.a = p0;
       super();
    }
    public Object[] a(int p0){
       CDNUrl[] uCDNUrlArray = new CDNUrl[p0];
       return uCDNUrlArray;
    }
}
