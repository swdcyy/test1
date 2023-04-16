package aad.e;
import ddd.c;
import java.lang.Object;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import com.yxcorp.utility.n;
import i8d.l0;
import com.yxcorp.plugin.search.play.image.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import gfd.i;
import dfd.b;
import scd.j0;
import dfd.c;
import dfd.d;
import hfd.b;
import cfd.d;
import dfd.a;
import y9d.f;
import ucd.a;
import ml8.c;
import y8c.g;
import y8c.f$b;
import g9c.a;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.yxcorp.plugin.search.entity.kbox.KBoxItem;
import java.util.List;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateBaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import nfd.z0;
import com.yxcorp.gifshow.model.CDNUrl;
import p5a.b;
import scd.c0;
import scd.b;

public class e implements c	// class@0000b5
{

    public void e(){
       super();
    }
    public f a(ViewGroup p0,int p1){
       l0 obj;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoe, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new l0();
       obj.U7(new a(false));
       obj.U7(new i());
       obj.U7(new b());
       obj.U7(new j0());
       obj.U7(new c(true));
       obj.U7(new d(true));
       obj.U7(new b());
       obj.U7(new d());
       obj.U7(new a());
       obj.U7(new f());
       obj.U7(new a());
       return new f(n.H(p0, 0x7f0d1369), obj);
    }
    public f$b b(g p0,f$b p1){
       SearchItem obj = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       SearchItem searchItem = p0.N0(p1.b);
       obj = searchItem.mKBoxItem;
       int i = 0;
       KBoxItem mKBoxFeeds = (obj != null)? obj.mKBoxFeeds: searchItem.mTemplateFeeds;
       TemplateBaseFeed templateBase = mKBoxFeeds.get(i);
       c0 uoc0 = new c0(p1, templateBase);
       if (b.b(z0.c(templateBase)) != null) {
          i = true;
       }
       uoc0.D = i;
       return uoc0;
    }
}
