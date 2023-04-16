package androidx.appcompat.widget.AppCompatSpinner$d;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import android.content.res.Resources$Theme;
import java.lang.Object;
import android.os.Build$VERSION;
import android.widget.ThemedSpinnerAdapter;
import w0.t;
import android.view.View;
import android.view.ViewGroup;
import android.database.DataSetObserver;

public class AppCompatSpinner$d implements ListAdapter, SpinnerAdapter	// class@0005f1
{
    public SpinnerAdapter b;
    public ListAdapter c;

    public void AppCompatSpinner$d(SpinnerAdapter p0,Resources$Theme p1){
       super();
       this.b = p0;
       if (p0 instanceof ListAdapter) {
          this.c = p0;
       }
       if (p1 != null) {
          if (Build$VERSION.SDK_INT >= 23 && p0 instanceof ThemedSpinnerAdapter) {
             if (p0.getDropDownViewTheme() != p1) {
                p0.setDropDownViewTheme(p1);
             }
          }else if(p0 instanceof t && p0.getDropDownViewTheme() == null){
             p0.setDropDownViewTheme(p1);
          }
       }
       return;
    }
    public boolean areAllItemsEnabled(){
       AppCompatSpinner$d tc = this.c;
       if (tc != null) {
          return tc.areAllItemsEnabled();
       }
       return true;
    }
    public int getCount(){
       AppCompatSpinner$d tb = this.b;
       int i = (tb == null)? 0: tb.getCount();
       return i;
    }
    public View getDropDownView(int p0,View p1,ViewGroup p2){
       AppCompatSpinner$d tb = this.b;
       View view = (tb == null)? null: tb.getDropDownView(p0, p1, p2);
       return view;
    }
    public Object getItem(int p0){
       AppCompatSpinner$d tb = this.b;
       Object obj = (tb == null)? null: tb.getItem(p0);
       return obj;
    }
    public long getItemId(int p0){
       AppCompatSpinner$d tb = this.b;
       long l = (tb == null)? -1: tb.getItemId(p0);
       return l;
    }
    public int getItemViewType(int p0){
       return 0;
    }
    public View getView(int p0,View p1,ViewGroup p2){
       return this.getDropDownView(p0, p1, p2);
    }
    public int getViewTypeCount(){
       return 1;
    }
    public boolean hasStableIds(){
       AppCompatSpinner$d tb = this.b;
       boolean b = (tb != null && tb.hasStableIds())? true: false;
       return b;
    }
    public boolean isEmpty(){
       boolean b = (!this.getCount())? true: false;
       return b;
    }
    public boolean isEnabled(int p0){
       AppCompatSpinner$d tc = this.c;
       if (tc != null) {
          return tc.isEnabled(p0);
       }
       return true;
    }
    public void registerDataSetObserver(DataSetObserver p0){
       AppCompatSpinner$d tb = this.b;
       if (tb != null) {
          tb.registerDataSetObserver(p0);
       }
       return;
    }
    public void unregisterDataSetObserver(DataSetObserver p0){
       AppCompatSpinner$d tb = this.b;
       if (tb != null) {
          tb.unregisterDataSetObserver(p0);
       }
       return;
    }
}
