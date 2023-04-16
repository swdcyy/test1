package mt1.a;
import yh3.a;
import com.kuaishou.protobuf.livestream.nano.CohesionPkInfo;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import ct1.a;
import com.yxcorp.gifshow.models.Gift;
import ct1.a$a;
import java.util.ArrayList;
import java.lang.Object;
import d61.c0;
import com.kuaishou.live.common.core.component.pk.LivePkResourcePathConstant;
import java.lang.String;

public final class a extends a	// class@003212
{
    public final LiveData a;
    public final LiveData b;

    public void a(CohesionPkInfo p0){
       super();
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.a = mutableLiveD;
       MutableLiveData mutableLiveD1 = new MutableLiveData();
       this.o0(mutableLiveD1);
       this.b = mutableLiveD1;
       Gift gift = a.a.a(p0);
       mutableLiveD = this.r0(mutableLiveD);
       if (gift != null) {
          gift = gift.mImageUrl;
          if (gift != null) {
          label_002d :
             mutableLiveD.setValue(gift);
             this.r0(mutableLiveD1).setValue(c0.a.b(LivePkResourcePathConstant.COHESION_PK.getResourcePath()));
             return;
          }
       }
       ArrayList uArrayList = new ArrayList();
       goto label_002d ;
    }
    public final LiveData u0(){
       return this.a;
    }
}
