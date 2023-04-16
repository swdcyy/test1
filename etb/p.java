package etb.p;
import android.content.DialogInterface$OnClickListener;
import etb.v;
import java.lang.Object;
import android.content.DialogInterface;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k2b.e0;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxBaseItem;
import dtb.c;
import wkd.b;
import ysb.a;
import java.lang.Integer;
import brd.t;
import cjd.e;
import erd.o;
import etb.t;
import sfc.a;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class p implements DialogInterface$OnClickListener	// class@002808
{
    public final v b;

    public void p(v p0){
       this.b = p0;
    }
    public final void onClick(DialogInterface p0,int p1){
       p tb = this.b;
       Objects.requireNonNull(tb);
       if (p1 == 0x7f1034d1) {
          tb.R8(true);
       }else if(p1 == 0x7f101c1c){
          tb.R8(false);
       }else if(p1 != 0x7f104270 || PatchProxy.applyVoid(null, tb, v.class, "7")){
          c.i(tb.t, tb.r, "del");
          v r = tb.r;
          tb.X7(b.a(0x636667f2).d(r.mNotifyId, r.mPlateId.intValue()).map(new e()).subscribe(new t(tb), new a()));
       }
       return;
    }
}
