package cgd.b$b;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import cgd.b;
import android.view.View;
import android.content.Context;
import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Space;
import android.widget.CheckBox;
import androidx.cardview.widget.CardView;
import ekd.m1;
import com.kwai.library.widget.button.SlipSwitchButton;
import android.widget.Button;
import android.view.View$OnClickListener;
import bgd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;

public class b$b extends RecyclerView$ViewHolder	// class@00031f
{
    public CheckBox a;
    public Button b;
    public TextView c;
    public TextView d;
    public TextView e;
    public TextView f;
    public View g;
    public View h;
    public Space i;
    public Activity j;
    public LinearLayout k;
    public final CardView l;
    public final SlipSwitchButton m;
    public final b n;

    public void b$b(b p0,View p1){
       this.n = p0;
       super(p1);
       if (p1.getContext() instanceof Activity) {
          this.j = p1.getContext();
       }
       this.k = p1.findViewById(0x7f0a05f6);
       this.g = p1.findViewById(0x7f0a05f3);
       this.c = p1.findViewById(0x7f0a05f5);
       this.d = p1.findViewById(0x7f0a05f7);
       this.i = p1.findViewById(0x7f0a31af);
       this.a = p1.findViewById(0x7f0a05f4);
       this.e = p1.findViewById(0x7f0a05f0);
       this.f = p1.findViewById(0x7f0a05ef);
       this.l = p1.findViewById(0x7f0a31ae);
       this.m = m1.f(p1, 0x7f0a31ac);
       this.b = m1.f(p1, 0x7f0a31ad);
       this.h = p1;
       this.k.setOnClickListener(p0.k);
       return;
    }
    public final void a(a p0,boolean p1){
       b$b uob = b$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uob, "5")) {
          return;
       }
       p0.e = p1;
       if (p1) {
          p0.f((p0.d() + p0.e()));
       }else {
          p0.f((p0.d() - p0.e()));
       }
       return;
    }
}
