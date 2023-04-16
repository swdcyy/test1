package h29.a$a;
import androidx.lifecycle.Observer;
import h29.a;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.feature.component.photofeatures.startup.response.AvatarInfoResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.entity.DynamicEffectMarker;
import kotlin.jvm.internal.a;
import qp7.x0;
import qp7.b;
import ps7.g;

public final class a$a implements Observer	// class@002547
{
    public final a b;
    public final Integer c;

    public void a$a(a p0,Integer p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onChanged(Object p0){
       DynamicEffectMarker mLiveType;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
       }else if(p0 != null){
          AvatarInfoResponse mDynamicEffe = p0.mDynamicEffectMarker;
          if (mDynamicEffe != null) {
             mLiveType = mDynamicEffe.mLiveType;
          label_0017 :
             if (a.g(mLiveType, "shop") && p0.mType == true) {
                this.b.E().h(true);
                this.b.E().g(true);
             }else {
                p0 = this.c;
                if (p0 != null && p0.intValue() == 3) {
                   this.b.E().h(true);
                   this.b.E().g(false);
                }else {
                   this.b.E().h(false);
                   this.b.E().g(false);
                }
             }
          }
       }
       mLiveType = null;
       goto label_0017 ;
       return;
    }
}
