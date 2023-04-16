package a8d.a;
import ddd.c;
import java.lang.Object;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.widget.EmojiTextView;
import android.content.Context;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import a8d.b;
import ucd.a;
import android.view.View;
import ml8.c;
import y8c.g;
import y8c.f$b;
import ddd.b;

public class a implements c	// class@00009d
{

    public void a(){
       super();
    }
    public f a(ViewGroup p0,int p1){
       EmojiTextView obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new EmojiTextView(p0.getContext());
       obj.setLayoutParams(new StaggeredGridLayoutManager$LayoutParams(-1, -2));
       PresenterV2 presenterV2 = new PresenterV2();
       presenterV2.U7(new b());
       presenterV2.U7(new a());
       return new f(obj, presenterV2);
    }
    public f$b b(g p0,f$b p1){
       return b.a(this, p0, p1);
    }
}
