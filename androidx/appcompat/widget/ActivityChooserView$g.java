package androidx.appcompat.widget.ActivityChooserView$g;
import android.widget.AdapterView$OnItemClickListener;
import android.view.View$OnClickListener;
import android.view.View$OnLongClickListener;
import android.widget.PopupWindow$OnDismissListener;
import androidx.appcompat.widget.ActivityChooserView;
import java.lang.Object;
import android.view.View;
import android.content.pm.ResolveInfo;
import androidx.appcompat.widget.ActivityChooserView$f;
import androidx.appcompat.widget.a;
import android.content.Intent;
import android.content.Context;
import android.view.ViewGroup;
import java.lang.IllegalArgumentException;
import a2.b;
import android.widget.AdapterView;
import android.widget.Adapter;

public class ActivityChooserView$g implements AdapterView$OnItemClickListener, View$OnClickListener, View$OnLongClickListener, PopupWindow$OnDismissListener	// class@0005dd
{
    public final ActivityChooserView b;

    public void ActivityChooserView$g(ActivityChooserView p0){
       this.b = p0;
       super();
    }
    public final void a(){
       ActivityChooserView o = this.b.o;
       if (o != null) {
          o.onDismiss();
       }
       return;
    }
    public void onClick(View p0){
       ActivityChooserView$g tb = this.b;
       if (p0 == tb.h) {
          tb.a();
          Intent intent = this.b.b.b().b(this.b.b.b().g(this.b.b.c()));
          if (intent != null) {
             intent.addFlags(0x80000);
             this.b.getContext().startActivity(intent);
          }
       }else if(p0 == tb.f){
          tb.p = false;
          tb.d(tb.q);
       }else {
          throw new IllegalArgumentException();
       }
       return;
    }
    public void onDismiss(){
       this.a();
       ActivityChooserView k = this.b.k;
       if (k != null) {
          k.k(false);
       }
       return;
    }
    public void onItemClick(AdapterView p0,View p1,int p2,long p3){
       int itemViewType = p0.getAdapter().getItemViewType(p2);
       if (itemViewType) {
          if (itemViewType == 1) {
             this.b.d(Integer.MAX_VALUE);
          }else {
             throw new IllegalArgumentException();
          }
       }else {
          this.b.a();
          ActivityChooserView$g tb = this.b;
          if (tb.p != null) {
             if (p2 > 0) {
                tb.b.b().o(p2);
             }
          }else if(tb.b.e()){
             p2++;
          }
          Intent intent = this.b.b.b().b(p2);
          if (intent != null) {
             intent.addFlags(0x80000);
             this.b.getContext().startActivity(intent);
          }
       }
       return;
    }
    public boolean onLongClick(View p0){
       ActivityChooserView$g tb = this.b;
       if (p0 != tb.h) {
          throw new IllegalArgumentException();
       }
       if (tb.b.getCount() > 0) {
          ActivityChooserView$g tb1 = this.b;
          tb1.p = true;
          tb1.d(tb1.q);
       }
       return true;
    }
}
