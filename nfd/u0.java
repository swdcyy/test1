package nfd.u0;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig$a;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import nfd.p1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.search.entity.SearchItem;
import y8c.g;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import g9c.a;
import java.util.Iterator;
import com.yxcorp.plugin.search.entity.SearchItem$SearchItemType;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import nl9.v;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class u0 implements DetailPlayConfig$a	// class@001e10
{
    public final SearchResultFragment a;

    public void u0(SearchResultFragment p0){
       this.a = p0;
    }
    public final boolean a(QPhoto p0){
       boolean b1;
       u0 ta = this.a;
       Object obj = null;
       SearchItem obj1 = PatchProxy.applyTwoRefs(ta, p0, obj, p1.class, "1");
       boolean b = true;
       if (obj1 != PatchProxyResult.class) {
          obj = obj1;
       }else if(ta instanceof SearchResultFragment && (ta.g7() == null || ta.h0() == null)){
          Iterator iterator = ta.g7().Q0().iterator();
          while (iterator.hasNext()) {
             obj1 = iterator.next();
             if (obj1.mItemType != SearchItem$SearchItemType.PHOTO) {
                Object obj2 = PatchProxy.applyOneRefs(obj1, obj, p1.class, "2");
                if (obj2 != PatchProxyResult.class) {
                   b1 = obj2.booleanValue();
                }else if(obj1.mItemType == SearchItem$SearchItemType.AD_PHOTO && d.a(0x53db42e7).dB()){
                   b1 = true;
                }else {
                   b1 = false;
                }
                if (!b1) {
                }
             }
             if (p0 != null && (obj1.mPhoto != null && TextUtils.n(p0.getBizId(), obj1.mPhoto.getBizId()))) {
                obj = obj1;
                break ;
             }
          }
       }
       if (obj == null) {
          b = false;
       }
       return b;
    }
}
