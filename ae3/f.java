package ae3.f;
import java.lang.Runnable;
import com.kuaishou.live.liteend.baseinfo.LiveLiteEndBaseInfoPresenter;
import java.lang.Object;

public final class f implements Runnable	// class@0000a1
{
    public final LiveLiteEndBaseInfoPresenter b;

    public void f(LiveLiteEndBaseInfoPresenter p0){
       this.b = p0;
    }
    public final void run(){
       LiveLiteEndBaseInfoPresenter.c9(this.b);
    }
}
