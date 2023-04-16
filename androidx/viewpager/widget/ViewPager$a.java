package androidx.viewpager.widget.ViewPager$a;
import java.util.Comparator;
import java.lang.Object;
import androidx.viewpager.widget.ViewPager$f;

public final class ViewPager$a implements Comparator	// class@000a11
{

    public void ViewPager$a(){
       super();
    }
    public int a(ViewPager$f p0,ViewPager$f p1){
       return (p0.b - p1.b);
    }
    public int compare(Object p0,Object p1){
       return this.a(p0, p1);
    }
}
