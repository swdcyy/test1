package lj9.a;
import y8c.g;
import com.kwai.component.feedstaggercard.model.CardStyle;
import java.lang.Object;
import im8.c;
import java.lang.String;
import java.util.ArrayList;
import ekd.j;
import y8c.f;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.channel.stagger.header.subentrance.a;
import java.lang.Number;
import java.util.List;
import g9c.a;
import ml8.c;
import lnc.d2;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

public final class a extends g	// class@002df2
{
    public final ArrayList w;

    public void a(CardStyle p0){
       super();
       Object[] objArray = new Object[]{new c("HOT_CHANNEL_CARD_STYLE", p0)};
       this.w = j.a(objArray);
    }
    public ArrayList a1(int p0,f p1){
       return this.w;
    }
    public f h1(ViewGroup p0,int p1){
       f obj;
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       View view = a.i(p0, R.layout.arg_RES_7f0d0601);
       Object obj1 = PatchProxy.apply(null, this, uoa, "2");
       if (obj1 != patchProxyRe) {
          i = obj1.intValue();
       }else if(this.Q0() != null){
          i = this.Q0().size();
       }else {
          i = 0;
       }
       obj = new f(view, new a(i));
       if (d2.g()) {
          obj.setIsRecyclable(false);
       }
       return obj;
    }
}
