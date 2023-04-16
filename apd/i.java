package apd.i;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import apd.e;
import apd.a;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.yxcorp.plugin.kwaitoken.model.BaseDialogInfo;
import bpd.y;
import bpd.q;
import bpd.l;
import bpd.e;
import bpd.b0;
import so7.d;
import bpd.u;
import ag6.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.String;
import m4d.d;

public class i implements PopupInterface$f, e, a	// class@000218
{
    public c b;
    public BaseDialogInfo c;
    public PresenterV2 d;
    public a e;
    public e f;
    public d g;
    public Activity h;
    public c i;
    public b j;
    public d k;
    public a l;

    public void i(){
       super();
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       int i;
       this.b = p0;
       BaseDialogInfo mShowType = this.c.mShowType;
       if (mShowType != 106) {
          if (mShowType != 109) {
             switch (mShowType){
                 case 'd':
                   i = 0x7f0d0727;
                   this.d = new e();
                   break;
                 case 'e':
                   i = 0x7f0d0728;
                   this.d = new l();
                   break;
                 case 'f':
                   i = 0x7f0d073a;
                   this.d = new q();
                   break;
                 default:
                   i = 0x7f0d0744;
                   this.d = new y();
             }
          }else {
             i = 0x7f0d0746;
             b0 uob0 = new b0(this.k);
             this.l = uob0.t;
             this.d = uob0;
          }
       }else {
          i = 0x7f0d0741;
          this.d = new u();
       }
       View view = a.c(p1, i, p2, false);
       this.d.f(view);
       Object[] objArray = new Object[]{this.c,this};
       this.d.i(objArray);
       p0.V(1);
       p0.X(false);
       return view;
    }
    public void b(c p0){
       i td = this.d;
       if (td != null) {
          td.destroy();
          this.h = null;
       }
       return;
    }
    public void c(String p0){
       this.j();
       i tf = this.f;
       if (tf != null) {
          tf.e();
       }
       return;
    }
    public void d(String p0,String p1){
       this.k(p1);
       i te = this.e;
       if (te != null) {
          te.d(p0, p1);
       }
       return;
    }
    public void e(){
       this.j();
       i tf = this.f;
       if (tf != null) {
          tf.e();
       }
       return;
    }
    public void f(String p0){
       this.k(p0);
       i tf = this.f;
       if (tf != null) {
          tf.f(p0);
       }
       return;
    }
    public void g(String p0){
       this.k(p0);
       i tf = this.f;
       if (tf != null) {
          tf.g(p0);
       }
       return;
    }
    public void h(String p0){
       this.k(p0);
       i tf = this.f;
       if (tf != null) {
          tf.h(p0);
       }
       return;
    }
    public void i(String p0){
       this.k(p0);
       i tf = this.f;
       if (tf != null) {
          tf.i(p0);
       }
       return;
    }
    public void j(){
       this.b.q(3);
    }
    public final void k(String p0){
       i tg = this.g;
       if (tg != null) {
          tg.f(p0);
       }
       this.j();
       return;
    }
}
