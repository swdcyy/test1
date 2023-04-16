package a17.c$a;
import com.kwai.library.widget.popup.common.c$b;
import android.app.Activity;
import java.util.ArrayList;
import com.kwai.library.widget.popup.common.PopupInterface$Excluded;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.kuaishou.growth.privacy.dialog.helper.g;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import com.kuaishou.growth.privacy.dialog.helper.j;
import w07.l;
import java.lang.Object;
import java.util.List;
import a17.c;
import a17.b$a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.CharSequence;
import a17.b$b;
import com.kwai.library.widget.popup.common.c;
import java.lang.String;

public class c$a extends c$b	// class@000011
{
    public c G;
    public boolean H;
    public List I;
    public int J;
    public CharSequence K;
    public CharSequence L;
    public CharSequence M;
    public List N;
    public RecyclerView$Adapter O;
    public boolean P;
    public b$b Q;
    public b$a R;
    public b$c S;
    public m T;

    public void c$a(Activity p0){
       super(p0);
       this.H = true;
       this.I = new ArrayList();
       this.J = -1;
       this.P = true;
       this.t = "popup_type_dialog";
       this.u = PopupInterface$Excluded.SAME_TYPE;
       ColorDrawable uColorDrawab = new ColorDrawable(0xff000000);
       this.l = uColorDrawab;
       uColorDrawab.setAlpha(76);
       this.G(g.a);
       this.O(j.a);
    }
    public c$a a0(int p0,l p1){
       this.I.add(p0, p1);
       return this;
    }
    public c$a b0(l p0){
       this.I.add(p0);
       return this;
    }
    public c c0(){
       return this.G;
    }
    public c$a d0(b$a p0){
       this.R = p0;
       return this;
    }
    public c$a e0(RecyclerView$Adapter p0){
       this.O = p0;
       return this;
    }
    public c$a f0(CharSequence p0){
       this.K = p0;
       return this;
    }
    public c$a g0(int p0){
       this.h0(this.a.getText(p0));
       return this;
    }
    public c$a h0(CharSequence p0){
       this.M = p0;
       return this;
    }
    public c$a i0(b$b p0){
       this.Q = p0;
       return this;
    }
    public c$a j0(List p0){
       this.N = p0;
       return this;
    }
    public c k(){
       c uoc = new c(this);
       this.G = uoc;
       return uoc;
    }
    public c$a k0(int p0){
       this.J = p0;
       return this;
    }
    public c$a l0(int p0){
       this.n0(this.a.getText(p0));
       return this;
    }
    public c$a m0(int p0,Object[] p1){
       this.n0(this.a.getString(p0, p1));
       return this;
    }
    public c$a n0(CharSequence p0){
       this.L = p0;
       return this;
    }
}
