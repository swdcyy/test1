package bc9.l$a;
import com.yxcorp.gifshow.camera.record.base.b$a;
import bc9.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import zb9.k;
import com.yxcorp.gifshow.camera.record.assistant.a;
import bc9.k;
import g9c.a;
import ac9.g;
import java.util.List;
import dc9.c;
import java.lang.Integer;

public final class l$a implements b$a	// class@0003f3
{
    public final l a;

    public void l$a(l p0){
       this.a = p0;
       super();
    }
    public Object getData(){
       g og;
       l v;
       int i;
       Object[] objArray = null;
       k ok = PatchProxy.apply(objArray, this, l$a.class, "1");
       if (ok != PatchProxyResult.class) {
       }else if(this.a.g2().D()){
          ok = this.a.g2().p();
          og = (ok != null)? ok.N0(this.a.v): objArray;
          v = this.a.v;
       }else {
          og = objArray;
          v = 0;
       }
       if (!this.a.g2().B() && (this.a.g2().G() || this.a.g2().E())) {
          v = v + 1;
       }
       l ol = v;
       boolean b = this.a.g2().z();
       k ok1 = this.a.g2().p();
       if (ok1 != null) {
          List list = ok1.s1();
          if (list != null && !list.isEmpty()) {
             i = 1;
          label_008c :
             String str = (og != null)? og.getTemplateId(): objArray;
             String str1 = (og != null)? og.getTemplateName(): objArray;
             c uoc = this.a.g2().h();
             if (og != null) {
                objArray = Integer.valueOf(og.getType());
             }
             String str2 = uoc.a(objArray);
             boolean b1 = (og != null && og.getType() == 4)? true: false;
             boolean b2 = (og != null && og.getType() == 2)? true: false;
             ok1 = new k(b, i, str, str1, str2, ol, b1, b2, this.a.g2().B(), this.a.g2().h().b(this.a.g2().m()));
             ok = v;
          }
       }
       i = 0;
       goto label_008c ;
       return ok;
    }
}
