package jq9.h0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jq9.j0;
import com.yxcorp.gifshow.corona.common.model.CoronaTubeFeed;
import java.lang.Object;
import com.kwai.framework.model.user.User;

public class h0 extends Accessor	// class@002b45
{
    public final CoronaTubeFeed c;
    public final j0 d;

    public void h0(j0 p0,CoronaTubeFeed p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.mUser;
    }
    public void set(Object p0){
       this.c.mUser = p0;
    }
}
