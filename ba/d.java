package ba.d;
import android.view.View$OnClickListener;
import ba.a;
import android.content.Context;
import ea.e;
import ba.c;
import ea.a;
import android.content.res.Resources;
import cw9.c;
import ga.o;
import ga.l$f;
import ga.l;
import android.view.View;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;

public class d extends a implements View$OnClickListener	// class@000b08
{
    public l$f d;
    public boolean e;
    public boolean f;
    public View g;
    public String h;
    public String i;
    public String j;
    public a k;

    public void d(Context p0,e p1){
       super(p0, p1);
       this.e = true;
       if (this.b != null && this.c != null) {
          this.h(R.layout.arg_RES_7f0d0251, new c(this));
          this.g(c.b(this.c.getResources(), R.dimen.arg_RES_7f07110d));
       }
       return;
    }
    public o a(){
       o oo = super.a();
       this.t(oo.d());
       return oo;
    }
    public void onClick(View p0){
       if (this.d == null) {
          return;
       }
       int id = p0.getId();
       if (id == 0x7f0a0523) {
          this.d.a();
       }else if(id == 0x7f0a0528){
          this.d.b();
       }
       return;
    }
    public a r(String p0){
       if (!TextUtils.isEmpty(p0)) {
          this.h = p0;
       }
       super.r(p0);
       return this;
    }
    public void t(l$f p0){
       this.d = p0;
    }
}
