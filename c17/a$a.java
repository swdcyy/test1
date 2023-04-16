package c17.a$a;
import com.kwai.library.widget.popup.common.c$b;
import android.app.Activity;
import java.util.ArrayList;
import com.kwai.library.widget.popup.common.PopupInterface$Excluded;
import u07.g;
import u07.h;
import d17.d;
import java.lang.Object;
import java.util.List;
import java.lang.CharSequence;
import android.net.Uri;
import c17.c;
import com.kwai.library.widget.popup.common.c;
import c17.a;

public final class a$a extends c$b	// class@0004c1
{
    public c G;
    public Uri H;
    public Drawable I;
    public CharSequence J;
    public CharSequence K;
    public CharSequence L;
    public boolean M;
    public boolean N;
    public Drawable O;
    public int P;
    public float Q;
    public boolean R;
    public List S;

    public void a$a(Activity p0){
       super(p0);
       this.P = -1;
       this.S = new ArrayList();
       this.t = "popup_type_snack_bar";
       this.u = PopupInterface$Excluded.NOT_AGAINST;
       this.y = g.a;
       this.z = h.a;
    }
    public a$a a0(d p0){
       this.S.add(p0);
       return this;
    }
    public boolean b0(){
       return this.M;
    }
    public a$a c0(CharSequence p0){
       this.L = p0;
       return this;
    }
    public a$a d0(float p0){
       this.Q = p0;
       return this;
    }
    public a$a e0(Uri p0){
       this.H = p0;
       return this;
    }
    public a$a f0(boolean p0){
       this.M = p0;
       return this;
    }
    public a$a g0(c p0){
       this.G = p0;
       return this;
    }
    public a$a h0(CharSequence p0){
       this.K = p0;
       return this;
    }
    public a$a i0(CharSequence p0){
       this.J = p0;
       return this;
    }
    public c k(){
       return new a(this);
    }
}
