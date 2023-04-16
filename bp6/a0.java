package bp6.a0;
import io.reactivex.g;
import com.kwai.imsdk.internal.q;
import java.lang.String;
import java.lang.Object;
import brd.v;
import cp6.n;
import java.util.Objects;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.query.Query;
import java.util.List;
import java.util.Collection;
import com.kwai.imsdk.internal.util.b;
import com.kwai.imsdk.d;
import java.lang.Throwable;
import l85.b;
import brd.g;
import com.kwai.chat.sdk.client.MessageException;
import java.lang.StringBuilder;

public final class a0 implements g	// class@0004fe
{
    public final q b;
    public final String c;
    public final int d;

    public void a0(q p0,String p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void subscribe(v p0){
       d uod;
       a0 tc = this.c;
       a0 td = this.d;
       n on = n.i(this.b.f);
       try{
          Objects.requireNonNull(on);
          List list = on.s(tc, td).build().list();
          if (!b.c(list)) {
             uod = on.d(list.get(0));
          label_0034 :
             if (uod != null) {
                p0.onNext(uod);
             }else {
                p0.onError(new MessageException(1004, "请求的会话不存在,需要先创建.:"+tc+" type:"+td));
             }
             return;
          }
       }catch(java.lang.Exception e0){
          b.f("KwaiConversationBiz", e0);
       }
       uod = null;
       goto label_0034 ;
    }
}
