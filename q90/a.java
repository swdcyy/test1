package q90.a;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import q90.e;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedGroupPagerFragment;
import java.lang.Object;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class a extends Accessor	// class@002982
{
    public final KSFeedGroupPagerFragment c;
    public final e d;

    public void a(e p0,KSFeedGroupPagerFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.k;
    }
    public void set(Object p0){
       this.c.k = p0;
    }
}
