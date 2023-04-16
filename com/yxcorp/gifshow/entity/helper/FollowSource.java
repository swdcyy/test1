package com.yxcorp.gifshow.entity.helper.FollowSource;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.User;

public final class FollowSource extends Enum	// class@000dd4
{
    public final String mSource;
    public static final FollowSource[] $VALUES;
    public static final FollowSource SEARCH;

    static {
       FollowSource uFollowSourc = new FollowSource("SEARCH", 0, "0_%s_p211");
       FollowSource.SEARCH = uFollowSourc;
       FollowSource[] uFollowSourc1 = new FollowSource[]{uFollowSourc};
       FollowSource.$VALUES = uFollowSourc1;
    }
    public void FollowSource(String p0,int p1,String p2){
       super(p0, p1);
       this.mSource = p2;
    }
    public static FollowSource valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FollowSource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(FollowSource.class, p0);
    }
    public static FollowSource[] values(){
       Object obj = PatchProxy.apply(null, null, FollowSource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FollowSource.$VALUES.clone();
    }
    public String getSourceString(User p0){
       String str;
       Object obj = PatchProxy.applyOneRefs(p0, this, FollowSource.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          Object[] objArray = new Object[]{p0.getId()};
          str = String.format(this.mSource, objArray);
       }else {
          str = "";
       }
       return str;
    }
}
