package bja.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import bja.d;
import com.yxcorp.gifshow.follow.stagger.post.MockFeedPresenter;
import java.lang.Object;

public class b extends Accessor	// class@0003dd
{
    public final MockFeedPresenter c;
    public final d d;

    public void b(d p0,MockFeedPresenter p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.r;
    }
}
