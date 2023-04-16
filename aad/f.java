package aad.f;
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
import i2b.a;
import i8d.l0;
import ocd.j;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ocd.k;
import afd.g;
import bfd.a;
import afd.d;
import ocd.c;
import afd.c;
import aad.c;
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
import jfd.d;
import com.kuaishou.android.model.feed.SearchParams;
import yed.e;
import scd.c0;

public class f implements c	// class@0000b6
{

    public void f(){
       super();
    }
    public f a(ViewGroup p0,int p1){
       l0 obj;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uof, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new l0();
       obj.U7(new j(R.id.play_view_container, 0x7f0a30d8, R.id.follow_surface, 0x7f0a0f93));
       obj.U7(new k());
       obj.U7(new g());
       obj.U7(new a());
       obj.U7(new d());
       obj.U7(new c());
       obj.U7(new c());
       obj.U7(new c());
       obj.U7(new f());
       obj.U7(new a());
       return new f(a.i(p0, 0x7f0d136a), obj);
    }
    public f$b b(g p0,f$b p1){
       SearchItem obj = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       SearchItem searchItem = p0.N0(p1.b);
       obj = searchItem.mKBoxItem;
       int i = 0;
       KBoxItem mKBoxFeeds = (obj != null)? obj.mKBoxFeeds: searchItem.mTemplateFeeds;
       TemplateBaseFeed templateBase = mKBoxFeeds.get(i);
       e.b(z0.c(templateBase), searchItem, templateBase, null);
       return new c0(p1, templateBase);
    }
}
