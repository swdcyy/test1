package a09.e;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import a09.f;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.PlayEndControlPresenter;
import java.lang.Object;

public class e extends Accessor	// class@000010
{
    public final PlayEndControlPresenter c;
    public final f d;

    public void e(f p0,PlayEndControlPresenter p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c;
    }
}
