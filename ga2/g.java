package ga2.g;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.MutableLiveData;
import java.lang.Integer;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$ContentWithStyle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class g extends ViewModel	// class@002af2
{
    public final MutableLiveData a;
    public final MutableLiveData b;
    public final MutableLiveData c;
    public final MutableLiveData d;

    public void g(){
       super();
       this.a = new MutableLiveData();
       this.b = new MutableLiveData();
       this.c = new MutableLiveData();
       this.d = new MutableLiveData(Integer.valueOf(0));
    }
    public final boolean o0(LiveDistrictRankFinalBattle$ContentWithStyle p0,LiveDistrictRankFinalBattle$ContentWithStyle p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, g.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && (p1 != null && (!TextUtils.n(p0.content, p1.content) || !TextUtils.n(p0.color, p1.color))))? true: false;
       return b;
    }
}
