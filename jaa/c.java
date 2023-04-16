package jaa.c;
import com.kuaishou.edit.draft.Workspace;
import java.io.File;
import java.lang.Object;
import java.util.ArrayList;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Workspace$b;

public class c	// class@00299f
{
    public Workspace$b a;
    public final List b;
    public File c;

    public void c(Workspace p0,File p1){
       super();
       this.b = new ArrayList();
       this.a = p0.toBuilder();
       this.c = p1;
    }
}
