package isd.l;
import kotlin.io.FilesKt__FileReadWriteKt;
import java.io.File;
import kotlin.io.FileWalkDirection;
import isd.h;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public class l extends FilesKt__FileReadWriteKt	// class@001986
{

    public void l(){
       super();
    }
    public static final h J(File p0,FileWalkDirection p1){
       a.p(p0, "$this$walk");
       a.p(p1, "direction");
       return new h(p0, p1);
    }
    public static h K(File p0,FileWalkDirection p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = FileWalkDirection.TOP_DOWN;
       }
       return l.J(p0, p1);
    }
    public static final h L(File p0){
       a.p(p0, "$this$walkBottomUp");
       return l.J(p0, FileWalkDirection.BOTTOM_UP);
    }
    public static final h M(File p0){
       a.p(p0, "$this$walkTopDown");
       return l.J(p0, FileWalkDirection.TOP_DOWN);
    }
}
