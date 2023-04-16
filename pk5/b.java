package pk5.b;
import android.text.TextWatcher;
import java.lang.Object;
import android.text.Editable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import ekd.k1;
import android.widget.EditText;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import pk5.a;

public abstract class b implements TextWatcher	// class@00361d
{
    public long b;
    public int c;
    public boolean d;
    public EditText e;
    public Editable f;
    public Runnable g;

    public void b(long p0){
       super(p0, Integer.MAX_VALUE);
    }
    public void b(long p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void b(long p0,int p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public abstract void a(Editable p0);
    public void afterTextChanged(Editable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       b tg = this.g;
       if (tg != null) {
          k1.m(tg);
       }
       tg = this.e;
       if (tg != null && (this.d != null || tg.isFocused())) {
          if (TextUtils.x(p0)) {
             this.b();
             return;
          }else if(p0.length() > this.c){
             this.c(p0);
             return;
          }else {
             this.f = p0;
             if (this.g == null) {
                this.g = new a(this);
             }
             k1.r(this.g, this.b);
          }
       }
       return;
    }
    public abstract void b();
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public abstract void c(Editable p0);
    public void d(EditText p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.e = p0;
       p0.addTextChangedListener(this);
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       b te = this.e;
       if (te != null) {
          te.removeTextChangedListener(this);
       }
       te = this.g;
       if (te != null) {
          k1.m(te);
       }
       return;
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
}
