package h3.a;
import java.lang.Object;
import android.database.DataSetObservable;
import android.view.View;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import android.view.ViewGroup;
import java.lang.CharSequence;
import android.database.DataSetObserver;
import android.os.Parcelable;
import java.lang.ClassLoader;

public abstract class a	// class@0020ea
{
    public final DataSetObservable b;
    public DataSetObserver c;

    public void a(){
       super();
       this.b = new DataSetObservable();
    }
    public void g(View p0,int p1,Object p2){
       throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }
    public void h(ViewGroup p0,int p1,Object p2){
       this.g(p0, p1, p2);
       throw null;
    }
    public void i(ViewGroup p0){
    }
    public abstract int j();
    public int k(Object p0){
       return -1;
    }
    public CharSequence l(int p0){
       return null;
    }
    public float m(int p0){
       return 0x3f800000;
    }
    public Object n(View p0,int p1){
       throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }
    public Object o(ViewGroup p0,int p1){
       this.n(p0, p1);
       throw null;
    }
    public abstract boolean p(View p0,Object p1);
    public void q(){
       _monitor_enter(this);
       a tc = this.c;
       if (tc != null) {
          tc.onChanged();
       }
       _monitor_exit(this);
       this.b.notifyChanged();
       return;
    }
    public void r(DataSetObserver p0){
       this.b.registerObserver(p0);
    }
    public void s(Parcelable p0,ClassLoader p1){
    }
    public Parcelable u(){
       return null;
    }
    public void v(ViewGroup p0,int p1,Object p2){
    }
    public void w(DataSetObserver p0){
       _monitor_enter(this);
       this.c = p0;
       _monitor_exit(this);
    }
    public void x(ViewGroup p0){
    }
    public void y(DataSetObserver p0){
       this.b.unregisterObserver(p0);
    }
}
