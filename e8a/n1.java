package e8a.n1;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import e8a.p1;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.SlideVerticalAtlasExpandPresenter;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class n1 extends Accessor	// class@0020c3
{
    public final SlideVerticalAtlasExpandPresenter c;
    public final p1 d;

    public void n1(p1 p0,SlideVerticalAtlasExpandPresenter p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.a9();
    }
}
