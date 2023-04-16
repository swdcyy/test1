package fe.a;
import java.lang.annotation.Annotation;
import java.lang.String;

public interface abstract a implements Annotation	// class@001fed
{

    boolean canOverrideExistingModule();
    boolean hasConstants();
    boolean isCxxModule();
    String name();
    boolean needsEagerInit();
}
