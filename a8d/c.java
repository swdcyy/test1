package a8d.c;
import android.text.style.ClickableSpan;
import a8d.b;
import java.lang.String;
import com.yxcorp.plugin.search.SearchSource;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import gbd.t;
import com.yxcorp.plugin.search.result.SearchKeywordContext;
import j06.d;
import com.yxcorp.plugin.search.SearchPage;
import w7d.e;
import nfd.r3;
import androidx.fragment.app.Fragment;
import nfd.t;
import android.text.TextPaint;

public class c extends ClickableSpan	// class@0000a0
{
    public final boolean b;
    public final String c;
    public final SearchSource d;
    public final int e;
    public final b f;

    public void c(b p0,boolean p1,String p2,SearchSource p3,int p4){
       this.f = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       c tf = this.f;
       t.l(1, tf.q, tf.V8(false, this.b), t.a(this.f.q, "SEARCH_RESULT", null));
       SearchKeywordContext searchKeywor = SearchKeywordContext.simpleContext(this.c);
       searchKeywor.mDisableCorrection = true;
       searchKeywor.mQueryId = d.a(this.c);
       searchKeywor.setIsCorrectionWord(1);
       c tf1 = this.f;
       t.a(tf1.q, r3.x(searchKeywor, this.d, tf1.u, null, false));
       return;
    }
    public void updateDrawState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       p0.setColor(this.e);
       p0.setUnderlineText(false);
       return;
    }
}
