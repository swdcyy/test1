package ej2.s;
import lf3.g;
import ej2.v;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCActionSignal;
import java.util.Objects;
import com.kuaishou.livestream.message.nano.LiveRefreshAuthorStatusNotice;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.protobuf.livestream.nano.LiveCdnNodeView;
import com.yxcorp.gifshow.model.CDNUrl;
import d61.j;
import lf3.f;

public final class s implements g	// class@00273a
{
    public final v b;

    public void s(v p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       s tb = this.b;
       Objects.requireNonNull(tb);
       SCActionSignal liveRefreshA = p0.liveRefreshAuthorStatusNotice;
       if (liveRefreshA != null && liveRefreshA.length > 0) {
          if (liveRefreshA[0].expired != null) {
             if (TextUtils.n(tb.s, liveRefreshA[0].uniqueKey)) {
                tb.q = null;
                tb.s = null;
             }
          }else {
             tb.q = j.c(liveRefreshA[0].headWidgetCdnNodeView);
             tb.s = liveRefreshA[0].uniqueKey;
          }
          tb.R8();
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
