package nfd.q2$a;
import java.lang.Object;
import nfd.q2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.kuaishou.android.model.feed.SearchParams;

public class q2$a	// class@001df6
{
    public SearchItem a;
    public QPhoto b;
    public BaseFragment c;
    public View d;
    public int e;
    public int f;
    public SearchParams g;
    public int h;
    public String i;
    public String j;
    public boolean k;

    public void q2$a(){
       super();
    }
    public q2 a(){
       Object obj = PatchProxy.apply(null, this, q2$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new q2(this);
    }
    public q2$a b(View p0){
       this.d = p0;
       return this;
    }
    public q2$a c(BaseFragment p0){
       this.c = p0;
       return this;
    }
    public q2$a d(QPhoto p0){
       this.b = p0;
       return this;
    }
    public q2$a e(SearchItem p0){
       this.a = p0;
       return this;
    }
    public q2$a f(SearchParams p0){
       this.g = p0;
       return this;
    }
    public q2$a g(int p0){
       this.f = p0;
       return this;
    }
    public q2$a h(int p0){
       this.e = p0;
       return this;
    }
}
