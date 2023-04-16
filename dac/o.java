package dac.o;
import ok.x;
import com.yxcorp.gifshow.pymk.f;
import java.lang.Object;
import com.yxcorp.gifshow.relation.explore.fragment.ExploreFriendFragment;
import com.yxcorp.gifshow.pymk.net.RecommendUserResponseV2;
import java.util.Collection;
import ekd.q;
import java.lang.Boolean;

public final class o implements x	// class@002147
{
    public final f b;
    public final boolean c;

    public void o(f p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object get(){
       RecommendUserResponseV2 recommendUse = this.b.i2();
       boolean b = (this.c == null && (recommendUse != null && !q.f(recommendUse.mFriendUserList)))? true: false;
       return Boolean.valueOf(b);
    }
}
