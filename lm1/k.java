package lm1.k;
import lm1.j;
import java.lang.Object;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.String;
import rm1.l;

public class k	// class@002fa8
{
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public void k(j p0){
       boolean i1;
       super();
       j uidWhiteList = p0.uidWhiteList;
       boolean b = false;
       if (uidWhiteList != null) {
          int len = uidWhiteList.length;
          int i = 0;
          while (true) {
             if (i < len) {
                if ((QCurrentUser.me().getId()).equals(uidWhiteList[i])) {
                   i1 = 1;
                label_0023 :
                   if (i1) {
                      this.a = true;
                      this.b = true;
                      this.c = true;
                      this.d = b;
                      break ;
                   }else if(l.a(p0.a()) < p0.preSendSampleRate){
                      i1 = true;
                   }else {
                      i1 = false;
                   }
                   this.a = i1;
                   i1 = (l.a(p0.a()) < p0.sendingSampleRate)? true: false;
                   this.b = i1;
                   if (l.a(p0.a()) < p0.afterSendSampleRate) {
                      b = true;
                   }
                   this.c = b;
                   this.d = p0.onlyLogAfterSendGiftFailed;
                   break ;
                }else {
                   i = i + 1;
                }
             }
          }
          return;
       }
       i1 = 0;
       goto label_0023 ;
    }
    public boolean a(){
       return this.c;
    }
    public boolean b(){
       return this.a;
    }
    public boolean c(){
       return this.b;
    }
    public boolean d(){
       return this.d;
    }
}
