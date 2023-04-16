package ny9.a;
import ok.o;
import hr7.a;
import java.lang.Object;
import com.yxcorp.gifshow.detail.common.information.marquee.model.MarqueeResponse$a;
import com.yxcorp.gifshow.detail.common.information.marquee.model.e;
import java.lang.String;
import com.kwai.framework.model.user.User;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.model.mix.QComment;

public final class a implements o	// class@00320b
{
    public final a b;

    public void a(a p0){
       this.b = p0;
    }
    public final boolean apply(Object p0){
       boolean b1;
       a tb = this.b;
       boolean b = false;
       if (p0 == null) {
       }else if(p0.mMarqueeType == tb.b){
          b1 = true;
       label_0011 :
          if (b1) {
             if (e.j(p0)) {
                b = TextUtils.n(p0.mUser.getId(), tb.a);
             }else if(e.k(p0)){
                b = TextUtils.n(p0.mUser.getId(), tb.a);
             }else if(e.n(p0)){
                b = TextUtils.n(p0.mUser.getId(), tb.a);
             }else if(e.m(p0)){
                b = TextUtils.n(p0.mUser.getId(), tb.a);
             }else if(e.l(p0)){
                b = TextUtils.n(p0.mUser.getId(), tb.a);
             }else if(e.g(p0)){
                b = TextUtils.n(p0.mComment.getId(), tb.a);
             }else if(e.h(p0)){
                b = TextUtils.n(p0.mComment.getId(), tb.a);
             }
          }
          return b;
       }
       b1 = false;
       goto label_0011 ;
    }
}
