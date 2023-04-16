package androidx.appcompat.widget.AppCompatSpinner$c;
import androidx.appcompat.widget.AppCompatSpinner$f;
import android.content.DialogInterface$OnClickListener;
import androidx.appcompat.widget.AppCompatSpinner;
import java.lang.Object;
import android.app.Dialog;
import q0.e;
import android.graphics.drawable.Drawable;
import java.lang.CharSequence;
import androidx.appcompat.app.a$a;
import android.content.Context;
import android.widget.Spinner;
import android.widget.ListAdapter;
import androidx.appcompat.app.a;
import android.widget.ListView;
import android.content.DialogInterface;
import android.widget.AdapterView$OnItemClickListener;
import android.view.View;

public class AppCompatSpinner$c implements AppCompatSpinner$f, DialogInterface$OnClickListener	// class@0005f0
{
    public a b;
    public ListAdapter c;
    public CharSequence d;
    public final AppCompatSpinner e;

    public void AppCompatSpinner$c(AppCompatSpinner p0){
       this.e = p0;
       super();
    }
    public boolean d(){
       AppCompatSpinner$c tb = this.b;
       boolean b = (tb != null)? tb.isShowing(): false;
       return b;
    }
    public void dismiss(){
       AppCompatSpinner$c tb = this.b;
       if (tb != null) {
          tb.dismiss();
          this.b = null;
       }
       return;
    }
    public void e(Drawable p0){
    }
    public Drawable f(){
       return null;
    }
    public CharSequence g(){
       return this.d;
    }
    public void h(int p0,int p1){
       if (this.c == null) {
          return;
       }
       a$a uoa = new a$a(this.e.getPopupContext());
       AppCompatSpinner$c td = this.d;
       if (td != null) {
          uoa.n(td);
       }
       uoa.l(this.c, this.e.getSelectedItemPosition(), this);
       a uoa1 = uoa.a();
       this.b = uoa1;
       ListView listView = uoa1.e();
       listView.setTextDirection(p0);
       listView.setTextAlignment(p1);
       this.b.show();
       return;
    }
    public void j(int p0){
    }
    public void k(int p0){
    }
    public int l(){
       return 0;
    }
    public int m(){
       return 0;
    }
    public void n(int p0){
    }
    public void o(CharSequence p0){
       this.d = p0;
    }
    public void onClick(DialogInterface p0,int p1){
       this.e.setSelection(p1);
       if (this.e.getOnItemClickListener() != null) {
          this.e.performItemClick(null, p1, this.c.getItemId(p1));
       }
       this.dismiss();
       return;
    }
    public int p(){
       return 0;
    }
    public void q(ListAdapter p0){
       this.c = p0;
    }
}
