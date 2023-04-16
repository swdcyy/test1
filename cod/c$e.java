package cod.c$e;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$b;
import cod.c;
import java.lang.Object;
import nn9.b;
import android.view.View;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$b$a;
import com.yxcorp.gifshow.component.postlistcomponent.state.LoadingStatus;
import mn9.a;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager$a;
import java.util.Objects;
import androidx.lifecycle.MutableLiveData;
import iod.a;
import androidx.lifecycle.LiveData;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleValue;
import ynd.c;
import god.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager$TextColors;
import huc.s;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import pn9.d;

public final class c$e implements PostListComponentView$b	// class@000354
{
    public final c a;

    public void c$e(c p0){
       this.a = p0;
       super();
    }
    public void a(b p0,View p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c$e.class, "3")) {
          return;
       }
       a.p(p0, "itemState");
       a.p(p1, "itemView");
       a.p(p2, "tag");
       PostListComponentView$b$a.b(this, p0, p1, p2);
       return;
    }
    public void b(LoadingStatus p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c$e.class, "2")) {
          return;
       }
       a.p(p0, "newLoadingStatus");
       a.p(p1, "tag");
       PostListComponentView$b$a.a(this, p0, p1);
       return;
    }
    public void c(a p0,View p1,String p2){
       b a;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c$e.class, "1")) {
          return;
       }
       a.p(p0, "item");
       a.p(p2, "tag");
       Object[] objArray = new Object[0];
       a.D().s("TextStyleViewBinderV2", "onItemSelected: "+p0.getId(), objArray);
       c$e ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, c.class, "5")) {
          MutableLiveData mutableLiveD = ta.c.s0();
          TextStyleValue value = mutableLiveD.getValue();
          if (value != null) {
             value.b(p0);
          }
          mutableLiveD.setValue(mutableLiveD.getValue());
       }
       c uoc = this.a.c.p0();
       if (uoc != null) {
          uoc.a(-1, this.a.c.s0().getValue());
       }
       a = b.a;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidOneRefs(p0, a, b.class, "6")) {
          a.p(p0, "color");
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "SELECT_TEXT_COLOR";
          uElementPack.params = "text_color: "+s.a(p0.a.c);
          u1.u(1, uElementPack, null);
       }
       return;
    }
    public void d(a p0,View p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c$e.class, "4")) {
          return;
       }
       a.p(p0, "item");
       a.p(p1, "itemView");
       a.p(p2, "tag");
       PostListComponentView$b$a.c(this, p0, p1, p2);
       return;
    }
    public void e(b p0,b p1,String p2){
       d.a(this, p0, p1, p2);
    }
}
