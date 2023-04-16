package butterknife.internal.ImmutableList;
import java.util.RandomAccess;
import java.util.AbstractList;
import java.lang.Object;

public final class ImmutableList extends AbstractList implements RandomAccess	// class@000ba4
{
    public final Object[] views;

    public void ImmutableList(Object[] p0){
       super();
       this.views = p0;
    }
    public boolean contains(Object p0){
       ImmutableList tviews = this.views;
       int len = tviews.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return false;
          }
          if (tviews[i] == p0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public Object get(int p0){
       return this.views[p0];
    }
    public int size(){
       return this.views.length;
    }
}
