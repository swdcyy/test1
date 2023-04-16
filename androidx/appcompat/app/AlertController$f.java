package androidx.appcompat.app.AlertController$f;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import android.view.LayoutInflater;
import androidx.appcompat.app.AlertController;
import android.view.View;
import java.lang.CharSequence;
import android.graphics.drawable.Drawable;
import android.content.DialogInterface$OnClickListener;
import android.os.Message;
import android.view.ViewGroup;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.appcompat.app.AlertController$f$a;
import androidx.appcompat.app.AlertController$f$b;
import android.database.Cursor;
import android.widget.SimpleCursorAdapter;
import androidx.appcompat.app.AlertController$h;
import android.widget.ListView;
import androidx.appcompat.app.AlertController$f$e;
import androidx.appcompat.app.AlertController$f$c;
import android.widget.AdapterView$OnItemClickListener;
import androidx.appcompat.app.AlertController$f$d;
import android.widget.AdapterView$OnItemSelectedListener;

public class AlertController$f	// class@000565
{
    public int A;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public boolean[] F;
    public boolean G;
    public boolean H;
    public int I;
    public DialogInterface$OnMultiChoiceClickListener J;
    public Cursor K;
    public String L;
    public String M;
    public boolean N;
    public AdapterView$OnItemSelectedListener O;
    public AlertController$f$e P;
    public boolean Q;
    public final Context a;
    public final LayoutInflater b;
    public int c;
    public Drawable d;
    public int e;
    public CharSequence f;
    public View g;
    public CharSequence h;
    public CharSequence i;
    public Drawable j;
    public DialogInterface$OnClickListener k;
    public CharSequence l;
    public Drawable m;
    public DialogInterface$OnClickListener n;
    public CharSequence o;
    public Drawable p;
    public DialogInterface$OnClickListener q;
    public boolean r;
    public DialogInterface$OnCancelListener s;
    public DialogInterface$OnDismissListener t;
    public DialogInterface$OnKeyListener u;
    public CharSequence[] v;
    public ListAdapter w;
    public DialogInterface$OnClickListener x;
    public int y;
    public View z;

    public void AlertController$f(Context p0){
       super();
       this.c = 0;
       this.e = 0;
       this.E = false;
       this.I = -1;
       this.Q = true;
       this.a = p0;
       this.r = true;
       this.b = p0.getSystemService("layout_inflater");
    }
    public void a(AlertController p0){
       AlertController$f tg = this.g;
       if (tg != null) {
          p0.l(tg);
       }else {
          tg = this.f;
          if (tg != null) {
             p0.q(tg);
          }
          tg = this.d;
          if (tg != null) {
             p0.n(tg);
          }
          tg = this.c;
          if (tg != null) {
             p0.m(tg);
          }
          tg = this.e;
          if (tg != null) {
             p0.m(p0.c(tg));
          }
       }
       tg = this.h;
       if (tg != null) {
          p0.o(tg);
       }
       AlertController$f ti = this.i;
       if (ti != null || this.j != null) {
          p0.k(-1, ti, this.k, null, this.j);
       }
       AlertController$f tl = this.l;
       if (tl != null || this.m != null) {
          p0.k(-2, tl, this.n, null, this.m);
       }
       AlertController$f to = this.o;
       if (to != null || this.p != null) {
          p0.k(-3, to, this.q, null, this.p);
       }
       if (this.v == null && (this.K != null || this.w != null)) {
          this.b(p0);
       }
       to = this.z;
       if (to != null) {
          if (this.E != null) {
             p0.t(to, this.A, this.B, this.C, this.D);
          }else {
             p0.s(to);
          }
       }else {
          tg = this.y;
          if (tg != null) {
             p0.r(tg);
          }
       }
       return;
    }
    public final void b(AlertController p0){
       AlertController n;
       AlertController$RecycleListView recycleListV = this.b.inflate(p0.L, null);
       if (this.G != null) {
          if (this.K == null) {
             AlertController$f$a uof$a = new AlertController$f$a(this, this.a, p0.M, 0x1020014, this.v, recycleListV);
          }else {
             AlertController$f$b uof$b = new AlertController$f$b(this, this.a, this.K, false, recycleListV, p0);
          }
       }else if(this.H != null){
          n = p0.N;
       }else {
          n = p0.O;
       }
       AlertController uAlertContro = n;
       int i = 0x1020014;
       if (this.K != null) {
          String[] stringArray = new String[]{this.L};
          int[] ointArray = new int[]{i};
          SimpleCursorAdapter simpleCursor = new SimpleCursorAdapter(this.a, uAlertContro, this.K, stringArray, ointArray);
       }else {
          AlertController$f tw = this.w;
          if (tw == null) {
             tw = new AlertController$h(this.a, uAlertContro, i, this.v);
          }
       }
       AlertController$f tP = this.P;
       if (tP != null) {
          tP.a(recycleListV);
       }
       p0.H = v9;
       p0.I = this.I;
       if (this.x != null) {
          recycleListV.setOnItemClickListener(new AlertController$f$c(this, p0));
       }else if(this.J != null){
          recycleListV.setOnItemClickListener(new AlertController$f$d(this, recycleListV, p0));
       }
       tP = this.O;
       if (tP != null) {
          recycleListV.setOnItemSelectedListener(tP);
       }
       if (this.H != null) {
          recycleListV.setChoiceMode(1);
       }else if(this.G != null){
          recycleListV.setChoiceMode(2);
       }
       p0.g = recycleListV;
       return;
    }
}
