package androidx.appcompat.widget.ActivityChooserView$f;
import android.widget.BaseAdapter;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.appcompat.widget.a;
import android.content.pm.ResolveInfo;
import android.view.View$MeasureSpec;
import android.view.View;
import android.view.ViewGroup;
import java.lang.Math;
import java.lang.Object;
import android.database.DataSetObservable;
import java.lang.IllegalArgumentException;
import android.content.Context;
import android.view.LayoutInflater;
import ag6.a;
import android.widget.TextView;
import java.lang.String;
import java.lang.CharSequence;
import android.content.pm.PackageManager;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;

public class ActivityChooserView$f extends BaseAdapter	// class@0005dc
{
    public a b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final ActivityChooserView g;

    public void ActivityChooserView$f(ActivityChooserView p0){
       this.g = p0;
       super();
       this.c = 4;
    }
    public int a(){
       return this.b.f();
    }
    public a b(){
       return this.b;
    }
    public ResolveInfo c(){
       return this.b.h();
    }
    public int d(){
       return this.b.i();
    }
    public boolean e(){
       return this.d;
    }
    public int f(){
       ActivityChooserView$f tc = this.c;
       this.c = Integer.MAX_VALUE;
       int i = 0;
       int i1 = View$MeasureSpec.makeMeasureSpec(i, i);
       int i2 = View$MeasureSpec.makeMeasureSpec(i, i);
       int count = this.getCount();
       View view = null;
       int i3 = 0;
       for (; i < count; i = i + 1) {
          view = this.getView(i, view, null);
          view.measure(i1, i2);
          i3 = Math.max(i3, view.getMeasuredWidth());
       }
       this.c = tc;
       return i3;
    }
    public void g(a p0){
       a uoa = this.g.b.b();
       if (uoa != null && this.g.isShown()) {
          uoa.unregisterObserver(this.g.l);
       }
       this.b = p0;
       if (p0 != null && this.g.isShown()) {
          p0.registerObserver(this.g.l);
       }
       this.notifyDataSetChanged();
       return;
    }
    public int getCount(){
       int i = this.b.f();
       if (this.d == null && this.b.h() != null) {
          i = i - 1;
       }
       i = Math.min(i, this.c);
       if (this.f != null) {
          i = i + 1;
       }
       return i;
    }
    public Object getItem(int p0){
       int itemViewType = this.getItemViewType(p0);
       if (itemViewType) {
          if (itemViewType == 1) {
             return null;
          }else {
             throw new IllegalArgumentException();
          }
       }else if(this.d == null && this.b.h() != null){
          p0++;
       }
       return this.b.e(p0);
    }
    public long getItemId(int p0){
       return (long)p0;
    }
    public int getItemViewType(int p0){
       if (this.f != null && p0 == (this.getCount() - 1)) {
          return 1;
       }
       return 0;
    }
    public View getView(int p0,View p1,ViewGroup p2){
       int itemViewType = this.getItemViewType(p0);
       int i = 0x7f0d0007;
       if (itemViewType) {
          if (itemViewType == 1) {
             if (p1 == null || p1.getId() != 1) {
                p1 = a.c(LayoutInflater.from(this.g.getContext()), i, p2, false);
                p1.setId(1);
                p1.findViewById(R.id.title).setText(this.g.getContext().getString(R.string.arg_RES_7f100012));
             }
             return p1;
          }else {
             throw new IllegalArgumentException();
          }
       }else if(p1 == null || p1.getId() != 0x7f0a17b0){
          p1 = a.c(LayoutInflater.from(this.g.getContext()), i, p2, false);
       }
       PackageManager packageManag = this.g.getContext().getPackageManager();
       ResolveInfo item = this.getItem(p0);
       p1.findViewById(R.id.icon).setImageDrawable(item.loadIcon(packageManag));
       p1.findViewById(R.id.title).setText(item.loadLabel(packageManag));
       if (this.d != null && (!p0 && this.e != null)) {
          p1.setActivated(1);
       }else {
          p1.setActivated(false);
       }
       return p1;
    }
    public int getViewTypeCount(){
       return 3;
    }
    public void h(int p0){
       if (this.c != p0) {
          this.c = p0;
          this.notifyDataSetChanged();
       }
       return;
    }
    public void i(boolean p0,boolean p1){
       if (this.d != p0 || this.e != p1) {
          this.d = p0;
          this.e = p1;
          this.notifyDataSetChanged();
       }
       return;
    }
    public void j(boolean p0){
       if (this.f != p0) {
          this.f = p0;
          this.notifyDataSetChanged();
       }
       return;
    }
}
