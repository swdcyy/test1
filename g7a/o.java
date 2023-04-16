package g7a.o;
import com.kwai.component.tabs.panel.h$c;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import hx9.e;
import java.lang.String;

public final class o implements h$c	// class@0023f0
{
    public final QPhoto a;

    public void o(QPhoto p0){
       this.a = p0;
    }
    public final boolean a(boolean p0){
       o ta = this.a;
       if (!p0) {
          e.a.a("COMMENT_AREA", ta.numberOfComments(), ta);
       }
       return false;
    }
}
