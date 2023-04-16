package com.kwai.feature.component.entry.tk.SearchEntryTkManager$a;
import tx4.o;
import com.kwai.feature.component.entry.tk.SearchEntryTkManager;
import java.lang.Object;
import sx4.e;
import tx4.w;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import iy5.d;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Throwable;
import java.lang.Integer;

public class SearchEntryTkManager$a implements o	// class@001210
{
    public final SearchEntryTkManager a;

    public void SearchEntryTkManager$a(SearchEntryTkManager p0){
       this.a = p0;
       super();
    }
    public void a(e p0,w p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SearchEntryTkManager$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       d.C().w("SearchEntryTkManager", "TKCreateView success "+p1.b, objArray);
       SearchEntryTkManager$a ta = this.a;
       ta.d = p0;
       ta.e("searchEntry_TKViewRenderSuccess", ta.b, p1);
       return;
    }
    public void b(int p0,Throwable p1,w p2){
       if (PatchProxy.isSupport(SearchEntryTkManager$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, SearchEntryTkManager$a.class, "2")) {
          return;
       }
       d uod = d.C();
       StringBuilder str = "TKCreateView fail ";
       w b = (p2 != null)? p2.b: "tkBundleInfo is null";
       Object[] objArray = new Object[0];
       uod.w("SearchEntryTkManager", str+b, objArray);
       SearchEntryTkManager$a ta = this.a;
       ta.e("searchEntry_TKViewRenderFail", ta.b, p2);
       return;
    }
}
