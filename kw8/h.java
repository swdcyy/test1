package kw8.h;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import kw8.l;
import com.yxcorp.gifshow.activity.share.ShareActivity;
import java.lang.Object;
import com.kwai.feature.post.api.feature.publish.model.PublishPageSetting;

public class h extends Accessor	// class@002c2e
{
    public final ShareActivity c;
    public final l d;

    public void h(l p0,ShareActivity p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.Q;
    }
    public void set(Object p0){
       this.c.Q = p0;
    }
}
