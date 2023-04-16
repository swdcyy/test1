package med.a;
import ufd.l;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.widget.TextView;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Integer;
import android.widget.ImageView;
import java.lang.Boolean;
import android.graphics.Typeface;
import com.yxcorp.gifshow.widget.m;
import android.view.View$OnClickListener;

public class a implements l	// class@001d0e
{
    public View a;
    public KwaiImageView b;
    public TextView c;

    public void a(){
       super();
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       this.c.setText(p0);
       return;
    }
    public void b(int p0){
    }
    public void c(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.a = p0.findViewById(0x7f0a05a4);
       this.b = p0.findViewById(0x7f0a05bc);
       this.c = p0.findViewById(0x7f0a05e1);
       return;
    }
    public void d(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       this.b.setVisibility(8);
       return;
    }
    public void e(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "11")) {
          return;
       }
       if (p0) {
          this.c.setTypeface(Typeface.defaultFromStyle(1));
       }else {
          this.c.setTypeface(Typeface.defaultFromStyle(0));
       }
       return;
    }
    public void f(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "3")) {
          return;
       }
       this.c.setEnabled(p0);
       return;
    }
    public void g(m p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "10")) {
          return;
       }
       this.a.setOnClickListener(p0);
       return;
    }
    public void h(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "8")) {
          return;
       }
       this.a.setBackgroundResource(p0);
       return;
    }
    public void i(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "7")) {
          return;
       }
       this.a.setSelected(p0);
       return;
    }
    public void j(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "6")) {
          return;
       }
       this.a.setEnabled(p0);
       return;
    }
    public void k(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "5")) {
          return;
       }
       this.a.setVisibility(p0);
       return;
    }
    public void setTextColor(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "9")) {
          return;
       }
       this.c.setTextColor(p0);
       return;
    }
}
