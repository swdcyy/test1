package ii1.a;
import kz2.c;
import com.kuaishou.live.common.core.component.gift.data.message.BroadcastGiftMessage;
import g03.a;
import mz2.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.basic.model.QLiveMessage;

public class a extends c	// class@0028fc
{
    public final BroadcastGiftMessage l;
    public final boolean m;

    public void a(BroadcastGiftMessage p0,boolean p1,a p2){
       super(p2);
       this.l = p0;
       this.m = p1;
    }
    public a J(){
       return null;
    }
    public boolean K(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (QCurrentUser.me().getId()).equals(this.l.mFromUser.mId);
    }
    public long b(){
       return this.l.mMagicFaceId;
    }
    public long e(){
       return 0;
    }
    public long getCreateTime(){
       return this.l.mTime;
    }
    public boolean h(){
       return this.m;
    }
    public boolean k(){
       return false;
    }
    public int n(){
       return 0xdb9ff;
    }
    public int p(){
       return 1;
    }
    public int z(){
       return this.l.mRank;
    }
}
