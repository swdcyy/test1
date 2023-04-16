package m8c.e;
import brd.t;
import java.io.File;
import java.lang.String;
import com.kuaishou.edit.draft.Workspace$Source;
import com.kuaishou.edit.draft.Workspace$Type;

public interface abstract e	// class@00350d
{

    t a();
    boolean b();
    File c();
    long d();
    long e();
    boolean f();
    void g(double p0);
    File getCoverFile();
    File getDirectory();
    String getIdentifier();
    Workspace$Source getSource();
    Workspace$Type getType();
    double getVideoDuration();
    boolean h();
    long i();
    File j();
}
