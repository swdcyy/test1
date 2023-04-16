package btb.d;
import erd.g;
import btb.e;
import java.lang.Object;
import com.yxcorp.gifshow.notice.box.data.NoticeBoxResponse;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxBaseItem;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxTextOnlyItem;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import btb.f;
import oec.c;
import oec.j;
import android.text.SpannableStringBuilder;
import oec.h;

public final class d implements g	// class@00046a
{
    public final e b;

    public void d(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, e.class, "4")) {
       }else if(p0 != null){
          p0 = p0.mItems;
          if (p0 != null) {
             p0 = p0.iterator();
             while (p0.hasNext()) {
                NoticeBoxBaseItem noticeBoxBas = p0.next();
                if (!noticeBoxBas instanceof NoticeBoxTextOnlyItem || (PatchProxy.applyVoidOneRefs(noticeBoxBas, tb, e.class, "5") || TextUtils.x(noticeBoxBas.mContent))) {
                   continue ;
                }
                noticeBoxBas.mContentSpannable = tb.t.e(noticeBoxBas.mContent, null, new f(tb, noticeBoxBas));
             }
          }
       }
       return;
    }
}
