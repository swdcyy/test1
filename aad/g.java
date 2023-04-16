package aad.g;
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
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import jgc.a;
import ifd.a;
import cfd.d;
import dfd.d;
import dfd.c;
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
import scd.c0;

public class g implements c	// class@0000b7
{

    public void g(){
       super();
    }
    public f a(ViewGroup p0,int p1){
       PresenterV2 obj;
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, og, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = a.e();
       obj.U7(new a());
       obj.U7(new d());
       obj.U7(new d(true));
       obj.U7(new c(true));
       obj.U7(new a());
       obj.U7(new f());
       obj.U7(new a());
       return new f(n.H(p0, 0x7f0d136b), obj);
    }
    public f$b b(g p0,f$b p1){
       SearchItem obj = PatchProxy.applyTwoRefs(p0, p1, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       SearchItem searchItem = p0.N0(p1.b);
       obj = searchItem.mKBoxItem;
       KBoxItem mKBoxFeeds = (obj != null)? obj.mKBoxFeeds: searchItem.mTemplateFeeds;
       return new c0(p1, mKBoxFeeds.get(0));
    }
}
