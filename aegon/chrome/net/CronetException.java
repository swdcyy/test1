package aegon.chrome.net.CronetException;
import java.io.IOException;
import java.lang.String;
import java.lang.Throwable;

public abstract class CronetException extends IOException	// class@00018a
{

    public void CronetException(String p0,Throwable p1){
       super(p0, p1);
    }
}
