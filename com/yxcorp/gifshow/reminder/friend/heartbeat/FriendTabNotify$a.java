package com.yxcorp.gifshow.reminder.friend.heartbeat.FriendTabNotify$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Number;
import java.lang.Integer;

public class FriendTabNotify$a	// class@001a98
{
    public String mId;
    public int mType;

    public void FriendTabNotify$a(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FriendTabNotify$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof FriendTabNotify$a) {
          return false;
       }
       if (this.mType != p0.mType || !Objects.equals(this.mId, p0.mId)) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, FriendTabNotify$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{this.mId,Integer.valueOf(this.mType)};
       return Objects.hash(obj);
    }
}
