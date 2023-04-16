package e69.b$a;
import s2b.a;
import e69.b;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import e69.a;
import k2b.f3;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchUserPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.kwai.framework.model.user.User;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;

public class b$a implements a	// class@002147
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void a(List p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, str)) {
          return;
       }
       if (q.f(p0)) {
          return;
       }
       String str1 = a.a(this.a.q);
       a uoa = a.class;
       ClientContent$UserPackage[] obj = null;
       if (!PatchProxy.applyVoidTwoRefs(p0, str1, obj, uoa, str)) {
          f3 uof3 = f3.l("", "PEOPLE_IN_POP");
          ClientContent$ContentPackage uContentPack = PatchProxy.applyTwoRefs(p0, str1, obj, uoa, "10");
          if (uContentPack != PatchProxyResult.class) {
          }else {
             uContentPack = new ClientContent$ContentPackage();
             uContentPack.batchUserPackage = new ClientContent$BatchUserPackage();
             obj = new ClientContent$UserPackage[p0.size()];
             for (int i = 0; i < p0.size(); i = i + 1) {
                User user = p0.get(i);
                ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
                userPackage.identity = user.mId;
                int i1 = user.mPosition + 1;
                userPackage.index = i1;
                userPackage.params = a.b(user);
                obj[i] = userPackage;
             }
             p0.userPackage = obj;
             uContentPack.photoPackage = a.f(str1);
          }
          uof3.b(uContentPack);
          uof3.g();
       }
       return;
    }
    public boolean b(Object p0){
       boolean b;
       if (p0.mShowed != null) {
          b = false;
       }else {
          p0.mShowed = true;
          b = true;
       }
       return b;
    }
}
