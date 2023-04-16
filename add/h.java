package add.h;
import java.lang.Object;
import com.yxcorp.plugin.search.result.LayoutStyle;
import com.yxcorp.plugin.search.response.Layout;

public class h	// class@0000e8
{
    public Layout a;

    public void h(){
       super();
    }
    public LayoutStyle a(){
       h ta = this.a;
       if (ta != null) {
          Layout mLayoutStyle = ta.mLayoutStyle;
          if (mLayoutStyle != null) {
             return mLayoutStyle;
          }
       }
       return LayoutStyle.DOUBLE;
    }
}
