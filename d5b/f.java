package d5b.f;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import d5b.j;
import com.yxcorp.gifshow.magic.ui.magicemoji.search.panel.MagicSearchFragment;
import java.lang.Object;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicEmojiFragment$Source;

public class f extends Accessor	// class@002441
{
    public final MagicSearchFragment c;
    public final j d;

    public void f(j p0,MagicSearchFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.S;
    }
    public void set(Object p0){
       this.c.S = p0;
    }
}
