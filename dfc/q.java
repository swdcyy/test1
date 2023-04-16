package dfc.q;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import dfc.v;
import java.lang.Object;
import android.widget.TextView;
import android.view.View;
import lnc.a1;
import mrd.a;
import com.yxcorp.gifshow.reminder.news.data.NewsEntranceResponse;
import com.kwai.framework.model.user.RichTextMeta;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class q implements ViewTreeObserver$OnGlobalLayoutListener	// class@0021af
{
    public final v b;

    public void q(v p0){
       this.b = p0;
    }
    public final void onGlobalLayout(){
       q tb = this.b;
       int i = (tb.t.getLeft() - a1.e(16.00f)) - tb.p.getLeft();
       if (tb.y != i) {
          tb.y = i;
          NewsEntranceResponse newsEntrance = tb.B.i();
          if (newsEntrance != null) {
             NewsEntranceResponse mRecoTextInf = newsEntrance.mRecoTextInfo;
             if (mRecoTextInf != null && !TextUtils.x(mRecoTextInf.mCutRawText)) {
                newsEntrance.mRecoTextInfo.mCutRawText = null;
                tb.B.onNext(newsEntrance);
             }
          }
       }
       return;
    }
}
