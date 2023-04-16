package abc.e0;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.relation.intimate.dialog.s$a;
import java.lang.Object;
import android.view.View;
import com.yxcorp.gifshow.model.IntimateRelationInfo;
import java.lang.String;
import com.yxcorp.gifshow.relation.intimate.helper.i;
import java.lang.CharSequence;
import e17.i;
import y8c.d;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;

public final class e0 implements View$OnClickListener	// class@0000cc
{
    public final s$a b;
    public final boolean c;
    public final int d;

    public void e0(s$a p0,boolean p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void onClick(View p0){
       e0 tb = this.b;
       e0 tc = this.c;
       e0 td = this.d;
       if (tb.A != null && tc == null) {
          i.d(R.style.arg_RES_7f11066a, i.e(tb.r.mName, td));
       }else if(tb.B == null){
          tb.t.onNext(Integer.valueOf(tb.q.get()));
       }
       return;
    }
}
