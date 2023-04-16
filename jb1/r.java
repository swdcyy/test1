package jb1.r;
import java.util.Comparator;
import java.lang.Object;
import db1.c;
import jb1.s;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.UserExtraInfo;

public final class r implements Comparator	// class@002b1b
{
    public static final r b;

    static {
       r.b = new r();
    }
    public void r(){
       super();
    }
    public final int compare(Object p0,Object p1){
       p0 = p0.a.mExtraInfo.mAssistantType;
       int i = 1;
       if (p0 == p1.a.mExtraInfo.mAssistantType) {
          i = 0;
       }else if(p0 == i){
          i = -1;
       }
       return i;
    }
}
