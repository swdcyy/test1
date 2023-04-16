package nfd.m2;
import ha5.e;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import com.yxcorp.gifshow.entity.QPreInfo;
import fg6.a;
import com.google.gson.Gson;
import oe6.e;
import com.kwai.framework.model.feed.BaseFeed;
import y8c.g;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import g9c.a;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.user.User;
import e7d.h;
import com.yxcorp.plugin.search.SearchPage;
import vm5.h$a;
import ha5.d;
import com.kuaishou.android.model.mix.CoverMeta;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.mix.CoverMetaExt;

public class m2 implements e	// class@001dd0
{
    public final boolean a;
    public final SearchResultFragment b;

    public void m2(boolean p0,SearchResultFragment p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(String p0,String p1,String p2,String p3,boolean p4,int p5){
       m2 om2 = m2.class;
       if (PatchProxy.isSupport(om2)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Boolean.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, om2, "1")) {
             return;
          }
       }
       e.k0(a.a.q(QPreInfo.createPreInfo(p0, p1, p2, p3, p4, p5)));
       return;
    }
    public void b(BaseFeed p0,int p1){
       m2 om2 = m2.class;
       if (PatchProxy.isSupport(om2) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, om2, "4")) {
          return;
       }
       if (this.b.g7() != null && this.b.g7().N0(p1) != null) {
          SearchItem searchItem = this.b.g7().N0(p1);
          if (!PatchProxy.applyVoidTwoRefs(searchItem, p0, this, om2, "5")) {
             QPhoto qPhoto = new QPhoto(p0);
             User user = qPhoto.getUser();
             if (user == null) {
                user = searchItem.mUser;
             }
             if (user != null) {
                this.b.b1.Q(user, searchItem, 2);
             }else {
                this.b.b1.O(qPhoto, searchItem);
             }
          }
       }
       return;
    }
    public void c(BaseFeed p0,int p1){
       m2 om2 = m2.class;
       if (PatchProxy.isSupport(om2) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, om2, "3")) {
          return;
       }
       if (this.a != null) {
          SearchPage searchPage = this.b.kc();
          if (!PatchProxy.isSupport(om2) || !PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), searchPage, this, m2.class, "7")) {
             if (this.b.g7() != null && this.b.g7().N0(p1) != null) {
                this.b.b1.O(new QPhoto(p0), this.b.g7().N0(p1));
             }else {
                this.b.b1.O(new QPhoto(p0), null);
             }
          }
       }else if(PatchProxy.isSupport(om2) && (!PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, om2, "6") && (this.b.g7() != null && this.b.g7().N0(p1) != null))){
          this.b.b1.O(new QPhoto(p0), this.b.g7().N0(p1));
       }
       return;
    }
    public void d(h$a p0,int p1){
       d.e(this, p0, p1);
    }
    public int[] e(CoverMeta p0,CommonMeta p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, m2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CoverMetaExt.getTargetBitmapSize(p0, p1);
    }
}
