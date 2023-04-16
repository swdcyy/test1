package old.soloader.SoLoader$WrongAbiError;
import java.lang.UnsatisfiedLinkError;
import java.lang.Throwable;
import java.lang.String;

public final class SoLoader$WrongAbiError extends UnsatisfiedLinkError	// class@002004
{

    public void SoLoader$WrongAbiError(Throwable p0){
       super("APK was built for a different platform");
       this.initCause(p0);
    }
}
