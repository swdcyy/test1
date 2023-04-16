package q90.n;
import y8c.g;
import com.kuaishou.gifshow.kuaishan.model.KSLaunchParams;
import a9c.e;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import y8c.f;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import g9c.a;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import kotlin.collections.CollectionsKt__CollectionsKt;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import q90.x;
import ml8.c;

public class n extends g	// class@002998
{
    public final KSLaunchParams w;
    public final BaseFragment x;

    public void n(KSLaunchParams p0,e p1,BaseFragment p2){
       a.p(p0, "mKSLaunchParams");
       a.p(p1, "diffItemCallback");
       a.p(p2, "feedListFragment");
       super(p1);
       this.w = p0;
       this.x = p2;
    }
    public ArrayList a1(int p0,f p1){
       String str;
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          p1 = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, on, "2");
          if (p1 != PatchProxyResult.class) {
             return p1;
          }
       }
       KSTemplateDetailInfo kSTemplateDe = this.N0(p0);
       KSLaunchParams kSLaunchPara = this.w.copy();
       a.o(kSLaunchPara, "localKSLaunchParams");
       kSTemplateDe = (kSTemplateDe != null)? kSTemplateDe.mTemplateId: null;
       kSLaunchPara.setTemplateId(kSTemplateDe);
       Object[] objArray = new Object[]{kSLaunchPara};
       return CollectionsKt__CollectionsKt.r(objArray);
    }
    public f h1(ViewGroup p0,int p1){
       View obj;
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, on, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "parent");
       obj = a.i(p0, R.layout.arg_RES_7f0d0725);
       a.o(obj, "KwaiLayoutInflater.infla¡­te_feed_list_item_layout\)");
       PresenterV2 presenterV2 = new PresenterV2();
       presenterV2.U7(new x(p0, this.x));
       return new f(obj, presenterV2);
    }
}
