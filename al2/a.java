package al2.a;
import ok.o;
import com.yxcorp.gifshow.model.ProfileTemplateCard$ButtonInfo;
import java.lang.Object;
import com.yxcorp.gifshow.model.ProfileTemplateCard$ButtonStatusInfo;

public final class a implements o	// class@0000f8
{
    public final ProfileTemplateCard$ButtonInfo b;

    public void a(ProfileTemplateCard$ButtonInfo p0){
       this.b = p0;
    }
    public final boolean apply(Object p0){
       a tb = this.b;
       boolean b = (p0 != null && p0.mStatus == tb.mCurrentStatus)? true: false;
       return b;
    }
}
