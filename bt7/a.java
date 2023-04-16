package bt7.a;
import android.content.Context;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.android.model.mix.ActivityUserIconModel;
import java.lang.Object;
import bt7.a$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import wh5.c;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.view.View$OnClickListener;

public class a	// class@00046a
{
    public KwaiImageView a;
    public Context b;
    public ActivityUserIconModel c;
    public m d;

    public void a(Context p0,KwaiImageView p1,ActivityUserIconModel p2){
       super();
       this.d = new a$a(this);
       this.c = p2;
       this.b = p0;
       this.a = p1;
    }
    public boolean a(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.b != null && this.a != null) {
          obj = this.c;
          if (obj != null && (!TextUtils.isEmpty(obj.mIconUrl) && !c.b())) {
             this.a.setVisibility(false);
             this.a.L(this.c.mIconUrl);
             this.a.setOnClickListener(this.d);
             return true;
          }else {
             this.a.setVisibility(8);
             this.a.setOnClickListener(objArray);
          }
       }
       return false;
    }
    public void b(ActivityUserIconModel p0){
       this.c = p0;
    }
}
