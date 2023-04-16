package b77.g;
import android.view.View$OnClickListener;
import b77.e;
import java.lang.String;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import dz1.a;
import e17.i;

public class g implements View$OnClickListener	// class@0003d9
{
    public final String b;
    public final String c;
    public final e d;

    public void g(e p0,String p1,String p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       if (this.d.w.isSelected()) {
          this.d.W8(this.b);
          a.h(String.valueOf(this.d.t.getText()), this.b, this.d.p.a());
       }else if(this.d.x.isSelected()){
          this.d.W8(this.c);
          a.h(String.valueOf(this.d.u.getText()), this.c, this.d.p.a());
       }else {
          i.a(R.style.arg_RES_7f11066a, 0x7f102c83);
       }
       return;
    }
}
